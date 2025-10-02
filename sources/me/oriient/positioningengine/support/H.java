package me.oriient.positioningengine.support;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.FlowCollector;
import me.oriient.positioningengine.ondevice.mappingData.MappingData;

/* loaded from: classes8.dex */
public final class H implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f26502a;
    public final /* synthetic */ OnDeviceSessionsUploadManagerImpl b;

    public H(Ref.ObjectRef objectRef, OnDeviceSessionsUploadManagerImpl onDeviceSessionsUploadManagerImpl) {
        this.f26502a = objectRef;
        this.b = onDeviceSessionsUploadManagerImpl;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        MappingData.Building.BuildingInfo.FloorMetadata.MapMetadata mapMetadata = (MappingData.Building.BuildingInfo.FloorMetadata.MapMetadata) obj;
        Ref.ObjectRef objectRef = this.f26502a;
        Object obj2 = objectRef.d;
        Unit unit = Unit.f24250a;
        if (obj2 == null && mapMetadata != null) {
            OnDeviceSessionsUploadManagerImpl onDeviceSessionsUploadManagerImpl = this.b;
            objectRef.d = mapMetadata;
            Object objUpdateMapMetadata = onDeviceSessionsUploadManagerImpl.updateMapMetadata(mapMetadata, continuation);
            if (objUpdateMapMetadata == CoroutineSingletons.d) {
                return objUpdateMapMetadata;
            }
        }
        return unit;
    }
}
