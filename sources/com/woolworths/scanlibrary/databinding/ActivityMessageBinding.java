package com.woolworths.scanlibrary.databinding;

import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes7.dex */
public abstract class ActivityMessageBinding extends ViewDataBinding {
    public final FrameLayout y;
    public final LayoutWowToolbarBinding z;

    public ActivityMessageBinding(DataBindingComponent dataBindingComponent, View view, FrameLayout frameLayout, LayoutWowToolbarBinding layoutWowToolbarBinding) {
        super(dataBindingComponent, view, 1);
        this.y = frameLayout;
        this.z = layoutWowToolbarBinding;
    }
}
