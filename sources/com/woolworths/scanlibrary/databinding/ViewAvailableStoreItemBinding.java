package com.woolworths.scanlibrary.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.woolworths.scanlibrary.models.store.Store;

/* loaded from: classes7.dex */
public abstract class ViewAvailableStoreItemBinding extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public Store C;
    public final ConstraintLayout y;
    public final TextView z;

    public ViewAvailableStoreItemBinding(DataBindingComponent dataBindingComponent, View view, ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3) {
        super(dataBindingComponent, view, 0);
        this.y = constraintLayout;
        this.z = textView;
        this.A = textView2;
        this.B = textView3;
    }
}
