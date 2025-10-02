package me.oriient.ipssdk.realtime.ofs;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.services.geofence.models.GeofenceBuilding;
import me.oriient.ipssdk.realtime.ips.automatic.ChargingBasedPositioningControllerImpl;

/* renamed from: me.oriient.ipssdk.realtime.ofs.s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1719s implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ChargingBasedPositioningControllerImpl f26141a;

    public C1719s(ChargingBasedPositioningControllerImpl chargingBasedPositioningControllerImpl) {
        this.f26141a = chargingBasedPositioningControllerImpl;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        GeofenceBuilding geofenceBuilding = (GeofenceBuilding) obj;
        Logger loggerAccess$getLogger = ChargingBasedPositioningControllerImpl.access$getLogger(this.f26141a);
        StringBuilder sb = new StringBuilder("enableCircularStrategy ");
        sb.append(geofenceBuilding == null);
        loggerAccess$getLogger.d("ChargingBasedPositioning", sb.toString());
        ChargingBasedPositioningControllerImpl.access$getBuildingGeofenceManager(this.f26141a).enableCircularStrategy(geofenceBuilding == null, ChargingBasedPositioningControllerImpl.GEOFENCE_REQUEST_ID);
        return Unit.f24250a;
    }
}
