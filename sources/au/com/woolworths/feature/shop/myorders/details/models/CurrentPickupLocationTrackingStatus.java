package au.com.woolworths.feature.shop.myorders.details.models;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/models/CurrentPickupLocationTrackingStatus;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CurrentPickupLocationTrackingStatus {

    /* renamed from: a, reason: collision with root package name */
    public final String f7749a;
    public final String b;
    public final LocationTrackingStatusImage c;

    public CurrentPickupLocationTrackingStatus(String str, String str2, LocationTrackingStatusImage locationTrackingStatusImage) {
        this.f7749a = str;
        this.b = str2;
        this.c = locationTrackingStatusImage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CurrentPickupLocationTrackingStatus)) {
            return false;
        }
        CurrentPickupLocationTrackingStatus currentPickupLocationTrackingStatus = (CurrentPickupLocationTrackingStatus) obj;
        return Intrinsics.c(this.f7749a, currentPickupLocationTrackingStatus.f7749a) && Intrinsics.c(this.b, currentPickupLocationTrackingStatus.b) && this.c == currentPickupLocationTrackingStatus.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + b.c(this.f7749a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbV = a.v("CurrentPickupLocationTrackingStatus(title=", this.f7749a, ", description=", this.b, ", image=");
        sbV.append(this.c);
        sbV.append(")");
        return sbV.toString();
    }
}
