package au.com.woolworths.shop.deliveryunlimited.signup;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.deliveryunlimited.signup.DeliveryUnlimitedSignUpRepository", f = "DeliveryUnlimitedSignUpRepository.kt", l = {71}, m = "submitSubscription")
/* loaded from: classes4.dex */
final class DeliveryUnlimitedSignUpRepository$submitSubscription$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ DeliveryUnlimitedSignUpRepository q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryUnlimitedSignUpRepository$submitSubscription$1(DeliveryUnlimitedSignUpRepository deliveryUnlimitedSignUpRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = deliveryUnlimitedSignUpRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.d(null, this);
    }
}
