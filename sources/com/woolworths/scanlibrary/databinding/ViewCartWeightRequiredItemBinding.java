package com.woolworths.scanlibrary.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.woolworths.scanlibrary.util.widget.PriceView;
import com.woolworths.scanlibrary.util.widget.ProductImageView;

/* loaded from: classes7.dex */
public abstract class ViewCartWeightRequiredItemBinding extends ViewDataBinding {
    public static final /* synthetic */ int C = 0;
    public final PriceView A;
    public final TextView B;
    public final ProductImageView y;
    public final ImageView z;

    public ViewCartWeightRequiredItemBinding(DataBindingComponent dataBindingComponent, View view, ProductImageView productImageView, ImageView imageView, PriceView priceView, TextView textView) {
        super(dataBindingComponent, view, 0);
        this.y = productImageView;
        this.z = imageView;
        this.A = priceView;
        this.B = textView;
    }
}
