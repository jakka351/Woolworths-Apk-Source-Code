package me.oriient.ipssdk.realtime.ofs;

import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.StateFlow;
import me.oriient.ipssdk.realtime.ips.proximity.ProximityStatsManagerImpl;
import me.oriient.positioningengine.common.PositioningEngine;

/* loaded from: classes8.dex */
public final class X3 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26031a;
    public final /* synthetic */ ProximityStatsManagerImpl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X3(ProximityStatsManagerImpl proximityStatsManagerImpl, Continuation continuation) {
        super(2, continuation);
        this.b = proximityStatsManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new X3(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new X3(this.b, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26031a;
        if (i == 0) {
            ResultKt.b(obj);
            StateFlow<PositioningEngine> engine = ProximityStatsManagerImpl.access$getEngineManager(this.b).getEngine();
            W3 w3 = new W3(this.b);
            this.f26031a = 1;
            if (engine.collect(w3, this) == coroutineSingletons) {
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
