package com.tuxdev.booksaac.utils

import android.app.Application
import com.tuxdev.booksaac.di.component.AppComponent
import com.tuxdev.booksaac.di.component.DaggerAppComponent
import com.tuxdev.booksaac.di.module.AppModule
import com.tuxdev.booksaac.di.module.NetworkModule


/**
 **********************************************
 * Created by ukie on 8/6/18 with ♥
 * (>’_’)> email : ukie.tux@gmail.com
 * github : https://www.github.com/tuxkids <(’_’<)
 **********************************************
 * © 2018 | All Right Reserved
 */
class BaseApp : Application() {
    companion object {
        lateinit var appComponent: AppComponent
    }


    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
                .appModule(AppModule(this))
                .networkModule(NetworkModule())
                .build()
    }
}