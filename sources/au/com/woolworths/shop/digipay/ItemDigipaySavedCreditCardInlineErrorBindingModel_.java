package au.com.woolworths.shop.digipay;

import androidx.databinding.ViewDataBinding;
import au.com.woolworths.shop.digipay.creditcard.CreditCardCaptureInlineErrorState;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;

/* loaded from: classes4.dex */
public class ItemDigipaySavedCreditCardInlineErrorBindingModel_ extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder>, ItemDigipaySavedCreditCardInlineErrorBindingModelBuilder {
    public CreditCardCaptureInlineErrorState n;

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
        if (!viewDataBinding.G(76, this.n)) {
            throw new IllegalStateException("The attribute errorState was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void K(ViewDataBinding viewDataBinding, EpoxyModel epoxyModel) {
        if (!(epoxyModel instanceof ItemDigipaySavedCreditCardInlineErrorBindingModel_)) {
            J(viewDataBinding);
            return;
        }
        CreditCardCaptureInlineErrorState creditCardCaptureInlineErrorState = this.n;
        CreditCardCaptureInlineErrorState creditCardCaptureInlineErrorState2 = ((ItemDigipaySavedCreditCardInlineErrorBindingModel_) epoxyModel).n;
        if (creditCardCaptureInlineErrorState != null) {
            if (creditCardCaptureInlineErrorState.equals(creditCardCaptureInlineErrorState2)) {
                return;
            }
        } else if (creditCardCaptureInlineErrorState2 == null) {
            return;
        }
        viewDataBinding.G(76, this.n);
    }

    public final ItemDigipaySavedCreditCardInlineErrorBindingModel_ M() {
        super.p("saved_credit_card_inline_error_state");
        return this;
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    public final void a(int i, Object obj) {
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
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ItemDigipaySavedCreditCardInlineErrorBindingModel_) || !super.equals(obj)) {
            return false;
        }
        CreditCardCaptureInlineErrorState creditCardCaptureInlineErrorState = this.n;
        CreditCardCaptureInlineErrorState creditCardCaptureInlineErrorState2 = ((ItemDigipaySavedCreditCardInlineErrorBindingModel_) obj).n;
        return creditCardCaptureInlineErrorState == null ? creditCardCaptureInlineErrorState2 == null : creditCardCaptureInlineErrorState.equals(creditCardCaptureInlineErrorState2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int hashCode() {
        int iHashCode = super.hashCode() * 28629151;
        CreditCardCaptureInlineErrorState creditCardCaptureInlineErrorState = this.n;
        return iHashCode + (creditCardCaptureInlineErrorState != null ? creditCardCaptureInlineErrorState.hashCode() : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return com.woolworths.R.layout.epoxy_item_digipay_saved_credit_card_inline_error;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "ItemDigipaySavedCreditCardInlineErrorBindingModel_{errorState=" + this.n + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
