package me.oriient.ipssdk.common.ofs;

import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.Job;
import me.oriient.ipssdk.common.services.geofencing.LiveGeofenceStabilizerImpl;

/* loaded from: classes2.dex */
public final class c0 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LiveGeofenceStabilizerImpl f25743a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(LiveGeofenceStabilizerImpl liveGeofenceStabilizerImpl, Continuation continuation) {
        super(2, continuation);
        this.f25743a = liveGeofenceStabilizerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new c0(this.f25743a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new c0(this.f25743a, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        LiveGeofenceStabilizerImpl.access$getLogger(this.f25743a).d("GeofenceStabilizer", "stop() called");
        Job job = this.f25743a.g;
        if (job != null) {
            job.cancel((CancellationException) null);
        }
        LiveGeofenceStabilizerImpl.access$setJob(this.f25743a, null);
        this.f25743a.getStableGeofences().setValue(EmptyMap.d);
        return Unit.f24250a;
    }
}
