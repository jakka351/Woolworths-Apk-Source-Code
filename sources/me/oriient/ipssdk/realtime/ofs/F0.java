package me.oriient.ipssdk.realtime.ofs;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import me.oriient.positioningengine.common.PositioningEngineState;
import me.oriient.positioningengine.common.PositioningUpdate;

/* loaded from: classes8.dex */
public final class F0 extends SuspendLambda implements Function3 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ PositioningEngineState f25936a;
    public /* synthetic */ PositioningUpdate b;

    public F0(Continuation continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        F0 f0 = new F0((Continuation) obj3);
        f0.f25936a = (PositioningEngineState) obj;
        f0.b = (PositioningUpdate) obj2;
        return f0.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        return Boolean.valueOf((this.f25936a instanceof PositioningEngineState.Positioning) && this.b.getLockProgress() >= 1.0d);
    }
}
