package com.woolworths.scanlibrary.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.woolworths.scanlibrary.models.product.Item;
import com.woolworths.scanlibrary.util.widget.PriceView;
import com.woolworths.scanlibrary.util.widget.ProductBadgeView;
import com.woolworths.scanlibrary.util.widget.SquareImageView;

/* loaded from: classes7.dex */
public abstract class ViewSimpleProductInfoBinding extends ViewDataBinding {
    public final ImageView A;
    public final PriceView B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public final TextView F;
    public final ConstraintLayout G;
    public final TextView H;
    public final TextView I;
    public Item J;
    public Boolean K;
    public final ProductBadgeView y;
    public final SquareImageView z;

    public ViewSimpleProductInfoBinding(DataBindingComponent dataBindingComponent, View view, ProductBadgeView productBadgeView, SquareImageView squareImageView, ImageView imageView, PriceView priceView, TextView textView, TextView textView2, TextView textView3, TextView textView4, ConstraintLayout constraintLayout, TextView textView5, TextView textView6) {
        super(dataBindingComponent, view, 0);
        this.y = productBadgeView;
        this.z = squareImageView;
        this.A = imageView;
        this.B = priceView;
        this.C = textView;
        this.D = textView2;
        this.E = textView3;
        this.F = textView4;
        this.G = constraintLayout;
        this.H = textView5;
        this.I = textView6;
    }

    public abstract void L(Boolean bool);

    public abstract void M(Item item);
}
