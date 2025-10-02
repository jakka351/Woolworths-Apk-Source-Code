package me.oriient.ipssdk.realtime.ofs;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref;
import me.oriient.internal.services.geofence.models.GeofenceBuilding;
import me.oriient.ipssdk.realtime.ips.automatic.ChargingBasedPositioningControllerImpl;

/* loaded from: classes8.dex */
public final class B extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public ChargingBasedPositioningControllerImpl f25912a;
    public GeofenceBuilding b;
    public Ref.BooleanRef c;
    public /* synthetic */ Object d;
    public final /* synthetic */ ChargingBasedPositioningControllerImpl e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(ChargingBasedPositioningControllerImpl chargingBasedPositioningControllerImpl, Continuation continuation) {
        super(continuation);
        this.e = chargingBasedPositioningControllerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return ChargingBasedPositioningControllerImpl.access$startPositioningIfNeeded(this.e, null, this);
    }
}
