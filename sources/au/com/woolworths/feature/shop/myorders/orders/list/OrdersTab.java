package au.com.woolworths.feature.shop.myorders.orders.list;

import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.feature.shop.myorders.orders.analytics.OrdersActions;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/orders/list/OrdersTab;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class OrdersTab {
    public static final OrdersTab e;
    public static final OrdersTab f;
    public static final OrdersTab g;
    public static final /* synthetic */ OrdersTab[] h;
    public static final /* synthetic */ EnumEntries i;
    public final ResText d;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/feature/shop/myorders/orders/list/OrdersTab.GUEST", "Lau/com/woolworths/feature/shop/myorders/orders/list/OrdersTab;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class GUEST extends OrdersTab {
        @Override // au.com.woolworths.feature.shop.myorders.orders.list.OrdersTab
        /* renamed from: b */
        public final OrdersActions getK() {
            throw new IllegalStateException("No try again events on guest tab");
        }
    }

    static {
        GUEST guest = new GUEST("GUEST", 0, new ResText(R.string.login));
        e = guest;
        OrdersTab ordersTab = new OrdersTab() { // from class: au.com.woolworths.feature.shop.myorders.orders.list.OrdersTab.CURRENT
            public final OrdersActions j;
            public final OrdersActions k;

            {
                new ResText(R.string.tab_label_current_orders);
                this.j = OrdersActions.p;
                this.k = OrdersActions.o;
            }

            @Override // au.com.woolworths.feature.shop.myorders.orders.list.OrdersTab
            /* renamed from: a, reason: from getter */
            public final OrdersActions getJ() {
                return this.j;
            }

            @Override // au.com.woolworths.feature.shop.myorders.orders.list.OrdersTab
            /* renamed from: b, reason: from getter */
            public final OrdersActions getK() {
                return this.k;
            }
        };
        f = ordersTab;
        OrdersTab ordersTab2 = new OrdersTab() { // from class: au.com.woolworths.feature.shop.myorders.orders.list.OrdersTab.PAST
            public final OrdersActions j;
            public final OrdersActions k;

            {
                new ResText(R.string.tab_label_past_orders);
                this.j = OrdersActions.q;
                this.k = OrdersActions.t;
            }

            @Override // au.com.woolworths.feature.shop.myorders.orders.list.OrdersTab
            /* renamed from: a, reason: from getter */
            public final OrdersActions getJ() {
                return this.j;
            }

            @Override // au.com.woolworths.feature.shop.myorders.orders.list.OrdersTab
            /* renamed from: b, reason: from getter */
            public final OrdersActions getK() {
                return this.k;
            }
        };
        g = ordersTab2;
        OrdersTab[] ordersTabArr = {guest, ordersTab, ordersTab2};
        h = ordersTabArr;
        i = EnumEntriesKt.a(ordersTabArr);
    }

    public OrdersTab(String str, int i2, ResText resText) {
        this.d = resText;
    }

    public static OrdersTab valueOf(String str) {
        return (OrdersTab) Enum.valueOf(OrdersTab.class, str);
    }

    public static OrdersTab[] values() {
        return (OrdersTab[]) h.clone();
    }

    /* renamed from: a */
    public OrdersActions getJ() {
        return null;
    }

    /* renamed from: b */
    public abstract OrdersActions getK();
}
