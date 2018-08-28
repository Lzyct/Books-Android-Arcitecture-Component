package com.tuxdev.booksaac.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u0000 52\u00020\u0001:\u00015B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004Be\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u0012J\u000b\u0010 \u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\fH\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\u000b\u0010\'\u001a\u0004\u0018\u00010\nH\u00c6\u0003Ji\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\nH\u00c6\u0001J\b\u0010)\u001a\u00020*H\u0016J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.H\u00d6\u0003J\t\u0010/\u001a\u00020*H\u00d6\u0001J\t\u00100\u001a\u00020\nH\u00d6\u0001J\u0018\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u00032\u0006\u00104\u001a\u00020*H\u0016R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\r\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f\u00a8\u00066"}, d2 = {"Lcom/tuxdev/booksaac/model/ItemsItem;", "Landroid/os/Parcelable;", "source", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "saleInfo", "Lcom/tuxdev/booksaac/model/SaleInfo;", "searchInfo", "Lcom/tuxdev/booksaac/model/SearchInfo;", "kind", "", "volumeInfo", "Lcom/tuxdev/booksaac/model/VolumeInfo;", "etag", "id", "accessInfo", "Lcom/tuxdev/booksaac/model/AccessInfo;", "selfLink", "(Lcom/tuxdev/booksaac/model/SaleInfo;Lcom/tuxdev/booksaac/model/SearchInfo;Ljava/lang/String;Lcom/tuxdev/booksaac/model/VolumeInfo;Ljava/lang/String;Ljava/lang/String;Lcom/tuxdev/booksaac/model/AccessInfo;Ljava/lang/String;)V", "getAccessInfo", "()Lcom/tuxdev/booksaac/model/AccessInfo;", "getEtag", "()Ljava/lang/String;", "getId", "getKind", "getSaleInfo", "()Lcom/tuxdev/booksaac/model/SaleInfo;", "getSearchInfo", "()Lcom/tuxdev/booksaac/model/SearchInfo;", "getSelfLink", "getVolumeInfo", "()Lcom/tuxdev/booksaac/model/VolumeInfo;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "flags", "Companion", "app_debug"})
public final class ItemsItem implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable()
    private final com.tuxdev.booksaac.model.SaleInfo saleInfo = null;
    @org.jetbrains.annotations.Nullable()
    private final com.tuxdev.booksaac.model.SearchInfo searchInfo = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String kind = null;
    @org.jetbrains.annotations.Nullable()
    private final com.tuxdev.booksaac.model.VolumeInfo volumeInfo = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String etag = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String id = null;
    @org.jetbrains.annotations.Nullable()
    private final com.tuxdev.booksaac.model.AccessInfo accessInfo = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String selfLink = null;
    @org.jetbrains.annotations.NotNull()
    public static final android.os.Parcelable.Creator<com.tuxdev.booksaac.model.ItemsItem> CREATOR = null;
    public static final com.tuxdev.booksaac.model.ItemsItem.Companion Companion = null;
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel dest, int flags) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tuxdev.booksaac.model.SaleInfo getSaleInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tuxdev.booksaac.model.SearchInfo getSearchInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getKind() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tuxdev.booksaac.model.VolumeInfo getVolumeInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEtag() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tuxdev.booksaac.model.AccessInfo getAccessInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSelfLink() {
        return null;
    }
    
    public ItemsItem(@org.jetbrains.annotations.Nullable()
    com.tuxdev.booksaac.model.SaleInfo saleInfo, @org.jetbrains.annotations.Nullable()
    com.tuxdev.booksaac.model.SearchInfo searchInfo, @org.jetbrains.annotations.Nullable()
    java.lang.String kind, @org.jetbrains.annotations.Nullable()
    com.tuxdev.booksaac.model.VolumeInfo volumeInfo, @org.jetbrains.annotations.Nullable()
    java.lang.String etag, @org.jetbrains.annotations.Nullable()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    com.tuxdev.booksaac.model.AccessInfo accessInfo, @org.jetbrains.annotations.Nullable()
    java.lang.String selfLink) {
        super();
    }
    
    public ItemsItem() {
        super();
    }
    
    public ItemsItem(@org.jetbrains.annotations.NotNull()
    android.os.Parcel source) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tuxdev.booksaac.model.SaleInfo component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tuxdev.booksaac.model.SearchInfo component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tuxdev.booksaac.model.VolumeInfo component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tuxdev.booksaac.model.AccessInfo component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tuxdev.booksaac.model.ItemsItem copy(@org.jetbrains.annotations.Nullable()
    com.tuxdev.booksaac.model.SaleInfo saleInfo, @org.jetbrains.annotations.Nullable()
    com.tuxdev.booksaac.model.SearchInfo searchInfo, @org.jetbrains.annotations.Nullable()
    java.lang.String kind, @org.jetbrains.annotations.Nullable()
    com.tuxdev.booksaac.model.VolumeInfo volumeInfo, @org.jetbrains.annotations.Nullable()
    java.lang.String etag, @org.jetbrains.annotations.Nullable()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    com.tuxdev.booksaac.model.AccessInfo accessInfo, @org.jetbrains.annotations.Nullable()
    java.lang.String selfLink) {
        return null;
    }
    
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(java.lang.Object p0) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/tuxdev/booksaac/model/ItemsItem$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/tuxdev/booksaac/model/ItemsItem;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}