package au.com.woolworths.feature.shop.myorders.details.models;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/models/PickupCheckInResponse;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PickupCheckInResponse {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7773a;
    public final String b;
    public final String c;

    public PickupCheckInResponse(boolean z, String str, String str2) {
        this.f7773a = z;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PickupCheckInResponse)) {
            return false;
        }
        PickupCheckInResponse pickupCheckInResponse = (PickupCheckInResponse) obj;
        return this.f7773a == pickupCheckInResponse.f7773a && Intrinsics.c(this.b, pickupCheckInResponse.b) && Intrinsics.c(this.c, pickupCheckInResponse.c);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f7773a) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return a.o(au.com.woolworths.android.onesite.a.t("PickupCheckInResponse(success=", ", message=", this.b, ", reason=", this.f7773a), this.c, ")");
    }
}
