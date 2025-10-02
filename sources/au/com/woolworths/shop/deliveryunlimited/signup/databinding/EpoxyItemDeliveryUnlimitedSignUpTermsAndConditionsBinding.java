package au.com.woolworths.shop.deliveryunlimited.signup.databinding;

import android.view.View;
import android.widget.CheckBox;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription.terms.TermItemUiModel;
import au.com.woolworths.shop.deliveryunlimited.signup.payment.PaymentViewModel;

/* loaded from: classes4.dex */
public abstract class EpoxyItemDeliveryUnlimitedSignUpTermsAndConditionsBinding extends ViewDataBinding {
    public PaymentViewModel A;
    public final CheckBox y;
    public TermItemUiModel z;

    public EpoxyItemDeliveryUnlimitedSignUpTermsAndConditionsBinding(DataBindingComponent dataBindingComponent, View view, CheckBox checkBox) {
        super(dataBindingComponent, view, 0);
        this.y = checkBox;
    }
}
