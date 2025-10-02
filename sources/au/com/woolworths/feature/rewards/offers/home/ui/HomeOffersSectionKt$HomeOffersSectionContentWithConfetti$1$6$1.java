package au.com.woolworths.feature.rewards.offers.home.ui;

import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.feature.rewards.offers.home.RewardsOffersHomeViewModel;
import au.com.woolworths.feature.rewards.offers.list.RewardsOfferListFullPageErrorState;
import au.com.woolworths.feature.rewards.offers.list.analytics.RewardsPointsActionData;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class HomeOffersSectionKt$HomeOffersSectionContentWithConfetti$1$6$1 extends FunctionReferenceImpl implements Function1<RewardsOfferListFullPageErrorState, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        RewardsOfferListFullPageErrorState p0 = (RewardsOfferListFullPageErrorState) obj;
        Intrinsics.h(p0, "p0");
        RewardsOffersHomeViewModel rewardsOffersHomeViewModel = (RewardsOffersHomeViewModel) this.receiver;
        AnalyticsManager analyticsManager = rewardsOffersHomeViewModel.p;
        int iOrdinal = p0.ordinal();
        if (iOrdinal == 0) {
            analyticsManager.c(RewardsPointsActionData.t);
            rewardsOffersHomeViewModel.v6();
        } else {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                analyticsManager.c(RewardsPointsActionData.t);
                rewardsOffersHomeViewModel.v6();
            }
            analyticsManager.c(RewardsPointsActionData.u);
            rewardsOffersHomeViewModel.v6();
        }
        return Unit.f24250a;
    }
}
