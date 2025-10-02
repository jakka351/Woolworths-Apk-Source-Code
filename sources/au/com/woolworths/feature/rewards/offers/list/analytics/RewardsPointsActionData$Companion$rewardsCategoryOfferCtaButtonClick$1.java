package au.com.woolworths.feature.rewards.offers.list.analytics;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.feature.rewards.offers.analytics.RewardsOfferScreen;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/feature/rewards/offers/list/analytics/RewardsPointsActionData$Companion$rewardsCategoryOfferCtaButtonClick$1", "Lau/com/woolworths/android/onesite/analytics/Action;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RewardsPointsActionData$Companion$rewardsCategoryOfferCtaButtonClick$1 implements Action {
    public final RewardsOfferScreen d = RewardsOfferScreen.e;
    public final Category e = Category.M;
    public final String f;

    public RewardsPointsActionData$Companion$rewardsCategoryOfferCtaButtonClick$1(String str) {
        this.f = str;
    }

    @Override // au.com.woolworths.android.onesite.analytics.BaseAction
    /* renamed from: a, reason: from getter */
    public final String getF() {
        return this.f;
    }

    @Override // au.com.woolworths.android.onesite.analytics.BaseAction
    /* renamed from: b, reason: from getter */
    public final Category getE() {
        return this.e;
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f */
    public final Screen getD() {
        return this.d;
    }
}
