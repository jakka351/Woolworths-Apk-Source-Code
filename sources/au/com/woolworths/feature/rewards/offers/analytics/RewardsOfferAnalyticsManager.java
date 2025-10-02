package au.com.woolworths.feature.rewards.offers.analytics;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.Screen;
import au.com.woolworths.analytics.model.AnalyticsExtraContent;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.analytics.rewards.offer.OfferImpressionAnalytics;
import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.RewardsOfferAnalyticsData;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor;
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractorKt;
import au.com.woolworths.feature.rewards.offers.list.analytics.RewardsPointsActionData$Companion$rewardsCategoryOfferCtaButtonClick$1;
import au.com.woolworths.foundation.rewards.offers.model.OfferDetailsCta;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferData;
import au.com.woolworths.foundation.rewards.offers.model.analytics.BasicRewardsOfferStatusDataExtKt;
import au.com.woolworths.rewards.base.RewardsBaseFeature;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/analytics/RewardsOfferAnalyticsManager;", "", "LegacyAnalyticsData", "ScreenData", "Companion", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RewardsOfferAnalyticsManager {

    /* renamed from: a, reason: collision with root package name */
    public final RewardsAccountInteractor f6259a;
    public final AnalyticsManager b;
    public final FeatureToggleManager c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\t"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/analytics/RewardsOfferAnalyticsManager$Companion;", "", "", "PROPERTY_APP_SECTION", "Ljava/lang/String;", "OFFER_FEATURE_LEGACY", "OFFER_FEATURE_OFFER_TRACKER", "LIST_CTA_CATEGORY_OFFER_TILE", "LIST_CTA_CATEGORY_OFFER_DETAILS", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/analytics/RewardsOfferAnalyticsManager$LegacyAnalyticsData;", "", "GeneratedEvent", "NonGeneratedAction", "NonGeneratedActionWithData", "Lau/com/woolworths/feature/rewards/offers/analytics/RewardsOfferAnalyticsManager$LegacyAnalyticsData$GeneratedEvent;", "Lau/com/woolworths/feature/rewards/offers/analytics/RewardsOfferAnalyticsManager$LegacyAnalyticsData$NonGeneratedAction;", "Lau/com/woolworths/feature/rewards/offers/analytics/RewardsOfferAnalyticsManager$LegacyAnalyticsData$NonGeneratedActionWithData;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface LegacyAnalyticsData {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/analytics/RewardsOfferAnalyticsManager$LegacyAnalyticsData$GeneratedEvent;", "Lau/com/woolworths/feature/rewards/offers/analytics/RewardsOfferAnalyticsManager$LegacyAnalyticsData;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class GeneratedEvent implements LegacyAnalyticsData {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof GeneratedEvent) {
                    throw null;
                }
                return false;
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                throw null;
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/analytics/RewardsOfferAnalyticsManager$LegacyAnalyticsData$NonGeneratedAction;", "Lau/com/woolworths/feature/rewards/offers/analytics/RewardsOfferAnalyticsManager$LegacyAnalyticsData;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class NonGeneratedAction implements LegacyAnalyticsData {

            /* renamed from: a, reason: collision with root package name */
            public final Action f6260a;

            public NonGeneratedAction(Action action) {
                Intrinsics.h(action, "action");
                this.f6260a = action;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NonGeneratedAction) && Intrinsics.c(this.f6260a, ((NonGeneratedAction) obj).f6260a);
            }

            public final int hashCode() {
                return this.f6260a.hashCode();
            }

            public final String toString() {
                return "NonGeneratedAction(action=" + this.f6260a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/analytics/RewardsOfferAnalyticsManager$LegacyAnalyticsData$NonGeneratedActionWithData;", "Lau/com/woolworths/feature/rewards/offers/analytics/RewardsOfferAnalyticsManager$LegacyAnalyticsData;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class NonGeneratedActionWithData implements LegacyAnalyticsData {

            /* renamed from: a, reason: collision with root package name */
            public final Action f6261a;
            public final TrackingMetadata b;

            public NonGeneratedActionWithData(Action action, TrackingMetadata trackingMetadata) {
                Intrinsics.h(action, "action");
                this.f6261a = action;
                this.b = trackingMetadata;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof NonGeneratedActionWithData)) {
                    return false;
                }
                NonGeneratedActionWithData nonGeneratedActionWithData = (NonGeneratedActionWithData) obj;
                return Intrinsics.c(this.f6261a, nonGeneratedActionWithData.f6261a) && Intrinsics.c(this.b, nonGeneratedActionWithData.b);
            }

            public final int hashCode() {
                return this.b.d.hashCode() + (this.f6261a.hashCode() * 31);
            }

            public final String toString() {
                return "NonGeneratedActionWithData(action=" + this.f6261a + ", trackingMetadata=" + this.b + ")";
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/analytics/RewardsOfferAnalyticsManager$ScreenData;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ScreenData {

        /* renamed from: a, reason: collision with root package name */
        public final String f6262a;
        public final String b;
        public final String c;

        public ScreenData(String appSection, String screenName, String str) {
            Intrinsics.h(appSection, "appSection");
            Intrinsics.h(screenName, "screenName");
            this.f6262a = appSection;
            this.b = screenName;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ScreenData)) {
                return false;
            }
            ScreenData screenData = (ScreenData) obj;
            return Intrinsics.c(this.f6262a, screenData.f6262a) && Intrinsics.c(this.b, screenData.b) && Intrinsics.c(this.c, screenData.c);
        }

        public final int hashCode() {
            int iC = b.c(this.f6262a.hashCode() * 31, 31, this.b);
            String str = this.c;
            return iC + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.o(a.v("ScreenData(appSection=", this.f6262a, ", screenName=", this.b, ", screenType="), this.c, ")");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6263a;

        static {
            int[] iArr = new int[Region.values().length];
            try {
                Region.Companion companion = Region.h;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Region.Companion companion2 = Region.h;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f6263a = iArr;
        }
    }

    public RewardsOfferAnalyticsManager(RewardsAccountInteractor rewardsAccountInteractor, AnalyticsManager analyticsManager, FeatureToggleManager featureToggleManager) {
        Intrinsics.h(rewardsAccountInteractor, "rewardsAccountInteractor");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.f6259a = rewardsAccountInteractor;
        this.b = analyticsManager;
        this.c = featureToggleManager;
    }

    public static ScreenData b(Screen screen) {
        Object obj = screen.getData().get("app.Section");
        String string = obj != null ? obj.toString() : null;
        if (string == null) {
            string = "";
        }
        Map data = screen.getData();
        TrackableValue trackableValue = TrackableValue.e;
        Object obj2 = data.get("screen.Name");
        String string2 = obj2 != null ? obj2.toString() : null;
        String str = string2 != null ? string2 : "";
        Object obj3 = screen.getData().get("screen.Type");
        return new ScreenData(string, str, obj3 != null ? obj3.toString() : null);
    }

    public static ScreenData c(au.com.woolworths.android.onesite.analytics.Screen screen) {
        String e = screen.getE();
        String d = screen.getD();
        HashMap mapL = screen.l();
        TrackableValue trackableValue = TrackableValue.e;
        Object obj = mapL.get("screen.Type");
        return new ScreenData(e, d, obj != null ? obj.toString() : null);
    }

    public static Map d(List list) {
        Pair pair;
        if (list == null) {
            return EmptyMap.d;
        }
        List<AnalyticsExtraContent> list2 = list;
        int iH = MapsKt.h(CollectionsKt.s(list2, 10));
        if (iH < 16) {
            iH = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iH);
        for (AnalyticsExtraContent analyticsExtraContent : list2) {
            if (analyticsExtraContent.getValue() != null) {
                String key = analyticsExtraContent.getKey();
                String value = analyticsExtraContent.getValue();
                if (value == null) {
                    value = "";
                }
                pair = new Pair(key, value);
            } else {
                String key2 = analyticsExtraContent.getKey();
                List values = analyticsExtraContent.getValues();
                Object objB = values != null ? CollectionsKt.B(values) : null;
                if (objB == null) {
                    objB = EmptyList.d;
                }
                pair = new Pair(key2, objB);
            }
            linkedHashMap.put(pair.d, pair.e);
        }
        return linkedHashMap;
    }

    public static void g(RewardsOfferAnalyticsManager rewardsOfferAnalyticsManager, RewardsOfferData offer, au.com.woolworths.android.onesite.analytics.Screen screen, Action legacyAction) {
        rewardsOfferAnalyticsManager.getClass();
        Intrinsics.h(offer, "offer");
        Intrinsics.h(screen, "screen");
        Intrinsics.h(legacyAction, "legacyAction");
        rewardsOfferAnalyticsManager.e(CollectionsKt.Q(offer), screen, legacyAction, null);
    }

    public static void j(RewardsOfferAnalyticsManager rewardsOfferAnalyticsManager, RewardsOfferData rewardsOfferData, au.com.woolworths.android.onesite.analytics.Screen screen, Action legacyAction) {
        rewardsOfferAnalyticsManager.getClass();
        Intrinsics.h(screen, "screen");
        Intrinsics.h(legacyAction, "legacyAction");
        rewardsOfferAnalyticsManager.i(CollectionsKt.Q(rewardsOfferData), screen, legacyAction, null);
    }

    public final boolean a() {
        Region regionA = RewardsAccountInteractorKt.a(this.f6259a);
        int i = regionA == null ? -1 : WhenMappings.f6263a[regionA.ordinal()];
        FeatureToggleManager featureToggleManager = this.c;
        if (i == 1) {
            return featureToggleManager.c(RewardsBaseFeature.m);
        }
        if (i != 2) {
            return false;
        }
        return featureToggleManager.c(RewardsBaseFeature.l);
    }

    public final void e(List offers, au.com.woolworths.android.onesite.analytics.Screen screen, Action legacyAction, List list) {
        Intrinsics.h(offers, "offers");
        Intrinsics.h(screen, "screen");
        Intrinsics.h(legacyAction, "legacyAction");
        List list2 = offers;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((RewardsOfferData) it.next()).r);
        }
        f(arrayList, c(screen), new LegacyAnalyticsData.NonGeneratedActionWithData(legacyAction, BasicRewardsOfferStatusDataExtKt.f(offers)), list);
    }

    public final void f(List list, ScreenData screenData, LegacyAnalyticsData legacyAnalyticsData, List list2) {
        boolean zA = a();
        AnalyticsManager analyticsManager = this.b;
        if (zA) {
            Event event = (Event) BasicRewardsOfferStatusDataExtKt.a(screenData.f6262a, screenData.b, screenData.c, list).h.c.getD();
            Map mapD = d(list2);
            Intrinsics.h(event, "<this>");
            analyticsManager.g(new RewardsOfferAnalyticsManager$plus$1(event, mapD));
            return;
        }
        if (legacyAnalyticsData instanceof LegacyAnalyticsData.GeneratedEvent) {
            throw null;
        }
        if (legacyAnalyticsData instanceof LegacyAnalyticsData.NonGeneratedAction) {
            analyticsManager.c(new RewardsOfferAnalyticsManager$addExtraEventDescriptionLegacy$1(((LegacyAnalyticsData.NonGeneratedAction) legacyAnalyticsData).f6260a));
            return;
        }
        if (legacyAnalyticsData instanceof LegacyAnalyticsData.NonGeneratedActionWithData) {
            LegacyAnalyticsData.NonGeneratedActionWithData nonGeneratedActionWithData = (LegacyAnalyticsData.NonGeneratedActionWithData) legacyAnalyticsData;
            RewardsOfferAnalyticsManager$addExtraEventDescriptionLegacy$1 rewardsOfferAnalyticsManager$addExtraEventDescriptionLegacy$1 = new RewardsOfferAnalyticsManager$addExtraEventDescriptionLegacy$1(nonGeneratedActionWithData.f6261a);
            TrackingMetadata trackingMetadata = nonGeneratedActionWithData.b;
            trackingMetadata.d.putAll(d(list2));
            analyticsManager.j(rewardsOfferAnalyticsManager$addExtraEventDescriptionLegacy$1, trackingMetadata);
        }
    }

    public final void h(ArrayList arrayList, ScreenData screenData, LegacyAnalyticsData legacyAnalyticsData, List list) {
        boolean zA = a();
        AnalyticsManager analyticsManager = this.b;
        if (zA) {
            Event event = (Event) BasicRewardsOfferStatusDataExtKt.a(screenData.f6262a, screenData.b, screenData.c, arrayList).h.b.getD();
            Map mapD = d(list);
            Intrinsics.h(event, "<this>");
            analyticsManager.g(new RewardsOfferAnalyticsManager$plus$1(event, mapD));
            return;
        }
        if (legacyAnalyticsData instanceof LegacyAnalyticsData.GeneratedEvent) {
            throw null;
        }
        if (legacyAnalyticsData instanceof LegacyAnalyticsData.NonGeneratedAction) {
            analyticsManager.c(new RewardsOfferAnalyticsManager$addExtraEventDescriptionLegacy$1(((LegacyAnalyticsData.NonGeneratedAction) legacyAnalyticsData).f6260a));
            return;
        }
        if (legacyAnalyticsData instanceof LegacyAnalyticsData.NonGeneratedActionWithData) {
            LegacyAnalyticsData.NonGeneratedActionWithData nonGeneratedActionWithData = (LegacyAnalyticsData.NonGeneratedActionWithData) legacyAnalyticsData;
            RewardsOfferAnalyticsManager$addExtraEventDescriptionLegacy$1 rewardsOfferAnalyticsManager$addExtraEventDescriptionLegacy$1 = new RewardsOfferAnalyticsManager$addExtraEventDescriptionLegacy$1(nonGeneratedActionWithData.f6261a);
            TrackingMetadata trackingMetadata = nonGeneratedActionWithData.b;
            trackingMetadata.d.putAll(d(list));
            analyticsManager.j(rewardsOfferAnalyticsManager$addExtraEventDescriptionLegacy$1, trackingMetadata);
        }
    }

    public final void i(List offers, au.com.woolworths.android.onesite.analytics.Screen screen, Action legacyAction, List list) {
        Intrinsics.h(offers, "offers");
        Intrinsics.h(screen, "screen");
        Intrinsics.h(legacyAction, "legacyAction");
        List list2 = offers;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((RewardsOfferData) it.next()).r);
        }
        h(arrayList, c(screen), new LegacyAnalyticsData.NonGeneratedActionWithData(legacyAction, BasicRewardsOfferStatusDataExtKt.f(offers)), list);
    }

    public final void k(RewardsOfferAnalyticsData rewardsOfferAnalyticsData, ScreenData screenData, final String eventLabel, LegacyAnalyticsData legacyAnalyticsData, List list) {
        boolean zA = a();
        AnalyticsManager analyticsManager = this.b;
        if (zA) {
            final OfferImpressionAnalytics.OfferImpression.Action action = BasicRewardsOfferStatusDataExtKt.c(rewardsOfferAnalyticsData, screenData.f6262a, screenData.b, screenData.c).h;
            action.getClass();
            Intrinsics.h(eventLabel, "eventLabel");
            analyticsManager.g(new RewardsOfferAnalyticsManager$plus$1(new Event(action, eventLabel) { // from class: au.com.woolworths.analytics.rewards.offer.OfferImpressionAnalytics$OfferImpression$Action$offerCtaButtonClick$1
                public final Object d;

                {
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(action.f4024a.g);
                    androidx.constraintlayout.core.state.a.z("event.Label", androidx.compose.ui.input.pointer.a.m("event.Action", "button_click", spreadBuilder, eventLabel), spreadBuilder, "event.Description", "OfferTracker");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getD() {
                    return "offer_button_click";
                }

                public final boolean equals(Object obj) {
                    if (!(obj instanceof Event)) {
                        return false;
                    }
                    Event event = (Event) obj;
                    return "offer_button_click".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.d;
                }
            }, d(list)));
            return;
        }
        if (legacyAnalyticsData instanceof LegacyAnalyticsData.GeneratedEvent) {
            throw null;
        }
        if (legacyAnalyticsData instanceof LegacyAnalyticsData.NonGeneratedAction) {
            analyticsManager.c(new RewardsOfferAnalyticsManager$addExtraEventDescriptionLegacy$1(((LegacyAnalyticsData.NonGeneratedAction) legacyAnalyticsData).f6260a));
            return;
        }
        if (legacyAnalyticsData instanceof LegacyAnalyticsData.NonGeneratedActionWithData) {
            LegacyAnalyticsData.NonGeneratedActionWithData nonGeneratedActionWithData = (LegacyAnalyticsData.NonGeneratedActionWithData) legacyAnalyticsData;
            RewardsOfferAnalyticsManager$addExtraEventDescriptionLegacy$1 rewardsOfferAnalyticsManager$addExtraEventDescriptionLegacy$1 = new RewardsOfferAnalyticsManager$addExtraEventDescriptionLegacy$1(nonGeneratedActionWithData.f6261a);
            TrackingMetadata trackingMetadata = nonGeneratedActionWithData.b;
            trackingMetadata.d.putAll(d(list));
            analyticsManager.j(rewardsOfferAnalyticsManager$addExtraEventDescriptionLegacy$1, trackingMetadata);
        }
    }

    public final void l(RewardsOfferData offer, au.com.woolworths.android.onesite.analytics.Screen screen, Action legacyAction, List list) {
        Intrinsics.h(offer, "offer");
        Intrinsics.h(screen, "screen");
        Intrinsics.h(legacyAction, "legacyAction");
        k(offer.r, c(screen), offer.m, new LegacyAnalyticsData.NonGeneratedActionWithData(legacyAction, BasicRewardsOfferStatusDataExtKt.e(offer)), list);
    }

    public final void m(RewardsOfferAnalyticsData rewardsOfferAnalyticsData, ScreenData screenData, final String str, final String str2, final String deeplinkUrl, LegacyAnalyticsData legacyAnalyticsData) {
        boolean zA = a();
        AnalyticsManager analyticsManager = this.b;
        if (zA) {
            final OfferImpressionAnalytics.OfferImpression.Action action = BasicRewardsOfferStatusDataExtKt.c(rewardsOfferAnalyticsData, screenData.f6262a, screenData.b, screenData.c).h;
            action.getClass();
            Intrinsics.h(deeplinkUrl, "deeplinkUrl");
            analyticsManager.g(new Event(action, str, str2, deeplinkUrl) { // from class: au.com.woolworths.analytics.rewards.offer.OfferImpressionAnalytics$OfferImpression$Action$offerListCtaButtonClick$1
                public final Object d;

                {
                    SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                    spreadBuilder.b(action.f4024a.g);
                    spreadBuilder.a(new Pair("event.Category", str));
                    spreadBuilder.a(new Pair("event.Action", "button_click"));
                    androidx.constraintlayout.core.state.a.z("event.Label", str2, spreadBuilder, "event.Description", "OfferTracker");
                    androidx.constraintlayout.core.state.a.y("deeplink.url", String.valueOf(deeplinkUrl), spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getD() {
                    return "offer_shop_click";
                }

                public final boolean equals(Object obj) {
                    if (!(obj instanceof Event)) {
                        return false;
                    }
                    Event event = (Event) obj;
                    return "offer_shop_click".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.d;
                }
            });
            return;
        }
        if (legacyAnalyticsData instanceof LegacyAnalyticsData.GeneratedEvent) {
            throw null;
        }
        if (legacyAnalyticsData instanceof LegacyAnalyticsData.NonGeneratedAction) {
            analyticsManager.c(new RewardsOfferAnalyticsManager$addExtraEventDescriptionLegacy$1(((LegacyAnalyticsData.NonGeneratedAction) legacyAnalyticsData).f6260a));
        } else if (legacyAnalyticsData instanceof LegacyAnalyticsData.NonGeneratedActionWithData) {
            LegacyAnalyticsData.NonGeneratedActionWithData nonGeneratedActionWithData = (LegacyAnalyticsData.NonGeneratedActionWithData) legacyAnalyticsData;
            analyticsManager.j(new RewardsOfferAnalyticsManager$addExtraEventDescriptionLegacy$1(nonGeneratedActionWithData.f6261a), nonGeneratedActionWithData.b);
        }
    }

    public final void n(RewardsOfferData rewardsOfferData, au.com.woolworths.android.onesite.analytics.Screen screen, String str, final String str2, final Action action) {
        ContentCta cta;
        Action action2 = new Action() { // from class: au.com.woolworths.feature.rewards.offers.analytics.RewardsOfferAnalyticsManager$trackOfferListCtaButtonClick$combinedAction$1
            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a */
            public final String getF() {
                return action.getF();
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b */
            public final Category getE() {
                return action.getE();
            }

            @Override // au.com.woolworths.android.onesite.analytics.Action
            /* renamed from: f */
            public final au.com.woolworths.android.onesite.analytics.Screen getD() {
                return action.getD();
            }

            @Override // au.com.woolworths.android.onesite.analytics.Action, au.com.woolworths.android.onesite.analytics.BaseAction
            public final HashMap l() {
                HashMap mapL = action.l();
                TrackableValue trackableValue = TrackableValue.e;
                mapL.put("deeplink.uri", str2);
                return mapL;
            }
        };
        RewardsOfferAnalyticsData rewardsOfferAnalyticsData = rewardsOfferData.r;
        ScreenData screenDataC = c(screen);
        OfferDetailsCta offerDetailsCta = rewardsOfferData.A;
        String label = (offerDetailsCta == null || (cta = offerDetailsCta.getCta()) == null) ? null : cta.getLabel();
        if (label == null) {
            label = "";
        }
        m(rewardsOfferAnalyticsData, screenDataC, str, label, str2, new LegacyAnalyticsData.NonGeneratedActionWithData(action2, BasicRewardsOfferStatusDataExtKt.e(rewardsOfferData)));
    }

    public final void o(RewardsOfferData offer, au.com.woolworths.android.onesite.analytics.Screen screen, Action legacyAction) {
        Intrinsics.h(offer, "offer");
        Intrinsics.h(screen, "screen");
        Intrinsics.h(legacyAction, "legacyAction");
        RewardsOfferAnalyticsData rewardsOfferAnalyticsData = offer.r;
        ScreenData screenDataC = c(screen);
        new LegacyAnalyticsData.NonGeneratedAction(legacyAction);
        boolean zA = a();
        AnalyticsManager analyticsManager = this.b;
        if (!zA) {
            analyticsManager.c(new RewardsOfferAnalyticsManager$addExtraEventDescriptionLegacy$1(legacyAction));
            return;
        }
        final OfferImpressionAnalytics.OfferImpression.Action action = BasicRewardsOfferStatusDataExtKt.c(rewardsOfferAnalyticsData, screenDataC.f6262a, screenDataC.b, screenDataC.c).h;
        action.getClass();
        analyticsManager.g(new Event(action) { // from class: au.com.woolworths.analytics.rewards.offer.OfferImpressionAnalytics$OfferImpression$Action$offerTileClick$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                spreadBuilder.b(action.f4024a.g);
                spreadBuilder.a(new Pair("event.Action", "button_click"));
                spreadBuilder.a(new Pair("event.Label", "Offer Tile"));
                androidx.constraintlayout.core.state.a.y("event.Description", "OfferTracker", spreadBuilder);
                ArrayList arrayList = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getD() {
                return "offer_button_click";
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj;
                return "offer_button_click".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        });
    }

    public final void p(RewardsOfferData offer, au.com.woolworths.android.onesite.analytics.Screen screen, String str, RewardsPointsActionData$Companion$rewardsCategoryOfferCtaButtonClick$1 rewardsPointsActionData$Companion$rewardsCategoryOfferCtaButtonClick$1) {
        Intrinsics.h(offer, "offer");
        Intrinsics.h(screen, "screen");
        n(offer, screen, "offer tile", str, rewardsPointsActionData$Companion$rewardsCategoryOfferCtaButtonClick$1);
    }

    public final void q(RewardsOfferData offer, au.com.woolworths.android.onesite.analytics.Screen screen, Action legacyAction) {
        Intrinsics.h(offer, "offer");
        Intrinsics.h(screen, "screen");
        Intrinsics.h(legacyAction, "legacyAction");
        ScreenData screenDataC = c(screen);
        TrackingMetadata trackingMetadataE = BasicRewardsOfferStatusDataExtKt.e(offer);
        new LegacyAnalyticsData.NonGeneratedActionWithData(legacyAction, trackingMetadataE);
        boolean zA = a();
        AnalyticsManager analyticsManager = this.b;
        if (!zA) {
            analyticsManager.j(new RewardsOfferAnalyticsManager$addExtraEventDescriptionLegacy$1(legacyAction), trackingMetadataE);
            return;
        }
        final OfferImpressionAnalytics.OfferImpression.Action action = BasicRewardsOfferStatusDataExtKt.c(offer.r, screenDataC.f6262a, screenDataC.b, screenDataC.c).h;
        action.getClass();
        analyticsManager.g(new Event(action) { // from class: au.com.woolworths.analytics.rewards.offer.OfferImpressionAnalytics$OfferImpression$Action$offerImpression$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                spreadBuilder.b(action.f4024a.g);
                spreadBuilder.a(new Pair("event.Action", "impression"));
                spreadBuilder.a(new Pair("event.Label", "Offer Tile"));
                androidx.constraintlayout.core.state.a.y("event.Description", "OfferTracker", spreadBuilder);
                ArrayList arrayList = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getD() {
                return "offer_impression";
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj;
                return "offer_impression".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        });
    }
}
