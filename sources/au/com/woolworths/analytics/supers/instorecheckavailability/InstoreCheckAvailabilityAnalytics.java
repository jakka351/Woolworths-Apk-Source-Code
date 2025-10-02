package au.com.woolworths.analytics.supers.instorecheckavailability;

import androidx.constraintlayout.core.state.a;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.Screen;
import com.salesforce.marketingcloud.storage.db.k;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/analytics/supers/instorecheckavailability/InstoreCheckAvailabilityAnalytics;", "", "CheckStockScreen", "ErrorScreen", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class InstoreCheckAvailabilityAnalytics {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/instorecheckavailability/InstoreCheckAvailabilityAnalytics$CheckStockScreen;", "Lau/com/woolworths/analytics/Screen;", "Action", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class CheckStockScreen implements Screen {
        public static final CheckStockScreen d = new CheckStockScreen();
        public static final Object e;
        public static final Pair[] f;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/instorecheckavailability/InstoreCheckAvailabilityAnalytics$CheckStockScreen$Action;", "Lau/com/woolworths/analytics/Event;", "", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Action implements Event {
            public static final Action d;
            public static final Action e;
            public static final /* synthetic */ Action[] f;
            public static final /* synthetic */ EnumEntries g;

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/instorecheckavailability/InstoreCheckAvailabilityAnalytics.CheckStockScreen.Action.BACK_BUTTON_CLICK", "Lau/com/woolworths/analytics/supers/instorecheckavailability/InstoreCheckAvailabilityAnalytics$CheckStockScreen$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class BACK_BUTTON_CLICK extends Action {
                public final Object h;

                public BACK_BUTTON_CLICK() {
                    super("BACK_BUTTON_CLICK", 0);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(CheckStockScreen.f);
                    spreadBuilder.a(new Pair(k.a.b, "android"));
                    spreadBuilder.a(new Pair("event.Category", "button"));
                    a.z("event.Action", "button_click", spreadBuilder, "event.Label", "back");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.h = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "button_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.h;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/instorecheckavailability/InstoreCheckAvailabilityAnalytics.CheckStockScreen.Action.STORE_DETAILS_BUTTON_CLICK", "Lau/com/woolworths/analytics/supers/instorecheckavailability/InstoreCheckAvailabilityAnalytics$CheckStockScreen$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class STORE_DETAILS_BUTTON_CLICK extends Action {
                public final Object h;

                public STORE_DETAILS_BUTTON_CLICK() {
                    super("STORE_DETAILS_BUTTON_CLICK", 1);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(CheckStockScreen.f);
                    spreadBuilder.a(new Pair("event.Category", "button"));
                    spreadBuilder.a(new Pair("event.Action", "button_click"));
                    a.y("event.Label", "store details", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.h = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "button_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.h;
                }
            }

            static {
                BACK_BUTTON_CLICK back_button_click = new BACK_BUTTON_CLICK();
                d = back_button_click;
                STORE_DETAILS_BUTTON_CLICK store_details_button_click = new STORE_DETAILS_BUTTON_CLICK();
                e = store_details_button_click;
                Action[] actionArr = {back_button_click, store_details_button_click};
                f = actionArr;
                g = EnumEntriesKt.a(actionArr);
            }

            public static Action valueOf(String str) {
                return (Action) Enum.valueOf(Action.class, str);
            }

            public static Action[] values() {
                return (Action[]) f.clone();
            }
        }

        static {
            Map mapJ = MapsKt.j(new Pair("screen.Name", "check stock"), new Pair("screen.Type", "store details"), new Pair("app.Section", "check stock"));
            e = mapJ;
            f = (Pair[]) MapsKt.o(mapJ).toArray(new Pair[0]);
        }

        @Override // au.com.woolworths.analytics.Event
        /* renamed from: d */
        public final String getE() {
            return "check_stock_screen";
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Screen)) {
                return false;
            }
            Screen screen = (Screen) obj;
            return "check stock".equals(screen.getD()) && "check_stock_screen".equals(screen.getE()) && Intrinsics.c(e, screen.getData());
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
        @Override // au.com.woolworths.analytics.Event
        public final Map getData() {
            return e;
        }

        @Override // au.com.woolworths.analytics.Screen
        /* renamed from: getName */
        public final String getD() {
            return "check stock";
        }

        public final int hashCode() {
            return e.hashCode() - 1956560782;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/instorecheckavailability/InstoreCheckAvailabilityAnalytics$ErrorScreen;", "Lau/com/woolworths/analytics/Screen;", "Action", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class ErrorScreen implements Screen {
        public static final Object d;
        public static final Pair[] e;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/instorecheckavailability/InstoreCheckAvailabilityAnalytics$ErrorScreen$Action;", "Lau/com/woolworths/analytics/Event;", "", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Action implements Event {
            public static final Action d;
            public static final Action e;
            public static final /* synthetic */ Action[] f;
            public static final /* synthetic */ EnumEntries g;

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/instorecheckavailability/InstoreCheckAvailabilityAnalytics.ErrorScreen.Action.CONNECTION_ERROR_IMPRESSION", "Lau/com/woolworths/analytics/supers/instorecheckavailability/InstoreCheckAvailabilityAnalytics$ErrorScreen$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class CONNECTION_ERROR_IMPRESSION extends Action {
                public final Object h;

                public CONNECTION_ERROR_IMPRESSION() {
                    super("CONNECTION_ERROR_IMPRESSION", 1);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(ErrorScreen.e);
                    spreadBuilder.a(new Pair("event.Category", "error"));
                    spreadBuilder.a(new Pair("event.Action", "error_impression"));
                    a.y("event.Label", "connection error", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.h = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "connection_error_screen";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.h;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/instorecheckavailability/InstoreCheckAvailabilityAnalytics.ErrorScreen.Action.SERVER_ERROR_IMPRESSION", "Lau/com/woolworths/analytics/supers/instorecheckavailability/InstoreCheckAvailabilityAnalytics$ErrorScreen$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class SERVER_ERROR_IMPRESSION extends Action {
                public final Object h;

                public SERVER_ERROR_IMPRESSION() {
                    super("SERVER_ERROR_IMPRESSION", 0);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(ErrorScreen.e);
                    spreadBuilder.a(new Pair("event.Category", "error"));
                    spreadBuilder.a(new Pair("event.Action", "error_impression"));
                    a.y("event.Label", "server error", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.h = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "server_error_screen";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.h;
                }
            }

            static {
                SERVER_ERROR_IMPRESSION server_error_impression = new SERVER_ERROR_IMPRESSION();
                d = server_error_impression;
                CONNECTION_ERROR_IMPRESSION connection_error_impression = new CONNECTION_ERROR_IMPRESSION();
                e = connection_error_impression;
                Action[] actionArr = {server_error_impression, connection_error_impression};
                f = actionArr;
                g = EnumEntriesKt.a(actionArr);
            }

            public static Action valueOf(String str) {
                return (Action) Enum.valueOf(Action.class, str);
            }

            public static Action[] values() {
                return (Action[]) f.clone();
            }
        }

        static {
            Map mapJ = MapsKt.j(new Pair("screen.Name", "check stock"), new Pair("screen.Type", "store details"), new Pair("app.Section", "check stock"));
            d = mapJ;
            e = (Pair[]) MapsKt.o(mapJ).toArray(new Pair[0]);
        }

        @Override // au.com.woolworths.analytics.Event
        /* renamed from: d */
        public final String getE() {
            return "checkstock_screen";
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Screen)) {
                return false;
            }
            Screen screen = (Screen) obj;
            return "check stock".equals(screen.getD()) && "checkstock_screen".equals(screen.getE()) && Intrinsics.c(d, screen.getData());
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
        @Override // au.com.woolworths.analytics.Event
        public final Map getData() {
            return d;
        }

        @Override // au.com.woolworths.analytics.Screen
        /* renamed from: getName */
        public final String getD() {
            return "check stock";
        }

        public final int hashCode() {
            return d.hashCode() - 1471185055;
        }
    }
}
