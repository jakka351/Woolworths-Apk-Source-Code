package me.oriient.ipssdk.realtime.ofs;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.ipssdk.realtime.ips.calibration.PeriodicAutomaticCalibratorImpl;

/* loaded from: classes8.dex */
public final class X2 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26030a;
    public final /* synthetic */ PeriodicAutomaticCalibratorImpl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X2(PeriodicAutomaticCalibratorImpl periodicAutomaticCalibratorImpl, Continuation continuation) {
        super(2, continuation);
        this.b = periodicAutomaticCalibratorImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new X2(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new X2(this.b, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26030a;
        if (i == 0) {
            ResultKt.b(obj);
            PeriodicAutomaticCalibratorImpl periodicAutomaticCalibratorImpl = this.b;
            this.f26030a = 1;
            if (PeriodicAutomaticCalibratorImpl.access$scheduleAutoCalibrationTask(periodicAutomaticCalibratorImpl, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f24250a;
    }
}
