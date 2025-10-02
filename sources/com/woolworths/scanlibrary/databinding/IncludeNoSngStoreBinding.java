package com.woolworths.scanlibrary.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes7.dex */
public abstract class IncludeNoSngStoreBinding extends ViewDataBinding {
    public final TextView y;
    public Boolean z;

    public IncludeNoSngStoreBinding(DataBindingComponent dataBindingComponent, View view, TextView textView) {
        super(dataBindingComponent, view, 0);
        this.y = textView;
    }

    public abstract void L(Boolean bool);
}
