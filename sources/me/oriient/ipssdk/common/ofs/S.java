package me.oriient.ipssdk.common.ofs;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import me.oriient.ipssdk.common.services.geofencing.LiveGeofenceManagerImpl;

/* loaded from: classes2.dex */
public final class S extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LiveGeofenceManagerImpl f25730a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(LiveGeofenceManagerImpl liveGeofenceManagerImpl, Continuation continuation) {
        super(2, continuation);
        this.f25730a = liveGeofenceManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new S(this.f25730a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new S(this.f25730a, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        this.f25730a.l.clear();
        LiveGeofenceManagerImpl liveGeofenceManagerImpl = this.f25730a;
        BuildersKt.c(liveGeofenceManagerImpl.g, null, null, new Y(liveGeofenceManagerImpl, null), 3);
        return Unit.f24250a;
    }
}
