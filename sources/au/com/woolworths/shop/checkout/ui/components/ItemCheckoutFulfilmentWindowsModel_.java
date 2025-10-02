package au.com.woolworths.shop.checkout.ui.components;

import android.view.View;
import android.view.ViewGroup;
import au.com.woolworths.product.details.d;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;
import shop.checkout.ItemCheckoutFulfilmentWindowsBinding;

/* loaded from: classes4.dex */
public class ItemCheckoutFulfilmentWindowsModel_ extends EpoxyModel<ItemCheckoutFulfilmentWindows> implements GeneratedModel<ItemCheckoutFulfilmentWindows>, ItemCheckoutFulfilmentWindowsModelBuilder {
    @Override // com.airbnb.epoxy.EpoxyModel
    public final void A(Object obj) {
        ((ItemCheckoutFulfilmentWindows) obj).setListener(null);
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    public final void a(int i, Object obj) {
        ItemCheckoutFulfilmentWindows itemCheckoutFulfilmentWindows = (ItemCheckoutFulfilmentWindows) obj;
        B(i, "The model was changed during the bind call.");
        ItemCheckoutFulfilmentWindowsBinding itemCheckoutFulfilmentWindowsBinding = itemCheckoutFulfilmentWindows.d;
        itemCheckoutFulfilmentWindowsBinding.L(itemCheckoutFulfilmentWindows.getTitle());
        itemCheckoutFulfilmentWindowsBinding.y.F0(new d(itemCheckoutFulfilmentWindows, 10));
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    public final void b(int i, Object obj) {
        B(i, "The model was changed between being added to the controller and being bound.");
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void c(EpoxyController epoxyController) {
        epoxyController.addInternal(this);
        d(epoxyController);
        throw null;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ItemCheckoutFulfilmentWindowsModel_) && super.equals(obj);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void g(EpoxyModel epoxyModel, Object obj) {
        ItemCheckoutFulfilmentWindows itemCheckoutFulfilmentWindows = (ItemCheckoutFulfilmentWindows) obj;
        if (epoxyModel instanceof ItemCheckoutFulfilmentWindowsModel_) {
            return;
        }
        itemCheckoutFulfilmentWindows.fulfilmentWindows = null;
        itemCheckoutFulfilmentWindows.setListener(null);
        itemCheckoutFulfilmentWindows.title = null;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void h(Object obj) {
        ItemCheckoutFulfilmentWindows itemCheckoutFulfilmentWindows = (ItemCheckoutFulfilmentWindows) obj;
        itemCheckoutFulfilmentWindows.fulfilmentWindows = null;
        itemCheckoutFulfilmentWindows.setListener(null);
        itemCheckoutFulfilmentWindows.title = null;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int hashCode() {
        return super.hashCode() * 1742810335;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final View j(ViewGroup viewGroup) {
        ItemCheckoutFulfilmentWindows itemCheckoutFulfilmentWindows = new ItemCheckoutFulfilmentWindows(viewGroup.getContext());
        itemCheckoutFulfilmentWindows.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        return itemCheckoutFulfilmentWindows;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        throw new UnsupportedOperationException("Layout resources are unsupported for views created programmatically.");
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int m(int i, int i2, int i3) {
        return i;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int n() {
        return 0;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "ItemCheckoutFulfilmentWindowsModel_{title_String=null, fulfilmentWindows_FulfilmentWindows=null, listener_FulfilmentWindowsListener=null}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
