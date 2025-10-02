package com.woolworths.scanlibrary.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.woolworths.scanlibrary.models.product.Item;
import com.woolworths.scanlibrary.util.widget.PriceView;
import com.woolworths.scanlibrary.util.widget.ProductBadgeView;
import com.woolworths.scanlibrary.util.widget.SquareImageView;

/* loaded from: classes7.dex */
public abstract class ViewInterventionProductInfoBinding extends ViewDataBinding {
    public final PriceView A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public final TextView F;
    public Item G;
    public Boolean H;
    public final ProductBadgeView y;
    public final SquareImageView z;

    public ViewInterventionProductInfoBinding(DataBindingComponent dataBindingComponent, View view, ProductBadgeView productBadgeView, SquareImageView squareImageView, PriceView priceView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        super(dataBindingComponent, view, 0);
        this.y = productBadgeView;
        this.z = squareImageView;
        this.A = priceView;
        this.B = textView;
        this.C = textView2;
        this.D = textView3;
        this.E = textView4;
        this.F = textView5;
    }

    public abstract void L(Boolean bool);

    public abstract void M(Item item);
}
