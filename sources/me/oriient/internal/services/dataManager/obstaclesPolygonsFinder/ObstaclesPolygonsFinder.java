package me.oriient.internal.services.dataManager.obstaclesPolygonsFinder;

import androidx.annotation.Keep;
import kotlin.Metadata;
import me.oriient.internal.services.dataManager.common.FindPolygonResult;
import me.oriient.internal.services.dataManager.common.IndoorCoordinate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005¨\u0006\f"}, d2 = {"Lme/oriient/internal/services/dataManager/obstaclesPolygonsFinder/ObstaclesPolygonsFinder;", "", "buildingId", "", "getBuildingId", "()Ljava/lang/String;", "floorId", "getFloorId", "findClosestPolygon", "Lme/oriient/internal/services/dataManager/common/FindPolygonResult;", "point", "Lme/oriient/internal/services/dataManager/common/IndoorCoordinate;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ObstaclesPolygonsFinder {
    @Nullable
    FindPolygonResult findClosestPolygon(@NotNull IndoorCoordinate point);

    @NotNull
    String getBuildingId();

    @NotNull
    String getFloorId();
}
