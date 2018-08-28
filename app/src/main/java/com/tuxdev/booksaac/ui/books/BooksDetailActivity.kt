package com.tuxdev.booksaac.ui.books

import android.view.MenuItem
import com.tuxdev.booksaac.R
import com.tuxdev.booksaac.base.BaseActivity
import com.tuxdev.booksaac.base.BaseViewModel
import com.tuxdev.booksaac.databinding.ActivityBooksDetailsBinding
import com.tuxdev.booksaac.di.component.AppComponent

class BooksDetailActivity : BaseActivity<ActivityBooksDetailsBinding, BaseViewModel>() {
    override fun injectModule(appComponent: AppComponent) {
    }

    override fun getToolbarResource(): Int = R.id.toolbar

    override fun getLayoutResource(): Int = R.layout.activity_books_details

    override fun myCodeHere() {
        supportActionBar?.title = getString(R.string.detail_book)
        dataBinding.book = intent.extras.getParcelable("items")
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if (item?.itemId == android.R.id.home) {
            supportFinishAfterTransition()
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onDestroy() {
        super.onDestroy()
        supportStartPostponedEnterTransition()
    }
}
