package me.oriient.ipssdk.common.ofs;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.ipssdk.api.listeners.IPSLiveGeofenceListener;
import me.oriient.ipssdk.common.services.geofencing.LiveGeofenceManagerImpl;

/* loaded from: classes2.dex */
public final class X extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LiveGeofenceManagerImpl f25735a;
    public final /* synthetic */ String b;
    public final /* synthetic */ IPSLiveGeofenceListener c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(LiveGeofenceManagerImpl liveGeofenceManagerImpl, String str, IPSLiveGeofenceListener iPSLiveGeofenceListener, Continuation continuation) {
        super(2, continuation);
        this.f25735a = liveGeofenceManagerImpl;
        this.b = str;
        this.c = iPSLiveGeofenceListener;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new X(this.f25735a, this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((X) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        List list = (List) this.f25735a.l.get(this.b);
        if (list != null) {
            list.remove(this.c);
        }
        List list2 = (List) this.f25735a.l.get(this.b);
        if (list2 != null && list2.isEmpty()) {
            this.f25735a.l.remove(this.b);
        }
        if (this.f25735a.l.isEmpty()) {
            LiveGeofenceManagerImpl liveGeofenceManagerImpl = this.f25735a;
            BuildersKt.c(liveGeofenceManagerImpl.g, null, null, new Y(liveGeofenceManagerImpl, null), 3);
        }
        return Unit.f24250a;
    }
}
