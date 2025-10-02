package au.com.woolworths.analytics.supers.lists;

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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/analytics/supers/lists/WatchlistAnalytics;", "", "Guest", "Impression", "List", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WatchlistAnalytics {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/lists/WatchlistAnalytics$Guest;", "Lau/com/woolworths/analytics/Screen;", "Action", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Guest implements Screen {
        public static final Object d;
        public static final Pair[] e;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/lists/WatchlistAnalytics$Guest$Action;", "Lau/com/woolworths/analytics/Event;", "", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Action implements Event {
            public static final Action d;
            public static final Action e;
            public static final /* synthetic */ Action[] f;
            public static final /* synthetic */ EnumEntries g;

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/lists/WatchlistAnalytics.Guest.Action.LOG_IN", "Lau/com/woolworths/analytics/supers/lists/WatchlistAnalytics$Guest$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class LOG_IN extends Action {
                public final Object h;

                public LOG_IN() {
                    super("LOG_IN", 0);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(Guest.e);
                    spreadBuilder.a(new Pair("event.Category", "button"));
                    spreadBuilder.a(new Pair("event.Action", "click"));
                    a.y("event.Label", "Log In", spreadBuilder);
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

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/lists/WatchlistAnalytics.Guest.Action.SIGN_UP", "Lau/com/woolworths/analytics/supers/lists/WatchlistAnalytics$Guest$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class SIGN_UP extends Action {
                public final Object h;

                public SIGN_UP() {
                    super("SIGN_UP", 1);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(Guest.e);
                    spreadBuilder.a(new Pair("event.Category", "button"));
                    spreadBuilder.a(new Pair("event.Action", "click"));
                    a.y("event.Label", "Sign Up", spreadBuilder);
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
                LOG_IN log_in = new LOG_IN();
                d = log_in;
                SIGN_UP sign_up = new SIGN_UP();
                e = sign_up;
                Action[] actionArr = {log_in, sign_up};
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
            Map mapJ = MapsKt.j(new Pair("screen.Name", "Login Signup screen"), new Pair("app.Section", "Lists"));
            d = mapJ;
            e = (Pair[]) MapsKt.o(mapJ).toArray(new Pair[0]);
        }

        @Override // au.com.woolworths.analytics.Event
        /* renamed from: d */
        public final String getE() {
            return "loginsignup_screen";
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Screen)) {
                return false;
            }
            Screen screen = (Screen) obj;
            return "Login Signup screen".equals(screen.getD()) && "loginsignup_screen".equals(screen.getE()) && Intrinsics.c(d, screen.getData());
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
        @Override // au.com.woolworths.analytics.Event
        public final Map getData() {
            return d;
        }

        @Override // au.com.woolworths.analytics.Screen
        /* renamed from: getName */
        public final String getD() {
            return "Login Signup screen";
        }

        public final int hashCode() {
            return d.hashCode() + 1134317843;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/analytics/supers/lists/WatchlistAnalytics$Impression;", "Lau/com/woolworths/analytics/Screen;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Impression implements Screen {
        public final Object d;

        public Impression(String str) {
            this.d = MapsKt.j(new Pair("screen.Name", "watchlist screen"), new Pair("screen.Type", "lists"), new Pair("event.Action", "impression"), new Pair("event.Category", "watchlist"), new Pair("event.Label", str), new Pair("app.Section", "Lists"));
        }

        @Override // au.com.woolworths.analytics.Event
        /* renamed from: d */
        public final String getE() {
            return "watchlist_impression";
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Screen)) {
                return false;
            }
            Screen screen = (Screen) obj;
            return "watchlist screen".equals(screen.getD()) && "watchlist_impression".equals(screen.getE()) && Intrinsics.c(this.d, screen.getData());
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
        @Override // au.com.woolworths.analytics.Event
        public final Map getData() {
            return this.d;
        }

        @Override // au.com.woolworths.analytics.Screen
        /* renamed from: getName */
        public final String getD() {
            return "watchlist screen";
        }

        public final int hashCode() {
            return this.d.hashCode() + 1439310340;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/lists/WatchlistAnalytics$List;", "Lau/com/woolworths/analytics/Screen;", "Action", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class List implements Screen {
        public static final Object d;
        public static final Pair[] e;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/analytics/supers/lists/WatchlistAnalytics$List$Action;", "Lau/com/woolworths/analytics/Event;", "", "Companion", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Action implements Event {
            public static final Companion d;
            public static final Action e;
            public static final Action f;
            public static final Action g;
            public static final /* synthetic */ Action[] h;
            public static final /* synthetic */ EnumEntries i;

            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/analytics/supers/lists/WatchlistAnalytics$List$Action$Companion;", "", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/lists/WatchlistAnalytics.List.Action.SPECIALS_BANNER_CLICK", "Lau/com/woolworths/analytics/supers/lists/WatchlistAnalytics$List$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class SPECIALS_BANNER_CLICK extends Action {
                public final Object j;

                public SPECIALS_BANNER_CLICK() {
                    super("SPECIALS_BANNER_CLICK", 2);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(3);
                    spreadBuilder.b(List.e);
                    a.z("event.Action", "link_click", spreadBuilder, "event.Label", "TAKE ME THERE!");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.j = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "watchlist_link_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.j;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/lists/WatchlistAnalytics.List.Action.TOGGLE_OFF", "Lau/com/woolworths/analytics/supers/lists/WatchlistAnalytics$List$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class TOGGLE_OFF extends Action {
                public final Object j;

                public TOGGLE_OFF() {
                    super("TOGGLE_OFF", 1);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(3);
                    spreadBuilder.b(List.e);
                    a.z("event.Action", "switch_off", spreadBuilder, "event.Label", "watchlist optout");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.j = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "watchlist_switchoff";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.j;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/lists/WatchlistAnalytics.List.Action.TOGGLE_ON", "Lau/com/woolworths/analytics/supers/lists/WatchlistAnalytics$List$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class TOGGLE_ON extends Action {
                public final Object j;

                public TOGGLE_ON() {
                    super("TOGGLE_ON", 0);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(3);
                    spreadBuilder.b(List.e);
                    a.z("event.Action", "switch_on", spreadBuilder, "event.Label", "watchlist optin");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.j = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "watchlist_switchon";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.j;
                }
            }

            static {
                TOGGLE_ON toggle_on = new TOGGLE_ON();
                e = toggle_on;
                TOGGLE_OFF toggle_off = new TOGGLE_OFF();
                f = toggle_off;
                SPECIALS_BANNER_CLICK specials_banner_click = new SPECIALS_BANNER_CLICK();
                g = specials_banner_click;
                Action[] actionArr = {toggle_on, toggle_off, specials_banner_click};
                h = actionArr;
                i = EnumEntriesKt.a(actionArr);
                d = new Companion();
            }

            public static Action valueOf(String str) {
                return (Action) Enum.valueOf(Action.class, str);
            }

            public static Action[] values() {
                return (Action[]) h.clone();
            }
        }

        static {
            Map mapJ = MapsKt.j(new Pair("screen.Name", "watchlist screen"), new Pair("screen.Type", "lists"), new Pair("event.Category", "watchlist"), new Pair("app.Section", "Lists"));
            d = mapJ;
            e = (Pair[]) MapsKt.o(mapJ).toArray(new Pair[0]);
        }

        @Override // au.com.woolworths.analytics.Event
        /* renamed from: d */
        public final String getE() {
            return "watchlist_screen";
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Screen)) {
                return false;
            }
            Screen screen = (Screen) obj;
            return "watchlist screen".equals(screen.getD()) && "watchlist_screen".equals(screen.getE()) && Intrinsics.c(d, screen.getData());
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
        @Override // au.com.woolworths.analytics.Event
        public final Map getData() {
            return d;
        }

        @Override // au.com.woolworths.analytics.Screen
        /* renamed from: getName */
        public final String getD() {
            return "watchlist screen";
        }

        public final int hashCode() {
            return d.hashCode() - 1674688767;
        }
    }
}
