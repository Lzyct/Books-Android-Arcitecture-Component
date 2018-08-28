package com.tuxdev.booksaac.ui.books;

import java.lang.System;

/**
 * **********************************************
 * * Created by ukie on 8/21/18 with ♥
 * * (>’_’)> email : ukie.tux@gmail.com
 * * github : https://www.github.com/tuxkids <(’_’<)
 * **********************************************
 * * © 2018 | All Right Reserved
 */
@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0013J\u0010\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001eH\u0014R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011\u00a8\u0006\u001f"}, d2 = {"Lcom/tuxdev/booksaac/ui/books/BooksViewModel;", "Lcom/tuxdev/booksaac/base/BaseViewModel;", "()V", "bookServices", "Lcom/tuxdev/booksaac/network/BookServices;", "getBookServices", "()Lcom/tuxdev/booksaac/network/BookServices;", "setBookServices", "(Lcom/tuxdev/booksaac/network/BookServices;)V", "booksAdapter", "Lcom/tuxdev/booksaac/ui/books/BooksAdapter;", "getBooksAdapter", "()Lcom/tuxdev/booksaac/ui/books/BooksAdapter;", "loadingVisibility", "Landroid/arch/lifecycle/MutableLiveData;", "", "getLoadingVisibility", "()Landroid/arch/lifecycle/MutableLiveData;", "noDataMessage", "", "getNoDataMessage", "noDataVisibility", "getNoDataVisibility", "rvVisibility", "getRvVisibility", "getBooks", "", "query", "inject", "appComponent", "Lcom/tuxdev/booksaac/di/component/AppComponent;", "app_debug"})
public final class BooksViewModel extends com.tuxdev.booksaac.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.tuxdev.booksaac.network.BookServices bookServices;
    @org.jetbrains.annotations.NotNull()
    private final com.tuxdev.booksaac.ui.books.BooksAdapter booksAdapter = null;
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.MutableLiveData<java.lang.Boolean> loadingVisibility = null;
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.MutableLiveData<java.lang.Boolean> noDataVisibility = null;
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.MutableLiveData<java.lang.Boolean> rvVisibility = null;
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.MutableLiveData<java.lang.String> noDataMessage = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.tuxdev.booksaac.network.BookServices getBookServices() {
        return null;
    }
    
    public final void setBookServices(@org.jetbrains.annotations.NotNull()
    com.tuxdev.booksaac.network.BookServices p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tuxdev.booksaac.ui.books.BooksAdapter getBooksAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.lang.Boolean> getLoadingVisibility() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.lang.Boolean> getNoDataVisibility() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.lang.Boolean> getRvVisibility() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.lang.String> getNoDataMessage() {
        return null;
    }
    
    @java.lang.Override()
    protected void inject(@org.jetbrains.annotations.NotNull()
    com.tuxdev.booksaac.di.component.AppComponent appComponent) {
    }
    
    public final void getBooks(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    public BooksViewModel() {
        super();
    }
}