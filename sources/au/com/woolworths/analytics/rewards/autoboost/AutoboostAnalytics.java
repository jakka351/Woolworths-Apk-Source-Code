package au.com.woolworths.analytics.rewards.autoboost;

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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/rewards/autoboost/AutoboostAnalytics;", "", "Home", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AutoboostAnalytics {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/rewards/autoboost/AutoboostAnalytics$Home;", "Lau/com/woolworths/analytics/Screen;", "Action", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Home implements Screen {
        public static final Object d;
        public static final Pair[] e;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/analytics/rewards/autoboost/AutoboostAnalytics$Home$Action;", "Lau/com/woolworths/analytics/Event;", "", "Companion", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Action implements Event {
            public static final Companion d;
            public static final Action e;
            public static final Action f;
            public static final /* synthetic */ Action[] g;
            public static final /* synthetic */ EnumEntries h;

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/rewards/autoboost/AutoboostAnalytics.Home.Action.AUTOBOOST_OFF", "Lau/com/woolworths/analytics/rewards/autoboost/AutoboostAnalytics$Home$Action;", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class AUTOBOOST_OFF extends Action {
                public final Object i;

                public AUTOBOOST_OFF() {
                    super("AUTOBOOST_OFF", 1);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(3);
                    spreadBuilder.b(Home.e);
                    a.z("event.Category", "Auto Boost", spreadBuilder, "event.Description", "Auto Boost - off");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.i = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "points_screen";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.i;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/rewards/autoboost/AutoboostAnalytics.Home.Action.AUTOBOOST_ON", "Lau/com/woolworths/analytics/rewards/autoboost/AutoboostAnalytics$Home$Action;", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class AUTOBOOST_ON extends Action {
                public final Object i;

                public AUTOBOOST_ON() {
                    super("AUTOBOOST_ON", 0);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(3);
                    spreadBuilder.b(Home.e);
                    a.z("event.Category", "Auto Boost", spreadBuilder, "event.Description", "Auto Boost - on");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.i = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "points_screen";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.i;
                }
            }

            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/analytics/rewards/autoboost/AutoboostAnalytics$Home$Action$Companion;", "", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
            }

            static {
                AUTOBOOST_ON autoboost_on = new AUTOBOOST_ON();
                e = autoboost_on;
                AUTOBOOST_OFF autoboost_off = new AUTOBOOST_OFF();
                f = autoboost_off;
                Action[] actionArr = {autoboost_on, autoboost_off};
                g = actionArr;
                h = EnumEntriesKt.a(actionArr);
                d = new Companion();
            }

            public static Action valueOf(String str) {
                return (Action) Enum.valueOf(Action.class, str);
            }

            public static Action[] values() {
                return (Action[]) g.clone();
            }
        }

        static {
            Map mapJ = MapsKt.j(new Pair("screen.Name", "Points"), new Pair("app.Section", "Boosters"));
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
