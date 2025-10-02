package au.com.woolworths.feature.shop.myorders.details.models;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/models/OrderNumberDetails;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OrderNumberDetails {

    /* renamed from: a, reason: collision with root package name */
    public final String f7766a;
    public final String b;

    public OrderNumberDetails(String str, String str2) {
        this.f7766a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderNumberDetails)) {
            return false;
        }
        OrderNumberDetails orderNumberDetails = (OrderNumberDetails) obj;
        return Intrinsics.c(this.f7766a, orderNumberDetails.f7766a) && Intrinsics.c(this.b, orderNumberDetails.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f7766a.hashCode() * 31);
    }

    public final String toString() {
        return a.j("OrderNumberDetails(title=", this.f7766a, ", orderNumber=", this.b, ")");
    }
}
