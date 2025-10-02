package com.woolworths.scanlibrary.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.woolworths.scanlibrary.models.product.Item;

/* loaded from: classes7.dex */
public abstract class PostScanViewUnknownItemBinding extends ViewDataBinding {
    public Item A;
    public final TextView y;
    public final TextView z;

    public PostScanViewUnknownItemBinding(DataBindingComponent dataBindingComponent, View view, TextView textView, TextView textView2) {
        super(dataBindingComponent, view, 0);
        this.y = textView;
        this.z = textView2;
    }

    public abstract void L(Item item);
}
