package au.com.woolworths.feature.shop.myorders.details.models;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import java.util.ArrayList;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/models/PastPickupOrderFulfilmentDetails;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PastPickupOrderFulfilmentDetails {

    /* renamed from: a, reason: collision with root package name */
    public final String f7772a;
    public final ArrayList b;

    public PastPickupOrderFulfilmentDetails(String str, ArrayList arrayList) {
        this.f7772a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PastPickupOrderFulfilmentDetails)) {
            return false;
        }
        PastPickupOrderFulfilmentDetails pastPickupOrderFulfilmentDetails = (PastPickupOrderFulfilmentDetails) obj;
        return this.f7772a.equals(pastPickupOrderFulfilmentDetails.f7772a) && this.b.equals(pastPickupOrderFulfilmentDetails.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f7772a.hashCode() * 31);
    }

    public final String toString() {
        return d.q("PastPickupOrderFulfilmentDetails(title=", this.f7772a, ", items=", ")", this.b);
    }
}
