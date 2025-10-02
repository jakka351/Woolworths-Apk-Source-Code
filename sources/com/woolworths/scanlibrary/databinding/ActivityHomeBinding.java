package com.woolworths.scanlibrary.databinding;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.drawerlayout.widget.DrawerLayout;

/* loaded from: classes7.dex */
public abstract class ActivityHomeBinding extends ViewDataBinding {
    public final LayoutToolbarBinding A;
    public final RelativeLayout B;
    public final DrawerLayout C;
    public final View D;
    public final FrameLayout y;
    public final LayoutNavigationDrawerBinding z;

    public ActivityHomeBinding(DataBindingComponent dataBindingComponent, View view, FrameLayout frameLayout, LayoutNavigationDrawerBinding layoutNavigationDrawerBinding, LayoutToolbarBinding layoutToolbarBinding, RelativeLayout relativeLayout, DrawerLayout drawerLayout, View view2) {
        super(dataBindingComponent, view, 2);
        this.y = frameLayout;
        this.z = layoutNavigationDrawerBinding;
        this.A = layoutToolbarBinding;
        this.B = relativeLayout;
        this.C = drawerLayout;
        this.D = view2;
    }
}
