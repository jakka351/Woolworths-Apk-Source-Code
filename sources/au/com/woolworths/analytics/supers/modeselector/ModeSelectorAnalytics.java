package au.com.woolworths.analytics.supers.modeselector;

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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/modeselector/ModeSelectorAnalytics;", "", "ModeSelector", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ModeSelectorAnalytics {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/modeselector/ModeSelectorAnalytics$ModeSelector;", "Lau/com/woolworths/analytics/Screen;", "Action", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class ModeSelector implements Screen {
        public static final Object d;
        public static final Pair[] e;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/analytics/supers/modeselector/ModeSelectorAnalytics$ModeSelector$Action;", "Lau/com/woolworths/analytics/Event;", "", "Companion", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Action implements Event {
            public static final Companion d;
            public static final Action e;
            public static final Action f;
            public static final /* synthetic */ Action[] g;
            public static final /* synthetic */ EnumEntries h;

            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/analytics/supers/modeselector/ModeSelectorAnalytics$ModeSelector$Action$Companion;", "", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/modeselector/ModeSelectorAnalytics.ModeSelector.Action.FULL_SCREEN_NETWORK_ERROR", "Lau/com/woolworths/analytics/supers/modeselector/ModeSelectorAnalytics$ModeSelector$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class FULL_SCREEN_NETWORK_ERROR extends Action {
                public final Object i;

                public FULL_SCREEN_NETWORK_ERROR() {
                    super("FULL_SCREEN_NETWORK_ERROR", 1);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(7);
                    spreadBuilder.b(ModeSelector.e);
                    spreadBuilder.a(new Pair("event.Category", "error"));
                    spreadBuilder.a(new Pair("event.Action", "impression"));
                    spreadBuilder.a(new Pair("event.Label", "Network Error"));
                    spreadBuilder.a(new Pair("event.Description", "Upfront Fulfilment"));
                    a.z("error.Reason", "No network connection. Please try again.", spreadBuilder, "error.Name", "Full Screen");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.i = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "error_impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.i;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/modeselector/ModeSelectorAnalytics.ModeSelector.Action.SNACKBAR_NETWORK_ERROR", "Lau/com/woolworths/analytics/supers/modeselector/ModeSelectorAnalytics$ModeSelector$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class SNACKBAR_NETWORK_ERROR extends Action {
                public final Object i;

                public SNACKBAR_NETWORK_ERROR() {
                    super("SNACKBAR_NETWORK_ERROR", 0);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(7);
                    spreadBuilder.b(ModeSelector.e);
                    spreadBuilder.a(new Pair("event.Category", "error"));
                    spreadBuilder.a(new Pair("event.Action", "impression"));
                    spreadBuilder.a(new Pair("event.Label", "Network Error"));
                    spreadBuilder.a(new Pair("event.Description", "Upfront Fulfilment"));
                    a.z("error.Reason", "No network connection. Please try again.", spreadBuilder, "error.Name", "Snackbar");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.i = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "error_impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.i;
                }
            }

            static {
                SNACKBAR_NETWORK_ERROR snackbar_network_error = new SNACKBAR_NETWORK_ERROR();
                e = snackbar_network_error;
                FULL_SCREEN_NETWORK_ERROR full_screen_network_error = new FULL_SCREEN_NETWORK_ERROR();
                f = full_screen_network_error;
                Action[] actionArr = {snackbar_network_error, full_screen_network_error};
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
            Map mapJ = MapsKt.j(new Pair("screen.Name", "Collection Mode screen"), new Pair("app.Section", "Collection Mode"));
            d = mapJ;
            e = (Pair[]) MapsKt.o(mapJ).toArray(new Pair[0]);
        }

        @Override // au.com.woolworths.analytics.Event
        /* renamed from: d */
        public final String getE() {
            return "collectionmode_screen";
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Screen)) {
                return false;
            }
            Screen screen = (Screen) obj;
            return "Collection Mode screen".equals(screen.getD()) && "collectionmode_screen".equals(screen.getE()) && Intrinsics.c(d, screen.getData());
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
        @Override // au.com.woolworths.analytics.Event
        public final Map getData() {
            return d;
        }

        @Override // au.com.woolworths.analytics.Screen
        /* renamed from: getName */
        public final String getD() {
            return "Collection Mode screen";
        }

        public final int hashCode() {
            return d.hashCode() - 314443427;
        }
    }
}
