package au.com.woolworths.shop.lists.data.repository;

import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductId;
import au.com.woolworths.product.models.ProductListByProductIdsApiData;
import au.com.woolworths.shop.lists.data.entity.TextListItemEntity;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/lists/data/repository/ShoppingListItemsLocalRepository;", "", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ShoppingListItemsLocalRepository {
    void a(String str, ProductId productId);

    Object b(String str, Continuation continuation);

    Object c(ProductCard productCard, Continuation continuation);

    Object d(TextListItemEntity textListItemEntity, Function1 function1, ContinuationImpl continuationImpl);

    Object e(String str, Continuation continuation);

    Object f(ProductListByProductIdsApiData productListByProductIdsApiData, List list, Continuation continuation);

    Object g(List list, Continuation continuation);

    Object h(String str, ProductId productId, ProductCard productCard, float f, ContinuationImpl continuationImpl);

    void i(String str);

    Object j(String str, Continuation continuation);

    Object k(String str, Continuation continuation);

    Flow l(String str);

    Object m(String str, Continuation continuation);

    Object n(String str, boolean z, Continuation continuation);

    Flow o(String str);

    Object p(String str, ProductId productId, Function1 function1, ContinuationImpl continuationImpl);

    Object q(ProductId productId, Continuation continuation);

    Object r(boolean z, String str, ContinuationImpl continuationImpl);

    Object s(String str, Continuation continuation);

    Object t(Continuation continuation);
}
