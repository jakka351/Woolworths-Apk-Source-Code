package au.com.woolworths.feature.product.list;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.product.list.ProductListInteractor", f = "ProductListInteractor.kt", l = {1057}, m = "buildProductListSource")
/* loaded from: classes3.dex */
final class ProductListInteractor$buildProductListSource$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ ProductListInteractor q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductListInteractor$buildProductListSource$1(ProductListInteractor productListInteractor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = productListInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(false, null, this);
    }
}
