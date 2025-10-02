package com.woolworths.scanlibrary.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes7.dex */
public abstract class CustomPaymentInstrumentViewBinding extends ViewDataBinding {
    public static final /* synthetic */ int E = 0;
    public final ImageView A;
    public final TextView B;
    public final ImageView C;
    public final RadioButton D;
    public final TextView y;
    public final ImageView z;

    public CustomPaymentInstrumentViewBinding(DataBindingComponent dataBindingComponent, View view, TextView textView, ImageView imageView, ImageView imageView2, TextView textView2, ImageView imageView3, RadioButton radioButton) {
        super(dataBindingComponent, view, 0);
        this.y = textView;
        this.z = imageView;
        this.A = imageView2;
        this.B = textView2;
        this.C = imageView3;
        this.D = radioButton;
    }
}
