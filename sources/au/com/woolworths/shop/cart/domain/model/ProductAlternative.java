package au.com.woolworths.shop.cart.domain.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/domain/model/ProductAlternative;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductAlternative {

    /* renamed from: a, reason: collision with root package name */
    public final String f10440a;
    public final ProductReviewAlternativeType b;

    public ProductAlternative(String str, ProductReviewAlternativeType productReviewAlternativeType) {
        this.f10440a = str;
        this.b = productReviewAlternativeType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductAlternative)) {
            return false;
        }
        ProductAlternative productAlternative = (ProductAlternative) obj;
        return Intrinsics.c(this.f10440a, productAlternative.f10440a) && this.b == productAlternative.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f10440a.hashCode() * 31);
    }

    public final String toString() {
        return "ProductAlternative(title=" + this.f10440a + ", type=" + this.b + ")";
    }
}
