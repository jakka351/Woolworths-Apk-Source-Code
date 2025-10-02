package au.com.woolworths.shop.deliveryunlimited.signup.databinding;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription.ConfirmSubscriptionViewModel;
import au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription.terms.TermItemUiModel;

/* loaded from: classes4.dex */
public abstract class EpoxyItemDeliveryUnlimitedSignUpTermsAndConditionsOldBinding extends ViewDataBinding {
    public TermItemUiModel A;
    public ConfirmSubscriptionViewModel B;
    public final CheckBox y;
    public final TextView z;

    public EpoxyItemDeliveryUnlimitedSignUpTermsAndConditionsOldBinding(DataBindingComponent dataBindingComponent, View view, CheckBox checkBox, TextView textView) {
        super(dataBindingComponent, view, 0);
        this.y = checkBox;
        this.z = textView;
    }
}
