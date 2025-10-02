package com.woolworths.scanlibrary.databinding;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.drawerlayout.widget.DrawerLayout;

/* loaded from: classes7.dex */
public abstract class ActivityTapOnBinding extends ViewDataBinding {
    public final LayoutNavigationDrawerBinding A;
    public final FrameLayout B;
    public final DrawerLayout C;
    public final Toolbar D;
    public final TextView E;
    public final FrameLayout y;
    public final View z;

    public ActivityTapOnBinding(DataBindingComponent dataBindingComponent, View view, FrameLayout frameLayout, View view2, LayoutNavigationDrawerBinding layoutNavigationDrawerBinding, FrameLayout frameLayout2, DrawerLayout drawerLayout, Toolbar toolbar, TextView textView) {
        super(dataBindingComponent, view, 1);
        this.y = frameLayout;
        this.z = view2;
        this.A = layoutNavigationDrawerBinding;
        this.B = frameLayout2;
        this.C = drawerLayout;
        this.D = toolbar;
        this.E = textView;
    }
}
