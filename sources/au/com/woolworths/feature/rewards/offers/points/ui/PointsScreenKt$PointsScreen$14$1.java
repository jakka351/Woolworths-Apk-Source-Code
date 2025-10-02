package au.com.woolworths.feature.rewards.offers.points.ui;

import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.feature.rewards.offers.list.RewardsOfferListFullPageErrorState;
import au.com.woolworths.feature.rewards.offers.list.analytics.RewardsPointsActionData;
import au.com.woolworths.feature.rewards.offers.points.RewardsPointsViewModel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class PointsScreenKt$PointsScreen$14$1 extends FunctionReferenceImpl implements Function1<RewardsOfferListFullPageErrorState, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        RewardsOfferListFullPageErrorState p0 = (RewardsOfferListFullPageErrorState) obj;
        Intrinsics.h(p0, "p0");
        RewardsPointsViewModel rewardsPointsViewModel = (RewardsPointsViewModel) this.receiver;
        AnalyticsManager analyticsManager = rewardsPointsViewModel.p;
        int iOrdinal = p0.ordinal();
        if (iOrdinal == 0) {
            analyticsManager.c(RewardsPointsActionData.t);
            rewardsPointsViewModel.y6();
        } else {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                analyticsManager.c(RewardsPointsActionData.t);
                rewardsPointsViewModel.y6();
            }
            analyticsManager.c(RewardsPointsActionData.u);
            rewardsPointsViewModel.y6();
        }
        return Unit.f24250a;
    }
}
