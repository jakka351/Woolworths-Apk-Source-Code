package au.com.woolworths.feature.shop.myorders.details.cancel.analytics;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.feature.shop.myorders.details.analytics.MyOrdersScreens;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/cancel/analytics/OrderCancelActions;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class OrderCancelActions implements Action {
    public static final OrderCancelActions e;
    public static final OrderCancelActions f;
    public static final OrderCancelActions g;
    public static final OrderCancelActions h;
    public static final OrderCancelActions i;
    public static final /* synthetic */ OrderCancelActions[] j;
    public static final /* synthetic */ EnumEntries k;
    public final Screen d = MyOrdersScreens.g;

    static {
        OrderCancelActions orderCancelActions = new OrderCancelActions() { // from class: au.com.woolworths.feature.shop.myorders.details.cancel.analytics.OrderCancelActions.CANCEL_BUTTON_CONFIRMATION_CLICK
            public final Category l = Category.m;
            public final String m = "Cancel Button Tap – Confirmation";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getM() {
                return this.m;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getL() {
                return this.l;
            }
        };
        e = orderCancelActions;
        OrderCancelActions orderCancelActions2 = new OrderCancelActions() { // from class: au.com.woolworths.feature.shop.myorders.details.cancel.analytics.OrderCancelActions.ORDER_NOT_CANCELABLE
            public final Category l = Category.B;
            public final String m = "Order Not Cancellable";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getM() {
                return this.m;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getL() {
                return this.l;
            }
        };
        f = orderCancelActions2;
        OrderCancelActions orderCancelActions3 = new OrderCancelActions() { // from class: au.com.woolworths.feature.shop.myorders.details.cancel.analytics.OrderCancelActions.SERVER_ERROR
            public final Category l = Category.v;
            public final String m = "Server Error";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getM() {
                return this.m;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getL() {
                return this.l;
            }
        };
        g = orderCancelActions3;
        OrderCancelActions orderCancelActions4 = new OrderCancelActions() { // from class: au.com.woolworths.feature.shop.myorders.details.cancel.analytics.OrderCancelActions.NETWORK_ERROR
            public final Category l = Category.v;
            public final String m = "Network Error";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getM() {
                return this.m;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getL() {
                return this.l;
            }
        };
        h = orderCancelActions4;
        OrderCancelActions orderCancelActions5 = new OrderCancelActions() { // from class: au.com.woolworths.feature.shop.myorders.details.cancel.analytics.OrderCancelActions.RETURN_TO_ORDER
            public final Category l = Category.m;
            public final String m = "Return to Order";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getM() {
                return this.m;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getL() {
                return this.l;
            }
        };
        i = orderCancelActions5;
        OrderCancelActions[] orderCancelActionsArr = {orderCancelActions, orderCancelActions2, orderCancelActions3, orderCancelActions4, orderCancelActions5};
        j = orderCancelActionsArr;
        k = EnumEntriesKt.a(orderCancelActionsArr);
    }

    public OrderCancelActions(String str, int i2) {
    }

    public static OrderCancelActions valueOf(String str) {
        return (OrderCancelActions) Enum.valueOf(OrderCancelActions.class, str);
    }

    public static OrderCancelActions[] values() {
        return (OrderCancelActions[]) j.clone();
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f, reason: from getter */
    public final Screen getD() {
        return this.d;
    }
}
