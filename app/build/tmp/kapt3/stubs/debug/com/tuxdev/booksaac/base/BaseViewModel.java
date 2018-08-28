package com.tuxdev.booksaac.base;

import java.lang.System;

/**
 * **********************************************
 * * Created by ukie on 8/7/18 with ♥
 * * (>’_’)> email : ukie.tux@gmail.com
 * * github : https://www.github.com/tuxkids <(’_’<)
 * **********************************************
 * * © 2018 | All Right Reserved
 */
@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\nH$R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/tuxdev/booksaac/base/BaseViewModel;", "Landroid/arch/lifecycle/ViewModel;", "()V", "composite", "Lio/reactivex/disposables/CompositeDisposable;", "getComposite", "()Lio/reactivex/disposables/CompositeDisposable;", "setComposite", "(Lio/reactivex/disposables/CompositeDisposable;)V", "viewModelInject", "Lcom/tuxdev/booksaac/di/component/AppComponent;", "detachView", "", "inject", "appComponent", "app_debug"})
public abstract class BaseViewModel extends android.arch.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private io.reactivex.disposables.CompositeDisposable composite;
    private final com.tuxdev.booksaac.di.component.AppComponent viewModelInject = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.disposables.CompositeDisposable getComposite() {
        return null;
    }
    
    public final void setComposite(@org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable p0) {
    }
    
    protected abstract void inject(@org.jetbrains.annotations.NotNull()
    com.tuxdev.booksaac.di.component.AppComponent appComponent);
    
    public final void detachView() {
    }
    
    public BaseViewModel() {
        super();
    }
}