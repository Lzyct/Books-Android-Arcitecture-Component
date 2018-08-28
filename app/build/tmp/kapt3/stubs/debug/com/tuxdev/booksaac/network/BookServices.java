package com.tuxdev.booksaac.network;

import java.lang.System;

/**
 * **********************************************
 * * Created by ukie on 8/21/18 with ♥
 * * (>’_’)> email : ukie.tux@gmail.com
 * * github : https://www.github.com/tuxkids <(’_’<)
 * **********************************************
 * * © 2018 | All Right Reserved
 */
@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\'\u00a8\u0006\b"}, d2 = {"Lcom/tuxdev/booksaac/network/BookServices;", "", "getBooks", "Lio/reactivex/Flowable;", "Lretrofit2/Response;", "Lcom/tuxdev/booksaac/model/DataBooks;", "query", "", "app_debug"})
public abstract interface BookServices {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "books/v1/volumes")
    public abstract io.reactivex.Flowable<retrofit2.Response<com.tuxdev.booksaac.model.DataBooks>> getBooks(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "q")
    java.lang.String query);
}