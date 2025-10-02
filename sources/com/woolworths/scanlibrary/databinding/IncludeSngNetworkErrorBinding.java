package com.woolworths.scanlibrary.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler;

/* loaded from: classes7.dex */
public abstract class IncludeSngNetworkErrorBinding extends ViewDataBinding {
    public Boolean A;
    public FullPageErrorStateClickHandler B;
    public final Button y;
    public final TextView z;

    public IncludeSngNetworkErrorBinding(View view, Button button, TextView textView, DataBindingComponent dataBindingComponent) {
        super(dataBindingComponent, view, 0);
        this.y = button;
        this.z = textView;
    }

    public abstract void L(FullPageErrorStateClickHandler fullPageErrorStateClickHandler);

    public abstract void M(Boolean bool);
}
