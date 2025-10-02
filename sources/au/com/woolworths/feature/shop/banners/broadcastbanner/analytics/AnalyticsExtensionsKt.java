package au.com.woolworths.feature.shop.banners.broadcastbanner.analytics;

import androidx.constraintlayout.core.state.a;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.broadcastbanner.BroadcastBannerAnalytics;
import au.com.woolworths.analytics.supers.broadcastbanner.BroadcastBannerAnalytics$BroadcastBanner$Action$bannerClick$1;
import au.com.woolworths.analytics.supers.broadcastbanner.BroadcastBannerAnalytics$BroadcastBanner$Action$bannerDismiss$1;
import au.com.woolworths.analytics.supers.broadcastbanner.BroadcastBannerAnalytics$BroadcastBanner$Action$bannerImpression$1;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.foundation.shop.banners.broadcastbanner.data.BroadcastBannerData;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"banners_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AnalyticsExtensionsKt {
    /* JADX WARN: Type inference failed for: r1v1, types: [au.com.woolworths.analytics.supers.broadcastbanner.BroadcastBannerAnalytics$BroadcastBanner$Action$bannerClick$1] */
    public static final BroadcastBannerAnalytics$BroadcastBanner$Action$bannerClick$1 a(BroadcastBannerData broadcastBannerData, Screen screen) {
        Intrinsics.h(broadcastBannerData, "<this>");
        BroadcastBannerAnalytics.BroadcastBanner broadcastBanner = new BroadcastBannerAnalytics.BroadcastBanner(screen.getD(), screen.getE());
        final String analyticsLabel = broadcastBannerData.getAnalyticsLabel();
        if (analyticsLabel == null) {
            analyticsLabel = "";
        }
        final String bannerId = broadcastBannerData.getBannerId();
        final BroadcastBannerAnalytics.BroadcastBanner.Action action = broadcastBanner.h;
        action.getClass();
        return new Event(action, analyticsLabel, bannerId) { // from class: au.com.woolworths.analytics.supers.broadcastbanner.BroadcastBannerAnalytics$BroadcastBanner$Action$bannerClick$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                spreadBuilder.b(action.f4031a.g);
                spreadBuilder.a(new Pair("event.Category", "banner"));
                spreadBuilder.a(new Pair("event.Action", "click"));
                a.y("event.Label", analyticsLabel, spreadBuilder);
                spreadBuilder.a(new Pair("banner.BannerID", bannerId == null ? "" : bannerId));
                ArrayList arrayList = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getE() {
                return "banner_click";
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj;
                return "banner_click".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        };
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [au.com.woolworths.analytics.supers.broadcastbanner.BroadcastBannerAnalytics$BroadcastBanner$Action$bannerDismiss$1] */
    public static final BroadcastBannerAnalytics$BroadcastBanner$Action$bannerDismiss$1 b(BroadcastBannerData broadcastBannerData, Screen screen) {
        Intrinsics.h(broadcastBannerData, "<this>");
        BroadcastBannerAnalytics.BroadcastBanner broadcastBanner = new BroadcastBannerAnalytics.BroadcastBanner(screen.getD(), screen.getE());
        final String analyticsLabel = broadcastBannerData.getAnalyticsLabel();
        if (analyticsLabel == null) {
            analyticsLabel = "";
        }
        final String bannerId = broadcastBannerData.getBannerId();
        final BroadcastBannerAnalytics.BroadcastBanner.Action action = broadcastBanner.h;
        action.getClass();
        return new Event(action, analyticsLabel, bannerId) { // from class: au.com.woolworths.analytics.supers.broadcastbanner.BroadcastBannerAnalytics$BroadcastBanner$Action$bannerDismiss$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                spreadBuilder.b(action.f4031a.g);
                a.z("event.Category", "banner", spreadBuilder, "event.Action", "click");
                a.y("event.Label", "Close ".concat(analyticsLabel), spreadBuilder);
                a.z("banner.BannerID", bannerId == null ? "" : bannerId, spreadBuilder, "event.Description", "close banner");
                ArrayList arrayList = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getE() {
                return "banner_click";
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj;
                return "banner_click".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        };
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [au.com.woolworths.analytics.supers.broadcastbanner.BroadcastBannerAnalytics$BroadcastBanner$Action$bannerImpression$1] */
    public static final BroadcastBannerAnalytics$BroadcastBanner$Action$bannerImpression$1 c(BroadcastBannerData broadcastBannerData, Screen screen) {
        Intrinsics.h(broadcastBannerData, "<this>");
        BroadcastBannerAnalytics.BroadcastBanner broadcastBanner = new BroadcastBannerAnalytics.BroadcastBanner(screen.getD(), screen.getE());
        final String analyticsLabel = broadcastBannerData.getAnalyticsLabel();
        if (analyticsLabel == null) {
            analyticsLabel = "";
        }
        final String bannerId = broadcastBannerData.getBannerId();
        final BroadcastBannerAnalytics.BroadcastBanner.Action action = broadcastBanner.h;
        action.getClass();
        return new Event(action, analyticsLabel, bannerId) { // from class: au.com.woolworths.analytics.supers.broadcastbanner.BroadcastBannerAnalytics$BroadcastBanner$Action$bannerImpression$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                spreadBuilder.b(action.f4031a.g);
                spreadBuilder.a(new Pair("event.Category", "banner"));
                spreadBuilder.a(new Pair("event.Action", "impression"));
                a.y("event.Label", analyticsLabel, spreadBuilder);
                spreadBuilder.a(new Pair("banner.BannerID", bannerId == null ? "" : bannerId));
                ArrayList arrayList = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getE() {
                return "banner_impression";
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj;
                return "banner_impression".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        };
    }
}
