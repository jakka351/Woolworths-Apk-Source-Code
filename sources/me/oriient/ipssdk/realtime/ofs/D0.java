package me.oriient.ipssdk.realtime.ofs;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import me.oriient.internal.services.dataManager.building.Building;
import me.oriient.ipssdk.realtime.ips.CoreLogic;
import me.oriient.ipssdk.realtime.utils.models.Position;
import me.oriient.positioningengine.common.PositioningUpdate;

/* loaded from: classes8.dex */
public final class D0 implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public static final D0 f25924a = new D0();

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        String id;
        PositioningUpdate positioningUpdate = (PositioningUpdate) obj;
        CoreLogic coreLogic = CoreLogic.INSTANCE;
        Building activeBuilding = coreLogic.getActiveBuilding();
        if (activeBuilding == null || (id = activeBuilding.getId()) == null) {
            id = "";
        }
        CoreLogic.access$onPositioningUpdate(coreLogic, new Position(positioningUpdate, id, CoreLogic.access$getTimeProvider(coreLogic).getTimeZoneGmt()), positioningUpdate);
        return Unit.f24250a;
    }
}
