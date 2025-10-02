package com.woolworths.scanlibrary.databinding;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.woolworths.scanlibrary.ui.checkout.pay.PayFragment;

/* loaded from: classes7.dex */
public abstract class LayoutInstrumentListBinding extends ViewDataBinding {
    public final TextView A;
    public PayFragment.ViewModel B;
    public final ConstraintLayout y;
    public final FrameLayout z;

    public LayoutInstrumentListBinding(DataBindingComponent dataBindingComponent, View view, ConstraintLayout constraintLayout, FrameLayout frameLayout, TextView textView) {
        super(dataBindingComponent, view, 4);
        this.y = constraintLayout;
        this.z = frameLayout;
        this.A = textView;
    }

    public abstract void L(PayFragment.ViewModel viewModel);
}
