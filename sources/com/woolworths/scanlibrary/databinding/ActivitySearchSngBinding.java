package com.woolworths.scanlibrary.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.woolworths.scanlibrary.util.widget.ProductSearchView;

/* loaded from: classes7.dex */
public abstract class ActivitySearchSngBinding extends ViewDataBinding {
    public final TextView A;
    public final ConstraintLayout B;
    public final ProductSearchView C;
    public final RecyclerView D;
    public final Toolbar E;
    public final TextView F;
    public final ImageView y;
    public final ImageView z;

    public ActivitySearchSngBinding(DataBindingComponent dataBindingComponent, View view, ImageView imageView, ImageView imageView2, TextView textView, ConstraintLayout constraintLayout, ProductSearchView productSearchView, RecyclerView recyclerView, Toolbar toolbar, TextView textView2) {
        super(dataBindingComponent, view, 0);
        this.y = imageView;
        this.z = imageView2;
        this.A = textView;
        this.B = constraintLayout;
        this.C = productSearchView;
        this.D = recyclerView;
        this.E = toolbar;
        this.F = textView2;
    }
}
