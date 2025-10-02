package au.com.woolworths.feature.rewards.offers.points.ui;

import au.com.woolworths.feature.rewards.offers.analytics.RewardsOfferScreen;
import au.com.woolworths.feature.rewards.offers.list.analytics.RewardsPointsActionData;
import au.com.woolworths.feature.rewards.offers.points.RewardsPointsContract;
import au.com.woolworths.feature.rewards.offers.points.RewardsPointsViewModel;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class PointsScreenKt$PointsScreen$11$1 extends FunctionReferenceImpl implements Function1<RewardsOfferData, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        RewardsOfferData p0 = (RewardsOfferData) obj;
        Intrinsics.h(p0, "p0");
        RewardsPointsViewModel rewardsPointsViewModel = (RewardsPointsViewModel) this.receiver;
        rewardsPointsViewModel.getClass();
        rewardsPointsViewModel.u.o(p0, RewardsOfferScreen.e, RewardsPointsActionData.i);
        rewardsPointsViewModel.g.f(new RewardsPointsContract.Actions.ShowOfferDetailsScreen(p0.d));
        return Unit.f24250a;
    }
}
