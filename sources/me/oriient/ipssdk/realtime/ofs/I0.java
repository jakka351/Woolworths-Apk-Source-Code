package me.oriient.ipssdk.realtime.ofs;

import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.StateFlow;
import me.oriient.positioningengine.common.PositioningEngine;
import me.oriient.positioningengine.common.models.CalibrationNeeded;

/* loaded from: classes8.dex */
public final class I0 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25954a;
    public final /* synthetic */ PositioningEngine b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I0(PositioningEngine positioningEngine, Continuation continuation) {
        super(2, continuation);
        this.b = positioningEngine;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new I0(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new I0(this.b, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25954a;
        if (i == 0) {
            ResultKt.b(obj);
            StateFlow<CalibrationNeeded> calibrationNeededUpdates = this.b.getCalibrationNeededUpdates();
            me.oriient.ipssdk.realtime.ips.e eVar = me.oriient.ipssdk.realtime.ips.e.f25879a;
            this.f25954a = 1;
            if (calibrationNeededUpdates.collect(eVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
