package me.oriient.ipssdk.realtime.ofs;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.MutableStateFlow;
import me.oriient.ipssdk.realtime.ips.automatic.GeofencePositioningAutoStarterImpl;

/* loaded from: classes8.dex */
public final class Z1 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26038a;
    public final /* synthetic */ GeofencePositioningAutoStarterImpl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z1(GeofencePositioningAutoStarterImpl geofencePositioningAutoStarterImpl, Continuation continuation) {
        super(2, continuation);
        this.b = geofencePositioningAutoStarterImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Z1(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Z1(this.b, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26038a;
        if (i == 0) {
            ResultKt.b(obj);
            MutableStateFlow mutableStateFlow = this.b.j;
            GeofencePositioningAutoStarterImpl geofencePositioningAutoStarterImpl = this.b;
            GeofencePositioningAutoStarterImpl.Companion.getClass();
            FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 flowKt__ZipKt$combine$$inlined$unsafeFlow$1L = FlowKt.l(mutableStateFlow, GeofencePositioningAutoStarterImpl.access$tickerFlow(geofencePositioningAutoStarterImpl, GeofencePositioningAutoStarterImpl.n), new Y1(this.b, null));
            this.f26038a = 1;
            if (FlowKt.g(flowKt__ZipKt$combine$$inlined$unsafeFlow$1L, this) == coroutineSingletons) {
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
