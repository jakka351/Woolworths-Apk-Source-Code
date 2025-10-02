package au.com.woolworths.feature.product.list;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.product.list.ProductsListRepository", f = "ProductsListRepository.kt", l = {259}, m = "fetchProductListByBoostedOffers")
/* loaded from: classes3.dex */
final class ProductsListRepository$fetchProductListByBoostedOffers$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ ProductsListRepository q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductsListRepository$fetchProductListByBoostedOffers$1(ProductsListRepository productsListRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = productsListRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.b(null, null, null, this);
    }
}
