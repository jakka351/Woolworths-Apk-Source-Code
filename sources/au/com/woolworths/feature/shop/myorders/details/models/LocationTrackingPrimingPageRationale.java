package au.com.woolworths.feature.shop.myorders.details.models;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/models/LocationTrackingPrimingPageRationale;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class LocationTrackingPrimingPageRationale {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7761a;
    public final LocationImage b;
    public final String c;

    public LocationTrackingPrimingPageRationale(boolean z, LocationImage locationImage, String str) {
        this.f7761a = z;
        this.b = locationImage;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationTrackingPrimingPageRationale)) {
            return false;
        }
        LocationTrackingPrimingPageRationale locationTrackingPrimingPageRationale = (LocationTrackingPrimingPageRationale) obj;
        return this.f7761a == locationTrackingPrimingPageRationale.f7761a && this.b == locationTrackingPrimingPageRationale.b && Intrinsics.c(this.c, locationTrackingPrimingPageRationale.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.f7761a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocationTrackingPrimingPageRationale(applyBackground=");
        sb.append(this.f7761a);
        sb.append(", image=");
        sb.append(this.b);
        sb.append(", textMd=");
        return a.o(sb, this.c, ")");
    }
}
