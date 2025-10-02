package au.com.woolworths.shop.graphql.type;

import com.apollographql.apollo.api.Optional;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/WriteReviewFormInput;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class WriteReviewFormInput {

    /* renamed from: a, reason: collision with root package name */
    public final String f12019a;
    public final Optional b;

    public WriteReviewFormInput(Optional optional, String productId) {
        Intrinsics.h(productId, "productId");
        this.f12019a = productId;
        this.b = optional;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WriteReviewFormInput)) {
            return false;
        }
        WriteReviewFormInput writeReviewFormInput = (WriteReviewFormInput) obj;
        return Intrinsics.c(this.f12019a, writeReviewFormInput.f12019a) && Intrinsics.c(this.b, writeReviewFormInput.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f12019a.hashCode() * 31);
    }

    public final String toString() {
        return "WriteReviewFormInput(productId=" + this.f12019a + ", storeId=" + this.b + ")";
    }
}
