package me.oriient.positioningengine.support;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import me.oriient.positioningengine.common.PositioningUpdate;
import me.oriient.positioningengine.common.models.IndoorCoordinate;

/* renamed from: me.oriient.positioningengine.support.z, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1865z implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OnDeviceSessionsUploadManagerImpl f26577a;

    public C1865z(OnDeviceSessionsUploadManagerImpl onDeviceSessionsUploadManagerImpl) {
        this.f26577a = onDeviceSessionsUploadManagerImpl;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        List list = this.f26577a.chargingStateUpdates;
        long currentTimeGmt = this.f26577a.getTimeProvider().getCurrentTimeGmt();
        PositioningUpdate positioningUpdate = this.f26577a.lastPositionUpdate;
        Integer floorOrder = positioningUpdate != null ? positioningUpdate.getFloorOrder() : null;
        PositioningUpdate positioningUpdate2 = this.f26577a.lastPositionUpdate;
        IndoorCoordinate indoorCoordinate = positioningUpdate2 != null ? new IndoorCoordinate((float) positioningUpdate2.getX(), (float) positioningUpdate2.getY()) : null;
        PositioningUpdate positioningUpdate3 = this.f26577a.lastPositionUpdate;
        Double d = positioningUpdate3 != null ? new Double(positioningUpdate3.getAccuracy()) : null;
        PositioningUpdate positioningUpdate4 = this.f26577a.lastPositionUpdate;
        list.add(new C1839a(zBooleanValue, currentTimeGmt, floorOrder, indoorCoordinate, d, positioningUpdate4 != null ? new Double(positioningUpdate4.getLockProgress()) : null));
        return Unit.f24250a;
    }
}
