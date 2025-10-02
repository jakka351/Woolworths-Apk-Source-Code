package au.com.woolworths.analytics.supers.buyagain;

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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/buyagain/BuyAgainAnalytics;", "", "BuyAgain", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BuyAgainAnalytics {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/buyagain/BuyAgainAnalytics$BuyAgain;", "Lau/com/woolworths/analytics/Screen;", "Action", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class BuyAgain implements Screen {
        public static final Object d;
        public static final Pair[] e;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/analytics/supers/buyagain/BuyAgainAnalytics$BuyAgain$Action;", "Lau/com/woolworths/analytics/Event;", "", "Companion", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
            public static final Action o;
            public static final Action p;
            public static final Action q;
            public static final Action r;
            public static final Action s;
            public static final Action t;
            public static final Action u;
            public static final Action v;
            public static final Action w;
            public static final Action x;
            public static final /* synthetic */ Action[] y;
            public static final /* synthetic */ EnumEntries z;

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/buyagain/BuyAgainAnalytics.BuyAgain.Action.ADD_TO_CART", "Lau/com/woolworths/analytics/supers/buyagain/BuyAgainAnalytics$BuyAgain$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class ADD_TO_CART extends Action {
                public final Object A;

                public ADD_TO_CART() {
                    super("ADD_TO_CART", 13);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(BuyAgain.e);
                    spreadBuilder.a(new Pair("event.Action", "button_click"));
                    spreadBuilder.a(new Pair("event.Category", "cart"));
                    a.z("event.Label", "add to cart", spreadBuilder, "event.Description", "buyagain_list");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.A = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "cart_add";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.A;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/buyagain/BuyAgainAnalytics.BuyAgain.Action.ADD_TO_CART_NETWORK_ERROR_IMPRESSION", "Lau/com/woolworths/analytics/supers/buyagain/BuyAgainAnalytics$BuyAgain$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class ADD_TO_CART_NETWORK_ERROR_IMPRESSION extends Action {
                public final Object A;

                public ADD_TO_CART_NETWORK_ERROR_IMPRESSION() {
                    super("ADD_TO_CART_NETWORK_ERROR_IMPRESSION", 0);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(BuyAgain.e);
                    spreadBuilder.a(new Pair("event.Category", "snackbar"));
                    spreadBuilder.a(new Pair("event.Action", "impression"));
                    a.y("event.Label", "Add to Cart Network Error", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.A = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "snackbar_impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.A;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/buyagain/BuyAgainAnalytics.BuyAgain.Action.ADD_TO_CART_SERVER_ERROR_IMPRESSION", "Lau/com/woolworths/analytics/supers/buyagain/BuyAgainAnalytics$BuyAgain$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class ADD_TO_CART_SERVER_ERROR_IMPRESSION extends Action {
                public final Object A;

                public ADD_TO_CART_SERVER_ERROR_IMPRESSION() {
                    super("ADD_TO_CART_SERVER_ERROR_IMPRESSION", 1);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(BuyAgain.e);
                    spreadBuilder.a(new Pair("event.Category", "snackbar"));
                    spreadBuilder.a(new Pair("event.Action", "impression"));
                    a.y("event.Label", "Add to Cart Server Error", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.A = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "snackbar_impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.A;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/buyagain/BuyAgainAnalytics.BuyAgain.Action.ADD_TO_LIST_CLICK", "Lau/com/woolworths/analytics/supers/buyagain/BuyAgainAnalytics$BuyAgain$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class ADD_TO_LIST_CLICK extends Action {
                public final Object A;

                public ADD_TO_LIST_CLICK() {
                    super("ADD_TO_LIST_CLICK", 2);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(BuyAgain.e);
                    spreadBuilder.a(new Pair("event.Category", "button"));
                    spreadBuilder.a(new Pair("event.Action", "click"));
                    a.y("event.Label", "Save To List", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.A = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "button_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.A;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/buyagain/BuyAgainAnalytics.BuyAgain.Action.ADD_TO_LIST_SNACKBAR_IMPRESSION", "Lau/com/woolworths/analytics/supers/buyagain/BuyAgainAnalytics$BuyAgain$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class ADD_TO_LIST_SNACKBAR_IMPRESSION extends Action {
                public final Object A;

                public ADD_TO_LIST_SNACKBAR_IMPRESSION() {
                    super("ADD_TO_LIST_SNACKBAR_IMPRESSION", 3);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(BuyAgain.e);
                    spreadBuilder.a(new Pair("event.Category", "snackbar"));
                    spreadBuilder.a(new Pair("event.Action", "impression"));
                    a.y("event.Label", "saved in my shopping list", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.A = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "snackbar_impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.A;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/buyagain/BuyAgainAnalytics.BuyAgain.Action.ADD_TO_WATCHLIST", "Lau/com/woolworths/analytics/supers/buyagain/BuyAgainAnalytics$BuyAgain$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class ADD_TO_WATCHLIST extends Action {
                public final Object A;

                public ADD_TO_WATCHLIST() {
                    super("ADD_TO_WATCHLIST", 17);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(BuyAgain.e);
                    spreadBuilder.a(new Pair("screen.Type", "productcategory"));
                    spreadBuilder.a(new Pair("event.Category", "watchlist"));
                    a.z("event.Action", "button_click", spreadBuilder, "event.Label", "save to watchlist");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.A = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "watchlist_buttonclick";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.A;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/buyagain/BuyAgainAnalytics.BuyAgain.Action.CART_OPEN", "Lau/com/woolworths/analytics/supers/buyagain/BuyAgainAnalytics$BuyAgain$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class CART_OPEN extends Action {
                public final Object A;

                public CART_OPEN() {
                    super("CART_OPEN", 4);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(BuyAgain.e);
                    spreadBuilder.a(new Pair("event.Category", "button"));
                    spreadBuilder.a(new Pair("event.Action", "click"));
                    a.y("event.Label", "Cart Open", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.A = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "button_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.A;
                }
            }

            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/analytics/supers/buyagain/BuyAgainAnalytics$BuyAgain$Action$Companion;", "", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/buyagain/BuyAgainAnalytics.BuyAgain.Action.EMPTY_STATE_CTA_CLICK", "Lau/com/woolworths/analytics/supers/buyagain/BuyAgainAnalytics$BuyAgain$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class EMPTY_STATE_CTA_CLICK extends Action {
                public final Object A;

                public EMPTY_STATE_CTA_CLICK() {
                    super("EMPTY_STATE_CTA_CLICK", 5);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(BuyAgain.e);
                    spreadBuilder.a(new Pair("event.Category", "button"));
                    spreadBuilder.a(new Pair("event.Action", "click"));
                    a.y("event.Label", "Start Shopping", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.A = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "button_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.A;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/buyagain/BuyAgainAnalytics.BuyAgain.Action.EMPTY_STATE_IMPRESSION", "Lau/com/woolworths/analytics/supers/buyagain/BuyAgainAnalytics$BuyAgain$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class EMPTY_STATE_IMPRESSION extends Action {
                public final Object A;

                public EMPTY_STATE_IMPRESSION() {
                    super("EMPTY_STATE_IMPRESSION", 6);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(BuyAgain.e);
                    spreadBuilder.a(new Pair("event.Category", "info"));
                    spreadBuilder.a(new Pair("event.Action", "impression"));
                    a.y("event.Label", "No Products Found", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.A = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "info_impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.A;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/buyagain/BuyAgainAnalytics.BuyAgain.Action.NETWORK_ERROR_CTA_CLICK", "Lau/com/woolworths/analytics/supers/buyagain/BuyAgainAnalytics$BuyAgain$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class NETWORK_ERROR_CTA_CLICK extends Action {
                public final Object A;

                public NETWORK_ERROR_CTA_CLICK() {
                    super("NETWORK_ERROR_CTA_CLICK", 7);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(BuyAgain.e);
                    spreadBuilder.a(new Pair("event.Category", "button"));
                    spreadBuilder.a(new Pair("event.Action", "click"));
                    a.y("event.Label", "Network Error - Try Again", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.A = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "button_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.A;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/buyagain/BuyAgainAnalytics.BuyAgain.Action.NETWORK_ERROR_IMPRESSION", "Lau/com/woolworths/analytics/supers/buyagain/BuyAgainAnalytics$BuyAgain$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class NETWORK_ERROR_IMPRESSION extends Action {
                public final Object A;

                public NETWORK_ERROR_IMPRESSION() {
                    super("NETWORK_ERROR_IMPRESSION", 8);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(BuyAgain.e);
                    spreadBuilder.a(new Pair("event.Category", "error"));
                    spreadBuilder.a(new Pair("event.Action", "impression"));
                    a.y("event.Label", "Network Error", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.A = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "error_impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.A;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/buyagain/BuyAgainAnalytics.BuyAgain.Action.PRODUCTS_ADD_TO_CART_SUCCESS_SNACKBAR_IMPRESSION", "Lau/com/woolworths/analytics/supers/buyagain/BuyAgainAnalytics$BuyAgain$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class PRODUCTS_ADD_TO_CART_SUCCESS_SNACKBAR_IMPRESSION extends Action {
                public final Object A;

                public PRODUCTS_ADD_TO_CART_SUCCESS_SNACKBAR_IMPRESSION() {
                    super("PRODUCTS_ADD_TO_CART_SUCCESS_SNACKBAR_IMPRESSION", 9);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(BuyAgain.e);
                    spreadBuilder.a(new Pair("event.Category", "snackbar"));
                    spreadBuilder.a(new Pair("event.Action", "impression"));
                    a.y("event.Label", "product added to cart", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.A = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "snackbar_impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.A;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/buyagain/BuyAgainAnalytics.BuyAgain.Action.PRODUCT_ADD_TO_LIST", "Lau/com/woolworths/analytics/supers/buyagain/BuyAgainAnalytics$BuyAgain$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class PRODUCT_ADD_TO_LIST extends Action {
                public final Object A;

                public PRODUCT_ADD_TO_LIST() {
                    super("PRODUCT_ADD_TO_LIST", 15);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(BuyAgain.e);
                    spreadBuilder.a(new Pair("event.Category", "button"));
                    spreadBuilder.a(new Pair("event.Action", "click"));
                    a.y("event.Label", "Product Add to List", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.A = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "button_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.A;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/buyagain/BuyAgainAnalytics.BuyAgain.Action.REMOVE_FROM_WATCHLIST", "Lau/com/woolworths/analytics/supers/buyagain/BuyAgainAnalytics$BuyAgain$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class REMOVE_FROM_WATCHLIST extends Action {
                public final Object A;

                public REMOVE_FROM_WATCHLIST() {
                    super("REMOVE_FROM_WATCHLIST", 18);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(BuyAgain.e);
                    spreadBuilder.a(new Pair("screen.Type", "productcategory"));
                    spreadBuilder.a(new Pair("event.Category", "watchlist"));
                    a.z("event.Action", "button_click", spreadBuilder, "event.Label", "unsave from watchlist");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.A = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "watchlist_buttonclick";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.A;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/buyagain/BuyAgainAnalytics.BuyAgain.Action.SEARCH_ICON_CLICK", "Lau/com/woolworths/analytics/supers/buyagain/BuyAgainAnalytics$BuyAgain$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class SEARCH_ICON_CLICK extends Action {
                public final Object A;

                public SEARCH_ICON_CLICK() {
                    super("SEARCH_ICON_CLICK", 10);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(BuyAgain.e);
                    spreadBuilder.a(new Pair("event.Category", "button"));
                    spreadBuilder.a(new Pair("event.Action", "click"));
                    a.y("event.Label", "Tap Search Icon", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.A = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "button_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.A;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/buyagain/BuyAgainAnalytics.BuyAgain.Action.SERVER_ERROR_CTA_CLICK", "Lau/com/woolworths/analytics/supers/buyagain/BuyAgainAnalytics$BuyAgain$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class SERVER_ERROR_CTA_CLICK extends Action {
                public final Object A;

                public SERVER_ERROR_CTA_CLICK() {
                    super("SERVER_ERROR_CTA_CLICK", 11);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(BuyAgain.e);
                    spreadBuilder.a(new Pair("event.Category", "button"));
                    spreadBuilder.a(new Pair("event.Action", "click"));
                    a.y("event.Label", "Server Error - Try Again", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.A = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "button_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.A;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/buyagain/BuyAgainAnalytics.BuyAgain.Action.SERVER_ERROR_IMPRESSION", "Lau/com/woolworths/analytics/supers/buyagain/BuyAgainAnalytics$BuyAgain$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class SERVER_ERROR_IMPRESSION extends Action {
                public final Object A;

                public SERVER_ERROR_IMPRESSION() {
                    super("SERVER_ERROR_IMPRESSION", 12);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(BuyAgain.e);
                    spreadBuilder.a(new Pair("event.Category", "error"));
                    spreadBuilder.a(new Pair("event.Action", "impression"));
                    a.y("event.Label", "Server Error", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.A = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "error_impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.A;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/buyagain/BuyAgainAnalytics.BuyAgain.Action.STEPPER_QUANTITY", "Lau/com/woolworths/analytics/supers/buyagain/BuyAgainAnalytics$BuyAgain$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class STEPPER_QUANTITY extends Action {
                public final Object A;

                public STEPPER_QUANTITY() {
                    super("STEPPER_QUANTITY", 16);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(BuyAgain.e);
                    spreadBuilder.a(new Pair("event.Category", "button"));
                    spreadBuilder.a(new Pair("event.Action", "click"));
                    a.y("event.Label", "Stepper Quantity", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.A = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "button_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.A;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/buyagain/BuyAgainAnalytics.BuyAgain.Action.UPDATE_LIST", "Lau/com/woolworths/analytics/supers/buyagain/BuyAgainAnalytics$BuyAgain$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class UPDATE_LIST extends Action {
                public final Object A;

                public UPDATE_LIST() {
                    super("UPDATE_LIST", 14);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(BuyAgain.e);
                    spreadBuilder.a(new Pair("event.Action", "button_click"));
                    spreadBuilder.a(new Pair("event.Category", "list"));
                    a.z("event.Label", "update list", spreadBuilder, "event.Description", "quantity bottomsheet");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.A = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "buyagain_list_update";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.A;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/buyagain/BuyAgainAnalytics.BuyAgain.Action.WATCHLIST_SNACKBAR_VIEW_ACTION", "Lau/com/woolworths/analytics/supers/buyagain/BuyAgainAnalytics$BuyAgain$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class WATCHLIST_SNACKBAR_VIEW_ACTION extends Action {
                public final Object A;

                public WATCHLIST_SNACKBAR_VIEW_ACTION() {
                    super("WATCHLIST_SNACKBAR_VIEW_ACTION", 19);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                    spreadBuilder.b(BuyAgain.e);
                    spreadBuilder.a(new Pair("screen.Type", "productcategory"));
                    spreadBuilder.a(new Pair("event.Category", "watchlist"));
                    spreadBuilder.a(new Pair("event.Action", "button_click"));
                    spreadBuilder.a(new Pair("event.Label", "view list"));
                    a.y("product.Source", "watchlist", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.A = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "watchlist_buttonclick";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.A;
                }
            }

            static {
                ADD_TO_CART_NETWORK_ERROR_IMPRESSION add_to_cart_network_error_impression = new ADD_TO_CART_NETWORK_ERROR_IMPRESSION();
                e = add_to_cart_network_error_impression;
                ADD_TO_CART_SERVER_ERROR_IMPRESSION add_to_cart_server_error_impression = new ADD_TO_CART_SERVER_ERROR_IMPRESSION();
                f = add_to_cart_server_error_impression;
                ADD_TO_LIST_CLICK add_to_list_click = new ADD_TO_LIST_CLICK();
                g = add_to_list_click;
                ADD_TO_LIST_SNACKBAR_IMPRESSION add_to_list_snackbar_impression = new ADD_TO_LIST_SNACKBAR_IMPRESSION();
                h = add_to_list_snackbar_impression;
                CART_OPEN cart_open = new CART_OPEN();
                i = cart_open;
                EMPTY_STATE_CTA_CLICK empty_state_cta_click = new EMPTY_STATE_CTA_CLICK();
                j = empty_state_cta_click;
                EMPTY_STATE_IMPRESSION empty_state_impression = new EMPTY_STATE_IMPRESSION();
                k = empty_state_impression;
                NETWORK_ERROR_CTA_CLICK network_error_cta_click = new NETWORK_ERROR_CTA_CLICK();
                l = network_error_cta_click;
                NETWORK_ERROR_IMPRESSION network_error_impression = new NETWORK_ERROR_IMPRESSION();
                m = network_error_impression;
                PRODUCTS_ADD_TO_CART_SUCCESS_SNACKBAR_IMPRESSION products_add_to_cart_success_snackbar_impression = new PRODUCTS_ADD_TO_CART_SUCCESS_SNACKBAR_IMPRESSION();
                n = products_add_to_cart_success_snackbar_impression;
                SEARCH_ICON_CLICK search_icon_click = new SEARCH_ICON_CLICK();
                o = search_icon_click;
                SERVER_ERROR_CTA_CLICK server_error_cta_click = new SERVER_ERROR_CTA_CLICK();
                p = server_error_cta_click;
                SERVER_ERROR_IMPRESSION server_error_impression = new SERVER_ERROR_IMPRESSION();
                q = server_error_impression;
                ADD_TO_CART add_to_cart = new ADD_TO_CART();
                r = add_to_cart;
                UPDATE_LIST update_list = new UPDATE_LIST();
                s = update_list;
                PRODUCT_ADD_TO_LIST product_add_to_list = new PRODUCT_ADD_TO_LIST();
                t = product_add_to_list;
                STEPPER_QUANTITY stepper_quantity = new STEPPER_QUANTITY();
                u = stepper_quantity;
                ADD_TO_WATCHLIST add_to_watchlist = new ADD_TO_WATCHLIST();
                v = add_to_watchlist;
                REMOVE_FROM_WATCHLIST remove_from_watchlist = new REMOVE_FROM_WATCHLIST();
                w = remove_from_watchlist;
                WATCHLIST_SNACKBAR_VIEW_ACTION watchlist_snackbar_view_action = new WATCHLIST_SNACKBAR_VIEW_ACTION();
                x = watchlist_snackbar_view_action;
                Action[] actionArr = {add_to_cart_network_error_impression, add_to_cart_server_error_impression, add_to_list_click, add_to_list_snackbar_impression, cart_open, empty_state_cta_click, empty_state_impression, network_error_cta_click, network_error_impression, products_add_to_cart_success_snackbar_impression, search_icon_click, server_error_cta_click, server_error_impression, add_to_cart, update_list, product_add_to_list, stepper_quantity, add_to_watchlist, remove_from_watchlist, watchlist_snackbar_view_action};
                y = actionArr;
                z = EnumEntriesKt.a(actionArr);
                d = new Companion();
            }

            public static Action valueOf(String str) {
                return (Action) Enum.valueOf(Action.class, str);
            }

            public static Action[] values() {
                return (Action[]) y.clone();
            }
        }

        static {
            Map mapJ = MapsKt.j(new Pair("screen.Name", "Buy Again screen"), new Pair("app.Section", "Buy Again"));
            d = mapJ;
            e = (Pair[]) MapsKt.o(mapJ).toArray(new Pair[0]);
        }

        @Override // au.com.woolworths.analytics.Event
        /* renamed from: d */
        public final String getE() {
            return "buy_again_screen";
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Screen)) {
                return false;
            }
            Screen screen = (Screen) obj;
            return "Buy Again screen".equals(screen.getD()) && "buy_again_screen".equals(screen.getE()) && Intrinsics.c(d, screen.getData());
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
        @Override // au.com.woolworths.analytics.Event
        public final Map getData() {
            return d;
        }

        @Override // au.com.woolworths.analytics.Screen
        /* renamed from: getName */
        public final String getD() {
            return "Buy Again screen";
        }

        public final int hashCode() {
            return d.hashCode() + 616216706;
        }
    }
}
