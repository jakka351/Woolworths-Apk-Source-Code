package au.com.woolworths.analytics.rewards.discover;

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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/rewards/discover/DiscoverFinchInfoAnalytics;", "", "FinchInfo", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DiscoverFinchInfoAnalytics {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/rewards/discover/DiscoverFinchInfoAnalytics$FinchInfo;", "Lau/com/woolworths/analytics/Screen;", "Action", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class FinchInfo implements Screen {
        public static final Object d;
        public static final Pair[] e;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/analytics/rewards/discover/DiscoverFinchInfoAnalytics$FinchInfo$Action;", "Lau/com/woolworths/analytics/Event;", "", "Companion", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Action implements Event {
            public static final /* synthetic */ Action[] d;
            public static final /* synthetic */ EnumEntries e;

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/rewards/discover/DiscoverFinchInfoAnalytics.FinchInfo.Action.CLOSE_BUTTON", "Lau/com/woolworths/analytics/rewards/discover/DiscoverFinchInfoAnalytics$FinchInfo$Action;", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class CLOSE_BUTTON extends Action {
                public final Object f;

                public CLOSE_BUTTON() {
                    super("CLOSE_BUTTON", 0);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(FinchInfo.e);
                    spreadBuilder.a(new Pair("event.Action", "click"));
                    spreadBuilder.a(new Pair("event.Category", "button"));
                    a.y("event.Label", "Close Button", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.f = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "button_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.f;
                }
            }

            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/analytics/rewards/discover/DiscoverFinchInfoAnalytics$FinchInfo$Action$Companion;", "", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/rewards/discover/DiscoverFinchInfoAnalytics.FinchInfo.Action.MAYBE_LATER_BUTTON", "Lau/com/woolworths/analytics/rewards/discover/DiscoverFinchInfoAnalytics$FinchInfo$Action;", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class MAYBE_LATER_BUTTON extends Action {
                public final Object f;

                public MAYBE_LATER_BUTTON() {
                    super("MAYBE_LATER_BUTTON", 2);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(FinchInfo.e);
                    spreadBuilder.a(new Pair("event.Action", "click"));
                    spreadBuilder.a(new Pair("event.Category", "button"));
                    a.y("event.Label", "Maybe later", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.f = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "button_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.f;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/rewards/discover/DiscoverFinchInfoAnalytics.FinchInfo.Action.VIEW_TABLEWARE_ITEMS_BUTTON", "Lau/com/woolworths/analytics/rewards/discover/DiscoverFinchInfoAnalytics$FinchInfo$Action;", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class VIEW_TABLEWARE_ITEMS_BUTTON extends Action {
                public final Object f;

                public VIEW_TABLEWARE_ITEMS_BUTTON() {
                    super("VIEW_TABLEWARE_ITEMS_BUTTON", 1);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(FinchInfo.e);
                    spreadBuilder.a(new Pair("event.Action", "click"));
                    spreadBuilder.a(new Pair("event.Category", "button"));
                    a.y("event.Label", "View tableware items", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.f = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "button_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.f;
                }
            }

            static {
                Action[] actionArr = {new CLOSE_BUTTON(), new VIEW_TABLEWARE_ITEMS_BUTTON(), new MAYBE_LATER_BUTTON()};
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
            Map mapJ = MapsKt.j(new Pair("screen.Name", "Finch campaign page"), new Pair("app.Section", "Discover"));
            d = mapJ;
            e = (Pair[]) MapsKt.o(mapJ).toArray(new Pair[0]);
        }

        @Override // au.com.woolworths.analytics.Event
        /* renamed from: d */
        public final String getE() {
            return "finchcampaignpage_screen";
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Screen)) {
                return false;
            }
            Screen screen = (Screen) obj;
            return "Finch campaign page".equals(screen.getD()) && "finchcampaignpage_screen".equals(screen.getE()) && Intrinsics.c(d, screen.getData());
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
        @Override // au.com.woolworths.analytics.Event
        public final Map getData() {
            return d;
        }

        @Override // au.com.woolworths.analytics.Screen
        /* renamed from: getName */
        public final String getD() {
            return "Finch campaign page";
        }

        public final int hashCode() {
            return d.hashCode() + 565299059;
        }
    }
}
