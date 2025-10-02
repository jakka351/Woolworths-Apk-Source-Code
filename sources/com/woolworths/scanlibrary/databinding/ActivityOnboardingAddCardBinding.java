package com.woolworths.scanlibrary.databinding;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.woolworths.scanlibrary.util.widget.AddCreditCardView;

/* loaded from: classes7.dex */
public abstract class ActivityOnboardingAddCardBinding extends ViewDataBinding {
    public final RelativeLayout A;
    public final ViewAddcardErrorBinding B;
    public final LayoutDarkToolbarBinding C;
    public final AddCreditCardView y;
    public final TextView z;

    public ActivityOnboardingAddCardBinding(DataBindingComponent dataBindingComponent, View view, AddCreditCardView addCreditCardView, TextView textView, RelativeLayout relativeLayout, ViewAddcardErrorBinding viewAddcardErrorBinding, LayoutDarkToolbarBinding layoutDarkToolbarBinding) {
        super(dataBindingComponent, view, 2);
        this.y = addCreditCardView;
        this.z = textView;
        this.A = relativeLayout;
        this.B = viewAddcardErrorBinding;
        this.C = layoutDarkToolbarBinding;
    }
}
