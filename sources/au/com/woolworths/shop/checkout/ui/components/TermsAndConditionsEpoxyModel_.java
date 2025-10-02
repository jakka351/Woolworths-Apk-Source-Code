package au.com.woolworths.shop.checkout.ui.components;

import android.view.ViewParent;
import au.com.woolworths.shop.checkout.domain.model.CheckoutTermsConditions;
import au.com.woolworths.shop.checkout.ui.components.TermsAndConditionsEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;

/* loaded from: classes4.dex */
public class TermsAndConditionsEpoxyModel_ extends TermsAndConditionsEpoxyModel implements GeneratedModel<TermsAndConditionsEpoxyModel.ViewHolder>, TermsAndConditionsEpoxyModelBuilder {
    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void A(Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder
    public final EpoxyHolder D(ViewParent viewParent) {
        return new TermsAndConditionsEpoxyModel.ViewHolder();
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

    public final TermsAndConditionsEpoxyModel_ K(String str) {
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
            if ((obj instanceof TermsAndConditionsEpoxyModel_) && super.equals(obj)) {
                TermsAndConditionsEpoxyModel_ termsAndConditionsEpoxyModel_ = (TermsAndConditionsEpoxyModel_) obj;
                CheckoutTermsConditions checkoutTermsConditions = this.n;
                if (checkoutTermsConditions == null ? termsAndConditionsEpoxyModel_.n == null : checkoutTermsConditions.equals(termsAndConditionsEpoxyModel_.n)) {
                    if ((this.o == null) != (termsAndConditionsEpoxyModel_.o == null)) {
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
        CheckoutTermsConditions checkoutTermsConditions = this.n;
        return ((iHashCode + (checkoutTermsConditions != null ? checkoutTermsConditions.f10590a.hashCode() : 0)) * 31) + (this.o != null ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "TermsAndConditionsEpoxyModel_{termsConditions=" + this.n + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
