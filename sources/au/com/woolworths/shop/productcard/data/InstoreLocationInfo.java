package au.com.woolworths.shop.productcard.data;

import au.com.woolworths.product.models.InStoreAvailabilityInfo;
import au.com.woolworths.product.models.InStoreLocationData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/productcard/data/InstoreLocationInfo;", "", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class InstoreLocationInfo {

    /* renamed from: a, reason: collision with root package name */
    public final InStoreLocationData f12651a;
    public final InStoreAvailabilityInfo b;

    public InstoreLocationInfo(InStoreLocationData inStoreLocationData, InStoreAvailabilityInfo inStoreAvailabilityInfo) {
        this.f12651a = inStoreLocationData;
        this.b = inStoreAvailabilityInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstoreLocationInfo)) {
            return false;
        }
        InstoreLocationInfo instoreLocationInfo = (InstoreLocationInfo) obj;
        return Intrinsics.c(this.f12651a, instoreLocationInfo.f12651a) && Intrinsics.c(this.b, instoreLocationInfo.b);
    }

    public final int hashCode() {
        InStoreLocationData inStoreLocationData = this.f12651a;
        int iHashCode = (inStoreLocationData == null ? 0 : inStoreLocationData.hashCode()) * 31;
        InStoreAvailabilityInfo inStoreAvailabilityInfo = this.b;
        return iHashCode + (inStoreAvailabilityInfo != null ? inStoreAvailabilityInfo.hashCode() : 0);
    }

    public final String toString() {
        return "InstoreLocationInfo(location=" + this.f12651a + ", availability=" + this.b + ")";
    }
}
