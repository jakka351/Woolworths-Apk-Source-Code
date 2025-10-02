package com.woolworths.scanlibrary.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.woolworths.scanlibrary.ui.stores.dto.StateDTO;

/* loaded from: classes7.dex */
public abstract class ViewStateItemBinding extends ViewDataBinding {
    public StateDTO A;
    public final ConstraintLayout y;
    public final TextView z;

    public ViewStateItemBinding(DataBindingComponent dataBindingComponent, View view, ConstraintLayout constraintLayout, TextView textView) {
        super(dataBindingComponent, view, 0);
        this.y = constraintLayout;
        this.z = textView;
    }
}
