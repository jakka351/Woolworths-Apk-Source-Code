package au.com.woolworths.feature.product.list;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.product.list.ProductListPaginationAdapter", f = "ProductListPaginationAdapter.kt", l = {52, 64, 77, 92, 99, 108, 115, 126, 134, 140, 146, 152, 168}, m = "load")
/* loaded from: classes3.dex */
final class ProductListPaginationAdapter$load$1 extends ContinuationImpl {
    public Integer p;
    public /* synthetic */ Object q;
    public final /* synthetic */ ProductListPaginationAdapter r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductListPaginationAdapter$load$1(ProductListPaginationAdapter productListPaginationAdapter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = productListPaginationAdapter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.a(null, null, null, null, null, null, this);
    }
}
