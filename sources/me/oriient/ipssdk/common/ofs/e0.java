package me.oriient.ipssdk.common.ofs;

import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import me.oriient.ipssdk.common.services.geofencing.LiveGeofenceStatusesProviderImpl;

/* loaded from: classes2.dex */
public final class e0 extends SuspendLambda implements Function3 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Map f25746a;
    public /* synthetic */ Map b;
    public final /* synthetic */ LiveGeofenceStatusesProviderImpl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(LiveGeofenceStatusesProviderImpl liveGeofenceStatusesProviderImpl, Continuation continuation) {
        super(3, continuation);
        this.c = liveGeofenceStatusesProviderImpl;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        e0 e0Var = new e0(this.c, (Continuation) obj3);
        e0Var.f25746a = (Map) obj;
        e0Var.b = (Map) obj2;
        return e0Var.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        return LiveGeofenceStatusesProviderImpl.access$combineGeofences(this.c, this.f25746a, this.b);
    }
}
