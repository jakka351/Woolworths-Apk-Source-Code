package com.woolworths.scanlibrary.databinding;

import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.woolworths.scanlibrary.util.widget.UpdateCreditCardExpirationView;

/* loaded from: classes7.dex */
public abstract class ViewUpdateCreditcardBinding extends ViewDataBinding {
    public static final /* synthetic */ int C = 0;
    public final LinearLayout A;
    public UpdateCreditCardExpirationView.ViewModel B;
    public final View y;
    public final LinearLayout z;

    public ViewUpdateCreditcardBinding(DataBindingComponent dataBindingComponent, View view, View view2, LinearLayout linearLayout, LinearLayout linearLayout2) {
        super(dataBindingComponent, view, 3);
        this.y = view2;
        this.z = linearLayout;
        this.A = linearLayout2;
    }

    public abstract void L(UpdateCreditCardExpirationView.ViewModel viewModel);
}
