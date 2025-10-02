package au.com.woolworths.shop.cart.domain.interactor;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.cart.domain.interactor.ProductReviewAlternativeFetchPage", f = "ProductReviewAlternativeFetchPage.kt", l = {22}, m = "invoke")
/* loaded from: classes4.dex */
final class ProductReviewAlternativeFetchPage$invoke$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ ProductReviewAlternativeFetchPage q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductReviewAlternativeFetchPage$invoke$1(ProductReviewAlternativeFetchPage productReviewAlternativeFetchPage, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = productReviewAlternativeFetchPage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(null, this);
    }
}
