package com.woolworths.scanlibrary.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes7.dex */
public abstract class ContentWeightedArticleSelectionBinding extends ViewDataBinding {
    public final RecyclerView A;
    public final CoordinatorLayout B;
    public final TextView C;
    public final Button y;
    public final LinearLayout z;

    public ContentWeightedArticleSelectionBinding(DataBindingComponent dataBindingComponent, View view, Button button, LinearLayout linearLayout, RecyclerView recyclerView, CoordinatorLayout coordinatorLayout, TextView textView) {
        super(dataBindingComponent, view, 0);
        this.y = button;
        this.z = linearLayout;
        this.A = recyclerView;
        this.B = coordinatorLayout;
        this.C = textView;
    }
}
