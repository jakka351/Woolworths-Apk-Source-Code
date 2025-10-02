package au.com.woolworths.shop.deliveryunlimited.signup.domain.interactor;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.deliveryunlimited.signup.domain.interactor.DeliveryUnlimitedPaymentInteractor", f = "DeliveryUnlimitedPaymentInteractor.kt", l = {45}, m = "submitPayment")
/* loaded from: classes4.dex */
final class DeliveryUnlimitedPaymentInteractor$submitPayment$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ DeliveryUnlimitedPaymentInteractor q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryUnlimitedPaymentInteractor$submitPayment$1(DeliveryUnlimitedPaymentInteractor deliveryUnlimitedPaymentInteractor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = deliveryUnlimitedPaymentInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.b(null, null, this);
    }
}
