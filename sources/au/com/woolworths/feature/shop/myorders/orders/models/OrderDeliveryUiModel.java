package au.com.woolworths.feature.shop.myorders.orders.models;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.myorders.orders.data.DeliveryOrder;
import au.com.woolworths.feature.shop.myorders.orders.list.OrderListItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/orders/models/OrderDeliveryUiModel;", "Lau/com/woolworths/feature/shop/myorders/orders/list/OrderListItem;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OrderDeliveryUiModel implements OrderListItem {

    /* renamed from: a, reason: collision with root package name */
    public final DeliveryOrder f7880a;

    public OrderDeliveryUiModel(DeliveryOrder deliveryOrder) {
        this.f7880a = deliveryOrder;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OrderDeliveryUiModel) && Intrinsics.c(this.f7880a, ((OrderDeliveryUiModel) obj).f7880a);
    }

    public final int hashCode() {
        return this.f7880a.hashCode();
    }

    public final String toString() {
        return "OrderDeliveryUiModel(apiData=" + this.f7880a + ")";
    }
}
