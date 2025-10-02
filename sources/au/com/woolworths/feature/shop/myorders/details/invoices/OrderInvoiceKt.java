package au.com.woolworths.feature.shop.myorders.details.invoices;

import com.woolworths.feature.shop.myorders.GetOrderInvoiceQuery;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"my-orders_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OrderInvoiceKt {
    public static final OrderInvoice a(GetOrderInvoiceQuery.OrderInvoice orderInvoice) {
        GetOrderInvoiceQuery.OnOrderInvoiceDetail onOrderInvoiceDetail = orderInvoice.b;
        if (onOrderInvoiceDetail != null) {
            return new OrderInvoiceDetail(onOrderInvoiceDetail.f19860a);
        }
        GetOrderInvoiceQuery.OnOrderInvoiceError onOrderInvoiceError = orderInvoice.c;
        if (onOrderInvoiceError == null) {
            throw new IllegalStateException("It's neither detail nor error. Check with BFF");
        }
        String str = onOrderInvoiceError.f19861a;
        int iOrdinal = onOrderInvoiceError.b.ordinal();
        OrderInvoiceErrorReason orderInvoiceErrorReason = (iOrdinal == 0 || iOrdinal != 1) ? OrderInvoiceErrorReason.d : OrderInvoiceErrorReason.e;
        return new OrderInvoiceError(str, orderInvoiceErrorReason);
    }
}
