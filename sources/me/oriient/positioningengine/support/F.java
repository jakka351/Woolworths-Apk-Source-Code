package me.oriient.positioningengine.support;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.FlowCollector;
import me.oriient.positioningengine.ondevice.mappingData.MappingData;

/* loaded from: classes8.dex */
public final class F implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f26500a;
    public final /* synthetic */ OnDeviceSessionsUploadManagerImpl b;

    public F(Ref.ObjectRef objectRef, OnDeviceSessionsUploadManagerImpl onDeviceSessionsUploadManagerImpl) {
        this.f26500a = objectRef;
        this.b = onDeviceSessionsUploadManagerImpl;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        Object objUpdateFloorMetadata;
        MappingData.Building.BuildingInfo.FloorMetadata floorMetadata = (MappingData.Building.BuildingInfo.FloorMetadata) obj;
        Ref.ObjectRef objectRef = this.f26500a;
        Object obj2 = objectRef.d;
        Unit unit = Unit.f24250a;
        if (obj2 == null) {
            objectRef.d = floorMetadata;
            return (floorMetadata == null || (objUpdateFloorMetadata = this.b.updateFloorMetadata(floorMetadata, continuation)) != CoroutineSingletons.d) ? unit : objUpdateFloorMetadata;
        }
        if (floorMetadata == null) {
            objectRef.d = null;
        }
        return unit;
    }
}
