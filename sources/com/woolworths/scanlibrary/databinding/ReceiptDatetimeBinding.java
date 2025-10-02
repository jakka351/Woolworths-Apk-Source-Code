package com.woolworths.scanlibrary.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes7.dex */
public abstract class ReceiptDatetimeBinding extends ViewDataBinding {
    public static final /* synthetic */ int A = 0;
    public final View y;
    public final TextView z;

    public ReceiptDatetimeBinding(DataBindingComponent dataBindingComponent, View view, View view2, TextView textView, TextView textView2) {
        super(dataBindingComponent, view, 0);
        this.y = view2;
        this.z = textView;
    }
}
