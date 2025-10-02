package au.com.woolworths.feature.product.list;

import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.product.list.ProductListInteractor", f = "ProductListInteractor.kt", l = {303, 327, 346}, m = "fetchProductListOnSpecialByCategory")
/* loaded from: classes3.dex */
final class ProductListInteractor$fetchProductListOnSpecialByCategory$1 extends ContinuationImpl {
    public Object p;
    public Object q;
    public Object r;
    public Map s;
    public Ref.ObjectRef t;
    public Ref.ObjectRef u;
    public boolean v;
    public /* synthetic */ Object w;
    public final /* synthetic */ ProductListInteractor x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductListInteractor$fetchProductListOnSpecialByCategory$1(ProductListInteractor productListInteractor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.x = productListInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= Integer.MIN_VALUE;
        return this.x.w(null, null, null, null, null, null, null, false, this);
    }
}
