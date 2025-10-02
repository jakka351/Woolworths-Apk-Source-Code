package au.com.woolworths.analytics.supers.healthylife.foodtracker;

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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/analytics/supers/healthylife/foodtracker/HealthyLifeFoodTrackerAnalytics;", "", "FullPageErrorState", "LandingPage", "ConsentModal", "WebviewPage", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HealthyLifeFoodTrackerAnalytics {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/healthylife/foodtracker/HealthyLifeFoodTrackerAnalytics$ConsentModal;", "Lau/com/woolworths/analytics/Screen;", "Action", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class ConsentModal implements Screen {
        public static final Object d;
        public static final Pair[] e;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/healthylife/foodtracker/HealthyLifeFoodTrackerAnalytics$ConsentModal$Action;", "Lau/com/woolworths/analytics/Event;", "", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Action implements Event {
            public static final Action d;
            public static final Action e;
            public static final Action f;
            public static final Action g;
            public static final Action h;
            public static final /* synthetic */ Action[] i;
            public static final /* synthetic */ EnumEntries j;

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/healthylife/foodtracker/HealthyLifeFoodTrackerAnalytics.ConsentModal.Action.I_AGREE_CLICK", "Lau/com/woolworths/analytics/supers/healthylife/foodtracker/HealthyLifeFoodTrackerAnalytics$ConsentModal$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class I_AGREE_CLICK extends Action {
                public final Object k;

                public I_AGREE_CLICK() {
                    super("I_AGREE_CLICK", 1);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(ConsentModal.e);
                    spreadBuilder.a(new Pair("event.Category", "button"));
                    spreadBuilder.a(new Pair("event.Action", "click"));
                    a.y("event.Label", "I agree", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.k = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "button_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.k;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/healthylife/foodtracker/HealthyLifeFoodTrackerAnalytics.ConsentModal.Action.MODAL_IMPRESSION", "Lau/com/woolworths/analytics/supers/healthylife/foodtracker/HealthyLifeFoodTrackerAnalytics$ConsentModal$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class MODAL_IMPRESSION extends Action {
                public final Object k;

                public MODAL_IMPRESSION() {
                    super("MODAL_IMPRESSION", 0);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(ConsentModal.e);
                    spreadBuilder.a(new Pair("event.Category", "bottomsheet"));
                    spreadBuilder.a(new Pair("event.Action", "impression"));
                    a.y("event.Label", "consent to share everyday rewards data with healthylife", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.k = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "bottomsheet_impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.k;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/healthylife/foodtracker/HealthyLifeFoodTrackerAnalytics.ConsentModal.Action.NOT_RIGHT_NOW_CLICK", "Lau/com/woolworths/analytics/supers/healthylife/foodtracker/HealthyLifeFoodTrackerAnalytics$ConsentModal$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class NOT_RIGHT_NOW_CLICK extends Action {
                public final Object k;

                public NOT_RIGHT_NOW_CLICK() {
                    super("NOT_RIGHT_NOW_CLICK", 2);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(ConsentModal.e);
                    spreadBuilder.a(new Pair("event.Category", "button"));
                    spreadBuilder.a(new Pair("event.Action", "click"));
                    a.y("event.Label", "Maybe later", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.k = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "button_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.k;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/healthylife/foodtracker/HealthyLifeFoodTrackerAnalytics.ConsentModal.Action.SNACKBAR_NETWORK_ERROR_IMPRESSSION", "Lau/com/woolworths/analytics/supers/healthylife/foodtracker/HealthyLifeFoodTrackerAnalytics$ConsentModal$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class SNACKBAR_NETWORK_ERROR_IMPRESSSION extends Action {
                public final Object k;

                public SNACKBAR_NETWORK_ERROR_IMPRESSSION() {
                    super("SNACKBAR_NETWORK_ERROR_IMPRESSSION", 4);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(ConsentModal.e);
                    spreadBuilder.a(new Pair("event.Category", "snackbar"));
                    spreadBuilder.a(new Pair("event.Action", "impression"));
                    a.y("event.Label", "Network Error", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.k = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "snackbar_impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.k;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/healthylife/foodtracker/HealthyLifeFoodTrackerAnalytics.ConsentModal.Action.SNACKBAR_SERVER_ERROR_IMPRESSSION", "Lau/com/woolworths/analytics/supers/healthylife/foodtracker/HealthyLifeFoodTrackerAnalytics$ConsentModal$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class SNACKBAR_SERVER_ERROR_IMPRESSSION extends Action {
                public final Object k;

                public SNACKBAR_SERVER_ERROR_IMPRESSSION() {
                    super("SNACKBAR_SERVER_ERROR_IMPRESSSION", 3);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(ConsentModal.e);
                    spreadBuilder.a(new Pair("event.Category", "snackbar"));
                    spreadBuilder.a(new Pair("event.Action", "impression"));
                    a.y("event.Label", "Trouble sharing your data. Try again later", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.k = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "snackbar_impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.k;
                }
            }

            static {
                MODAL_IMPRESSION modal_impression = new MODAL_IMPRESSION();
                d = modal_impression;
                I_AGREE_CLICK i_agree_click = new I_AGREE_CLICK();
                e = i_agree_click;
                NOT_RIGHT_NOW_CLICK not_right_now_click = new NOT_RIGHT_NOW_CLICK();
                f = not_right_now_click;
                SNACKBAR_SERVER_ERROR_IMPRESSSION snackbar_server_error_impresssion = new SNACKBAR_SERVER_ERROR_IMPRESSSION();
                g = snackbar_server_error_impresssion;
                SNACKBAR_NETWORK_ERROR_IMPRESSSION snackbar_network_error_impresssion = new SNACKBAR_NETWORK_ERROR_IMPRESSSION();
                h = snackbar_network_error_impresssion;
                Action[] actionArr = {modal_impression, i_agree_click, not_right_now_click, snackbar_server_error_impresssion, snackbar_network_error_impresssion};
                i = actionArr;
                j = EnumEntriesKt.a(actionArr);
            }

            public static Action valueOf(String str) {
                return (Action) Enum.valueOf(Action.class, str);
            }

            public static Action[] values() {
                return (Action[]) i.clone();
            }
        }

        static {
            Map mapJ = MapsKt.j(new Pair("screen.Name", "Healthy Life Food Tracker screen"), new Pair("app.Section", "Homepage"));
            d = mapJ;
            e = (Pair[]) MapsKt.o(mapJ).toArray(new Pair[0]);
        }

        @Override // au.com.woolworths.analytics.Event
        /* renamed from: d */
        public final String getE() {
            return "healthylifefoodtracker_screen";
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Screen)) {
                return false;
            }
            Screen screen = (Screen) obj;
            return "Healthy Life Food Tracker screen".equals(screen.getD()) && "healthylifefoodtracker_screen".equals(screen.getE()) && Intrinsics.c(d, screen.getData());
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
        @Override // au.com.woolworths.analytics.Event
        public final Map getData() {
            return d;
        }

        @Override // au.com.woolworths.analytics.Screen
        /* renamed from: getName */
        public final String getD() {
            return "Healthy Life Food Tracker screen";
        }

        public final int hashCode() {
            return d.hashCode() - 1574190197;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/healthylife/foodtracker/HealthyLifeFoodTrackerAnalytics$FullPageErrorState;", "Lau/com/woolworths/analytics/Screen;", "Action", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class FullPageErrorState implements Screen {
        public static final Object d;
        public static final Pair[] e;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/healthylife/foodtracker/HealthyLifeFoodTrackerAnalytics$FullPageErrorState$Action;", "Lau/com/woolworths/analytics/Event;", "", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Action implements Event {
            public static final Action d;
            public static final Action e;
            public static final /* synthetic */ Action[] f;
            public static final /* synthetic */ EnumEntries g;

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/healthylife/foodtracker/HealthyLifeFoodTrackerAnalytics.FullPageErrorState.Action.NETWORK_ERROR_IMPRESSION", "Lau/com/woolworths/analytics/supers/healthylife/foodtracker/HealthyLifeFoodTrackerAnalytics$FullPageErrorState$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class NETWORK_ERROR_IMPRESSION extends Action {
                public final Object h;

                public NETWORK_ERROR_IMPRESSION() {
                    super("NETWORK_ERROR_IMPRESSION", 0);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(FullPageErrorState.e);
                    spreadBuilder.a(new Pair("event.Category", "error"));
                    spreadBuilder.a(new Pair("event.Action", "impression"));
                    a.y("event.Label", "Network Error", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.h = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "error_impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.h;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/healthylife/foodtracker/HealthyLifeFoodTrackerAnalytics.FullPageErrorState.Action.SERVER_ERROR_IMPRESSION", "Lau/com/woolworths/analytics/supers/healthylife/foodtracker/HealthyLifeFoodTrackerAnalytics$FullPageErrorState$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class SERVER_ERROR_IMPRESSION extends Action {
                public final Object h;

                public SERVER_ERROR_IMPRESSION() {
                    super("SERVER_ERROR_IMPRESSION", 1);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(FullPageErrorState.e);
                    spreadBuilder.a(new Pair("event.Category", "error"));
                    spreadBuilder.a(new Pair("event.Action", "impression"));
                    a.y("event.Label", "Server Error", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.h = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "error_impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.h;
                }
            }

            static {
                NETWORK_ERROR_IMPRESSION network_error_impression = new NETWORK_ERROR_IMPRESSION();
                d = network_error_impression;
                SERVER_ERROR_IMPRESSION server_error_impression = new SERVER_ERROR_IMPRESSION();
                e = server_error_impression;
                Action[] actionArr = {network_error_impression, server_error_impression};
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
            Map mapJ = MapsKt.j(new Pair("screen.Name", "Healthy Life Food Tracker screen"), new Pair("app.Section", "Homepage"));
            d = mapJ;
            e = (Pair[]) MapsKt.o(mapJ).toArray(new Pair[0]);
        }

        @Override // au.com.woolworths.analytics.Event
        /* renamed from: d */
        public final String getE() {
            return "healthylifefoodtracker_screen";
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Screen)) {
                return false;
            }
            Screen screen = (Screen) obj;
            return "Healthy Life Food Tracker screen".equals(screen.getD()) && "healthylifefoodtracker_screen".equals(screen.getE()) && Intrinsics.c(d, screen.getData());
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
        @Override // au.com.woolworths.analytics.Event
        public final Map getData() {
            return d;
        }

        @Override // au.com.woolworths.analytics.Screen
        /* renamed from: getName */
        public final String getD() {
            return "Healthy Life Food Tracker screen";
        }

        public final int hashCode() {
            return d.hashCode() - 1574190197;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/healthylife/foodtracker/HealthyLifeFoodTrackerAnalytics$LandingPage;", "Lau/com/woolworths/analytics/Screen;", "Action", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class LandingPage implements Screen {
        public static final Object d;
        public static final Pair[] e;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/analytics/supers/healthylife/foodtracker/HealthyLifeFoodTrackerAnalytics$LandingPage$Action;", "Lau/com/woolworths/analytics/Event;", "", "Companion", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Action implements Event {
            public static final Companion d;
            public static final Action e;
            public static final /* synthetic */ Action[] f;
            public static final /* synthetic */ EnumEntries g;

            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/analytics/supers/healthylife/foodtracker/HealthyLifeFoodTrackerAnalytics$LandingPage$Action$Companion;", "", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/healthylife/foodtracker/HealthyLifeFoodTrackerAnalytics.LandingPage.Action.PAGE_IMPRESSION", "Lau/com/woolworths/analytics/supers/healthylife/foodtracker/HealthyLifeFoodTrackerAnalytics$LandingPage$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class PAGE_IMPRESSION extends Action {
                public final Object h;

                public PAGE_IMPRESSION() {
                    super("PAGE_IMPRESSION", 0);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(LandingPage.e);
                    spreadBuilder.a(new Pair("event.Category", "info"));
                    spreadBuilder.a(new Pair("event.Action", "impression"));
                    a.y("event.Label", "Food Tracker Landing Screen", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.h = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "info_impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.h;
                }
            }

            static {
                PAGE_IMPRESSION page_impression = new PAGE_IMPRESSION();
                e = page_impression;
                Action[] actionArr = {page_impression};
                f = actionArr;
                g = EnumEntriesKt.a(actionArr);
                d = new Companion();
            }

            public static Action valueOf(String str) {
                return (Action) Enum.valueOf(Action.class, str);
            }

            public static Action[] values() {
                return (Action[]) f.clone();
            }
        }

        static {
            Map mapJ = MapsKt.j(new Pair("screen.Name", "Healthy Life Food Tracker screen"), new Pair("app.Section", "Homepage"));
            d = mapJ;
            e = (Pair[]) MapsKt.o(mapJ).toArray(new Pair[0]);
        }

        @Override // au.com.woolworths.analytics.Event
        /* renamed from: d */
        public final String getE() {
            return "healthylifefoodtracker_screen";
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Screen)) {
                return false;
            }
            Screen screen = (Screen) obj;
            return "Healthy Life Food Tracker screen".equals(screen.getD()) && "healthylifefoodtracker_screen".equals(screen.getE()) && Intrinsics.c(d, screen.getData());
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
        @Override // au.com.woolworths.analytics.Event
        public final Map getData() {
            return d;
        }

        @Override // au.com.woolworths.analytics.Screen
        /* renamed from: getName */
        public final String getD() {
            return "Healthy Life Food Tracker screen";
        }

        public final int hashCode() {
            return d.hashCode() - 1574190197;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/healthylife/foodtracker/HealthyLifeFoodTrackerAnalytics$WebviewPage;", "Lau/com/woolworths/analytics/Screen;", "Action", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class WebviewPage implements Screen {
        public static final Object d;
        public static final Pair[] e;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/healthylife/foodtracker/HealthyLifeFoodTrackerAnalytics$WebviewPage$Action;", "Lau/com/woolworths/analytics/Event;", "", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Action implements Event {
            public static final Action d;
            public static final /* synthetic */ Action[] e;
            public static final /* synthetic */ EnumEntries f;

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/healthylife/foodtracker/HealthyLifeFoodTrackerAnalytics.WebviewPage.Action.PAGE_IMPRESSION", "Lau/com/woolworths/analytics/supers/healthylife/foodtracker/HealthyLifeFoodTrackerAnalytics$WebviewPage$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class PAGE_IMPRESSION extends Action {
                public final Object g;

                public PAGE_IMPRESSION() {
                    super("PAGE_IMPRESSION", 0);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(WebviewPage.e);
                    spreadBuilder.a(new Pair("event.Category", "info"));
                    spreadBuilder.a(new Pair("event.Action", "impression"));
                    a.y("event.Label", "Overall healthy life food tracker", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.g = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "info_impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.g;
                }
            }

            static {
                PAGE_IMPRESSION page_impression = new PAGE_IMPRESSION();
                d = page_impression;
                Action[] actionArr = {page_impression};
                e = actionArr;
                f = EnumEntriesKt.a(actionArr);
            }

            public static Action valueOf(String str) {
                return (Action) Enum.valueOf(Action.class, str);
            }

            public static Action[] values() {
                return (Action[]) e.clone();
            }
        }

        static {
            Map mapJ = MapsKt.j(new Pair("screen.Name", "Healthy Life Food Tracker screen"), new Pair("app.Section", "Homepage"));
            d = mapJ;
            e = (Pair[]) MapsKt.o(mapJ).toArray(new Pair[0]);
        }

        @Override // au.com.woolworths.analytics.Event
        /* renamed from: d */
        public final String getE() {
            return "healthylifefoodtracker_screen";
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Screen)) {
                return false;
            }
            Screen screen = (Screen) obj;
            return "Healthy Life Food Tracker screen".equals(screen.getD()) && "healthylifefoodtracker_screen".equals(screen.getE()) && Intrinsics.c(d, screen.getData());
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
        @Override // au.com.woolworths.analytics.Event
        public final Map getData() {
            return d;
        }

        @Override // au.com.woolworths.analytics.Screen
        /* renamed from: getName */
        public final String getD() {
            return "Healthy Life Food Tracker screen";
        }

        public final int hashCode() {
            return d.hashCode() - 1574190197;
        }
    }
}
