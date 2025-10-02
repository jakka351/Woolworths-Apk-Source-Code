package au.com.woolworths.product.offers;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.product.offers.ProductBoostRepository", f = "ProductBoostRepository.kt", l = {24}, m = "boostTagProductOffers$shop_product_release")
/* loaded from: classes4.dex */
final class ProductBoostRepository$boostTagProductOffers$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ ProductBoostRepository q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductBoostRepository$boostTagProductOffers$1(ProductBoostRepository productBoostRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = productBoostRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(null, this);
    }
}
