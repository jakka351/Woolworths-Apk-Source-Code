package au.com.woolworths.shop.checkout.ui.components;

import android.text.SpannableStringBuilder;
import android.view.ViewParent;
import au.com.woolworths.shop.checkout.domain.model.breakdown.OrderTotalDetailsSection;
import au.com.woolworths.shop.checkout.ui.components.OrderTotalSectionEpoxyModel;
import au.com.woolworths.shop.checkout.ui.listener.OrderTotalListener;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;

/* loaded from: classes4.dex */
public class OrderTotalSectionEpoxyModel_ extends OrderTotalSectionEpoxyModel implements GeneratedModel<OrderTotalSectionEpoxyModel.ViewHolder>, OrderTotalSectionEpoxyModelBuilder {
    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void A(Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder
    public final EpoxyHolder D(ViewParent viewParent) {
        return new OrderTotalSectionEpoxyModel.ViewHolder();
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

    public final OrderTotalSectionEpoxyModel_ M(String str) {
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
        if (!(obj instanceof OrderTotalSectionEpoxyModel_) || !super.equals(obj)) {
            return false;
        }
        OrderTotalSectionEpoxyModel_ orderTotalSectionEpoxyModel_ = (OrderTotalSectionEpoxyModel_) obj;
        OrderTotalDetailsSection orderTotalDetailsSection = this.n;
        if (orderTotalDetailsSection == null ? orderTotalSectionEpoxyModel_.n != null : !orderTotalDetailsSection.equals(orderTotalSectionEpoxyModel_.n)) {
            return false;
        }
        OrderTotalListener orderTotalListener = this.o;
        if (orderTotalListener == null ? orderTotalSectionEpoxyModel_.o != null : !orderTotalListener.equals(orderTotalSectionEpoxyModel_.o)) {
            return false;
        }
        SpannableStringBuilder spannableStringBuilder = this.p;
        return spannableStringBuilder == null ? orderTotalSectionEpoxyModel_.p == null : spannableStringBuilder.equals(orderTotalSectionEpoxyModel_.p);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int hashCode() {
        int iHashCode = super.hashCode() * 28629151;
        OrderTotalDetailsSection orderTotalDetailsSection = this.n;
        int iHashCode2 = (iHashCode + (orderTotalDetailsSection != null ? orderTotalDetailsSection.hashCode() : 0)) * 31;
        OrderTotalListener orderTotalListener = this.o;
        int iHashCode3 = (iHashCode2 + (orderTotalListener != null ? orderTotalListener.hashCode() : 0)) * 31;
        SpannableStringBuilder spannableStringBuilder = this.p;
        return iHashCode3 + (spannableStringBuilder != null ? spannableStringBuilder.hashCode() : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "OrderTotalSectionEpoxyModel_{orderTotalDetails=" + this.n + ", orderTotalListener=" + this.o + ", valueText=" + ((Object) this.p) + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
