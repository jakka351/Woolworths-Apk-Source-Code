package me.oriient.ipssdk.realtime.ofs;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2;
import kotlinx.coroutines.flow.StateFlow;
import me.oriient.internal.infra.utils.android.appState.AppState;
import me.oriient.ipssdk.realtime.ips.automatic.ChargingBasedPositioningControllerImpl;

/* renamed from: me.oriient.ipssdk.realtime.ofs.v, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1735v extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26158a;
    public final /* synthetic */ Flow b;
    public final /* synthetic */ ChargingBasedPositioningControllerImpl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1735v(Flow flow, ChargingBasedPositioningControllerImpl chargingBasedPositioningControllerImpl, Continuation continuation) {
        super(2, continuation);
        this.b = flow;
        this.c = chargingBasedPositioningControllerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1735v(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1735v(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26158a;
        if (i == 0) {
            ResultKt.b(obj);
            Flow flow = this.b;
            StateFlow<Boolean> stateFlowIsCharging = ChargingBasedPositioningControllerImpl.access$getPowerManager(this.c).isCharging();
            StateFlow<AppState> appState = ChargingBasedPositioningControllerImpl.access$getAppStateProvider(this.c).getAppState();
            ChargingBasedPositioningControllerImpl chargingBasedPositioningControllerImpl = this.c;
            ChargingBasedPositioningControllerImpl.Companion.getClass();
            FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2 flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2J = FlowKt.j(flow, stateFlowIsCharging, appState, ChargingBasedPositioningControllerImpl.access$tickerFlow(chargingBasedPositioningControllerImpl, ChargingBasedPositioningControllerImpl.o), new C1730u(this.c, null));
            this.f26158a = 1;
            if (FlowKt.g(flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2J, this) == coroutineSingletons) {
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
