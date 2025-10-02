package me.oriient.internal.services.dataModel.navigation;

import androidx.annotation.Keep;
import kotlin.Metadata;

@Keep
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0012\u0010\u000e\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Lme/oriient/internal/services/dataModel/navigation/NavigationMetrics;", "", "avgRouteCalcTimeMillis", "", "getAvgRouteCalcTimeMillis", "()J", "maxRouteCalcTimeMillis", "getMaxRouteCalcTimeMillis", "routeMaxNumWaypoints", "", "getRouteMaxNumWaypoints", "()I", "routeRecalculationCount", "getRouteRecalculationCount", "routeWaypointUpdateCount", "getRouteWaypointUpdateCount", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface NavigationMetrics {
    long getAvgRouteCalcTimeMillis();

    long getMaxRouteCalcTimeMillis();

    int getRouteMaxNumWaypoints();

    int getRouteRecalculationCount();

    int getRouteWaypointUpdateCount();
}
