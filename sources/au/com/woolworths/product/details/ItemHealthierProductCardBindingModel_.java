package au.com.woolworths.product.details;

import androidx.camera.core.processing.f;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.product.details.models.HealthierOption;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;

/* loaded from: classes4.dex */
public class ItemHealthierProductCardBindingModel_ extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder>, ItemHealthierProductCardBindingModelBuilder {
    public au.com.woolworths.feature.shop.delivery.address.a n;
    public f o;
    public HealthierOption p;
    public ProductDetailsClickHandler q;

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel, com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final void A(Object obj) {
        super.A((DataBindingEpoxyModel.DataBindingHolder) obj);
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder
    public final /* bridge */ /* synthetic */ void G(EpoxyHolder epoxyHolder) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder
    /* renamed from: H */
    public final void x(int i, EpoxyHolder epoxyHolder) {
        DataBindingEpoxyModel.DataBindingHolder dataBindingHolder = (DataBindingEpoxyModel.DataBindingHolder) epoxyHolder;
        f fVar = this.o;
        if (fVar != null) {
            fVar.b(this, dataBindingHolder, i);
        }
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel, com.airbnb.epoxy.EpoxyModelWithHolder
    /* renamed from: I */
    public final void A(EpoxyHolder epoxyHolder) {
        super.A((DataBindingEpoxyModel.DataBindingHolder) epoxyHolder);
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void J(ViewDataBinding viewDataBinding) {
        if (!viewDataBinding.G(53, this.p)) {
            throw new IllegalStateException("The attribute data was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(35, this.q)) {
            throw new IllegalStateException("The attribute clickHandler was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void K(ViewDataBinding viewDataBinding, EpoxyModel epoxyModel) {
        if (!(epoxyModel instanceof ItemHealthierProductCardBindingModel_)) {
            J(viewDataBinding);
            return;
        }
        ItemHealthierProductCardBindingModel_ itemHealthierProductCardBindingModel_ = (ItemHealthierProductCardBindingModel_) epoxyModel;
        HealthierOption healthierOption = this.p;
        if (healthierOption == null ? itemHealthierProductCardBindingModel_.p != null : !healthierOption.equals(itemHealthierProductCardBindingModel_.p)) {
            viewDataBinding.G(53, this.p);
        }
        ProductDetailsClickHandler productDetailsClickHandler = this.q;
        if ((productDetailsClickHandler == null) != (itemHealthierProductCardBindingModel_.q == null)) {
            viewDataBinding.G(35, productDetailsClickHandler);
        }
    }

    public final void M(String str) {
        super.p(str);
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    public final void a(int i, Object obj) {
        DataBindingEpoxyModel.DataBindingHolder dataBindingHolder = (DataBindingEpoxyModel.DataBindingHolder) obj;
        au.com.woolworths.feature.shop.delivery.address.a aVar = this.n;
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
        HealthierOption healthierOption;
        if (obj != this) {
            if ((obj instanceof ItemHealthierProductCardBindingModel_) && super.equals(obj)) {
                ItemHealthierProductCardBindingModel_ itemHealthierProductCardBindingModel_ = (ItemHealthierProductCardBindingModel_) obj;
                if ((this.n == null) == (itemHealthierProductCardBindingModel_.n == null)) {
                    if ((this.o == null) == (itemHealthierProductCardBindingModel_.o == null) && ((healthierOption = this.p) == null ? itemHealthierProductCardBindingModel_.p == null : healthierOption.equals(itemHealthierProductCardBindingModel_.p))) {
                        if ((this.q == null) != (itemHealthierProductCardBindingModel_.q == null)) {
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
        int iHashCode = ((((super.hashCode() * 31) + (this.n != null ? 1 : 0)) * 961) + (this.o != null ? 1 : 0)) * 961;
        HealthierOption healthierOption = this.p;
        return ((iHashCode + (healthierOption != null ? healthierOption.hashCode() : 0)) * 31) + (this.q == null ? 0 : 1);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return com.woolworths.R.layout.epoxy_item_healthier_product_card;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "ItemHealthierProductCardBindingModel_{data=" + this.p + ", clickHandler=" + this.q + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final void x(int i, Object obj) {
        DataBindingEpoxyModel.DataBindingHolder dataBindingHolder = (DataBindingEpoxyModel.DataBindingHolder) obj;
        f fVar = this.o;
        if (fVar != null) {
            fVar.b(this, dataBindingHolder, i);
        }
    }
}
