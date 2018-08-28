package com.tuxdev.booksaac.databinding;
import com.tuxdev.booksaac.R;
import com.tuxdev.booksaac.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityBooksBindingImpl extends ActivityBooksBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.appBar, 4);
        sViewsWithIds.put(R.id.toolbar, 5);
    }
    // views
    @NonNull
    private final android.support.constraint.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityBooksBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ActivityBooksBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (android.support.design.widget.AppBarLayout) bindings[4]
            , (android.widget.ProgressBar) bindings[3]
            , (android.support.v7.widget.RecyclerView) bindings[1]
            , (android.support.v7.widget.Toolbar) bindings[5]
            , (android.widget.TextView) bindings[2]
            );
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.pbProgress.setTag(null);
        this.rvBooks.setTag(null);
        this.tvNoData.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
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
        if (BR.viewModelBooks == variableId) {
            setViewModelBooks((com.tuxdev.booksaac.ui.books.BooksViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModelBooks(@Nullable com.tuxdev.booksaac.ui.books.BooksViewModel ViewModelBooks) {
        this.mViewModelBooks = ViewModelBooks;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.viewModelBooks);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelBooksLoadingVisibility((android.arch.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewModelBooksRvVisibility((android.arch.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeViewModelBooksNoDataMessage((android.arch.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewModelBooksNoDataVisibility((android.arch.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelBooksLoadingVisibility(android.arch.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelBooksLoadingVisibility, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelBooksRvVisibility(android.arch.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelBooksRvVisibility, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelBooksNoDataMessage(android.arch.lifecycle.MutableLiveData<java.lang.String> ViewModelBooksNoDataMessage, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelBooksNoDataVisibility(android.arch.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelBooksNoDataVisibility, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
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
        com.tuxdev.booksaac.ui.books.BooksViewModel viewModelBooks = mViewModelBooks;
        com.tuxdev.booksaac.ui.books.BooksAdapter viewModelBooksBooksAdapter = null;
        android.arch.lifecycle.MutableLiveData<java.lang.Boolean> viewModelBooksLoadingVisibility = null;
        boolean androidDatabindingViewDataBindingSafeUnboxViewModelBooksRvVisibilityGetValue = false;
        java.lang.Boolean viewModelBooksLoadingVisibilityGetValue = null;
        android.arch.lifecycle.MutableLiveData<java.lang.Boolean> viewModelBooksRvVisibility = null;
        android.arch.lifecycle.MutableLiveData<java.lang.String> viewModelBooksNoDataMessage = null;
        java.lang.Boolean viewModelBooksNoDataVisibilityGetValue = null;
        java.lang.Boolean viewModelBooksRvVisibilityGetValue = null;
        boolean androidDatabindingViewDataBindingSafeUnboxViewModelBooksLoadingVisibilityGetValue = false;
        java.lang.String viewModelBooksNoDataMessageGetValue = null;
        android.arch.lifecycle.MutableLiveData<java.lang.Boolean> viewModelBooksNoDataVisibility = null;
        boolean androidDatabindingViewDataBindingSafeUnboxViewModelBooksNoDataVisibilityGetValue = false;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x30L) != 0) {

                    if (viewModelBooks != null) {
                        // read viewModelBooks.booksAdapter
                        viewModelBooksBooksAdapter = viewModelBooks.getBooksAdapter();
                    }
            }
            if ((dirtyFlags & 0x31L) != 0) {

                    if (viewModelBooks != null) {
                        // read viewModelBooks.loadingVisibility
                        viewModelBooksLoadingVisibility = viewModelBooks.getLoadingVisibility();
                    }
                    updateLiveDataRegistration(0, viewModelBooksLoadingVisibility);


                    if (viewModelBooksLoadingVisibility != null) {
                        // read viewModelBooks.loadingVisibility.getValue()
                        viewModelBooksLoadingVisibilityGetValue = viewModelBooksLoadingVisibility.getValue();
                    }


                    // read android.databinding.ViewDataBinding.safeUnbox(viewModelBooks.loadingVisibility.getValue())
                    androidDatabindingViewDataBindingSafeUnboxViewModelBooksLoadingVisibilityGetValue = android.databinding.ViewDataBinding.safeUnbox(viewModelBooksLoadingVisibilityGetValue);
            }
            if ((dirtyFlags & 0x32L) != 0) {

                    if (viewModelBooks != null) {
                        // read viewModelBooks.rvVisibility
                        viewModelBooksRvVisibility = viewModelBooks.getRvVisibility();
                    }
                    updateLiveDataRegistration(1, viewModelBooksRvVisibility);


                    if (viewModelBooksRvVisibility != null) {
                        // read viewModelBooks.rvVisibility.getValue()
                        viewModelBooksRvVisibilityGetValue = viewModelBooksRvVisibility.getValue();
                    }


                    // read android.databinding.ViewDataBinding.safeUnbox(viewModelBooks.rvVisibility.getValue())
                    androidDatabindingViewDataBindingSafeUnboxViewModelBooksRvVisibilityGetValue = android.databinding.ViewDataBinding.safeUnbox(viewModelBooksRvVisibilityGetValue);
            }
            if ((dirtyFlags & 0x34L) != 0) {

                    if (viewModelBooks != null) {
                        // read viewModelBooks.noDataMessage
                        viewModelBooksNoDataMessage = viewModelBooks.getNoDataMessage();
                    }
                    updateLiveDataRegistration(2, viewModelBooksNoDataMessage);


                    if (viewModelBooksNoDataMessage != null) {
                        // read viewModelBooks.noDataMessage.getValue()
                        viewModelBooksNoDataMessageGetValue = viewModelBooksNoDataMessage.getValue();
                    }
            }
            if ((dirtyFlags & 0x38L) != 0) {

                    if (viewModelBooks != null) {
                        // read viewModelBooks.noDataVisibility
                        viewModelBooksNoDataVisibility = viewModelBooks.getNoDataVisibility();
                    }
                    updateLiveDataRegistration(3, viewModelBooksNoDataVisibility);


                    if (viewModelBooksNoDataVisibility != null) {
                        // read viewModelBooks.noDataVisibility.getValue()
                        viewModelBooksNoDataVisibilityGetValue = viewModelBooksNoDataVisibility.getValue();
                    }


                    // read android.databinding.ViewDataBinding.safeUnbox(viewModelBooks.noDataVisibility.getValue())
                    androidDatabindingViewDataBindingSafeUnboxViewModelBooksNoDataVisibilityGetValue = android.databinding.ViewDataBinding.safeUnbox(viewModelBooksNoDataVisibilityGetValue);
            }
        }
        // batch finished
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            com.tuxdev.booksaac.utils.BindingAdaptersKt.mutableVisibility(this.pbProgress, androidDatabindingViewDataBindingSafeUnboxViewModelBooksLoadingVisibilityGetValue);
        }
        if ((dirtyFlags & 0x30L) != 0) {
            // api target 1

            com.tuxdev.booksaac.utils.BindingAdaptersKt.mutableRvAdapter(this.rvBooks, viewModelBooksBooksAdapter);
        }
        if ((dirtyFlags & 0x32L) != 0) {
            // api target 1

            com.tuxdev.booksaac.utils.BindingAdaptersKt.mutableVisibility(this.rvBooks, androidDatabindingViewDataBindingSafeUnboxViewModelBooksRvVisibilityGetValue);
        }
        if ((dirtyFlags & 0x34L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvNoData, viewModelBooksNoDataMessageGetValue);
        }
        if ((dirtyFlags & 0x38L) != 0) {
            // api target 1

            com.tuxdev.booksaac.utils.BindingAdaptersKt.mutableVisibility(this.tvNoData, androidDatabindingViewDataBindingSafeUnboxViewModelBooksNoDataVisibilityGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModelBooks.loadingVisibility
        flag 1 (0x2L): viewModelBooks.rvVisibility
        flag 2 (0x3L): viewModelBooks.noDataMessage
        flag 3 (0x4L): viewModelBooks.noDataVisibility
        flag 4 (0x5L): viewModelBooks
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}