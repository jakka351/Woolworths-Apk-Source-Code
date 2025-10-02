package au.com.woolworths.shop.checkout.ui.components;

import android.view.ViewParent;
import au.com.woolworths.shop.checkout.domain.model.CheckoutProducts;
import au.com.woolworths.shop.checkout.ui.components.ItemCheckoutProductsSubstitution;
import au.com.woolworths.shop.checkout.ui.product.CheckoutProductListener;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;

/* loaded from: classes4.dex */
public class ItemCheckoutProductsSubstitution_ extends ItemCheckoutProductsSubstitution implements GeneratedModel<ItemCheckoutProductsSubstitution.ViewHolder>, ItemCheckoutProductsSubstitutionBuilder {
    @Override // au.com.woolworths.shop.checkout.ui.components.ItemCheckoutProductsSubstitution, com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final void A(Object obj) {
        super.A((ItemCheckoutProductsSubstitution.ViewHolder) obj);
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder
    public final EpoxyHolder D(ViewParent viewParent) {
        return new ItemCheckoutProductsSubstitution.ViewHolder();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder
    public final /* bridge */ /* synthetic */ void G(EpoxyHolder epoxyHolder) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder
    /* renamed from: H */
    public final /* bridge */ /* synthetic */ void x(int i, EpoxyHolder epoxyHolder) {
    }

    @Override // au.com.woolworths.shop.checkout.ui.components.ItemCheckoutProductsSubstitution, com.airbnb.epoxy.EpoxyModelWithHolder
    /* renamed from: I */
    public final void A(EpoxyHolder epoxyHolder) {
        super.A((ItemCheckoutProductsSubstitution.ViewHolder) epoxyHolder);
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
        if (!(obj instanceof ItemCheckoutProductsSubstitution_) || !super.equals(obj)) {
            return false;
        }
        ItemCheckoutProductsSubstitution_ itemCheckoutProductsSubstitution_ = (ItemCheckoutProductsSubstitution_) obj;
        CheckoutProducts checkoutProducts = this.n;
        if (checkoutProducts == null ? itemCheckoutProductsSubstitution_.n != null : !checkoutProducts.equals(itemCheckoutProductsSubstitution_.n)) {
            return false;
        }
        CheckoutProductListener checkoutProductListener = this.o;
        CheckoutProductListener checkoutProductListener2 = itemCheckoutProductsSubstitution_.o;
        return checkoutProductListener == null ? checkoutProductListener2 == null : checkoutProductListener.equals(checkoutProductListener2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int hashCode() {
        int iHashCode = super.hashCode() * 28629151;
        CheckoutProducts checkoutProducts = this.n;
        int iHashCode2 = (iHashCode + (checkoutProducts != null ? checkoutProducts.hashCode() : 0)) * 31;
        CheckoutProductListener checkoutProductListener = this.o;
        return iHashCode2 + (checkoutProductListener != null ? checkoutProductListener.hashCode() : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "ItemCheckoutProductsSubstitution_{products=" + this.n + ", listener=" + this.o + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
