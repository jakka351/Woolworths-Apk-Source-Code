package me.oriient.ipssdk.realtime.ofs;

import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.Job;
import me.oriient.ipssdk.realtime.ips.automatic.GeofencePositioningAutoStarterImpl;

/* renamed from: me.oriient.ipssdk.realtime.ofs.k2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1675k2 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GeofencePositioningAutoStarterImpl f26099a;
    public final /* synthetic */ boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1675k2(GeofencePositioningAutoStarterImpl geofencePositioningAutoStarterImpl, boolean z, Continuation continuation) {
        super(2, continuation);
        this.f26099a = geofencePositioningAutoStarterImpl;
        this.b = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1675k2(this.f26099a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1675k2(this.f26099a, this.b, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        GeofencePositioningAutoStarterImpl.access$getLogger(this.f26099a).d("GeofencePositioningAuto", "setFeatureEnabled " + this.b);
        boolean z = this.f26099a.m;
        boolean z2 = this.b;
        Unit unit = Unit.f24250a;
        if (z == z2) {
            return unit;
        }
        this.f26099a.m = z2;
        if (this.f26099a.m) {
            GeofencePositioningAutoStarterImpl.access$activateFeature(this.f26099a);
            return unit;
        }
        GeofencePositioningAutoStarterImpl.access$getBuildingGeofenceManager(this.f26099a).enablePolygonalStrategy(false, GeofencePositioningAutoStarterImpl.GEOFENCE_REQUEST_ID);
        Iterator it = this.f26099a.l.iterator();
        while (it.hasNext()) {
            ((Job) it.next()).cancel((CancellationException) null);
        }
        this.f26099a.l.clear();
        return unit;
    }
}
