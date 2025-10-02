package com.woolworths.scanlibrary.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.woolworths.scanlibrary.util.widget.SquareImageView;

/* loaded from: classes7.dex */
public abstract class ViewCartProudctImageBinding extends ViewDataBinding {
    public static final /* synthetic */ int A = 0;
    public final SquareImageView y;
    public final TextView z;

    public ViewCartProudctImageBinding(DataBindingComponent dataBindingComponent, View view, SquareImageView squareImageView, TextView textView) {
        super(dataBindingComponent, view, 0);
        this.y = squareImageView;
        this.z = textView;
    }
}
