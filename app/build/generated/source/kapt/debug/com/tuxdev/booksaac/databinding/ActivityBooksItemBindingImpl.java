package com.tuxdev.booksaac.databinding;
import com.tuxdev.booksaac.R;
import com.tuxdev.booksaac.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityBooksItemBindingImpl extends ActivityBooksItemBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityBooksItemBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ActivityBooksItemBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.support.v7.widget.CardView) bindings[0]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[2]
            );
        this.cvRootList.setTag(null);
        this.ivThumbBooks.setTag(null);
        this.tvBooksAuthors.setTag(null);
        this.tvBooksDate.setTag(null);
        this.tvBooksPublisher.setTag(null);
        this.tvBooksTitle.setTag(null);
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
        java.lang.String bookVolumeInfoPublishedDate = null;
        com.tuxdev.booksaac.model.ImageLinks bookVolumeInfoImageLinks = null;
        com.tuxdev.booksaac.model.VolumeInfo bookVolumeInfo = null;
        java.util.List<java.lang.String> bookVolumeInfoAuthors = null;
        java.lang.String bookVolumeInfoPublisher = null;
        java.lang.String bookVolumeInfoTitle = null;
        com.tuxdev.booksaac.model.ItemsItem book = mBook;
        java.lang.String bookVolumeInfoImageLinksThumbnail = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (book != null) {
                    // read book.volumeInfo
                    bookVolumeInfo = book.getVolumeInfo();
                }


                if (bookVolumeInfo != null) {
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
                }


                if (bookVolumeInfoImageLinks != null) {
                    // read book.volumeInfo.imageLinks.thumbnail
                    bookVolumeInfoImageLinksThumbnail = bookVolumeInfoImageLinks.getThumbnail();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.tuxdev.booksaac.utils.BindingAdaptersKt.imageAdapter(this.ivThumbBooks, bookVolumeInfoImageLinksThumbnail);
            com.tuxdev.booksaac.utils.BindingAdaptersKt.authorAdapter(this.tvBooksAuthors, bookVolumeInfoAuthors);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvBooksDate, bookVolumeInfoPublishedDate);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvBooksPublisher, bookVolumeInfoPublisher);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvBooksTitle, bookVolumeInfoTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): book
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}