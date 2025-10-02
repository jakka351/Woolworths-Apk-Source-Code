package com.woolworths.scanlibrary.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.woolworths.scanlibrary.util.widget.PriceView;
import com.woolworths.scanlibrary.util.widget.ProductImageView;

/* loaded from: classes7.dex */
public abstract class ViewCartSimpleItemBinding extends ViewDataBinding {
    public static final /* synthetic */ int D = 0;
    public final TextView A;
    public final PriceView B;
    public final TextView C;
    public final ProductImageView y;
    public final ImageView z;

    public ViewCartSimpleItemBinding(DataBindingComponent dataBindingComponent, View view, ProductImageView productImageView, ImageView imageView, TextView textView, PriceView priceView, TextView textView2) {
        super(dataBindingComponent, view, 0);
        this.y = productImageView;
        this.z = imageView;
        this.A = textView;
        this.B = priceView;
        this.C = textView2;
    }
}
