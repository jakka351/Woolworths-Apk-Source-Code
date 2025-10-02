package au.com.woolworths.shop.digipay.databinding;

import android.view.View;
import android.widget.Button;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.shop.digipay.creditcard.CreditCardEventHandler;
import au.com.woolworths.shop.digipay.models.SavedCreditCardFooter;

/* loaded from: classes4.dex */
public abstract class EpoxyItemDigipaySavedCreditCardListFooterBinding extends ViewDataBinding {
    public SavedCreditCardFooter A;
    public CreditCardEventHandler B;
    public final Button y;
    public final Button z;

    public EpoxyItemDigipaySavedCreditCardListFooterBinding(DataBindingComponent dataBindingComponent, View view, Button button, Button button2) {
        super(dataBindingComponent, view, 0);
        this.y = button;
        this.z = button2;
    }
}
