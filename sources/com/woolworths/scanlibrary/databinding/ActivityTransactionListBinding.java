package com.woolworths.scanlibrary.databinding;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes7.dex */
public abstract class ActivityTransactionListBinding extends ViewDataBinding {
    public final RecyclerView A;
    public final RelativeLayout y;
    public final LayoutDarkToolbarBinding z;

    public ActivityTransactionListBinding(DataBindingComponent dataBindingComponent, View view, RelativeLayout relativeLayout, LayoutDarkToolbarBinding layoutDarkToolbarBinding, RecyclerView recyclerView) {
        super(dataBindingComponent, view, 1);
        this.y = relativeLayout;
        this.z = layoutDarkToolbarBinding;
        this.A = recyclerView;
    }
}
