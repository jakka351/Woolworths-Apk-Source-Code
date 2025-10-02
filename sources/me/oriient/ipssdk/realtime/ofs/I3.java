package me.oriient.ipssdk.realtime.ofs;

import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.StateFlow;
import me.oriient.ipssdk.realtime.ips.proximity.local.ProximityEventManagerImpl;
import me.oriient.positioningengine.common.PositioningEngine;

/* loaded from: classes8.dex */
public final class I3 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25957a;
    public final /* synthetic */ ProximityEventManagerImpl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I3(ProximityEventManagerImpl proximityEventManagerImpl, Continuation continuation) {
        super(2, continuation);
        this.b = proximityEventManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new I3(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new I3(this.b, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25957a;
        if (i == 0) {
            ResultKt.b(obj);
            StateFlow<PositioningEngine> engine = ProximityEventManagerImpl.access$getEngineManager(this.b).getEngine();
            H3 h3 = new H3(this.b);
            this.f25957a = 1;
            if (engine.collect(h3, this) == coroutineSingletons) {
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
