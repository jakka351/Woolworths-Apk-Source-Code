package com.woolworths.scanlibrary.databinding;

import android.view.View;
import android.widget.Button;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes7.dex */
public abstract class ActivityReceiptBinding extends ViewDataBinding {
    public final LayoutDarkToolbarBinding A;
    public final Button y;
    public final RecyclerView z;

    public ActivityReceiptBinding(DataBindingComponent dataBindingComponent, View view, Button button, RecyclerView recyclerView, LayoutDarkToolbarBinding layoutDarkToolbarBinding) {
        super(dataBindingComponent, view, 1);
        this.y = button;
        this.z = recyclerView;
        this.A = layoutDarkToolbarBinding;
    }
}
