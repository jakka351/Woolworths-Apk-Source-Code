package au.com.woolworths.feature.rewards.offers.ui.details;

import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.rewards.offer.OfferDetailsAnalytics;
import au.com.woolworths.android.onesite.analytics.RewardsOfferAnalyticsData;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.feature.rewards.offers.analytics.RewardsOfferAnalyticsManager;
import au.com.woolworths.feature.rewards.offers.detail.OfferDetailsContract;
import au.com.woolworths.feature.rewards.offers.detail.OfferDetailsViewModel;
import au.com.woolworths.feature.rewards.offers.domain.model.OfferDetailsPageResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class OfferDetailsScreenKt$OfferDetailsScreen$3$4$1 extends FunctionReferenceImpl implements Function1<ContentCta, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String label;
        ContentCta p0 = (ContentCta) obj;
        Intrinsics.h(p0, "p0");
        OfferDetailsViewModel offerDetailsViewModel = (OfferDetailsViewModel) this.receiver;
        offerDetailsViewModel.getClass();
        String url = p0.getUrl();
        if (url != null) {
            offerDetailsViewModel.l.f(new OfferDetailsContract.Action.OpenUrl(url));
        }
        OfferDetailsAnalytics.OfferDetails offerDetails = offerDetailsViewModel.p;
        OfferDetailsContract.ViewState.Content contentB = ((OfferDetailsContract.ViewState) offerDetailsViewModel.n.getValue()).b();
        OfferDetailsPageResponse.OfferDetailsPage offerDetailsPage = contentB != null ? contentB.c : null;
        if (offerDetails != null && offerDetailsPage != null) {
            RewardsOfferAnalyticsManager rewardsOfferAnalyticsManager = offerDetailsViewModel.i;
            RewardsOfferAnalyticsData offerAnalytics = offerDetailsPage.d;
            AnalyticsData onCtaClickAnalytics = p0.getOnCtaClickAnalytics();
            if (onCtaClickAnalytics == null || (label = onCtaClickAnalytics.getEventLabel()) == null) {
                label = p0.getLabel();
            }
            String eventLabel = label;
            String url2 = p0.getUrl();
            if (url2 == null) {
                url2 = "";
            }
            rewardsOfferAnalyticsManager.getClass();
            Intrinsics.h(offerAnalytics, "offerAnalytics");
            Intrinsics.h(eventLabel, "eventLabel");
            rewardsOfferAnalyticsManager.m(offerAnalytics, RewardsOfferAnalyticsManager.b(offerDetails), "offer page", eventLabel, url2, null);
        }
        return Unit.f24250a;
    }
}
