package me.oriient.internal.services.dataManager.obstaclesPolygonsFinder;

import androidx.annotation.Keep;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.infra.utils.core.Mapable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0016\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0013H\u0016J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0015"}, d2 = {"Lme/oriient/internal/services/dataManager/obstaclesPolygonsFinder/ObstaclesPolygonsFinderFetchData;", "Lme/oriient/internal/infra/utils/core/Mapable;", "buildingId", "", "floorId", "(Ljava/lang/String;Ljava/lang/String;)V", "getBuildingId", "()Ljava/lang/String;", "getFloorId", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toMap", "", "toString", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ObstaclesPolygonsFinderFetchData implements Mapable {

    @NotNull
    private final String buildingId;

    @NotNull
    private final String floorId;

    public ObstaclesPolygonsFinderFetchData(@NotNull String buildingId, @NotNull String floorId) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(floorId, "floorId");
        this.buildingId = buildingId;
        this.floorId = floorId;
    }

    public static /* synthetic */ ObstaclesPolygonsFinderFetchData copy$default(ObstaclesPolygonsFinderFetchData obstaclesPolygonsFinderFetchData, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = obstaclesPolygonsFinderFetchData.buildingId;
        }
        if ((i & 2) != 0) {
            str2 = obstaclesPolygonsFinderFetchData.floorId;
        }
        return obstaclesPolygonsFinderFetchData.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getBuildingId() {
        return this.buildingId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getFloorId() {
        return this.floorId;
    }

    @NotNull
    public final ObstaclesPolygonsFinderFetchData copy(@NotNull String buildingId, @NotNull String floorId) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(floorId, "floorId");
        return new ObstaclesPolygonsFinderFetchData(buildingId, floorId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ObstaclesPolygonsFinderFetchData)) {
            return false;
        }
        ObstaclesPolygonsFinderFetchData obstaclesPolygonsFinderFetchData = (ObstaclesPolygonsFinderFetchData) other;
        return Intrinsics.c(this.buildingId, obstaclesPolygonsFinderFetchData.buildingId) && Intrinsics.c(this.floorId, obstaclesPolygonsFinderFetchData.floorId);
    }

    @NotNull
    public final String getBuildingId() {
        return this.buildingId;
    }

    @NotNull
    public final String getFloorId() {
        return this.floorId;
    }

    public int hashCode() {
        return this.floorId.hashCode() + (this.buildingId.hashCode() * 31);
    }

    @Override // me.oriient.internal.infra.utils.core.Mapable
    @NotNull
    public Map<String, Object> toMap() {
        return MapsKt.j(new Pair("buildingId", this.buildingId), new Pair("floorId", this.floorId));
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("ObstaclesPolygonsFinderFetchData(buildingId=");
        sb.append(this.buildingId);
        sb.append(", floorId=");
        return me.oriient.internal.infra.rest.e.a(sb, this.floorId, ')');
    }
}
