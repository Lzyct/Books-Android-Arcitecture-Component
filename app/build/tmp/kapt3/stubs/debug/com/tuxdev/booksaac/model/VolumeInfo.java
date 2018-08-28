package com.tuxdev.booksaac.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b:\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u0000 _2\u00020\u0001:\u0001_B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0089\u0002\u0012\u0012\b\u0002\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010!J\u0013\u0010?\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0015H\u00c6\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u0011\u0010E\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u0010\u0010G\u001a\u0004\u0018\u00010\u001dH\u00c6\u0003\u00a2\u0006\u0002\u0010#J\u000b\u0010H\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u0011\u0010I\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006H\u00c6\u0003J\u0010\u0010J\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u00103J\u000b\u0010K\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u0092\u0002\u0010S\u001a\u00020\u00002\u0012\b\u0002\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00062\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00062\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000bH\u00c6\u0001\u00a2\u0006\u0002\u0010TJ\b\u0010U\u001a\u00020\tH\u0016J\u0013\u0010V\u001a\u00020\u001d2\b\u0010W\u001a\u0004\u0018\u00010XH\u00d6\u0003J\t\u0010Y\u001a\u00020\tH\u00d6\u0001J\t\u0010Z\u001a\u00020\u000bH\u00d6\u0001J\u0018\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020\u00032\u0006\u0010^\u001a\u00020\tH\u0016R\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u00a2\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0019\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(R\u0019\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010&R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010(R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010(R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u001b\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010&R\u0013\u0010 \u001a\u0004\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010(R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010(R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010(R\u0015\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u00104\u001a\u0004\b2\u00103R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010(R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010(R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010(R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010(R\u0013\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010(R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010(\u00a8\u0006`"}, d2 = {"Lcom/tuxdev/booksaac/model/VolumeInfo;", "Landroid/os/Parcelable;", "source", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "industryIdentifiers", "", "Lcom/tuxdev/booksaac/model/IndustryIdentifiersItem;", "pageCount", "", "printType", "", "readingModes", "Lcom/tuxdev/booksaac/model/ReadingModes;", "previewLink", "canonicalVolumeLink", "description", "language", "title", "subtitle", "imageLinks", "Lcom/tuxdev/booksaac/model/ImageLinks;", "panelizationSummary", "Lcom/tuxdev/booksaac/model/PanelizationSummary;", "publisher", "publishedDate", "categories", "maturityRating", "allowAnonLogging", "", "contentVersion", "authors", "infoLink", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Lcom/tuxdev/booksaac/model/ReadingModes;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tuxdev/booksaac/model/ImageLinks;Lcom/tuxdev/booksaac/model/PanelizationSummary;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getAllowAnonLogging", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAuthors", "()Ljava/util/List;", "getCanonicalVolumeLink", "()Ljava/lang/String;", "getCategories", "getContentVersion", "getDescription", "getImageLinks", "()Lcom/tuxdev/booksaac/model/ImageLinks;", "getIndustryIdentifiers", "getInfoLink", "getLanguage", "getMaturityRating", "getPageCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPanelizationSummary", "()Lcom/tuxdev/booksaac/model/PanelizationSummary;", "getPreviewLink", "getPrintType", "getPublishedDate", "getPublisher", "getReadingModes", "()Lcom/tuxdev/booksaac/model/ReadingModes;", "getSubtitle", "getTitle", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Lcom/tuxdev/booksaac/model/ReadingModes;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tuxdev/booksaac/model/ImageLinks;Lcom/tuxdev/booksaac/model/PanelizationSummary;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/tuxdev/booksaac/model/VolumeInfo;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "flags", "Companion", "app_debug"})
public final class VolumeInfo implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.tuxdev.booksaac.model.IndustryIdentifiersItem> industryIdentifiers = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer pageCount = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String printType = null;
    @org.jetbrains.annotations.Nullable()
    private final com.tuxdev.booksaac.model.ReadingModes readingModes = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String previewLink = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String canonicalVolumeLink = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String description = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String language = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String title = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String subtitle = null;
    @org.jetbrains.annotations.Nullable()
    private final com.tuxdev.booksaac.model.ImageLinks imageLinks = null;
    @org.jetbrains.annotations.Nullable()
    private final com.tuxdev.booksaac.model.PanelizationSummary panelizationSummary = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String publisher = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String publishedDate = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<java.lang.String> categories = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String maturityRating = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean allowAnonLogging = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String contentVersion = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<java.lang.String> authors = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String infoLink = null;
    @org.jetbrains.annotations.NotNull()
    public static final android.os.Parcelable.Creator<com.tuxdev.booksaac.model.VolumeInfo> CREATOR = null;
    public static final com.tuxdev.booksaac.model.VolumeInfo.Companion Companion = null;
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel dest, int flags) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.tuxdev.booksaac.model.IndustryIdentifiersItem> getIndustryIdentifiers() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPageCount() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPrintType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tuxdev.booksaac.model.ReadingModes getReadingModes() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPreviewLink() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCanonicalVolumeLink() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLanguage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSubtitle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tuxdev.booksaac.model.ImageLinks getImageLinks() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tuxdev.booksaac.model.PanelizationSummary getPanelizationSummary() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPublisher() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPublishedDate() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getCategories() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMaturityRating() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getAllowAnonLogging() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getContentVersion() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getAuthors() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getInfoLink() {
        return null;
    }
    
    public VolumeInfo(@org.jetbrains.annotations.Nullable()
    java.util.List<com.tuxdev.booksaac.model.IndustryIdentifiersItem> industryIdentifiers, @org.jetbrains.annotations.Nullable()
    java.lang.Integer pageCount, @org.jetbrains.annotations.Nullable()
    java.lang.String printType, @org.jetbrains.annotations.Nullable()
    com.tuxdev.booksaac.model.ReadingModes readingModes, @org.jetbrains.annotations.Nullable()
    java.lang.String previewLink, @org.jetbrains.annotations.Nullable()
    java.lang.String canonicalVolumeLink, @org.jetbrains.annotations.Nullable()
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    java.lang.String language, @org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String subtitle, @org.jetbrains.annotations.Nullable()
    com.tuxdev.booksaac.model.ImageLinks imageLinks, @org.jetbrains.annotations.Nullable()
    com.tuxdev.booksaac.model.PanelizationSummary panelizationSummary, @org.jetbrains.annotations.Nullable()
    java.lang.String publisher, @org.jetbrains.annotations.Nullable()
    java.lang.String publishedDate, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> categories, @org.jetbrains.annotations.Nullable()
    java.lang.String maturityRating, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean allowAnonLogging, @org.jetbrains.annotations.Nullable()
    java.lang.String contentVersion, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> authors, @org.jetbrains.annotations.Nullable()
    java.lang.String infoLink) {
        super();
    }
    
    public VolumeInfo() {
        super();
    }
    
    public VolumeInfo(@org.jetbrains.annotations.NotNull()
    android.os.Parcel source) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.tuxdev.booksaac.model.IndustryIdentifiersItem> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tuxdev.booksaac.model.ReadingModes component4() {
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
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tuxdev.booksaac.model.ImageLinks component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tuxdev.booksaac.model.PanelizationSummary component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> component19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component20() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tuxdev.booksaac.model.VolumeInfo copy(@org.jetbrains.annotations.Nullable()
    java.util.List<com.tuxdev.booksaac.model.IndustryIdentifiersItem> industryIdentifiers, @org.jetbrains.annotations.Nullable()
    java.lang.Integer pageCount, @org.jetbrains.annotations.Nullable()
    java.lang.String printType, @org.jetbrains.annotations.Nullable()
    com.tuxdev.booksaac.model.ReadingModes readingModes, @org.jetbrains.annotations.Nullable()
    java.lang.String previewLink, @org.jetbrains.annotations.Nullable()
    java.lang.String canonicalVolumeLink, @org.jetbrains.annotations.Nullable()
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    java.lang.String language, @org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String subtitle, @org.jetbrains.annotations.Nullable()
    com.tuxdev.booksaac.model.ImageLinks imageLinks, @org.jetbrains.annotations.Nullable()
    com.tuxdev.booksaac.model.PanelizationSummary panelizationSummary, @org.jetbrains.annotations.Nullable()
    java.lang.String publisher, @org.jetbrains.annotations.Nullable()
    java.lang.String publishedDate, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> categories, @org.jetbrains.annotations.Nullable()
    java.lang.String maturityRating, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean allowAnonLogging, @org.jetbrains.annotations.Nullable()
    java.lang.String contentVersion, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> authors, @org.jetbrains.annotations.Nullable()
    java.lang.String infoLink) {
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
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/tuxdev/booksaac/model/VolumeInfo$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/tuxdev/booksaac/model/VolumeInfo;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}