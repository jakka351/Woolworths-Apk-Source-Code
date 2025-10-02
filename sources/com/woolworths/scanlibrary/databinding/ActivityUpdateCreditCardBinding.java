package com.woolworths.scanlibrary.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.woolworths.scanlibrary.ui.payment.updatecard.UpdateCreditCardActivity;
import com.woolworths.scanlibrary.util.widget.UpdateCreditCardExpirationView;

/* loaded from: classes7.dex */
public abstract class ActivityUpdateCreditCardBinding extends ViewDataBinding {
    public final LinearLayout A;
    public final ScrollView B;
    public final ViewAddcardErrorBinding C;
    public final LayoutDarkToolbarBinding D;
    public final TextView E;
    public final TextView F;
    public final UpdateCreditCardExpirationView G;
    public UpdateCreditCardActivity.ViewModel H;
    public final View y;
    public final ImageView z;

    public ActivityUpdateCreditCardBinding(DataBindingComponent dataBindingComponent, View view, View view2, ImageView imageView, LinearLayout linearLayout, ScrollView scrollView, ViewAddcardErrorBinding viewAddcardErrorBinding, LayoutDarkToolbarBinding layoutDarkToolbarBinding, TextView textView, TextView textView2, UpdateCreditCardExpirationView updateCreditCardExpirationView) {
        super(dataBindingComponent, view, 7);
        this.y = view2;
        this.z = imageView;
        this.A = linearLayout;
        this.B = scrollView;
        this.C = viewAddcardErrorBinding;
        this.D = layoutDarkToolbarBinding;
        this.E = textView;
        this.F = textView2;
        this.G = updateCreditCardExpirationView;
    }

    public abstract void L(UpdateCreditCardActivity.ViewModel viewModel);
}
