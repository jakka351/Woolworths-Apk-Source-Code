package com.woolworths.scanlibrary.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.woolworths.scanlibrary.models.product.Item;
import com.woolworths.scanlibrary.util.widget.PriceView;
import com.woolworths.scanlibrary.util.widget.ProductBadgeView;
import com.woolworths.scanlibrary.util.widget.SquareImageView;

/* loaded from: classes7.dex */
public abstract class ViewWeightRequiredProductInfoBinding extends ViewDataBinding {
    public final ImageView A;
    public final PriceView B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public Item F;
    public final ProductBadgeView y;
    public final SquareImageView z;

    public ViewWeightRequiredProductInfoBinding(DataBindingComponent dataBindingComponent, View view, ProductBadgeView productBadgeView, SquareImageView squareImageView, ImageView imageView, PriceView priceView, TextView textView, TextView textView2, TextView textView3) {
        super(dataBindingComponent, view, 0);
        this.y = productBadgeView;
        this.z = squareImageView;
        this.A = imageView;
        this.B = priceView;
        this.C = textView;
        this.D = textView2;
        this.E = textView3;
    }

    public abstract void L(Item item);
}
