package au.com.woolworths.shop.checkout.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.shop.checkout.domain.model.CheckoutSummaryBillingAddress;

/* loaded from: classes4.dex */
public abstract class EpoxyItemCheckoutSummaryBillingAddressBinding extends ViewDataBinding {
    public final TextView y;
    public CheckoutSummaryBillingAddress z;

    public EpoxyItemCheckoutSummaryBillingAddressBinding(DataBindingComponent dataBindingComponent, View view, TextView textView) {
        super(dataBindingComponent, view, 0);
        this.y = textView;
    }
}
