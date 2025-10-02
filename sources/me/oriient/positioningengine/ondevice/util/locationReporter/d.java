package me.oriient.positioningengine.ondevice.util.locationReporter;

import io.jsonwebtoken.JwtParser;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import me.oriient.internal.infra.utils.core.DeviceIdProvider;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.eventManager.EventManager;
import me.oriient.positioningengine.common.PositioningContext;
import me.oriient.positioningengine.common.PositioningUpdate;
import me.oriient.positioningengine.ondevice.StartPosition;
import me.oriient.positioningengine.ondevice.util.locationReporter.models.LocationReportCoordinate;
import me.oriient.positioningengine.ondevice.util.locationReporter.models.LocationReportData;
import me.oriient.positioningengine.ondevice.util.locationReporter.models.LocationReportParams;
import me.oriient.positioningengine.ondevice.util.locationReporter.models.LocationReportStartPosition;

/* loaded from: classes8.dex */
public final class d implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f26485a;
    public final /* synthetic */ PositioningContext b;

    public d(h hVar, PositioningContext positioningContext) {
        this.f26485a = hVar;
        this.b = positioningContext;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        LocationReportStartPosition locationReportStartPosition;
        Unit unit = Unit.f24250a;
        PositioningUpdate positioningUpdate = (PositioningUpdate) obj;
        h hVar = this.f26485a;
        EventManager eventManager = hVar.j;
        if (eventManager == null || Math.abs(hVar.e.timeIntervalSinceNow(hVar.l)) < this.f26485a.b.getReportingIntervalMillis() || positioningUpdate.getMapId() == null) {
            return unit;
        }
        h hVar2 = this.f26485a;
        hVar2.l = hVar2.e.getCurrentTimeMillis();
        String str = "v2.realtime." + this.f26485a.b.getSpaceId() + JwtParser.SEPARATOR_CHAR + this.b.getBuildingId() + JwtParser.SEPARATOR_CHAR + positioningUpdate.getFloorId() + JwtParser.SEPARATOR_CHAR + positioningUpdate.getMapId() + ".position-updated";
        LocationReportData.Companion companion = LocationReportData.INSTANCE;
        TimeZone timeZone = this.f26485a.e.getTimeZoneGmt();
        companion.getClass();
        Intrinsics.h(timeZone, "timeZone");
        LocationReportData locationReportData = new LocationReportData(positioningUpdate.getX(), positioningUpdate.getY(), positioningUpdate.getZ(), Double.valueOf(positioningUpdate.getTimeBetweenUpdatesMilli()), Double.valueOf(positioningUpdate.getLongitude()), Double.valueOf(positioningUpdate.getLatitude()), positioningUpdate.getAltitude(), Double.valueOf(positioningUpdate.getAzimuth()), positioningUpdate.getTraveledDistance(), me.oriient.positioningengine.common.util.a.a(positioningUpdate.getServerTimeMillis(), timeZone), positioningUpdate.getLockProgress(), positioningUpdate.getAccuracy(), new LocationReportCoordinate(positioningUpdate.getHeading().getX(), positioningUpdate.getHeading().getY()), new LocationReportCoordinate(positioningUpdate.getMainOrientation().getX(), positioningUpdate.getMainOrientation().getY()), positioningUpdate.getFloorOrder());
        LocationReportParams.Companion companion2 = LocationReportParams.INSTANCE;
        String spaceId = this.f26485a.b.getSpaceId();
        h hVar3 = this.f26485a;
        String str2 = hVar3.g;
        PositioningContext positioningContext = this.b;
        TimeProvider timeProvider = hVar3.e;
        DeviceIdProvider deviceIdProvider = hVar3.d;
        companion2.getClass();
        Intrinsics.h(spaceId, "spaceId");
        Intrinsics.h(positioningContext, "positioningContext");
        Intrinsics.h(timeProvider, "timeProvider");
        Intrinsics.h(deviceIdProvider, "deviceIdProvider");
        StartPosition startPosition = positioningContext.getStartPosition();
        if (startPosition != null) {
            locationReportStartPosition = new LocationReportStartPosition(startPosition.getX(), startPosition.getY(), startPosition.getAccuracy(), startPosition.getHeading() != null ? new LocationReportCoordinate(r9.getX(), r9.getY()) : null, startPosition.isExternal());
        } else {
            locationReportStartPosition = null;
        }
        String buildingId = positioningContext.getBuildingId();
        String floorId = positioningUpdate.getFloorId();
        String mapId = positioningUpdate.getMapId();
        String strA = me.oriient.positioningengine.common.util.a.a(positioningContext.getStartTimeMillis(), timeProvider.getTimeZoneGmt());
        boolean zIsOutOfGeofence = positioningContext.isOutOfGeofence();
        String sessionId = positioningContext.getSessionId();
        String deviceId = deviceIdProvider.getDeviceId();
        if (str2 == null) {
            str2 = "";
        }
        eventManager.sendEvent(str, locationReportData, new LocationReportParams(spaceId, buildingId, floorId, mapId, strA, zIsOutOfGeofence, sessionId, locationReportStartPosition, deviceId, str2), new b(this.f26485a), new c(this.f26485a));
        return unit;
    }
}
