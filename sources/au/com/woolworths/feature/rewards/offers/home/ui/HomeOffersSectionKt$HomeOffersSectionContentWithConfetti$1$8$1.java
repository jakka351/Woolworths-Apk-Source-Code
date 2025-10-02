package au.com.woolworths.feature.rewards.offers.home.ui;

import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.feature.rewards.offers.SpinSurpriseBannerViewItem;
import au.com.woolworths.feature.rewards.offers.home.RewardsOffersHomeViewModel;
import au.com.woolworths.feature.rewards.offers.list.analytics.RewardsPointsActionData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class HomeOffersSectionKt$HomeOffersSectionContentWithConfetti$1$8$1 extends FunctionReferenceImpl implements Function1<SpinSurpriseBannerViewItem, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SpinSurpriseBannerViewItem p0 = (SpinSurpriseBannerViewItem) obj;
        Intrinsics.h(p0, "p0");
        RewardsOffersHomeViewModel rewardsOffersHomeViewModel = (RewardsOffersHomeViewModel) this.receiver;
        rewardsOffersHomeViewModel.getClass();
        if (rewardsOffersHomeViewModel.h.add(p0.getB())) {
            rewardsOffersHomeViewModel.e.j(RewardsPointsActionData.l, TrackingMetadata.Companion.a(TrackableValue.m, p0.b));
        }
        return Unit.f24250a;
    }
}
