package com.woolworths.scanlibrary.databinding;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes7.dex */
public abstract class CustomShoppingListQuickViewBinding extends ViewDataBinding {
    public final ConstraintLayout y;

    public CustomShoppingListQuickViewBinding(DataBindingComponent dataBindingComponent, View view, ConstraintLayout constraintLayout) {
        super(dataBindingComponent, view, 0);
        this.y = constraintLayout;
    }
}
