package au.com.woolworths.feature.shop.myorders.details.invoices;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/invoices/OrderInvoiceErrorReason;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OrderInvoiceErrorReason {
    public static final OrderInvoiceErrorReason d;
    public static final OrderInvoiceErrorReason e;
    public static final /* synthetic */ OrderInvoiceErrorReason[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        OrderInvoiceErrorReason orderInvoiceErrorReason = new OrderInvoiceErrorReason("UNSPECIFIED", 0);
        d = orderInvoiceErrorReason;
        OrderInvoiceErrorReason orderInvoiceErrorReason2 = new OrderInvoiceErrorReason("UNAVAILABLE", 1);
        e = orderInvoiceErrorReason2;
        OrderInvoiceErrorReason[] orderInvoiceErrorReasonArr = {orderInvoiceErrorReason, orderInvoiceErrorReason2};
        f = orderInvoiceErrorReasonArr;
        g = EnumEntriesKt.a(orderInvoiceErrorReasonArr);
    }

    public static OrderInvoiceErrorReason valueOf(String str) {
        return (OrderInvoiceErrorReason) Enum.valueOf(OrderInvoiceErrorReason.class, str);
    }

    public static OrderInvoiceErrorReason[] values() {
        return (OrderInvoiceErrorReason[]) f.clone();
    }
}
