package au.com.woolworths.feature.rewards.offers.home.ui;

import au.com.woolworths.feature.rewards.offers.home.RewardsOffersHomeViewModel;
import au.com.woolworths.feature.rewards.offers.list.analytics.RewardsPointsActionData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class HomeOffersSectionKt$HomeOffersSectionContentWithConfetti$1$10$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        RewardsOffersHomeViewModel rewardsOffersHomeViewModel = (RewardsOffersHomeViewModel) this.receiver;
        if (!rewardsOffersHomeViewModel.w) {
            rewardsOffersHomeViewModel.w = true;
            rewardsOffersHomeViewModel.p.c(RewardsPointsActionData.j);
        }
        return Unit.f24250a;
    }
}
