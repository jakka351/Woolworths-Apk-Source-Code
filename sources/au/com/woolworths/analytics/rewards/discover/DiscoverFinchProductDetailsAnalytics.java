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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/rewards/discover/DiscoverFinchProductDetailsAnalytics;", "", "ProductPage", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DiscoverFinchProductDetailsAnalytics {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/rewards/discover/DiscoverFinchProductDetailsAnalytics$ProductPage;", "Lau/com/woolworths/analytics/Screen;", "Action", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class ProductPage implements Screen {
        public static final Object d;
        public static final Pair[] e;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/analytics/rewards/discover/DiscoverFinchProductDetailsAnalytics$ProductPage$Action;", "Lau/com/woolworths/analytics/Event;", "", "Companion", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Action implements Event {
            public static final /* synthetic */ Action[] d;
            public static final /* synthetic */ EnumEntries e;

            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/analytics/rewards/discover/DiscoverFinchProductDetailsAnalytics$ProductPage$Action$Companion;", "", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/rewards/discover/DiscoverFinchProductDetailsAnalytics.ProductPage.Action.INFO_BUTTON", "Lau/com/woolworths/analytics/rewards/discover/DiscoverFinchProductDetailsAnalytics$ProductPage$Action;", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class INFO_BUTTON extends Action {
                public final Object f;

                public INFO_BUTTON() {
                    super("INFO_BUTTON", 1);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(ProductPage.e);
                    spreadBuilder.a(new Pair("event.Action", "click"));
                    spreadBuilder.a(new Pair("event.Category", "finch"));
                    a.y("event.Label", "More information", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.f = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "finch_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.f;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/rewards/discover/DiscoverFinchProductDetailsAnalytics.ProductPage.Action.PAGE_IMPRESSION", "Lau/com/woolworths/analytics/rewards/discover/DiscoverFinchProductDetailsAnalytics$ProductPage$Action;", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class PAGE_IMPRESSION extends Action {
                public final Object f;

                public PAGE_IMPRESSION() {
                    super("PAGE_IMPRESSION", 0);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(ProductPage.e);
                    spreadBuilder.a(new Pair("event.Action", "impression"));
                    spreadBuilder.a(new Pair("event.Category", "finch"));
                    a.y("event.Label", "Discover Tableware items", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.f = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "finch_impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.f;
                }
            }

            static {
                Action[] actionArr = {new PAGE_IMPRESSION(), new INFO_BUTTON()};
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
            Map mapJ = MapsKt.j(new Pair("screen.Name", "Finch Product Page"), new Pair("app.Section", "Discover"));
            d = mapJ;
            e = (Pair[]) MapsKt.o(mapJ).toArray(new Pair[0]);
        }

        @Override // au.com.woolworths.analytics.Event
        /* renamed from: d */
        public final String getE() {
            return "finchproductpage_screen";
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Screen)) {
                return false;
            }
            Screen screen = (Screen) obj;
            return "Finch Product Page".equals(screen.getD()) && "finchproductpage_screen".equals(screen.getE()) && Intrinsics.c(d, screen.getData());
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
        @Override // au.com.woolworths.analytics.Event
        public final Map getData() {
            return d;
        }

        @Override // au.com.woolworths.analytics.Screen
        /* renamed from: getName */
        public final String getD() {
            return "Finch Product Page";
        }

        public final int hashCode() {
            return d.hashCode() + 21564947;
        }
    }
}
