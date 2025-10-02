package au.com.woolworths.shop.product.details;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.product.details.ProductDetailsPageRepository", f = "ProductDetailsPageRepository.kt", l = {63}, m = "fetchProductDetailsPage")
/* loaded from: classes4.dex */
final class ProductDetailsPageRepository$fetchProductDetailsPage$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ ProductDetailsPageRepository q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductDetailsPageRepository$fetchProductDetailsPage$1(ProductDetailsPageRepository productDetailsPageRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = productDetailsPageRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.b(null, false, this);
    }
}
