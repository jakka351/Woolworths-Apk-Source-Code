package au.com.woolworths.feature.shop.myorders.orders.analytics;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.feature.shop.myorders.details.analytics.MyOrdersScreens;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/orders/analytics/OrdersActions;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class OrdersActions implements Action {
    public static final OrdersActions e;
    public static final OrdersActions f;
    public static final OrdersActions g;
    public static final OrdersActions h;
    public static final OrdersActions i;
    public static final OrdersActions j;
    public static final OrdersActions k;
    public static final OrdersActions l;
    public static final OrdersActions m;
    public static final OrdersActions n;
    public static final OrdersActions o;
    public static final OrdersActions p;
    public static final OrdersActions q;
    public static final OrdersActions r;
    public static final OrdersActions s;
    public static final OrdersActions t;
    public static final OrdersActions u;
    public static final /* synthetic */ OrdersActions[] v;
    public static final /* synthetic */ EnumEntries w;
    public final MyOrdersScreens d = MyOrdersScreens.f;

    static {
        OrdersActions ordersActions = new OrdersActions() { // from class: au.com.woolworths.feature.shop.myorders.orders.analytics.OrdersActions.LOGIN_REQUIRED
            public final Category x = Category.v;
            public final String y = "Logged out State";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.y;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.x;
            }
        };
        e = ordersActions;
        OrdersActions ordersActions2 = new OrdersActions() { // from class: au.com.woolworths.feature.shop.myorders.orders.analytics.OrdersActions.LOGIN_TAPPED
            public final Category x = Category.m;
            public final String y = "Log In";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.y;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.x;
            }
        };
        f = ordersActions2;
        OrdersActions ordersActions3 = new OrdersActions() { // from class: au.com.woolworths.feature.shop.myorders.orders.analytics.OrdersActions.NETWORK_ERROR
            public final Category x = Category.v;
            public final String y = "Network Error";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.y;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.x;
            }
        };
        g = ordersActions3;
        OrdersActions ordersActions4 = new OrdersActions() { // from class: au.com.woolworths.feature.shop.myorders.orders.analytics.OrdersActions.NO_NETWORK_CONNECTION_SNACKBAR_IMPRESSION
            public final Category x = Category.g0;
            public final String y = "No network connection";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.y;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.x;
            }
        };
        OrdersActions ordersActions5 = new OrdersActions() { // from class: au.com.woolworths.feature.shop.myorders.orders.analytics.OrdersActions.SERVER_ERROR
            public final Category x = Category.v;
            public final String y = "Server Error";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.y;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.x;
            }
        };
        h = ordersActions5;
        OrdersActions ordersActions6 = new OrdersActions() { // from class: au.com.woolworths.feature.shop.myorders.orders.analytics.OrdersActions.UNABLE_TO_NOTIFY_STORE
            public final Category x = Category.g0;
            public final String y = "Unable to notify store";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.y;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.x;
            }
        };
        i = ordersActions6;
        OrdersActions ordersActions7 = new OrdersActions() { // from class: au.com.woolworths.feature.shop.myorders.orders.analytics.OrdersActions.UNABLE_TO_REFRESH_ORDERS
            public final Category x = Category.g0;
            public final String y = "Unable to refresh orders";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.y;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.x;
            }
        };
        OrdersActions ordersActions8 = new OrdersActions() { // from class: au.com.woolworths.feature.shop.myorders.orders.analytics.OrdersActions.TRY_AGAIN_TAPPED
            public final Category x = Category.m;
            public final String y = "Try Again";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.y;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.x;
            }
        };
        OrdersActions ordersActions9 = new OrdersActions() { // from class: au.com.woolworths.feature.shop.myorders.orders.analytics.OrdersActions.NO_ORDERS
            public final Category x = Category.B;
            public final String y = "No Current Orders";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.y;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.x;
            }
        };
        j = ordersActions9;
        OrdersActions ordersActions10 = new OrdersActions() { // from class: au.com.woolworths.feature.shop.myorders.orders.analytics.OrdersActions.SEE_ALL_ORDERS_TAPPED
            public final Category x = Category.m;
            public final String y = "See All Orders";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.y;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.x;
            }
        };
        k = ordersActions10;
        OrdersActions ordersActions11 = new OrdersActions() { // from class: au.com.woolworths.feature.shop.myorders.orders.analytics.OrdersActions.INSET_BANNER_IMPRESSION
            public final Category x = Category.B;
            public final String y = "Inset Banner impression";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.y;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.x;
            }
        };
        l = ordersActions11;
        OrdersActions ordersActions12 = new OrdersActions() { // from class: au.com.woolworths.feature.shop.myorders.orders.analytics.OrdersActions.CMO_IN_CHANGE_MODE_ERROR_IMPRESSION
            public final Category x = Category.v;
            public final String y = "Change My Order - In Change Mode";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.y;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.x;
            }
        };
        m = ordersActions12;
        OrdersActions ordersActions13 = new OrdersActions() { // from class: au.com.woolworths.feature.shop.myorders.orders.analytics.OrdersActions.CURRENT_ORDERS_LOADED
            public final Category x = Category.B;
            public final String y = "Current Orders Loaded";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.y;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.x;
            }
        };
        n = ordersActions13;
        OrdersActions ordersActions14 = new OrdersActions() { // from class: au.com.woolworths.feature.shop.myorders.orders.analytics.OrdersActions.CURRENT_ORDERS_EMPTY
            public final Category x = Category.B;
            public final String y = "No Current Orders";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.y;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.x;
            }
        };
        OrdersActions ordersActions15 = new OrdersActions() { // from class: au.com.woolworths.feature.shop.myorders.orders.analytics.OrdersActions.CURRENT_ORDERS_TRY_AGAIN_TAPPED
            public final Category x = Category.m;
            public final String y = "Try Again - Current Orders";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.y;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.x;
            }
        };
        o = ordersActions15;
        OrdersActions ordersActions16 = new OrdersActions() { // from class: au.com.woolworths.feature.shop.myorders.orders.analytics.OrdersActions.CURRENT_ORDERS_TAB_TAPPED
            public final Category x = Category.m;
            public final String y = "My Orders Tab - Current";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.y;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.x;
            }
        };
        p = ordersActions16;
        OrdersActions ordersActions17 = new OrdersActions() { // from class: au.com.woolworths.feature.shop.myorders.orders.analytics.OrdersActions.PAST_ORDERS_TAB_TAPPED
            public final Category x = Category.m;
            public final String y = "My Orders Tab - Past";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.y;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.x;
            }
        };
        q = ordersActions17;
        OrdersActions ordersActions18 = new OrdersActions() { // from class: au.com.woolworths.feature.shop.myorders.orders.analytics.OrdersActions.PAST_ORDERS_LOADED
            public final Category x = Category.B;
            public final String y = "Past Orders Loaded";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.y;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.x;
            }
        };
        r = ordersActions18;
        OrdersActions ordersActions19 = new OrdersActions() { // from class: au.com.woolworths.feature.shop.myorders.orders.analytics.OrdersActions.PAST_ORDERS_EMPTY
            public final Category x = Category.B;
            public final String y = "No Past Orders";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.y;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.x;
            }
        };
        s = ordersActions19;
        OrdersActions ordersActions20 = new OrdersActions() { // from class: au.com.woolworths.feature.shop.myorders.orders.analytics.OrdersActions.PAST_ORDERS_TRY_AGAIN_TAPPED
            public final Category x = Category.m;
            public final String y = "Try Again - Past Orders";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.y;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.x;
            }
        };
        t = ordersActions20;
        OrdersActions ordersActions21 = new OrdersActions() { // from class: au.com.woolworths.feature.shop.myorders.orders.analytics.OrdersActions.ORDER_TILE_TAPPED
            public final Category x = Category.m;
            public final String y = "My Orders Tile";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.y;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getK() {
                return this.x;
            }
        };
        u = ordersActions21;
        OrdersActions[] ordersActionsArr = {ordersActions, ordersActions2, ordersActions3, ordersActions4, ordersActions5, ordersActions6, ordersActions7, ordersActions8, ordersActions9, ordersActions10, ordersActions11, ordersActions12, ordersActions13, ordersActions14, ordersActions15, ordersActions16, ordersActions17, ordersActions18, ordersActions19, ordersActions20, ordersActions21};
        v = ordersActionsArr;
        w = EnumEntriesKt.a(ordersActionsArr);
    }

    public OrdersActions(String str, int i2) {
    }

    public static OrdersActions valueOf(String str) {
        return (OrdersActions) Enum.valueOf(OrdersActions.class, str);
    }

    public static OrdersActions[] values() {
        return (OrdersActions[]) v.clone();
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f */
    public final Screen getD() {
        return this.d;
    }
}
