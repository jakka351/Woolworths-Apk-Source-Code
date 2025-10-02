package au.com.woolworths.shop.graphql.type;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/ProductReviewInput;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductReviewInput {

    /* renamed from: a, reason: collision with root package name */
    public final ProductReviewSource f11777a;

    public ProductReviewInput(ProductReviewSource productReviewSource) {
        this.f11777a = productReviewSource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProductReviewInput) && this.f11777a == ((ProductReviewInput) obj).f11777a;
    }

    public final int hashCode() {
        return this.f11777a.hashCode();
    }

    public final String toString() {
        return "ProductReviewInput(source=" + this.f11777a + ")";
    }
}
