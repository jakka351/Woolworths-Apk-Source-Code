package au.com.woolworths.feature.product.list.legacy;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.product.list.legacy.ProductListInteractor", f = "ProductListInteractor.kt", l = {606, 631}, m = "fetchFirstPageProductGroup")
/* loaded from: classes3.dex */
final class ProductListInteractor$fetchFirstPageProductGroup$1 extends ContinuationImpl {
    public Object p;
    public boolean q;
    public /* synthetic */ Object r;
    public final /* synthetic */ ProductListInteractor s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductListInteractor$fetchFirstPageProductGroup$1(ProductListInteractor productListInteractor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.s = productListInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.c(null, null, null, false, null, this);
    }
}
