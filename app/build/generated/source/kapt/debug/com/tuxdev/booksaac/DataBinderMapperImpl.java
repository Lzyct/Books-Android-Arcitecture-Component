package com.tuxdev.booksaac;

import android.databinding.DataBinderMapper;
import android.databinding.DataBindingComponent;
import android.databinding.ViewDataBinding;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import com.tuxdev.booksaac.databinding.ActivityBooksBindingImpl;
import com.tuxdev.booksaac.databinding.ActivityBooksDetailsBindingImpl;
import com.tuxdev.booksaac.databinding.ActivityBooksItemBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYBOOKSITEM = 1;

  private static final int LAYOUT_ACTIVITYBOOKSDETAILS = 2;

  private static final int LAYOUT_ACTIVITYBOOKS = 3;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(3);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.tuxdev.booksaac.R.layout.activity_books_item, LAYOUT_ACTIVITYBOOKSITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.tuxdev.booksaac.R.layout.activity_books_details, LAYOUT_ACTIVITYBOOKSDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.tuxdev.booksaac.R.layout.activity_books, LAYOUT_ACTIVITYBOOKS);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYBOOKSITEM: {
          if ("layout/activity_books_item_0".equals(tag)) {
            return new ActivityBooksItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_books_item is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYBOOKSDETAILS: {
          if ("layout/activity_books_details_0".equals(tag)) {
            return new ActivityBooksDetailsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_books_details is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYBOOKS: {
          if ("layout/activity_books_0".equals(tag)) {
            return new ActivityBooksBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_books is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    final int code = tag.hashCode();
    switch(code) {
      case 1121304388: {
        if(tag.equals("layout/activity_books_item_0")) {
          return R.layout.activity_books_item;
        }
        break;
      }
      case -1306379213: {
        if(tag.equals("layout/activity_books_details_0")) {
          return R.layout.activity_books_details;
        }
        break;
      }
      case -514881808: {
        if(tag.equals("layout/activity_books_0")) {
          return R.layout.activity_books;
        }
        break;
      }
    }
    return 0;
  }

  @Override
  public String convertBrIdToString(int id) {
    String tmpVal = InnerBrLookup.sKeys.get(id);
    return tmpVal;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(3);

    static {
      sKeys.put(com.tuxdev.booksaac.BR._all, "_all");
      sKeys.put(com.tuxdev.booksaac.BR.book, "book");
      sKeys.put(com.tuxdev.booksaac.BR.viewModelBooks, "viewModelBooks");
    }
  }
}
