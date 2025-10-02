package au.com.woolworths.shop.graphql.type;

import YU.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/ProductReviewAlternativeInput;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductReviewAlternativeInput {

    /* renamed from: a, reason: collision with root package name */
    public final String f11770a;

    public ProductReviewAlternativeInput(String productId) {
        Intrinsics.h(productId, "productId");
        this.f11770a = productId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProductReviewAlternativeInput) && Intrinsics.c(this.f11770a, ((ProductReviewAlternativeInput) obj).f11770a);
    }

    public final int hashCode() {
        return this.f11770a.hashCode();
    }

    public final String toString() {
        return a.h("ProductReviewAlternativeInput(productId=", this.f11770a, ")");
    }
}
