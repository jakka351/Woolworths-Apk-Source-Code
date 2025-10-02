package au.com.woolworths.shop.cart.data;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.cart.data.ProductReviewAlternativeDataRepository", f = "ProductReviewAlternativeDataRepository.kt", l = {34}, m = "fetchPage")
/* loaded from: classes4.dex */
final class ProductReviewAlternativeDataRepository$fetchPage$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ ProductReviewAlternativeDataRepository q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductReviewAlternativeDataRepository$fetchPage$1(ProductReviewAlternativeDataRepository productReviewAlternativeDataRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = productReviewAlternativeDataRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(false, null, this);
    }
}
