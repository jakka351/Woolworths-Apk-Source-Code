package com.woolworths.scanlibrary.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.woolworths.scanlibrary.data.cart.Cart;
import com.woolworths.scanlibrary.ui.checkout.pay.PayFragment;
import com.woolworths.scanlibrary.util.widget.DiscountListView;

/* loaded from: classes7.dex */
public abstract class FragmentTenderPayBinding extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public final LayoutDarkToolbarProgressBinding C;
    public final TextView D;
    public final DiscountListView E;
    public final TextView F;
    public final ImageView G;
    public final RelativeLayout H;
    public final ImageView I;
    public final TextView J;
    public final LinearLayout K;
    public final FrameLayout L;
    public Cart M;
    public PayFragment.ViewModel N;
    public final Button y;
    public final TextView z;

    public FragmentTenderPayBinding(DataBindingComponent dataBindingComponent, View view, Button button, TextView textView, TextView textView2, TextView textView3, LayoutDarkToolbarProgressBinding layoutDarkToolbarProgressBinding, TextView textView4, DiscountListView discountListView, TextView textView5, ImageView imageView, RelativeLayout relativeLayout, ImageView imageView2, TextView textView6, LinearLayout linearLayout, FrameLayout frameLayout) {
        super(dataBindingComponent, view, 13);
        this.y = button;
        this.z = textView;
        this.A = textView2;
        this.B = textView3;
        this.C = layoutDarkToolbarProgressBinding;
        this.D = textView4;
        this.E = discountListView;
        this.F = textView5;
        this.G = imageView;
        this.H = relativeLayout;
        this.I = imageView2;
        this.J = textView6;
        this.K = linearLayout;
        this.L = frameLayout;
    }

    public abstract void L(Cart cart);

    public abstract void M(PayFragment.ViewModel viewModel);
}
