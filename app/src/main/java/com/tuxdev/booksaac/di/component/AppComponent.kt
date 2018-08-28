package com.tuxdev.booksaac.di.component

import com.tuxdev.booksaac.di.module.AppModule
import com.tuxdev.booksaac.ui.books.BooksActivity
import com.tuxdev.booksaac.ui.books.BooksViewModel
import dagger.Component
import com.tuxdev.booksaac.di.module.NetworkModule
import javax.inject.Singleton

/**
 **********************************************
 * Created by ukie on 8/6/18 with ♥
 * (>’_’)> email : ukie.tux@gmail.com
 * github : https://www.github.com/tuxkids <(’_’<)
 **********************************************
 * © 2018 | All Right Reserved
 */

@Singleton
@Component(modules = [AppModule::class, NetworkModule::class])
interface AppComponent {

    @Component.Builder
    interface Builder {
        fun appModule(appModule: AppModule): Builder
        fun networkModule(networkModule: NetworkModule): Builder
        fun build(): AppComponent
    }

    /**
     * Inject List
     */
    fun inject(booksViewModel: BooksViewModel)
    fun inject(booksActivity: BooksActivity)
}