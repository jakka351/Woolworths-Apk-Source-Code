package me.oriient.ipssdk.realtime.ofs;

import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import me.oriient.ipssdk.realtime.ips.positioning.CurrentBuildingAndFloor;
import me.oriient.positioningengine.common.PositioningEngineState;

/* loaded from: classes8.dex */
public final class Z0 extends SuspendLambda implements Function3 {

    /* renamed from: a, reason: collision with root package name */
    public int f26037a;
    public /* synthetic */ PositioningEngineState b;
    public /* synthetic */ Map c;
    public final /* synthetic */ CurrentBuildingAndFloor d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z0(CurrentBuildingAndFloor currentBuildingAndFloor, Continuation continuation) {
        super(3, continuation);
        this.d = currentBuildingAndFloor;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Z0 z0 = new Z0(this.d, (Continuation) obj3);
        z0.b = (PositioningEngineState) obj;
        z0.c = (Map) obj2;
        return z0.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26037a;
        if (i == 0) {
            ResultKt.b(obj);
            PositioningEngineState positioningEngineState = this.b;
            Map map = this.c;
            CurrentBuildingAndFloor currentBuildingAndFloor = this.d;
            this.b = null;
            this.f26037a = 1;
            if (CurrentBuildingAndFloor.access$handleGeofenceInside(currentBuildingAndFloor, positioningEngineState, map, this) == coroutineSingletons) {
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
