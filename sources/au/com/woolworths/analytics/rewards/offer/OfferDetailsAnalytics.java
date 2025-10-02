package au.com.woolworths.analytics.rewards.offer;

import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.Screen;
import au.com.woolworths.analytics.rewards.offer.OfferDetailsAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/analytics/rewards/offer/OfferDetailsAnalytics;", "", "OfferDetails", "OfferDetailsError", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OfferDetailsAnalytics {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/rewards/offer/OfferDetailsAnalytics$OfferDetails;", "Lau/com/woolworths/analytics/Screen;", "Action", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class OfferDetails implements Screen {
        public final Object d;
        public final Pair[] e;
        public final Action f;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/analytics/rewards/offer/OfferDetailsAnalytics$OfferDetails$Action;", "", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Action {

            /* renamed from: a, reason: collision with root package name */
            public final OfferDetails f4022a;

            public Action(OfferDetails offerDetails) {
                this.f4022a = offerDetails;
            }
        }

        public OfferDetails(List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11) {
            Pair pair = new Pair("screen.Name", "Offer Details");
            Pair pair2 = new Pair("screen.Type", "offers");
            Pair pair3 = new Pair("event.Category", "offer");
            Pair pair4 = new Pair("event.Action", "impression");
            Pair pair5 = new Pair("event.Label", "Offer Details");
            Pair pair6 = new Pair("event.Description", "OfferTracker");
            List list12 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.s(list12, 10));
            Iterator it = list12.iterator();
            while (true) {
                String str = "";
                if (!it.hasNext()) {
                    break;
                }
                String str2 = (String) it.next();
                if (str2 != null) {
                    str = str2;
                }
                arrayList.add(str);
            }
            Pair pair7 = new Pair("offer.Type", arrayList);
            List<String> list13 = list2;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.s(list13, 10));
            for (String str3 : list13) {
                if (str3 == null) {
                    str3 = "";
                }
                arrayList2.add(str3);
            }
            Pair pair8 = new Pair("offer.Name", arrayList2);
            List<String> list14 = list3;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.s(list14, 10));
            for (String str4 : list14) {
                if (str4 == null) {
                    str4 = "";
                }
                arrayList3.add(str4);
            }
            Pair pair9 = new Pair("offer.Stream", arrayList3);
            List<String> list15 = list4;
            ArrayList arrayList4 = new ArrayList(CollectionsKt.s(list15, 10));
            for (String str5 : list15) {
                if (str5 == null) {
                    str5 = "";
                }
                arrayList4.add(str5);
            }
            Pair pair10 = new Pair("offer.Channel", arrayList4);
            List<String> list16 = list5;
            ArrayList arrayList5 = new ArrayList(CollectionsKt.s(list16, 10));
            for (String str6 : list16) {
                if (str6 == null) {
                    str6 = "";
                }
                arrayList5.add(str6);
            }
            Pair pair11 = new Pair("offer.Status", arrayList5);
            List<String> list17 = list6;
            ArrayList arrayList6 = new ArrayList(CollectionsKt.s(list17, 10));
            for (String str7 : list17) {
                if (str7 == null) {
                    str7 = "";
                }
                arrayList6.add(str7);
            }
            Pair pair12 = new Pair("offer.PartnerID", arrayList6);
            List<String> list18 = list7;
            ArrayList arrayList7 = new ArrayList(CollectionsKt.s(list18, 10));
            for (String str8 : list18) {
                if (str8 == null) {
                    str8 = "";
                }
                arrayList7.add(str8);
            }
            Pair pair13 = new Pair("offer.Profile", arrayList7);
            List<String> list19 = list8;
            ArrayList arrayList8 = new ArrayList(CollectionsKt.s(list19, 10));
            for (String str9 : list19) {
                if (str9 == null) {
                    str9 = "";
                }
                arrayList8.add(str9);
            }
            Pair pair14 = new Pair("offer.RTLAccountID", arrayList8);
            List<String> list20 = list9;
            ArrayList arrayList9 = new ArrayList(CollectionsKt.s(list20, 10));
            for (String str10 : list20) {
                if (str10 == null) {
                    str10 = "";
                }
                arrayList9.add(str10);
            }
            Pair pair15 = new Pair("offer.RTLCampaignID", arrayList9);
            List<String> list21 = list10;
            ArrayList arrayList10 = new ArrayList(CollectionsKt.s(list21, 10));
            for (String str11 : list21) {
                if (str11 == null) {
                    str11 = "";
                }
                arrayList10.add(str11);
            }
            Pair pair16 = new Pair("offer.RTLCampaignCode", arrayList10);
            List<String> list22 = list11;
            ArrayList arrayList11 = new ArrayList(CollectionsKt.s(list22, 10));
            for (String str12 : list22) {
                if (str12 == null) {
                    str12 = "";
                }
                arrayList11.add(str12);
            }
            Map mapJ = MapsKt.j(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, pair14, pair15, pair16, new Pair("offer.RTLCouponStart", arrayList11), new Pair("app.Section", "Offers"));
            this.d = mapJ;
            this.e = (Pair[]) MapsKt.o(mapJ).toArray(new Pair[0]);
            this.f = new Action(this);
        }

        @Override // au.com.woolworths.analytics.Event
        /* renamed from: d */
        public final String getE() {
            return "offerdetails_screen";
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Screen)) {
                return false;
            }
            Screen screen = (Screen) obj;
            return "Offer Details".equals(screen.getD()) && "offerdetails_screen".equals(screen.getE()) && Intrinsics.c(this.d, screen.getData());
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
        @Override // au.com.woolworths.analytics.Event
        public final Map getData() {
            return this.d;
        }

        @Override // au.com.woolworths.analytics.Screen
        /* renamed from: getName */
        public final String getD() {
            return "Offer Details";
        }

        public final int hashCode() {
            return this.d.hashCode() - 1959648519;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/rewards/offer/OfferDetailsAnalytics$OfferDetailsError;", "Lau/com/woolworths/analytics/Screen;", "Action", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class OfferDetailsError implements Screen {
        public final Object d;
        public final Pair[] e;
        public final Action f;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/analytics/rewards/offer/OfferDetailsAnalytics$OfferDetailsError$Action;", "", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Action {

            /* renamed from: a, reason: collision with root package name */
            public final OfferDetailsError f4023a;
            public final Lazy b;
            public final Lazy c;
            public final Lazy d;
            public final Lazy e;

            public Action(OfferDetailsError offerDetailsError) {
                this.f4023a = offerDetailsError;
                final int i = 0;
                this.b = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.analytics.rewards.offer.b
                    public final /* synthetic */ OfferDetailsAnalytics.OfferDetailsError.Action e;

                    {
                        this.e = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i) {
                            case 0:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.rewards.offer.OfferDetailsAnalytics$OfferDetailsError$Action$networkError$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(3);
                                        spreadBuilder.b(action.f4023a.e);
                                        androidx.constraintlayout.core.state.a.z("event.Action", "impression", spreadBuilder, "event.Label", "Network Error");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getE() {
                                        return "error_impression";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "error_impression".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 1:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.rewards.offer.OfferDetailsAnalytics$OfferDetailsError$Action$networkErrorRetry$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(3);
                                        spreadBuilder.b(action.f4023a.e);
                                        androidx.constraintlayout.core.state.a.z("event.Action", "button_click", spreadBuilder, "event.Label", "Network Error - Try Again");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getE() {
                                        return "error_button_click";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "error_button_click".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 2:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.rewards.offer.OfferDetailsAnalytics$OfferDetailsError$Action$serverError$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(3);
                                        spreadBuilder.b(action.f4023a.e);
                                        androidx.constraintlayout.core.state.a.z("event.Action", "impression", spreadBuilder, "event.Label", "Server Error");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getE() {
                                        return "error_impression";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "error_impression".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            default:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.rewards.offer.OfferDetailsAnalytics$OfferDetailsError$Action$serverErrorRetry$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(3);
                                        spreadBuilder.b(action.f4023a.e);
                                        androidx.constraintlayout.core.state.a.z("event.Action", "button_click", spreadBuilder, "event.Label", "Server Error - Try Again");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getE() {
                                        return "error_button_click";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "error_button_click".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                        }
                    }
                });
                final int i2 = 1;
                this.c = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.analytics.rewards.offer.b
                    public final /* synthetic */ OfferDetailsAnalytics.OfferDetailsError.Action e;

                    {
                        this.e = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i2) {
                            case 0:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.rewards.offer.OfferDetailsAnalytics$OfferDetailsError$Action$networkError$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(3);
                                        spreadBuilder.b(action.f4023a.e);
                                        androidx.constraintlayout.core.state.a.z("event.Action", "impression", spreadBuilder, "event.Label", "Network Error");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getE() {
                                        return "error_impression";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "error_impression".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 1:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.rewards.offer.OfferDetailsAnalytics$OfferDetailsError$Action$networkErrorRetry$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(3);
                                        spreadBuilder.b(action.f4023a.e);
                                        androidx.constraintlayout.core.state.a.z("event.Action", "button_click", spreadBuilder, "event.Label", "Network Error - Try Again");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getE() {
                                        return "error_button_click";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "error_button_click".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 2:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.rewards.offer.OfferDetailsAnalytics$OfferDetailsError$Action$serverError$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(3);
                                        spreadBuilder.b(action.f4023a.e);
                                        androidx.constraintlayout.core.state.a.z("event.Action", "impression", spreadBuilder, "event.Label", "Server Error");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getE() {
                                        return "error_impression";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "error_impression".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            default:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.rewards.offer.OfferDetailsAnalytics$OfferDetailsError$Action$serverErrorRetry$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(3);
                                        spreadBuilder.b(action.f4023a.e);
                                        androidx.constraintlayout.core.state.a.z("event.Action", "button_click", spreadBuilder, "event.Label", "Server Error - Try Again");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getE() {
                                        return "error_button_click";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "error_button_click".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                        }
                    }
                });
                final int i3 = 2;
                this.d = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.analytics.rewards.offer.b
                    public final /* synthetic */ OfferDetailsAnalytics.OfferDetailsError.Action e;

                    {
                        this.e = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i3) {
                            case 0:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.rewards.offer.OfferDetailsAnalytics$OfferDetailsError$Action$networkError$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(3);
                                        spreadBuilder.b(action.f4023a.e);
                                        androidx.constraintlayout.core.state.a.z("event.Action", "impression", spreadBuilder, "event.Label", "Network Error");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getE() {
                                        return "error_impression";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "error_impression".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 1:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.rewards.offer.OfferDetailsAnalytics$OfferDetailsError$Action$networkErrorRetry$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(3);
                                        spreadBuilder.b(action.f4023a.e);
                                        androidx.constraintlayout.core.state.a.z("event.Action", "button_click", spreadBuilder, "event.Label", "Network Error - Try Again");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getE() {
                                        return "error_button_click";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "error_button_click".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 2:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.rewards.offer.OfferDetailsAnalytics$OfferDetailsError$Action$serverError$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(3);
                                        spreadBuilder.b(action.f4023a.e);
                                        androidx.constraintlayout.core.state.a.z("event.Action", "impression", spreadBuilder, "event.Label", "Server Error");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getE() {
                                        return "error_impression";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "error_impression".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            default:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.rewards.offer.OfferDetailsAnalytics$OfferDetailsError$Action$serverErrorRetry$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(3);
                                        spreadBuilder.b(action.f4023a.e);
                                        androidx.constraintlayout.core.state.a.z("event.Action", "button_click", spreadBuilder, "event.Label", "Server Error - Try Again");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getE() {
                                        return "error_button_click";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "error_button_click".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                        }
                    }
                });
                final int i4 = 3;
                this.e = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.analytics.rewards.offer.b
                    public final /* synthetic */ OfferDetailsAnalytics.OfferDetailsError.Action e;

                    {
                        this.e = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i4) {
                            case 0:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.rewards.offer.OfferDetailsAnalytics$OfferDetailsError$Action$networkError$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(3);
                                        spreadBuilder.b(action.f4023a.e);
                                        androidx.constraintlayout.core.state.a.z("event.Action", "impression", spreadBuilder, "event.Label", "Network Error");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getE() {
                                        return "error_impression";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "error_impression".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 1:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.rewards.offer.OfferDetailsAnalytics$OfferDetailsError$Action$networkErrorRetry$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(3);
                                        spreadBuilder.b(action.f4023a.e);
                                        androidx.constraintlayout.core.state.a.z("event.Action", "button_click", spreadBuilder, "event.Label", "Network Error - Try Again");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getE() {
                                        return "error_button_click";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "error_button_click".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            case 2:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.rewards.offer.OfferDetailsAnalytics$OfferDetailsError$Action$serverError$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(3);
                                        spreadBuilder.b(action.f4023a.e);
                                        androidx.constraintlayout.core.state.a.z("event.Action", "impression", spreadBuilder, "event.Label", "Server Error");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getE() {
                                        return "error_impression";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "error_impression".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            default:
                                return new Event(this.e) { // from class: au.com.woolworths.analytics.rewards.offer.OfferDetailsAnalytics$OfferDetailsError$Action$serverErrorRetry$2$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(3);
                                        spreadBuilder.b(action.f4023a.e);
                                        androidx.constraintlayout.core.state.a.z("event.Action", "button_click", spreadBuilder, "event.Label", "Server Error - Try Again");
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getE() {
                                        return "error_button_click";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event = (Event) obj;
                                        return "error_button_click".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                        }
                    }
                });
            }
        }

        public OfferDetailsError() {
            Map mapJ = MapsKt.j(new Pair("screen.Name", "Offer Details"), new Pair("screen.Type", "offers"), new Pair("event.Category", "error"), new Pair("event.Description", "OfferTracker"), new Pair("app.Section", "Offers"));
            this.d = mapJ;
            this.e = (Pair[]) MapsKt.o(mapJ).toArray(new Pair[0]);
            this.f = new Action(this);
        }

        @Override // au.com.woolworths.analytics.Event
        /* renamed from: d */
        public final String getE() {
            return "offerdetails_screen";
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Screen)) {
                return false;
            }
            Screen screen = (Screen) obj;
            return "Offer Details".equals(screen.getD()) && "offerdetails_screen".equals(screen.getE()) && Intrinsics.c(this.d, screen.getData());
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
        @Override // au.com.woolworths.analytics.Event
        public final Map getData() {
            return this.d;
        }

        @Override // au.com.woolworths.analytics.Screen
        /* renamed from: getName */
        public final String getD() {
            return "Offer Details";
        }

        public final int hashCode() {
            return this.d.hashCode() - 1959648519;
        }
    }
}
