package com.woolworths.scanlibrary.databinding;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes7.dex */
public abstract class ViewAddcardErrorBinding extends ViewDataBinding {
    public String A;
    public Boolean B;
    public final LinearLayout y;
    public final TextView z;

    public ViewAddcardErrorBinding(View view, LinearLayout linearLayout, TextView textView, DataBindingComponent dataBindingComponent) {
        super(dataBindingComponent, view, 0);
        this.y = linearLayout;
        this.z = textView;
    }

    public abstract void L(String str);

    public abstract void M(Boolean bool);
}
