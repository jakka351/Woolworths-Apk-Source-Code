package au.com.woolworths.shop.buyagain.ui.legacy.footer;

import android.view.View;
import android.view.ViewGroup;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;

/* loaded from: classes4.dex */
public class BuyAgainFooterViewModel_ extends EpoxyModel<BuyAgainFooterView> implements GeneratedModel<BuyAgainFooterView>, BuyAgainFooterViewModelBuilder {
    @Override // com.airbnb.epoxy.EpoxyModel
    public final void A(Object obj) {
        ((BuyAgainFooterView) obj).setBuyAgainFooterListener(null);
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
        return (obj instanceof BuyAgainFooterViewModel_) && super.equals(obj);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void g(EpoxyModel epoxyModel, Object obj) {
        BuyAgainFooterView buyAgainFooterView = (BuyAgainFooterView) obj;
        if (epoxyModel instanceof BuyAgainFooterViewModel_) {
            return;
        }
        buyAgainFooterView.setBuyAgainFooterListener(null);
        buyAgainFooterView.setFooterState(null);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void h(Object obj) {
        BuyAgainFooterView buyAgainFooterView = (BuyAgainFooterView) obj;
        buyAgainFooterView.setBuyAgainFooterListener(null);
        buyAgainFooterView.setFooterState(null);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int hashCode() {
        return super.hashCode() * 887503681;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final View j(ViewGroup viewGroup) {
        BuyAgainFooterView buyAgainFooterView = new BuyAgainFooterView(viewGroup.getContext());
        buyAgainFooterView.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        return buyAgainFooterView;
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
        return "BuyAgainFooterViewModel_{footerState_FooterState=null, buyAgainFooterListener_BuyAgainFooterListener=null}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
