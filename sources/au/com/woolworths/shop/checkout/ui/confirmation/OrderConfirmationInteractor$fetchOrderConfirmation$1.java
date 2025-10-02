package au.com.woolworths.shop.checkout.ui.confirmation;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.checkout.ui.confirmation.OrderConfirmationInteractor", f = "OrderConfirmationInteractor.kt", l = {28, 32, 36}, m = "fetchOrderConfirmation")
/* loaded from: classes4.dex */
final class OrderConfirmationInteractor$fetchOrderConfirmation$1 extends ContinuationImpl {
    public Ref.ObjectRef p;
    public Ref.ObjectRef q;
    public /* synthetic */ Object r;
    public final /* synthetic */ OrderConfirmationInteractor s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderConfirmationInteractor$fetchOrderConfirmation$1(OrderConfirmationInteractor orderConfirmationInteractor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.s = orderConfirmationInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.a(null, this);
    }
}
