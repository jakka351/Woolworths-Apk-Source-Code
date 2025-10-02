package au.com.woolworths.shop.checkout.data.source;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.checkout.data.source.OrderConfirmationRepository", f = "OrderConfirmationRepository.kt", l = {49}, m = "fetchOrderConfirmation")
/* loaded from: classes4.dex */
final class OrderConfirmationRepository$fetchOrderConfirmation$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ OrderConfirmationRepository q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderConfirmationRepository$fetchOrderConfirmation$1(OrderConfirmationRepository orderConfirmationRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = orderConfirmationRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(null, null, this);
    }
}
