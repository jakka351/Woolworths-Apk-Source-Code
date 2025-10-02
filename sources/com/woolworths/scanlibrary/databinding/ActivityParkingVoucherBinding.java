package com.woolworths.scanlibrary.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.foundation.barcode.ui.BarcodeView;

/* loaded from: classes7.dex */
public abstract class ActivityParkingVoucherBinding extends ViewDataBinding {
    public final ConstraintLayout A;
    public final TextView B;
    public final Button y;
    public final BarcodeView z;

    public ActivityParkingVoucherBinding(DataBindingComponent dataBindingComponent, View view, Button button, BarcodeView barcodeView, ConstraintLayout constraintLayout, TextView textView) {
        super(dataBindingComponent, view, 0);
        this.y = button;
        this.z = barcodeView;
        this.A = constraintLayout;
        this.B = textView;
    }
}
