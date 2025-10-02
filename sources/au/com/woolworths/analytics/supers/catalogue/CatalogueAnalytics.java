package au.com.woolworths.analytics.supers.catalogue;

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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/analytics/supers/catalogue/CatalogueAnalytics;", "", "Listing", "PromotionDetails", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CatalogueAnalytics {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/catalogue/CatalogueAnalytics$Listing;", "Lau/com/woolworths/analytics/Screen;", "Action", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Listing implements Screen {
        public static final Object d;
        public static final Pair[] e;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/analytics/supers/catalogue/CatalogueAnalytics$Listing$Action;", "Lau/com/woolworths/analytics/Event;", "", "Companion", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Action implements Event {
            public static final Companion d;
            public static final Action e;
            public static final Action f;
            public static final Action g;
            public static final Action h;
            public static final Action i;
            public static final Action j;
            public static final /* synthetic */ Action[] k;
            public static final /* synthetic */ EnumEntries l;

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/catalogue/CatalogueAnalytics.Listing.Action.ADD_TO_CART", "Lau/com/woolworths/analytics/supers/catalogue/CatalogueAnalytics$Listing$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class ADD_TO_CART extends Action {
                public final Object m;

                public ADD_TO_CART() {
                    super("ADD_TO_CART", 1);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(Listing.e);
                    spreadBuilder.a(new Pair("event.Action", "button_click"));
                    spreadBuilder.a(new Pair("event.Category", "cart"));
                    a.y("event.Label", "Add", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.m = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "addtocart_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.m;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/catalogue/CatalogueAnalytics.Listing.Action.ADD_TO_LIST", "Lau/com/woolworths/analytics/supers/catalogue/CatalogueAnalytics$Listing$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class ADD_TO_LIST extends Action {
                public final Object m;

                public ADD_TO_LIST() {
                    super("ADD_TO_LIST", 3);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(Listing.e);
                    spreadBuilder.a(new Pair("event.Category", "button"));
                    spreadBuilder.a(new Pair("event.Action", "click"));
                    a.y("event.Label", "Add To List", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.m = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "list_add";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.m;
                }
            }

            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/analytics/supers/catalogue/CatalogueAnalytics$Listing$Action$Companion;", "", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/catalogue/CatalogueAnalytics.Listing.Action.INFO_IMPRESSION", "Lau/com/woolworths/analytics/supers/catalogue/CatalogueAnalytics$Listing$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class INFO_IMPRESSION extends Action {
                public final Object m;

                public INFO_IMPRESSION() {
                    super("INFO_IMPRESSION", 0);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(Listing.e);
                    spreadBuilder.a(new Pair("event.Category", "info"));
                    spreadBuilder.a(new Pair("event.Action", "impression"));
                    a.y("event.Label", "Catalogue listing loaded", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.m = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "info_impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.m;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/catalogue/CatalogueAnalytics.Listing.Action.NETWORK_ERROR", "Lau/com/woolworths/analytics/supers/catalogue/CatalogueAnalytics$Listing$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class NETWORK_ERROR extends Action {
                public final Object m;

                public NETWORK_ERROR() {
                    super("NETWORK_ERROR", 4);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(Listing.e);
                    spreadBuilder.a(new Pair("event.Category", "error"));
                    spreadBuilder.a(new Pair("event.Action", "impression"));
                    a.y("event.Label", "Network Error", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.m = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "error_impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.m;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/catalogue/CatalogueAnalytics.Listing.Action.SERVER_ERROR", "Lau/com/woolworths/analytics/supers/catalogue/CatalogueAnalytics$Listing$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class SERVER_ERROR extends Action {
                public final Object m;

                public SERVER_ERROR() {
                    super("SERVER_ERROR", 5);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(Listing.e);
                    spreadBuilder.a(new Pair("event.Category", "error"));
                    spreadBuilder.a(new Pair("event.Action", "impression"));
                    a.y("event.Label", "Server Error", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.m = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "error_impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.m;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/catalogue/CatalogueAnalytics.Listing.Action.UPDATE_CART", "Lau/com/woolworths/analytics/supers/catalogue/CatalogueAnalytics$Listing$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class UPDATE_CART extends Action {
                public final Object m;

                public UPDATE_CART() {
                    super("UPDATE_CART", 2);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(Listing.e);
                    spreadBuilder.a(new Pair("event.Action", "button_click"));
                    spreadBuilder.a(new Pair("event.Category", "cart"));
                    a.y("event.Label", "update", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.m = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "addtocart_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.m;
                }
            }

            static {
                INFO_IMPRESSION info_impression = new INFO_IMPRESSION();
                e = info_impression;
                ADD_TO_CART add_to_cart = new ADD_TO_CART();
                f = add_to_cart;
                UPDATE_CART update_cart = new UPDATE_CART();
                g = update_cart;
                ADD_TO_LIST add_to_list = new ADD_TO_LIST();
                h = add_to_list;
                NETWORK_ERROR network_error = new NETWORK_ERROR();
                i = network_error;
                SERVER_ERROR server_error = new SERVER_ERROR();
                j = server_error;
                Action[] actionArr = {info_impression, add_to_cart, update_cart, add_to_list, network_error, server_error};
                k = actionArr;
                l = EnumEntriesKt.a(actionArr);
                d = new Companion();
            }

            public static Action valueOf(String str) {
                return (Action) Enum.valueOf(Action.class, str);
            }

            public static Action[] values() {
                return (Action[]) k.clone();
            }
        }

        static {
            Map mapJ = MapsKt.j(new Pair("screen.Name", "Catalogue List screen"), new Pair("app.Section", "Catalogue"));
            d = mapJ;
            e = (Pair[]) MapsKt.o(mapJ).toArray(new Pair[0]);
        }

        @Override // au.com.woolworths.analytics.Event
        /* renamed from: d */
        public final String getE() {
            return "cataloguelist_screen";
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Screen)) {
                return false;
            }
            Screen screen = (Screen) obj;
            return "Catalogue List screen".equals(screen.getD()) && "cataloguelist_screen".equals(screen.getE()) && Intrinsics.c(d, screen.getData());
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
        @Override // au.com.woolworths.analytics.Event
        public final Map getData() {
            return d;
        }

        @Override // au.com.woolworths.analytics.Screen
        /* renamed from: getName */
        public final String getD() {
            return "Catalogue List screen";
        }

        public final int hashCode() {
            return d.hashCode() - 271085485;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/catalogue/CatalogueAnalytics$PromotionDetails;", "Lau/com/woolworths/analytics/Screen;", "Action", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class PromotionDetails implements Screen {
        public static final Object d;
        public static final Pair[] e;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/analytics/supers/catalogue/CatalogueAnalytics$PromotionDetails$Action;", "Lau/com/woolworths/analytics/Event;", "", "Companion", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Action implements Event {
            public static final Companion d = new Companion();
            public static final /* synthetic */ Action[] e;
            public static final /* synthetic */ EnumEntries f;

            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/analytics/supers/catalogue/CatalogueAnalytics$PromotionDetails$Action$Companion;", "", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
            }

            static {
                Action[] actionArr = new Action[0];
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
            Map mapJ = MapsKt.j(new Pair("screen.Name", "Promotion Details screen"), new Pair("screen.Type", "productcategory"), new Pair("app.Section", "Catalogue"));
            d = mapJ;
            e = (Pair[]) MapsKt.o(mapJ).toArray(new Pair[0]);
        }

        @Override // au.com.woolworths.analytics.Event
        /* renamed from: d */
        public final String getE() {
            return "promotiondetails_screen";
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Screen)) {
                return false;
            }
            Screen screen = (Screen) obj;
            return "Promotion Details screen".equals(screen.getD()) && "promotiondetails_screen".equals(screen.getE()) && Intrinsics.c(d, screen.getData());
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
        @Override // au.com.woolworths.analytics.Event
        public final Map getData() {
            return d;
        }

        @Override // au.com.woolworths.analytics.Screen
        /* renamed from: getName */
        public final String getD() {
            return "Promotion Details screen";
        }

        public final int hashCode() {
            return d.hashCode() + 1572346043;
        }
    }
}
