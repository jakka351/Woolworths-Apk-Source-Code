package com.woolworths.scanlibrary.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.woolworths.scanlibrary.util.widget.AddCreditCardView;

/* loaded from: classes7.dex */
public abstract class ViewAddCreditcardBinding extends ViewDataBinding {
    public static final /* synthetic */ int G = 0;
    public final LinearLayout A;
    public final LinearLayout B;
    public final LinearLayout C;
    public final Button D;
    public final LinearLayout E;
    public AddCreditCardView.ViewModel F;
    public final ImageView y;
    public final TextView z;

    public ViewAddCreditcardBinding(DataBindingComponent dataBindingComponent, View view, ImageView imageView, TextView textView, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, Button button, LinearLayout linearLayout4) {
        super(dataBindingComponent, view, 8);
        this.y = imageView;
        this.z = textView;
        this.A = linearLayout;
        this.B = linearLayout2;
        this.C = linearLayout3;
        this.D = button;
        this.E = linearLayout4;
    }

    public abstract void L(AddCreditCardView.ViewModel viewModel);
}
