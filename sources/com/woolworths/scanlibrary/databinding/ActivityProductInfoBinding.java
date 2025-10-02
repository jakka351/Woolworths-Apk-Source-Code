package com.woolworths.scanlibrary.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes7.dex */
public abstract class ActivityProductInfoBinding extends ViewDataBinding {
    public final FrameLayout A;
    public final LayoutDarkToolbarBinding B;
    public final Button y;
    public final CoordinatorLayout z;

    public ActivityProductInfoBinding(DataBindingComponent dataBindingComponent, View view, Button button, CoordinatorLayout coordinatorLayout, FrameLayout frameLayout, LayoutDarkToolbarBinding layoutDarkToolbarBinding) {
        super(dataBindingComponent, view, 1);
        this.y = button;
        this.z = coordinatorLayout;
        this.A = frameLayout;
        this.B = layoutDarkToolbarBinding;
    }
}
