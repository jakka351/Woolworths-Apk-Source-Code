package me.oriient.internal.services.sensorsManager;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DelayKt;

/* loaded from: classes7.dex */
public final class E extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25552a;
    public final /* synthetic */ SensorFreezeMonitorImpl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(SensorFreezeMonitorImpl sensorFreezeMonitorImpl, Continuation continuation) {
        super(2, continuation);
        this.b = sensorFreezeMonitorImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new E(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new E(this.b, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25552a;
        if (i == 0) {
            ResultKt.b(obj);
            long monitoringIntervalMillis = this.b.getMonitoringIntervalMillis();
            this.f25552a = 1;
            if (DelayKt.b(monitoringIntervalMillis, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        this.b.monitorTask();
        this.b.runMonitorTask();
        return Unit.f24250a;
    }
}
