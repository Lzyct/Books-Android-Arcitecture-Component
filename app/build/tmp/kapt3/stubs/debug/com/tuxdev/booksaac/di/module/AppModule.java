package com.tuxdev.booksaac.di.module;

import java.lang.System;

/**
 * **********************************************
 * * Created by ukie on 8/6/18 with ♥
 * * (>’_’)> email : ukie.tux@gmail.com
 * * github : https://www.github.com/tuxkids <(’_’<)
 * **********************************************
 * * © 2018 | All Right Reserved
 */
@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/tuxdev/booksaac/di/module/AppModule;", "", "baseApp", "Lcom/tuxdev/booksaac/utils/BaseApp;", "(Lcom/tuxdev/booksaac/utils/BaseApp;)V", "provideApplication", "Landroid/app/Application;", "provideContext", "Landroid/content/Context;", "app_debug"})
@dagger.Module()
public final class AppModule {
    private final com.tuxdev.booksaac.utils.BaseApp baseApp = null;
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final android.app.Application provideApplication() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final android.content.Context provideContext() {
        return null;
    }
    
    public AppModule(@org.jetbrains.annotations.NotNull()
    com.tuxdev.booksaac.utils.BaseApp baseApp) {
        super();
    }
}