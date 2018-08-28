package com.tuxdev.booksaac.di.component;

import java.lang.System;

/**
 * **********************************************
 * * Created by ukie on 8/6/18 with ♥
 * * (>’_’)> email : ukie.tux@gmail.com
 * * github : https://www.github.com/tuxkids <(’_’<)
 * **********************************************
 * * © 2018 | All Right Reserved
 */
@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\bJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\t"}, d2 = {"Lcom/tuxdev/booksaac/di/component/AppComponent;", "", "inject", "", "booksActivity", "Lcom/tuxdev/booksaac/ui/books/BooksActivity;", "booksViewModel", "Lcom/tuxdev/booksaac/ui/books/BooksViewModel;", "Builder", "app_debug"})
@dagger.Component(modules = {com.tuxdev.booksaac.di.module.AppModule.class, com.tuxdev.booksaac.di.module.NetworkModule.class})
@javax.inject.Singleton()
public abstract interface AppComponent {
    
    /**
     * * Inject List
     */
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.tuxdev.booksaac.ui.books.BooksViewModel booksViewModel);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.tuxdev.booksaac.ui.books.BooksActivity booksActivity);
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/tuxdev/booksaac/di/component/AppComponent$Builder;", "", "appModule", "Lcom/tuxdev/booksaac/di/module/AppModule;", "build", "Lcom/tuxdev/booksaac/di/component/AppComponent;", "networkModule", "Lcom/tuxdev/booksaac/di/module/NetworkModule;", "app_debug"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.tuxdev.booksaac.di.component.AppComponent.Builder appModule(@org.jetbrains.annotations.NotNull()
        com.tuxdev.booksaac.di.module.AppModule appModule);
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.tuxdev.booksaac.di.component.AppComponent.Builder networkModule(@org.jetbrains.annotations.NotNull()
        com.tuxdev.booksaac.di.module.NetworkModule networkModule);
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.tuxdev.booksaac.di.component.AppComponent build();
    }
}