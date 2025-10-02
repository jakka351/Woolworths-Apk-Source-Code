package au.com.woolworths.feature.product.list.v2;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.product.list.v2.ProductListPaginationAdapter", f = "ProductListPaginationAdapter.kt", l = {50}, m = "load")
/* loaded from: classes3.dex */
final class ProductListPaginationAdapter$load$1 extends ContinuationImpl {
    public Integer p;
    public a q;
    public /* synthetic */ Object r;
    public final /* synthetic */ ProductListPaginationAdapter s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductListPaginationAdapter$load$1(ProductListPaginationAdapter productListPaginationAdapter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.s = productListPaginationAdapter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.a(null, null, null, null, this);
    }
}
