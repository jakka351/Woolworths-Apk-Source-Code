package me.oriient.ipssdk.realtime.ofs;

import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.SharedFlow;
import me.oriient.ipssdk.realtime.ips.proximity.local.ProximityEventManagerImpl;
import me.oriient.positioningengine.common.PositioningEngine;
import me.oriient.positioningengine.common.PositioningUpdate;

/* loaded from: classes8.dex */
public final class E3 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25933a;
    public final /* synthetic */ PositioningEngine b;
    public final /* synthetic */ ProximityEventManagerImpl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E3(PositioningEngine positioningEngine, ProximityEventManagerImpl proximityEventManagerImpl, Continuation continuation) {
        super(2, continuation);
        this.b = positioningEngine;
        this.c = proximityEventManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new E3(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new E3(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25933a;
        if (i == 0) {
            ResultKt.b(obj);
            SharedFlow<PositioningUpdate> positioningUpdates = this.b.getPositioningUpdates();
            D3 d3 = new D3(this.c);
            this.f25933a = 1;
            if (positioningUpdates.collect(d3, this) == coroutineSingletons) {
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
