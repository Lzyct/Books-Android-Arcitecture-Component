package com.tuxdev.booksaac.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tuxdev.booksaac.ui.books.BooksViewModel;

public abstract class ActivityBooksBinding extends ViewDataBinding {
  @NonNull
  public final AppBarLayout appBar;

  @NonNull
  public final ProgressBar pbProgress;

  @NonNull
  public final RecyclerView rvBooks;

  @NonNull
  public final Toolbar toolbar;

  @NonNull
  public final TextView tvNoData;

  @Bindable
  protected BooksViewModel mViewModelBooks;

  protected ActivityBooksBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, AppBarLayout appBar, ProgressBar pbProgress, RecyclerView rvBooks,
      Toolbar toolbar, TextView tvNoData) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appBar = appBar;
    this.pbProgress = pbProgress;
    this.rvBooks = rvBooks;
    this.toolbar = toolbar;
    this.tvNoData = tvNoData;
  }

  public abstract void setViewModelBooks(@Nullable BooksViewModel viewModelBooks);

  @Nullable
  public BooksViewModel getViewModelBooks() {
    return mViewModelBooks;
  }

  @NonNull
  public static ActivityBooksBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityBooksBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityBooksBinding>inflate(inflater, com.tuxdev.booksaac.R.layout.activity_books, root, attachToRoot, component);
  }

  @Nullable
  public static ActivityBooksBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityBooksBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityBooksBinding>inflate(inflater, com.tuxdev.booksaac.R.layout.activity_books, null, false, component);
  }

  @NonNull
  public static ActivityBooksBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityBooksBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityBooksBinding)bind(component, view, com.tuxdev.booksaac.R.layout.activity_books);
  }
}
