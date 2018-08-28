package com.tuxdev.booksaac.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tuxdev.booksaac.model.ItemsItem;

public abstract class ActivityBooksItemBinding extends ViewDataBinding {
  @NonNull
  public final CardView cvRootList;

  @NonNull
  public final ImageView ivThumbBooks;

  @NonNull
  public final TextView tvBooksAuthors;

  @NonNull
  public final TextView tvBooksDate;

  @NonNull
  public final TextView tvBooksPublisher;

  @NonNull
  public final TextView tvBooksTitle;

  @Bindable
  protected ItemsItem mBook;

  protected ActivityBooksItemBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, CardView cvRootList, ImageView ivThumbBooks, TextView tvBooksAuthors,
      TextView tvBooksDate, TextView tvBooksPublisher, TextView tvBooksTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cvRootList = cvRootList;
    this.ivThumbBooks = ivThumbBooks;
    this.tvBooksAuthors = tvBooksAuthors;
    this.tvBooksDate = tvBooksDate;
    this.tvBooksPublisher = tvBooksPublisher;
    this.tvBooksTitle = tvBooksTitle;
  }

  public abstract void setBook(@Nullable ItemsItem book);

  @Nullable
  public ItemsItem getBook() {
    return mBook;
  }

  @NonNull
  public static ActivityBooksItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityBooksItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityBooksItemBinding>inflate(inflater, com.tuxdev.booksaac.R.layout.activity_books_item, root, attachToRoot, component);
  }

  @Nullable
  public static ActivityBooksItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityBooksItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityBooksItemBinding>inflate(inflater, com.tuxdev.booksaac.R.layout.activity_books_item, null, false, component);
  }

  @NonNull
  public static ActivityBooksItemBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityBooksItemBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityBooksItemBinding)bind(component, view, com.tuxdev.booksaac.R.layout.activity_books_item);
  }
}
