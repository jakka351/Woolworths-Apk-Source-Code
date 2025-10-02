package me.oriient.internal.infra.utils.core;

import androidx.annotation.Keep;
import kotlin.Metadata;
import me.oriient.internal.services.dataManager.common.IndoorCoordinate;
import me.oriient.internal.services.dataManager.common.WorldCoordinate;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J \u0010\t\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J \u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\r"}, d2 = {"Lme/oriient/internal/infra/utils/core/GlobalCoordinatesConverter;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "convertBuildingCoordinateToGlobal", "Lme/oriient/internal/services/dataManager/common/WorldCoordinate;", "coordinate", "Lme/oriient/internal/services/dataManager/common/IndoorCoordinate;", "buildingOrigin", "buildingRotation", "", "convertGlobalCoordinateToBuilding", "convertHeadingToAzimuth", "headingX", "headingY", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface GlobalCoordinatesConverter extends DiProvidable {
    @NotNull
    WorldCoordinate convertBuildingCoordinateToGlobal(@NotNull IndoorCoordinate coordinate, @NotNull WorldCoordinate buildingOrigin, double buildingRotation);

    @NotNull
    IndoorCoordinate convertGlobalCoordinateToBuilding(@NotNull WorldCoordinate coordinate, @NotNull WorldCoordinate buildingOrigin, double buildingRotation);

    double convertHeadingToAzimuth(double headingX, double headingY, double buildingRotation);
}
