package au.com.woolworths.feature.rewards.offers.ui.details;

import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.rewards.offer.OfferDetailsAnalytics;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.feature.rewards.offers.analytics.RewardsOfferAnalyticsManager;
import au.com.woolworths.feature.rewards.offers.detail.OfferDetailsContract;
import au.com.woolworths.feature.rewards.offers.detail.OfferDetailsViewModel;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class OfferDetailsScreenKt$OfferDetailsScreen$3$8$1$1 extends FunctionReferenceImpl implements Function1<ContentCta, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        final String eventLabel;
        ContentCta p0 = (ContentCta) obj;
        Intrinsics.h(p0, "p0");
        OfferDetailsViewModel offerDetailsViewModel = (OfferDetailsViewModel) this.receiver;
        offerDetailsViewModel.getClass();
        String url = p0.getUrl();
        if (url != null) {
            offerDetailsViewModel.l.f(new OfferDetailsContract.Action.OpenUrl(url));
            RewardsOfferAnalyticsManager rewardsOfferAnalyticsManager = offerDetailsViewModel.i;
            AnalyticsData onCtaClickAnalytics = p0.getOnCtaClickAnalytics();
            if (onCtaClickAnalytics == null || (eventLabel = onCtaClickAnalytics.getEventLabel()) == null) {
                eventLabel = p0.getLabel();
            }
            rewardsOfferAnalyticsManager.getClass();
            Intrinsics.h(eventLabel, "eventLabel");
            final OfferDetailsAnalytics.OfferDetailsError.Action action = new OfferDetailsAnalytics.OfferDetailsError().f;
            action.getClass();
            rewardsOfferAnalyticsManager.b.g(new Event(action, eventLabel) { // from class: au.com.woolworths.analytics.rewards.offer.OfferDetailsAnalytics$OfferDetailsError$Action$offerErrorCta$1
                public final Object d;

                {
                    SpreadBuilder spreadBuilder = new SpreadBuilder(3);
                    spreadBuilder.b(action.f4023a.e);
                    androidx.constraintlayout.core.state.a.z("event.Action", "button_click", spreadBuilder, "event.Label", eventLabel);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getD() {
                    return "error_button_click";
                }

                public final boolean equals(Object obj2) {
                    if (!(obj2 instanceof Event)) {
                        return false;
                    }
                    Event event = (Event) obj2;
                    return "error_button_click".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
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
