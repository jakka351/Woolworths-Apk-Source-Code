package me.oriient.ipssdk.realtime.ofs;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.oriient.internal.services.geofence.models.GeofenceBuilding;
import me.oriient.ipssdk.realtime.ips.positioning.ManualPositioningGeofenceCheckerImpl;

/* renamed from: me.oriient.ipssdk.realtime.ofs.y2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1753y2 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public ManualPositioningGeofenceCheckerImpl f26178a;
    public GeofenceBuilding b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ ManualPositioningGeofenceCheckerImpl e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1753y2(ManualPositioningGeofenceCheckerImpl manualPositioningGeofenceCheckerImpl, Continuation continuation) {
        super(continuation);
        this.e = manualPositioningGeofenceCheckerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.canStartPositioning(null, null, this);
    }
}
