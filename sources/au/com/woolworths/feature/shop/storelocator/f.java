package au.com.woolworths.feature.shop.storelocator;

import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.OnModelBoundListener;

/* loaded from: classes3.dex */
public final /* synthetic */ class f implements OnModelBoundListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ StoreLocatorEpoxyController e;

    public /* synthetic */ f(StoreLocatorEpoxyController storeLocatorEpoxyController, int i) {
        this.d = i;
        this.e = storeLocatorEpoxyController;
    }

    @Override // com.airbnb.epoxy.OnModelBoundListener
    public final void g(int i, EpoxyModel epoxyModel, Object obj) {
        switch (this.d) {
            case 0:
                StoreLocatorEpoxyController.buildModels$lambda$3$lambda$2$lambda$1(this.e, (ItemStoreLocatorLocationBindingModel_) epoxyModel, (DataBindingEpoxyModel.DataBindingHolder) obj, i);
                break;
            default:
                StoreLocatorEpoxyController.buildModels$lambda$7$lambda$6$lambda$5(this.e, (ItemStoreLocatorSuburbBindingModel_) epoxyModel, (DataBindingEpoxyModel.DataBindingHolder) obj, i);
                break;
        }
    }
}
