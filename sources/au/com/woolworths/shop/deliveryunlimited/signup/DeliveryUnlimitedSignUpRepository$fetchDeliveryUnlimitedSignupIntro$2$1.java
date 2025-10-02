package au.com.woolworths.shop.deliveryunlimited.signup;

import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSubscribe;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/shop/deliveryunlimited/signup/data/DeliveryUnlimitedSubscribe;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.deliveryunlimited.signup.DeliveryUnlimitedSignUpRepository$fetchDeliveryUnlimitedSignupIntro$2$1", f = "DeliveryUnlimitedSignUpRepository.kt", l = {42}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class DeliveryUnlimitedSignUpRepository$fetchDeliveryUnlimitedSignupIntro$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super DeliveryUnlimitedSubscribe>, Object> {
    public int p;
    public final /* synthetic */ DeliveryUnlimitedSignUpRepository q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryUnlimitedSignUpRepository$fetchDeliveryUnlimitedSignupIntro$2$1(DeliveryUnlimitedSignUpRepository deliveryUnlimitedSignUpRepository, Continuation continuation) {
        super(2, continuation);
        this.q = deliveryUnlimitedSignUpRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DeliveryUnlimitedSignUpRepository$fetchDeliveryUnlimitedSignupIntro$2$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((DeliveryUnlimitedSignUpRepository$fetchDeliveryUnlimitedSignupIntro$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x025e A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r31) {
        /*
            Method dump skipped, instructions count: 703
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.deliveryunlimited.signup.DeliveryUnlimitedSignUpRepository$fetchDeliveryUnlimitedSignupIntro$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
