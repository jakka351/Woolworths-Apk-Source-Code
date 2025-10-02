package me.oriient.ipssdk.realtime.ofs;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.ipssdk.realtime.ips.positioning.CurrentBuildingAndFloor;
import me.oriient.positioningengine.common.PositioningEngine;

/* renamed from: me.oriient.ipssdk.realtime.ofs.e1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1638e1 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f26065a;
    public final /* synthetic */ PositioningEngine b;
    public final /* synthetic */ CurrentBuildingAndFloor c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1638e1(PositioningEngine positioningEngine, CurrentBuildingAndFloor currentBuildingAndFloor, Continuation continuation) {
        super(2, continuation);
        this.b = positioningEngine;
        this.c = currentBuildingAndFloor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C1638e1 c1638e1 = new C1638e1(this.b, this.c, continuation);
        c1638e1.f26065a = obj;
        return c1638e1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1638e1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.f26065a;
        BuildersKt.c(coroutineScope, null, null, new C1620b1(this.b, this.c, null), 3);
        BuildersKt.c(coroutineScope, null, null, new C1632d1(this.b, this.c, null), 3);
        return Unit.f24250a;
    }
}
