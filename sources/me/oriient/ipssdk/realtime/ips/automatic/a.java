package me.oriient.ipssdk.realtime.ips.automatic;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.internal.services.dataManager.region.BuildingExitRegion;
import me.oriient.ipssdk.realtime.ips.automatic.AutomaticSessionStopper;
import me.oriient.ipssdk.realtime.ofs.C1624c;
import me.oriient.positioningengine.common.EngineStopReason;

/* loaded from: classes8.dex */
public final class a extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25871a;
    public final /* synthetic */ AutomaticLockedSessionStopper b;
    public final /* synthetic */ BuildingExitRegion c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(AutomaticLockedSessionStopper automaticLockedSessionStopper, BuildingExitRegion buildingExitRegion, Continuation continuation) {
        super(2, continuation);
        this.b = automaticLockedSessionStopper;
        this.c = buildingExitRegion;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new a(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new a(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25871a;
        if (i == 0) {
            ResultKt.b(obj);
            AutomaticLockedSessionStopper.access$getLogger(this.b).d("AutomaticLockedSessionS", "onExitRegionTriggered() called");
            AutomaticLockedSessionStopper.access$getELog(this.b).i("AutomaticLockedSessionS", "Auto-stop positioning due to exit region", new C1624c(this.c));
            AutomaticSessionStopper.Delegate delegate = this.b.f25866a;
            EngineStopReason.ExitRegion exitRegion = new EngineStopReason.ExitRegion();
            this.f25871a = 1;
            if (delegate.stopSession(exitRegion, this) == coroutineSingletons) {
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
