package au.com.woolworths.analytics.supers.inbox;

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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/analytics/supers/inbox/InboxAnalytics;", "", "Inbox", "Tncs", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class InboxAnalytics {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/inbox/InboxAnalytics$Inbox;", "Lau/com/woolworths/analytics/Screen;", "Action", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Inbox implements Screen {
        public static final Inbox d = new Inbox();
        public static final Object e;
        public static final Pair[] f;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/analytics/supers/inbox/InboxAnalytics$Inbox$Action;", "Lau/com/woolworths/analytics/Event;", "", "Companion", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Action implements Event {
            public static final Companion d;
            public static final Action e;
            public static final Action f;
            public static final Action g;
            public static final Action h;
            public static final Action i;
            public static final /* synthetic */ Action[] j;
            public static final /* synthetic */ EnumEntries k;

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/inbox/InboxAnalytics.Inbox.Action.CLEAR_ALL_CLICK", "Lau/com/woolworths/analytics/supers/inbox/InboxAnalytics$Inbox$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class CLEAR_ALL_CLICK extends Action {
                public final Object l;

                public CLEAR_ALL_CLICK() {
                    super("CLEAR_ALL_CLICK", 1);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(Inbox.f);
                    spreadBuilder.a(new Pair("event.Category", "message centre"));
                    spreadBuilder.a(new Pair("event.Action", "link_click"));
                    a.y("event.Label", "Clear all", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.l = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "message_centre_link_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.l;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/inbox/InboxAnalytics.Inbox.Action.CLEAR_ALL_CONFIRMATION_DIALOG_IMPRESSION", "Lau/com/woolworths/analytics/supers/inbox/InboxAnalytics$Inbox$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class CLEAR_ALL_CONFIRMATION_DIALOG_IMPRESSION extends Action {
                public final Object l;

                public CLEAR_ALL_CONFIRMATION_DIALOG_IMPRESSION() {
                    super("CLEAR_ALL_CONFIRMATION_DIALOG_IMPRESSION", 2);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(Inbox.f);
                    spreadBuilder.a(new Pair("event.Category", "message centre"));
                    spreadBuilder.a(new Pair("event.Action", "dialog_impression"));
                    a.y("event.Label", "Clear all notifications", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.l = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "message_centre_dialog_impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.l;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/inbox/InboxAnalytics.Inbox.Action.CONFIRMATION_DIALOG_CANCEL_CLICK", "Lau/com/woolworths/analytics/supers/inbox/InboxAnalytics$Inbox$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class CONFIRMATION_DIALOG_CANCEL_CLICK extends Action {
                public final Object l;

                public CONFIRMATION_DIALOG_CANCEL_CLICK() {
                    super("CONFIRMATION_DIALOG_CANCEL_CLICK", 4);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(Inbox.f);
                    spreadBuilder.a(new Pair("event.Category", "message centre"));
                    spreadBuilder.a(new Pair("event.Action", "button_click"));
                    a.z("event.Label", "Cancel", spreadBuilder, "event.Description", "Clear all notifications");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.l = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "message_centre_button_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.l;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/inbox/InboxAnalytics.Inbox.Action.CONFIRMATION_DIALOG_CLEAR_CLICK", "Lau/com/woolworths/analytics/supers/inbox/InboxAnalytics$Inbox$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class CONFIRMATION_DIALOG_CLEAR_CLICK extends Action {
                public final Object l;

                public CONFIRMATION_DIALOG_CLEAR_CLICK() {
                    super("CONFIRMATION_DIALOG_CLEAR_CLICK", 3);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(Inbox.f);
                    spreadBuilder.a(new Pair("event.Category", "message centre"));
                    spreadBuilder.a(new Pair("event.Action", "button_click"));
                    a.z("event.Label", "Clear", spreadBuilder, "event.Description", "Clear all notifications");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.l = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "message_centre_button_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.l;
                }
            }

            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/analytics/supers/inbox/InboxAnalytics$Inbox$Action$Companion;", "", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/inbox/InboxAnalytics.Inbox.Action.EMPTY_INBOX_IMPRESSION", "Lau/com/woolworths/analytics/supers/inbox/InboxAnalytics$Inbox$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class EMPTY_INBOX_IMPRESSION extends Action {
                public final Object l;

                public EMPTY_INBOX_IMPRESSION() {
                    super("EMPTY_INBOX_IMPRESSION", 0);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(Inbox.f);
                    spreadBuilder.a(new Pair("event.Category", "message centre"));
                    spreadBuilder.a(new Pair("event.Action", "impression"));
                    a.y("event.Label", "No new notifications", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.l = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "info_impression_empty_state";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.l;
                }
            }

            static {
                EMPTY_INBOX_IMPRESSION empty_inbox_impression = new EMPTY_INBOX_IMPRESSION();
                e = empty_inbox_impression;
                CLEAR_ALL_CLICK clear_all_click = new CLEAR_ALL_CLICK();
                f = clear_all_click;
                CLEAR_ALL_CONFIRMATION_DIALOG_IMPRESSION clear_all_confirmation_dialog_impression = new CLEAR_ALL_CONFIRMATION_DIALOG_IMPRESSION();
                g = clear_all_confirmation_dialog_impression;
                CONFIRMATION_DIALOG_CLEAR_CLICK confirmation_dialog_clear_click = new CONFIRMATION_DIALOG_CLEAR_CLICK();
                h = confirmation_dialog_clear_click;
                CONFIRMATION_DIALOG_CANCEL_CLICK confirmation_dialog_cancel_click = new CONFIRMATION_DIALOG_CANCEL_CLICK();
                i = confirmation_dialog_cancel_click;
                Action[] actionArr = {empty_inbox_impression, clear_all_click, clear_all_confirmation_dialog_impression, confirmation_dialog_clear_click, confirmation_dialog_cancel_click};
                j = actionArr;
                k = EnumEntriesKt.a(actionArr);
                d = new Companion();
            }

            public static Action valueOf(String str) {
                return (Action) Enum.valueOf(Action.class, str);
            }

            public static Action[] values() {
                return (Action[]) j.clone();
            }
        }

        static {
            Map mapJ = MapsKt.j(new Pair("screen.Name", "Messages"), new Pair("app.Section", "Homepage"));
            e = mapJ;
            f = (Pair[]) MapsKt.o(mapJ).toArray(new Pair[0]);
        }

        @Override // au.com.woolworths.analytics.Event
        /* renamed from: d */
        public final String getE() {
            return "messages_screen";
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Screen)) {
                return false;
            }
            Screen screen = (Screen) obj;
            return "Messages".equals(screen.getD()) && "messages_screen".equals(screen.getE()) && Intrinsics.c(e, screen.getData());
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
        @Override // au.com.woolworths.analytics.Event
        public final Map getData() {
            return e;
        }

        @Override // au.com.woolworths.analytics.Screen
        /* renamed from: getName */
        public final String getD() {
            return "Messages";
        }

        public final int hashCode() {
            return e.hashCode() - 106781811;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/analytics/supers/inbox/InboxAnalytics$Tncs;", "Lau/com/woolworths/analytics/Screen;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Tncs implements Screen {
        public static final Tncs d = new Tncs();
        public static final Object e = MapsKt.j(new Pair("screen.Name", "Terms & conditions messages"), new Pair("app.Section", "Homepage"));

        @Override // au.com.woolworths.analytics.Event
        /* renamed from: d */
        public final String getE() {
            return "terms&conditionsmessagecentre_screen";
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Screen)) {
                return false;
            }
            Screen screen = (Screen) obj;
            return "Terms & conditions messages".equals(screen.getD()) && "terms&conditionsmessagecentre_screen".equals(screen.getE()) && Intrinsics.c(e, screen.getData());
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
        @Override // au.com.woolworths.analytics.Event
        public final Map getData() {
            return e;
        }

        @Override // au.com.woolworths.analytics.Screen
        /* renamed from: getName */
        public final String getD() {
            return "Terms & conditions messages";
        }

        public final int hashCode() {
            return e.hashCode() - 1335389215;
        }
    }
}
