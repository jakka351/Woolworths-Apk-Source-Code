package me.oriient.positioningengine.support;

import com.salesforce.marketingcloud.storage.db.h;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class Z {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Z[] $VALUES;

    @NotNull
    private final String value;
    public static final Z userSessionId = new Z("userSessionId", 0, "userSessionId");
    public static final Z userId = new Z("userId", 1, "userId");
    public static final Z initiatedBy = new Z("initiatedBy", 2, "initiatedBy");
    public static final Z initialCalibration = new Z("initialCalibration", 3, "initCalib");
    public static final Z initDataShift = new Z("initDataShift", 4, "initDataShift");
    public static final Z finalCalibration = new Z("finalCalibration", 5, "calibEst");
    public static final Z finalDataShift = new Z("finalDataShift", 6, "dataShift");
    public static final Z closestCalibId = new Z("closestCalibId", 7, "closestCalibId");
    public static final Z engineVersion = new Z("engineVersion", 8, "engineVersion");
    public static final Z engineVersionTag = new Z("engineVersionTag", 9, "tag");
    public static final Z engineAnalytics = new Z("engineAnalytics", 10, "rtEngineAnalytics");
    public static final Z calibSuccess = new Z("calibSuccess", 11, "calibSuccess");
    public static final Z engineMode = new Z("engineMode", 12, "engineMode");
    public static final Z onDevice = new Z("onDevice", 13, "onDevice");
    public static final Z calibSuccessDate = new Z("calibSuccessDate", 14, "calibSuccessDatetimeUtc");
    public static final Z additionalMetadata = new Z("additionalMetadata", 15, "additionalMetadata");
    public static final Z predefinedDataShift = new Z("predefinedDataShift", 16, "predefinedDataShift");
    public static final Z latitude = new Z(h.a.b, 17, h.a.b);
    public static final Z longitude = new Z(h.a.c, 18, h.a.c);
    public static final Z buildingId = new Z("buildingId", 19, "buildingId");
    public static final Z buildingName = new Z("buildingName", 20, "buildingName");
    public static final Z mapId = new Z("mapId", 21, "mapId");
    public static final Z mapName = new Z("mapName", 22, "mapName");
    public static final Z floorName = new Z("floorName", 23, "floorName");
    public static final Z floorOrder = new Z("floorOrder", 24, "floorOrder");
    public static final Z floorId = new Z("floorId", 25, "floorId");
    public static final Z sensorsDataUploadingEnabled = new Z("sensorsDataUploadingEnabled", 26, "sensorsDataUploadingEnabled");
    public static final Z positionsUploadingEnabled = new Z("positionsUploadingEnabled", 27, "positionsUploadingEnabled");
    public static final Z validationUploadingEnabled = new Z("validationUploadingEnabled", 28, "validationUploadingEnabled");
    public static final Z eventsUploadingEnabled = new Z("eventsUploadingEnabled", 29, "eventsUploadingEnabled");
    public static final Z strictMode = new Z("strictMode", 30, "strictMode");
    public static final Z isSmartCart = new Z("isSmartCart", 31, "isSmartCart");
    public static final Z positioningSessionCountInUserSession = new Z("positioningSessionCountInUserSession", 32, "positioningSessionCountInUserSession");
    public static final Z calibSessionCountInUserSession = new Z("calibSessionCountInUserSession", 33, "calibSessionCountInUserSession");
    public static final Z sessionTimeDiffFromPrevPositioningSessionInUserSession = new Z("sessionTimeDiffFromPrevPositioningSessionInUserSession", 34, "sessionTimeDiffFromPrevPositioningSessionInUserSession");
    public static final Z sessionTimeDiffFromPrevCalibrationSessionInUserSession = new Z("sessionTimeDiffFromPrevCalibrationSessionInUserSession", 35, "sessionTimeDiffFromPrevCalibrationSessionInUserSession");
    public static final Z mappingDataPreloadingStatus = new Z("mappingDataPreloadingStatus", 36, "mappingDataPreloadingStatus");
    public static final Z initialFloorIds = new Z("initialFloorIds", 37, "initialFloorIds");
    public static final Z restrictedAreasValidationUploadingEnabled = new Z("restrictedAreasValidationUploadingEnabled", 38, "restrictedAreasValidationUploadingEnabled");
    public static final Z chargingStateUpdates = new Z("chargingStateUpdates", 39, "chargingStateUpdates");
    public static final Z isConnectedToCharger = new Z("isConnectedToCharger", 40, "isConnectedToCharger");
    public static final Z chargingStateTimestamp = new Z("chargingStateTimestamp", 41, "timestamp");
    public static final Z chargingStateFloorOrder = new Z("chargingStateFloorOrder", 42, "floorOrder");
    public static final Z chargingStateLocation = new Z("chargingStateLocation", 43, "location");
    public static final Z chargingStateLocationX = new Z("chargingStateLocationX", 44, "x");
    public static final Z chargingStateLocationY = new Z("chargingStateLocationY", 45, "y");
    public static final Z chargingStateAccuracy = new Z("chargingStateAccuracy", 46, "accuracy");
    public static final Z chargingStateLockProgress = new Z("chargingStateLockProgress", 47, "lockProgress");
    public static final Z isSilentMode = new Z("isSilentMode", 48, "isSilentMode");
    public static final Z didExitSilentMode = new Z("didExitSilentMode", 49, "didExitSilentMode");
    public static final Z deviceId = new Z("deviceId", 50, "deviceId");
    public static final Z deviceType = new Z("deviceType", 51, "deviceType");
    public static final Z loginSessionId = new Z("loginSessionId", 52, "loginSessionId");
    public static final Z useFusedLocationProvider = new Z("useFusedLocationProvider", 53, "useFusedLocationProvider");

    private static final /* synthetic */ Z[] $values() {
        return new Z[]{userSessionId, userId, initiatedBy, initialCalibration, initDataShift, finalCalibration, finalDataShift, closestCalibId, engineVersion, engineVersionTag, engineAnalytics, calibSuccess, engineMode, onDevice, calibSuccessDate, additionalMetadata, predefinedDataShift, latitude, longitude, buildingId, buildingName, mapId, mapName, floorName, floorOrder, floorId, sensorsDataUploadingEnabled, positionsUploadingEnabled, validationUploadingEnabled, eventsUploadingEnabled, strictMode, isSmartCart, positioningSessionCountInUserSession, calibSessionCountInUserSession, sessionTimeDiffFromPrevPositioningSessionInUserSession, sessionTimeDiffFromPrevCalibrationSessionInUserSession, mappingDataPreloadingStatus, initialFloorIds, restrictedAreasValidationUploadingEnabled, chargingStateUpdates, isConnectedToCharger, chargingStateTimestamp, chargingStateFloorOrder, chargingStateLocation, chargingStateLocationX, chargingStateLocationY, chargingStateAccuracy, chargingStateLockProgress, isSilentMode, didExitSilentMode, deviceId, deviceType, loginSessionId, useFusedLocationProvider};
    }

    static {
        Z[] zArr$values = $values();
        $VALUES = zArr$values;
        $ENTRIES = EnumEntriesKt.a(zArr$values);
    }

    private Z(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<Z> getEntries() {
        return $ENTRIES;
    }

    public static Z valueOf(String str) {
        return (Z) Enum.valueOf(Z.class, str);
    }

    public static Z[] values() {
        return (Z[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
