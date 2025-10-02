package au.com.woolworths.product.details;

import androidx.databinding.ViewDataBinding;
import au.com.woolworths.product.models.ProductCard;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;

/* loaded from: classes4.dex */
public class ItemProductHeadingBindingModel_ extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder>, ItemProductHeadingBindingModelBuilder {
    public au.com.woolworths.product.details.epoxy.a n;
    public ProductCard o;
    public ProductDetailsClickHandler p;
    public boolean q;

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
        if (!viewDataBinding.G(109, Boolean.valueOf(this.q))) {
            throw new IllegalStateException("The attribute inMappedStore was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void K(ViewDataBinding viewDataBinding, EpoxyModel epoxyModel) {
        if (!(epoxyModel instanceof ItemProductHeadingBindingModel_)) {
            J(viewDataBinding);
            return;
        }
        ItemProductHeadingBindingModel_ itemProductHeadingBindingModel_ = (ItemProductHeadingBindingModel_) epoxyModel;
        ProductCard productCard = this.o;
        if (productCard == null ? itemProductHeadingBindingModel_.o != null : !productCard.equals(itemProductHeadingBindingModel_.o)) {
            viewDataBinding.G(53, this.o);
        }
        ProductDetailsClickHandler productDetailsClickHandler = this.p;
        if ((productDetailsClickHandler == null) != (itemProductHeadingBindingModel_.p == null)) {
            viewDataBinding.G(35, productDetailsClickHandler);
        }
        boolean z = this.q;
        if (z != itemProductHeadingBindingModel_.q) {
            viewDataBinding.G(109, Boolean.valueOf(z));
        }
    }

    public final void M() {
        super.p("product_heading");
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    public final void a(int i, Object obj) {
        DataBindingEpoxyModel.DataBindingHolder dataBindingHolder = (DataBindingEpoxyModel.DataBindingHolder) obj;
        au.com.woolworths.product.details.epoxy.a aVar = this.n;
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
        ProductCard productCard;
        if (obj != this) {
            if ((obj instanceof ItemProductHeadingBindingModel_) && super.equals(obj)) {
                ItemProductHeadingBindingModel_ itemProductHeadingBindingModel_ = (ItemProductHeadingBindingModel_) obj;
                if ((this.n == null) == (itemProductHeadingBindingModel_.n == null) && ((productCard = this.o) == null ? itemProductHeadingBindingModel_.o == null : productCard.equals(itemProductHeadingBindingModel_.o))) {
                    if ((this.p == null) == (itemProductHeadingBindingModel_.p == null) && this.q == itemProductHeadingBindingModel_.q) {
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
        ProductCard productCard = this.o;
        return ((((iHashCode + (productCard != null ? productCard.hashCode() : 0)) * 31) + (this.p == null ? 0 : 1)) * 31) + (this.q ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return com.woolworths.R.layout.epoxy_item_product_heading;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "ItemProductHeadingBindingModel_{data=" + this.o + ", clickHandler=" + this.p + ", inMappedStore=" + this.q + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
