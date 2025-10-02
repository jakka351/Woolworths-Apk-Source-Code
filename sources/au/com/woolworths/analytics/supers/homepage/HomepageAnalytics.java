package au.com.woolworths.analytics.supers.homepage;

import androidx.constraintlayout.core.state.a;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.Screen;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/homepage/HomepageAnalytics;", "", "HomeScreen", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HomepageAnalytics {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/homepage/HomepageAnalytics$HomeScreen;", "Lau/com/woolworths/analytics/Screen;", "Action", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class HomeScreen implements Screen {
        public static final Object d;
        public static final Pair[] e;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/analytics/supers/homepage/HomepageAnalytics$HomeScreen$Action;", "Lau/com/woolworths/analytics/Event;", "", "Companion", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Action implements Event {
            public static final Companion d;
            public static final Action e;
            public static final Action f;
            public static final Action g;
            public static final Action h;
            public static final Action i;
            public static final Action j;
            public static final Action k;
            public static final Action l;
            public static final Action m;
            public static final /* synthetic */ Action[] n;
            public static final /* synthetic */ EnumEntries o;

            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/analytics/supers/homepage/HomepageAnalytics$HomeScreen$Action$Companion;", "", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/homepage/HomepageAnalytics.HomeScreen.Action.DELIVERY_NOW_CLICK", "Lau/com/woolworths/analytics/supers/homepage/HomepageAnalytics$HomeScreen$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class DELIVERY_NOW_CLICK extends Action {
                public final Object p;

                public DELIVERY_NOW_CLICK() {
                    super("DELIVERY_NOW_CLICK", 1);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(HomeScreen.e);
                    spreadBuilder.a(new Pair("event.Category", "delivery_now"));
                    spreadBuilder.a(new Pair("event.Action", "click"));
                    a.z("event.Label", "Delivery Now", spreadBuilder, "event.Description", "Upfront Fulfilment");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.p = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "delivery_now_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.p;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/homepage/HomepageAnalytics.HomeScreen.Action.DELIVERY_NOW_DISMISS", "Lau/com/woolworths/analytics/supers/homepage/HomepageAnalytics$HomeScreen$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class DELIVERY_NOW_DISMISS extends Action {
                public final Object p;

                public DELIVERY_NOW_DISMISS() {
                    super("DELIVERY_NOW_DISMISS", 2);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(HomeScreen.e);
                    spreadBuilder.a(new Pair("event.Category", "delivery_now"));
                    spreadBuilder.a(new Pair("event.Action", "click"));
                    a.z("event.Label", "Dismiss Delivery Now", spreadBuilder, "event.Description", "Upfront Fulfilment");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.p = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "delivery_now_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.p;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/homepage/HomepageAnalytics.HomeScreen.Action.DELIVERY_NOW_IMPRESSION", "Lau/com/woolworths/analytics/supers/homepage/HomepageAnalytics$HomeScreen$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class DELIVERY_NOW_IMPRESSION extends Action {
                public final Object p;

                public DELIVERY_NOW_IMPRESSION() {
                    super("DELIVERY_NOW_IMPRESSION", 0);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(HomeScreen.e);
                    spreadBuilder.a(new Pair("event.Category", "delivery_now"));
                    spreadBuilder.a(new Pair("event.Action", "impression"));
                    a.z("event.Label", "Delivery Now", spreadBuilder, "event.Description", "Upfront Fulfilment");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.p = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "delivery_now_impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.p;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/homepage/HomepageAnalytics.HomeScreen.Action.LEGACY_DELIVERY_NOW_CLICK", "Lau/com/woolworths/analytics/supers/homepage/HomepageAnalytics$HomeScreen$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class LEGACY_DELIVERY_NOW_CLICK extends Action {
                public final Object p;

                public LEGACY_DELIVERY_NOW_CLICK() {
                    super("LEGACY_DELIVERY_NOW_CLICK", 6);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(HomeScreen.e);
                    spreadBuilder.a(new Pair("event.Category", "mode_selector"));
                    spreadBuilder.a(new Pair("event.Action", "click"));
                    a.z("event.Label", "Delivery Now", spreadBuilder, "event.Description", "Upfront Fulfilment");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.p = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "mode_selector_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.p;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/homepage/HomepageAnalytics.HomeScreen.Action.LEGACY_DELIVERY_NOW_IMPRESSION", "Lau/com/woolworths/analytics/supers/homepage/HomepageAnalytics$HomeScreen$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class LEGACY_DELIVERY_NOW_IMPRESSION extends Action {
                public final Object p;

                public LEGACY_DELIVERY_NOW_IMPRESSION() {
                    super("LEGACY_DELIVERY_NOW_IMPRESSION", 5);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(HomeScreen.e);
                    spreadBuilder.a(new Pair("event.Category", "mode_selector"));
                    spreadBuilder.a(new Pair("event.Action", "impression"));
                    a.z("event.Label", "Delivery Now Callout", spreadBuilder, "event.Description", "Upfront Fulfilment");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.p = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "mode_selector_impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.p;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/homepage/HomepageAnalytics.HomeScreen.Action.SPEECH_ICON_CLICK", "Lau/com/woolworths/analytics/supers/homepage/HomepageAnalytics$HomeScreen$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class SPEECH_ICON_CLICK extends Action {
                public final Object p;

                public SPEECH_ICON_CLICK() {
                    super("SPEECH_ICON_CLICK", 3);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(HomeScreen.e);
                    spreadBuilder.a(new Pair("event.Category", "message centre"));
                    spreadBuilder.a(new Pair("event.Action", "button_click"));
                    a.y("event.Label", "Speech icon", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.p = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "message_centre_button_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.p;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/homepage/HomepageAnalytics.HomeScreen.Action.STORE_DETAILS_CLICK", "Lau/com/woolworths/analytics/supers/homepage/HomepageAnalytics$HomeScreen$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class STORE_DETAILS_CLICK extends Action {
                public final Object p;

                public STORE_DETAILS_CLICK() {
                    super("STORE_DETAILS_CLICK", 7);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(HomeScreen.e);
                    spreadBuilder.a(new Pair("event.Category", "mode_selector"));
                    spreadBuilder.a(new Pair("event.Action", "button_click"));
                    a.y("event.Label", "store details", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.p = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "mode_selector_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.p;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/homepage/HomepageAnalytics.HomeScreen.Action.UNREAD_NOTIFICATION_MESSAGES_IMPRESSION", "Lau/com/woolworths/analytics/supers/homepage/HomepageAnalytics$HomeScreen$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class UNREAD_NOTIFICATION_MESSAGES_IMPRESSION extends Action {
                public final Object p;

                public UNREAD_NOTIFICATION_MESSAGES_IMPRESSION() {
                    super("UNREAD_NOTIFICATION_MESSAGES_IMPRESSION", 4);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(HomeScreen.e);
                    spreadBuilder.a(new Pair("event.Category", "notification"));
                    spreadBuilder.a(new Pair("event.Action", "impression"));
                    a.y("event.Label", "Unread notification messages", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.p = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "notification_impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.p;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/homepage/HomepageAnalytics.HomeScreen.Action.VOICE_PRODUCT_SEARCH_CLICK", "Lau/com/woolworths/analytics/supers/homepage/HomepageAnalytics$HomeScreen$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class VOICE_PRODUCT_SEARCH_CLICK extends Action {
                public final Object p;

                public VOICE_PRODUCT_SEARCH_CLICK() {
                    super("VOICE_PRODUCT_SEARCH_CLICK", 8);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(HomeScreen.e);
                    spreadBuilder.a(new Pair("screen.Type", "home"));
                    spreadBuilder.a(new Pair("event.Category", "voice product search"));
                    a.z("event.Action", "button_click", spreadBuilder, "event.Label", "voice product search");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.p = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "voiceproductsearch_button_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.p;
                }
            }

            static {
                DELIVERY_NOW_IMPRESSION delivery_now_impression = new DELIVERY_NOW_IMPRESSION();
                e = delivery_now_impression;
                DELIVERY_NOW_CLICK delivery_now_click = new DELIVERY_NOW_CLICK();
                f = delivery_now_click;
                DELIVERY_NOW_DISMISS delivery_now_dismiss = new DELIVERY_NOW_DISMISS();
                g = delivery_now_dismiss;
                SPEECH_ICON_CLICK speech_icon_click = new SPEECH_ICON_CLICK();
                h = speech_icon_click;
                UNREAD_NOTIFICATION_MESSAGES_IMPRESSION unread_notification_messages_impression = new UNREAD_NOTIFICATION_MESSAGES_IMPRESSION();
                i = unread_notification_messages_impression;
                LEGACY_DELIVERY_NOW_IMPRESSION legacy_delivery_now_impression = new LEGACY_DELIVERY_NOW_IMPRESSION();
                j = legacy_delivery_now_impression;
                LEGACY_DELIVERY_NOW_CLICK legacy_delivery_now_click = new LEGACY_DELIVERY_NOW_CLICK();
                k = legacy_delivery_now_click;
                STORE_DETAILS_CLICK store_details_click = new STORE_DETAILS_CLICK();
                l = store_details_click;
                VOICE_PRODUCT_SEARCH_CLICK voice_product_search_click = new VOICE_PRODUCT_SEARCH_CLICK();
                m = voice_product_search_click;
                Action[] actionArr = {delivery_now_impression, delivery_now_click, delivery_now_dismiss, speech_icon_click, unread_notification_messages_impression, legacy_delivery_now_impression, legacy_delivery_now_click, store_details_click, voice_product_search_click};
                n = actionArr;
                o = EnumEntriesKt.a(actionArr);
                d = new Companion();
            }

            public static Action valueOf(String str) {
                return (Action) Enum.valueOf(Action.class, str);
            }

            public static Action[] values() {
                return (Action[]) n.clone();
            }
        }

        static {
            Map mapJ = MapsKt.j(new Pair("screen.Name", "Home screen"), new Pair("app.Section", "Homepage"));
            d = mapJ;
            e = (Pair[]) MapsKt.o(mapJ).toArray(new Pair[0]);
        }

        @Override // au.com.woolworths.analytics.Event
        /* renamed from: d */
        public final String getE() {
            return "home_screen";
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Screen)) {
                return false;
            }
            Screen screen = (Screen) obj;
            return "Home screen".equals(screen.getD()) && "home_screen".equals(screen.getE()) && Intrinsics.c(d, screen.getData());
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
        @Override // au.com.woolworths.analytics.Event
        public final Map getData() {
            return d;
        }

        @Override // au.com.woolworths.analytics.Screen
        /* renamed from: getName */
        public final String getD() {
            return "Home screen";
        }

        public final int hashCode() {
            return d.hashCode() - 767879903;
        }
    }
}
