package com.woolworths.scanlibrary.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.navigation.NavigationView;

/* loaded from: classes7.dex */
public abstract class LayoutNavigationDrawerBinding extends ViewDataBinding {
    public final NavigationView A;
    public final TextView y;
    public final TextView z;

    public LayoutNavigationDrawerBinding(DataBindingComponent dataBindingComponent, View view, TextView textView, TextView textView2, NavigationView navigationView) {
        super(dataBindingComponent, view, 0);
        this.y = textView;
        this.z = textView2;
        this.A = navigationView;
    }
}
