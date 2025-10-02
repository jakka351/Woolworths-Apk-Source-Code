package com.woolworths.scanlibrary;

import androidx.databinding.ViewDataBinding;
import au.com.woolworths.product.details.b;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;
import com.google.common.net.a;
import com.woolworths.scanlibrary.ui.entry.content.ContentItem;
import com.woolworths.scanlibrary.ui.entry.content.LandingContentActionListener;
import com.woolworths.scanlibrary.ui.entry.controller.LandingContentController;

/* loaded from: classes7.dex */
public class SngViewLandingContentBindingModel_ extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder>, SngViewLandingContentBindingModelBuilder {
    public b n;
    public a o;
    public ContentItem p;
    public LandingContentActionListener q;

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder
    public final /* bridge */ /* synthetic */ void G(EpoxyHolder epoxyHolder) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder
    /* renamed from: H */
    public final /* bridge */ /* synthetic */ void x(int i, EpoxyHolder epoxyHolder) {
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void J(ViewDataBinding viewDataBinding) {
        if (!viewDataBinding.G(145, this.p)) {
            throw new IllegalStateException("The attribute item was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(2, this.q)) {
            throw new IllegalStateException("The attribute actionListener was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void K(ViewDataBinding viewDataBinding, EpoxyModel epoxyModel) {
        if (!(epoxyModel instanceof SngViewLandingContentBindingModel_)) {
            J(viewDataBinding);
            return;
        }
        SngViewLandingContentBindingModel_ sngViewLandingContentBindingModel_ = (SngViewLandingContentBindingModel_) epoxyModel;
        ContentItem contentItem = this.p;
        if (contentItem == null ? sngViewLandingContentBindingModel_.p != null : !contentItem.equals(sngViewLandingContentBindingModel_.p)) {
            viewDataBinding.G(145, this.p);
        }
        LandingContentActionListener landingContentActionListener = this.q;
        if ((landingContentActionListener == null) != (sngViewLandingContentBindingModel_.q == null)) {
            viewDataBinding.G(2, landingContentActionListener);
        }
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel, com.airbnb.epoxy.EpoxyModelWithHolder
    /* renamed from: L */
    public final void A(DataBindingEpoxyModel.DataBindingHolder dataBindingHolder) {
        super.A(dataBindingHolder);
        if (this.o != null) {
            LandingContentController.bindContentItem$lambda$9$lambda$8(this, dataBindingHolder);
        }
    }

    public final SngViewLandingContentBindingModel_ M(String str) {
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
        ContentItem contentItem;
        if (obj != this) {
            if ((obj instanceof SngViewLandingContentBindingModel_) && super.equals(obj)) {
                SngViewLandingContentBindingModel_ sngViewLandingContentBindingModel_ = (SngViewLandingContentBindingModel_) obj;
                if ((this.n == null) == (sngViewLandingContentBindingModel_.n == null)) {
                    if ((this.o == null) == (sngViewLandingContentBindingModel_.o == null) && ((contentItem = this.p) == null ? sngViewLandingContentBindingModel_.p == null : contentItem.equals(sngViewLandingContentBindingModel_.p))) {
                        if ((this.q == null) != (sngViewLandingContentBindingModel_.q == null)) {
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
        int iHashCode = ((((super.hashCode() * 31) + (this.n != null ? 1 : 0)) * 31) + (this.o != null ? 1 : 0)) * 29791;
        ContentItem contentItem = this.p;
        return ((iHashCode + (contentItem != null ? contentItem.hashCode() : 0)) * 31) + (this.q == null ? 0 : 1);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return com.woolworths.R.layout.epoxy_sng_view_landing_content;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "SngViewLandingContentBindingModel_{item=" + this.p + ", actionListener=" + this.q + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
