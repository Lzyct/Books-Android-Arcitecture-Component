package com.tuxdev.booksaac.utils

import android.databinding.BindingAdapter
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.orhanobut.logger.Logger
import com.squareup.picasso.Picasso

/**
 **********************************************
 * Created by ukie on 8/21/18 with ♥
 * (>’_’)> email : ukie.tux@gmail.com
 * github : https://www.github.com/tuxkids <(’_’<)
 **********************************************
 * © 2018 | All Right Reserved
 */

@BindingAdapter("app:visibility")
fun mutableVisibility(view: View, visible: Boolean) {
    view.visibility = if (visible) View.VISIBLE else View.GONE
}

@BindingAdapter("app:rvAdapter")
fun mutableRvAdapter(view: RecyclerView, adapter: RecyclerView.Adapter<*>) {
    view.adapter = adapter
}

@BindingAdapter("app:author")
fun authorAdapter(view: TextView, authorsList: List<String>?) {
    var authors = ""
    try {
        for (items in authorsList?.indices ?: throw NullPointerException()) {
            if (authorsList.size == 1)
                authors = authorsList[0]
            else {
                if (items == 0) {
                    authors = authorsList[0]
                } else
                    authors += ",${authorsList[items]}"
            }
        }
        Logger.d(authors)
        view.text = authors
    } catch (e: NullPointerException) {
        e.printStackTrace()
    }
}

@BindingAdapter("app:imageUrl")
fun imageAdapter(view: ImageView, imageUrl: String) {
    Picasso.get()
            .load(imageUrl)
            .into(view)
}