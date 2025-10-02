package me.oriient.ipssdk.realtime.ofs;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScopeKt;
import me.oriient.ipssdk.realtime.ips.positioning.CurrentBuildingAndFloor;
import me.oriient.positioningengine.common.PositioningEngine;

/* renamed from: me.oriient.ipssdk.realtime.ofs.f1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1644f1 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26070a;
    public /* synthetic */ Object b;
    public final /* synthetic */ CurrentBuildingAndFloor c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1644f1(CurrentBuildingAndFloor currentBuildingAndFloor, Continuation continuation) {
        super(2, continuation);
        this.c = currentBuildingAndFloor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C1644f1 c1644f1 = new C1644f1(this.c, continuation);
        c1644f1.b = obj;
        return c1644f1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C1644f1 c1644f1 = new C1644f1(this.c, (Continuation) obj2);
        c1644f1.b = (PositioningEngine) obj;
        return c1644f1.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26070a;
        if (i == 0) {
            ResultKt.b(obj);
            C1638e1 c1638e1 = new C1638e1((PositioningEngine) this.b, this.c, null);
            this.f26070a = 1;
            if (CoroutineScopeKt.c(c1638e1, this) == coroutineSingletons) {
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
