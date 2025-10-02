package com.woolworths.scanlibrary.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.woolworths.scanlibrary.ui.stores.AvailableStoreViewModel;

/* loaded from: classes7.dex */
public abstract class ActivityAvailableStoresBinding extends ViewDataBinding {
    public final ImageView A;
    public final LayoutDarkToolbarBinding B;
    public final ConstraintLayout C;
    public final TextView D;
    public AvailableStoreViewModel E;
    public final RecyclerView y;
    public final RecyclerView z;

    public ActivityAvailableStoresBinding(DataBindingComponent dataBindingComponent, View view, RecyclerView recyclerView, RecyclerView recyclerView2, ImageView imageView, LayoutDarkToolbarBinding layoutDarkToolbarBinding, ConstraintLayout constraintLayout, TextView textView) {
        super(dataBindingComponent, view, 1);
        this.y = recyclerView;
        this.z = recyclerView2;
        this.A = imageView;
        this.B = layoutDarkToolbarBinding;
        this.C = constraintLayout;
        this.D = textView;
    }

    public abstract void L(AvailableStoreViewModel availableStoreViewModel);
}
