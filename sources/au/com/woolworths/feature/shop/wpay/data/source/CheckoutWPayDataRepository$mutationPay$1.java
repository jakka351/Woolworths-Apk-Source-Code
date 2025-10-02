package au.com.woolworths.feature.shop.wpay.data.source;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.wpay.data.source.CheckoutWPayDataRepository", f = "CheckoutWPayDataRepository.kt", l = {106}, m = "mutationPay")
/* loaded from: classes3.dex */
final class CheckoutWPayDataRepository$mutationPay$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ CheckoutWPayDataRepository q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutWPayDataRepository$mutationPay$1(CheckoutWPayDataRepository checkoutWPayDataRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = checkoutWPayDataRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.c(null, null, null, null, null, this);
    }
}
