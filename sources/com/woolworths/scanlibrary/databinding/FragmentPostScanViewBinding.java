package com.woolworths.scanlibrary.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes7.dex */
public abstract class FragmentPostScanViewBinding extends ViewDataBinding {
    public static final /* synthetic */ int C = 0;
    public final RelativeLayout A;
    public final CoordinatorLayout B;
    public final Button y;
    public final Button z;

    public FragmentPostScanViewBinding(DataBindingComponent dataBindingComponent, View view, Button button, Button button2, RelativeLayout relativeLayout, CoordinatorLayout coordinatorLayout) {
        super(dataBindingComponent, view, 0);
        this.y = button;
        this.z = button2;
        this.A = relativeLayout;
        this.B = coordinatorLayout;
    }
}
