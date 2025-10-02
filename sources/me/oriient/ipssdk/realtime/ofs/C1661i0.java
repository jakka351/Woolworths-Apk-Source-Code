package me.oriient.ipssdk.realtime.ofs;

import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.StateFlow;
import me.oriient.ipssdk.realtime.ips.CoreLogic;
import me.oriient.positioningengine.common.PositioningEngine;

/* renamed from: me.oriient.ipssdk.realtime.ofs.i0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1661i0 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26086a;

    public C1661i0(Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1661i0(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1661i0((Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26086a;
        if (i == 0) {
            ResultKt.b(obj);
            StateFlow<PositioningEngine> engine = CoreLogic.access$getEngineManager(CoreLogic.INSTANCE).getEngine();
            C1655h0 c1655h0 = C1655h0.f26080a;
            this.f26086a = 1;
            if (engine.collect(c1655h0, this) == coroutineSingletons) {
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
