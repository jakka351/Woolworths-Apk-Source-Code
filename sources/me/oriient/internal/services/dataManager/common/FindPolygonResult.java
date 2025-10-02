package me.oriient.internal.services.dataManager.common;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.dataManager.building.E;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lme/oriient/internal/services/dataManager/common/FindPolygonResult;", "", "polygon", "", "Lme/oriient/internal/services/dataManager/common/IndoorCoordinate;", "closestPoint", "distance", "", "(Ljava/util/List;Lme/oriient/internal/services/dataManager/common/IndoorCoordinate;D)V", "getClosestPoint", "()Lme/oriient/internal/services/dataManager/common/IndoorCoordinate;", "getDistance", "()D", "getPolygon", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class FindPolygonResult {

    @NotNull
    private final IndoorCoordinate closestPoint;
    private final double distance;

    @NotNull
    private final List<IndoorCoordinate> polygon;

    public FindPolygonResult(@NotNull List<IndoorCoordinate> polygon, @NotNull IndoorCoordinate closestPoint, double d) {
        Intrinsics.h(polygon, "polygon");
        Intrinsics.h(closestPoint, "closestPoint");
        this.polygon = polygon;
        this.closestPoint = closestPoint;
        this.distance = d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FindPolygonResult copy$default(FindPolygonResult findPolygonResult, List list, IndoorCoordinate indoorCoordinate, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            list = findPolygonResult.polygon;
        }
        if ((i & 2) != 0) {
            indoorCoordinate = findPolygonResult.closestPoint;
        }
        if ((i & 4) != 0) {
            d = findPolygonResult.distance;
        }
        return findPolygonResult.copy(list, indoorCoordinate, d);
    }

    @NotNull
    public final List<IndoorCoordinate> component1() {
        return this.polygon;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final IndoorCoordinate getClosestPoint() {
        return this.closestPoint;
    }

    /* renamed from: component3, reason: from getter */
    public final double getDistance() {
        return this.distance;
    }

    @NotNull
    public final FindPolygonResult copy(@NotNull List<IndoorCoordinate> polygon, @NotNull IndoorCoordinate closestPoint, double distance) {
        Intrinsics.h(polygon, "polygon");
        Intrinsics.h(closestPoint, "closestPoint");
        return new FindPolygonResult(polygon, closestPoint, distance);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FindPolygonResult)) {
            return false;
        }
        FindPolygonResult findPolygonResult = (FindPolygonResult) other;
        return Intrinsics.c(this.polygon, findPolygonResult.polygon) && Intrinsics.c(this.closestPoint, findPolygonResult.closestPoint) && Double.compare(this.distance, findPolygonResult.distance) == 0;
    }

    @NotNull
    public final IndoorCoordinate getClosestPoint() {
        return this.closestPoint;
    }

    public final double getDistance() {
        return this.distance;
    }

    @NotNull
    public final List<IndoorCoordinate> getPolygon() {
        return this.polygon;
    }

    public int hashCode() {
        return Double.hashCode(this.distance) + ((this.closestPoint.hashCode() + (this.polygon.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("FindPolygonResult(polygon=");
        sb.append(this.polygon);
        sb.append(", closestPoint=");
        sb.append(this.closestPoint);
        sb.append(", distance=");
        return E.a(sb, this.distance, ')');
    }
}
