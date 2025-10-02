package au.com.woolworths.shop.graphql.type;

import com.apollographql.apollo.api.Optional;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/ProductRatingsAndReviewsPreviewInput;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductRatingsAndReviewsPreviewInput {

    /* renamed from: a, reason: collision with root package name */
    public final String f11765a;
    public final Optional.Present b;

    public ProductRatingsAndReviewsPreviewInput(String str, Optional.Present present) {
        this.f11765a = str;
        this.b = present;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductRatingsAndReviewsPreviewInput)) {
            return false;
        }
        ProductRatingsAndReviewsPreviewInput productRatingsAndReviewsPreviewInput = (ProductRatingsAndReviewsPreviewInput) obj;
        return this.f11765a.equals(productRatingsAndReviewsPreviewInput.f11765a) && this.b.equals(productRatingsAndReviewsPreviewInput.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f11765a.hashCode() * 31);
    }

    public final String toString() {
        return "ProductRatingsAndReviewsPreviewInput(productId=" + this.f11765a + ", supportedLinks=" + this.b + ")";
    }
}
