package au.com.woolworths.analytics.rewards.offer;

import au.com.woolworths.analytics.Screen;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/rewards/offer/OfferImpressionAnalytics;", "", "OfferImpression", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OfferImpressionAnalytics {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/rewards/offer/OfferImpressionAnalytics$OfferImpression;", "Lau/com/woolworths/analytics/Screen;", "Action", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class OfferImpression implements Screen {
        public final String d;
        public final String e;
        public final Object f;
        public final Pair[] g;
        public final Action h;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/analytics/rewards/offer/OfferImpressionAnalytics$OfferImpression$Action;", "", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Action {

            /* renamed from: a, reason: collision with root package name */
            public final OfferImpression f4024a;

            public Action(OfferImpression offerImpression) {
                this.f4024a = offerImpression;
            }
        }

        public OfferImpression(String screenName, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, ArrayList arrayList9, ArrayList arrayList10, ArrayList arrayList11, String appSection, String str) {
            Intrinsics.h(screenName, "screenName");
            Intrinsics.h(appSection, "appSection");
            this.d = screenName;
            String lowerCase = androidx.camera.core.impl.b.D("\\s", screenName, "").toLowerCase(Locale.ROOT);
            Intrinsics.g(lowerCase, "toLowerCase(...)");
            this.e = StringsKt.N(lowerCase, "screen").concat("_screen");
            Pair pair = new Pair("screen.Name", screenName);
            Pair pair2 = new Pair("screen.Type", str == null ? "" : str);
            Pair pair3 = new Pair("event.Category", "offer");
            ArrayList arrayList12 = new ArrayList(CollectionsKt.s(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (str2 == null) {
                    str2 = "";
                }
                arrayList12.add(str2);
            }
            Pair pair4 = new Pair("offer.Type", arrayList12);
            ArrayList arrayList13 = new ArrayList(CollectionsKt.s(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                String str3 = (String) it2.next();
                if (str3 == null) {
                    str3 = "";
                }
                arrayList13.add(str3);
            }
            Pair pair5 = new Pair("offer.Name", arrayList13);
            ArrayList arrayList14 = new ArrayList(CollectionsKt.s(arrayList3, 10));
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                String str4 = (String) it3.next();
                if (str4 == null) {
                    str4 = "";
                }
                arrayList14.add(str4);
            }
            Pair pair6 = new Pair("offer.Stream", arrayList14);
            ArrayList arrayList15 = new ArrayList(CollectionsKt.s(arrayList4, 10));
            Iterator it4 = arrayList4.iterator();
            while (it4.hasNext()) {
                String str5 = (String) it4.next();
                if (str5 == null) {
                    str5 = "";
                }
                arrayList15.add(str5);
            }
            Pair pair7 = new Pair("offer.Channel", arrayList15);
            ArrayList arrayList16 = new ArrayList(CollectionsKt.s(arrayList5, 10));
            Iterator it5 = arrayList5.iterator();
            while (it5.hasNext()) {
                String str6 = (String) it5.next();
                if (str6 == null) {
                    str6 = "";
                }
                arrayList16.add(str6);
            }
            Pair pair8 = new Pair("offer.Status", arrayList16);
            ArrayList arrayList17 = new ArrayList(CollectionsKt.s(arrayList6, 10));
            Iterator it6 = arrayList6.iterator();
            while (it6.hasNext()) {
                String str7 = (String) it6.next();
                if (str7 == null) {
                    str7 = "";
                }
                arrayList17.add(str7);
            }
            Pair pair9 = new Pair("offer.PartnerID", arrayList17);
            ArrayList arrayList18 = new ArrayList(CollectionsKt.s(arrayList7, 10));
            Iterator it7 = arrayList7.iterator();
            while (it7.hasNext()) {
                String str8 = (String) it7.next();
                if (str8 == null) {
                    str8 = "";
                }
                arrayList18.add(str8);
            }
            Pair pair10 = new Pair("offer.Profile", arrayList18);
            ArrayList arrayList19 = new ArrayList(CollectionsKt.s(arrayList8, 10));
            Iterator it8 = arrayList8.iterator();
            while (it8.hasNext()) {
                String str9 = (String) it8.next();
                if (str9 == null) {
                    str9 = "";
                }
                arrayList19.add(str9);
            }
            Pair pair11 = new Pair("offer.RTLAccountID", arrayList19);
            ArrayList arrayList20 = new ArrayList(CollectionsKt.s(arrayList9, 10));
            Iterator it9 = arrayList9.iterator();
            while (it9.hasNext()) {
                String str10 = (String) it9.next();
                if (str10 == null) {
                    str10 = "";
                }
                arrayList20.add(str10);
            }
            Pair pair12 = new Pair("offer.RTLCampaignID", arrayList20);
            ArrayList arrayList21 = new ArrayList(CollectionsKt.s(arrayList10, 10));
            Iterator it10 = arrayList10.iterator();
            while (it10.hasNext()) {
                String str11 = (String) it10.next();
                if (str11 == null) {
                    str11 = "";
                }
                arrayList21.add(str11);
            }
            Pair pair13 = new Pair("offer.RTLCampaignCode", arrayList21);
            ArrayList arrayList22 = new ArrayList(CollectionsKt.s(arrayList11, 10));
            Iterator it11 = arrayList11.iterator();
            while (it11.hasNext()) {
                String str12 = (String) it11.next();
                if (str12 == null) {
                    str12 = "";
                }
                arrayList22.add(str12);
            }
            Map mapJ = MapsKt.j(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, new Pair("offer.RTLCouponStart", arrayList22), new Pair("app.Section", appSection));
            this.f = mapJ;
            this.g = (Pair[]) MapsKt.o(mapJ).toArray(new Pair[0]);
            this.h = new Action(this);
        }

        @Override // au.com.woolworths.analytics.Event
        /* renamed from: d, reason: from getter */
        public final String getD() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Screen)) {
                return false;
            }
            Screen screen = (Screen) obj;
            return Intrinsics.c(this.d, screen.getD()) && Intrinsics.c(this.e, screen.getD()) && Intrinsics.c(this.f, screen.getData());
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
        @Override // au.com.woolworths.analytics.Event
        public final Map getData() {
            return this.f;
        }

        @Override // au.com.woolworths.analytics.Screen
        /* renamed from: getName, reason: from getter */
        public final String getD() {
            return this.d;
        }

        public final int hashCode() {
            return this.f.hashCode() + androidx.camera.core.impl.b.c(this.d.hashCode() * 31, 31, this.e);
        }
    }
}
