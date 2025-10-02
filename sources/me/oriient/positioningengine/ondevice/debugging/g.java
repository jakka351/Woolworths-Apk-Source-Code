package me.oriient.positioningengine.ondevice.debugging;

import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import me.oriient.positioningengine.common.PositioningEngineState;

/* loaded from: classes8.dex */
public final class g extends SuspendLambda implements Function3 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ PositioningDebuggingWalk f26422a;
    public /* synthetic */ PositioningEngineState b;
    public final /* synthetic */ n c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(n nVar, Continuation continuation) {
        super(3, continuation);
        this.c = nVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        g gVar = new g(this.c, (Continuation) obj3);
        gVar.f26422a = (PositioningDebuggingWalk) obj;
        gVar.b = (PositioningEngineState) obj2;
        return gVar.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        PositioningDebuggingWalk positioningDebuggingWalk = this.f26422a;
        PositioningEngineState positioningEngineState = this.b;
        n nVar = this.c;
        boolean z = (positioningDebuggingWalk == null || (positioningEngineState instanceof PositioningEngineState.Idle)) ? false : true;
        nVar.p = z;
        Unit unit = Unit.f24250a;
        if (z) {
            Job job = nVar.o;
            if (job != null) {
                job.cancel((CancellationException) null);
            }
            nVar.o = BuildersKt.c(nVar.m, null, null, new m(nVar, null), 3);
            return unit;
        }
        Job job2 = nVar.o;
        if (job2 == null) {
            return null;
        }
        job2.cancel((CancellationException) null);
        return unit;
    }
}
