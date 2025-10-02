package au.com.woolworths.feature.shop.catalogue.home.epoxy;

import au.com.woolworths.feature.shop.catalogue.home.epoxy.ChangeStoreEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;

/* loaded from: classes3.dex */
public class ChangeStoreEpoxyModel_ extends ChangeStoreEpoxyModel implements GeneratedModel<ChangeStoreEpoxyModel.Holder>, ChangeStoreEpoxyModelBuilder {
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

    public final ChangeStoreEpoxyModel_ K() {
        super.p("change_store");
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
            if ((obj instanceof ChangeStoreEpoxyModel_) && super.equals(obj)) {
                ChangeStoreEpoxyModel_ changeStoreEpoxyModel_ = (ChangeStoreEpoxyModel_) obj;
                String str = this.n;
                if (str == null ? changeStoreEpoxyModel_.n == null : str.equals(changeStoreEpoxyModel_.n)) {
                    String str2 = this.o;
                    if (str2 == null ? changeStoreEpoxyModel_.o == null : str2.equals(changeStoreEpoxyModel_.o)) {
                        String str3 = this.p;
                        if (str3 == null ? changeStoreEpoxyModel_.p == null : str3.equals(changeStoreEpoxyModel_.p)) {
                            if ((this.q == null) != (changeStoreEpoxyModel_.q == null)) {
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
        return ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.q != null ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "ChangeStoreEpoxyModel_{storeName=" + this.n + ", postcode=" + this.o + ", buttonLabel=" + this.p + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
