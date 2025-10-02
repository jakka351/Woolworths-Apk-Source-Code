package au.com.woolworths.analytics.rewards.home;

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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/analytics/rewards/home/HomeAnalytics;", "", "Points", "Home", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HomeAnalytics {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/rewards/home/HomeAnalytics$Home;", "Lau/com/woolworths/analytics/Screen;", "Action", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Home implements Screen {
        public static final Object d;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/analytics/rewards/home/HomeAnalytics$Home$Action;", "Lau/com/woolworths/analytics/Event;", "", "Companion", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Action implements Event {
            public static final /* synthetic */ Action[] d;
            public static final /* synthetic */ EnumEntries e;

            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/analytics/rewards/home/HomeAnalytics$Home$Action$Companion;", "", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
            }

            static {
                Action[] actionArr = new Action[0];
                d = actionArr;
                e = EnumEntriesKt.a(actionArr);
            }

            public static Action valueOf(String str) {
                return (Action) Enum.valueOf(Action.class, str);
            }

            public static Action[] values() {
                return (Action[]) d.clone();
            }
        }

        static {
            Map mapJ = MapsKt.j(new Pair("screen.Name", "Home screen"), new Pair("app.Section", "Home"));
            d = mapJ;
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/rewards/home/HomeAnalytics$Points;", "Lau/com/woolworths/analytics/Screen;", "Action", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Points implements Screen {
        public static final Object d;
        public static final Pair[] e;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/analytics/rewards/home/HomeAnalytics$Points$Action;", "Lau/com/woolworths/analytics/Event;", "", "Companion", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Action implements Event {
            public static final Companion d;
            public static final /* synthetic */ Action[] e;
            public static final /* synthetic */ EnumEntries f;

            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/analytics/rewards/home/HomeAnalytics$Points$Action$Companion;", "", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/rewards/home/HomeAnalytics.Points.Action.EVERYDAY_REWARDS_LOGO_CLICK", "Lau/com/woolworths/analytics/rewards/home/HomeAnalytics$Points$Action;", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class EVERYDAY_REWARDS_LOGO_CLICK extends Action {
                public final Object g;

                public EVERYDAY_REWARDS_LOGO_CLICK() {
                    super("EVERYDAY_REWARDS_LOGO_CLICK", 2);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(Points.e);
                    spreadBuilder.a(new Pair("event.Category", "button"));
                    spreadBuilder.a(new Pair("event.Action", "click"));
                    a.z("event.Label", "Everyday Rewards", spreadBuilder, "event.Description", "Everyday Rewards logo");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.g = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "button_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.g;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/rewards/home/HomeAnalytics.Points.Action.GAMIFICATION_BANNER", "Lau/com/woolworths/analytics/rewards/home/HomeAnalytics$Points$Action;", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class GAMIFICATION_BANNER extends Action {
                public final Object g;

                public GAMIFICATION_BANNER() {
                    super("GAMIFICATION_BANNER", 0);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(Points.e);
                    spreadBuilder.a(new Pair("event.Category", "banner"));
                    spreadBuilder.a(new Pair("event.Action", "impression"));
                    a.y("event.Label", "gamification", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.g = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "gamification_banner_impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.g;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/rewards/home/HomeAnalytics.Points.Action.PROFILE_CLICK", "Lau/com/woolworths/analytics/rewards/home/HomeAnalytics$Points$Action;", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class PROFILE_CLICK extends Action {
                public final Object g;

                public PROFILE_CLICK() {
                    super("PROFILE_CLICK", 3);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(Points.e);
                    spreadBuilder.a(new Pair("event.Category", "button"));
                    spreadBuilder.a(new Pair("event.Action", "click"));
                    a.z("event.Label", "Profile", spreadBuilder, "event.Description", "Profile icon");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.g = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "button_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.g;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/rewards/home/HomeAnalytics.Points.Action.SHOW_CARD_CLICK", "Lau/com/woolworths/analytics/rewards/home/HomeAnalytics$Points$Action;", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class SHOW_CARD_CLICK extends Action {
                public final Object g;

                public SHOW_CARD_CLICK() {
                    super("SHOW_CARD_CLICK", 5);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(Points.e);
                    spreadBuilder.a(new Pair("event.Category", "banner"));
                    spreadBuilder.a(new Pair("event.Action", "click"));
                    a.y("event.Label", "Show card", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.g = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "banner_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.g;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/rewards/home/HomeAnalytics.Points.Action.SHOW_CARD_IMPRESSION", "Lau/com/woolworths/analytics/rewards/home/HomeAnalytics$Points$Action;", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class SHOW_CARD_IMPRESSION extends Action {
                public final Object g;

                public SHOW_CARD_IMPRESSION() {
                    super("SHOW_CARD_IMPRESSION", 1);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(Points.e);
                    spreadBuilder.a(new Pair("event.Category", "banner"));
                    spreadBuilder.a(new Pair("event.Action", "impression"));
                    a.y("event.Label", "Show card", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.g = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "banner_impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.g;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/rewards/home/HomeAnalytics.Points.Action.STATUS_BUTTON_CLICK", "Lau/com/woolworths/analytics/rewards/home/HomeAnalytics$Points$Action;", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class STATUS_BUTTON_CLICK extends Action {
                public final Object g;

                public STATUS_BUTTON_CLICK() {
                    super("STATUS_BUTTON_CLICK", 6);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(Points.e);
                    spreadBuilder.a(new Pair("event.Category", "Everyday Extra"));
                    spreadBuilder.a(new Pair("event.Action", "click"));
                    a.z("event.Label", "X Subscriber", spreadBuilder, "event.Description", "updated to clickable");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.g = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "button_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.g;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/rewards/home/HomeAnalytics.Points.Action.STATUS_LABEL_CLICK", "Lau/com/woolworths/analytics/rewards/home/HomeAnalytics$Points$Action;", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class STATUS_LABEL_CLICK extends Action {
                public final Object g;

                public STATUS_LABEL_CLICK() {
                    super("STATUS_LABEL_CLICK", 7);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(Points.e);
                    spreadBuilder.a(new Pair("event.Category", "Everyday Extra"));
                    spreadBuilder.a(new Pair("event.Action", "click"));
                    a.z("event.Label", "X Subscriber", spreadBuilder, "event.Description", "Non Clickable icon");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.g = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "icon_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.g;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/rewards/home/HomeAnalytics.Points.Action.VOUCHERS_ERROR", "Lau/com/woolworths/analytics/rewards/home/HomeAnalytics$Points$Action;", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class VOUCHERS_ERROR extends Action {
                public final Object g;

                public VOUCHERS_ERROR() {
                    super("VOUCHERS_ERROR", 4);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(3);
                    spreadBuilder.b(Points.e);
                    a.z("event.Category", "error", spreadBuilder, "event.Label", "network error");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.g = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "error_impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.g;
                }
            }

            static {
                Action[] actionArr = {new GAMIFICATION_BANNER(), new SHOW_CARD_IMPRESSION(), new EVERYDAY_REWARDS_LOGO_CLICK(), new PROFILE_CLICK(), new VOUCHERS_ERROR(), new SHOW_CARD_CLICK(), new STATUS_BUTTON_CLICK(), new STATUS_LABEL_CLICK()};
                e = actionArr;
                f = EnumEntriesKt.a(actionArr);
                d = new Companion();
            }

            public static Action valueOf(String str) {
                return (Action) Enum.valueOf(Action.class, str);
            }

            public static Action[] values() {
                return (Action[]) e.clone();
            }
        }

        static {
            Map mapJ = MapsKt.j(new Pair("screen.Name", "Points"), new Pair("app.Section", "Home"));
            d = mapJ;
            e = (Pair[]) MapsKt.o(mapJ).toArray(new Pair[0]);
        }

        @Override // au.com.woolworths.analytics.Event
        /* renamed from: d */
        public final String getE() {
            return "points_screen";
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Screen)) {
                return false;
            }
            Screen screen = (Screen) obj;
            return "Points".equals(screen.getD()) && "points_screen".equals(screen.getE()) && Intrinsics.c(d, screen.getData());
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
        @Override // au.com.woolworths.analytics.Event
        public final Map getData() {
            return d;
        }

        @Override // au.com.woolworths.analytics.Screen
        /* renamed from: getName */
        public final String getD() {
            return "Points";
        }

        public final int hashCode() {
            return d.hashCode() - 922496517;
        }
    }
}
