package com.tuxdev.booksaac.utils;

import java.lang.System;

/**
 * **********************************************
 * * Created by ukie on 8/6/18 with ♥
 * * (>’_’)> email : ukie.tux@gmail.com
 * * github : https://www.github.com/tuxkids <(’_’<)
 * **********************************************
 * * © 2018 | All Right Reserved
 */
@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0006"}, d2 = {"Lcom/tuxdev/booksaac/utils/BaseApp;", "Landroid/app/Application;", "()V", "onCreate", "", "Companion", "app_debug"})
public final class BaseApp extends android.app.Application {
    @org.jetbrains.annotations.NotNull()
    public static com.tuxdev.booksaac.di.component.AppComponent appComponent;
    public static final com.tuxdev.booksaac.utils.BaseApp.Companion Companion = null;
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    public BaseApp() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/tuxdev/booksaac/utils/BaseApp$Companion;", "", "()V", "appComponent", "Lcom/tuxdev/booksaac/di/component/AppComponent;", "getAppComponent", "()Lcom/tuxdev/booksaac/di/component/AppComponent;", "setAppComponent", "(Lcom/tuxdev/booksaac/di/component/AppComponent;)V", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.tuxdev.booksaac.di.component.AppComponent getAppComponent() {
            return null;
        }
        
        public final void setAppComponent(@org.jetbrains.annotations.NotNull()
        com.tuxdev.booksaac.di.component.AppComponent p0) {
        }
        
        private Companion() {
            super();
        }
    }
}