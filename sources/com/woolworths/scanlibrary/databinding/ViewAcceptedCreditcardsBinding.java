package com.woolworths.scanlibrary.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.woolworths.scanlibrary.util.widget.AddCreditCardView;

/* loaded from: classes7.dex */
public abstract class ViewAcceptedCreditcardsBinding extends ViewDataBinding {
    public final ImageView A;
    public final ImageView B;
    public final ImageView C;
    public final ImageView D;
    public AddCreditCardView.ViewModel E;
    public final LinearLayout y;
    public final ImageView z;

    public ViewAcceptedCreditcardsBinding(DataBindingComponent dataBindingComponent, View view, LinearLayout linearLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5) {
        super(dataBindingComponent, view, 6);
        this.y = linearLayout;
        this.z = imageView;
        this.A = imageView2;
        this.B = imageView3;
        this.C = imageView4;
        this.D = imageView5;
    }

    public abstract void L(AddCreditCardView.ViewModel viewModel);
}
