package au.com.woolworths.shop.checkout.ui.components;

import android.view.ViewParent;
import au.com.woolworths.shop.checkout.domain.model.CheckoutPromotionCode;
import au.com.woolworths.shop.checkout.ui.components.ItemCheckoutPromotionCode;
import au.com.woolworths.shop.checkout.ui.product.CheckoutPromoCodeListener;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;

/* loaded from: classes4.dex */
public class ItemCheckoutPromotionCode_ extends ItemCheckoutPromotionCode implements GeneratedModel<ItemCheckoutPromotionCode.ViewHolder>, ItemCheckoutPromotionCodeBuilder {
    @Override // au.com.woolworths.shop.checkout.ui.components.ItemCheckoutPromotionCode, com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final void A(Object obj) {
        super.A((ItemCheckoutPromotionCode.ViewHolder) obj);
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder
    public final EpoxyHolder D(ViewParent viewParent) {
        return new ItemCheckoutPromotionCode.ViewHolder();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder
    public final /* bridge */ /* synthetic */ void G(EpoxyHolder epoxyHolder) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder
    /* renamed from: H */
    public final /* bridge */ /* synthetic */ void x(int i, EpoxyHolder epoxyHolder) {
    }

    @Override // au.com.woolworths.shop.checkout.ui.components.ItemCheckoutPromotionCode, com.airbnb.epoxy.EpoxyModelWithHolder
    /* renamed from: I */
    public final void A(EpoxyHolder epoxyHolder) {
        super.A((ItemCheckoutPromotionCode.ViewHolder) epoxyHolder);
    }

    public final ItemCheckoutPromotionCode_ L(String str) {
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
        if (!(obj instanceof ItemCheckoutPromotionCode_) || !super.equals(obj)) {
            return false;
        }
        ItemCheckoutPromotionCode_ itemCheckoutPromotionCode_ = (ItemCheckoutPromotionCode_) obj;
        CheckoutPromotionCode checkoutPromotionCode = this.n;
        if (checkoutPromotionCode == null ? itemCheckoutPromotionCode_.n != null : !checkoutPromotionCode.equals(itemCheckoutPromotionCode_.n)) {
            return false;
        }
        CheckoutPromoCodeListener checkoutPromoCodeListener = this.o;
        CheckoutPromoCodeListener checkoutPromoCodeListener2 = itemCheckoutPromotionCode_.o;
        return checkoutPromoCodeListener == null ? checkoutPromoCodeListener2 == null : checkoutPromoCodeListener.equals(checkoutPromoCodeListener2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int hashCode() {
        int iHashCode = super.hashCode() * 28629151;
        CheckoutPromotionCode checkoutPromotionCode = this.n;
        int iHashCode2 = (iHashCode + (checkoutPromotionCode != null ? checkoutPromotionCode.hashCode() : 0)) * 31;
        CheckoutPromoCodeListener checkoutPromoCodeListener = this.o;
        return iHashCode2 + (checkoutPromoCodeListener != null ? checkoutPromoCodeListener.hashCode() : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "ItemCheckoutPromotionCode_{promotionCode=" + this.n + ", listener=" + this.o + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
