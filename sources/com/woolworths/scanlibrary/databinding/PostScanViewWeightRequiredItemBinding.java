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
public abstract class PostScanViewWeightRequiredItemBinding extends ViewDataBinding {
    public final ImageView A;
    public final TextView B;
    public final TextView C;
    public final PriceView D;
    public final TextView E;
    public final TextView F;
    public Item G;
    public final ConstraintLayout y;
    public final SquareImageView z;

    public PostScanViewWeightRequiredItemBinding(DataBindingComponent dataBindingComponent, View view, ConstraintLayout constraintLayout, SquareImageView squareImageView, ImageView imageView, TextView textView, TextView textView2, PriceView priceView, TextView textView3, TextView textView4) {
        super(dataBindingComponent, view, 0);
        this.y = constraintLayout;
        this.z = squareImageView;
        this.A = imageView;
        this.B = textView;
        this.C = textView2;
        this.D = priceView;
        this.E = textView3;
        this.F = textView4;
    }

    public abstract void L(Item item);
}
