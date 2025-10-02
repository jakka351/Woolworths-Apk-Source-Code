package com.woolworths.scanlibrary.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes7.dex */
public abstract class DialogScanResultViewBinding extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public final ImageView y;
    public final Button z;

    public DialogScanResultViewBinding(View view, Button button, ImageView imageView, TextView textView, TextView textView2, DataBindingComponent dataBindingComponent) {
        super(dataBindingComponent, view, 0);
        this.y = imageView;
        this.z = button;
        this.A = textView;
        this.B = textView2;
    }
}
