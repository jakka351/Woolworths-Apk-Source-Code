package com.woolworths.scanlibrary.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.foundation.barcode.ui.BarcodeView;

/* loaded from: classes7.dex */
public abstract class ReceiptParkingVoucherBinding extends ViewDataBinding {
    public static final /* synthetic */ int B = 0;
    public final TextView A;
    public final BarcodeView y;
    public final ConstraintLayout z;

    public ReceiptParkingVoucherBinding(DataBindingComponent dataBindingComponent, View view, BarcodeView barcodeView, ConstraintLayout constraintLayout, TextView textView) {
        super(dataBindingComponent, view, 0);
        this.y = barcodeView;
        this.z = constraintLayout;
        this.A = textView;
    }
}
