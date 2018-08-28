package com.tuxdev.booksaac.databinding;
import com.tuxdev.booksaac.R;
import com.tuxdev.booksaac.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityBooksDetailsBindingImpl extends ActivityBooksDetailsBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.icl, 8);
        sViewsWithIds.put(R.id.cv_header, 9);
        sViewsWithIds.put(R.id.cv_body, 10);
        sViewsWithIds.put(R.id.cv_footer, 11);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityBooksDetailsBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private ActivityBooksDetailsBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.support.v7.widget.CardView) bindings[10]
            , (android.support.v7.widget.CardView) bindings[11]
            , (android.support.v7.widget.CardView) bindings[9]
            , (android.view.View) bindings[8]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.ivBook.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvAuthors.setTag(null);
        this.tvDescription.setTag(null);
        this.tvPublishDate.setTag(null);
        this.tvPublisher.setTag(null);
        this.tvSubtitle.setTag(null);
        this.tvTitle.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.book == variableId) {
            setBook((com.tuxdev.booksaac.model.ItemsItem) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setBook(@Nullable com.tuxdev.booksaac.model.ItemsItem Book) {
        this.mBook = Book;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.book);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String bookVolumeInfoSubtitle = null;
        java.lang.String bookVolumeInfoPublishedDate = null;
        int bookVolumeInfoSubtitleLength = 0;
        com.tuxdev.booksaac.model.ImageLinks bookVolumeInfoImageLinks = null;
        com.tuxdev.booksaac.model.VolumeInfo bookVolumeInfo = null;
        java.util.List<java.lang.String> bookVolumeInfoAuthors = null;
        int bookVolumeInfoSubtitleLengthInt0ViewVISIBLEViewGONE = 0;
        boolean bookVolumeInfoSubtitleLengthInt0 = false;
        java.lang.String bookVolumeInfoPublisher = null;
        java.lang.String bookVolumeInfoTitle = null;
        java.lang.String bookVolumeInfoDescription = null;
        com.tuxdev.booksaac.model.ItemsItem book = mBook;
        java.lang.String bookVolumeInfoImageLinksThumbnail = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (book != null) {
                    // read book.volumeInfo
                    bookVolumeInfo = book.getVolumeInfo();
                }


                if (bookVolumeInfo != null) {
                    // read book.volumeInfo.subtitle
                    bookVolumeInfoSubtitle = bookVolumeInfo.getSubtitle();
                    // read book.volumeInfo.publishedDate
                    bookVolumeInfoPublishedDate = bookVolumeInfo.getPublishedDate();
                    // read book.volumeInfo.imageLinks
                    bookVolumeInfoImageLinks = bookVolumeInfo.getImageLinks();
                    // read book.volumeInfo.authors
                    bookVolumeInfoAuthors = bookVolumeInfo.getAuthors();
                    // read book.volumeInfo.publisher
                    bookVolumeInfoPublisher = bookVolumeInfo.getPublisher();
                    // read book.volumeInfo.title
                    bookVolumeInfoTitle = bookVolumeInfo.getTitle();
                    // read book.volumeInfo.description
                    bookVolumeInfoDescription = bookVolumeInfo.getDescription();
                }


                if (bookVolumeInfoSubtitle != null) {
                    // read book.volumeInfo.subtitle.length()
                    bookVolumeInfoSubtitleLength = bookVolumeInfoSubtitle.length();
                }
                if (bookVolumeInfoImageLinks != null) {
                    // read book.volumeInfo.imageLinks.thumbnail
                    bookVolumeInfoImageLinksThumbnail = bookVolumeInfoImageLinks.getThumbnail();
                }


                // read book.volumeInfo.subtitle.length() > 0
                bookVolumeInfoSubtitleLengthInt0 = (bookVolumeInfoSubtitleLength) > (0);
            if((dirtyFlags & 0x3L) != 0) {
                if(bookVolumeInfoSubtitleLengthInt0) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }


                // read book.volumeInfo.subtitle.length() > 0 ? View.VISIBLE : View.GONE
                bookVolumeInfoSubtitleLengthInt0ViewVISIBLEViewGONE = ((bookVolumeInfoSubtitleLengthInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.tuxdev.booksaac.utils.BindingAdaptersKt.imageAdapter(this.ivBook, bookVolumeInfoImageLinksThumbnail);
            com.tuxdev.booksaac.utils.BindingAdaptersKt.authorAdapter(this.tvAuthors, bookVolumeInfoAuthors);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvDescription, bookVolumeInfoDescription);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvPublishDate, bookVolumeInfoPublishedDate);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvPublisher, bookVolumeInfoPublisher);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvSubtitle, bookVolumeInfoSubtitle);
            this.tvSubtitle.setVisibility(bookVolumeInfoSubtitleLengthInt0ViewVISIBLEViewGONE);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvTitle, bookVolumeInfoTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): book
        flag 1 (0x2L): null
        flag 2 (0x3L): book.volumeInfo.subtitle.length() > 0 ? View.VISIBLE : View.GONE
        flag 3 (0x4L): book.volumeInfo.subtitle.length() > 0 ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}