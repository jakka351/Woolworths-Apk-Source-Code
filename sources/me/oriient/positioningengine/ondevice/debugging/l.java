package me.oriient.positioningengine.ondevice.debugging;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import me.oriient.positioningengine.common.PositioningEngine;
import me.oriient.positioningengine.common.PositioningEngineState;

/* loaded from: classes8.dex */
public final class l extends SuspendLambda implements Function3 {

    /* renamed from: a, reason: collision with root package name */
    public int f26426a;
    public /* synthetic */ FlowCollector b;
    public /* synthetic */ Object c;

    public l(Continuation continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        l lVar = new l((Continuation) obj3);
        lVar.b = (FlowCollector) obj;
        lVar.c = obj2;
        return lVar.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26426a;
        if (i == 0) {
            ResultKt.b(obj);
            FlowCollector flowCollector = this.b;
            StateFlow<PositioningEngineState> state = ((PositioningEngine) this.c).getState();
            this.f26426a = 1;
            if (FlowKt.u(flowCollector, state, this) == coroutineSingletons) {
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
