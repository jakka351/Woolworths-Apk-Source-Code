package au.com.woolworths.shop.lists;

import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.shop.lists.ui.pastshops.PastShopsClickListener;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;

/* loaded from: classes4.dex */
public class ItemPastShopsPaginationErrorStateBindingModel_ extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder>, ItemPastShopsPaginationErrorStateBindingModelBuilder {
    public ResText n;
    public PastShopsClickListener o;

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
        if (!viewDataBinding.G(73, this.n)) {
            throw new IllegalStateException("The attribute errorLabelText was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(35, this.o)) {
            throw new IllegalStateException("The attribute clickHandler was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void K(ViewDataBinding viewDataBinding, EpoxyModel epoxyModel) {
        if (!(epoxyModel instanceof ItemPastShopsPaginationErrorStateBindingModel_)) {
            J(viewDataBinding);
            return;
        }
        ItemPastShopsPaginationErrorStateBindingModel_ itemPastShopsPaginationErrorStateBindingModel_ = (ItemPastShopsPaginationErrorStateBindingModel_) epoxyModel;
        ResText resText = this.n;
        if ((resText == null) != (itemPastShopsPaginationErrorStateBindingModel_.n == null)) {
            viewDataBinding.G(73, resText);
        }
        PastShopsClickListener pastShopsClickListener = this.o;
        if ((pastShopsClickListener == null) != (itemPastShopsPaginationErrorStateBindingModel_.o == null)) {
            viewDataBinding.G(35, pastShopsClickListener);
        }
    }

    public final void M() {
        super.p("item-pagination-error-state");
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
        if (obj != this) {
            if ((obj instanceof ItemPastShopsPaginationErrorStateBindingModel_) && super.equals(obj)) {
                ItemPastShopsPaginationErrorStateBindingModel_ itemPastShopsPaginationErrorStateBindingModel_ = (ItemPastShopsPaginationErrorStateBindingModel_) obj;
                if ((this.n == null) == (itemPastShopsPaginationErrorStateBindingModel_.n == null)) {
                    if ((this.o == null) != (itemPastShopsPaginationErrorStateBindingModel_.o == null)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int hashCode() {
        return (((super.hashCode() * 28629151) + (this.n != null ? 1 : 0)) * 31) + (this.o != null ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return com.woolworths.R.layout.epoxy_item_past_shops_pagination_error_state;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "ItemPastShopsPaginationErrorStateBindingModel_{errorLabelText=" + this.n + ", clickHandler=" + this.o + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
