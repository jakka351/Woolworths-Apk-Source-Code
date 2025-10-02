package au.com.woolworths.shop.lists.data.database;

import androidx.room.Dao;
import au.com.woolworths.product.models.ProductId;
import au.com.woolworths.shop.lists.data.entity.ProductListItemEntity;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;

@Dao
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/lists/data/database/ProductListItemDao;", "", "Companion", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public interface ProductListItemDao {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/data/database/ProductListItemDao$Companion;", "", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
    }

    Object a(Continuation continuation);

    Object b(String str, ContinuationImpl continuationImpl);

    Object c(Continuation continuation);

    Flow d(String str);

    Object e(String str, SuspendLambda suspendLambda);

    Object f(ContinuationImpl continuationImpl);

    Object g(ProductListItemEntity productListItemEntity, ContinuationImpl continuationImpl);

    Object h(String str, Continuation continuation);

    Object i(String str, ProductId productId, SuspendLambda suspendLambda);

    Object j(ProductListItemEntity productListItemEntity, SuspendLambda suspendLambda);

    Object k(ProductListItemEntity productListItemEntity, ContinuationImpl continuationImpl);
}
