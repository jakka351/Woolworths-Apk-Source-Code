package au.com.woolworths.feature.shop.myorders.details.invoices;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/invoices/OrderInvoiceError;", "Lau/com/woolworths/feature/shop/myorders/details/invoices/OrderInvoice;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OrderInvoiceError implements OrderInvoice {

    /* renamed from: a, reason: collision with root package name */
    public final String f7741a;
    public final OrderInvoiceErrorReason b;

    public OrderInvoiceError(String str, OrderInvoiceErrorReason orderInvoiceErrorReason) {
        this.f7741a = str;
        this.b = orderInvoiceErrorReason;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderInvoiceError)) {
            return false;
        }
        OrderInvoiceError orderInvoiceError = (OrderInvoiceError) obj;
        return Intrinsics.c(this.f7741a, orderInvoiceError.f7741a) && this.b == orderInvoiceError.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f7741a.hashCode() * 31);
    }

    public final String toString() {
        return "OrderInvoiceError(message=" + this.f7741a + ", reason=" + this.b + ")";
    }
}
