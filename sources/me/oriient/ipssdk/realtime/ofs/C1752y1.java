package me.oriient.ipssdk.realtime.ofs;

import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.SharedFlow;
import me.oriient.ipssdk.realtime.debugInfo.DebugInfoManagerImpl;
import me.oriient.positioningengine.common.PositioningEngine;
import me.oriient.positioningengine.common.PositioningUpdate;

/* renamed from: me.oriient.ipssdk.realtime.ofs.y1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1752y1 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26177a;
    public final /* synthetic */ PositioningEngine b;
    public final /* synthetic */ DebugInfoManagerImpl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1752y1(PositioningEngine positioningEngine, DebugInfoManagerImpl debugInfoManagerImpl, Continuation continuation) {
        super(2, continuation);
        this.b = positioningEngine;
        this.c = debugInfoManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1752y1(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1752y1(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26177a;
        if (i == 0) {
            ResultKt.b(obj);
            SharedFlow<PositioningUpdate> positioningUpdates = this.b.getPositioningUpdates();
            C1747x1 c1747x1 = new C1747x1(this.c);
            this.f26177a = 1;
            if (positioningUpdates.collect(c1747x1, this) == coroutineSingletons) {
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
