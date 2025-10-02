package me.oriient.positioningengine.ondevice.mappingData;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import me.oriient.internal.infra.utils.core.DiProvidable;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.positioningengine.common.util.PositioningEngineError;
import me.oriient.positioningengine.ondevice.mappingData.MappingData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\bJ2\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH¦@¢\u0006\u0002\u0010\u000eJ:\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH¦@¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, d2 = {"Lme/oriient/positioningengine/ondevice/mappingData/MappingDataProvider;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "getBuildingData", "Lme/oriient/internal/infra/utils/core/Outcome;", "Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Building;", "Lme/oriient/positioningengine/common/util/PositioningEngineError;", "buildingId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFloorData", "Lme/oriient/positioningengine/ondevice/mappingData/MappingData$FloorFullData;", "floorId", "priority", "", "(Ljava/lang/String;Ljava/lang/String;DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMapData", "Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map;", "mapId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface MappingDataProvider extends DiProvidable {
    @Nullable
    Object getBuildingData(@NotNull String str, @NotNull Continuation<? super Outcome<MappingData.Building, PositioningEngineError>> continuation);

    @Nullable
    Object getFloorData(@NotNull String str, @NotNull String str2, double d, @NotNull Continuation<? super Outcome<MappingData.FloorFullData, PositioningEngineError>> continuation);

    @Nullable
    Object getMapData(@NotNull String str, @NotNull String str2, @NotNull String str3, double d, @NotNull Continuation<? super Outcome<MappingData.Map, PositioningEngineError>> continuation);
}
