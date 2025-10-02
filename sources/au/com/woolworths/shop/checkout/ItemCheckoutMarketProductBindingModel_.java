package au.com.woolworths.shop.checkout;

import androidx.databinding.ViewDataBinding;
import au.com.woolworths.shop.checkout.domain.model.MarketProductRow;
import au.com.woolworths.shop.checkout.ui.product.CheckoutProductListener;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;
import com.google.apphosting.datastore.testing.DatastoreTestTrace;

/* loaded from: classes4.dex */
public class ItemCheckoutMarketProductBindingModel_ extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder>, ItemCheckoutMarketProductBindingModelBuilder {
    public MarketProductRow n;
    public String o;
    public String p;
    public CheckoutProductListener q;

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
        if (!viewDataBinding.G(DatastoreTestTrace.FirestoreV1Action.DATABASE_CONTENTS_BEFORE_ACTION_FIELD_NUMBER, this.n)) {
            throw new IllegalStateException("The attribute product was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(226, this.o)) {
            throw new IllegalStateException("The attribute sellerName was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(60, this.p)) {
            throw new IllegalStateException("The attribute dispatchNote was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(157, this.q)) {
            throw new IllegalStateException("The attribute listener was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void K(ViewDataBinding viewDataBinding, EpoxyModel epoxyModel) {
        if (!(epoxyModel instanceof ItemCheckoutMarketProductBindingModel_)) {
            J(viewDataBinding);
            return;
        }
        ItemCheckoutMarketProductBindingModel_ itemCheckoutMarketProductBindingModel_ = (ItemCheckoutMarketProductBindingModel_) epoxyModel;
        MarketProductRow marketProductRow = this.n;
        if (marketProductRow == null ? itemCheckoutMarketProductBindingModel_.n != null : !marketProductRow.equals(itemCheckoutMarketProductBindingModel_.n)) {
            viewDataBinding.G(DatastoreTestTrace.FirestoreV1Action.DATABASE_CONTENTS_BEFORE_ACTION_FIELD_NUMBER, this.n);
        }
        String str = this.o;
        if (str == null ? itemCheckoutMarketProductBindingModel_.o != null : !str.equals(itemCheckoutMarketProductBindingModel_.o)) {
            viewDataBinding.G(226, this.o);
        }
        String str2 = this.p;
        if (str2 == null ? itemCheckoutMarketProductBindingModel_.p != null : !str2.equals(itemCheckoutMarketProductBindingModel_.p)) {
            viewDataBinding.G(60, this.p);
        }
        CheckoutProductListener checkoutProductListener = this.q;
        if ((checkoutProductListener == null) != (itemCheckoutMarketProductBindingModel_.q == null)) {
            viewDataBinding.G(157, checkoutProductListener);
        }
    }

    public final ItemCheckoutMarketProductBindingModel_ M(String str) {
        super.p(str);
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
        if (!(obj instanceof ItemCheckoutMarketProductBindingModel_) || !super.equals(obj)) {
            return false;
        }
        ItemCheckoutMarketProductBindingModel_ itemCheckoutMarketProductBindingModel_ = (ItemCheckoutMarketProductBindingModel_) obj;
        MarketProductRow marketProductRow = this.n;
        if (marketProductRow == null ? itemCheckoutMarketProductBindingModel_.n != null : !marketProductRow.equals(itemCheckoutMarketProductBindingModel_.n)) {
            return false;
        }
        String str = this.o;
        if (str == null ? itemCheckoutMarketProductBindingModel_.o != null : !str.equals(itemCheckoutMarketProductBindingModel_.o)) {
            return false;
        }
        String str2 = this.p;
        if (str2 == null ? itemCheckoutMarketProductBindingModel_.p == null : str2.equals(itemCheckoutMarketProductBindingModel_.p)) {
            return (this.q == null) == (itemCheckoutMarketProductBindingModel_.q == null);
        }
        return false;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int hashCode() {
        int iHashCode = super.hashCode() * 28629151;
        MarketProductRow marketProductRow = this.n;
        int iHashCode2 = (iHashCode + (marketProductRow != null ? marketProductRow.hashCode() : 0)) * 31;
        String str = this.o;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.p;
        return ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.q != null ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return com.woolworths.R.layout.epoxy_item_checkout_market_product;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "ItemCheckoutMarketProductBindingModel_{product=" + this.n + ", sellerName=" + this.o + ", dispatchNote=" + this.p + ", listener=" + this.q + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
