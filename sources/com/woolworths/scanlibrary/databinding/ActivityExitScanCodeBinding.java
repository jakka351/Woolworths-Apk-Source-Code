package com.woolworths.scanlibrary.databinding;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.foundation.barcode.ui.BarcodeView;
import com.woolworths.scanlibrary.ui.exit.ExitScanCodeViewModel;

/* loaded from: classes7.dex */
public abstract class ActivityExitScanCodeBinding extends ViewDataBinding {
    public final FrameLayout A;
    public final ConstraintLayout B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public ExitScanCodeViewModel F;
    public final TextView y;
    public final BarcodeView z;

    public ActivityExitScanCodeBinding(DataBindingComponent dataBindingComponent, View view, TextView textView, BarcodeView barcodeView, FrameLayout frameLayout, ConstraintLayout constraintLayout, TextView textView2, TextView textView3, TextView textView4) {
        super(dataBindingComponent, view, 5);
        this.y = textView;
        this.z = barcodeView;
        this.A = frameLayout;
        this.B = constraintLayout;
        this.C = textView2;
        this.D = textView3;
        this.E = textView4;
    }

    public abstract void L(ExitScanCodeViewModel exitScanCodeViewModel);
}
