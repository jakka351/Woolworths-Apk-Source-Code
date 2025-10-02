package au.com.woolworths.shop.checkout.ui.components;

import android.view.ViewParent;
import au.com.woolworths.shop.checkout.ui.components.ConfirmationIconTextBannerEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;

/* loaded from: classes4.dex */
public class ConfirmationIconTextBannerEpoxyModel_ extends ConfirmationIconTextBannerEpoxyModel implements GeneratedModel<ConfirmationIconTextBannerEpoxyModel.ViewHolder>, ConfirmationIconTextBannerEpoxyModelBuilder {
    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void A(Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder
    public final EpoxyHolder D(ViewParent viewParent) {
        return new ConfirmationIconTextBannerEpoxyModel.ViewHolder();
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

    public final ConfirmationIconTextBannerEpoxyModel_ K(String str) {
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
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConfirmationIconTextBannerEpoxyModel_) || !super.equals(obj)) {
            return false;
        }
        ConfirmationIconTextBannerEpoxyModel_ confirmationIconTextBannerEpoxyModel_ = (ConfirmationIconTextBannerEpoxyModel_) obj;
        String str = this.n;
        if (str == null ? confirmationIconTextBannerEpoxyModel_.n != null : !str.equals(confirmationIconTextBannerEpoxyModel_.n)) {
            return false;
        }
        String str2 = this.o;
        String str3 = confirmationIconTextBannerEpoxyModel_.o;
        return str2 == null ? str3 == null : str2.equals(str3);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int hashCode() {
        int iHashCode = super.hashCode() * 28629151;
        String str = this.n;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.o;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "ConfirmationIconTextBannerEpoxyModel_{imageUrl=" + this.n + ", title=" + this.o + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
