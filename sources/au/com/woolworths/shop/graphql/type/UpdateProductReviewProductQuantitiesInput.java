package au.com.woolworths.shop.graphql.type;

import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/UpdateProductReviewProductQuantitiesInput;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UpdateProductReviewProductQuantitiesInput {

    /* renamed from: a, reason: collision with root package name */
    public final ProductReviewSource f11998a;
    public final ArrayList b;

    public UpdateProductReviewProductQuantitiesInput(ProductReviewSource productReviewSource, ArrayList arrayList) {
        this.f11998a = productReviewSource;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateProductReviewProductQuantitiesInput)) {
            return false;
        }
        UpdateProductReviewProductQuantitiesInput updateProductReviewProductQuantitiesInput = (UpdateProductReviewProductQuantitiesInput) obj;
        return this.f11998a == updateProductReviewProductQuantitiesInput.f11998a && this.b.equals(updateProductReviewProductQuantitiesInput.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f11998a.hashCode() * 31);
    }

    public final String toString() {
        return "UpdateProductReviewProductQuantitiesInput(source=" + this.f11998a + ", productReviewProductQuantityUpdates=" + this.b + ")";
    }
}
