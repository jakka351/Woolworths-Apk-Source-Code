package com.woolworths.scanlibrary.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes7.dex */
public abstract class LayoutToolbarBinding extends ViewDataBinding {
    public final Toolbar y;
    public final TextView z;

    public LayoutToolbarBinding(DataBindingComponent dataBindingComponent, View view, Toolbar toolbar, TextView textView) {
        super(dataBindingComponent, view, 0);
        this.y = toolbar;
        this.z = textView;
    }
}
