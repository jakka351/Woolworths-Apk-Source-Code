package com.woolworths.scanlibrary.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.woolworths.scanlibrary.models.product.Item;
import com.woolworths.scanlibrary.util.widget.PriceView;
import com.woolworths.scanlibrary.util.widget.SquareImageView;

/* loaded from: classes7.dex */
public abstract class ItemSearchResultSngBinding extends ViewDataBinding {
    public final TextView A;
    public final ConstraintLayout B;
    public final TextView C;
    public Item D;
    public final PriceView y;
    public final SquareImageView z;

    public ItemSearchResultSngBinding(DataBindingComponent dataBindingComponent, View view, PriceView priceView, SquareImageView squareImageView, TextView textView, ConstraintLayout constraintLayout, TextView textView2) {
        super(dataBindingComponent, view, 0);
        this.y = priceView;
        this.z = squareImageView;
        this.A = textView;
        this.B = constraintLayout;
        this.C = textView2;
    }
}
