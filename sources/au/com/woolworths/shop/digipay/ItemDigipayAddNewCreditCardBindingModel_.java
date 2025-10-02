package au.com.woolworths.shop.digipay;

import androidx.databinding.ViewDataBinding;
import au.com.woolworths.product.details.epoxy.a;
import au.com.woolworths.shop.digipay.creditcard.CardCaptureViewEventHandler;
import au.com.woolworths.shop.digipay.creditcard.CreditCardEventHandler;
import au.com.woolworths.shop.digipay.models.AddNewCreditCard;
import au.com.woolworths.shop.digipay.models.PaymentInfo;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;

/* loaded from: classes4.dex */
public class ItemDigipayAddNewCreditCardBindingModel_ extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder>, ItemDigipayAddNewCreditCardBindingModelBuilder {
    public a n;
    public AddNewCreditCard o;
    public CreditCardEventHandler p;
    public CardCaptureViewEventHandler q;
    public PaymentInfo r;

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
        if (!viewDataBinding.G(92, this.p)) {
            throw new IllegalStateException("The attribute handler was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(29, this.q)) {
            throw new IllegalStateException("The attribute cardCaptureHandler was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(197, this.r)) {
            throw new IllegalStateException("The attribute paymentInfo was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void K(ViewDataBinding viewDataBinding, EpoxyModel epoxyModel) {
        if (!(epoxyModel instanceof ItemDigipayAddNewCreditCardBindingModel_)) {
            J(viewDataBinding);
            return;
        }
        ItemDigipayAddNewCreditCardBindingModel_ itemDigipayAddNewCreditCardBindingModel_ = (ItemDigipayAddNewCreditCardBindingModel_) epoxyModel;
        AddNewCreditCard addNewCreditCard = this.o;
        if (addNewCreditCard == null ? itemDigipayAddNewCreditCardBindingModel_.o != null : !addNewCreditCard.equals(itemDigipayAddNewCreditCardBindingModel_.o)) {
            viewDataBinding.G(53, this.o);
        }
        CreditCardEventHandler creditCardEventHandler = this.p;
        if ((creditCardEventHandler == null) != (itemDigipayAddNewCreditCardBindingModel_.p == null)) {
            viewDataBinding.G(92, creditCardEventHandler);
        }
        CardCaptureViewEventHandler cardCaptureViewEventHandler = this.q;
        if ((cardCaptureViewEventHandler == null) != (itemDigipayAddNewCreditCardBindingModel_.q == null)) {
            viewDataBinding.G(29, cardCaptureViewEventHandler);
        }
        PaymentInfo paymentInfo = this.r;
        PaymentInfo paymentInfo2 = itemDigipayAddNewCreditCardBindingModel_.r;
        if (paymentInfo != null) {
            if (paymentInfo.equals(paymentInfo2)) {
                return;
            }
        } else if (paymentInfo2 == null) {
            return;
        }
        viewDataBinding.G(197, this.r);
    }

    public final ItemDigipayAddNewCreditCardBindingModel_ M(String str) {
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
        AddNewCreditCard addNewCreditCard;
        if (obj != this) {
            if ((obj instanceof ItemDigipayAddNewCreditCardBindingModel_) && super.equals(obj)) {
                ItemDigipayAddNewCreditCardBindingModel_ itemDigipayAddNewCreditCardBindingModel_ = (ItemDigipayAddNewCreditCardBindingModel_) obj;
                if ((this.n == null) == (itemDigipayAddNewCreditCardBindingModel_.n == null) && ((addNewCreditCard = this.o) == null ? itemDigipayAddNewCreditCardBindingModel_.o == null : addNewCreditCard.equals(itemDigipayAddNewCreditCardBindingModel_.o))) {
                    if ((this.p == null) == (itemDigipayAddNewCreditCardBindingModel_.p == null)) {
                        if ((this.q == null) == (itemDigipayAddNewCreditCardBindingModel_.q == null)) {
                            PaymentInfo paymentInfo = this.r;
                            PaymentInfo paymentInfo2 = itemDigipayAddNewCreditCardBindingModel_.r;
                            if (paymentInfo == null ? paymentInfo2 == null : paymentInfo.equals(paymentInfo2)) {
                            }
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
        AddNewCreditCard addNewCreditCard = this.o;
        int iHashCode2 = (((((iHashCode + (addNewCreditCard != null ? addNewCreditCard.hashCode() : 0)) * 31) + (this.p != null ? 1 : 0)) * 31) + (this.q == null ? 0 : 1)) * 31;
        PaymentInfo paymentInfo = this.r;
        return iHashCode2 + (paymentInfo != null ? paymentInfo.hashCode() : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return com.woolworths.R.layout.epoxy_item_digipay_add_new_credit_card;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "ItemDigipayAddNewCreditCardBindingModel_{data=" + this.o + ", handler=" + this.p + ", cardCaptureHandler=" + this.q + ", paymentInfo=" + this.r + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
