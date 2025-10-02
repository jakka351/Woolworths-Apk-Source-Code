package au.com.woolworths.shop.cart.data.mapper;

import au.com.woolworths.graphql.common.fragment.ProductReviewResponse;
import au.com.woolworths.shop.cart.domain.model.ProductReviewErrorType;
import au.com.woolworths.shop.cart.domain.model.ProductReviewResult;
import com.woolworths.shop.cart.UpdateProductReviewProductQuantitiesMutation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-cart_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductReviewResponseMapperKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    public static final ProductReviewResult a(UpdateProductReviewProductQuantitiesMutation.OnProductReviewResult onProductReviewResult) {
        UpdateProductReviewProductQuantitiesMutation.OnProductReviewEmpty onProductReviewEmpty = onProductReviewResult.c;
        if (onProductReviewEmpty != null) {
            return new ProductReviewResult.Empty(onProductReviewEmpty.f21577a);
        }
        UpdateProductReviewProductQuantitiesMutation.OnProductReviewError onProductReviewError = onProductReviewResult.b;
        ?? arrayList = 0;
        if (onProductReviewError == null) {
            ProductReviewResponse productReviewResponse = onProductReviewResult.d;
            if (productReviewResponse != null) {
                return ProductReviewResponseExtKt.a(productReviewResponse);
            }
            return null;
        }
        List list = onProductReviewError.f21578a;
        if (list != null) {
            arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                UpdateProductReviewProductQuantitiesMutation.OnUpdateProductReviewProductQuantitiesError onUpdateProductReviewProductQuantitiesError = ((UpdateProductReviewProductQuantitiesMutation.Error) it.next()).b;
                arrayList.add(new ProductReviewErrorType.UpdateProductQuantitiesError(onUpdateProductReviewProductQuantitiesError.f21580a, onUpdateProductReviewProductQuantitiesError.b));
            }
        }
        if (arrayList == 0) {
            arrayList = EmptyList.d;
        }
        return new ProductReviewResult.Error(arrayList);
    }
}
