package com.tuxdev.booksaac.base

import android.R
import android.annotation.SuppressLint
import android.content.pm.ActivityInfo
import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.MenuItem
import com.tuxdev.booksaac.di.component.AppComponent
import com.tuxdev.booksaac.utils.BaseApp


/**
 *----------------------------------------------
 * Created by ukieTux on 2/23/17 with ♥ .
 * @email  : ukie.tux@gmail.com
 * @github : https://www.github.com/tuxkids
 * ----------------------------------------------
 *          © 2017 | All Rights Reserved
 */
abstract class BaseActivity<B : ViewDataBinding, V : BaseViewModel> : AppCompatActivity() {
    protected lateinit var toolbar: Toolbar

    protected lateinit var dataBinding: B
    protected lateinit var viewModel: V

    @SuppressLint("RestrictedApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT

        //Injection Dagger 2
        val activityComponent = BaseApp
                .appComponent
        injectModule(activityComponent)

        //define data binding
        dataBinding = DataBindingUtil.setContentView(this, getLayoutResource())

        toolbar = findViewById(getToolbarResource())
        //setup toolbar
        if (toolbar != null) {
            setSupportActionBar(toolbar)
            supportActionBar?.setDefaultDisplayHomeAsUpEnabled(true)
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
        }

        myCodeHere()
    }

    protected abstract fun injectModule(appComponent: AppComponent)
    protected abstract fun getToolbarResource(): Int
    protected abstract fun getLayoutResource(): Int
    protected abstract fun myCodeHere()

    override fun onDestroy() {
        super.onDestroy()
        if (::viewModel.isInitialized)
            viewModel.detachView()
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            R.id.home -> this.finish()
        }
        return super.onOptionsItemSelected(item)
    }
}

