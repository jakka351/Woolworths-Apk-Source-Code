package au.com.woolworths.shop.digipay.databinding;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.shop.digipay.creditcard.CreditCardEventHandler;

/* loaded from: classes4.dex */
public abstract class EpoxyItemDigipayCreditCardHeadingBinding extends ViewDataBinding {
    public final ConstraintLayout y;
    public CreditCardEventHandler z;

    public EpoxyItemDigipayCreditCardHeadingBinding(DataBindingComponent dataBindingComponent, View view, ConstraintLayout constraintLayout) {
        super(dataBindingComponent, view, 0);
        this.y = constraintLayout;
    }
}
