package me.oriient.ipssdk.realtime.ofs;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DelayKt;
import me.oriient.ipssdk.base.remoteconfig.RemoteConfig;
import me.oriient.ipssdk.realtime.ips.calibration.PeriodicAutomaticCalibratorImpl;

/* loaded from: classes8.dex */
public final class Y2 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26035a;
    public final /* synthetic */ PeriodicAutomaticCalibratorImpl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y2(PeriodicAutomaticCalibratorImpl periodicAutomaticCalibratorImpl, Continuation continuation) {
        super(2, continuation);
        this.b = periodicAutomaticCalibratorImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Y2(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Y2(this.b, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26035a;
        if (i == 0) {
            ResultKt.b(obj);
            long backgroundCalibrationTimeoutMillis = ((RemoteConfig) PeriodicAutomaticCalibratorImpl.access$getConfigManager(this.b).getConfig().getValue()).getRealTime().getPositioning().getBackgroundCalibrationTimeoutMillis();
            this.f26035a = 1;
            if (DelayKt.b(backgroundCalibrationTimeoutMillis, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        PeriodicAutomaticCalibratorImpl.access$onCalibrationTimeout(this.b);
        return Unit.f24250a;
    }
}
