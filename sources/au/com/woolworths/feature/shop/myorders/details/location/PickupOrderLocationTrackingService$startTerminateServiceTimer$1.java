package au.com.woolworths.feature.shop.myorders.details.location;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.myorders.details.location.PickupOrderLocationTrackingService$startTerminateServiceTimer$1", f = "PickupOrderLocationTrackingService.kt", l = {223}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PickupOrderLocationTrackingService$startTerminateServiceTimer$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ long q;
    public final /* synthetic */ PickupOrderLocationTrackingService r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PickupOrderLocationTrackingService$startTerminateServiceTimer$1(long j, PickupOrderLocationTrackingService pickupOrderLocationTrackingService, Continuation continuation) {
        super(2, continuation);
        this.q = j;
        this.r = pickupOrderLocationTrackingService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PickupOrderLocationTrackingService$startTerminateServiceTimer$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PickupOrderLocationTrackingService$startTerminateServiceTimer$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            this.p = 1;
            if (DelayKt.b(this.q, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        int i2 = PickupOrderLocationTrackingService.q;
        this.r.a("timed out");
        return Unit.f24250a;
    }
}
