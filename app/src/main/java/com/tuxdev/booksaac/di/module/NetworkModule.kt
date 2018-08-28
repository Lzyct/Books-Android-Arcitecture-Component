package com.tuxdev.booksaac.di.module

import com.tuxdev.booksaac.BuildConfig
import com.tuxdev.booksaac.network.BookServices
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

/**
 **********************************************
 * Created by ukie on 8/6/18 with ♥
 * (>’_’)> email : ukie.tux@gmail.com
 * github : https://www.github.com/tuxkids <(’_’<)
 **********************************************
 * © 2018 | All Right Reserved
 */

@Module
class NetworkModule {

    @Provides
    @Singleton
    fun provideOkhttp(): OkHttpClient {
        //Logging -> hapus saat release
        val logging = HttpLoggingInterceptor()
        logging.level = HttpLoggingInterceptor.Level.BODY

        val builder = OkHttpClient.Builder()
        builder.connectTimeout(60, TimeUnit.SECONDS)
        builder.readTimeout(60, TimeUnit.SECONDS)
        builder.writeTimeout(60, TimeUnit.SECONDS)
        builder.retryOnConnectionFailure(true)
        builder.addInterceptor(logging)
        builder.addInterceptor { chain ->
            val request = chain.request().newBuilder()
                    .addHeader("Accept", "application/json").build()
            chain.proceed(request)
        }
        return builder.build()
    }

    @Provides
    @Singleton
    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit =
            Retrofit.Builder()
                    .baseUrl(BuildConfig.BASE_URL)
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(MoshiConverterFactory.create())
                    .client(okHttpClient)
                    .build()

    @Provides
    @Singleton
    fun provideSamalonaService(retrofit: Retrofit): BookServices = retrofit.create(BookServices::class.java)
}