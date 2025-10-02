package au.com.woolworths.feature.rewards.offers.home.ui;

import au.com.woolworths.analytics.rewards.autoboost.AutoboostAnalytics;
import au.com.woolworths.analytics.rewards.autoboost.AutoboostAnalytics$Home$Action$Companion$errorDialogCtaClick$1;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.feature.rewards.offers.RewardsOfferBaseContract;
import au.com.woolworths.feature.rewards.offers.home.RewardsOffersHomeViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class HomeOffersSectionKt$HomeOffersSectionContentWithConfetti$1$12$1 extends FunctionReferenceImpl implements Function2<ContentCta, String, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ContentCta p0 = (ContentCta) obj;
        String p1 = (String) obj2;
        Intrinsics.h(p0, "p0");
        Intrinsics.h(p1, "p1");
        RewardsOffersHomeViewModel rewardsOffersHomeViewModel = (RewardsOffersHomeViewModel) this.receiver;
        rewardsOffersHomeViewModel.getClass();
        String url = p0.getUrl();
        if (url != null) {
            rewardsOffersHomeViewModel.g.f(new RewardsOfferBaseContract.Actions.OpenUrl(url));
        }
        AnalyticsManager analyticsManager = rewardsOffersHomeViewModel.p;
        AutoboostAnalytics.Home.Action.Companion companion = AutoboostAnalytics.Home.Action.d;
        String label = p0.getLabel();
        companion.getClass();
        Intrinsics.h(label, "label");
        analyticsManager.g(new AutoboostAnalytics$Home$Action$Companion$errorDialogCtaClick$1(label, p1));
        rewardsOffersHomeViewModel.s6();
        return Unit.f24250a;
    }
}
