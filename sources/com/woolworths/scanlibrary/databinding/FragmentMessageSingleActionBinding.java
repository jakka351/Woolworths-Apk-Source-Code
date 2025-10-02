package com.woolworths.scanlibrary.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes7.dex */
public abstract class FragmentMessageSingleActionBinding extends ViewDataBinding {
    public static final /* synthetic */ int D = 0;
    public final ConstraintLayout A;
    public final TextView B;
    public final TextView C;
    public final Button y;
    public final ImageView z;

    public FragmentMessageSingleActionBinding(DataBindingComponent dataBindingComponent, View view, Button button, ImageView imageView, ConstraintLayout constraintLayout, TextView textView, TextView textView2) {
        super(dataBindingComponent, view, 0);
        this.y = button;
        this.z = imageView;
        this.A = constraintLayout;
        this.B = textView;
        this.C = textView2;
    }
}
