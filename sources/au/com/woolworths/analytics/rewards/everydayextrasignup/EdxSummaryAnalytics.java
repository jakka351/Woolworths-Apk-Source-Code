package au.com.woolworths.analytics.rewards.everydayextrasignup;

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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/rewards/everydayextrasignup/EdxSummaryAnalytics;", "", "Summary", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EdxSummaryAnalytics {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/rewards/everydayextrasignup/EdxSummaryAnalytics$Summary;", "Lau/com/woolworths/analytics/Screen;", "Action", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Summary implements Screen {
        public static final Summary d = new Summary();
        public static final Object e;
        public static final Pair[] f;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/analytics/rewards/everydayextrasignup/EdxSummaryAnalytics$Summary$Action;", "Lau/com/woolworths/analytics/Event;", "", "Companion", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Action implements Event {
            public static final Companion d;
            public static final Action e;
            public static final Action f;
            public static final Action g;
            public static final Action h;
            public static final Action i;
            public static final Action j;
            public static final Action k;
            public static final Action l;
            public static final Action m;
            public static final Action n;
            public static final /* synthetic */ Action[] o;
            public static final /* synthetic */ EnumEntries p;

            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/analytics/rewards/everydayextrasignup/EdxSummaryAnalytics$Summary$Action$Companion;", "", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/rewards/everydayextrasignup/EdxSummaryAnalytics.Summary.Action.RESPONSE_ERROR", "Lau/com/woolworths/analytics/rewards/everydayextrasignup/EdxSummaryAnalytics$Summary$Action;", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class RESPONSE_ERROR extends Action {
                public final Object q;

                public RESPONSE_ERROR() {
                    super("RESPONSE_ERROR", 1);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(Summary.f);
                    spreadBuilder.a(new Pair("event.Action", "error"));
                    spreadBuilder.a(new Pair("event.Category", "response"));
                    a.z("event.Label", "EDX Subscribe Error", spreadBuilder, "event.Description", "EDX Subscribe Error");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.q = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "response_error";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.q;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/rewards/everydayextrasignup/EdxSummaryAnalytics.Summary.Action.RESPONSE_SUCCESS", "Lau/com/woolworths/analytics/rewards/everydayextrasignup/EdxSummaryAnalytics$Summary$Action;", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class RESPONSE_SUCCESS extends Action {
                public final Object q;

                public RESPONSE_SUCCESS() {
                    super("RESPONSE_SUCCESS", 0);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(Summary.f);
                    spreadBuilder.a(new Pair("event.Action", "success"));
                    spreadBuilder.a(new Pair("event.Category", "response"));
                    a.z("event.Label", "EDX Subscribe Success", spreadBuilder, "event.Description", "EDX Subscribe Success");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.q = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "response_success";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.q;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/rewards/everydayextrasignup/EdxSummaryAnalytics.Summary.Action.SCAN_CARD_ADD_MANUALLY_CLICK", "Lau/com/woolworths/analytics/rewards/everydayextrasignup/EdxSummaryAnalytics$Summary$Action;", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class SCAN_CARD_ADD_MANUALLY_CLICK extends Action {
                public final Object q;

                public SCAN_CARD_ADD_MANUALLY_CLICK() {
                    super("SCAN_CARD_ADD_MANUALLY_CLICK", 9);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(Summary.f);
                    spreadBuilder.a(new Pair("event.Category", "Everyday Extra"));
                    spreadBuilder.a(new Pair("event.Action", "button_click"));
                    a.y("event.Label", "add details manually", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.q = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "scan_card_add_manually_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.q;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/rewards/everydayextrasignup/EdxSummaryAnalytics.Summary.Action.SCAN_CARD_AUTHORIZE_ALLOW_CLICK", "Lau/com/woolworths/analytics/rewards/everydayextrasignup/EdxSummaryAnalytics$Summary$Action;", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class SCAN_CARD_AUTHORIZE_ALLOW_CLICK extends Action {
                public final Object q;

                public SCAN_CARD_AUTHORIZE_ALLOW_CLICK() {
                    super("SCAN_CARD_AUTHORIZE_ALLOW_CLICK", 2);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(Summary.f);
                    spreadBuilder.a(new Pair("event.Category", "Everyday Extra"));
                    spreadBuilder.a(new Pair("event.Action", "button_click"));
                    a.z("event.Label", "authorize allow", spreadBuilder, "event.Description", "rewards would like to access the camera");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.q = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "scan_card_authorize_allow_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.q;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/rewards/everydayextrasignup/EdxSummaryAnalytics.Summary.Action.SCAN_CARD_AUTHORIZE_DENY_CLICK", "Lau/com/woolworths/analytics/rewards/everydayextrasignup/EdxSummaryAnalytics$Summary$Action;", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class SCAN_CARD_AUTHORIZE_DENY_CLICK extends Action {
                public final Object q;

                public SCAN_CARD_AUTHORIZE_DENY_CLICK() {
                    super("SCAN_CARD_AUTHORIZE_DENY_CLICK", 3);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(Summary.f);
                    spreadBuilder.a(new Pair("event.Category", "Everyday Extra"));
                    spreadBuilder.a(new Pair("event.Action", "button_click"));
                    a.z("event.Label", "authorize deny", spreadBuilder, "event.Description", "rewards would like to access the camera");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.q = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "scan_card_authorize_deny_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.q;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/rewards/everydayextrasignup/EdxSummaryAnalytics.Summary.Action.SCAN_CARD_DISMISSED", "Lau/com/woolworths/analytics/rewards/everydayextrasignup/EdxSummaryAnalytics$Summary$Action;", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class SCAN_CARD_DISMISSED extends Action {
                public final Object q;

                public SCAN_CARD_DISMISSED() {
                    super("SCAN_CARD_DISMISSED", 10);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(Summary.f);
                    spreadBuilder.a(new Pair("event.Category", "Everyday Extra"));
                    spreadBuilder.a(new Pair("event.Action", "response"));
                    a.y("event.Label", "card not scanned", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.q = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "scan_card_dismissed";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.q;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/rewards/everydayextrasignup/EdxSummaryAnalytics.Summary.Action.SCAN_CARD_IMPRESSION", "Lau/com/woolworths/analytics/rewards/everydayextrasignup/EdxSummaryAnalytics$Summary$Action;", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class SCAN_CARD_IMPRESSION extends Action {
                public final Object q;

                public SCAN_CARD_IMPRESSION() {
                    super("SCAN_CARD_IMPRESSION", 7);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(Summary.f);
                    spreadBuilder.a(new Pair("event.Category", "Everyday Extra"));
                    spreadBuilder.a(new Pair("event.Action", "impression"));
                    a.y("event.Label", "scan your card", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.q = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "scan_card_impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.q;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/rewards/everydayextrasignup/EdxSummaryAnalytics.Summary.Action.SCAN_CARD_SUCCESS", "Lau/com/woolworths/analytics/rewards/everydayextrasignup/EdxSummaryAnalytics$Summary$Action;", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class SCAN_CARD_SUCCESS extends Action {
                public final Object q;

                public SCAN_CARD_SUCCESS() {
                    super("SCAN_CARD_SUCCESS", 8);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(Summary.f);
                    spreadBuilder.a(new Pair("event.Category", "Everyday Extra"));
                    spreadBuilder.a(new Pair("event.Action", "response"));
                    a.y("event.Label", "card scanned", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.q = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "scan_card_success";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.q;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/rewards/everydayextrasignup/EdxSummaryAnalytics.Summary.Action.SCAN_CARD_UNAUTHORIZED_ALLOW_CLICK", "Lau/com/woolworths/analytics/rewards/everydayextrasignup/EdxSummaryAnalytics$Summary$Action;", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class SCAN_CARD_UNAUTHORIZED_ALLOW_CLICK extends Action {
                public final Object q;

                public SCAN_CARD_UNAUTHORIZED_ALLOW_CLICK() {
                    super("SCAN_CARD_UNAUTHORIZED_ALLOW_CLICK", 5);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(Summary.f);
                    spreadBuilder.a(new Pair("event.Category", "Everyday Extra"));
                    spreadBuilder.a(new Pair("event.Action", "button_click"));
                    a.z("event.Label", "unauthorized allow", spreadBuilder, "event.Description", "allow access to your camera");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.q = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "scan_card_unauthorized_allow_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.q;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/rewards/everydayextrasignup/EdxSummaryAnalytics.Summary.Action.SCAN_CARD_UNAUTHORIZED_DISMISS_CLICK", "Lau/com/woolworths/analytics/rewards/everydayextrasignup/EdxSummaryAnalytics$Summary$Action;", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class SCAN_CARD_UNAUTHORIZED_DISMISS_CLICK extends Action {
                public final Object q;

                public SCAN_CARD_UNAUTHORIZED_DISMISS_CLICK() {
                    super("SCAN_CARD_UNAUTHORIZED_DISMISS_CLICK", 4);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(Summary.f);
                    spreadBuilder.a(new Pair("event.Category", "Everyday Extra"));
                    spreadBuilder.a(new Pair("event.Action", "button_click"));
                    a.z("event.Label", "unauthorized dismiss", spreadBuilder, "event.Description", "allow access to your camera");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.q = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "scan_card_unauthorized_dismiss_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.q;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/rewards/everydayextrasignup/EdxSummaryAnalytics.Summary.Action.SCAN_CARD_UNAUTHORIZED_SETTINGS_CLICK", "Lau/com/woolworths/analytics/rewards/everydayextrasignup/EdxSummaryAnalytics$Summary$Action;", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class SCAN_CARD_UNAUTHORIZED_SETTINGS_CLICK extends Action {
                public final Object q;

                public SCAN_CARD_UNAUTHORIZED_SETTINGS_CLICK() {
                    super("SCAN_CARD_UNAUTHORIZED_SETTINGS_CLICK", 6);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(Summary.f);
                    spreadBuilder.a(new Pair("event.Category", "Everyday Extra"));
                    spreadBuilder.a(new Pair("event.Action", "button_click"));
                    a.z("event.Label", "unauthorized settings", spreadBuilder, "event.Description", "allow access to your camera");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.q = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "scan_card_unauthorized_settings_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.q;
                }
            }

            static {
                RESPONSE_SUCCESS response_success = new RESPONSE_SUCCESS();
                e = response_success;
                RESPONSE_ERROR response_error = new RESPONSE_ERROR();
                f = response_error;
                SCAN_CARD_AUTHORIZE_ALLOW_CLICK scan_card_authorize_allow_click = new SCAN_CARD_AUTHORIZE_ALLOW_CLICK();
                g = scan_card_authorize_allow_click;
                SCAN_CARD_AUTHORIZE_DENY_CLICK scan_card_authorize_deny_click = new SCAN_CARD_AUTHORIZE_DENY_CLICK();
                h = scan_card_authorize_deny_click;
                SCAN_CARD_UNAUTHORIZED_DISMISS_CLICK scan_card_unauthorized_dismiss_click = new SCAN_CARD_UNAUTHORIZED_DISMISS_CLICK();
                i = scan_card_unauthorized_dismiss_click;
                SCAN_CARD_UNAUTHORIZED_ALLOW_CLICK scan_card_unauthorized_allow_click = new SCAN_CARD_UNAUTHORIZED_ALLOW_CLICK();
                j = scan_card_unauthorized_allow_click;
                SCAN_CARD_UNAUTHORIZED_SETTINGS_CLICK scan_card_unauthorized_settings_click = new SCAN_CARD_UNAUTHORIZED_SETTINGS_CLICK();
                k = scan_card_unauthorized_settings_click;
                SCAN_CARD_IMPRESSION scan_card_impression = new SCAN_CARD_IMPRESSION();
                l = scan_card_impression;
                SCAN_CARD_SUCCESS scan_card_success = new SCAN_CARD_SUCCESS();
                m = scan_card_success;
                SCAN_CARD_ADD_MANUALLY_CLICK scan_card_add_manually_click = new SCAN_CARD_ADD_MANUALLY_CLICK();
                n = scan_card_add_manually_click;
                Action[] actionArr = {response_success, response_error, scan_card_authorize_allow_click, scan_card_authorize_deny_click, scan_card_unauthorized_dismiss_click, scan_card_unauthorized_allow_click, scan_card_unauthorized_settings_click, scan_card_impression, scan_card_success, scan_card_add_manually_click, new SCAN_CARD_DISMISSED()};
                o = actionArr;
                p = EnumEntriesKt.a(actionArr);
                d = new Companion();
            }

            public static Action valueOf(String str) {
                return (Action) Enum.valueOf(Action.class, str);
            }

            public static Action[] values() {
                return (Action[]) o.clone();
            }
        }

        static {
            Map mapJ = MapsKt.j(new Pair("screen.Name", "Everyday Extra Summary"), new Pair("app.Section", "Everyday Extra"));
            e = mapJ;
            f = (Pair[]) MapsKt.o(mapJ).toArray(new Pair[0]);
        }

        @Override // au.com.woolworths.analytics.Event
        /* renamed from: d */
        public final String getE() {
            return "everydayextrasummary_screen";
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Screen)) {
                return false;
            }
            Screen screen = (Screen) obj;
            return "Everyday Extra Summary".equals(screen.getD()) && "everydayextrasummary_screen".equals(screen.getE()) && Intrinsics.c(e, screen.getData());
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
        @Override // au.com.woolworths.analytics.Event
        public final Map getData() {
            return e;
        }

        @Override // au.com.woolworths.analytics.Screen
        /* renamed from: getName */
        public final String getD() {
            return "Everyday Extra Summary";
        }

        public final int hashCode() {
            return e.hashCode() - 881835517;
        }
    }
}
