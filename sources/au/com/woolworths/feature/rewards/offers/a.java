package au.com.woolworths.feature.rewards.offers;

import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.OnModelBoundListener;
import com.airbnb.epoxy.OnModelVisibilityStateChangedListener;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements OnModelVisibilityStateChangedListener, OnModelBoundListener {
    public final /* synthetic */ Object d;

    public /* synthetic */ a(Object obj) {
        this.d = obj;
    }

    public void a(DataBindingEpoxyModel dataBindingEpoxyModel, DataBindingEpoxyModel.DataBindingHolder dataBindingHolder, int i) {
        RewardsOffersEpoxyController.buildProductOfferCarousel$lambda$23$lambda$22((RewardsOffersEpoxyController) this.d, (ItemRewardsProductOfferTileBindingModel_) dataBindingEpoxyModel, dataBindingHolder, i);
    }

    @Override // com.airbnb.epoxy.OnModelBoundListener
    public void g(int i, EpoxyModel epoxyModel, Object obj) {
        RewardsOffersEpoxyController.buildStandardBanner$lambda$9$lambda$6((StandardBannerViewItem) this.d, (ItemStandardBannerBindingModel_) epoxyModel, (DataBindingEpoxyModel.DataBindingHolder) obj, i);
    }
}
