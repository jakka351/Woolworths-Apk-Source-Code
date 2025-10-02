package me.oriient.ipssdk.common.ofs;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.services.geofence.models.GeofenceBuilding;
import me.oriient.ipssdk.api.listeners.IPSLiveGeofenceListener;
import me.oriient.ipssdk.common.services.geofencing.LiveGeofenceManagerImpl;

/* loaded from: classes2.dex */
public final class Q extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public GeofenceBuilding f25729a;
    public int b;
    public final /* synthetic */ LiveGeofenceManagerImpl c;
    public final /* synthetic */ String d;
    public final /* synthetic */ IPSLiveGeofenceListener e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(LiveGeofenceManagerImpl liveGeofenceManagerImpl, String str, IPSLiveGeofenceListener iPSLiveGeofenceListener, Continuation continuation) {
        super(2, continuation);
        this.c = liveGeofenceManagerImpl;
        this.d = str;
        this.e = iPSLiveGeofenceListener;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Q(this.c, this.d, this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Q) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ff  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.ipssdk.common.ofs.Q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
