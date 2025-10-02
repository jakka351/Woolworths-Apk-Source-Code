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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/lists/SnapAListAnalytics;", "", "ListDetails", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SnapAListAnalytics {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/lists/SnapAListAnalytics$ListDetails;", "Lau/com/woolworths/analytics/Screen;", "Action", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class ListDetails implements Screen {
        public static final Object d;
        public static final Pair[] e;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/analytics/supers/lists/SnapAListAnalytics$ListDetails$Action;", "Lau/com/woolworths/analytics/Event;", "", "Companion", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Action implements Event {
            public static final Companion d;
            public static final Action e;
            public static final Action f;
            public static final Action g;
            public static final /* synthetic */ Action[] h;
            public static final /* synthetic */ EnumEntries i;

            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/analytics/supers/lists/SnapAListAnalytics$ListDetails$Action$Companion;", "", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/lists/SnapAListAnalytics.ListDetails.Action.ENTRY_POINT_CLICK", "Lau/com/woolworths/analytics/supers/lists/SnapAListAnalytics$ListDetails$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class ENTRY_POINT_CLICK extends Action {
                public final Object j;

                public ENTRY_POINT_CLICK() {
                    super("ENTRY_POINT_CLICK", 0);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(ListDetails.e);
                    spreadBuilder.a(new Pair("event.Category", "snap a list"));
                    spreadBuilder.a(new Pair("event.Action", "button_click"));
                    a.y("event.Label", "snap a list icon", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.j = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "snap_a_list_button_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.j;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/lists/SnapAListAnalytics.ListDetails.Action.OVERLAY_CANCEL_BUTTON_CLICK", "Lau/com/woolworths/analytics/supers/lists/SnapAListAnalytics$ListDetails$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class OVERLAY_CANCEL_BUTTON_CLICK extends Action {
                public final Object j;

                public OVERLAY_CANCEL_BUTTON_CLICK() {
                    super("OVERLAY_CANCEL_BUTTON_CLICK", 2);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(ListDetails.e);
                    spreadBuilder.a(new Pair("event.Category", "snap a list"));
                    spreadBuilder.a(new Pair("event.Action", "overlay_button_click"));
                    a.y("event.Label", "cancel", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.j = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "snap_a_list_overlay_button_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.j;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/lists/SnapAListAnalytics.ListDetails.Action.SNACKBAR_IMPRESSION", "Lau/com/woolworths/analytics/supers/lists/SnapAListAnalytics$ListDetails$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class SNACKBAR_IMPRESSION extends Action {
                public final Object j;

                public SNACKBAR_IMPRESSION() {
                    super("SNACKBAR_IMPRESSION", 1);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(ListDetails.e);
                    spreadBuilder.a(new Pair("event.Category", "snap a list"));
                    spreadBuilder.a(new Pair("event.Action", "snackbar_impression"));
                    a.y("event.Label", "items have been added", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.j = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "snap_a_list_snackbar_impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.j;
                }
            }

            static {
                ENTRY_POINT_CLICK entry_point_click = new ENTRY_POINT_CLICK();
                e = entry_point_click;
                SNACKBAR_IMPRESSION snackbar_impression = new SNACKBAR_IMPRESSION();
                f = snackbar_impression;
                OVERLAY_CANCEL_BUTTON_CLICK overlay_cancel_button_click = new OVERLAY_CANCEL_BUTTON_CLICK();
                g = overlay_cancel_button_click;
                Action[] actionArr = {entry_point_click, snackbar_impression, overlay_cancel_button_click};
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
            Map mapJ = MapsKt.j(new Pair("screen.Name", "List Details screen"), new Pair("screen.Type", "lists"), new Pair("app.Section", "Lists"));
            d = mapJ;
            e = (Pair[]) MapsKt.o(mapJ).toArray(new Pair[0]);
        }

        @Override // au.com.woolworths.analytics.Event
        /* renamed from: d */
        public final String getE() {
            return "listdetails_screen";
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Screen)) {
                return false;
            }
            Screen screen = (Screen) obj;
            return "List Details screen".equals(screen.getD()) && "listdetails_screen".equals(screen.getE()) && Intrinsics.c(d, screen.getData());
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
        @Override // au.com.woolworths.analytics.Event
        public final Map getData() {
            return d;
        }

        @Override // au.com.woolworths.analytics.Screen
        /* renamed from: getName */
        public final String getD() {
            return "List Details screen";
        }

        public final int hashCode() {
            return d.hashCode() + 1248175237;
        }
    }
}
