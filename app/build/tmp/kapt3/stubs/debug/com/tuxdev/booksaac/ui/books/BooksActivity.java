package com.tuxdev.booksaac.ui.books;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0014J\b\u0010\r\u001a\u00020\fH\u0014J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u000fH\u0015J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u000fH\u0014J\u0012\u0010\u0018\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/tuxdev/booksaac/ui/books/BooksActivity;", "Lcom/tuxdev/booksaac/base/BaseActivity;", "Lcom/tuxdev/booksaac/databinding/ActivityBooksBinding;", "Lcom/tuxdev/booksaac/ui/books/BooksViewModel;", "()V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "query", "", "rxSearchView", "Lcom/tuxdev/booksaac/utils/RxSearchView;", "getLayoutResource", "", "getToolbarResource", "injectModule", "", "appComponent", "Lcom/tuxdev/booksaac/di/component/AppComponent;", "myCodeHere", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onDestroy", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "app_debug"})
public final class BooksActivity extends com.tuxdev.booksaac.base.BaseActivity<com.tuxdev.booksaac.databinding.ActivityBooksBinding, com.tuxdev.booksaac.ui.books.BooksViewModel> {
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    private final com.tuxdev.booksaac.utils.RxSearchView rxSearchView = null;
    private java.lang.String query;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void injectModule(@org.jetbrains.annotations.NotNull()
    com.tuxdev.booksaac.di.component.AppComponent appComponent) {
    }
    
    @java.lang.Override()
    protected int getLayoutResource() {
        return 0;
    }
    
    @java.lang.Override()
    protected int getToolbarResource() {
        return 0;
    }
    
    @android.annotation.SuppressLint(value = {"RestrictedApi"})
    @java.lang.Override()
    protected void myCodeHere() {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.Nullable()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    public BooksActivity() {
        super();
    }
}