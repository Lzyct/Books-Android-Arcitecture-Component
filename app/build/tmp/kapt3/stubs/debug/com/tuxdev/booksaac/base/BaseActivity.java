package com.tuxdev.booksaac.base;

import java.lang.System;

/**
 * *----------------------------------------------
 * * Created by ukieTux on 2/23/17 with ♥ .
 * * @email  : ukie.tux@gmail.com
 * * @github : https://www.github.com/tuxkids
 * * ----------------------------------------------
 * *          © 2017 | All Rights Reserved
 */
@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0019\u001a\u00020\u001aH$J\b\u0010\u001b\u001a\u00020\u001aH$J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH$J\b\u0010 \u001a\u00020\u001dH$J\u0012\u0010!\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0015J\b\u0010$\u001a\u00020\u001dH\u0014J\u0012\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016R\u001c\u0010\u0007\u001a\u00028\u0000X\u0084.\u00a2\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\u00020\u000eX\u0084.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u00028\u0001X\u0084.\u00a2\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006)"}, d2 = {"Lcom/tuxdev/booksaac/base/BaseActivity;", "B", "Landroid/databinding/ViewDataBinding;", "V", "Lcom/tuxdev/booksaac/base/BaseViewModel;", "Landroid/support/v7/app/AppCompatActivity;", "()V", "dataBinding", "getDataBinding", "()Landroid/databinding/ViewDataBinding;", "setDataBinding", "(Landroid/databinding/ViewDataBinding;)V", "Landroid/databinding/ViewDataBinding;", "toolbar", "Landroid/support/v7/widget/Toolbar;", "getToolbar", "()Landroid/support/v7/widget/Toolbar;", "setToolbar", "(Landroid/support/v7/widget/Toolbar;)V", "viewModel", "getViewModel", "()Lcom/tuxdev/booksaac/base/BaseViewModel;", "setViewModel", "(Lcom/tuxdev/booksaac/base/BaseViewModel;)V", "Lcom/tuxdev/booksaac/base/BaseViewModel;", "getLayoutResource", "", "getToolbarResource", "injectModule", "", "appComponent", "Lcom/tuxdev/booksaac/di/component/AppComponent;", "myCodeHere", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "app_debug"})
public abstract class BaseActivity<B extends android.databinding.ViewDataBinding, V extends com.tuxdev.booksaac.base.BaseViewModel> extends android.support.v7.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    protected android.support.v7.widget.Toolbar toolbar;
    @org.jetbrains.annotations.NotNull()
    protected B dataBinding;
    @org.jetbrains.annotations.NotNull()
    protected V viewModel;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    protected final android.support.v7.widget.Toolbar getToolbar() {
        return null;
    }
    
    protected final void setToolbar(@org.jetbrains.annotations.NotNull()
    android.support.v7.widget.Toolbar p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final B getDataBinding() {
        return null;
    }
    
    protected final void setDataBinding(@org.jetbrains.annotations.NotNull()
    B p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final V getViewModel() {
        return null;
    }
    
    protected final void setViewModel(@org.jetbrains.annotations.NotNull()
    V p0) {
    }
    
    @android.annotation.SuppressLint(value = {"RestrictedApi"})
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    protected abstract void injectModule(@org.jetbrains.annotations.NotNull()
    com.tuxdev.booksaac.di.component.AppComponent appComponent);
    
    protected abstract int getToolbarResource();
    
    protected abstract int getLayoutResource();
    
    protected abstract void myCodeHere();
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.Nullable()
    android.view.MenuItem item) {
        return false;
    }
    
    public BaseActivity() {
        super();
    }
}