package com.tuxdev.booksaac.ui.books

import android.app.Activity
import android.content.Intent
import android.databinding.DataBindingUtil
import android.os.Build
import android.support.v4.app.ActivityOptionsCompat
import android.support.v4.util.Pair
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tuxdev.booksaac.R
import com.tuxdev.booksaac.databinding.ActivityBooksItemBinding
import com.tuxdev.booksaac.model.ItemsItem
import kotlinx.android.synthetic.main.activity_books_item.view.*

/**
 **********************************************
 * Created by ukie on 8/21/18 with ♥
 * (>’_’)> email : ukie.tux@gmail.com
 * github : https://www.github.com/tuxkids <(’_’<)
 **********************************************
 * © 2018 | All Right Reserved
 */
class BooksAdapter : RecyclerView.Adapter<BooksAdapter.BookHolder>() {
    private lateinit var booksList: List<ItemsItem>

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookHolder =
            BookHolder(DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.activity_books_item, parent, false))

    override fun onBindViewHolder(holder: BookHolder, position: Int) =
            holder.bindItems(booksList[position])

    override fun getItemCount() = if (::booksList.isInitialized) booksList.size else 0

    fun updateListBooks(booksList: List<ItemsItem>) {
        this.booksList = booksList
        notifyDataSetChanged()
    }

    inner class BookHolder(private val binding: ActivityBooksItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bindItems(data: ItemsItem) = with(binding.root) {
            binding.book = data

            setOnClickListener {
                // TODO: Action ketika item di klik
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {

                    val detailBook = Intent(itemView.context.applicationContext, BooksDetailActivity::class.java)
                    detailBook.putExtra("items", data)
                    val image = Pair<View, String>(itemView.iv_thumb_books, itemView.iv_thumb_books.transitionName)
                    val author = Pair<View, String>(itemView.tv_books_authors, itemView.tv_books_authors.transitionName)
                    val title = Pair<View, String>(itemView.tv_books_title, itemView.tv_books_title.transitionName)
                    val date = Pair<View, String>(itemView.tv_books_date, itemView.tv_books_date.transitionName)
                    val publisher = Pair<View, String>(itemView.tv_books_publisher, itemView.tv_books_publisher.transitionName)

                    val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
                            itemView.context as Activity,
                            author, title, date, publisher, image
                    )
                    itemView.context.startActivity(detailBook, options.toBundle())
                } else {
                    val detailBook = Intent(itemView.context.applicationContext, BooksDetailActivity::class.java)
                    detailBook.putExtra("items", data)
                    itemView.context.startActivity(detailBook)
                }
            }
        }

    }
}