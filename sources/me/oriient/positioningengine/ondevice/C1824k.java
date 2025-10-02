package me.oriient.positioningengine.ondevice;

import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.positioningengine.common.PositioningEngineState;
import me.oriient.positioningengine.ondevice.models.calibration.EngineCalibrationInfoEngineResult;

/* renamed from: me.oriient.positioningengine.ondevice.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1824k extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26438a;
    public final /* synthetic */ I b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1824k(I i, Continuation continuation) {
        super(2, continuation);
        this.b = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1824k(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1824k(this.b, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26438a;
        if (i == 0) {
            ResultKt.b(obj);
            PositioningEngineState positioningEngineState = (PositioningEngineState) this.b.i.getValue();
            if (!(positioningEngineState instanceof PositioningEngineState.Calibrating ? true : positioningEngineState instanceof PositioningEngineState.Positioning)) {
                if (positioningEngineState instanceof PositioningEngineState.Idle) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
            X x = this.b.y;
            if (x == null) {
                return null;
            }
            this.f26438a = 1;
            obj = x.b();
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return (EngineCalibrationInfoEngineResult) obj;
    }
}
