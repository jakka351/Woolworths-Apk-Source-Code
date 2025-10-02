package au.com.woolworths.shop.deliveryunlimited.signup.data.source;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.deliveryunlimited.signup.data.source.PaymentDataRepository", f = "PaymentDataRepository.kt", l = {59}, m = "submitPayment")
/* loaded from: classes4.dex */
final class PaymentDataRepository$submitPayment$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ PaymentDataRepository q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentDataRepository$submitPayment$1(PaymentDataRepository paymentDataRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = paymentDataRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.b(null, null, this);
    }
}
