package com.tuxdev.booksaac.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u0000 :2\u00020\u0001:\u0001:B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B}\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0013J\u000b\u0010#\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\'\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0018J\u0010\u0010+\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0018J\u0010\u0010,\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0018J\u0086\u0001\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0002\u0010.J\b\u0010/\u001a\u000200H\u0016J\u0013\u00101\u001a\u00020\u000f2\b\u00102\u001a\u0004\u0018\u000103H\u00d6\u0003J\t\u00104\u001a\u000200H\u00d6\u0001J\t\u00105\u001a\u00020\u0006H\u00d6\u0001J\u0018\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u00032\u0006\u00109\u001a\u000200H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001e\u0010\u0018R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001f\u0010\u0018R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015\u00a8\u0006;"}, d2 = {"Lcom/tuxdev/booksaac/model/AccessInfo;", "Landroid/os/Parcelable;", "source", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "accessViewStatus", "", "country", "viewability", "pdf", "Lcom/tuxdev/booksaac/model/Pdf;", "webReaderLink", "epub", "Lcom/tuxdev/booksaac/model/Epub;", "publicDomain", "", "quoteSharingAllowed", "embeddable", "textToSpeechPermission", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tuxdev/booksaac/model/Pdf;Ljava/lang/String;Lcom/tuxdev/booksaac/model/Epub;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V", "getAccessViewStatus", "()Ljava/lang/String;", "getCountry", "getEmbeddable", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getEpub", "()Lcom/tuxdev/booksaac/model/Epub;", "getPdf", "()Lcom/tuxdev/booksaac/model/Pdf;", "getPublicDomain", "getQuoteSharingAllowed", "getTextToSpeechPermission", "getViewability", "getWebReaderLink", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tuxdev/booksaac/model/Pdf;Ljava/lang/String;Lcom/tuxdev/booksaac/model/Epub;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/tuxdev/booksaac/model/AccessInfo;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "flags", "Companion", "app_debug"})
public final class AccessInfo implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String accessViewStatus = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String country = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String viewability = null;
    @org.jetbrains.annotations.Nullable()
    private final com.tuxdev.booksaac.model.Pdf pdf = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String webReaderLink = null;
    @org.jetbrains.annotations.Nullable()
    private final com.tuxdev.booksaac.model.Epub epub = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean publicDomain = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean quoteSharingAllowed = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean embeddable = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String textToSpeechPermission = null;
    @org.jetbrains.annotations.NotNull()
    public static final android.os.Parcelable.Creator<com.tuxdev.booksaac.model.AccessInfo> CREATOR = null;
    public static final com.tuxdev.booksaac.model.AccessInfo.Companion Companion = null;
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel dest, int flags) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAccessViewStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCountry() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getViewability() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tuxdev.booksaac.model.Pdf getPdf() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getWebReaderLink() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tuxdev.booksaac.model.Epub getEpub() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getPublicDomain() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getQuoteSharingAllowed() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getEmbeddable() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTextToSpeechPermission() {
        return null;
    }
    
    public AccessInfo(@org.jetbrains.annotations.Nullable()
    java.lang.String accessViewStatus, @org.jetbrains.annotations.Nullable()
    java.lang.String country, @org.jetbrains.annotations.Nullable()
    java.lang.String viewability, @org.jetbrains.annotations.Nullable()
    com.tuxdev.booksaac.model.Pdf pdf, @org.jetbrains.annotations.Nullable()
    java.lang.String webReaderLink, @org.jetbrains.annotations.Nullable()
    com.tuxdev.booksaac.model.Epub epub, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean publicDomain, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean quoteSharingAllowed, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean embeddable, @org.jetbrains.annotations.Nullable()
    java.lang.String textToSpeechPermission) {
        super();
    }
    
    public AccessInfo() {
        super();
    }
    
    public AccessInfo(@org.jetbrains.annotations.NotNull()
    android.os.Parcel source) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tuxdev.booksaac.model.Pdf component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tuxdev.booksaac.model.Epub component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tuxdev.booksaac.model.AccessInfo copy(@org.jetbrains.annotations.Nullable()
    java.lang.String accessViewStatus, @org.jetbrains.annotations.Nullable()
    java.lang.String country, @org.jetbrains.annotations.Nullable()
    java.lang.String viewability, @org.jetbrains.annotations.Nullable()
    com.tuxdev.booksaac.model.Pdf pdf, @org.jetbrains.annotations.Nullable()
    java.lang.String webReaderLink, @org.jetbrains.annotations.Nullable()
    com.tuxdev.booksaac.model.Epub epub, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean publicDomain, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean quoteSharingAllowed, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean embeddable, @org.jetbrains.annotations.Nullable()
    java.lang.String textToSpeechPermission) {
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
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/tuxdev/booksaac/model/AccessInfo$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/tuxdev/booksaac/model/AccessInfo;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}