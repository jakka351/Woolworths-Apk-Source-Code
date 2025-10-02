package au.com.woolworths.shop.graphql.type;

import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import com.apollographql.apollo.api.Optional;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/ProductRatingsAndReviewsDetailsInput;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductRatingsAndReviewsDetailsInput {

    /* renamed from: a, reason: collision with root package name */
    public final String f11764a;
    public final Optional.Present b;
    public final Optional.Present c;
    public final Optional.Present d;
    public final Optional.Present e;

    public ProductRatingsAndReviewsDetailsInput(String productId, Optional.Present present, Optional.Present present2, Optional.Present present3, Optional.Present present4) {
        Intrinsics.h(productId, "productId");
        this.f11764a = productId;
        this.b = present;
        this.c = present2;
        this.d = present3;
        this.e = present4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductRatingsAndReviewsDetailsInput)) {
            return false;
        }
        ProductRatingsAndReviewsDetailsInput productRatingsAndReviewsDetailsInput = (ProductRatingsAndReviewsDetailsInput) obj;
        return Intrinsics.c(this.f11764a, productRatingsAndReviewsDetailsInput.f11764a) && this.b.equals(productRatingsAndReviewsDetailsInput.b) && this.c.equals(productRatingsAndReviewsDetailsInput.c) && this.d.equals(productRatingsAndReviewsDetailsInput.d) && this.e.equals(productRatingsAndReviewsDetailsInput.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + a.b(this.d, a.b(this.c, a.b(this.b, this.f11764a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        return "ProductRatingsAndReviewsDetailsInput(productId=" + this.f11764a + ", sortOption=" + this.b + ", pageSize=" + this.c + ", pageNumber=" + this.d + ", supportedLinks=" + this.e + ")";
    }
}
