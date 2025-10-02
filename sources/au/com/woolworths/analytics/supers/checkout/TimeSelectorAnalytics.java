package au.com.woolworths.analytics.supers.checkout;

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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/checkout/TimeSelectorAnalytics;", "", "WindowSelection", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TimeSelectorAnalytics {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/checkout/TimeSelectorAnalytics$WindowSelection;", "Lau/com/woolworths/analytics/Screen;", "Action", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class WindowSelection implements Screen {
        public static final Object d;
        public static final Pair[] e;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/analytics/supers/checkout/TimeSelectorAnalytics$WindowSelection$Action;", "Lau/com/woolworths/analytics/Event;", "", "Companion", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Action implements Event {
            public static final Companion d;
            public static final Action e;
            public static final Action f;
            public static final Action g;
            public static final Action h;
            public static final Action i;
            public static final Action j;
            public static final /* synthetic */ Action[] k;
            public static final /* synthetic */ EnumEntries l;

            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/analytics/supers/checkout/TimeSelectorAnalytics$WindowSelection$Action$Companion;", "", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/checkout/TimeSelectorAnalytics.WindowSelection.Action.DELIVERY_DAY_CLICK", "Lau/com/woolworths/analytics/supers/checkout/TimeSelectorAnalytics$WindowSelection$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class DELIVERY_DAY_CLICK extends Action {
                public final Object m;

                public DELIVERY_DAY_CLICK() {
                    super("DELIVERY_DAY_CLICK", 0);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(WindowSelection.e);
                    spreadBuilder.a(new Pair("event.Action", "click"));
                    spreadBuilder.a(new Pair("event.Category", "button"));
                    androidx.constraintlayout.core.state.a.z("event.Description", "Upfront Fulfilment", spreadBuilder, "event.Label", "Checkout Collection Date");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.m = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "delivery_day_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.m;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/checkout/TimeSelectorAnalytics.WindowSelection.Action.NETWORK_ERROR_IMPRESSION", "Lau/com/woolworths/analytics/supers/checkout/TimeSelectorAnalytics$WindowSelection$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class NETWORK_ERROR_IMPRESSION extends Action {
                public final Object m;

                public NETWORK_ERROR_IMPRESSION() {
                    super("NETWORK_ERROR_IMPRESSION", 2);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(7);
                    spreadBuilder.b(WindowSelection.e);
                    spreadBuilder.a(new Pair("event.Category", "error"));
                    spreadBuilder.a(new Pair("event.Action", "impression"));
                    spreadBuilder.a(new Pair("event.Label", "Network Error"));
                    spreadBuilder.a(new Pair("error.Name", "Full Screen"));
                    androidx.constraintlayout.core.state.a.z("error.Reason", "No network connection. Please try again.", spreadBuilder, "event.Description", "Upfront Fulfilment");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.m = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "error_impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.m;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/checkout/TimeSelectorAnalytics.WindowSelection.Action.NODATA_ERROR_IMPRESSION", "Lau/com/woolworths/analytics/supers/checkout/TimeSelectorAnalytics$WindowSelection$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class NODATA_ERROR_IMPRESSION extends Action {
                public final Object m;

                public NODATA_ERROR_IMPRESSION() {
                    super("NODATA_ERROR_IMPRESSION", 3);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(WindowSelection.e);
                    spreadBuilder.a(new Pair("event.Category", "error"));
                    spreadBuilder.a(new Pair("event.Action", "impression"));
                    androidx.constraintlayout.core.state.a.z("event.Label", "No Windows Available", spreadBuilder, "error.reason", "No Availability");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.m = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "error_impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.m;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/checkout/TimeSelectorAnalytics.WindowSelection.Action.RESERVE_TIME_NETWORK_SNACKBAR_IMPRESSION", "Lau/com/woolworths/analytics/supers/checkout/TimeSelectorAnalytics$WindowSelection$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class RESERVE_TIME_NETWORK_SNACKBAR_IMPRESSION extends Action {
                public final Object m;

                public RESERVE_TIME_NETWORK_SNACKBAR_IMPRESSION() {
                    super("RESERVE_TIME_NETWORK_SNACKBAR_IMPRESSION", 5);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(7);
                    spreadBuilder.b(WindowSelection.e);
                    spreadBuilder.a(new Pair("event.Category", "error"));
                    spreadBuilder.a(new Pair("event.Action", "impression"));
                    spreadBuilder.a(new Pair("event.Label", "Network Error"));
                    spreadBuilder.a(new Pair("event.Description", "Upfront Fulfilment"));
                    androidx.constraintlayout.core.state.a.z("error.Reason", "No network connection. Please try again.", spreadBuilder, "error.Name", "Snackbar");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.m = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "error_impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.m;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/checkout/TimeSelectorAnalytics.WindowSelection.Action.RESERVE_TIME_SERVER_SNACKBAR_IMPRESSION", "Lau/com/woolworths/analytics/supers/checkout/TimeSelectorAnalytics$WindowSelection$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class RESERVE_TIME_SERVER_SNACKBAR_IMPRESSION extends Action {
                public final Object m;

                public RESERVE_TIME_SERVER_SNACKBAR_IMPRESSION() {
                    super("RESERVE_TIME_SERVER_SNACKBAR_IMPRESSION", 4);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(7);
                    spreadBuilder.b(WindowSelection.e);
                    spreadBuilder.a(new Pair("event.Category", "error"));
                    spreadBuilder.a(new Pair("event.Action", "impression"));
                    spreadBuilder.a(new Pair("event.Label", "Server Error"));
                    spreadBuilder.a(new Pair("event.Description", "Upfront Fulfilment"));
                    androidx.constraintlayout.core.state.a.z("error.Reason", "Unable to load at this time.", spreadBuilder, "error.Name", "Snackbar");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.m = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "error_impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.m;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/checkout/TimeSelectorAnalytics.WindowSelection.Action.SERVER_ERROR_IMPRESSION", "Lau/com/woolworths/analytics/supers/checkout/TimeSelectorAnalytics$WindowSelection$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class SERVER_ERROR_IMPRESSION extends Action {
                public final Object m;

                public SERVER_ERROR_IMPRESSION() {
                    super("SERVER_ERROR_IMPRESSION", 1);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(7);
                    spreadBuilder.b(WindowSelection.e);
                    spreadBuilder.a(new Pair("event.Category", "error"));
                    spreadBuilder.a(new Pair("event.Action", "impression"));
                    spreadBuilder.a(new Pair("event.Label", "Server Error"));
                    spreadBuilder.a(new Pair("error.Name", "Full Screen"));
                    androidx.constraintlayout.core.state.a.z("error.Reason", "Unable to load at this time.", spreadBuilder, "event.Description", "Upfront Fulfilment");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.m = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "error_impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.m;
                }
            }

            static {
                DELIVERY_DAY_CLICK delivery_day_click = new DELIVERY_DAY_CLICK();
                e = delivery_day_click;
                SERVER_ERROR_IMPRESSION server_error_impression = new SERVER_ERROR_IMPRESSION();
                f = server_error_impression;
                NETWORK_ERROR_IMPRESSION network_error_impression = new NETWORK_ERROR_IMPRESSION();
                g = network_error_impression;
                NODATA_ERROR_IMPRESSION nodata_error_impression = new NODATA_ERROR_IMPRESSION();
                h = nodata_error_impression;
                RESERVE_TIME_SERVER_SNACKBAR_IMPRESSION reserve_time_server_snackbar_impression = new RESERVE_TIME_SERVER_SNACKBAR_IMPRESSION();
                i = reserve_time_server_snackbar_impression;
                RESERVE_TIME_NETWORK_SNACKBAR_IMPRESSION reserve_time_network_snackbar_impression = new RESERVE_TIME_NETWORK_SNACKBAR_IMPRESSION();
                j = reserve_time_network_snackbar_impression;
                Action[] actionArr = {delivery_day_click, server_error_impression, network_error_impression, nodata_error_impression, reserve_time_server_snackbar_impression, reserve_time_network_snackbar_impression};
                k = actionArr;
                l = EnumEntriesKt.a(actionArr);
                d = new Companion();
            }

            public static Action valueOf(String str) {
                return (Action) Enum.valueOf(Action.class, str);
            }

            public static Action[] values() {
                return (Action[]) k.clone();
            }
        }

        static {
            Map mapJ = MapsKt.j(new Pair("screen.Name", "Window Selection screen"), new Pair("screen.Type", "Checkout"), new Pair("app.Section", "Checkout"));
            d = mapJ;
            e = (Pair[]) MapsKt.o(mapJ).toArray(new Pair[0]);
        }

        @Override // au.com.woolworths.analytics.Event
        /* renamed from: d */
        public final String getE() {
            return "windowselection_screen";
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Screen)) {
                return false;
            }
            Screen screen = (Screen) obj;
            return "Window Selection screen".equals(screen.getD()) && "windowselection_screen".equals(screen.getE()) && Intrinsics.c(d, screen.getData());
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
        @Override // au.com.woolworths.analytics.Event
        public final Map getData() {
            return d;
        }

        @Override // au.com.woolworths.analytics.Screen
        /* renamed from: getName */
        public final String getD() {
            return "Window Selection screen";
        }

        public final int hashCode() {
            return d.hashCode() + 195882785;
        }
    }
}
