package com.tuxdev.booksaac.ui.books

import android.annotation.SuppressLint
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.SearchView
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.tuxdev.booksaac.R
import com.tuxdev.booksaac.base.BaseActivity
import com.tuxdev.booksaac.databinding.ActivityBooksBinding
import com.tuxdev.booksaac.di.component.AppComponent
import com.tuxdev.booksaac.utils.RxSearchView
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class BooksActivity : BaseActivity<ActivityBooksBinding, BooksViewModel>() {

    private val compositeDisposable = CompositeDisposable()
    private val rxSearchView = RxSearchView()
    private var query: String = "android"

    override fun injectModule(appComponent: AppComponent) =
            appComponent.inject(this)

    override fun getLayoutResource(): Int = R.layout.activity_books
    override fun getToolbarResource(): Int = R.id.toolbar

    @SuppressLint("RestrictedApi")
    override fun myCodeHere() {

        dataBinding.setLifecycleOwner(this)

        dataBinding.toolbar.title = getString(R.string.app_name)
        supportActionBar?.setDisplayHomeAsUpEnabled(false) //set false to show search on toolbar

        //set view model
        viewModel = ViewModelProviders.of(this).get(BooksViewModel::class.java)

        //set value viewModelBooks
        dataBinding.viewModelBooks = viewModel

        //set layout manager RecyclerView
        dataBinding.rvBooks.layoutManager = LinearLayoutManager(this)

        //penarikan data awal
        viewModel.getBooks(query)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.book_list_menu, menu)
        val menuItem = menu?.findItem(R.id.action_search)
        val searchView = menuItem?.actionView as SearchView
        rxSearchView.getSearchView(searchView)

        compositeDisposable.add(rxSearchView.getTextWatcherObservable()
                .debounce(500, java.util.concurrent.TimeUnit.MILLISECONDS) //delay input 500MS
                .subscribeOn(Schedulers.single())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe { searchText ->
                    if (searchText.isEmpty()) {
                        query = "android"
                        viewModel.getBooks(query)
                    } else if (!searchText.isEmpty()) {
                        query = searchText
                        viewModel.getBooks(query)
                    }
                })
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            R.id.action_bookmarked_search -> Toast.makeText(this, "Cooming Soon", Toast.LENGTH_SHORT).show()

        }
        return super.onOptionsItemSelected(item)
    }

    override fun onDestroy() {
        super.onDestroy()
        compositeDisposable.dispose()
    }
}
