package au.com.woolworths.feature.product.list.legacy;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.product.list.legacy.ProductListInteractor", f = "ProductListInteractor.kt", l = {860}, m = "buildProductListSource")
/* loaded from: classes3.dex */
final class ProductListInteractor$buildProductListSource$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ ProductListInteractor q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductListInteractor$buildProductListSource$1(ProductListInteractor productListInteractor, Continuation continuation) {
        super(continuation);
        this.q = productListInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.b(false, null, this);
    }
}
