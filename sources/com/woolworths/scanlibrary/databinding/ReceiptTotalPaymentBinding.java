package com.woolworths.scanlibrary.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes7.dex */
public abstract class ReceiptTotalPaymentBinding extends ViewDataBinding {
    public static final /* synthetic */ int D = 0;
    public final TextView A;
    public final TextView B;
    public final TextView C;
    public final TextView y;
    public final TextView z;

    public ReceiptTotalPaymentBinding(DataBindingComponent dataBindingComponent, View view, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        super(dataBindingComponent, view, 0);
        this.y = textView;
        this.z = textView2;
        this.A = textView3;
        this.B = textView4;
        this.C = textView5;
    }
}
