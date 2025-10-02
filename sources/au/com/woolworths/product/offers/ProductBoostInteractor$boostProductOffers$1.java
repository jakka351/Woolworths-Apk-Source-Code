package au.com.woolworths.product.offers;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.product.offers.ProductBoostInteractor", f = "ProductBoostInteractor.kt", l = {80}, m = "boostProductOffers")
/* loaded from: classes4.dex */
final class ProductBoostInteractor$boostProductOffers$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ ProductBoostInteractor q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductBoostInteractor$boostProductOffers$1(ProductBoostInteractor productBoostInteractor, Continuation continuation) {
        super(continuation);
        this.q = productBoostInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(null, false, null, null, null, this);
    }
}
