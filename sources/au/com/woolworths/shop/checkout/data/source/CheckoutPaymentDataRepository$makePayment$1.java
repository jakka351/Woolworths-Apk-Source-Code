package au.com.woolworths.shop.checkout.data.source;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.checkout.data.source.CheckoutPaymentDataRepository", f = "CheckoutPaymentDataRepository.kt", l = {46}, m = "makePayment")
/* loaded from: classes4.dex */
final class CheckoutPaymentDataRepository$makePayment$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ CheckoutPaymentDataRepository q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutPaymentDataRepository$makePayment$1(CheckoutPaymentDataRepository checkoutPaymentDataRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = checkoutPaymentDataRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(null, null, null, this);
    }
}
