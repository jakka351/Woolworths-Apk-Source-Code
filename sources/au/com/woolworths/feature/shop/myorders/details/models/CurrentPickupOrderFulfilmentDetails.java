package au.com.woolworths.feature.shop.myorders.details.models;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/models/CurrentPickupOrderFulfilmentDetails;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CurrentPickupOrderFulfilmentDetails {

    /* renamed from: a, reason: collision with root package name */
    public final OrderStoreDetails f7750a;
    public final OrderCollectionDetails b;

    public CurrentPickupOrderFulfilmentDetails(OrderStoreDetails orderStoreDetails, OrderCollectionDetails orderCollectionDetails) {
        this.f7750a = orderStoreDetails;
        this.b = orderCollectionDetails;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CurrentPickupOrderFulfilmentDetails)) {
            return false;
        }
        CurrentPickupOrderFulfilmentDetails currentPickupOrderFulfilmentDetails = (CurrentPickupOrderFulfilmentDetails) obj;
        return Intrinsics.c(this.f7750a, currentPickupOrderFulfilmentDetails.f7750a) && Intrinsics.c(this.b, currentPickupOrderFulfilmentDetails.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f7750a.hashCode() * 31);
    }

    public final String toString() {
        return "CurrentPickupOrderFulfilmentDetails(storeDetails=" + this.f7750a + ", collectionDetails=" + this.b + ")";
    }
}
