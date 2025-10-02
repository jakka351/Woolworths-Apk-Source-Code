package au.com.woolworths.feature.shop.myorders;

import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shop.myorders.editorderconditions.EditOrderConditionEventHandler;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;

/* loaded from: classes3.dex */
public class ItemEditOrderWarningAcceptTermCheckboxBindingModel_ extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder>, ItemEditOrderWarningAcceptTermCheckboxBindingModelBuilder {
    public String n;
    public EditOrderConditionEventHandler o;

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
        if (!viewDataBinding.G(34, this.n)) {
            throw new IllegalStateException("The attribute checkboxText was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(92, this.o)) {
            throw new IllegalStateException("The attribute handler was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void K(ViewDataBinding viewDataBinding, EpoxyModel epoxyModel) {
        if (!(epoxyModel instanceof ItemEditOrderWarningAcceptTermCheckboxBindingModel_)) {
            J(viewDataBinding);
            return;
        }
        ItemEditOrderWarningAcceptTermCheckboxBindingModel_ itemEditOrderWarningAcceptTermCheckboxBindingModel_ = (ItemEditOrderWarningAcceptTermCheckboxBindingModel_) epoxyModel;
        String str = this.n;
        if (str == null ? itemEditOrderWarningAcceptTermCheckboxBindingModel_.n != null : !str.equals(itemEditOrderWarningAcceptTermCheckboxBindingModel_.n)) {
            viewDataBinding.G(34, this.n);
        }
        EditOrderConditionEventHandler editOrderConditionEventHandler = this.o;
        if ((editOrderConditionEventHandler == null) != (itemEditOrderWarningAcceptTermCheckboxBindingModel_.o == null)) {
            viewDataBinding.G(92, editOrderConditionEventHandler);
        }
    }

    public final ItemEditOrderWarningAcceptTermCheckboxBindingModel_ M() {
        super.p("edit_order_warning_checkbox");
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
        if (!(obj instanceof ItemEditOrderWarningAcceptTermCheckboxBindingModel_) || !super.equals(obj)) {
            return false;
        }
        ItemEditOrderWarningAcceptTermCheckboxBindingModel_ itemEditOrderWarningAcceptTermCheckboxBindingModel_ = (ItemEditOrderWarningAcceptTermCheckboxBindingModel_) obj;
        String str = this.n;
        if (str == null ? itemEditOrderWarningAcceptTermCheckboxBindingModel_.n == null : str.equals(itemEditOrderWarningAcceptTermCheckboxBindingModel_.n)) {
            return (this.o == null) == (itemEditOrderWarningAcceptTermCheckboxBindingModel_.o == null);
        }
        return false;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int hashCode() {
        int iHashCode = super.hashCode() * 28629151;
        String str = this.n;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + (this.o != null ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return com.woolworths.R.layout.epoxy_item_edit_order_warning_accept_term_checkbox;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "ItemEditOrderWarningAcceptTermCheckboxBindingModel_{checkboxText=" + this.n + ", handler=" + this.o + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
