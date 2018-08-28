package com.tuxdev.booksaac.network

import com.tuxdev.booksaac.model.DataBooks
import io.reactivex.Flowable
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

/**
 **********************************************
 * Created by ukie on 8/21/18 with ♥
 * (>’_’)> email : ukie.tux@gmail.com
 * github : https://www.github.com/tuxkids <(’_’<)
 **********************************************
 * © 2018 | All Right Reserved
 */
interface BookServices {

    @GET("books/v1/volumes")
    fun getBooks(@Query("q") query: String): Flowable<Response<DataBooks>>

}