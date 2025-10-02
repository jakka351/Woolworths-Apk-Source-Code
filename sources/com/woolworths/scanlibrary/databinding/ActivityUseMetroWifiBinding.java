package com.woolworths.scanlibrary.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes7.dex */
public abstract class ActivityUseMetroWifiBinding extends ViewDataBinding {
    public final Button A;
    public final TextView B;
    public final LayoutDarkToolbarBinding y;
    public final Button z;

    public ActivityUseMetroWifiBinding(DataBindingComponent dataBindingComponent, View view, LayoutDarkToolbarBinding layoutDarkToolbarBinding, Button button, Button button2, TextView textView) {
        super(dataBindingComponent, view, 1);
        this.y = layoutDarkToolbarBinding;
        this.z = button;
        this.A = button2;
        this.B = textView;
    }
}
