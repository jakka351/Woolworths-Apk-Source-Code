package au.com.woolworths.feature.rewards.offers.ui.details;

import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.rewards.offer.OfferDetailsAnalytics;
import au.com.woolworths.android.onesite.analytics.RewardsOfferAnalyticsData;
import au.com.woolworths.feature.rewards.offers.analytics.RewardsOfferAnalyticsManager;
import au.com.woolworths.feature.rewards.offers.detail.OfferDetailsContract;
import au.com.woolworths.feature.rewards.offers.detail.OfferDetailsViewModel;
import au.com.woolworths.feature.rewards.offers.domain.model.OfferDetailsPageResponse;
import au.com.woolworths.foundation.rewards.offers.model.analytics.BasicRewardsOfferStatusDataExtKt;
import au.com.woolworths.sdui.rewards.model.ActionData;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class OfferDetailsScreenKt$OfferDetailsScreen$3$5$1 extends FunctionReferenceImpl implements Function2<String, ActionData, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        OfferDetailsPageResponse.OfferDetailsPage offerDetailsPage;
        RewardsOfferAnalyticsData rewardsOfferAnalyticsData;
        final String str = (String) obj;
        ActionData p1 = (ActionData) obj2;
        Intrinsics.h(p1, "p1");
        OfferDetailsViewModel offerDetailsViewModel = (OfferDetailsViewModel) this.receiver;
        offerDetailsViewModel.getClass();
        final String str2 = p1.d;
        int iOrdinal = p1.e.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            throw new NoWhenBranchMatchedException();
        }
        offerDetailsViewModel.l.f(new OfferDetailsContract.Action.OpenUrl(str2));
        OfferDetailsContract.ViewState.Content contentB = ((OfferDetailsContract.ViewState) offerDetailsViewModel.n.getValue()).b();
        if (contentB != null && (offerDetailsPage = contentB.c) != null && (rewardsOfferAnalyticsData = offerDetailsPage.d) != null) {
            RewardsOfferAnalyticsManager rewardsOfferAnalyticsManager = offerDetailsViewModel.i;
            if (str == null) {
                str = "";
            }
            rewardsOfferAnalyticsManager.getClass();
            final OfferDetailsAnalytics.OfferDetails.Action action = BasicRewardsOfferStatusDataExtKt.b(rewardsOfferAnalyticsData).f;
            action.getClass();
            rewardsOfferAnalyticsManager.b.g(new Event(action, str, str2) { // from class: au.com.woolworths.analytics.rewards.offer.OfferDetailsAnalytics$OfferDetails$Action$bannerClick$1
                public final Object d;

                {
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(action.f4022a.e);
                    spreadBuilder.a(new Pair("event.Action", "banner_click"));
                    spreadBuilder.a(new Pair("event.Label", str));
                    androidx.constraintlayout.core.state.a.y("deeplink.url", androidx.compose.ui.input.pointer.a.m("event.Description", "OfferTracker", spreadBuilder, str2), spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getD() {
                    return "offer_banner_click";
                }

                public final boolean equals(Object obj3) {
                    if (!(obj3 instanceof Event)) {
                        return false;
                    }
                    Event event = (Event) obj3;
                    return "offer_banner_click".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.d;
                }
            });
        }
        return Unit.f24250a;
    }
}
