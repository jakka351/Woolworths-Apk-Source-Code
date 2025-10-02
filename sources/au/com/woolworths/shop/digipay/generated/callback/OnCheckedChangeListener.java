package au.com.woolworths.shop.digipay.generated.callback;

import android.widget.CompoundButton;
import au.com.woolworths.shop.digipay.creditcard.CreditCardEventHandler;
import au.com.woolworths.shop.digipay.databinding.EpoxyItemDigipayAddNewCreditCardBindingImpl;

/* loaded from: classes4.dex */
public final class OnCheckedChangeListener implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final EpoxyItemDigipayAddNewCreditCardBindingImpl f10920a;

    public interface Listener {
    }

    public OnCheckedChangeListener(EpoxyItemDigipayAddNewCreditCardBindingImpl epoxyItemDigipayAddNewCreditCardBindingImpl) {
        this.f10920a = epoxyItemDigipayAddNewCreditCardBindingImpl;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        CreditCardEventHandler creditCardEventHandler = this.f10920a.M;
        if (creditCardEventHandler != null) {
            creditCardEventHandler.J2(z);
        }
    }
}
