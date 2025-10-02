package au.com.woolworths.product.details;

import androidx.databinding.ViewDataBinding;
import au.com.woolworths.product.details.models.ProductImage;
import au.com.woolworths.product.details.ui.ProductImageLoaderListener;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;

/* loaded from: classes4.dex */
public class ItemProductImageBindingModel_ extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder>, ItemProductImageBindingModelBuilder {
    public au.com.woolworths.product.details.epoxy.a n;
    public ProductImage o;
    public ProductDetailsClickHandler p;
    public ProductImageLoaderListener q;

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
        au.com.woolworths.product.details.epoxy.a aVar = this.n;
        if (aVar != null) {
            aVar.e(this, dataBindingHolder, i);
        }
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
        if (!viewDataBinding.G(106, this.q)) {
            throw new IllegalStateException("The attribute imageLoaderListener was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void K(ViewDataBinding viewDataBinding, EpoxyModel epoxyModel) {
        if (!(epoxyModel instanceof ItemProductImageBindingModel_)) {
            J(viewDataBinding);
            return;
        }
        ItemProductImageBindingModel_ itemProductImageBindingModel_ = (ItemProductImageBindingModel_) epoxyModel;
        ProductImage productImage = this.o;
        if (productImage == null ? itemProductImageBindingModel_.o != null : !productImage.equals(itemProductImageBindingModel_.o)) {
            viewDataBinding.G(53, this.o);
        }
        ProductDetailsClickHandler productDetailsClickHandler = this.p;
        if ((productDetailsClickHandler == null) != (itemProductImageBindingModel_.p == null)) {
            viewDataBinding.G(35, productDetailsClickHandler);
        }
        ProductImageLoaderListener productImageLoaderListener = this.q;
        if ((productImageLoaderListener == null) != (itemProductImageBindingModel_.q == null)) {
            viewDataBinding.G(106, productImageLoaderListener);
        }
    }

    public final void M(String str) {
        super.p(str);
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
        ProductImage productImage;
        if (obj != this) {
            if ((obj instanceof ItemProductImageBindingModel_) && super.equals(obj)) {
                ItemProductImageBindingModel_ itemProductImageBindingModel_ = (ItemProductImageBindingModel_) obj;
                if ((this.n == null) == (itemProductImageBindingModel_.n == null) && ((productImage = this.o) == null ? itemProductImageBindingModel_.o == null : productImage.equals(itemProductImageBindingModel_.o))) {
                    if ((this.p == null) == (itemProductImageBindingModel_.p == null)) {
                        if ((this.q == null) != (itemProductImageBindingModel_.q == null)) {
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
        int iHashCode = ((super.hashCode() * 29791) + (this.n != null ? 1 : 0)) * 961;
        ProductImage productImage = this.o;
        return ((((iHashCode + (productImage != null ? productImage.hashCode() : 0)) * 31) + (this.p != null ? 1 : 0)) * 31) + (this.q == null ? 0 : 1);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return com.woolworths.R.layout.epoxy_item_product_image;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "ItemProductImageBindingModel_{data=" + this.o + ", clickHandler=" + this.p + ", imageLoaderListener=" + this.q + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final void x(int i, Object obj) {
        DataBindingEpoxyModel.DataBindingHolder dataBindingHolder = (DataBindingEpoxyModel.DataBindingHolder) obj;
        au.com.woolworths.product.details.epoxy.a aVar = this.n;
        if (aVar != null) {
            aVar.e(this, dataBindingHolder, i);
        }
    }
}
