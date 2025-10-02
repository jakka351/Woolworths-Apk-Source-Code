package com.woolworths.scanlibrary.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes7.dex */
public abstract class CustomViewImageListBinding extends ViewDataBinding {
    public static final /* synthetic */ int A = 0;
    public final RecyclerView y;
    public final TextView z;

    public CustomViewImageListBinding(DataBindingComponent dataBindingComponent, View view, RecyclerView recyclerView, TextView textView) {
        super(dataBindingComponent, view, 0);
        this.y = recyclerView;
        this.z = textView;
    }
}
