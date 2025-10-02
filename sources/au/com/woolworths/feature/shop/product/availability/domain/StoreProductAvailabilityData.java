package au.com.woolworths.feature.shop.product.availability.domain;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/product/availability/domain/StoreProductAvailabilityData;", "", "product-availability_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class StoreProductAvailabilityData {

    /* renamed from: a, reason: collision with root package name */
    public final String f7995a;
    public final String b;
    public final String c;
    public final GeoData d;
    public final boolean e;

    public StoreProductAvailabilityData(String str, String str2, String str3, GeoData geoData, boolean z) {
        this.f7995a = str;
        this.b = str2;
        this.c = str3;
        this.d = geoData;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreProductAvailabilityData)) {
            return false;
        }
        StoreProductAvailabilityData storeProductAvailabilityData = (StoreProductAvailabilityData) obj;
        return Intrinsics.c(this.f7995a, storeProductAvailabilityData.f7995a) && Intrinsics.c(this.b, storeProductAvailabilityData.b) && Intrinsics.c(this.c, storeProductAvailabilityData.c) && Intrinsics.c(this.d, storeProductAvailabilityData.d) && this.e == storeProductAvailabilityData.e;
    }

    public final int hashCode() {
        int iC = b.c(b.c(this.f7995a.hashCode() * 31, 31, this.b), 31, this.c);
        GeoData geoData = this.d;
        return Boolean.hashCode(this.e) + ((iC + (geoData == null ? 0 : geoData.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbV = a.v("StoreProductAvailabilityData(storeId=", this.f7995a, ", name=", this.b, ", address=");
        sbV.append(this.c);
        sbV.append(", geo=");
        sbV.append(this.d);
        sbV.append(", isProductAvailable=");
        return a.k(")", sbV, this.e);
    }
}
