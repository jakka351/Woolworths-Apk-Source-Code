package au.com.woolworths.shop.product.details;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.product.details.ProductDetailsPageInteractorImpl", f = "ProductDetailsPageInteractor.kt", l = {113}, m = "fetchAndCacheProductDetailsPage")
/* loaded from: classes4.dex */
final class ProductDetailsPageInteractorImpl$fetchAndCacheProductDetailsPage$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ ProductDetailsPageInteractorImpl q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductDetailsPageInteractorImpl$fetchAndCacheProductDetailsPage$1(ProductDetailsPageInteractorImpl productDetailsPageInteractorImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = productDetailsPageInteractorImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.d(null, null, this);
    }
}
