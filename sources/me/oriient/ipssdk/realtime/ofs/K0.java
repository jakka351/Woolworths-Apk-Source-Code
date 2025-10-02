package me.oriient.ipssdk.realtime.ofs;

import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.SharedFlow;
import me.oriient.positioningengine.common.ActiveFloorUpdate;
import me.oriient.positioningengine.common.PositioningEngine;

/* loaded from: classes8.dex */
public final class K0 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25963a;
    public final /* synthetic */ PositioningEngine b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K0(PositioningEngine positioningEngine, Continuation continuation) {
        super(2, continuation);
        this.b = positioningEngine;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new K0(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new K0(this.b, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25963a;
        if (i == 0) {
            ResultKt.b(obj);
            SharedFlow<ActiveFloorUpdate> activeFloorUpdates = this.b.getActiveFloorUpdates();
            J0 j0 = J0.f25960a;
            this.f25963a = 1;
            if (activeFloorUpdates.collect(j0, this) == coroutineSingletons) {
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
