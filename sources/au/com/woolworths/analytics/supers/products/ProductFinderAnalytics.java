package au.com.woolworths.analytics.supers.products;

import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.Screen;
import com.google.android.gms.actions.SearchIntents;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/products/ProductFinderAnalytics;", "", "ProductFinder", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProductFinderAnalytics {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/products/ProductFinderAnalytics$ProductFinder;", "Lau/com/woolworths/analytics/Screen;", "Action", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class ProductFinder implements Screen {
        public static final ProductFinder d = new ProductFinder();
        public static final Object e;
        public static final Pair[] f;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/products/ProductFinderAnalytics$ProductFinder$Action;", "Lau/com/woolworths/analytics/Event;", "", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Action implements Event {
            public static final Action d;
            public static final Action e;
            public static final Action f;
            public static final Action g;
            public static final Action h;
            public static final Action i;
            public static final /* synthetic */ Action[] j;
            public static final /* synthetic */ EnumEntries k;

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/products/ProductFinderAnalytics.ProductFinder.Action.LOCATION_PERMISSION_SHARE_MY_LOCATION", "Lau/com/woolworths/analytics/supers/products/ProductFinderAnalytics$ProductFinder$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class LOCATION_PERMISSION_SHARE_MY_LOCATION extends Action {
                public final Object l;

                public LOCATION_PERMISSION_SHARE_MY_LOCATION() {
                    super("LOCATION_PERMISSION_SHARE_MY_LOCATION", 2);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(ProductFinder.f);
                    spreadBuilder.a(new Pair("event.Category", "product finder"));
                    spreadBuilder.a(new Pair("event.Action", "link_click"));
                    androidx.constraintlayout.core.state.a.z("event.Label", "share my location", spreadBuilder, "event.Description", "share your location to access more store map features");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.l = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getD() {
                    return "productfinder_link_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.l;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/products/ProductFinderAnalytics.ProductFinder.Action.LOCATION_PERMISSION_UPDATE_LOCATION_SETTINGS", "Lau/com/woolworths/analytics/supers/products/ProductFinderAnalytics$ProductFinder$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class LOCATION_PERMISSION_UPDATE_LOCATION_SETTINGS extends Action {
                public final Object l;

                public LOCATION_PERMISSION_UPDATE_LOCATION_SETTINGS() {
                    super("LOCATION_PERMISSION_UPDATE_LOCATION_SETTINGS", 1);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(ProductFinder.f);
                    spreadBuilder.a(new Pair("event.Category", "product finder"));
                    spreadBuilder.a(new Pair("event.Action", "link_click"));
                    androidx.constraintlayout.core.state.a.z("event.Label", "update settings", spreadBuilder, "event.Description", "this tool helps you navigate indoor");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.l = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getD() {
                    return "productfinder_link_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.l;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/products/ProductFinderAnalytics.ProductFinder.Action.ONLOAD_IMPRESSION", "Lau/com/woolworths/analytics/supers/products/ProductFinderAnalytics$ProductFinder$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class ONLOAD_IMPRESSION extends Action {
                public final Object l;

                public ONLOAD_IMPRESSION() {
                    super("ONLOAD_IMPRESSION", 0);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(2);
                    spreadBuilder.b(ProductFinder.f);
                    androidx.constraintlayout.core.state.a.y("event.Action", "impression", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.l = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getD() {
                    return "productfinder_search_screen";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.l;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/products/ProductFinderAnalytics.ProductFinder.Action.ON_CLICK_FIND_BUTTON", "Lau/com/woolworths/analytics/supers/products/ProductFinderAnalytics$ProductFinder$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class ON_CLICK_FIND_BUTTON extends Action {
                public final Object l;

                public ON_CLICK_FIND_BUTTON() {
                    super("ON_CLICK_FIND_BUTTON", 5);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(ProductFinder.f);
                    spreadBuilder.a(new Pair("event.Category", "product finder"));
                    spreadBuilder.a(new Pair("event.Action", "click"));
                    androidx.constraintlayout.core.state.a.y("event.Label", "find", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.l = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getD() {
                    return "productfinder_button_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.l;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/products/ProductFinderAnalytics.ProductFinder.Action.ON_CLICK_STORE_DETAILS", "Lau/com/woolworths/analytics/supers/products/ProductFinderAnalytics$ProductFinder$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class ON_CLICK_STORE_DETAILS extends Action {
                public final Object l;

                public ON_CLICK_STORE_DETAILS() {
                    super("ON_CLICK_STORE_DETAILS", 4);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(ProductFinder.f);
                    spreadBuilder.a(new Pair("event.Category", "mode_selector"));
                    spreadBuilder.a(new Pair("event.Action", "button_click"));
                    androidx.constraintlayout.core.state.a.y("event.Label", "store details", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.l = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getD() {
                    return "mode_selector_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.l;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/products/ProductFinderAnalytics.ProductFinder.Action.ON_CLICK_VOICE_SEARCH", "Lau/com/woolworths/analytics/supers/products/ProductFinderAnalytics$ProductFinder$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class ON_CLICK_VOICE_SEARCH extends Action {
                public final Object l;

                public ON_CLICK_VOICE_SEARCH() {
                    super("ON_CLICK_VOICE_SEARCH", 3);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(ProductFinder.f);
                    spreadBuilder.a(new Pair("event.Category", "voice product finder"));
                    spreadBuilder.a(new Pair("event.Action", "button_click"));
                    androidx.constraintlayout.core.state.a.y("event.Label", "tap on olive voice product finder", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.l = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getD() {
                    return "voiceproductfinder_buttonclick";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.l;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/products/ProductFinderAnalytics.ProductFinder.Action.RUN_SEARCH_QUERY", "Lau/com/woolworths/analytics/supers/products/ProductFinderAnalytics$ProductFinder$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class RUN_SEARCH_QUERY extends Action {
                public final Object l;

                public RUN_SEARCH_QUERY() {
                    super("RUN_SEARCH_QUERY", 8);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(ProductFinder.f);
                    spreadBuilder.a(new Pair("event.Category", "search"));
                    spreadBuilder.a(new Pair("event.Action", SearchIntents.EXTRA_QUERY));
                    androidx.constraintlayout.core.state.a.y("event.Label", "Search", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.l = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getD() {
                    return "search_query";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.l;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/products/ProductFinderAnalytics.ProductFinder.Action.SEE_IN_STORE_CLOSE", "Lau/com/woolworths/analytics/supers/products/ProductFinderAnalytics$ProductFinder$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class SEE_IN_STORE_CLOSE extends Action {
                public final Object l;

                public SEE_IN_STORE_CLOSE() {
                    super("SEE_IN_STORE_CLOSE", 7);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(ProductFinder.f);
                    spreadBuilder.a(new Pair("event.Category", "bottomsheet"));
                    spreadBuilder.a(new Pair("event.Action", "click"));
                    androidx.constraintlayout.core.state.a.y("event.Label", "Close bottomsheet", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.l = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getD() {
                    return "bottomsheet_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.l;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/products/ProductFinderAnalytics.ProductFinder.Action.SEE_IN_STORE_IMPRESSION", "Lau/com/woolworths/analytics/supers/products/ProductFinderAnalytics$ProductFinder$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class SEE_IN_STORE_IMPRESSION extends Action {
                public final Object l;

                public SEE_IN_STORE_IMPRESSION() {
                    super("SEE_IN_STORE_IMPRESSION", 6);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(ProductFinder.f);
                    spreadBuilder.a(new Pair("event.Category", "bottomsheet"));
                    spreadBuilder.a(new Pair("event.Action", "impression"));
                    androidx.constraintlayout.core.state.a.y("event.Label", "See in store", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.l = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getD() {
                    return "bottomsheet_impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.l;
                }
            }

            static {
                ONLOAD_IMPRESSION onload_impression = new ONLOAD_IMPRESSION();
                LOCATION_PERMISSION_UPDATE_LOCATION_SETTINGS location_permission_update_location_settings = new LOCATION_PERMISSION_UPDATE_LOCATION_SETTINGS();
                d = location_permission_update_location_settings;
                LOCATION_PERMISSION_SHARE_MY_LOCATION location_permission_share_my_location = new LOCATION_PERMISSION_SHARE_MY_LOCATION();
                e = location_permission_share_my_location;
                ON_CLICK_VOICE_SEARCH on_click_voice_search = new ON_CLICK_VOICE_SEARCH();
                f = on_click_voice_search;
                ON_CLICK_STORE_DETAILS on_click_store_details = new ON_CLICK_STORE_DETAILS();
                g = on_click_store_details;
                ON_CLICK_FIND_BUTTON on_click_find_button = new ON_CLICK_FIND_BUTTON();
                SEE_IN_STORE_IMPRESSION see_in_store_impression = new SEE_IN_STORE_IMPRESSION();
                SEE_IN_STORE_CLOSE see_in_store_close = new SEE_IN_STORE_CLOSE();
                h = see_in_store_close;
                RUN_SEARCH_QUERY run_search_query = new RUN_SEARCH_QUERY();
                i = run_search_query;
                Action[] actionArr = {onload_impression, location_permission_update_location_settings, location_permission_share_my_location, on_click_voice_search, on_click_store_details, on_click_find_button, see_in_store_impression, see_in_store_close, run_search_query};
                j = actionArr;
                k = EnumEntriesKt.a(actionArr);
            }

            public static Action valueOf(String str) {
                return (Action) Enum.valueOf(Action.class, str);
            }

            public static Action[] values() {
                return (Action[]) j.clone();
            }
        }

        static {
            Map mapJ = MapsKt.j(new Pair("screen.Name", "product finder search"), new Pair("screen.Type", "search"), new Pair("app.Section", "Search"));
            e = mapJ;
            f = (Pair[]) MapsKt.o(mapJ).toArray(new Pair[0]);
        }

        @Override // au.com.woolworths.analytics.Event
        /* renamed from: d */
        public final String getD() {
            return "productfinder_search_screen";
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Screen)) {
                return false;
            }
            Screen screen = (Screen) obj;
            return "product finder search".equals(screen.getD()) && "productfinder_search_screen".equals(screen.getD()) && Intrinsics.c(e, screen.getData());
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
        @Override // au.com.woolworths.analytics.Event
        public final Map getData() {
            return e;
        }

        @Override // au.com.woolworths.analytics.Screen
        /* renamed from: getName */
        public final String getD() {
            return "product finder search";
        }

        public final int hashCode() {
            return e.hashCode() - 1309696424;
        }
    }
}
