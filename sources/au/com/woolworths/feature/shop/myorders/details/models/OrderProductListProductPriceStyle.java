package au.com.woolworths.feature.shop.myorders.details.models;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/models/OrderProductListProductPriceStyle;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OrderProductListProductPriceStyle {
    public static final OrderProductListProductPriceStyle d;
    public static final OrderProductListProductPriceStyle e;
    public static final /* synthetic */ OrderProductListProductPriceStyle[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        OrderProductListProductPriceStyle orderProductListProductPriceStyle = new OrderProductListProductPriceStyle("PLAIN", 0);
        d = orderProductListProductPriceStyle;
        OrderProductListProductPriceStyle orderProductListProductPriceStyle2 = new OrderProductListProductPriceStyle("ALWAYS", 1);
        e = orderProductListProductPriceStyle2;
        OrderProductListProductPriceStyle[] orderProductListProductPriceStyleArr = {orderProductListProductPriceStyle, orderProductListProductPriceStyle2};
        f = orderProductListProductPriceStyleArr;
        g = EnumEntriesKt.a(orderProductListProductPriceStyleArr);
    }

    public static OrderProductListProductPriceStyle valueOf(String str) {
        return (OrderProductListProductPriceStyle) Enum.valueOf(OrderProductListProductPriceStyle.class, str);
    }

    public static OrderProductListProductPriceStyle[] values() {
        return (OrderProductListProductPriceStyle[]) f.clone();
    }
}
