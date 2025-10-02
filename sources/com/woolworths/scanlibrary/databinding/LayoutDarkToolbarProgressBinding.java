package com.woolworths.scanlibrary.databinding;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes7.dex */
public abstract class LayoutDarkToolbarProgressBinding extends ViewDataBinding {
    public final Toolbar y;

    public LayoutDarkToolbarProgressBinding(DataBindingComponent dataBindingComponent, View view, Toolbar toolbar) {
        super(dataBindingComponent, view, 0);
        this.y = toolbar;
    }
}
