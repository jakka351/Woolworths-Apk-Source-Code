package au.com.woolworths.feature.product.list;

import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.product.list.ProductListInteractor", f = "ProductListInteractor.kt", l = {674, 701, 717}, m = "fetchProductListBySearchAlternative")
/* loaded from: classes3.dex */
final class ProductListInteractor$fetchProductListBySearchAlternative$1 extends ContinuationImpl {
    public Object p;
    public Object q;
    public Object r;
    public Map s;
    public Ref.ObjectRef t;
    public Ref.ObjectRef u;
    public /* synthetic */ Object v;
    public final /* synthetic */ ProductListInteractor w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductListInteractor$fetchProductListBySearchAlternative$1(ProductListInteractor productListInteractor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.w = productListInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return this.w.t(null, null, null, null, null, null, null, null, this);
    }
}
