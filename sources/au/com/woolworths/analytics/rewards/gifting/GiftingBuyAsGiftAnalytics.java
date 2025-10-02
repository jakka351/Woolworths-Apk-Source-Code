package au.com.woolworths.analytics.rewards.gifting;

import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.Screen;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/analytics/rewards/gifting/GiftingBuyAsGiftAnalytics;", "", "Step1ViewEvent", "Step2ViewEvent", "Step1", "Step2", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class GiftingBuyAsGiftAnalytics {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/rewards/gifting/GiftingBuyAsGiftAnalytics$Step1;", "Lau/com/woolworths/analytics/Screen;", "Action", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Step1 implements Screen {
        public static final Object d;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/analytics/rewards/gifting/GiftingBuyAsGiftAnalytics$Step1$Action;", "Lau/com/woolworths/analytics/Event;", "", "Companion", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Action implements Event {
            public static final /* synthetic */ Action[] d;
            public static final /* synthetic */ EnumEntries e;

            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/analytics/rewards/gifting/GiftingBuyAsGiftAnalytics$Step1$Action$Companion;", "", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
            Map mapJ = MapsKt.j(new Pair("screen.Name", "Buy as a gift - step 1"), new Pair("app.Section", "Everyday Gifting"));
            d = mapJ;
        }

        @Override // au.com.woolworths.analytics.Event
        /* renamed from: d */
        public final String getD() {
            return "buyasagift-step1_screen";
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Screen)) {
                return false;
            }
            Screen screen = (Screen) obj;
            return "Buy as a gift - step 1".equals(screen.getD()) && "buyasagift-step1_screen".equals(screen.getD()) && Intrinsics.c(d, screen.getData());
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
        @Override // au.com.woolworths.analytics.Event
        public final Map getData() {
            return d;
        }

        @Override // au.com.woolworths.analytics.Screen
        /* renamed from: getName */
        public final String getD() {
            return "Buy as a gift - step 1";
        }

        public final int hashCode() {
            return d.hashCode() + 283870515;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/analytics/rewards/gifting/GiftingBuyAsGiftAnalytics$Step1ViewEvent;", "Lau/com/woolworths/analytics/Screen;", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Step1ViewEvent implements Screen {
        @Override // au.com.woolworths.analytics.Event
        /* renamed from: d */
        public final String getD() {
            return null;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Screen)) {
                return false;
            }
            Screen screen = (Screen) obj;
            return Intrinsics.c(null, screen.getD()) && Intrinsics.c(null, screen.getD()) && Intrinsics.c(null, screen.getData());
        }

        @Override // au.com.woolworths.analytics.Event
        public final Map getData() {
            return null;
        }

        @Override // au.com.woolworths.analytics.Screen
        /* renamed from: getName */
        public final String getD() {
            return null;
        }

        public final int hashCode() {
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/rewards/gifting/GiftingBuyAsGiftAnalytics$Step2;", "Lau/com/woolworths/analytics/Screen;", "Action", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Step2 implements Screen {
        public static final Object d;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/analytics/rewards/gifting/GiftingBuyAsGiftAnalytics$Step2$Action;", "Lau/com/woolworths/analytics/Event;", "", "Companion", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Action implements Event {
            public static final /* synthetic */ Action[] d;
            public static final /* synthetic */ EnumEntries e;

            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/analytics/rewards/gifting/GiftingBuyAsGiftAnalytics$Step2$Action$Companion;", "", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
            Map mapJ = MapsKt.j(new Pair("screen.Name", "Buy as a gift - step 2"), new Pair("app.Section", "Everyday Gifting"));
            d = mapJ;
        }

        @Override // au.com.woolworths.analytics.Event
        /* renamed from: d */
        public final String getD() {
            return "buyasagift-step2_screen";
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Screen)) {
                return false;
            }
            Screen screen = (Screen) obj;
            return "Buy as a gift - step 2".equals(screen.getD()) && "buyasagift-step2_screen".equals(screen.getD()) && Intrinsics.c(d, screen.getData());
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
        @Override // au.com.woolworths.analytics.Event
        public final Map getData() {
            return d;
        }

        @Override // au.com.woolworths.analytics.Screen
        /* renamed from: getName */
        public final String getD() {
            return "Buy as a gift - step 2";
        }

        public final int hashCode() {
            return d.hashCode() - 1523582987;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/analytics/rewards/gifting/GiftingBuyAsGiftAnalytics$Step2ViewEvent;", "Lau/com/woolworths/analytics/Screen;", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Step2ViewEvent implements Screen {
        @Override // au.com.woolworths.analytics.Event
        /* renamed from: d */
        public final String getD() {
            return null;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Screen)) {
                return false;
            }
            Screen screen = (Screen) obj;
            return Intrinsics.c(null, screen.getD()) && Intrinsics.c(null, screen.getD()) && Intrinsics.c(null, screen.getData());
        }

        @Override // au.com.woolworths.analytics.Event
        public final Map getData() {
            return null;
        }

        @Override // au.com.woolworths.analytics.Screen
        /* renamed from: getName */
        public final String getD() {
            return null;
        }

        public final int hashCode() {
            throw null;
        }
    }
}
