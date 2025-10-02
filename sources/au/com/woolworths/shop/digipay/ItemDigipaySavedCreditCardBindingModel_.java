package au.com.woolworths.shop.digipay;

import androidx.databinding.ViewDataBinding;
import au.com.woolworths.shop.digipay.creditcard.CreditCardEventHandler;
import au.com.woolworths.shop.digipay.creditcard.a;
import au.com.woolworths.shop.digipay.models.PaymentInfo;
import au.com.woolworths.shop.digipay.models.SavedCreditCard;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;

/* loaded from: classes4.dex */
public class ItemDigipaySavedCreditCardBindingModel_ extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder>, ItemDigipaySavedCreditCardBindingModelBuilder {
    public a n;
    public SavedCreditCard o;
    public CreditCardEventHandler p;
    public PaymentInfo q;

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel, com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final void A(Object obj) {
        super.A((DataBindingEpoxyModel.DataBindingHolder) obj);
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder
    public final /* bridge */ /* synthetic */ void G(EpoxyHolder epoxyHolder) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder
    /* renamed from: H */
    public final /* bridge */ /* synthetic */ void x(int i, EpoxyHolder epoxyHolder) {
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel, com.airbnb.epoxy.EpoxyModelWithHolder
    /* renamed from: I */
    public final void A(EpoxyHolder epoxyHolder) {
        super.A((DataBindingEpoxyModel.DataBindingHolder) epoxyHolder);
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void J(ViewDataBinding viewDataBinding) {
        if (!viewDataBinding.G(53, this.o)) {
            throw new IllegalStateException("The attribute data was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(35, this.p)) {
            throw new IllegalStateException("The attribute clickHandler was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(197, this.q)) {
            throw new IllegalStateException("The attribute paymentInfo was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void K(ViewDataBinding viewDataBinding, EpoxyModel epoxyModel) {
        if (!(epoxyModel instanceof ItemDigipaySavedCreditCardBindingModel_)) {
            J(viewDataBinding);
            return;
        }
        ItemDigipaySavedCreditCardBindingModel_ itemDigipaySavedCreditCardBindingModel_ = (ItemDigipaySavedCreditCardBindingModel_) epoxyModel;
        SavedCreditCard savedCreditCard = this.o;
        if (savedCreditCard == null ? itemDigipaySavedCreditCardBindingModel_.o != null : !savedCreditCard.equals(itemDigipaySavedCreditCardBindingModel_.o)) {
            viewDataBinding.G(53, this.o);
        }
        CreditCardEventHandler creditCardEventHandler = this.p;
        if ((creditCardEventHandler == null) != (itemDigipaySavedCreditCardBindingModel_.p == null)) {
            viewDataBinding.G(35, creditCardEventHandler);
        }
        PaymentInfo paymentInfo = this.q;
        PaymentInfo paymentInfo2 = itemDigipaySavedCreditCardBindingModel_.q;
        if (paymentInfo != null) {
            if (paymentInfo.equals(paymentInfo2)) {
                return;
            }
        } else if (paymentInfo2 == null) {
            return;
        }
        viewDataBinding.G(197, this.q);
    }

    public final ItemDigipaySavedCreditCardBindingModel_ M(String str) {
        super.p(str);
        return this;
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    public final void a(int i, Object obj) {
        DataBindingEpoxyModel.DataBindingHolder dataBindingHolder = (DataBindingEpoxyModel.DataBindingHolder) obj;
        a aVar = this.n;
        if (aVar != null) {
            aVar.g(i, this, dataBindingHolder);
        }
        B(i, "The model was changed during the bind call.");
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    public final void b(int i, Object obj) {
        B(i, "The model was changed between being added to the controller and being bound.");
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void c(EpoxyController epoxyController) {
        epoxyController.addInternal(this);
        d(epoxyController);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final boolean equals(Object obj) {
        SavedCreditCard savedCreditCard;
        if (obj != this) {
            if ((obj instanceof ItemDigipaySavedCreditCardBindingModel_) && super.equals(obj)) {
                ItemDigipaySavedCreditCardBindingModel_ itemDigipaySavedCreditCardBindingModel_ = (ItemDigipaySavedCreditCardBindingModel_) obj;
                if ((this.n == null) == (itemDigipaySavedCreditCardBindingModel_.n == null) && ((savedCreditCard = this.o) == null ? itemDigipaySavedCreditCardBindingModel_.o == null : savedCreditCard.equals(itemDigipaySavedCreditCardBindingModel_.o))) {
                    if ((this.p == null) == (itemDigipaySavedCreditCardBindingModel_.p == null)) {
                        PaymentInfo paymentInfo = this.q;
                        PaymentInfo paymentInfo2 = itemDigipaySavedCreditCardBindingModel_.q;
                        if (paymentInfo == null ? paymentInfo2 == null : paymentInfo.equals(paymentInfo2)) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int hashCode() {
        int iHashCode = ((super.hashCode() * 31) + (this.n != null ? 1 : 0)) * 923521;
        SavedCreditCard savedCreditCard = this.o;
        int iHashCode2 = (((iHashCode + (savedCreditCard != null ? savedCreditCard.hashCode() : 0)) * 31) + (this.p == null ? 0 : 1)) * 31;
        PaymentInfo paymentInfo = this.q;
        return iHashCode2 + (paymentInfo != null ? paymentInfo.hashCode() : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return com.woolworths.R.layout.epoxy_item_digipay_saved_credit_card;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "ItemDigipaySavedCreditCardBindingModel_{data=" + this.o + ", clickHandler=" + this.p + ", paymentInfo=" + this.q + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
