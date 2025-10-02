package au.com.woolworths.feature.product.list;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.product.list.ProductListInteractor", f = "ProductListInteractor.kt", l = {619, 643, 656}, m = "fetchFirstPageProductListBySearchAlternative")
/* loaded from: classes3.dex */
final class ProductListInteractor$fetchFirstPageProductListBySearchAlternative$1 extends ContinuationImpl {
    public Object p;
    public Ref.ObjectRef q;
    public Ref.ObjectRef r;
    public /* synthetic */ Object s;
    public final /* synthetic */ ProductListInteractor t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductListInteractor$fetchFirstPageProductListBySearchAlternative$1(ProductListInteractor productListInteractor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.t = productListInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.e(null, null, null, this);
    }
}
