package com.woolworths.scanlibrary.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes7.dex */
public abstract class FragmentHomeBinding extends ViewDataBinding {
    public static final /* synthetic */ int D = 0;
    public final AppCompatTextView A;
    public final CoordinatorLayout B;
    public final TextView C;
    public final Button y;
    public final Button z;

    public FragmentHomeBinding(DataBindingComponent dataBindingComponent, View view, Button button, Button button2, AppCompatTextView appCompatTextView, CoordinatorLayout coordinatorLayout, TextView textView) {
        super(dataBindingComponent, view, 0);
        this.y = button;
        this.z = button2;
        this.A = appCompatTextView;
        this.B = coordinatorLayout;
        this.C = textView;
    }
}
