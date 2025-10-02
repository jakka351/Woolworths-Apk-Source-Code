package au.com.woolworths.feature.rewards.offers.points.ui;

import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.feature.rewards.offers.RewardsOfferBaseContract;
import au.com.woolworths.feature.rewards.offers.analytics.RewardsOfferAnalyticsManager;
import au.com.woolworths.feature.rewards.offers.analytics.RewardsOfferScreen;
import au.com.woolworths.feature.rewards.offers.list.analytics.RewardsPointsActionData;
import au.com.woolworths.feature.rewards.offers.list.analytics.RewardsPointsActionData$Companion$rewardsCategoryOfferCtaButtonClick$1;
import au.com.woolworths.feature.rewards.offers.points.RewardsPointsViewModel;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class PointsScreenKt$PointsScreen$13$1 extends FunctionReferenceImpl implements Function2<RewardsOfferData, ContentCta, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        RewardsOfferData p0 = (RewardsOfferData) obj;
        ContentCta p1 = (ContentCta) obj2;
        Intrinsics.h(p0, "p0");
        Intrinsics.h(p1, "p1");
        RewardsPointsViewModel rewardsPointsViewModel = (RewardsPointsViewModel) this.receiver;
        rewardsPointsViewModel.getClass();
        String url = p1.getUrl();
        if (url != null) {
            rewardsPointsViewModel.g.f(new RewardsOfferBaseContract.Actions.OpenUrl(url));
            RewardsOfferAnalyticsManager rewardsOfferAnalyticsManager = rewardsPointsViewModel.u;
            RewardsOfferScreen rewardsOfferScreen = RewardsOfferScreen.e;
            RewardsPointsActionData.Companion companion = RewardsPointsActionData.e;
            String label = p1.getLabel();
            companion.getClass();
            Intrinsics.h(label, "label");
            rewardsOfferAnalyticsManager.p(p0, rewardsOfferScreen, url, new RewardsPointsActionData$Companion$rewardsCategoryOfferCtaButtonClick$1(label));
        }
        return Unit.f24250a;
    }
}
