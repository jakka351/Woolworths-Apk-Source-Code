package com.woolworths.scanlibrary.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.woolworths.scanlibrary.models.product.Item;
import com.woolworths.scanlibrary.util.widget.PriceView;
import com.woolworths.scanlibrary.util.widget.SquareImageView;

/* loaded from: classes7.dex */
public abstract class PostScanViewWeightedItemBinding extends ViewDataBinding {
    public final ImageView A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public final PriceView F;
    public final TextView G;
    public final TextView H;
    public Item I;
    public Boolean J;
    public final ConstraintLayout y;
    public final SquareImageView z;

    public PostScanViewWeightedItemBinding(DataBindingComponent dataBindingComponent, View view, ConstraintLayout constraintLayout, SquareImageView squareImageView, ImageView imageView, TextView textView, TextView textView2, TextView textView3, TextView textView4, PriceView priceView, TextView textView5, TextView textView6) {
        super(dataBindingComponent, view, 0);
        this.y = constraintLayout;
        this.z = squareImageView;
        this.A = imageView;
        this.B = textView;
        this.C = textView2;
        this.D = textView3;
        this.E = textView4;
        this.F = priceView;
        this.G = textView5;
        this.H = textView6;
    }

    public abstract void L(Boolean bool);

    public abstract void M(Item item);
}
