package com.woolworths.scanlibrary.databinding;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes7.dex */
public abstract class NetworkStateItemBinding extends ViewDataBinding {
    public final TextView A;
    public final TextView y;
    public final ProgressBar z;

    public NetworkStateItemBinding(View view, ProgressBar progressBar, TextView textView, TextView textView2, DataBindingComponent dataBindingComponent) {
        super(dataBindingComponent, view, 0);
        this.y = textView;
        this.z = progressBar;
        this.A = textView2;
    }
}
