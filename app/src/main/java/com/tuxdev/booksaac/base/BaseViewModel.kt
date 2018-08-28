package com.tuxdev.booksaac.base

import android.arch.lifecycle.ViewModel
import com.tuxdev.booksaac.di.component.AppComponent
import com.tuxdev.booksaac.utils.BaseApp
import io.reactivex.disposables.CompositeDisposable

/**
 **********************************************
 * Created by ukie on 8/7/18 with ♥
 * (>’_’)> email : ukie.tux@gmail.com
 * github : https://www.github.com/tuxkids <(’_’<)
 **********************************************
 * © 2018 | All Right Reserved
 */

abstract class BaseViewModel : ViewModel() {
    var composite: CompositeDisposable

    private val viewModelInject =
            BaseApp.appComponent

    init {
        inject(viewModelInject)
        composite = CompositeDisposable()
    }

    protected abstract fun inject(appComponent: AppComponent)

    fun detachView() {
        composite.dispose()
    }
}