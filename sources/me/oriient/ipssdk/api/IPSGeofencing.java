package me.oriient.ipssdk.api;

import android.content.Intent;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import java.util.List;
import kotlin.Deprecated;
import me.oriient.internal.services.elog.ELog;
import me.oriient.ipssdk.api.listeners.IPSLiveGeofenceListener;
import me.oriient.ipssdk.base.di.java.JavaDi;
import me.oriient.ipssdk.base.di.java.Lazy;
import me.oriient.ipssdk.common.geofencing.Geofencing;

@Keep
/* loaded from: classes2.dex */
public class IPSGeofencing {
    public static final String INTENT_BUILDING_IDS_KEY = "BuildingIds";
    public static final String INTENT_BUILDING_NAMES_KEY = "BuildingNames";
    public static final String INTENT_TRANSITION_TYPE_KEY = "TransitionType";
    private static final String TAG = "IPSGeofencing";

    @Deprecated
    public static final int TRANSITION_ENTER = 1;

    @Deprecated
    public static final int TRANSITION_EXIT = 2;

    @NonNull
    private static Lazy<ELog> eLog = JavaDi.inject(ELog.class);

    public static void addLiveGeofenceListener(@NonNull String str, @NonNull IPSLiveGeofenceListener iPSLiveGeofenceListener) {
        Geofencing.addLiveGeofenceListener(str, iPSLiveGeofenceListener);
    }

    public static void clearLiveGeofenceListeners() {
        Geofencing.clearLiveGeofencingListeners();
    }

    @NonNull
    @Deprecated
    public static List<String> getBuildingsNearBy() {
        return Geofencing.getBuildingsNearBy();
    }

    @Deprecated(forRemoval = true, since = "8.6.0")
    public static void registerToGeofencingEvents(@NonNull Intent intent) {
        eLog.getValue().api(TAG, "registerToGeofencingEvents() called with: intent = [" + intent + "]");
        Geofencing.registerToGeofencingEvents(intent);
    }

    public static void removeLiveGeofenceListener(@NonNull String str, @NonNull IPSLiveGeofenceListener iPSLiveGeofenceListener) {
        Geofencing.removeLiveGeofenceListener(str, iPSLiveGeofenceListener);
    }

    @Deprecated(forRemoval = true, since = "8.6.0")
    public static void unregisterFromGeofencingEvents() {
        eLog.getValue().api(TAG, "unregisterFromGeofencingEvents() called");
        Geofencing.unregisterFromGeofencingEvents();
    }
}
