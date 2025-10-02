package au.com.woolworths.analytics.supers.substitution;

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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/analytics/supers/substitution/CheckoutSubstitutionAnalytics;", "", "CheckoutSubstitution", "SubstitutionPreference", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CheckoutSubstitutionAnalytics {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/substitution/CheckoutSubstitutionAnalytics$CheckoutSubstitution;", "Lau/com/woolworths/analytics/Screen;", "Action", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class CheckoutSubstitution implements Screen {
        public static final Object d;
        public static final Pair[] e;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/analytics/supers/substitution/CheckoutSubstitutionAnalytics$CheckoutSubstitution$Action;", "Lau/com/woolworths/analytics/Event;", "", "Companion", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Action implements Event {
            public static final Companion d;
            public static final Action e;
            public static final Action f;
            public static final Action g;
            public static final Action h;
            public static final /* synthetic */ Action[] i;
            public static final /* synthetic */ EnumEntries j;

            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/analytics/supers/substitution/CheckoutSubstitutionAnalytics$CheckoutSubstitution$Action$Companion;", "", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/substitution/CheckoutSubstitutionAnalytics.CheckoutSubstitution.Action.SUBSTITUTION_LOAD_ERROR", "Lau/com/woolworths/analytics/supers/substitution/CheckoutSubstitutionAnalytics$CheckoutSubstitution$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class SUBSTITUTION_LOAD_ERROR extends Action {
                public final Object k;

                public SUBSTITUTION_LOAD_ERROR() {
                    super("SUBSTITUTION_LOAD_ERROR", 0);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(CheckoutSubstitution.e);
                    spreadBuilder.a(new Pair("event.Category", "Substitution error"));
                    spreadBuilder.a(new Pair("event.Action", "error"));
                    a.y("event.Label", "Checkout Products Substitution error", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.k = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "checkout_products_substitution_error";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.k;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/substitution/CheckoutSubstitutionAnalytics.CheckoutSubstitution.Action.SUBSTITUTION_ONBOARDING_BANNER_CLICK", "Lau/com/woolworths/analytics/supers/substitution/CheckoutSubstitutionAnalytics$CheckoutSubstitution$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class SUBSTITUTION_ONBOARDING_BANNER_CLICK extends Action {
                public final Object k;

                public SUBSTITUTION_ONBOARDING_BANNER_CLICK() {
                    super("SUBSTITUTION_ONBOARDING_BANNER_CLICK", 3);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(CheckoutSubstitution.e);
                    spreadBuilder.a(new Pair("event.Category", "Checkout Substitutions"));
                    spreadBuilder.a(new Pair("event.Action", "click"));
                    a.y("event.Label", "Substitution banner closed", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.k = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "substitutions_banner_closed";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.k;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/substitution/CheckoutSubstitutionAnalytics.CheckoutSubstitution.Action.SUBSTITUTION_ONBOARDING_BANNER_IMPRESSION", "Lau/com/woolworths/analytics/supers/substitution/CheckoutSubstitutionAnalytics$CheckoutSubstitution$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class SUBSTITUTION_ONBOARDING_BANNER_IMPRESSION extends Action {
                public final Object k;

                public SUBSTITUTION_ONBOARDING_BANNER_IMPRESSION() {
                    super("SUBSTITUTION_ONBOARDING_BANNER_IMPRESSION", 2);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(CheckoutSubstitution.e);
                    spreadBuilder.a(new Pair("event.Category", "Checkout Substitutions"));
                    spreadBuilder.a(new Pair("event.Action", "impression"));
                    a.y("event.Label", "Substitution banner impression", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.k = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "substitutions_banner_impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.k;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/substitution/CheckoutSubstitutionAnalytics.CheckoutSubstitution.Action.SUBSTITUTION_SAVE_ERROR", "Lau/com/woolworths/analytics/supers/substitution/CheckoutSubstitutionAnalytics$CheckoutSubstitution$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class SUBSTITUTION_SAVE_ERROR extends Action {
                public final Object k;

                public SUBSTITUTION_SAVE_ERROR() {
                    super("SUBSTITUTION_SAVE_ERROR", 1);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(CheckoutSubstitution.e);
                    spreadBuilder.a(new Pair("event.Category", "Substitution error"));
                    spreadBuilder.a(new Pair("event.Action", "error"));
                    a.y("event.Label", "Checkout Products Substitution error", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.k = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "checkout_products_substitution_save_error";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.k;
                }
            }

            static {
                SUBSTITUTION_LOAD_ERROR substitution_load_error = new SUBSTITUTION_LOAD_ERROR();
                e = substitution_load_error;
                SUBSTITUTION_SAVE_ERROR substitution_save_error = new SUBSTITUTION_SAVE_ERROR();
                f = substitution_save_error;
                SUBSTITUTION_ONBOARDING_BANNER_IMPRESSION substitution_onboarding_banner_impression = new SUBSTITUTION_ONBOARDING_BANNER_IMPRESSION();
                g = substitution_onboarding_banner_impression;
                SUBSTITUTION_ONBOARDING_BANNER_CLICK substitution_onboarding_banner_click = new SUBSTITUTION_ONBOARDING_BANNER_CLICK();
                h = substitution_onboarding_banner_click;
                Action[] actionArr = {substitution_load_error, substitution_save_error, substitution_onboarding_banner_impression, substitution_onboarding_banner_click};
                i = actionArr;
                j = EnumEntriesKt.a(actionArr);
                d = new Companion();
            }

            public static Action valueOf(String str) {
                return (Action) Enum.valueOf(Action.class, str);
            }

            public static Action[] values() {
                return (Action[]) i.clone();
            }
        }

        static {
            Map mapJ = MapsKt.j(new Pair("screen.Name", "Checkout Products screen"), new Pair("app.Section", "Checkout"));
            d = mapJ;
            e = (Pair[]) MapsKt.o(mapJ).toArray(new Pair[0]);
        }

        @Override // au.com.woolworths.analytics.Event
        /* renamed from: d */
        public final String getE() {
            return "checkoutproducts_screen";
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Screen)) {
                return false;
            }
            Screen screen = (Screen) obj;
            return "Checkout Products screen".equals(screen.getD()) && "checkoutproducts_screen".equals(screen.getE()) && Intrinsics.c(d, screen.getData());
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
        @Override // au.com.woolworths.analytics.Event
        public final Map getData() {
            return d;
        }

        @Override // au.com.woolworths.analytics.Screen
        /* renamed from: getName */
        public final String getD() {
            return "Checkout Products screen";
        }

        public final int hashCode() {
            return d.hashCode() + 883932877;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/substitution/CheckoutSubstitutionAnalytics$SubstitutionPreference;", "Lau/com/woolworths/analytics/Screen;", "Action", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class SubstitutionPreference implements Screen {
        public static final Object d;
        public static final Pair[] e;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/analytics/supers/substitution/CheckoutSubstitutionAnalytics$SubstitutionPreference$Action;", "Lau/com/woolworths/analytics/Event;", "", "Companion", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Action implements Event {
            public static final Companion d;
            public static final /* synthetic */ Action[] e;
            public static final /* synthetic */ EnumEntries f;

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/substitution/CheckoutSubstitutionAnalytics.SubstitutionPreference.Action.CLOSE_CHEAPER_SUBSTITUTION_BANNER", "Lau/com/woolworths/analytics/supers/substitution/CheckoutSubstitutionAnalytics$SubstitutionPreference$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class CLOSE_CHEAPER_SUBSTITUTION_BANNER extends Action {
                public final Object g;

                public CLOSE_CHEAPER_SUBSTITUTION_BANNER() {
                    super("CLOSE_CHEAPER_SUBSTITUTION_BANNER", 0);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(SubstitutionPreference.e);
                    spreadBuilder.a(new Pair("event.Category", "Checkout Substitutions"));
                    spreadBuilder.a(new Pair("event.Action", "button_click"));
                    a.y("event.Label", "Cheaper substitution banner closed", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.g = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "cheaper_substitutions_banner_closed";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.g;
                }
            }

            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/analytics/supers/substitution/CheckoutSubstitutionAnalytics$SubstitutionPreference$Action$Companion;", "", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
            }

            static {
                Action[] actionArr = {new CLOSE_CHEAPER_SUBSTITUTION_BANNER()};
                e = actionArr;
                f = EnumEntriesKt.a(actionArr);
                d = new Companion();
            }

            public static Action valueOf(String str) {
                return (Action) Enum.valueOf(Action.class, str);
            }

            public static Action[] values() {
                return (Action[]) e.clone();
            }
        }

        static {
            Map mapJ = MapsKt.j(new Pair("screen.Name", "Substitution Preference"), new Pair("app.Section", "Checkout"));
            d = mapJ;
            e = (Pair[]) MapsKt.o(mapJ).toArray(new Pair[0]);
        }

        @Override // au.com.woolworths.analytics.Event
        /* renamed from: d */
        public final String getE() {
            return "substitutionpreference_screen";
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Screen)) {
                return false;
            }
            Screen screen = (Screen) obj;
            return "Substitution Preference".equals(screen.getD()) && "substitutionpreference_screen".equals(screen.getE()) && Intrinsics.c(d, screen.getData());
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
        @Override // au.com.woolworths.analytics.Event
        public final Map getData() {
            return d;
        }

        @Override // au.com.woolworths.analytics.Screen
        /* renamed from: getName */
        public final String getD() {
            return "Substitution Preference";
        }

        public final int hashCode() {
            return d.hashCode() + 544913867;
        }
    }
}
