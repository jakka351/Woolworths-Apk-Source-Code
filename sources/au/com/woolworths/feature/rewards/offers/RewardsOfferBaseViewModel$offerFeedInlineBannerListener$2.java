package au.com.woolworths.feature.rewards.offers;

import androidx.constraintlayout.core.state.a;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.rewards.autoboost.AutoboostAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
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
final /* synthetic */ class RewardsOfferBaseViewModel$offerFeedInlineBannerListener$2 extends FunctionReferenceImpl implements Function1<OfferFeedInlineBannerViewItem, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        OfferFeedInlineBannerViewItem p0 = (OfferFeedInlineBannerViewItem) obj;
        Intrinsics.h(p0, "p0");
        AnalyticsManager analyticsManager = ((RewardsOfferBaseViewModel) this.receiver).e;
        AutoboostAnalytics.Home.Action.Companion companion = AutoboostAnalytics.Home.Action.d;
        final String str = p0.c;
        companion.getClass();
        analyticsManager.g(new Event(str) { // from class: au.com.woolworths.analytics.rewards.autoboost.AutoboostAnalytics$Home$Action$Companion$inlineBannerImpression$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                spreadBuilder.b(AutoboostAnalytics.Home.e);
                spreadBuilder.a(new Pair("event.Category", "Auto Boost"));
                spreadBuilder.a(new Pair("event.Action", "banner_impression"));
                a.y("event.Label", str, spreadBuilder);
                ArrayList arrayList = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getE() {
                return "rw_autoboost_banner_impression";
            }

            public final boolean equals(Object obj2) {
                if (!(obj2 instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj2;
                return "rw_autoboost_banner_impression".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        });
        return Unit.f24250a;
    }
}
