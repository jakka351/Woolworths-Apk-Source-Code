package com.woolworths.scanlibrary.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.foundation.barcode.ui.BarcodeView;

/* loaded from: classes7.dex */
public abstract class ReceiptPosbarcodeBinding extends ViewDataBinding {
    public static final /* synthetic */ int E = 0;
    public final TextView A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public final BarcodeView y;
    public final TextView z;

    public ReceiptPosbarcodeBinding(DataBindingComponent dataBindingComponent, View view, BarcodeView barcodeView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        super(dataBindingComponent, view, 0);
        this.y = barcodeView;
        this.z = textView;
        this.A = textView2;
        this.B = textView3;
        this.C = textView4;
        this.D = textView5;
    }
}
