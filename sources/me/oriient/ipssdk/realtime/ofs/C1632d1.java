package me.oriient.ipssdk.realtime.ofs;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import me.oriient.ipssdk.realtime.ips.positioning.CurrentBuildingAndFloor;
import me.oriient.positioningengine.common.PositioningEngine;

/* renamed from: me.oriient.ipssdk.realtime.ofs.d1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1632d1 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26059a;
    public final /* synthetic */ PositioningEngine b;
    public final /* synthetic */ CurrentBuildingAndFloor c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1632d1(PositioningEngine positioningEngine, CurrentBuildingAndFloor currentBuildingAndFloor, Continuation continuation) {
        super(2, continuation);
        this.b = positioningEngine;
        this.c = currentBuildingAndFloor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1632d1(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1632d1(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26059a;
        if (i == 0) {
            ResultKt.b(obj);
            FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(this.b.getCurrentFloor());
            C1626c1 c1626c1 = new C1626c1(this.c);
            this.f26059a = 1;
            if (flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1.collect(c1626c1, this) == coroutineSingletons) {
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
