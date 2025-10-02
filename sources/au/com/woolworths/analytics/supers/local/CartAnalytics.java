package au.com.woolworths.analytics.supers.local;

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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/local/CartAnalytics;", "", "Cart", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CartAnalytics {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/supers/local/CartAnalytics$Cart;", "Lau/com/woolworths/analytics/Screen;", "Action", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Cart implements Screen {
        public static final Cart d = new Cart();
        public static final Object e;
        public static final Pair[] f;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/analytics/supers/local/CartAnalytics$Cart$Action;", "Lau/com/woolworths/analytics/Event;", "", "Companion", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Action implements Event {
            public static final /* synthetic */ EnumEntries A;
            public static final Action d;
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
            public static final Action y;
            public static final /* synthetic */ Action[] z;

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/local/CartAnalytics.Cart.Action.BUY_MORE_SAVE_MORE_APPLIED_BANNER", "Lau/com/woolworths/analytics/supers/local/CartAnalytics$Cart$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class BUY_MORE_SAVE_MORE_APPLIED_BANNER extends Action {
                public final Object B;

                public BUY_MORE_SAVE_MORE_APPLIED_BANNER() {
                    super("BUY_MORE_SAVE_MORE_APPLIED_BANNER", 23);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(Cart.f);
                    spreadBuilder.a(new Pair("event.Category", "banner"));
                    spreadBuilder.a(new Pair("event.Action", "impression"));
                    androidx.constraintlayout.core.state.a.y("event.Label", "BMSM applied", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.B = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "banner_impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.B;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/local/CartAnalytics.Cart.Action.BUY_MORE_SAVE_MORE_NOT_APPLIED_BANNER", "Lau/com/woolworths/analytics/supers/local/CartAnalytics$Cart$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class BUY_MORE_SAVE_MORE_NOT_APPLIED_BANNER extends Action {
                public final Object B;

                public BUY_MORE_SAVE_MORE_NOT_APPLIED_BANNER() {
                    super("BUY_MORE_SAVE_MORE_NOT_APPLIED_BANNER", 22);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(Cart.f);
                    spreadBuilder.a(new Pair("event.Category", "banner"));
                    spreadBuilder.a(new Pair("event.Action", "impression"));
                    androidx.constraintlayout.core.state.a.y("event.Label", "BMSM not applied", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.B = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "banner_impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.B;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/local/CartAnalytics.Cart.Action.CHECKOUT", "Lau/com/woolworths/analytics/supers/local/CartAnalytics$Cart$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class CHECKOUT extends Action {
                public final Object B;

                public CHECKOUT() {
                    super("CHECKOUT", 4);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(Cart.f);
                    spreadBuilder.a(new Pair("event.Category", "button"));
                    spreadBuilder.a(new Pair("event.Action", "click"));
                    androidx.constraintlayout.core.state.a.y("event.Label", "Checkout", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.B = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "button_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.B;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/local/CartAnalytics.Cart.Action.CONFIRM_REMOVE_ALL_PRODUCTS", "Lau/com/woolworths/analytics/supers/local/CartAnalytics$Cart$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class CONFIRM_REMOVE_ALL_PRODUCTS extends Action {
                public final Object B;

                public CONFIRM_REMOVE_ALL_PRODUCTS() {
                    super("CONFIRM_REMOVE_ALL_PRODUCTS", 8);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(Cart.f);
                    spreadBuilder.a(new Pair("event.Category", "cart"));
                    spreadBuilder.a(new Pair("event.Action", "click"));
                    androidx.constraintlayout.core.state.a.y("event.Label", "confirm remove all products", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.B = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "cart_remove_all";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.B;
                }
            }

            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/analytics/supers/local/CartAnalytics$Cart$Action$Companion;", "", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/local/CartAnalytics.Cart.Action.EMPTY_CART", "Lau/com/woolworths/analytics/supers/local/CartAnalytics$Cart$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class EMPTY_CART extends Action {
                public final Object B;

                public EMPTY_CART() {
                    super("EMPTY_CART", 12);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(Cart.f);
                    spreadBuilder.a(new Pair("event.Category", "info"));
                    spreadBuilder.a(new Pair("event.Action", "impression"));
                    androidx.constraintlayout.core.state.a.y("event.Label", "Empty Cart", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.B = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "info_impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.B;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/local/CartAnalytics.Cart.Action.MEMBER_PRICE_APPLIED_BANNER", "Lau/com/woolworths/analytics/supers/local/CartAnalytics$Cart$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class MEMBER_PRICE_APPLIED_BANNER extends Action {
                public final Object B;

                public MEMBER_PRICE_APPLIED_BANNER() {
                    super("MEMBER_PRICE_APPLIED_BANNER", 21);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(Cart.f);
                    spreadBuilder.a(new Pair("event.Category", "banner"));
                    spreadBuilder.a(new Pair("event.Action", "impression"));
                    androidx.constraintlayout.core.state.a.y("event.Label", "Member Price - BMSM applied", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.B = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "banner_impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.B;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/local/CartAnalytics.Cart.Action.MEMBER_PRICE_NOT_APPLIED_BANNER", "Lau/com/woolworths/analytics/supers/local/CartAnalytics$Cart$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class MEMBER_PRICE_NOT_APPLIED_BANNER extends Action {
                public final Object B;

                public MEMBER_PRICE_NOT_APPLIED_BANNER() {
                    super("MEMBER_PRICE_NOT_APPLIED_BANNER", 20);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(Cart.f);
                    spreadBuilder.a(new Pair("event.Category", "banner"));
                    spreadBuilder.a(new Pair("event.Action", "impression"));
                    androidx.constraintlayout.core.state.a.y("event.Label", "Member Price - BMSM not applied", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.B = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "banner_impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.B;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/local/CartAnalytics.Cart.Action.NETWORK_ERROR", "Lau/com/woolworths/analytics/supers/local/CartAnalytics$Cart$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class NETWORK_ERROR extends Action {
                public final Object B;

                public NETWORK_ERROR() {
                    super("NETWORK_ERROR", 14);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(Cart.f);
                    spreadBuilder.a(new Pair("event.Category", "error"));
                    spreadBuilder.a(new Pair("event.Action", "impression"));
                    androidx.constraintlayout.core.state.a.y("event.Label", "Network Error", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.B = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "error_impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.B;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/local/CartAnalytics.Cart.Action.NETWORK_ERROR_RETRY", "Lau/com/woolworths/analytics/supers/local/CartAnalytics$Cart$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class NETWORK_ERROR_RETRY extends Action {
                public final Object B;

                public NETWORK_ERROR_RETRY() {
                    super("NETWORK_ERROR_RETRY", 15);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(Cart.f);
                    spreadBuilder.a(new Pair("event.Category", "button"));
                    spreadBuilder.a(new Pair("event.Action", "click"));
                    androidx.constraintlayout.core.state.a.y("event.Label", "Network Error - Try Again", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.B = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "button_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.B;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/local/CartAnalytics.Cart.Action.NETWORK_ERROR_SNACKBAR", "Lau/com/woolworths/analytics/supers/local/CartAnalytics$Cart$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class NETWORK_ERROR_SNACKBAR extends Action {
                public final Object B;

                public NETWORK_ERROR_SNACKBAR() {
                    super("NETWORK_ERROR_SNACKBAR", 19);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(Cart.f);
                    spreadBuilder.a(new Pair("event.Category", "snackbar"));
                    spreadBuilder.a(new Pair("event.Action", "impression"));
                    androidx.constraintlayout.core.state.a.y("event.Label", "Network Error", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.B = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "snackbar_impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.B;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/local/CartAnalytics.Cart.Action.OPEN_PRODUCT", "Lau/com/woolworths/analytics/supers/local/CartAnalytics$Cart$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class OPEN_PRODUCT extends Action {
                public final Object B;

                public OPEN_PRODUCT() {
                    super("OPEN_PRODUCT", 6);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(Cart.f);
                    spreadBuilder.a(new Pair("event.Category", "button"));
                    spreadBuilder.a(new Pair("event.Action", "click"));
                    androidx.constraintlayout.core.state.a.y("event.Label", "Product", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.B = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "button_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.B;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/local/CartAnalytics.Cart.Action.OPEN_PRODUCTS", "Lau/com/woolworths/analytics/supers/local/CartAnalytics$Cart$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class OPEN_PRODUCTS extends Action {
                public final Object B;

                public OPEN_PRODUCTS() {
                    super("OPEN_PRODUCTS", 13);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(Cart.f);
                    spreadBuilder.a(new Pair("event.Category", "button"));
                    spreadBuilder.a(new Pair("event.Action", "click"));
                    androidx.constraintlayout.core.state.a.y("event.Label", "Start Shopping", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.B = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "button_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.B;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/local/CartAnalytics.Cart.Action.PRODUCTS_LOADED", "Lau/com/woolworths/analytics/supers/local/CartAnalytics$Cart$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class PRODUCTS_LOADED extends Action {
                public final Object B;

                public PRODUCTS_LOADED() {
                    super("PRODUCTS_LOADED", 0);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(Cart.f);
                    spreadBuilder.a(new Pair("event.Category", "info"));
                    spreadBuilder.a(new Pair("event.Action", "impression"));
                    androidx.constraintlayout.core.state.a.y("event.Label", "Trolley Screen Loaded", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.B = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "info_impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.B;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/local/CartAnalytics.Cart.Action.PROMOTION_TOOLTIPS", "Lau/com/woolworths/analytics/supers/local/CartAnalytics$Cart$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class PROMOTION_TOOLTIPS extends Action {
                public final Object B;

                public PROMOTION_TOOLTIPS() {
                    super("PROMOTION_TOOLTIPS", 5);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(Cart.f);
                    spreadBuilder.a(new Pair("event.Category", "button"));
                    spreadBuilder.a(new Pair("event.Action", "click"));
                    androidx.constraintlayout.core.state.a.y("event.Label", "Promotion Additional information", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.B = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "button_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.B;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/local/CartAnalytics.Cart.Action.REMOVE_PRODUCT", "Lau/com/woolworths/analytics/supers/local/CartAnalytics$Cart$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class REMOVE_PRODUCT extends Action {
                public final Object B;

                public REMOVE_PRODUCT() {
                    super("REMOVE_PRODUCT", 7);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(Cart.f);
                    spreadBuilder.a(new Pair("event.Category", "cart"));
                    spreadBuilder.a(new Pair("event.Action", "button_click"));
                    androidx.constraintlayout.core.state.a.y("event.Label", "x remove", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.B = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "cart_remove";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.B;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/local/CartAnalytics.Cart.Action.SERVER_ERROR", "Lau/com/woolworths/analytics/supers/local/CartAnalytics$Cart$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class SERVER_ERROR extends Action {
                public final Object B;

                public SERVER_ERROR() {
                    super("SERVER_ERROR", 16);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(Cart.f);
                    spreadBuilder.a(new Pair("event.Category", "error"));
                    spreadBuilder.a(new Pair("event.Action", "impression"));
                    androidx.constraintlayout.core.state.a.y("event.Label", "Server Error", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.B = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "error_impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.B;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/local/CartAnalytics.Cart.Action.SERVER_ERROR_RETRY", "Lau/com/woolworths/analytics/supers/local/CartAnalytics$Cart$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class SERVER_ERROR_RETRY extends Action {
                public final Object B;

                public SERVER_ERROR_RETRY() {
                    super("SERVER_ERROR_RETRY", 17);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(Cart.f);
                    spreadBuilder.a(new Pair("event.Category", "button"));
                    spreadBuilder.a(new Pair("event.Action", "click"));
                    androidx.constraintlayout.core.state.a.y("event.Label", "Server Error - Try Again", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.B = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "button_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.B;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/local/CartAnalytics.Cart.Action.SERVER_ERROR_SNACKBAR", "Lau/com/woolworths/analytics/supers/local/CartAnalytics$Cart$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class SERVER_ERROR_SNACKBAR extends Action {
                public final Object B;

                public SERVER_ERROR_SNACKBAR() {
                    super("SERVER_ERROR_SNACKBAR", 18);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(Cart.f);
                    spreadBuilder.a(new Pair("event.Category", "snackbar"));
                    spreadBuilder.a(new Pair("event.Action", "impression"));
                    androidx.constraintlayout.core.state.a.y("event.Label", "Server Error", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.B = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "snackbar_impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.B;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/local/CartAnalytics.Cart.Action.UNDO_REMOVE_ALL_PRODUCTS", "Lau/com/woolworths/analytics/supers/local/CartAnalytics$Cart$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class UNDO_REMOVE_ALL_PRODUCTS extends Action {
                public final Object B;

                public UNDO_REMOVE_ALL_PRODUCTS() {
                    super("UNDO_REMOVE_ALL_PRODUCTS", 9);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(Cart.f);
                    spreadBuilder.a(new Pair("event.Category", "snackbar"));
                    spreadBuilder.a(new Pair("event.Action", "impression"));
                    androidx.constraintlayout.core.state.a.y("event.Label", "Undo Remove All Products", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.B = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "snackbar_impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.B;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/local/CartAnalytics.Cart.Action.UNDO_REMOVE_CTA", "Lau/com/woolworths/analytics/supers/local/CartAnalytics$Cart$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class UNDO_REMOVE_CTA extends Action {
                public final Object B;

                public UNDO_REMOVE_CTA() {
                    super("UNDO_REMOVE_CTA", 11);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(Cart.f);
                    spreadBuilder.a(new Pair("event.Category", "button"));
                    spreadBuilder.a(new Pair("event.Action", "click"));
                    androidx.constraintlayout.core.state.a.y("event.Label", "Undo Remove Product", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.B = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "button_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.B;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/local/CartAnalytics.Cart.Action.UNDO_REMOVE_PRODUCT", "Lau/com/woolworths/analytics/supers/local/CartAnalytics$Cart$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class UNDO_REMOVE_PRODUCT extends Action {
                public final Object B;

                public UNDO_REMOVE_PRODUCT() {
                    super("UNDO_REMOVE_PRODUCT", 10);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(Cart.f);
                    spreadBuilder.a(new Pair("event.Category", "snackbar"));
                    spreadBuilder.a(new Pair("event.Action", "impression"));
                    androidx.constraintlayout.core.state.a.y("event.Label", "Undo Remove Product", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.B = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "snackbar_impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.B;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/local/CartAnalytics.Cart.Action.UPDATE_CART_STEPPER_DECREASE", "Lau/com/woolworths/analytics/supers/local/CartAnalytics$Cart$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class UPDATE_CART_STEPPER_DECREASE extends Action {
                public final Object B;

                public UPDATE_CART_STEPPER_DECREASE() {
                    super("UPDATE_CART_STEPPER_DECREASE", 3);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(Cart.f);
                    spreadBuilder.a(new Pair("event.Category", "cart"));
                    spreadBuilder.a(new Pair("event.Action", "button_click"));
                    androidx.constraintlayout.core.state.a.y("event.Label", "remove", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.B = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "cart_remove";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.B;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/local/CartAnalytics.Cart.Action.UPDATE_CART_STEPPER_INCREASE", "Lau/com/woolworths/analytics/supers/local/CartAnalytics$Cart$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class UPDATE_CART_STEPPER_INCREASE extends Action {
                public final Object B;

                public UPDATE_CART_STEPPER_INCREASE() {
                    super("UPDATE_CART_STEPPER_INCREASE", 2);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(Cart.f);
                    spreadBuilder.a(new Pair("event.Category", "cart"));
                    spreadBuilder.a(new Pair("event.Action", "button_click"));
                    androidx.constraintlayout.core.state.a.y("event.Label", "Update Cart - Stepper", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.B = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "cart_add";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.B;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/local/CartAnalytics.Cart.Action.UPDATE_CART_STEPPER_OLD", "Lau/com/woolworths/analytics/supers/local/CartAnalytics$Cart$Action;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class UPDATE_CART_STEPPER_OLD extends Action {
                public final Object B;

                public UPDATE_CART_STEPPER_OLD() {
                    super("UPDATE_CART_STEPPER_OLD", 1);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(Cart.f);
                    spreadBuilder.a(new Pair("event.Category", "button"));
                    spreadBuilder.a(new Pair("event.Action", "click"));
                    androidx.constraintlayout.core.state.a.y("event.Label", "Update Cart – Stepper", spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.B = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "button_click";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.B;
                }
            }

            static {
                PRODUCTS_LOADED products_loaded = new PRODUCTS_LOADED();
                d = products_loaded;
                UPDATE_CART_STEPPER_OLD update_cart_stepper_old = new UPDATE_CART_STEPPER_OLD();
                UPDATE_CART_STEPPER_INCREASE update_cart_stepper_increase = new UPDATE_CART_STEPPER_INCREASE();
                e = update_cart_stepper_increase;
                UPDATE_CART_STEPPER_DECREASE update_cart_stepper_decrease = new UPDATE_CART_STEPPER_DECREASE();
                f = update_cart_stepper_decrease;
                CHECKOUT checkout = new CHECKOUT();
                g = checkout;
                PROMOTION_TOOLTIPS promotion_tooltips = new PROMOTION_TOOLTIPS();
                h = promotion_tooltips;
                OPEN_PRODUCT open_product = new OPEN_PRODUCT();
                i = open_product;
                REMOVE_PRODUCT remove_product = new REMOVE_PRODUCT();
                j = remove_product;
                CONFIRM_REMOVE_ALL_PRODUCTS confirm_remove_all_products = new CONFIRM_REMOVE_ALL_PRODUCTS();
                k = confirm_remove_all_products;
                UNDO_REMOVE_ALL_PRODUCTS undo_remove_all_products = new UNDO_REMOVE_ALL_PRODUCTS();
                UNDO_REMOVE_PRODUCT undo_remove_product = new UNDO_REMOVE_PRODUCT();
                l = undo_remove_product;
                UNDO_REMOVE_CTA undo_remove_cta = new UNDO_REMOVE_CTA();
                m = undo_remove_cta;
                EMPTY_CART empty_cart = new EMPTY_CART();
                n = empty_cart;
                OPEN_PRODUCTS open_products = new OPEN_PRODUCTS();
                o = open_products;
                NETWORK_ERROR network_error = new NETWORK_ERROR();
                p = network_error;
                NETWORK_ERROR_RETRY network_error_retry = new NETWORK_ERROR_RETRY();
                q = network_error_retry;
                SERVER_ERROR server_error = new SERVER_ERROR();
                r = server_error;
                SERVER_ERROR_RETRY server_error_retry = new SERVER_ERROR_RETRY();
                s = server_error_retry;
                SERVER_ERROR_SNACKBAR server_error_snackbar = new SERVER_ERROR_SNACKBAR();
                t = server_error_snackbar;
                NETWORK_ERROR_SNACKBAR network_error_snackbar = new NETWORK_ERROR_SNACKBAR();
                u = network_error_snackbar;
                MEMBER_PRICE_NOT_APPLIED_BANNER member_price_not_applied_banner = new MEMBER_PRICE_NOT_APPLIED_BANNER();
                v = member_price_not_applied_banner;
                MEMBER_PRICE_APPLIED_BANNER member_price_applied_banner = new MEMBER_PRICE_APPLIED_BANNER();
                w = member_price_applied_banner;
                BUY_MORE_SAVE_MORE_NOT_APPLIED_BANNER buy_more_save_more_not_applied_banner = new BUY_MORE_SAVE_MORE_NOT_APPLIED_BANNER();
                x = buy_more_save_more_not_applied_banner;
                BUY_MORE_SAVE_MORE_APPLIED_BANNER buy_more_save_more_applied_banner = new BUY_MORE_SAVE_MORE_APPLIED_BANNER();
                y = buy_more_save_more_applied_banner;
                Action[] actionArr = {products_loaded, update_cart_stepper_old, update_cart_stepper_increase, update_cart_stepper_decrease, checkout, promotion_tooltips, open_product, remove_product, confirm_remove_all_products, undo_remove_all_products, undo_remove_product, undo_remove_cta, empty_cart, open_products, network_error, network_error_retry, server_error, server_error_retry, server_error_snackbar, network_error_snackbar, member_price_not_applied_banner, member_price_applied_banner, buy_more_save_more_not_applied_banner, buy_more_save_more_applied_banner};
                z = actionArr;
                A = EnumEntriesKt.a(actionArr);
            }

            public static Action valueOf(String str) {
                return (Action) Enum.valueOf(Action.class, str);
            }

            public static Action[] values() {
                return (Action[]) z.clone();
            }
        }

        static {
            Map mapJ = MapsKt.j(new Pair("screen.Name", "Cart screen"), new Pair("app.Section", "Checkout"));
            e = mapJ;
            f = (Pair[]) MapsKt.o(mapJ).toArray(new Pair[0]);
        }

        @Override // au.com.woolworths.analytics.Event
        /* renamed from: d */
        public final String getE() {
            return "cart_screen";
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Screen)) {
                return false;
            }
            Screen screen = (Screen) obj;
            return "Cart screen".equals(screen.getD()) && "cart_screen".equals(screen.getE()) && Intrinsics.c(e, screen.getData());
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
        @Override // au.com.woolworths.analytics.Event
        public final Map getData() {
            return e;
        }

        @Override // au.com.woolworths.analytics.Screen
        /* renamed from: getName */
        public final String getD() {
            return "Cart screen";
        }

        public final int hashCode() {
            return e.hashCode() + 556907841;
        }
    }
}
