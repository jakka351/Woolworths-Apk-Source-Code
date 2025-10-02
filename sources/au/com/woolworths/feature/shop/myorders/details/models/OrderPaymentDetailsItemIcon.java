package au.com.woolworths.feature.shop.myorders.details.models;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/models/OrderPaymentDetailsItemIcon;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OrderPaymentDetailsItemIcon {
    public static final OrderPaymentDetailsItemIcon d;
    public static final OrderPaymentDetailsItemIcon e;
    public static final OrderPaymentDetailsItemIcon f;
    public static final OrderPaymentDetailsItemIcon g;
    public static final OrderPaymentDetailsItemIcon h;
    public static final OrderPaymentDetailsItemIcon i;
    public static final OrderPaymentDetailsItemIcon j;
    public static final OrderPaymentDetailsItemIcon k;
    public static final OrderPaymentDetailsItemIcon l;
    public static final OrderPaymentDetailsItemIcon m;
    public static final OrderPaymentDetailsItemIcon n;
    public static final /* synthetic */ OrderPaymentDetailsItemIcon[] o;
    public static final /* synthetic */ EnumEntries p;

    static {
        OrderPaymentDetailsItemIcon orderPaymentDetailsItemIcon = new OrderPaymentDetailsItemIcon("CREDIT_CARD", 0);
        d = orderPaymentDetailsItemIcon;
        OrderPaymentDetailsItemIcon orderPaymentDetailsItemIcon2 = new OrderPaymentDetailsItemIcon("GIFT_CARD", 1);
        e = orderPaymentDetailsItemIcon2;
        OrderPaymentDetailsItemIcon orderPaymentDetailsItemIcon3 = new OrderPaymentDetailsItemIcon("PAYPAL", 2);
        f = orderPaymentDetailsItemIcon3;
        OrderPaymentDetailsItemIcon orderPaymentDetailsItemIcon4 = new OrderPaymentDetailsItemIcon("STORE_CREDIT", 3);
        g = orderPaymentDetailsItemIcon4;
        OrderPaymentDetailsItemIcon orderPaymentDetailsItemIcon5 = new OrderPaymentDetailsItemIcon("REWARDS", 4);
        h = orderPaymentDetailsItemIcon5;
        OrderPaymentDetailsItemIcon orderPaymentDetailsItemIcon6 = new OrderPaymentDetailsItemIcon("COUPON", 5);
        i = orderPaymentDetailsItemIcon6;
        OrderPaymentDetailsItemIcon orderPaymentDetailsItemIcon7 = new OrderPaymentDetailsItemIcon("ACCOUNT", 6);
        j = orderPaymentDetailsItemIcon7;
        OrderPaymentDetailsItemIcon orderPaymentDetailsItemIcon8 = new OrderPaymentDetailsItemIcon("E_VOUCHER", 7);
        k = orderPaymentDetailsItemIcon8;
        OrderPaymentDetailsItemIcon orderPaymentDetailsItemIcon9 = new OrderPaymentDetailsItemIcon("APPLE_PAY", 8);
        l = orderPaymentDetailsItemIcon9;
        OrderPaymentDetailsItemIcon orderPaymentDetailsItemIcon10 = new OrderPaymentDetailsItemIcon("GOOGLE_PAY", 9);
        m = orderPaymentDetailsItemIcon10;
        OrderPaymentDetailsItemIcon orderPaymentDetailsItemIcon11 = new OrderPaymentDetailsItemIcon("UNKNOWN", 10);
        n = orderPaymentDetailsItemIcon11;
        OrderPaymentDetailsItemIcon[] orderPaymentDetailsItemIconArr = {orderPaymentDetailsItemIcon, orderPaymentDetailsItemIcon2, orderPaymentDetailsItemIcon3, orderPaymentDetailsItemIcon4, orderPaymentDetailsItemIcon5, orderPaymentDetailsItemIcon6, orderPaymentDetailsItemIcon7, orderPaymentDetailsItemIcon8, orderPaymentDetailsItemIcon9, orderPaymentDetailsItemIcon10, orderPaymentDetailsItemIcon11};
        o = orderPaymentDetailsItemIconArr;
        p = EnumEntriesKt.a(orderPaymentDetailsItemIconArr);
    }

    public static OrderPaymentDetailsItemIcon valueOf(String str) {
        return (OrderPaymentDetailsItemIcon) Enum.valueOf(OrderPaymentDetailsItemIcon.class, str);
    }

    public static OrderPaymentDetailsItemIcon[] values() {
        return (OrderPaymentDetailsItemIcon[]) o.clone();
    }
}
