package me.oriient.ipssdk.realtime.ofs;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.ipssdk.realtime.debugInfo.DebugInfoManagerImpl;
import me.oriient.positioningengine.common.PositioningEngine;

/* renamed from: me.oriient.ipssdk.realtime.ofs.z1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1757z1 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f26183a;
    public final /* synthetic */ PositioningEngine b;
    public final /* synthetic */ DebugInfoManagerImpl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1757z1(PositioningEngine positioningEngine, DebugInfoManagerImpl debugInfoManagerImpl, Continuation continuation) {
        super(2, continuation);
        this.b = positioningEngine;
        this.c = debugInfoManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C1757z1 c1757z1 = new C1757z1(this.b, this.c, continuation);
        c1757z1.f26183a = obj;
        return c1757z1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1757z1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        BuildersKt.c((CoroutineScope) this.f26183a, null, null, new C1752y1(this.b, this.c, null), 3);
        return Unit.f24250a;
    }
}
