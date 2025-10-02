package au.com.woolworths.feature.shop.myorders.details.invoices;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/invoices/OrderInvoiceDetail;", "Lau/com/woolworths/feature/shop/myorders/details/invoices/OrderInvoice;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OrderInvoiceDetail implements OrderInvoice {

    /* renamed from: a, reason: collision with root package name */
    public final String f7739a;

    public OrderInvoiceDetail(String str) {
        this.f7739a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OrderInvoiceDetail) && Intrinsics.c(this.f7739a, ((OrderInvoiceDetail) obj).f7739a);
    }

    public final int hashCode() {
        return this.f7739a.hashCode();
    }

    public final String toString() {
        return a.h("OrderInvoiceDetail(url=", this.f7739a, ")");
    }
}
