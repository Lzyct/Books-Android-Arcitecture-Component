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
@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0012B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\bH\u0016J\u001c\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\f\u001a\u00020\bH\u0016J\u001c\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0014\u0010\u0011\u001a\u00020\n2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/tuxdev/booksaac/ui/books/BooksAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/tuxdev/booksaac/ui/books/BooksAdapter$BookHolder;", "()V", "booksList", "", "Lcom/tuxdev/booksaac/model/ItemsItem;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateListBooks", "BookHolder", "app_debug"})
public final class BooksAdapter extends android.support.v7.widget.RecyclerView.Adapter<com.tuxdev.booksaac.ui.books.BooksAdapter.BookHolder> {
    private java.util.List<com.tuxdev.booksaac.model.ItemsItem> booksList;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.tuxdev.booksaac.ui.books.BooksAdapter.BookHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.tuxdev.booksaac.ui.books.BooksAdapter.BookHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void updateListBooks(@org.jetbrains.annotations.NotNull()
    java.util.List<com.tuxdev.booksaac.model.ItemsItem> booksList) {
    }
    
    public BooksAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/tuxdev/booksaac/ui/books/BooksAdapter$BookHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "binding", "Lcom/tuxdev/booksaac/databinding/ActivityBooksItemBinding;", "(Lcom/tuxdev/booksaac/ui/books/BooksAdapter;Lcom/tuxdev/booksaac/databinding/ActivityBooksItemBinding;)V", "bindItems", "", "data", "Lcom/tuxdev/booksaac/model/ItemsItem;", "app_debug"})
    public final class BookHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        private final com.tuxdev.booksaac.databinding.ActivityBooksItemBinding binding = null;
        
        public final void bindItems(@org.jetbrains.annotations.NotNull()
        com.tuxdev.booksaac.model.ItemsItem data) {
        }
        
        public BookHolder(@org.jetbrains.annotations.NotNull()
        com.tuxdev.booksaac.databinding.ActivityBooksItemBinding binding) {
            super(null);
        }
    }
}