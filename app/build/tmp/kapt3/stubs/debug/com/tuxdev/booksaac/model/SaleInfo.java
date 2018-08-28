package com.tuxdev.booksaac.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u0000 32\u00020\u0001:\u00013B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B_\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0002\u0010\u0012J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0016J\u000b\u0010\"\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003Jh\u0010&\u001a\u00020\u00002\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00c6\u0001\u00a2\u0006\u0002\u0010\'J\b\u0010(\u001a\u00020)H\u0016J\u0013\u0010*\u001a\u00020\u000b2\b\u0010+\u001a\u0004\u0018\u00010,H\u00d6\u0003J\t\u0010-\u001a\u00020)H\u00d6\u0001J\t\u0010.\u001a\u00020\tH\u00d6\u0001J\u0018\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u00032\u0006\u00102\u001a\u00020)H\u0016R\u0013\u0010\r\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\n\u0010\u0016R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\f\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014\u00a8\u00064"}, d2 = {"Lcom/tuxdev/booksaac/model/SaleInfo;", "Landroid/os/Parcelable;", "source", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "offers", "", "Lcom/tuxdev/booksaac/model/OffersItem;", "country", "", "isEbook", "", "saleability", "buyLink", "retailPrice", "Lcom/tuxdev/booksaac/model/RetailPrice;", "listPrice", "Lcom/tuxdev/booksaac/model/ListPrice;", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/tuxdev/booksaac/model/RetailPrice;Lcom/tuxdev/booksaac/model/ListPrice;)V", "getBuyLink", "()Ljava/lang/String;", "getCountry", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getListPrice", "()Lcom/tuxdev/booksaac/model/ListPrice;", "getOffers", "()Ljava/util/List;", "getRetailPrice", "()Lcom/tuxdev/booksaac/model/RetailPrice;", "getSaleability", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/tuxdev/booksaac/model/RetailPrice;Lcom/tuxdev/booksaac/model/ListPrice;)Lcom/tuxdev/booksaac/model/SaleInfo;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "flags", "Companion", "app_debug"})
public final class SaleInfo implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.tuxdev.booksaac.model.OffersItem> offers = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String country = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean isEbook = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String saleability = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String buyLink = null;
    @org.jetbrains.annotations.Nullable()
    private final com.tuxdev.booksaac.model.RetailPrice retailPrice = null;
    @org.jetbrains.annotations.Nullable()
    private final com.tuxdev.booksaac.model.ListPrice listPrice = null;
    @org.jetbrains.annotations.NotNull()
    public static final android.os.Parcelable.Creator<com.tuxdev.booksaac.model.SaleInfo> CREATOR = null;
    public static final com.tuxdev.booksaac.model.SaleInfo.Companion Companion = null;
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel dest, int flags) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.tuxdev.booksaac.model.OffersItem> getOffers() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCountry() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isEbook() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSaleability() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBuyLink() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tuxdev.booksaac.model.RetailPrice getRetailPrice() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tuxdev.booksaac.model.ListPrice getListPrice() {
        return null;
    }
    
    public SaleInfo(@org.jetbrains.annotations.Nullable()
    java.util.List<com.tuxdev.booksaac.model.OffersItem> offers, @org.jetbrains.annotations.Nullable()
    java.lang.String country, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isEbook, @org.jetbrains.annotations.Nullable()
    java.lang.String saleability, @org.jetbrains.annotations.Nullable()
    java.lang.String buyLink, @org.jetbrains.annotations.Nullable()
    com.tuxdev.booksaac.model.RetailPrice retailPrice, @org.jetbrains.annotations.Nullable()
    com.tuxdev.booksaac.model.ListPrice listPrice) {
        super();
    }
    
    public SaleInfo() {
        super();
    }
    
    public SaleInfo(@org.jetbrains.annotations.NotNull()
    android.os.Parcel source) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.tuxdev.booksaac.model.OffersItem> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tuxdev.booksaac.model.RetailPrice component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tuxdev.booksaac.model.ListPrice component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tuxdev.booksaac.model.SaleInfo copy(@org.jetbrains.annotations.Nullable()
    java.util.List<com.tuxdev.booksaac.model.OffersItem> offers, @org.jetbrains.annotations.Nullable()
    java.lang.String country, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isEbook, @org.jetbrains.annotations.Nullable()
    java.lang.String saleability, @org.jetbrains.annotations.Nullable()
    java.lang.String buyLink, @org.jetbrains.annotations.Nullable()
    com.tuxdev.booksaac.model.RetailPrice retailPrice, @org.jetbrains.annotations.Nullable()
    com.tuxdev.booksaac.model.ListPrice listPrice) {
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
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/tuxdev/booksaac/model/SaleInfo$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/tuxdev/booksaac/model/SaleInfo;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}