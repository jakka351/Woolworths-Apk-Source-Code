package au.com.woolworths.foundation.rewards.cart.info.domain.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/cart/info/domain/model/CartInfoResponse;", "", "cart-info_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CartInfoResponse {

    /* renamed from: a, reason: collision with root package name */
    public final int f8552a;
    public final String b;

    public CartInfoResponse(int i, String str) {
        this.f8552a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CartInfoResponse)) {
            return false;
        }
        CartInfoResponse cartInfoResponse = (CartInfoResponse) obj;
        return this.f8552a == cartInfoResponse.f8552a && Intrinsics.c(this.b, cartInfoResponse.b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f8552a) * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "CartInfoResponse(totalQuantity=" + this.f8552a + ", altText=" + this.b + ")";
    }
}
