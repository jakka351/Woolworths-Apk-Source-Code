package me.oriient.ipssdk.realtime.ofs;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.ipssdk.realtime.ips.automatic.ChargingBasedPositioningControllerImpl;

/* loaded from: classes8.dex */
public final class A extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ChargingBasedPositioningControllerImpl f25906a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(ChargingBasedPositioningControllerImpl chargingBasedPositioningControllerImpl, Continuation continuation) {
        super(2, continuation);
        this.f25906a = chargingBasedPositioningControllerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new A(this.f25906a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new A(this.f25906a, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        ChargingBasedPositioningControllerImpl.access$getLogger(this.f25906a).d("ChargingBasedPositioning", "pauseTillNextCharging");
        this.f25906a.n = true;
        return Unit.f24250a;
    }
}
