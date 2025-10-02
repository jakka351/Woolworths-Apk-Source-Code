package au.com.woolworths.product.details;

import androidx.databinding.ViewDataBinding;
import au.com.woolworths.product.details.ui.CollapsibleContentUiModel;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;

/* loaded from: classes4.dex */
public class ItemCollapsibleContentBindingModel_ extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder>, ItemCollapsibleContentBindingModelBuilder {
    public b n;
    public CollapsibleContentUiModel o;
    public ProductDetailsClickHandler p;

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
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void K(ViewDataBinding viewDataBinding, EpoxyModel epoxyModel) {
        if (!(epoxyModel instanceof ItemCollapsibleContentBindingModel_)) {
            J(viewDataBinding);
            return;
        }
        ItemCollapsibleContentBindingModel_ itemCollapsibleContentBindingModel_ = (ItemCollapsibleContentBindingModel_) epoxyModel;
        CollapsibleContentUiModel collapsibleContentUiModel = this.o;
        if (collapsibleContentUiModel == null ? itemCollapsibleContentBindingModel_.o != null : !collapsibleContentUiModel.equals(itemCollapsibleContentBindingModel_.o)) {
            viewDataBinding.G(53, this.o);
        }
        ProductDetailsClickHandler productDetailsClickHandler = this.p;
        if ((productDetailsClickHandler == null) != (itemCollapsibleContentBindingModel_.p == null)) {
            viewDataBinding.G(35, productDetailsClickHandler);
        }
    }

    public final ItemCollapsibleContentBindingModel_ M(String str) {
        super.p(str);
        return this;
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    public final void a(int i, Object obj) {
        DataBindingEpoxyModel.DataBindingHolder dataBindingHolder = (DataBindingEpoxyModel.DataBindingHolder) obj;
        b bVar = this.n;
        if (bVar != null) {
            bVar.g(i, this, dataBindingHolder);
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
        CollapsibleContentUiModel collapsibleContentUiModel;
        if (obj != this) {
            if ((obj instanceof ItemCollapsibleContentBindingModel_) && super.equals(obj)) {
                ItemCollapsibleContentBindingModel_ itemCollapsibleContentBindingModel_ = (ItemCollapsibleContentBindingModel_) obj;
                if ((this.n == null) == (itemCollapsibleContentBindingModel_.n == null) && ((collapsibleContentUiModel = this.o) == null ? itemCollapsibleContentBindingModel_.o == null : collapsibleContentUiModel.equals(itemCollapsibleContentBindingModel_.o))) {
                    if ((this.p == null) != (itemCollapsibleContentBindingModel_.p == null)) {
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
        CollapsibleContentUiModel collapsibleContentUiModel = this.o;
        return ((iHashCode + (collapsibleContentUiModel != null ? collapsibleContentUiModel.hashCode() : 0)) * 31) + (this.p == null ? 0 : 1);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return com.woolworths.R.layout.epoxy_item_collapsible_content;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "ItemCollapsibleContentBindingModel_{data=" + this.o + ", clickHandler=" + this.p + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
