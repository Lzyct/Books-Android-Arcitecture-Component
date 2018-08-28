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

public abstract class ActivityBooksDetailsBinding extends ViewDataBinding {
  @NonNull
  public final CardView cvBody;

  @NonNull
  public final CardView cvFooter;

  @NonNull
  public final CardView cvHeader;

  @NonNull
  public final View icl;

  @NonNull
  public final ImageView ivBook;

  @NonNull
  public final TextView tvAuthors;

  @NonNull
  public final TextView tvDescription;

  @NonNull
  public final TextView tvPublishDate;

  @NonNull
  public final TextView tvPublisher;

  @NonNull
  public final TextView tvSubtitle;

  @NonNull
  public final TextView tvTitle;

  @Bindable
  protected ItemsItem mBook;

  protected ActivityBooksDetailsBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, CardView cvBody, CardView cvFooter, CardView cvHeader, View icl,
      ImageView ivBook, TextView tvAuthors, TextView tvDescription, TextView tvPublishDate,
      TextView tvPublisher, TextView tvSubtitle, TextView tvTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cvBody = cvBody;
    this.cvFooter = cvFooter;
    this.cvHeader = cvHeader;
    this.icl = icl;
    this.ivBook = ivBook;
    this.tvAuthors = tvAuthors;
    this.tvDescription = tvDescription;
    this.tvPublishDate = tvPublishDate;
    this.tvPublisher = tvPublisher;
    this.tvSubtitle = tvSubtitle;
    this.tvTitle = tvTitle;
  }

  public abstract void setBook(@Nullable ItemsItem book);

  @Nullable
  public ItemsItem getBook() {
    return mBook;
  }

  @NonNull
  public static ActivityBooksDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityBooksDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityBooksDetailsBinding>inflate(inflater, com.tuxdev.booksaac.R.layout.activity_books_details, root, attachToRoot, component);
  }

  @Nullable
  public static ActivityBooksDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityBooksDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityBooksDetailsBinding>inflate(inflater, com.tuxdev.booksaac.R.layout.activity_books_details, null, false, component);
  }

  @NonNull
  public static ActivityBooksDetailsBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityBooksDetailsBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityBooksDetailsBinding)bind(component, view, com.tuxdev.booksaac.R.layout.activity_books_details);
  }
}
