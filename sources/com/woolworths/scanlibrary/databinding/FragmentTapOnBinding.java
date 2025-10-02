package com.woolworths.scanlibrary.databinding;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.woolworths.scanlibrary.ui.tap.tapon.TapOnFragment;

/* loaded from: classes7.dex */
public abstract class FragmentTapOnBinding extends ViewDataBinding {
    public final FrameLayout A;
    public final TextView B;
    public final ConstraintLayout C;
    public final TextView D;
    public final TextView E;
    public TapOnFragment.ViewModel F;
    public final ImageView y;
    public final DialogScanResultViewBinding z;

    public FragmentTapOnBinding(DataBindingComponent dataBindingComponent, View view, ImageView imageView, DialogScanResultViewBinding dialogScanResultViewBinding, FrameLayout frameLayout, TextView textView, ConstraintLayout constraintLayout, TextView textView2, TextView textView3) {
        super(dataBindingComponent, view, 5);
        this.y = imageView;
        this.z = dialogScanResultViewBinding;
        this.A = frameLayout;
        this.B = textView;
        this.C = constraintLayout;
        this.D = textView2;
        this.E = textView3;
    }

    public abstract void L(TapOnFragment.ViewModel viewModel);
}
