package au.com.woolworths.shop.cart.domain.interactor;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/domain/interactor/CartProductQuantitiesBoostResult;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CartProductQuantitiesBoostResult {

    /* renamed from: a, reason: collision with root package name */
    public final Object f10426a;
    public final Result b;

    public CartProductQuantitiesBoostResult(Object obj, Result result) {
        this.f10426a = obj;
        this.b = result;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CartProductQuantitiesBoostResult)) {
            return false;
        }
        CartProductQuantitiesBoostResult cartProductQuantitiesBoostResult = (CartProductQuantitiesBoostResult) obj;
        return Intrinsics.c(this.f10426a, cartProductQuantitiesBoostResult.f10426a) && Intrinsics.c(this.b, cartProductQuantitiesBoostResult.b);
    }

    public final int hashCode() {
        Object obj;
        int iHashCode = 0;
        Object obj2 = this.f10426a;
        int iHashCode2 = (obj2 == null ? 0 : obj2.hashCode()) * 31;
        Result result = this.b;
        if (result != null && (obj = result.d) != null) {
            iHashCode = obj.hashCode();
        }
        return iHashCode2 + iHashCode;
    }

    public final String toString() {
        return "CartProductQuantitiesBoostResult(quantitiesUpdatedResult=" + Result.b(this.f10426a) + ", boostResult=" + this.b + ")";
    }
}
