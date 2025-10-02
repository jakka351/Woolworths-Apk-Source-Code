package au.com.woolworths.shop.cart.domain.interactor;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.cart.domain.interactor.ProductReviewUpdateQuantityProduct", f = "ProductReviewUpdateQuantityProduct.kt", l = {24}, m = "invoke")
/* loaded from: classes4.dex */
final class ProductReviewUpdateQuantityProduct$invoke$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ ProductReviewUpdateQuantityProduct q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductReviewUpdateQuantityProduct$invoke$1(ProductReviewUpdateQuantityProduct productReviewUpdateQuantityProduct, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = productReviewUpdateQuantityProduct;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(null, null, this);
    }
}
