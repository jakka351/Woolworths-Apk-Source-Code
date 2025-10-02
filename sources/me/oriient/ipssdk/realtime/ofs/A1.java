package me.oriient.ipssdk.realtime.ofs;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScopeKt;
import me.oriient.ipssdk.realtime.debugInfo.DebugInfoManagerImpl;
import me.oriient.positioningengine.common.PositioningEngine;

/* loaded from: classes8.dex */
public final class A1 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25908a;
    public /* synthetic */ Object b;
    public final /* synthetic */ DebugInfoManagerImpl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A1(DebugInfoManagerImpl debugInfoManagerImpl, Continuation continuation) {
        super(2, continuation);
        this.c = debugInfoManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        A1 a1 = new A1(this.c, continuation);
        a1.b = obj;
        return a1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        A1 a1 = new A1(this.c, (Continuation) obj2);
        a1.b = (PositioningEngine) obj;
        return a1.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25908a;
        if (i == 0) {
            ResultKt.b(obj);
            C1757z1 c1757z1 = new C1757z1((PositioningEngine) this.b, this.c, null);
            this.f25908a = 1;
            if (CoroutineScopeKt.c(c1757z1, this) == coroutineSingletons) {
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
