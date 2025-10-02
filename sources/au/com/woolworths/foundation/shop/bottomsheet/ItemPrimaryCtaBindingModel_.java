package au.com.woolworths.foundation.shop.bottomsheet;

import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.foundation.shop.bottomsheet.BaseBottomSheetContract;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;

/* loaded from: classes4.dex */
public class ItemPrimaryCtaBindingModel_ extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder>, ItemPrimaryCtaBindingModelBuilder {
    public ContentCta n;
    public BaseBottomSheetContract.CtaClickListener o;

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
        if (!viewDataBinding.G(51, this.n)) {
            throw new IllegalStateException("The attribute cta was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(157, this.o)) {
            throw new IllegalStateException("The attribute listener was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void K(ViewDataBinding viewDataBinding, EpoxyModel epoxyModel) {
        if (!(epoxyModel instanceof ItemPrimaryCtaBindingModel_)) {
            J(viewDataBinding);
            return;
        }
        ItemPrimaryCtaBindingModel_ itemPrimaryCtaBindingModel_ = (ItemPrimaryCtaBindingModel_) epoxyModel;
        ContentCta contentCta = this.n;
        if (contentCta == null ? itemPrimaryCtaBindingModel_.n != null : !contentCta.equals(itemPrimaryCtaBindingModel_.n)) {
            viewDataBinding.G(51, this.n);
        }
        BaseBottomSheetContract.CtaClickListener ctaClickListener = this.o;
        if ((ctaClickListener == null) != (itemPrimaryCtaBindingModel_.o == null)) {
            viewDataBinding.G(157, ctaClickListener);
        }
    }

    public final ItemPrimaryCtaBindingModel_ M() {
        super.p("primary-cta");
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
        if (!(obj instanceof ItemPrimaryCtaBindingModel_) || !super.equals(obj)) {
            return false;
        }
        ItemPrimaryCtaBindingModel_ itemPrimaryCtaBindingModel_ = (ItemPrimaryCtaBindingModel_) obj;
        ContentCta contentCta = this.n;
        if (contentCta == null ? itemPrimaryCtaBindingModel_.n == null : contentCta.equals(itemPrimaryCtaBindingModel_.n)) {
            return (this.o == null) == (itemPrimaryCtaBindingModel_.o == null);
        }
        return false;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int hashCode() {
        int iHashCode = super.hashCode() * 28629151;
        ContentCta contentCta = this.n;
        return ((iHashCode + (contentCta != null ? contentCta.hashCode() : 0)) * 31) + (this.o != null ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return com.woolworths.R.layout.epoxy_item_primary_cta;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "ItemPrimaryCtaBindingModel_{cta=" + this.n + ", listener=" + this.o + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
