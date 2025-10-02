package au.com.woolworths.feature.rewards.offers;

import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ RewardsOffersEpoxyController e;

    public /* synthetic */ c(RewardsOffersEpoxyController rewardsOffersEpoxyController, int i) {
        this.d = i;
        this.e = rewardsOffersEpoxyController;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                return RewardsOffersEpoxyController.buildStandardBanner$lambda$9$lambda$7(this.e, (StandardBannerViewItem) obj);
            default:
                return RewardsOffersEpoxyController.buildProductOfferCarousel$lambda$27$lambda$26$lambda$25(this.e, ((Boolean) obj).booleanValue());
        }
    }
}
