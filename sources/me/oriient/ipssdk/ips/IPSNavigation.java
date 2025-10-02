package me.oriient.ipssdk.ips;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.List;
import me.oriient.internal.services.elog.ELog;
import me.oriient.ipssdk.api.listeners.IPSLiveNavigationListener;
import me.oriient.ipssdk.api.listeners.IPSRouteListener;
import me.oriient.ipssdk.api.models.IPSCancelable;
import me.oriient.ipssdk.api.models.IPSCoordinate;
import me.oriient.ipssdk.api.models.IPSWaypoint;
import me.oriient.ipssdk.api.utils.IPSNavigationOptions;
import me.oriient.ipssdk.api.utils.OriientExperimentalApi;
import me.oriient.ipssdk.base.di.java.JavaDi;
import me.oriient.ipssdk.realtime.ips.Navigation;

@Keep
/* loaded from: classes4.dex */
public class IPSNavigation {
    private static final String TAG = "IPSNavigation";

    private IPSNavigation() {
    }

    public static void addLiveNavigationListener(@NonNull IPSLiveNavigationListener iPSLiveNavigationListener) {
        ((ELog) JavaDi.get(ELog.class)).api(TAG, "addLiveNavigationListener() called with: listener = [" + iPSLiveNavigationListener + "]");
        Navigation.INSTANCE.addLiveNavigationListener(iPSLiveNavigationListener);
    }

    @Nullable
    public static IPSCancelable findRouteInBuilding(@NonNull String str, @NonNull IPSNavigationOptions iPSNavigationOptions, @NonNull List<? extends IPSWaypoint> list, @Nullable IPSRouteListener iPSRouteListener) {
        HashMap mapR = androidx.constraintlayout.core.state.a.r("buildingId", str);
        mapR.put("waypointsCount", "" + list.size());
        mapR.put("withFinalWaypoint", "false");
        ((ELog) JavaDi.get(ELog.class)).api(TAG, "findRouteInBuilding", mapR);
        return Navigation.INSTANCE.findRouteInBuilding(str, iPSNavigationOptions, list, null, iPSRouteListener);
    }

    public static double getAngleFromUserHeading(@NonNull IPSCoordinate iPSCoordinate) {
        return Navigation.INSTANCE.getAngleFromUserHeading(iPSCoordinate);
    }

    @Nullable
    public static IPSWaypoint getFinalLiveNavigationWaypoint() {
        return Navigation.INSTANCE.getLiveNavigationFinalWaypoint();
    }

    @Nullable
    public static IPSNavigationOptions getLiveNavigationOptions() {
        return Navigation.INSTANCE.getLiveNavigationOptions();
    }

    @NonNull
    public static List<? extends IPSWaypoint> getLiveNavigationWayPoints() {
        return Navigation.INSTANCE.getLiveNavigationWaypoints();
    }

    @Deprecated
    public static boolean isLimitedConnectionSupported() {
        return Navigation.INSTANCE.getLimitedConnectionSupported();
    }

    public static boolean isLiveNavigationEnabled() {
        return Navigation.INSTANCE.isLiveNavigationEnabled();
    }

    public static void removeLiveNavigationListener(@NonNull IPSLiveNavigationListener iPSLiveNavigationListener) {
        ((ELog) JavaDi.get(ELog.class)).api(TAG, "removeLiveNavigationListener() called");
        Navigation.INSTANCE.removeLiveNavigationListener(iPSLiveNavigationListener);
    }

    public static void setFinalLiveNavigationWaypoint(@Nullable IPSWaypoint iPSWaypoint) {
        Navigation.INSTANCE.setLiveNavigationFinalWaypoint(iPSWaypoint);
    }

    public static void setLiveNavigationEnabled(boolean z) {
        ((ELog) JavaDi.get(ELog.class)).api(TAG, "setLiveNavigationEnabled() called with: enabled = [" + z + "]");
        Navigation.INSTANCE.setLiveNavigationEnabled(z);
    }

    public static void setLiveNavigationOptions(@Nullable IPSNavigationOptions iPSNavigationOptions) {
        ((ELog) JavaDi.get(ELog.class)).api(TAG, "setLiveNavigationOptions() called with: options = [" + iPSNavigationOptions + "]");
        Navigation.INSTANCE.setLiveNavigationOptions(iPSNavigationOptions);
    }

    public static void setLiveNavigationWayPoints(@NonNull List<? extends IPSWaypoint> list) {
        HashMap map = new HashMap();
        map.put("waypointsCount", "" + list.size());
        ((ELog) JavaDi.get(ELog.class)).api(TAG, "setLiveNavigationWaypoints", map);
        Navigation.INSTANCE.setLiveNavigationWaypoints(list);
    }

    @OriientExperimentalApi
    public static void setTurnByTurnNavigationEnabled(boolean z) {
        HashMap map = new HashMap();
        map.put("enabled", Boolean.valueOf(z));
        ((ELog) JavaDi.get(ELog.class)).api(TAG, "setTurnByTurnNavigationEnabled", map);
        Navigation.INSTANCE.setTurnByTurnNavigationEnabled(z);
    }

    @Nullable
    public static IPSCancelable findRouteInBuilding(@NonNull String str, @NonNull List<? extends IPSWaypoint> list, @Nullable IPSRouteListener iPSRouteListener) {
        HashMap mapR = androidx.constraintlayout.core.state.a.r("buildingId", str);
        mapR.put("waypointsCount", "" + list.size());
        mapR.put("withFinalWaypoint", "false");
        ((ELog) JavaDi.get(ELog.class)).api(TAG, "findRouteInBuilding", mapR);
        return Navigation.INSTANCE.findRouteInBuilding(str, null, list, null, iPSRouteListener);
    }

    @Nullable
    public static IPSCancelable findRouteInBuilding(@NonNull String str, @NonNull List<? extends IPSWaypoint> list, @Nullable IPSWaypoint iPSWaypoint, @Nullable IPSRouteListener iPSRouteListener) {
        HashMap mapR = androidx.constraintlayout.core.state.a.r("buildingId", str);
        mapR.put("waypointsCount", "" + list.size());
        StringBuilder sb = new StringBuilder("");
        sb.append(iPSWaypoint != null);
        mapR.put("withFinalWaypoint", sb.toString());
        ((ELog) JavaDi.get(ELog.class)).api(TAG, "findRouteInBuilding", mapR);
        return Navigation.INSTANCE.findRouteInBuilding(str, null, list, iPSWaypoint, iPSRouteListener);
    }
}
