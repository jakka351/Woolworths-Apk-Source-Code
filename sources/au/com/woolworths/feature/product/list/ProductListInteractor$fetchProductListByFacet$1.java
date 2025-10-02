package au.com.woolworths.feature.product.list;

import au.com.woolworths.feature.product.list.data.ProductListData;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.product.list.ProductListInteractor", f = "ProductListInteractor.kt", l = {931}, m = "fetchProductListByFacet")
/* loaded from: classes3.dex */
final class ProductListInteractor$fetchProductListByFacet$1 extends ContinuationImpl {
    public ProductListData p;
    public /* synthetic */ Object q;
    public final /* synthetic */ ProductListInteractor r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductListInteractor$fetchProductListByFacet$1(ProductListInteractor productListInteractor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = productListInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.j(null, null, null, null, null, null, null, null, this);
    }
}
