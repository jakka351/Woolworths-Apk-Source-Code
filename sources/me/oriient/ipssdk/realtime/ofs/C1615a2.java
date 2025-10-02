package me.oriient.ipssdk.realtime.ofs;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import me.oriient.internal.infra.utils.android.appState.AppState;
import me.oriient.ipssdk.realtime.ips.automatic.GeofencePositioningAutoStarterImpl;

/* renamed from: me.oriient.ipssdk.realtime.ofs.a2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1615a2 extends SuspendLambda implements Function3 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f26042a;
    public /* synthetic */ AppState b;
    public final /* synthetic */ GeofencePositioningAutoStarterImpl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1615a2(GeofencePositioningAutoStarterImpl geofencePositioningAutoStarterImpl, Continuation continuation) {
        super(3, continuation);
        this.c = geofencePositioningAutoStarterImpl;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C1615a2 c1615a2 = new C1615a2(this.c, (Continuation) obj3);
        c1615a2.f26042a = zBooleanValue;
        c1615a2.b = (AppState) obj2;
        return c1615a2.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        GeofencePositioningAutoStarterImpl.access$getBuildingGeofenceManager(this.c).enablePolygonalStrategy(this.f26042a && this.b == AppState.FOREGROUND, GeofencePositioningAutoStarterImpl.GEOFENCE_REQUEST_ID);
        return Unit.f24250a;
    }
}
