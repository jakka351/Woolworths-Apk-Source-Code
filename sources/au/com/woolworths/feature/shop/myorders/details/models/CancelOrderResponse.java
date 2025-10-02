package au.com.woolworths.feature.shop.myorders.details.models;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/models/CancelOrderResponse;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CancelOrderResponse {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7745a;
    public final String b;
    public final CancelOrderReason c;

    public CancelOrderResponse(boolean z, String str, CancelOrderReason cancelOrderReason) {
        this.f7745a = z;
        this.b = str;
        this.c = cancelOrderReason;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CancelOrderResponse)) {
            return false;
        }
        CancelOrderResponse cancelOrderResponse = (CancelOrderResponse) obj;
        return this.f7745a == cancelOrderResponse.f7745a && Intrinsics.c(this.b, cancelOrderResponse.b) && this.c == cancelOrderResponse.c;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f7745a) * 961;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        CancelOrderReason cancelOrderReason = this.c;
        return iHashCode2 + (cancelOrderReason != null ? cancelOrderReason.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbT = a.t("CancelOrderResponse(success=", ", title=null, message=", this.b, ", reason=", this.f7745a);
        sbT.append(this.c);
        sbT.append(")");
        return sbT.toString();
    }
}
