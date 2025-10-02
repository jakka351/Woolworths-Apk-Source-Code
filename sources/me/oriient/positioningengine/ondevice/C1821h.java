package me.oriient.positioningengine.ondevice;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.elog.ELog;
import me.oriient.positioningengine.common.ActiveFloorUpdate;
import me.oriient.positioningengine.common.CalibrationUpdate;
import me.oriient.positioningengine.common.PositioningUpdate;
import me.oriient.positioningengine.ondevice.mappingData.MappingData;
import me.oriient.positioningengine.ondevice.models.EngineSessionInfo;

/* renamed from: me.oriient.positioningengine.ondevice.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1821h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I f26432a;

    public C1821h(I i) {
        this.f26432a = i;
    }

    public final Unit a(CalibrationUpdate calibrationUpdate) {
        this.f26432a.n.f(calibrationUpdate);
        if (calibrationUpdate.getProgressPercent() >= 100.0d) {
            me.oriient.positioningengine.ondevice.calibration.e eVar = this.f26432a.b;
            if (eVar.c.getValue() != null) {
                ((ELog) eVar.j.getD()).i("CalibrationDataRepository", "Calibration needed updated", MapsKt.j(new Pair("state", me.oriient.positioningengine.ondevice.calibration.h.NOT_NEEDED.getValue()), new Pair("engineType", me.oriient.positioningengine.common.u.ON_DEVICE.getValue$service_positioning_engine_publishRelease())));
                eVar.c.setValue(null);
                eVar.b.putBoolean("pref.calibration_needed", eVar.c.getValue() != null);
            }
        }
        return Unit.f24250a;
    }

    public final void a(PositioningUpdate update) {
        MappingData.Building.BuildingInfo.FloorMetadata[] floors;
        Intrinsics.h(update, "update");
        me.oriient.positioningengine.ondevice.models.c cVar = this.f26432a.A;
        cVar.getClass();
        if (cVar.k) {
            boolean z = update.getVelocity() > 0.0d;
            if (z) {
                cVar.g += (long) update.getTimeBetweenUpdatesMilli();
            } else if (!z) {
                cVar.h += (long) update.getTimeBetweenUpdatesMilli();
            }
        } else if (update.isLocked()) {
            cVar.k = true;
        }
        this.f26432a.o.f(update);
        I i = this.f26432a;
        String mapId = update.getMapId();
        if (mapId == null) {
            i.getClass();
            return;
        }
        MutableStateFlow mutableStateFlow = i.k;
        MappingData.Building.BuildingInfo buildingInfo = i.z;
        Object obj = null;
        if (buildingInfo != null && (floors = buildingInfo.getFloors()) != null) {
            ArrayList arrayList = new ArrayList();
            for (MappingData.Building.BuildingInfo.FloorMetadata floorMetadata : floors) {
                CollectionsKt.h(ArraysKt.l0(floorMetadata.getMaps()), arrayList);
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (Intrinsics.c(((MappingData.Building.BuildingInfo.FloorMetadata.MapMetadata) next).getMapId(), mapId)) {
                    obj = next;
                    break;
                }
            }
            obj = (MappingData.Building.BuildingInfo.FloorMetadata.MapMetadata) obj;
        }
        mutableStateFlow.setValue(obj);
    }

    public final void a(MappingData.Building.BuildingInfo.FloorMetadata floor) {
        String floorId;
        Intrinsics.h(floor, "floor");
        I.b(this.f26432a).d("OnDeviceEngine", "onCurrentFloorUpdate() called with: floor = " + floor);
        String floorId2 = floor.getFloorId();
        MappingData.Building.BuildingInfo.FloorMetadata floorMetadata = (MappingData.Building.BuildingInfo.FloorMetadata) this.f26432a.j.getValue();
        if (floorMetadata == null || (floorId = floorMetadata.getFloorId()) == null) {
            floorId = "";
        }
        if (Intrinsics.c(floorId2, floorId)) {
            return;
        }
        this.f26432a.j.setValue(floor);
        me.oriient.positioningengine.ondevice.models.c cVar = this.f26432a.A;
        String floorId3 = floor.getFloorId();
        long currentTimeMillis = ((TimeProvider) this.f26432a.r.getD()).getCurrentTimeMillis();
        cVar.getClass();
        Intrinsics.h(floorId3, "floorId");
        cVar.f26471a.add(new EngineSessionInfo.FloorChange(currentTimeMillis, floorId3));
        this.f26432a.l.f(new ActiveFloorUpdate(floor.getFloorId()));
        I.a(this.f26432a).i("OnDeviceEngine", "Current floor changed", new C1818e(floor));
    }
}
