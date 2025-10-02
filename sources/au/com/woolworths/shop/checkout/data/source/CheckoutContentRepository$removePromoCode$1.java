package au.com.woolworths.shop.checkout.data.source;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.checkout.data.source.CheckoutContentRepository", f = "CheckoutContentRepository.kt", l = {327}, m = "removePromoCode")
/* loaded from: classes4.dex */
final class CheckoutContentRepository$removePromoCode$1 extends ContinuationImpl {
    public CheckoutContentRepository p;
    public CheckoutContentRepository q;
    public /* synthetic */ Object r;
    public final /* synthetic */ CheckoutContentRepository s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutContentRepository$removePromoCode$1(CheckoutContentRepository checkoutContentRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.s = checkoutContentRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.j(this);
    }
}
