package com.tuxdev.booksaac.ui.books

import android.arch.lifecycle.MutableLiveData
import com.tuxdev.booksaac.base.BaseViewModel
import com.tuxdev.booksaac.di.component.AppComponent
import com.tuxdev.booksaac.network.BookServices
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

/**
 **********************************************
 * Created by ukie on 8/21/18 with ♥
 * (>’_’)> email : ukie.tux@gmail.com
 * github : https://www.github.com/tuxkids <(’_’<)
 **********************************************
 * © 2018 | All Right Reserved
 */
class BooksViewModel : BaseViewModel() {

    @Inject
    lateinit var bookServices: BookServices

    val booksAdapter: BooksAdapter = BooksAdapter()
    val loadingVisibility: MutableLiveData<Boolean> = MutableLiveData()
    val noDataVisibility: MutableLiveData<Boolean> = MutableLiveData()
    val rvVisibility: MutableLiveData<Boolean> = MutableLiveData()
    val noDataMessage: MutableLiveData<String> = MutableLiveData()

    override fun inject(appComponent: AppComponent) {
        appComponent.inject(this)
    }

    fun getBooks(query: String) {
        composite.add(bookServices.getBooks(query)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .doOnSubscribe {
                    loadingVisibility.value = true
                    noDataVisibility.value = false
                }
                .doOnComplete { loadingVisibility.value = false }
                .subscribe {
                    if (it.code() == 200) {
                        noDataVisibility.value = it.body()?.totalItems == 0
                        noDataMessage.value = "$query tidak ditemukan"
                        if (it.body()?.items?.size ?: 0 > 0) {
                            rvVisibility.value = true
                            booksAdapter.updateListBooks(it.body()?.items
                                    ?: throw NullPointerException())
                        } else
                            rvVisibility.value = false

                    }
                })
    }


}