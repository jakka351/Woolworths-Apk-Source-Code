package au.com.woolworths.shop.checkout.ui.confirmation;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.checkout.ui.confirmation.OrderConfirmationInteractor", f = "OrderConfirmationInteractor.kt", l = {52}, m = "updateOrderConfirmationContents")
/* loaded from: classes4.dex */
final class OrderConfirmationInteractor$updateOrderConfirmationContents$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ OrderConfirmationInteractor q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderConfirmationInteractor$updateOrderConfirmationContents$1(OrderConfirmationInteractor orderConfirmationInteractor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = orderConfirmationInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.b(null, this);
    }
}
