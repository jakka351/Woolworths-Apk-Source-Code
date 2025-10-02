package me.oriient.ipssdk.common.ofs;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import me.oriient.ipssdk.common.services.geofencing.LiveGeofenceStabilizerImpl;

/* loaded from: classes2.dex */
public final class b0 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25741a;
    public final /* synthetic */ LiveGeofenceStabilizerImpl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(LiveGeofenceStabilizerImpl liveGeofenceStabilizerImpl, Continuation continuation) {
        super(2, continuation);
        this.b = liveGeofenceStabilizerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new b0(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new b0(this.b, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25741a;
        if (i == 0) {
            ResultKt.b(obj);
            FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 flowKt__ZipKt$combine$$inlined$unsafeFlow$1L = FlowKt.l(this.b.c, this.b.h, new Z(null));
            a0 a0Var = new a0(this.b);
            this.f25741a = 1;
            if (flowKt__ZipKt$combine$$inlined$unsafeFlow$1L.collect(a0Var, this) == coroutineSingletons) {
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
