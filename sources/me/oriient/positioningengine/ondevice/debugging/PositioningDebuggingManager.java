package me.oriient.positioningengine.ondevice.debugging;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import me.oriient.internal.infra.utils.core.DiProvidable;
import me.oriient.positioningengine.ondevice.mappingData.MappingData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001c\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H&J\b\u0010\u0014\u001a\u00020\u000fH&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u0004\u0018\u00010\tX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0015"}, d2 = {"Lme/oriient/positioningengine/ondevice/debugging/PositioningDebuggingManager;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "", "getActive", "()Z", "setActive", "(Z)V", "walk", "Lme/oriient/positioningengine/ondevice/debugging/PositioningDebuggingWalk;", "getWalk", "()Lme/oriient/positioningengine/ondevice/debugging/PositioningDebuggingWalk;", "setWalk", "(Lme/oriient/positioningengine/ondevice/debugging/PositioningDebuggingWalk;)V", "startPositioning", "", "building", "Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Building;", "floor", "Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Building$BuildingInfo$FloorMetadata;", "stop", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface PositioningDebuggingManager extends DiProvidable {
    boolean getActive();

    @Nullable
    PositioningDebuggingWalk getWalk();

    void setActive(boolean z);

    void setWalk(@Nullable PositioningDebuggingWalk positioningDebuggingWalk);

    void startPositioning(@NotNull MappingData.Building building, @Nullable MappingData.Building.BuildingInfo.FloorMetadata floor);

    void stop();
}
