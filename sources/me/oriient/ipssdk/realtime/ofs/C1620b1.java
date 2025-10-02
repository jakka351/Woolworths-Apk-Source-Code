package me.oriient.ipssdk.realtime.ofs;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import me.oriient.ipssdk.realtime.ips.positioning.CurrentBuildingAndFloor;
import me.oriient.positioningengine.common.PositioningEngine;

/* renamed from: me.oriient.ipssdk.realtime.ofs.b1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1620b1 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26047a;
    public final /* synthetic */ PositioningEngine b;
    public final /* synthetic */ CurrentBuildingAndFloor c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1620b1(PositioningEngine positioningEngine, CurrentBuildingAndFloor currentBuildingAndFloor, Continuation continuation) {
        super(2, continuation);
        this.b = positioningEngine;
        this.c = currentBuildingAndFloor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1620b1(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1620b1(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26047a;
        if (i == 0) {
            ResultKt.b(obj);
            FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 flowKt__ZipKt$combine$$inlined$unsafeFlow$1L = FlowKt.l(this.b.getState(), CurrentBuildingAndFloor.access$getGeofenceManager(this.c).getCircularStatus(), new Z0(this.c, null));
            C1614a1 c1614a1 = C1614a1.f26041a;
            this.f26047a = 1;
            if (flowKt__ZipKt$combine$$inlined$unsafeFlow$1L.collect(c1614a1, this) == coroutineSingletons) {
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
