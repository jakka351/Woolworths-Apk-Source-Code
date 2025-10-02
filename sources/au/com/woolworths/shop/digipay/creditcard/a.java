package au.com.woolworths.shop.digipay.creditcard;

import au.com.woolworths.shop.digipay.ItemDigipaySavedCreditCardBindingModel_;
import au.com.woolworths.shop.digipay.models.SavedCreditCard;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.OnModelBoundListener;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements OnModelBoundListener {
    public final /* synthetic */ SavedCreditCard d;
    public final /* synthetic */ CreditCardEpoxyController e;

    public /* synthetic */ a(SavedCreditCard savedCreditCard, CreditCardEpoxyController creditCardEpoxyController) {
        this.d = savedCreditCard;
        this.e = creditCardEpoxyController;
    }

    @Override // com.airbnb.epoxy.OnModelBoundListener
    public final void g(int i, EpoxyModel epoxyModel, Object obj) {
        CreditCardEpoxyController.buildSavedCreditCard$lambda$6$lambda$5(this.d, this.e, (ItemDigipaySavedCreditCardBindingModel_) epoxyModel, (DataBindingEpoxyModel.DataBindingHolder) obj, i);
    }
}
