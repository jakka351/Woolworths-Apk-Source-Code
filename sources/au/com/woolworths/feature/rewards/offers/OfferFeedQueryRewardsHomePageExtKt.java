package au.com.woolworths.feature.rewards.offers;

import au.com.woolworths.base.rewards.account.data.RewardsBalanceData;
import au.com.woolworths.base.rewards.account.data.RewardsPointsData;
import au.com.woolworths.feature.rewards.offers.data.RewardsHomePage;
import com.woolworths.rewards.offers.OfferFeedQuery;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"offers_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OfferFeedQueryRewardsHomePageExtKt {
    public static final RewardsHomePage a(OfferFeedQuery.RewardsHomePage rewardsHomePage) {
        Intrinsics.h(rewardsHomePage, "<this>");
        OfferFeedQuery.PointsBalance pointsBalance = rewardsHomePage.f20725a.f20720a;
        return new RewardsHomePage(new RewardsBalanceData(new RewardsPointsData(null, pointsBalance.f20724a, pointsBalance.b, pointsBalance.d, pointsBalance.c, pointsBalance.e, pointsBalance.f), null, null, null, null));
    }
}
