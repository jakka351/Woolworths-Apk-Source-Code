package au.com.woolworths.analytics.supers.products;

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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/analytics/supers/products/MapsAnalytics;", "", "ProductFinderMap", "Calibration", "Onboarding", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MapsAnalytics {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/products/MapsAnalytics$Calibration;", "Lau/com/woolworths/analytics/Screen;", "Action", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Calibration implements Screen {
        public static final Object d;
        public static final Pair[] e;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/products/MapsAnalytics$Calibration$Action;", "Lau/com/woolworths/analytics/Event;", "", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Action implements Event {
            public static final Action d;
            public static final Action e;
            public static final Action f;
            public static final /* synthetic */ Action[] g;
            public static final /* synthetic */ EnumEntries h;

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/products/MapsAnalytics.Calibration.Action.CALIBRATION_COMPLETE", "Lau/com/woolworths/analytics/supers/products/MapsAnalytics$Calibration$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class CALIBRATION_COMPLETE extends Action {
                public final Object i;

                public CALIBRATION_COMPLETE() {
                    super("CALIBRATION_COMPLETE", 1);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(Calibration.e);
                    spreadBuilder.a(new Pair("event.Action", "calibration_impression"));
                    spreadBuilder.a(new Pair("event.Category", "product finder"));
                    androidx.constraintlayout.core.state.a.y("event.Label", "calibration complete", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.i = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "productfinder_calibration_impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.i;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/products/MapsAnalytics.Calibration.Action.CALIBRATION_DISMISS_BUTTON_CLICK", "Lau/com/woolworths/analytics/supers/products/MapsAnalytics$Calibration$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class CALIBRATION_DISMISS_BUTTON_CLICK extends Action {
                public final Object i;

                public CALIBRATION_DISMISS_BUTTON_CLICK() {
                    super("CALIBRATION_DISMISS_BUTTON_CLICK", 2);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(Calibration.e);
                    spreadBuilder.a(new Pair("event.Action", "button_click"));
                    spreadBuilder.a(new Pair("event.Category", "product finder"));
                    androidx.constraintlayout.core.state.a.y("event.Label", "dismiss", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.i = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "productfinder_button_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.i;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/products/MapsAnalytics.Calibration.Action.CALIBRATION_START", "Lau/com/woolworths/analytics/supers/products/MapsAnalytics$Calibration$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class CALIBRATION_START extends Action {
                public final Object i;

                public CALIBRATION_START() {
                    super("CALIBRATION_START", 0);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(Calibration.e);
                    spreadBuilder.a(new Pair("event.Action", "calibration_impression"));
                    spreadBuilder.a(new Pair("event.Category", "product finder"));
                    androidx.constraintlayout.core.state.a.y("event.Label", "calibration start", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.i = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "productfinder_calibration_impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.i;
                }
            }

            static {
                CALIBRATION_START calibration_start = new CALIBRATION_START();
                d = calibration_start;
                CALIBRATION_COMPLETE calibration_complete = new CALIBRATION_COMPLETE();
                e = calibration_complete;
                CALIBRATION_DISMISS_BUTTON_CLICK calibration_dismiss_button_click = new CALIBRATION_DISMISS_BUTTON_CLICK();
                f = calibration_dismiss_button_click;
                Action[] actionArr = {calibration_start, calibration_complete, calibration_dismiss_button_click};
                g = actionArr;
                h = EnumEntriesKt.a(actionArr);
            }

            public static Action valueOf(String str) {
                return (Action) Enum.valueOf(Action.class, str);
            }

            public static Action[] values() {
                return (Action[]) g.clone();
            }
        }

        static {
            Map mapJ = MapsKt.j(new Pair("screen.Name", "calibration"), new Pair("screen.Type", "store map"), new Pair("app.Section", "Search"));
            d = mapJ;
            e = (Pair[]) MapsKt.o(mapJ).toArray(new Pair[0]);
        }

        @Override // au.com.woolworths.analytics.Event
        /* renamed from: d */
        public final String getE() {
            return "calibration_screen";
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Screen)) {
                return false;
            }
            Screen screen = (Screen) obj;
            return "calibration".equals(screen.getD()) && "calibration_screen".equals(screen.getE()) && Intrinsics.c(d, screen.getData());
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
        @Override // au.com.woolworths.analytics.Event
        public final Map getData() {
            return d;
        }

        @Override // au.com.woolworths.analytics.Screen
        /* renamed from: getName */
        public final String getD() {
            return "calibration";
        }

        public final int hashCode() {
            return d.hashCode() + 523684649;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/products/MapsAnalytics$Onboarding;", "Lau/com/woolworths/analytics/Screen;", "Action", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Onboarding implements Screen {
        public static final Object d;
        public static final Pair[] e;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/analytics/supers/products/MapsAnalytics$Onboarding$Action;", "Lau/com/woolworths/analytics/Event;", "", "Companion", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Action implements Event {
            public static final Companion d;
            public static final Action e;
            public static final /* synthetic */ Action[] f;
            public static final /* synthetic */ EnumEntries g;

            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/analytics/supers/products/MapsAnalytics$Onboarding$Action$Companion;", "", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/products/MapsAnalytics.Onboarding.Action.WELCOME_IMPRESSION", "Lau/com/woolworths/analytics/supers/products/MapsAnalytics$Onboarding$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class WELCOME_IMPRESSION extends Action {
                public final Object h;

                public WELCOME_IMPRESSION() {
                    super("WELCOME_IMPRESSION", 0);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(3);
                    spreadBuilder.b(Onboarding.e);
                    androidx.constraintlayout.core.state.a.z("event.Action", "impression", spreadBuilder, "app.Section", "Search");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.h = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "productfinder_onboarding_screen";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.h;
                }
            }

            static {
                WELCOME_IMPRESSION welcome_impression = new WELCOME_IMPRESSION();
                e = welcome_impression;
                Action[] actionArr = {welcome_impression};
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
            Map mapJ = MapsKt.j(new Pair("screen.Name", "product finder onboarding"), new Pair("screen.Type", "onboarding"), new Pair("app.Section", "Search"));
            d = mapJ;
            e = (Pair[]) MapsKt.o(mapJ).toArray(new Pair[0]);
        }

        @Override // au.com.woolworths.analytics.Event
        /* renamed from: d */
        public final String getE() {
            return "productfinderonboarding_screen";
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Screen)) {
                return false;
            }
            Screen screen = (Screen) obj;
            return "product finder onboarding".equals(screen.getD()) && "productfinderonboarding_screen".equals(screen.getE()) && Intrinsics.c(d, screen.getData());
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
        @Override // au.com.woolworths.analytics.Event
        public final Map getData() {
            return d;
        }

        @Override // au.com.woolworths.analytics.Screen
        /* renamed from: getName */
        public final String getD() {
            return "product finder onboarding";
        }

        public final int hashCode() {
            return d.hashCode() - 1596410391;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/products/MapsAnalytics$ProductFinderMap;", "Lau/com/woolworths/analytics/Screen;", "Action", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class ProductFinderMap implements Screen {
        public static final Object d;
        public static final Pair[] e;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/analytics/supers/products/MapsAnalytics$ProductFinderMap$Action;", "Lau/com/woolworths/analytics/Event;", "", "Companion", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
            public static final /* synthetic */ Action[] n;
            public static final /* synthetic */ EnumEntries o;

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/products/MapsAnalytics.ProductFinderMap.Action.CLOSE_BUTTON_CLICK", "Lau/com/woolworths/analytics/supers/products/MapsAnalytics$ProductFinderMap$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class CLOSE_BUTTON_CLICK extends Action {
                public final Object p;

                public CLOSE_BUTTON_CLICK() {
                    super("CLOSE_BUTTON_CLICK", 2);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(ProductFinderMap.e);
                    spreadBuilder.a(new Pair("event.Action", "button_click"));
                    spreadBuilder.a(new Pair("event.Category", "product finder"));
                    androidx.constraintlayout.core.state.a.y("event.Label", "close", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.p = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "productfinder_button_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.p;
                }
            }

            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/analytics/supers/products/MapsAnalytics$ProductFinderMap$Action$Companion;", "", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/products/MapsAnalytics.ProductFinderMap.Action.ESTABLISH_LOCATION_COMPLETE", "Lau/com/woolworths/analytics/supers/products/MapsAnalytics$ProductFinderMap$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class ESTABLISH_LOCATION_COMPLETE extends Action {
                public final Object p;

                public ESTABLISH_LOCATION_COMPLETE() {
                    super("ESTABLISH_LOCATION_COMPLETE", 4);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(ProductFinderMap.e);
                    spreadBuilder.a(new Pair("event.Action", "snackbar_impression"));
                    spreadBuilder.a(new Pair("event.Category", "product finder"));
                    androidx.constraintlayout.core.state.a.y("event.Label", "location established", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.p = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "productfinder_snackbar_impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.p;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/products/MapsAnalytics.ProductFinderMap.Action.ESTABLISH_LOCATION_FAILED", "Lau/com/woolworths/analytics/supers/products/MapsAnalytics$ProductFinderMap$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class ESTABLISH_LOCATION_FAILED extends Action {
                public final Object p;

                public ESTABLISH_LOCATION_FAILED() {
                    super("ESTABLISH_LOCATION_FAILED", 5);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(ProductFinderMap.e);
                    spreadBuilder.a(new Pair("event.Action", "snackbar_impression"));
                    spreadBuilder.a(new Pair("event.Category", "product finder"));
                    androidx.constraintlayout.core.state.a.y("event.Label", "failed to establish location", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.p = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "productfinder_snackbar_impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.p;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/products/MapsAnalytics.ProductFinderMap.Action.ESTABLISH_LOCATION_START", "Lau/com/woolworths/analytics/supers/products/MapsAnalytics$ProductFinderMap$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class ESTABLISH_LOCATION_START extends Action {
                public final Object p;

                public ESTABLISH_LOCATION_START() {
                    super("ESTABLISH_LOCATION_START", 3);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(ProductFinderMap.e);
                    spreadBuilder.a(new Pair("event.Action", "snackbar_impression"));
                    spreadBuilder.a(new Pair("event.Category", "product finder"));
                    androidx.constraintlayout.core.state.a.y("event.Label", "walk to establish your location", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.p = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "productfinder_snackbar_impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.p;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/products/MapsAnalytics.ProductFinderMap.Action.FEEDBACK_BUTTON_CLICK", "Lau/com/woolworths/analytics/supers/products/MapsAnalytics$ProductFinderMap$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class FEEDBACK_BUTTON_CLICK extends Action {
                public final Object p;

                public FEEDBACK_BUTTON_CLICK() {
                    super("FEEDBACK_BUTTON_CLICK", 8);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(ProductFinderMap.e);
                    spreadBuilder.a(new Pair("event.Action", "button_click"));
                    spreadBuilder.a(new Pair("event.Category", "product finder"));
                    androidx.constraintlayout.core.state.a.y("event.Label", "feedback", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.p = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "feedback_button_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.p;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/products/MapsAnalytics.ProductFinderMap.Action.LOCATION_FOUND_SUCCESS", "Lau/com/woolworths/analytics/supers/products/MapsAnalytics$ProductFinderMap$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class LOCATION_FOUND_SUCCESS extends Action {
                public final Object p;

                public LOCATION_FOUND_SUCCESS() {
                    super("LOCATION_FOUND_SUCCESS", 9);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(ProductFinderMap.e);
                    spreadBuilder.a(new Pair("event.Category", "product finder"));
                    spreadBuilder.a(new Pair("event.Action", "locationfound_impression"));
                    androidx.constraintlayout.core.state.a.y("event.Label", "location found success", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.p = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "productfinder_locationfound_impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.p;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/products/MapsAnalytics.ProductFinderMap.Action.MAP_SCREEN_IMPRESSION", "Lau/com/woolworths/analytics/supers/products/MapsAnalytics$ProductFinderMap$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class MAP_SCREEN_IMPRESSION extends Action {
                public final Object p;

                public MAP_SCREEN_IMPRESSION() {
                    super("MAP_SCREEN_IMPRESSION", 0);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(3);
                    spreadBuilder.b(ProductFinderMap.e);
                    androidx.constraintlayout.core.state.a.z("event.Action", "impression", spreadBuilder, "event.Category", "product finder");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.p = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "productfinder_storemap_screen";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.p;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/products/MapsAnalytics.ProductFinderMap.Action.NAVIGATE_BUTTON_CLICK", "Lau/com/woolworths/analytics/supers/products/MapsAnalytics$ProductFinderMap$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class NAVIGATE_BUTTON_CLICK extends Action {
                public final Object p;

                public NAVIGATE_BUTTON_CLICK() {
                    super("NAVIGATE_BUTTON_CLICK", 1);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(ProductFinderMap.e);
                    spreadBuilder.a(new Pair("event.Action", "button_click"));
                    spreadBuilder.a(new Pair("event.Category", "product finder"));
                    androidx.constraintlayout.core.state.a.y("event.Label", "navigation start", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.p = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "productfinder_button_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.p;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/products/MapsAnalytics.ProductFinderMap.Action.NAVIGATION_DIRECTION_BUTTON_CLICK", "Lau/com/woolworths/analytics/supers/products/MapsAnalytics$ProductFinderMap$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class NAVIGATION_DIRECTION_BUTTON_CLICK extends Action {
                public final Object p;

                public NAVIGATION_DIRECTION_BUTTON_CLICK() {
                    super("NAVIGATION_DIRECTION_BUTTON_CLICK", 6);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(ProductFinderMap.e);
                    spreadBuilder.a(new Pair("event.Action", "button_click"));
                    spreadBuilder.a(new Pair("event.Category", "product finder"));
                    androidx.constraintlayout.core.state.a.y("event.Label", "navigation stop", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.p = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "productfinder_button_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.p;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/products/MapsAnalytics.ProductFinderMap.Action.SHARE_YOUR_LOCATION_DIALOG_IMPRESSION", "Lau/com/woolworths/analytics/supers/products/MapsAnalytics$ProductFinderMap$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class SHARE_YOUR_LOCATION_DIALOG_IMPRESSION extends Action {
                public final Object p;

                public SHARE_YOUR_LOCATION_DIALOG_IMPRESSION() {
                    super("SHARE_YOUR_LOCATION_DIALOG_IMPRESSION", 7);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(ProductFinderMap.e);
                    spreadBuilder.a(new Pair("event.Category", "product finder"));
                    spreadBuilder.a(new Pair("event.Action", "alert_impression"));
                    androidx.constraintlayout.core.state.a.y("event.Label", "share your location alert", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.p = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "productfinder_alert_impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.p;
                }
            }

            static {
                MAP_SCREEN_IMPRESSION map_screen_impression = new MAP_SCREEN_IMPRESSION();
                e = map_screen_impression;
                NAVIGATE_BUTTON_CLICK navigate_button_click = new NAVIGATE_BUTTON_CLICK();
                f = navigate_button_click;
                CLOSE_BUTTON_CLICK close_button_click = new CLOSE_BUTTON_CLICK();
                g = close_button_click;
                ESTABLISH_LOCATION_START establish_location_start = new ESTABLISH_LOCATION_START();
                h = establish_location_start;
                ESTABLISH_LOCATION_COMPLETE establish_location_complete = new ESTABLISH_LOCATION_COMPLETE();
                i = establish_location_complete;
                ESTABLISH_LOCATION_FAILED establish_location_failed = new ESTABLISH_LOCATION_FAILED();
                NAVIGATION_DIRECTION_BUTTON_CLICK navigation_direction_button_click = new NAVIGATION_DIRECTION_BUTTON_CLICK();
                j = navigation_direction_button_click;
                SHARE_YOUR_LOCATION_DIALOG_IMPRESSION share_your_location_dialog_impression = new SHARE_YOUR_LOCATION_DIALOG_IMPRESSION();
                k = share_your_location_dialog_impression;
                FEEDBACK_BUTTON_CLICK feedback_button_click = new FEEDBACK_BUTTON_CLICK();
                l = feedback_button_click;
                LOCATION_FOUND_SUCCESS location_found_success = new LOCATION_FOUND_SUCCESS();
                m = location_found_success;
                Action[] actionArr = {map_screen_impression, navigate_button_click, close_button_click, establish_location_start, establish_location_complete, establish_location_failed, navigation_direction_button_click, share_your_location_dialog_impression, feedback_button_click, location_found_success};
                n = actionArr;
                o = EnumEntriesKt.a(actionArr);
                d = new Companion();
            }

            public static Action valueOf(String str) {
                return (Action) Enum.valueOf(Action.class, str);
            }

            public static Action[] values() {
                return (Action[]) n.clone();
            }
        }

        static {
            Map mapJ = MapsKt.j(new Pair("screen.Name", "product finder store map"), new Pair("screen.Type", "store map"), new Pair("app.Section", "Search"));
            d = mapJ;
            e = (Pair[]) MapsKt.o(mapJ).toArray(new Pair[0]);
        }

        @Override // au.com.woolworths.analytics.Event
        /* renamed from: d */
        public final String getE() {
            return "productfinderstoremap_screen";
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Screen)) {
                return false;
            }
            Screen screen = (Screen) obj;
            return "product finder store map".equals(screen.getD()) && "productfinderstoremap_screen".equals(screen.getE()) && Intrinsics.c(d, screen.getData());
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
        @Override // au.com.woolworths.analytics.Event
        public final Map getData() {
            return d;
        }

        @Override // au.com.woolworths.analytics.Screen
        /* renamed from: getName */
        public final String getD() {
            return "product finder store map";
        }

        public final int hashCode() {
            return d.hashCode() + 1828270521;
        }
    }
}
