package com.woolworths.scanlibrary.databinding;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.drawerlayout.widget.DrawerLayout;

/* loaded from: classes7.dex */
public abstract class ActivityShoppingCartBinding extends ViewDataBinding {
    public final LayoutDarkToolbarBinding A;
    public final RelativeLayout B;
    public final DrawerLayout C;
    public final FrameLayout y;
    public final LayoutNavigationDrawerBinding z;

    public ActivityShoppingCartBinding(DataBindingComponent dataBindingComponent, View view, FrameLayout frameLayout, LayoutNavigationDrawerBinding layoutNavigationDrawerBinding, LayoutDarkToolbarBinding layoutDarkToolbarBinding, RelativeLayout relativeLayout, DrawerLayout drawerLayout) {
        super(dataBindingComponent, view, 2);
        this.y = frameLayout;
        this.z = layoutNavigationDrawerBinding;
        this.A = layoutDarkToolbarBinding;
        this.B = relativeLayout;
        this.C = drawerLayout;
    }
}
