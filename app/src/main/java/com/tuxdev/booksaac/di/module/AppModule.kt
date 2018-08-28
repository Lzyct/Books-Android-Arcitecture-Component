package com.tuxdev.booksaac.di.module

import android.app.Application
import android.content.Context
import com.tuxdev.booksaac.utils.BaseApp
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 **********************************************
 * Created by ukie on 8/6/18 with ♥
 * (>’_’)> email : ukie.tux@gmail.com
 * github : https://www.github.com/tuxkids <(’_’<)
 **********************************************
 * © 2018 | All Right Reserved
 */
@Module
class AppModule(private val baseApp: BaseApp) {
    @Provides
    @Singleton
    fun provideApplication(): Application = baseApp

    @Provides
    @Singleton
    fun provideContext(): Context = baseApp

}