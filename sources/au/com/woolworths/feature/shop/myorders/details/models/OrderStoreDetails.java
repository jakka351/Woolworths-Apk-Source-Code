package au.com.woolworths.feature.shop.myorders.details.models;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/models/OrderStoreDetails;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OrderStoreDetails {

    /* renamed from: a, reason: collision with root package name */
    public final String f7769a;
    public final String b;
    public final String c;

    public OrderStoreDetails(String str, String str2, String str3) {
        this.f7769a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderStoreDetails)) {
            return false;
        }
        OrderStoreDetails orderStoreDetails = (OrderStoreDetails) obj;
        return Intrinsics.c(this.f7769a, orderStoreDetails.f7769a) && Intrinsics.c(this.b, orderStoreDetails.b) && Intrinsics.c(this.c, orderStoreDetails.c);
    }

    public final int hashCode() {
        int iC = b.c(this.f7769a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return a.o(a.v("OrderStoreDetails(storeName=", this.f7769a, ", storeAddress=", this.b, ", actionPath="), this.c, ")");
    }
}
