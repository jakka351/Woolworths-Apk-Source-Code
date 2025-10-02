package com.woolworths.scanlibrary.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.woolworths.scanlibrary.util.widget.PriceView;
import com.woolworths.scanlibrary.util.widget.ProductImageView;

/* loaded from: classes7.dex */
public abstract class ViewCartInterventionRequiredItemBinding extends ViewDataBinding {
    public static final /* synthetic */ int C = 0;
    public final PriceView A;
    public final TextView B;
    public final ProductImageView y;
    public final TextView z;

    public ViewCartInterventionRequiredItemBinding(DataBindingComponent dataBindingComponent, View view, ProductImageView productImageView, TextView textView, PriceView priceView, TextView textView2) {
        super(dataBindingComponent, view, 0);
        this.y = productImageView;
        this.z = textView;
        this.A = priceView;
        this.B = textView2;
    }
}
