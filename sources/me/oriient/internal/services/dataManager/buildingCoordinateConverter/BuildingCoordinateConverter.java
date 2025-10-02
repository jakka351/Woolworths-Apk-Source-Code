package me.oriient.internal.services.dataManager.buildingCoordinateConverter;

import androidx.annotation.Keep;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.dataManager.common.Heading;
import me.oriient.internal.services.dataManager.common.IndoorCoordinate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0018\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0003J\u0018\u0010\f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0003J\u0018\u0010\u0012\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0003J\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0003J\b\u0010\u0013\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lme/oriient/internal/services/dataManager/buildingCoordinateConverter/BuildingCoordinateConverter;", "", "buildingId", "", "floorConverters", "", "Lme/oriient/internal/services/dataManager/buildingCoordinateConverter/FloorCoordinatesConverter;", "(Ljava/lang/String;Ljava/util/Map;)V", "getBuildingId", "()Ljava/lang/String;", "getFloorConverters", "()Ljava/util/Map;", "convertFromOriient", "Lme/oriient/internal/services/dataManager/common/Heading;", "heading", "floorId", "Lme/oriient/internal/services/dataManager/common/IndoorCoordinate;", "coordinate", "convertToOriient", "toString", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BuildingCoordinateConverter {

    @NotNull
    private final String buildingId;

    @NotNull
    private final Map<String, FloorCoordinatesConverter> floorConverters;

    public BuildingCoordinateConverter(@NotNull String buildingId, @NotNull Map<String, FloorCoordinatesConverter> floorConverters) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(floorConverters, "floorConverters");
        this.buildingId = buildingId;
        this.floorConverters = floorConverters;
    }

    @Nullable
    public final IndoorCoordinate convertFromOriient(@NotNull IndoorCoordinate coordinate, @NotNull String floorId) {
        Intrinsics.h(coordinate, "coordinate");
        Intrinsics.h(floorId, "floorId");
        FloorCoordinatesConverter floorCoordinatesConverter = this.floorConverters.get(floorId);
        if (floorCoordinatesConverter != null) {
            return floorCoordinatesConverter.convertFromOriient(coordinate);
        }
        return null;
    }

    @Nullable
    public final IndoorCoordinate convertToOriient(@NotNull IndoorCoordinate coordinate, @NotNull String floorId) {
        Intrinsics.h(coordinate, "coordinate");
        Intrinsics.h(floorId, "floorId");
        FloorCoordinatesConverter floorCoordinatesConverter = this.floorConverters.get(floorId);
        if (floorCoordinatesConverter != null) {
            return floorCoordinatesConverter.convertToOriient(coordinate);
        }
        return null;
    }

    @NotNull
    public final String getBuildingId() {
        return this.buildingId;
    }

    @NotNull
    public final Map<String, FloorCoordinatesConverter> getFloorConverters() {
        return this.floorConverters;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("BuildingCoordinateConverter(buildingId='");
        sb.append(this.buildingId);
        sb.append("', floorConverters=");
        return android.support.v4.media.session.a.u(sb, this.floorConverters, ')');
    }

    @Nullable
    public final Heading convertFromOriient(@NotNull Heading heading, @NotNull String floorId) {
        Intrinsics.h(heading, "heading");
        Intrinsics.h(floorId, "floorId");
        FloorCoordinatesConverter floorCoordinatesConverter = this.floorConverters.get(floorId);
        if (floorCoordinatesConverter != null) {
            return floorCoordinatesConverter.convertFromOriient(heading);
        }
        return null;
    }

    @Nullable
    public final Heading convertToOriient(@NotNull Heading heading, @NotNull String floorId) {
        Intrinsics.h(heading, "heading");
        Intrinsics.h(floorId, "floorId");
        FloorCoordinatesConverter floorCoordinatesConverter = this.floorConverters.get(floorId);
        if (floorCoordinatesConverter != null) {
            return floorCoordinatesConverter.convertToOriient(heading);
        }
        return null;
    }
}
