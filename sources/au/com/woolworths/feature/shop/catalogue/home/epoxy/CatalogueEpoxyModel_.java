package au.com.woolworths.feature.shop.catalogue.home.epoxy;

import au.com.woolworths.feature.shop.catalogue.home.epoxy.CatalogueEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public class CatalogueEpoxyModel_ extends CatalogueEpoxyModel implements GeneratedModel<CatalogueEpoxyModel.Holder>, CatalogueEpoxyModelBuilder {
    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void A(Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder
    public final /* bridge */ /* synthetic */ void G(EpoxyHolder epoxyHolder) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder
    /* renamed from: H */
    public final /* bridge */ /* synthetic */ void x(int i, EpoxyHolder epoxyHolder) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder
    /* renamed from: I */
    public final /* bridge */ /* synthetic */ void A(EpoxyHolder epoxyHolder) {
    }

    public final CatalogueEpoxyModel_ K(String str) {
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
        if (obj != this) {
            if ((obj instanceof CatalogueEpoxyModel_) && super.equals(obj)) {
                CatalogueEpoxyModel_ catalogueEpoxyModel_ = (CatalogueEpoxyModel_) obj;
                String str = this.n;
                if (str == null ? catalogueEpoxyModel_.n == null : str.equals(catalogueEpoxyModel_.n)) {
                    String str2 = this.o;
                    if (str2 == null ? catalogueEpoxyModel_.o == null : str2.equals(catalogueEpoxyModel_.o)) {
                        String str3 = this.p;
                        if (str3 == null ? catalogueEpoxyModel_.p == null : str3.equals(catalogueEpoxyModel_.p)) {
                            CatalogueEpoxyModel.SneakPeekDecoration sneakPeekDecoration = this.q;
                            if (sneakPeekDecoration == null ? catalogueEpoxyModel_.q == null : sneakPeekDecoration.equals(catalogueEpoxyModel_.q)) {
                                String str4 = this.r;
                                if (str4 == null ? catalogueEpoxyModel_.r == null : str4.equals(catalogueEpoxyModel_.r)) {
                                    if (Float.compare(catalogueEpoxyModel_.s, this.s) == 0) {
                                        if ((this.t == null) != (catalogueEpoxyModel_.t == null)) {
                                        }
                                    }
                                }
                            }
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
        int iHashCode = super.hashCode() * 28629151;
        String str = this.n;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.o;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.p;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        CatalogueEpoxyModel.SneakPeekDecoration sneakPeekDecoration = this.q;
        int iHashCode5 = (iHashCode4 + (sneakPeekDecoration != null ? sneakPeekDecoration.hashCode() : 0)) * 31;
        String str4 = this.r;
        int iHashCode6 = (iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        float f = this.s;
        return ((iHashCode6 + (f != BitmapDescriptorFactory.HUE_RED ? Float.floatToIntBits(f) : 0)) * 31) + (this.t != null ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "CatalogueEpoxyModel_{title=" + this.n + ", validity=" + this.o + ", contentDescription=" + this.p + ", sneakPeek=" + this.q + ", image=" + this.r + ", imageAlpha=" + this.s + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
