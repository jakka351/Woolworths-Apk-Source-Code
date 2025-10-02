package com.woolworths.scanlibrary.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.woolworths.scanlibrary.ui.payment.setup.AddPaymentSetupViewModel;

/* loaded from: classes7.dex */
public abstract class ActivityAddPaymentSetupBinding extends ViewDataBinding {
    public AddPaymentSetupViewModel A;
    public final LayoutWowToolbarBinding y;
    public final TextView z;

    public ActivityAddPaymentSetupBinding(DataBindingComponent dataBindingComponent, View view, LayoutWowToolbarBinding layoutWowToolbarBinding, TextView textView) {
        super(dataBindingComponent, view, 1);
        this.y = layoutWowToolbarBinding;
        this.z = textView;
    }

    public abstract void L(AddPaymentSetupViewModel addPaymentSetupViewModel);
}
