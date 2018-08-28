package com.tuxdev.booksaac.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 2, d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0007\u001a\u0018\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0007\u001a\u001c\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000b2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\rH\u0007\u001a\u0018\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007\u00a8\u0006\u0012"}, d2 = {"authorAdapter", "", "view", "Landroid/widget/TextView;", "authorsList", "", "", "imageAdapter", "Landroid/widget/ImageView;", "imageUrl", "mutableRvAdapter", "Landroid/support/v7/widget/RecyclerView;", "adapter", "Landroid/support/v7/widget/RecyclerView$Adapter;", "mutableVisibility", "Landroid/view/View;", "visible", "", "app_debug"})
public final class BindingAdaptersKt {
    
    /**
     * **********************************************
     * * Created by ukie on 8/21/18 with ♥
     * * (>’_’)> email : ukie.tux@gmail.com
     * * github : https://www.github.com/tuxkids <(’_’<)
     * **********************************************
     * * © 2018 | All Right Reserved
     */
    @android.databinding.BindingAdapter(value = {"app:visibility"})
    public static final void mutableVisibility(@org.jetbrains.annotations.NotNull()
    android.view.View view, boolean visible) {
    }
    
    @android.databinding.BindingAdapter(value = {"app:rvAdapter"})
    public static final void mutableRvAdapter(@org.jetbrains.annotations.NotNull()
    android.support.v7.widget.RecyclerView view, @org.jetbrains.annotations.NotNull()
    android.support.v7.widget.RecyclerView.Adapter<?> adapter) {
    }
    
    @android.databinding.BindingAdapter(value = {"app:author"})
    public static final void authorAdapter(@org.jetbrains.annotations.NotNull()
    android.widget.TextView view, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> authorsList) {
    }
    
    @android.databinding.BindingAdapter(value = {"app:imageUrl"})
    public static final void imageAdapter(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView view, @org.jetbrains.annotations.NotNull()
    java.lang.String imageUrl) {
    }
}