package me.oriient.ipssdk.ips;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import me.oriient.internal.services.elog.ELog;
import me.oriient.ipssdk.api.listeners.IPSCompletionListener;
import me.oriient.ipssdk.api.listeners.IPSCurrentRestrictedAreaListener;
import me.oriient.ipssdk.api.listeners.IPSPositioningListener;
import me.oriient.ipssdk.api.models.IPSBuilding;
import me.oriient.ipssdk.api.models.IPSCoordinate;
import me.oriient.ipssdk.api.models.IPSFloor;
import me.oriient.ipssdk.api.models.IPSGlobalCoordinate;
import me.oriient.ipssdk.api.models.IPSPosition;
import me.oriient.ipssdk.api.models.IPSRestrictedArea;
import me.oriient.ipssdk.api.models.IPSStartingPosition;
import me.oriient.ipssdk.api.utils.ExperimentalEventTagApi;
import me.oriient.ipssdk.base.di.java.JavaDi;
import me.oriient.ipssdk.common.BuildConfig;
import me.oriient.ipssdk.realtime.ips.Positioning;
import me.oriient.positioningengine.common.EngineStopReason;

@Keep
/* loaded from: classes4.dex */
public class IPSPositioning {
    private static final String TAG = "IPSPositioning";

    @Keep
    @Retention(RetentionPolicy.SOURCE)
    public @interface PositioningEngineState {
        public static final int CALIBRATING = 1;
        public static final int IDLE = 0;
        public static final int POSITIONING_AND_CALIBRATING = 2;
    }

    public enum a {
        BUILDING_ID("buildingId"),
        FLOOR_ORDER("floorOrder"),
        START_POSITION_X("startPositionX"),
        START_POSITION_Y("startPositionY"),
        START_POSITION_ACCURACY("startPositionAcc"),
        CAN_START_OUTSIDE("canStartOutside");


        @NonNull
        private final String value;

        a(@NonNull String str) {
            this.value = str;
        }

        @NonNull
        public String getValue() {
            return this.value;
        }
    }

    private IPSPositioning() {
    }

    public static void addCurrentRestrictedAreaListener(IPSCurrentRestrictedAreaListener iPSCurrentRestrictedAreaListener) {
        Positioning.INSTANCE.addCurrentRestrictedAreaListener(iPSCurrentRestrictedAreaListener);
    }

    public static void addPositioningListener(@NonNull IPSPositioningListener iPSPositioningListener) {
        Positioning.INSTANCE.addPositioningListener(iPSPositioningListener);
    }

    @NonNull
    public static IPSGlobalCoordinate convertCoordinateToGlobalCoordinate(@NonNull IPSCoordinate iPSCoordinate, @NonNull IPSGlobalCoordinate iPSGlobalCoordinate, double d) {
        return Positioning.INSTANCE.convertCoordinateToGlobalCoordinate(iPSCoordinate, iPSGlobalCoordinate, d);
    }

    @NonNull
    public static IPSCoordinate convertGlobalCoordinateToBuildingCoordinate(@NonNull IPSGlobalCoordinate iPSGlobalCoordinate, @NonNull IPSGlobalCoordinate iPSGlobalCoordinate2, double d) {
        return Positioning.INSTANCE.convertGlobalCoordinateToBuildingCoordinate(iPSGlobalCoordinate, iPSGlobalCoordinate2, d);
    }

    public static void defineCurrentBuilding(@NonNull IPSBuilding iPSBuilding) {
        HashMap map = new HashMap();
        map.put("buildingId", iPSBuilding.getId());
        map.put("buildingName", iPSBuilding.getName());
        ((ELog) JavaDi.get(ELog.class)).api(TAG, "defineCurrentBuilding", map);
        Positioning.INSTANCE.defineCurrentBuilding(iPSBuilding);
    }

    @NonNull
    public static String describePositioningEngineState(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown" : "Positioning And Calibrating" : "Calibrating" : "Idle";
    }

    @Nullable
    public static Integer getCalibrationNeededReason() {
        return Positioning.INSTANCE.getCalibrationNeededReason();
    }

    public static double getCalibrationProgress() {
        return Positioning.INSTANCE.getCalibrationProgress();
    }

    @Nullable
    public static IPSBuilding getCurrentBuilding() {
        return Positioning.INSTANCE.getCurrentIPSBuilding();
    }

    @Nullable
    public static IPSFloor getCurrentFloor() {
        return Positioning.INSTANCE.getCurrentIPSFloor();
    }

    @Nullable
    public static IPSRestrictedArea getCurrentRestrictedArea() {
        return Positioning.INSTANCE.getCurrentRestrictedArea();
    }

    @Nullable
    public static String getCurrentSessionId() {
        ((ELog) JavaDi.get(ELog.class)).api(TAG, "getCurrentSessionId");
        return Positioning.INSTANCE.getCurrentSessionId();
    }

    public static long getCurrentTimeMilli() {
        return Positioning.INSTANCE.getCurrentTime();
    }

    @Nullable
    public static IPSPosition getLastKnownLockedPosition() {
        return Positioning.INSTANCE.getLastKnownLockedPosition();
    }

    @Nullable
    public static IPSPosition getLastKnownPosition() {
        return Positioning.INSTANCE.getLastKnownPosition();
    }

    public static int getPositioningEngineState() {
        return Positioning.INSTANCE.getPublicPositioningEngineState();
    }

    @Deprecated(forRemoval = true, since = BuildConfig.LIB_VERSION_NAME)
    public static double getTestLockThreshold() {
        return Positioning.INSTANCE.getLockThreshold();
    }

    public static long getTimeFromStartOfCurrentSessionMilli() {
        return Positioning.INSTANCE.getTimeFromStartOfSession();
    }

    public static boolean isAutomaticCalibrationEnabled() {
        return ((Boolean) Positioning.INSTANCE.isPreheatingEnabled().getValue()).booleanValue();
    }

    public static boolean isCalibrationGestureNeeded() {
        return Positioning.INSTANCE.isCalibrationGestureNeeded();
    }

    public static boolean isLimitedConnectionSupported() {
        return Positioning.INSTANCE.isLimitedConnectionSupported();
    }

    public static boolean isPositionLocked(@NonNull IPSPosition iPSPosition) {
        return Positioning.INSTANCE.isPositionLocked(iPSPosition);
    }

    private static void logStartPositioning(@NonNull String str, @Nullable Integer num, @Nullable IPSStartingPosition iPSStartingPosition, @Nullable Boolean bool) {
        HashMap map = new HashMap();
        map.put(a.BUILDING_ID.value, str);
        map.put(a.FLOOR_ORDER.value, num);
        if (iPSStartingPosition != null) {
            map.put(a.START_POSITION_X.value, Double.valueOf(iPSStartingPosition.getD()));
            map.put(a.START_POSITION_Y.value, Double.valueOf(iPSStartingPosition.getE()));
            map.put(a.START_POSITION_ACCURACY.value, Double.valueOf(iPSStartingPosition.getC()));
        }
        map.put(a.CAN_START_OUTSIDE.value, bool);
        ((ELog) JavaDi.get(ELog.class)).api(TAG, "Start positioning.", map);
    }

    public static void removeCurrentRestrictedAreaListener(IPSCurrentRestrictedAreaListener iPSCurrentRestrictedAreaListener) {
        Positioning.INSTANCE.removeCurrentRestrictedAreaListener(iPSCurrentRestrictedAreaListener);
    }

    public static void removePositioningListener(@NonNull IPSPositioningListener iPSPositioningListener) {
        Positioning.INSTANCE.removePositioningListener(iPSPositioningListener);
    }

    @ExperimentalEventTagApi
    public static void sendCustomEventTag(@NonNull String str, @Nullable String str2, @NonNull String str3, @Nullable IPSCompletionListener iPSCompletionListener) {
        Positioning.INSTANCE.sendCustomEventTag(str, str2, str3, iPSCompletionListener);
    }

    public static void sendEventTag(@NonNull String str, @Nullable String str2, @Nullable IPSCompletionListener iPSCompletionListener) {
        Positioning.INSTANCE.sendEventTag(str, str2, 0, iPSCompletionListener);
    }

    public static void setAutomaticCalibrationEnabled(boolean z) {
        ((ELog) JavaDi.get(ELog.class)).api(TAG, "setAutomaticCalibrationEnabled() called with: enabled = [" + z + "]");
        Positioning.INSTANCE.setPreheatingEnabled(z);
    }

    public static void setLastKnownPosition(@Nullable IPSPosition iPSPosition) {
        ((ELog) JavaDi.get(ELog.class)).api(TAG, "setLastKnownPosition() called with: position = [" + iPSPosition + "]");
        Positioning.INSTANCE.setLastKnownPosition(iPSPosition);
    }

    @Deprecated(forRemoval = true, since = BuildConfig.LIB_VERSION_NAME)
    public static void setTestLockThreshold(double d) {
        ((ELog) JavaDi.get(ELog.class)).api(TAG, "setLockThreshold() called with: threshold = [" + d + "]");
        Positioning.INSTANCE.setLockThreshold(d);
    }

    public static void startCalibration(@Nullable IPSCompletionListener iPSCompletionListener) {
        ((ELog) JavaDi.get(ELog.class)).api(TAG, "startCalibration() called with: listener = [" + iPSCompletionListener + "]");
        Positioning.INSTANCE.startCalibration(true, null, iPSCompletionListener);
    }

    public static void startPositioning(@NonNull String str, @Nullable Integer num, @Nullable IPSStartingPosition iPSStartingPosition, @Nullable IPSCompletionListener iPSCompletionListener) {
        logStartPositioning(str, num, iPSStartingPosition, null);
        Positioning.INSTANCE.startPositioning(str, num, iPSStartingPosition, (Boolean) null, iPSCompletionListener);
    }

    public static void stopCalibration(@Nullable IPSCompletionListener iPSCompletionListener) {
        ((ELog) JavaDi.get(ELog.class)).api(TAG, "stopCalibration() called with: listener = [" + iPSCompletionListener + "]");
        Positioning.INSTANCE.stopCalibration(iPSCompletionListener);
    }

    public static void stopPositioning(@Nullable IPSCompletionListener iPSCompletionListener) {
        ((ELog) JavaDi.get(ELog.class)).api(TAG, "stopPositioning() called with: listener = [" + iPSCompletionListener + "]");
        Positioning.INSTANCE.stopPositioning(new EngineStopReason.UserInitiated(null), iPSCompletionListener);
    }

    @Nullable
    public static IPSGlobalCoordinate convertCoordinateToGlobalCoordinate(@NonNull IPSCoordinate iPSCoordinate, @NonNull IPSBuilding iPSBuilding) {
        return Positioning.INSTANCE.convertCoordinateToGlobalCoordinate(iPSCoordinate, iPSBuilding);
    }

    @Nullable
    public static IPSCoordinate convertGlobalCoordinateToBuildingCoordinate(@NonNull IPSGlobalCoordinate iPSGlobalCoordinate, @NonNull IPSBuilding iPSBuilding) {
        return Positioning.INSTANCE.convertGlobalCoordinateToBuildingCoordinate(iPSGlobalCoordinate, iPSBuilding);
    }

    public static void sendEventTag(@NonNull String str, @Nullable String str2, int i, @Nullable IPSCompletionListener iPSCompletionListener) {
        Positioning.INSTANCE.sendEventTag(str, str2, i, iPSCompletionListener);
    }

    public static void startPositioning(@NonNull String str, @Nullable Integer num, @Nullable IPSStartingPosition iPSStartingPosition, boolean z, @Nullable IPSCompletionListener iPSCompletionListener) {
        logStartPositioning(str, num, iPSStartingPosition, Boolean.valueOf(z));
        Positioning.INSTANCE.startPositioning(str, num, iPSStartingPosition, Boolean.valueOf(z), iPSCompletionListener);
    }

    public static void stopPositioning(@NonNull String str, @Nullable IPSCompletionListener iPSCompletionListener) {
        ((ELog) JavaDi.get(ELog.class)).api(TAG, "stopPositioning() called with: reason = [" + str + "], listener = [" + iPSCompletionListener + "]");
        Positioning.INSTANCE.stopPositioning(new EngineStopReason.UserInitiated(str), iPSCompletionListener);
    }

    public static void startPositioning(@NonNull IPSBuilding iPSBuilding, @Nullable Integer num, @Nullable IPSStartingPosition iPSStartingPosition, @Nullable IPSCompletionListener iPSCompletionListener) {
        logStartPositioning(iPSBuilding.getId(), num, iPSStartingPosition, null);
        Positioning.INSTANCE.startPositioning(iPSBuilding, num, iPSStartingPosition, (Boolean) null, iPSCompletionListener);
    }

    public static void startPositioning(@NonNull IPSBuilding iPSBuilding, @Nullable Integer num, @Nullable IPSStartingPosition iPSStartingPosition, boolean z, @Nullable IPSCompletionListener iPSCompletionListener) {
        logStartPositioning(iPSBuilding.getId(), num, iPSStartingPosition, Boolean.valueOf(z));
        Positioning.INSTANCE.startPositioning(iPSBuilding, num, iPSStartingPosition, Boolean.valueOf(z), iPSCompletionListener);
    }
}
