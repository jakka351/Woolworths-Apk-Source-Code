package au.com.woolworths.feature.shared.receipt.details;

import androidx.databinding.ViewDataBinding;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;

/* loaded from: classes3.dex */
public class ItemEReceiptPaymentHeaderBindingModel_ extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder>, ItemEReceiptPaymentHeaderBindingModelBuilder {
    public Boolean n;
    public Boolean o;
    public EReceiptDetailsClickHandler p;

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
        if (!viewDataBinding.G(129, this.n)) {
            throw new IllegalStateException("The attribute isExpanded was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(128, this.o)) {
            throw new IllegalStateException("The attribute isExpandable was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(35, this.p)) {
            throw new IllegalStateException("The attribute clickHandler was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void K(ViewDataBinding viewDataBinding, EpoxyModel epoxyModel) {
        if (!(epoxyModel instanceof ItemEReceiptPaymentHeaderBindingModel_)) {
            J(viewDataBinding);
            return;
        }
        ItemEReceiptPaymentHeaderBindingModel_ itemEReceiptPaymentHeaderBindingModel_ = (ItemEReceiptPaymentHeaderBindingModel_) epoxyModel;
        Boolean bool = this.n;
        if (bool == null ? itemEReceiptPaymentHeaderBindingModel_.n != null : !bool.equals(itemEReceiptPaymentHeaderBindingModel_.n)) {
            viewDataBinding.G(129, this.n);
        }
        Boolean bool2 = this.o;
        if (bool2 == null ? itemEReceiptPaymentHeaderBindingModel_.o != null : !bool2.equals(itemEReceiptPaymentHeaderBindingModel_.o)) {
            viewDataBinding.G(128, this.o);
        }
        EReceiptDetailsClickHandler eReceiptDetailsClickHandler = this.p;
        if ((eReceiptDetailsClickHandler == null) != (itemEReceiptPaymentHeaderBindingModel_.p == null)) {
            viewDataBinding.G(35, eReceiptDetailsClickHandler);
        }
    }

    public final void M() {
        super.p("e_receipt_details_payment_header");
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
        if (!(obj instanceof ItemEReceiptPaymentHeaderBindingModel_) || !super.equals(obj)) {
            return false;
        }
        ItemEReceiptPaymentHeaderBindingModel_ itemEReceiptPaymentHeaderBindingModel_ = (ItemEReceiptPaymentHeaderBindingModel_) obj;
        Boolean bool = this.n;
        if (bool == null ? itemEReceiptPaymentHeaderBindingModel_.n != null : !bool.equals(itemEReceiptPaymentHeaderBindingModel_.n)) {
            return false;
        }
        Boolean bool2 = this.o;
        if (bool2 == null ? itemEReceiptPaymentHeaderBindingModel_.o == null : bool2.equals(itemEReceiptPaymentHeaderBindingModel_.o)) {
            return (this.p == null) == (itemEReceiptPaymentHeaderBindingModel_.p == null);
        }
        return false;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int hashCode() {
        int iHashCode = super.hashCode() * 28629151;
        Boolean bool = this.n;
        int iHashCode2 = (iHashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.o;
        return ((iHashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 31) + (this.p != null ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return com.woolworths.R.layout.epoxy_item_e_receipt_payment_header;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "ItemEReceiptPaymentHeaderBindingModel_{isExpanded=" + this.n + ", isExpandable=" + this.o + ", clickHandler=" + this.p + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
