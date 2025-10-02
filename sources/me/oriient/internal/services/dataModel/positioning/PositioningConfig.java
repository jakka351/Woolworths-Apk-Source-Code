package me.oriient.internal.services.dataModel.positioning;

import androidx.annotation.Keep;
import androidx.camera.core.impl.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.infra.locationManager.J;
import me.oriient.internal.infra.locationManager.K;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b4\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001TB»\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\u0006\u0010\u0015\u001a\u00020\t\u0012\u0006\u0010\u0016\u001a\u00020\t\u0012\u0006\u0010\u0017\u001a\u00020\u000e\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0006\u0010\u001b\u001a\u00020\u000e\u0012\u0006\u0010\u001c\u001a\u00020\u001d¢\u0006\u0002\u0010\u001eJ\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u000eHÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\tHÆ\u0003J\t\u0010>\u001a\u00020\tHÆ\u0003J\t\u0010?\u001a\u00020\tHÆ\u0003J\t\u0010@\u001a\u00020\tHÆ\u0003J\t\u0010A\u001a\u00020\tHÆ\u0003J\t\u0010B\u001a\u00020\u000eHÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\u000f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019HÆ\u0003J\t\u0010E\u001a\u00020\u000eHÆ\u0003J\t\u0010F\u001a\u00020\u001dHÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\t\u0010J\u001a\u00020\tHÆ\u0003J\t\u0010K\u001a\u00020\tHÆ\u0003J\t\u0010L\u001a\u00020\tHÆ\u0003J\t\u0010M\u001a\u00020\tHÆ\u0003Jë\u0001\u0010N\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u0017\u001a\u00020\u000e2\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u000e2\b\b\u0002\u0010\u001c\u001a\u00020\u001dHÆ\u0001J\u0013\u0010O\u001a\u00020\u00032\b\u0010P\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010Q\u001a\u00020RHÖ\u0001J\t\u0010S\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b%\u0010#R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b&\u0010#R\u0011\u0010\u001c\u001a\u00020\u001d¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0015\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b)\u0010#R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010 R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010 R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010 R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010 R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010 R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010 R\u0011\u0010\u0016\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b.\u0010#R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\u0017\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b1\u00100R\u0011\u0010\u0012\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b2\u0010#R\u0011\u0010\u001b\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b3\u00100R\u0011\u0010\u0014\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b4\u0010#R\u0011\u0010\u0013\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b5\u0010#R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\b\n\u0000\u001a\u0004\b6\u00107¨\u0006U"}, d2 = {"Lme/oriient/internal/services/dataModel/positioning/PositioningConfig;", "", "isPreheatingEnabledByDefault", "", "enableAutoStartPositioning", "enableAutoCalib", "ignorePublicAPIIsAutomaticCalibrationEnabled", "enableChargingBasedAutoStartPositioning", "autoStartPositioningPauseAfterAutoStopMillis", "", "autoStartPositioningPauseAfterErrorMillis", "autoStartPositioningPauseAfterClientStopMillis", "autoStartPositioningPauseAfterClientStartMillis", "maximumLocationAccuracyToAutoStartMeters", "", "isAutomaticPositioningPartOfCalibration", "allowPositioningOutOfBuilding", "allowPositioningWhenLocationIsUnknown", "positioningSessionTimeoutMillis", "stopNoMovementMillis", "stopBackgroundMillis", "backgroundCalibrationTimeoutMillis", "maxPositionAgeToEventTagMillis", "noMovementDeltaMeters", "supportedCustomEventTagTypes", "", "", "secondsSinceChargingToUseKiosk", "autoStop", "Lme/oriient/internal/services/dataModel/positioning/PositioningConfig$AutoStop;", "(ZZZZZJJJJDZZZJJJJJDLjava/util/List;DLme/oriient/internal/services/dataModel/positioning/PositioningConfig$AutoStop;)V", "getAllowPositioningOutOfBuilding", "()Z", "getAllowPositioningWhenLocationIsUnknown", "getAutoStartPositioningPauseAfterAutoStopMillis", "()J", "getAutoStartPositioningPauseAfterClientStartMillis", "getAutoStartPositioningPauseAfterClientStopMillis", "getAutoStartPositioningPauseAfterErrorMillis", "getAutoStop", "()Lme/oriient/internal/services/dataModel/positioning/PositioningConfig$AutoStop;", "getBackgroundCalibrationTimeoutMillis", "getEnableAutoCalib", "getEnableAutoStartPositioning", "getEnableChargingBasedAutoStartPositioning", "getIgnorePublicAPIIsAutomaticCalibrationEnabled", "getMaxPositionAgeToEventTagMillis", "getMaximumLocationAccuracyToAutoStartMeters", "()D", "getNoMovementDeltaMeters", "getPositioningSessionTimeoutMillis", "getSecondsSinceChargingToUseKiosk", "getStopBackgroundMillis", "getStopNoMovementMillis", "getSupportedCustomEventTagTypes", "()Ljava/util/List;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "AutoStop", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class PositioningConfig {
    private final boolean allowPositioningOutOfBuilding;
    private final boolean allowPositioningWhenLocationIsUnknown;
    private final long autoStartPositioningPauseAfterAutoStopMillis;
    private final long autoStartPositioningPauseAfterClientStartMillis;
    private final long autoStartPositioningPauseAfterClientStopMillis;
    private final long autoStartPositioningPauseAfterErrorMillis;

    @NotNull
    private final AutoStop autoStop;
    private final long backgroundCalibrationTimeoutMillis;
    private final boolean enableAutoCalib;
    private final boolean enableAutoStartPositioning;
    private final boolean enableChargingBasedAutoStartPositioning;
    private final boolean ignorePublicAPIIsAutomaticCalibrationEnabled;
    private final boolean isAutomaticPositioningPartOfCalibration;
    private final boolean isPreheatingEnabledByDefault;
    private final long maxPositionAgeToEventTagMillis;
    private final double maximumLocationAccuracyToAutoStartMeters;
    private final double noMovementDeltaMeters;
    private final long positioningSessionTimeoutMillis;
    private final double secondsSinceChargingToUseKiosk;
    private final long stopBackgroundMillis;
    private final long stopNoMovementMillis;

    @NotNull
    private final List<String> supportedCustomEventTagTypes;

    @Keep
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001:Bm\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0002\u0010\u0014J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\nHÆ\u0003J\t\u0010)\u001a\u00020\u0011HÆ\u0003J\t\u0010*\u001a\u00020\u000eHÆ\u0003J\t\u0010+\u001a\u00020\u000eHÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\bHÆ\u0003J\t\u00100\u001a\u00020\nHÆ\u0003J\t\u00101\u001a\u00020\bHÆ\u0003J\t\u00102\u001a\u00020\nHÆ\u0003J\t\u00103\u001a\u00020\u000eHÆ\u0003J\u008b\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u000eHÆ\u0001J\u0013\u00105\u001a\u00020\u00032\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u00020\nHÖ\u0001J\t\u00108\u001a\u000209HÖ\u0001R\u0011\u0010\u000f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0013\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u0012\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010#R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010#¨\u0006;"}, d2 = {"Lme/oriient/internal/services/dataModel/positioning/PositioningConfig$AutoStop;", "", "useBuildingGeofence", "", "useExternalRegion", "useExitRegions", "useCharging", "geofenceMaxDistanceMeters", "", "externalRegionSlidingWindowSize", "", "externalMaxDistanceFromBuildingMeters", "externalRequiredConsistentAttemptsToStop", "downloadExitRegionsRetryIntervalMillis", "", "downloadExitRegionsRetryCount", "exitRegionTriggerType", "Lme/oriient/internal/services/dataModel/positioning/PositioningConfig$AutoStop$ExitRegionTriggerType;", "exitRegionDwellTimeMillis", "exitRegionCooldownTimeMillis", "(ZZZZDIDIJILme/oriient/internal/services/dataModel/positioning/PositioningConfig$AutoStop$ExitRegionTriggerType;JJ)V", "getDownloadExitRegionsRetryCount", "()I", "getDownloadExitRegionsRetryIntervalMillis", "()J", "getExitRegionCooldownTimeMillis", "getExitRegionDwellTimeMillis", "getExitRegionTriggerType", "()Lme/oriient/internal/services/dataModel/positioning/PositioningConfig$AutoStop$ExitRegionTriggerType;", "getExternalMaxDistanceFromBuildingMeters", "()D", "getExternalRegionSlidingWindowSize", "getExternalRequiredConsistentAttemptsToStop", "getGeofenceMaxDistanceMeters", "getUseBuildingGeofence", "()Z", "getUseCharging", "getUseExitRegions", "getUseExternalRegion", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "", "ExitRegionTriggerType", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AutoStop {
        private final int downloadExitRegionsRetryCount;
        private final long downloadExitRegionsRetryIntervalMillis;
        private final long exitRegionCooldownTimeMillis;
        private final long exitRegionDwellTimeMillis;

        @NotNull
        private final ExitRegionTriggerType exitRegionTriggerType;
        private final double externalMaxDistanceFromBuildingMeters;
        private final int externalRegionSlidingWindowSize;
        private final int externalRequiredConsistentAttemptsToStop;
        private final double geofenceMaxDistanceMeters;
        private final boolean useBuildingGeofence;
        private final boolean useCharging;
        private final boolean useExitRegions;
        private final boolean useExternalRegion;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Keep
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lme/oriient/internal/services/dataModel/positioning/PositioningConfig$AutoStop$ExitRegionTriggerType;", "", "", "rawValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getRawValue$internal_publishRelease", "()Ljava/lang/String;", "Companion", "me/oriient/internal/services/dataModel/positioning/a", "ENTER", "DWELL", "EXIT", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ExitRegionTriggerType {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ ExitRegionTriggerType[] $VALUES;

            @NotNull
            public static final a Companion;

            @NotNull
            private final String rawValue;
            public static final ExitRegionTriggerType ENTER = new ExitRegionTriggerType("ENTER", 0, "enter");
            public static final ExitRegionTriggerType DWELL = new ExitRegionTriggerType("DWELL", 1, "dwell");
            public static final ExitRegionTriggerType EXIT = new ExitRegionTriggerType("EXIT", 2, "exit");

            private static final /* synthetic */ ExitRegionTriggerType[] $values() {
                return new ExitRegionTriggerType[]{ENTER, DWELL, EXIT};
            }

            static {
                ExitRegionTriggerType[] exitRegionTriggerTypeArr$values = $values();
                $VALUES = exitRegionTriggerTypeArr$values;
                $ENTRIES = EnumEntriesKt.a(exitRegionTriggerTypeArr$values);
                Companion = new a();
            }

            private ExitRegionTriggerType(String str, int i, String str2) {
                this.rawValue = str2;
            }

            @NotNull
            public static EnumEntries<ExitRegionTriggerType> getEntries() {
                return $ENTRIES;
            }

            public static ExitRegionTriggerType valueOf(String str) {
                return (ExitRegionTriggerType) Enum.valueOf(ExitRegionTriggerType.class, str);
            }

            public static ExitRegionTriggerType[] values() {
                return (ExitRegionTriggerType[]) $VALUES.clone();
            }

            @NotNull
            /* renamed from: getRawValue$internal_publishRelease, reason: from getter */
            public final String getRawValue() {
                return this.rawValue;
            }
        }

        public AutoStop(boolean z, boolean z2, boolean z3, boolean z4, double d, int i, double d2, int i2, long j, int i3, @NotNull ExitRegionTriggerType exitRegionTriggerType, long j2, long j3) {
            Intrinsics.h(exitRegionTriggerType, "exitRegionTriggerType");
            this.useBuildingGeofence = z;
            this.useExternalRegion = z2;
            this.useExitRegions = z3;
            this.useCharging = z4;
            this.geofenceMaxDistanceMeters = d;
            this.externalRegionSlidingWindowSize = i;
            this.externalMaxDistanceFromBuildingMeters = d2;
            this.externalRequiredConsistentAttemptsToStop = i2;
            this.downloadExitRegionsRetryIntervalMillis = j;
            this.downloadExitRegionsRetryCount = i3;
            this.exitRegionTriggerType = exitRegionTriggerType;
            this.exitRegionDwellTimeMillis = j2;
            this.exitRegionCooldownTimeMillis = j3;
        }

        public static /* synthetic */ AutoStop copy$default(AutoStop autoStop, boolean z, boolean z2, boolean z3, boolean z4, double d, int i, double d2, int i2, long j, int i3, ExitRegionTriggerType exitRegionTriggerType, long j2, long j3, int i4, Object obj) {
            long j4;
            long j5;
            boolean z5;
            boolean z6;
            boolean z7;
            double d3;
            int i5;
            double d4;
            int i6;
            long j6;
            int i7;
            ExitRegionTriggerType exitRegionTriggerType2;
            boolean z8 = (i4 & 1) != 0 ? autoStop.useBuildingGeofence : z;
            boolean z9 = (i4 & 2) != 0 ? autoStop.useExternalRegion : z2;
            boolean z10 = (i4 & 4) != 0 ? autoStop.useExitRegions : z3;
            boolean z11 = (i4 & 8) != 0 ? autoStop.useCharging : z4;
            double d5 = (i4 & 16) != 0 ? autoStop.geofenceMaxDistanceMeters : d;
            int i8 = (i4 & 32) != 0 ? autoStop.externalRegionSlidingWindowSize : i;
            double d6 = (i4 & 64) != 0 ? autoStop.externalMaxDistanceFromBuildingMeters : d2;
            int i9 = (i4 & 128) != 0 ? autoStop.externalRequiredConsistentAttemptsToStop : i2;
            long j7 = (i4 & 256) != 0 ? autoStop.downloadExitRegionsRetryIntervalMillis : j;
            int i10 = (i4 & 512) != 0 ? autoStop.downloadExitRegionsRetryCount : i3;
            ExitRegionTriggerType exitRegionTriggerType3 = (i4 & 1024) != 0 ? autoStop.exitRegionTriggerType : exitRegionTriggerType;
            boolean z12 = z8;
            boolean z13 = z9;
            long j8 = (i4 & 2048) != 0 ? autoStop.exitRegionDwellTimeMillis : j2;
            if ((i4 & 4096) != 0) {
                j5 = j8;
                j4 = autoStop.exitRegionCooldownTimeMillis;
                z6 = z10;
                z7 = z11;
                d3 = d5;
                i5 = i8;
                d4 = d6;
                i6 = i9;
                j6 = j7;
                i7 = i10;
                exitRegionTriggerType2 = exitRegionTriggerType3;
                z5 = z13;
            } else {
                j4 = j3;
                j5 = j8;
                z5 = z13;
                z6 = z10;
                z7 = z11;
                d3 = d5;
                i5 = i8;
                d4 = d6;
                i6 = i9;
                j6 = j7;
                i7 = i10;
                exitRegionTriggerType2 = exitRegionTriggerType3;
            }
            return autoStop.copy(z12, z5, z6, z7, d3, i5, d4, i6, j6, i7, exitRegionTriggerType2, j5, j4);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getUseBuildingGeofence() {
            return this.useBuildingGeofence;
        }

        /* renamed from: component10, reason: from getter */
        public final int getDownloadExitRegionsRetryCount() {
            return this.downloadExitRegionsRetryCount;
        }

        @NotNull
        /* renamed from: component11, reason: from getter */
        public final ExitRegionTriggerType getExitRegionTriggerType() {
            return this.exitRegionTriggerType;
        }

        /* renamed from: component12, reason: from getter */
        public final long getExitRegionDwellTimeMillis() {
            return this.exitRegionDwellTimeMillis;
        }

        /* renamed from: component13, reason: from getter */
        public final long getExitRegionCooldownTimeMillis() {
            return this.exitRegionCooldownTimeMillis;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getUseExternalRegion() {
            return this.useExternalRegion;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getUseExitRegions() {
            return this.useExitRegions;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getUseCharging() {
            return this.useCharging;
        }

        /* renamed from: component5, reason: from getter */
        public final double getGeofenceMaxDistanceMeters() {
            return this.geofenceMaxDistanceMeters;
        }

        /* renamed from: component6, reason: from getter */
        public final int getExternalRegionSlidingWindowSize() {
            return this.externalRegionSlidingWindowSize;
        }

        /* renamed from: component7, reason: from getter */
        public final double getExternalMaxDistanceFromBuildingMeters() {
            return this.externalMaxDistanceFromBuildingMeters;
        }

        /* renamed from: component8, reason: from getter */
        public final int getExternalRequiredConsistentAttemptsToStop() {
            return this.externalRequiredConsistentAttemptsToStop;
        }

        /* renamed from: component9, reason: from getter */
        public final long getDownloadExitRegionsRetryIntervalMillis() {
            return this.downloadExitRegionsRetryIntervalMillis;
        }

        @NotNull
        public final AutoStop copy(boolean useBuildingGeofence, boolean useExternalRegion, boolean useExitRegions, boolean useCharging, double geofenceMaxDistanceMeters, int externalRegionSlidingWindowSize, double externalMaxDistanceFromBuildingMeters, int externalRequiredConsistentAttemptsToStop, long downloadExitRegionsRetryIntervalMillis, int downloadExitRegionsRetryCount, @NotNull ExitRegionTriggerType exitRegionTriggerType, long exitRegionDwellTimeMillis, long exitRegionCooldownTimeMillis) {
            Intrinsics.h(exitRegionTriggerType, "exitRegionTriggerType");
            return new AutoStop(useBuildingGeofence, useExternalRegion, useExitRegions, useCharging, geofenceMaxDistanceMeters, externalRegionSlidingWindowSize, externalMaxDistanceFromBuildingMeters, externalRequiredConsistentAttemptsToStop, downloadExitRegionsRetryIntervalMillis, downloadExitRegionsRetryCount, exitRegionTriggerType, exitRegionDwellTimeMillis, exitRegionCooldownTimeMillis);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AutoStop)) {
                return false;
            }
            AutoStop autoStop = (AutoStop) other;
            return this.useBuildingGeofence == autoStop.useBuildingGeofence && this.useExternalRegion == autoStop.useExternalRegion && this.useExitRegions == autoStop.useExitRegions && this.useCharging == autoStop.useCharging && Double.compare(this.geofenceMaxDistanceMeters, autoStop.geofenceMaxDistanceMeters) == 0 && this.externalRegionSlidingWindowSize == autoStop.externalRegionSlidingWindowSize && Double.compare(this.externalMaxDistanceFromBuildingMeters, autoStop.externalMaxDistanceFromBuildingMeters) == 0 && this.externalRequiredConsistentAttemptsToStop == autoStop.externalRequiredConsistentAttemptsToStop && this.downloadExitRegionsRetryIntervalMillis == autoStop.downloadExitRegionsRetryIntervalMillis && this.downloadExitRegionsRetryCount == autoStop.downloadExitRegionsRetryCount && this.exitRegionTriggerType == autoStop.exitRegionTriggerType && this.exitRegionDwellTimeMillis == autoStop.exitRegionDwellTimeMillis && this.exitRegionCooldownTimeMillis == autoStop.exitRegionCooldownTimeMillis;
        }

        public final int getDownloadExitRegionsRetryCount() {
            return this.downloadExitRegionsRetryCount;
        }

        public final long getDownloadExitRegionsRetryIntervalMillis() {
            return this.downloadExitRegionsRetryIntervalMillis;
        }

        public final long getExitRegionCooldownTimeMillis() {
            return this.exitRegionCooldownTimeMillis;
        }

        public final long getExitRegionDwellTimeMillis() {
            return this.exitRegionDwellTimeMillis;
        }

        @NotNull
        public final ExitRegionTriggerType getExitRegionTriggerType() {
            return this.exitRegionTriggerType;
        }

        public final double getExternalMaxDistanceFromBuildingMeters() {
            return this.externalMaxDistanceFromBuildingMeters;
        }

        public final int getExternalRegionSlidingWindowSize() {
            return this.externalRegionSlidingWindowSize;
        }

        public final int getExternalRequiredConsistentAttemptsToStop() {
            return this.externalRequiredConsistentAttemptsToStop;
        }

        public final double getGeofenceMaxDistanceMeters() {
            return this.geofenceMaxDistanceMeters;
        }

        public final boolean getUseBuildingGeofence() {
            return this.useBuildingGeofence;
        }

        public final boolean getUseCharging() {
            return this.useCharging;
        }

        public final boolean getUseExitRegions() {
            return this.useExitRegions;
        }

        public final boolean getUseExternalRegion() {
            return this.useExternalRegion;
        }

        public int hashCode() {
            return Long.hashCode(this.exitRegionCooldownTimeMillis) + K.a(this.exitRegionDwellTimeMillis, (this.exitRegionTriggerType.hashCode() + me.oriient.internal.services.config.a.a(this.downloadExitRegionsRetryCount, K.a(this.downloadExitRegionsRetryIntervalMillis, me.oriient.internal.services.config.a.a(this.externalRequiredConsistentAttemptsToStop, J.a(this.externalMaxDistanceFromBuildingMeters, me.oriient.internal.services.config.a.a(this.externalRegionSlidingWindowSize, J.a(this.geofenceMaxDistanceMeters, me.oriient.internal.infra.scheduler.a.a(this.useCharging, me.oriient.internal.infra.scheduler.a.a(this.useExitRegions, me.oriient.internal.infra.scheduler.a.a(this.useExternalRegion, Boolean.hashCode(this.useBuildingGeofence) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31)) * 31, 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("AutoStop(useBuildingGeofence=");
            sb.append(this.useBuildingGeofence);
            sb.append(", useExternalRegion=");
            sb.append(this.useExternalRegion);
            sb.append(", useExitRegions=");
            sb.append(this.useExitRegions);
            sb.append(", useCharging=");
            sb.append(this.useCharging);
            sb.append(", geofenceMaxDistanceMeters=");
            sb.append(this.geofenceMaxDistanceMeters);
            sb.append(", externalRegionSlidingWindowSize=");
            sb.append(this.externalRegionSlidingWindowSize);
            sb.append(", externalMaxDistanceFromBuildingMeters=");
            sb.append(this.externalMaxDistanceFromBuildingMeters);
            sb.append(", externalRequiredConsistentAttemptsToStop=");
            sb.append(this.externalRequiredConsistentAttemptsToStop);
            sb.append(", downloadExitRegionsRetryIntervalMillis=");
            sb.append(this.downloadExitRegionsRetryIntervalMillis);
            sb.append(", downloadExitRegionsRetryCount=");
            sb.append(this.downloadExitRegionsRetryCount);
            sb.append(", exitRegionTriggerType=");
            sb.append(this.exitRegionTriggerType);
            sb.append(", exitRegionDwellTimeMillis=");
            sb.append(this.exitRegionDwellTimeMillis);
            sb.append(", exitRegionCooldownTimeMillis=");
            return b.q(sb, this.exitRegionCooldownTimeMillis, ')');
        }
    }

    public PositioningConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, long j, long j2, long j3, long j4, double d, boolean z6, boolean z7, boolean z8, long j5, long j6, long j7, long j8, long j9, double d2, @NotNull List<String> supportedCustomEventTagTypes, double d3, @NotNull AutoStop autoStop) {
        Intrinsics.h(supportedCustomEventTagTypes, "supportedCustomEventTagTypes");
        Intrinsics.h(autoStop, "autoStop");
        this.isPreheatingEnabledByDefault = z;
        this.enableAutoStartPositioning = z2;
        this.enableAutoCalib = z3;
        this.ignorePublicAPIIsAutomaticCalibrationEnabled = z4;
        this.enableChargingBasedAutoStartPositioning = z5;
        this.autoStartPositioningPauseAfterAutoStopMillis = j;
        this.autoStartPositioningPauseAfterErrorMillis = j2;
        this.autoStartPositioningPauseAfterClientStopMillis = j3;
        this.autoStartPositioningPauseAfterClientStartMillis = j4;
        this.maximumLocationAccuracyToAutoStartMeters = d;
        this.isAutomaticPositioningPartOfCalibration = z6;
        this.allowPositioningOutOfBuilding = z7;
        this.allowPositioningWhenLocationIsUnknown = z8;
        this.positioningSessionTimeoutMillis = j5;
        this.stopNoMovementMillis = j6;
        this.stopBackgroundMillis = j7;
        this.backgroundCalibrationTimeoutMillis = j8;
        this.maxPositionAgeToEventTagMillis = j9;
        this.noMovementDeltaMeters = d2;
        this.supportedCustomEventTagTypes = supportedCustomEventTagTypes;
        this.secondsSinceChargingToUseKiosk = d3;
        this.autoStop = autoStop;
    }

    public static /* synthetic */ PositioningConfig copy$default(PositioningConfig positioningConfig, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, long j, long j2, long j3, long j4, double d, boolean z6, boolean z7, boolean z8, long j5, long j6, long j7, long j8, long j9, double d2, List list, double d3, AutoStop autoStop, int i, Object obj) {
        AutoStop autoStop2;
        double d4;
        boolean z9;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        double d5;
        List list2;
        boolean z10;
        long j15;
        long j16;
        long j17;
        long j18;
        boolean z11;
        double d6;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15 = (i & 1) != 0 ? positioningConfig.isPreheatingEnabledByDefault : z;
        boolean z16 = (i & 2) != 0 ? positioningConfig.enableAutoStartPositioning : z2;
        boolean z17 = (i & 4) != 0 ? positioningConfig.enableAutoCalib : z3;
        boolean z18 = (i & 8) != 0 ? positioningConfig.ignorePublicAPIIsAutomaticCalibrationEnabled : z4;
        boolean z19 = (i & 16) != 0 ? positioningConfig.enableChargingBasedAutoStartPositioning : z5;
        long j19 = (i & 32) != 0 ? positioningConfig.autoStartPositioningPauseAfterAutoStopMillis : j;
        long j20 = (i & 64) != 0 ? positioningConfig.autoStartPositioningPauseAfterErrorMillis : j2;
        long j21 = (i & 128) != 0 ? positioningConfig.autoStartPositioningPauseAfterClientStopMillis : j3;
        long j22 = (i & 256) != 0 ? positioningConfig.autoStartPositioningPauseAfterClientStartMillis : j4;
        boolean z20 = z15;
        boolean z21 = z16;
        double d7 = (i & 512) != 0 ? positioningConfig.maximumLocationAccuracyToAutoStartMeters : d;
        boolean z22 = (i & 1024) != 0 ? positioningConfig.isAutomaticPositioningPartOfCalibration : z6;
        double d8 = d7;
        boolean z23 = (i & 2048) != 0 ? positioningConfig.allowPositioningOutOfBuilding : z7;
        boolean z24 = (i & 4096) != 0 ? positioningConfig.allowPositioningWhenLocationIsUnknown : z8;
        long j23 = (i & 8192) != 0 ? positioningConfig.positioningSessionTimeoutMillis : j5;
        long j24 = (i & 16384) != 0 ? positioningConfig.stopNoMovementMillis : j6;
        long j25 = (i & 32768) != 0 ? positioningConfig.stopBackgroundMillis : j7;
        long j26 = (i & 65536) != 0 ? positioningConfig.backgroundCalibrationTimeoutMillis : j8;
        long j27 = (i & 131072) != 0 ? positioningConfig.maxPositionAgeToEventTagMillis : j9;
        double d9 = (i & 262144) != 0 ? positioningConfig.noMovementDeltaMeters : d2;
        List list3 = (i & 524288) != 0 ? positioningConfig.supportedCustomEventTagTypes : list;
        double d10 = d9;
        double d11 = (i & 1048576) != 0 ? positioningConfig.secondsSinceChargingToUseKiosk : d3;
        if ((i & 2097152) != 0) {
            d4 = d11;
            autoStop2 = positioningConfig.autoStop;
            j11 = j24;
            j12 = j25;
            j13 = j26;
            j14 = j27;
            d5 = d10;
            list2 = list3;
            j16 = j20;
            j17 = j21;
            j18 = j22;
            z11 = z22;
            d6 = d8;
            z12 = z23;
            z9 = z24;
            j10 = j23;
            z13 = z17;
            z14 = z18;
            z10 = z19;
            j15 = j19;
        } else {
            autoStop2 = autoStop;
            d4 = d11;
            z9 = z24;
            j10 = j23;
            j11 = j24;
            j12 = j25;
            j13 = j26;
            j14 = j27;
            d5 = d10;
            list2 = list3;
            z10 = z19;
            j15 = j19;
            j16 = j20;
            j17 = j21;
            j18 = j22;
            z11 = z22;
            d6 = d8;
            z12 = z23;
            z13 = z17;
            z14 = z18;
        }
        return positioningConfig.copy(z20, z21, z13, z14, z10, j15, j16, j17, j18, d6, z11, z12, z9, j10, j11, j12, j13, j14, d5, list2, d4, autoStop2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsPreheatingEnabledByDefault() {
        return this.isPreheatingEnabledByDefault;
    }

    /* renamed from: component10, reason: from getter */
    public final double getMaximumLocationAccuracyToAutoStartMeters() {
        return this.maximumLocationAccuracyToAutoStartMeters;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsAutomaticPositioningPartOfCalibration() {
        return this.isAutomaticPositioningPartOfCalibration;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getAllowPositioningOutOfBuilding() {
        return this.allowPositioningOutOfBuilding;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getAllowPositioningWhenLocationIsUnknown() {
        return this.allowPositioningWhenLocationIsUnknown;
    }

    /* renamed from: component14, reason: from getter */
    public final long getPositioningSessionTimeoutMillis() {
        return this.positioningSessionTimeoutMillis;
    }

    /* renamed from: component15, reason: from getter */
    public final long getStopNoMovementMillis() {
        return this.stopNoMovementMillis;
    }

    /* renamed from: component16, reason: from getter */
    public final long getStopBackgroundMillis() {
        return this.stopBackgroundMillis;
    }

    /* renamed from: component17, reason: from getter */
    public final long getBackgroundCalibrationTimeoutMillis() {
        return this.backgroundCalibrationTimeoutMillis;
    }

    /* renamed from: component18, reason: from getter */
    public final long getMaxPositionAgeToEventTagMillis() {
        return this.maxPositionAgeToEventTagMillis;
    }

    /* renamed from: component19, reason: from getter */
    public final double getNoMovementDeltaMeters() {
        return this.noMovementDeltaMeters;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getEnableAutoStartPositioning() {
        return this.enableAutoStartPositioning;
    }

    @NotNull
    public final List<String> component20() {
        return this.supportedCustomEventTagTypes;
    }

    /* renamed from: component21, reason: from getter */
    public final double getSecondsSinceChargingToUseKiosk() {
        return this.secondsSinceChargingToUseKiosk;
    }

    @NotNull
    /* renamed from: component22, reason: from getter */
    public final AutoStop getAutoStop() {
        return this.autoStop;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getEnableAutoCalib() {
        return this.enableAutoCalib;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIgnorePublicAPIIsAutomaticCalibrationEnabled() {
        return this.ignorePublicAPIIsAutomaticCalibrationEnabled;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getEnableChargingBasedAutoStartPositioning() {
        return this.enableChargingBasedAutoStartPositioning;
    }

    /* renamed from: component6, reason: from getter */
    public final long getAutoStartPositioningPauseAfterAutoStopMillis() {
        return this.autoStartPositioningPauseAfterAutoStopMillis;
    }

    /* renamed from: component7, reason: from getter */
    public final long getAutoStartPositioningPauseAfterErrorMillis() {
        return this.autoStartPositioningPauseAfterErrorMillis;
    }

    /* renamed from: component8, reason: from getter */
    public final long getAutoStartPositioningPauseAfterClientStopMillis() {
        return this.autoStartPositioningPauseAfterClientStopMillis;
    }

    /* renamed from: component9, reason: from getter */
    public final long getAutoStartPositioningPauseAfterClientStartMillis() {
        return this.autoStartPositioningPauseAfterClientStartMillis;
    }

    @NotNull
    public final PositioningConfig copy(boolean isPreheatingEnabledByDefault, boolean enableAutoStartPositioning, boolean enableAutoCalib, boolean ignorePublicAPIIsAutomaticCalibrationEnabled, boolean enableChargingBasedAutoStartPositioning, long autoStartPositioningPauseAfterAutoStopMillis, long autoStartPositioningPauseAfterErrorMillis, long autoStartPositioningPauseAfterClientStopMillis, long autoStartPositioningPauseAfterClientStartMillis, double maximumLocationAccuracyToAutoStartMeters, boolean isAutomaticPositioningPartOfCalibration, boolean allowPositioningOutOfBuilding, boolean allowPositioningWhenLocationIsUnknown, long positioningSessionTimeoutMillis, long stopNoMovementMillis, long stopBackgroundMillis, long backgroundCalibrationTimeoutMillis, long maxPositionAgeToEventTagMillis, double noMovementDeltaMeters, @NotNull List<String> supportedCustomEventTagTypes, double secondsSinceChargingToUseKiosk, @NotNull AutoStop autoStop) {
        Intrinsics.h(supportedCustomEventTagTypes, "supportedCustomEventTagTypes");
        Intrinsics.h(autoStop, "autoStop");
        return new PositioningConfig(isPreheatingEnabledByDefault, enableAutoStartPositioning, enableAutoCalib, ignorePublicAPIIsAutomaticCalibrationEnabled, enableChargingBasedAutoStartPositioning, autoStartPositioningPauseAfterAutoStopMillis, autoStartPositioningPauseAfterErrorMillis, autoStartPositioningPauseAfterClientStopMillis, autoStartPositioningPauseAfterClientStartMillis, maximumLocationAccuracyToAutoStartMeters, isAutomaticPositioningPartOfCalibration, allowPositioningOutOfBuilding, allowPositioningWhenLocationIsUnknown, positioningSessionTimeoutMillis, stopNoMovementMillis, stopBackgroundMillis, backgroundCalibrationTimeoutMillis, maxPositionAgeToEventTagMillis, noMovementDeltaMeters, supportedCustomEventTagTypes, secondsSinceChargingToUseKiosk, autoStop);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PositioningConfig)) {
            return false;
        }
        PositioningConfig positioningConfig = (PositioningConfig) other;
        return this.isPreheatingEnabledByDefault == positioningConfig.isPreheatingEnabledByDefault && this.enableAutoStartPositioning == positioningConfig.enableAutoStartPositioning && this.enableAutoCalib == positioningConfig.enableAutoCalib && this.ignorePublicAPIIsAutomaticCalibrationEnabled == positioningConfig.ignorePublicAPIIsAutomaticCalibrationEnabled && this.enableChargingBasedAutoStartPositioning == positioningConfig.enableChargingBasedAutoStartPositioning && this.autoStartPositioningPauseAfterAutoStopMillis == positioningConfig.autoStartPositioningPauseAfterAutoStopMillis && this.autoStartPositioningPauseAfterErrorMillis == positioningConfig.autoStartPositioningPauseAfterErrorMillis && this.autoStartPositioningPauseAfterClientStopMillis == positioningConfig.autoStartPositioningPauseAfterClientStopMillis && this.autoStartPositioningPauseAfterClientStartMillis == positioningConfig.autoStartPositioningPauseAfterClientStartMillis && Double.compare(this.maximumLocationAccuracyToAutoStartMeters, positioningConfig.maximumLocationAccuracyToAutoStartMeters) == 0 && this.isAutomaticPositioningPartOfCalibration == positioningConfig.isAutomaticPositioningPartOfCalibration && this.allowPositioningOutOfBuilding == positioningConfig.allowPositioningOutOfBuilding && this.allowPositioningWhenLocationIsUnknown == positioningConfig.allowPositioningWhenLocationIsUnknown && this.positioningSessionTimeoutMillis == positioningConfig.positioningSessionTimeoutMillis && this.stopNoMovementMillis == positioningConfig.stopNoMovementMillis && this.stopBackgroundMillis == positioningConfig.stopBackgroundMillis && this.backgroundCalibrationTimeoutMillis == positioningConfig.backgroundCalibrationTimeoutMillis && this.maxPositionAgeToEventTagMillis == positioningConfig.maxPositionAgeToEventTagMillis && Double.compare(this.noMovementDeltaMeters, positioningConfig.noMovementDeltaMeters) == 0 && Intrinsics.c(this.supportedCustomEventTagTypes, positioningConfig.supportedCustomEventTagTypes) && Double.compare(this.secondsSinceChargingToUseKiosk, positioningConfig.secondsSinceChargingToUseKiosk) == 0 && Intrinsics.c(this.autoStop, positioningConfig.autoStop);
    }

    public final boolean getAllowPositioningOutOfBuilding() {
        return this.allowPositioningOutOfBuilding;
    }

    public final boolean getAllowPositioningWhenLocationIsUnknown() {
        return this.allowPositioningWhenLocationIsUnknown;
    }

    public final long getAutoStartPositioningPauseAfterAutoStopMillis() {
        return this.autoStartPositioningPauseAfterAutoStopMillis;
    }

    public final long getAutoStartPositioningPauseAfterClientStartMillis() {
        return this.autoStartPositioningPauseAfterClientStartMillis;
    }

    public final long getAutoStartPositioningPauseAfterClientStopMillis() {
        return this.autoStartPositioningPauseAfterClientStopMillis;
    }

    public final long getAutoStartPositioningPauseAfterErrorMillis() {
        return this.autoStartPositioningPauseAfterErrorMillis;
    }

    @NotNull
    public final AutoStop getAutoStop() {
        return this.autoStop;
    }

    public final long getBackgroundCalibrationTimeoutMillis() {
        return this.backgroundCalibrationTimeoutMillis;
    }

    public final boolean getEnableAutoCalib() {
        return this.enableAutoCalib;
    }

    public final boolean getEnableAutoStartPositioning() {
        return this.enableAutoStartPositioning;
    }

    public final boolean getEnableChargingBasedAutoStartPositioning() {
        return this.enableChargingBasedAutoStartPositioning;
    }

    public final boolean getIgnorePublicAPIIsAutomaticCalibrationEnabled() {
        return this.ignorePublicAPIIsAutomaticCalibrationEnabled;
    }

    public final long getMaxPositionAgeToEventTagMillis() {
        return this.maxPositionAgeToEventTagMillis;
    }

    public final double getMaximumLocationAccuracyToAutoStartMeters() {
        return this.maximumLocationAccuracyToAutoStartMeters;
    }

    public final double getNoMovementDeltaMeters() {
        return this.noMovementDeltaMeters;
    }

    public final long getPositioningSessionTimeoutMillis() {
        return this.positioningSessionTimeoutMillis;
    }

    public final double getSecondsSinceChargingToUseKiosk() {
        return this.secondsSinceChargingToUseKiosk;
    }

    public final long getStopBackgroundMillis() {
        return this.stopBackgroundMillis;
    }

    public final long getStopNoMovementMillis() {
        return this.stopNoMovementMillis;
    }

    @NotNull
    public final List<String> getSupportedCustomEventTagTypes() {
        return this.supportedCustomEventTagTypes;
    }

    public int hashCode() {
        return this.autoStop.hashCode() + J.a(this.secondsSinceChargingToUseKiosk, b.d(J.a(this.noMovementDeltaMeters, K.a(this.maxPositionAgeToEventTagMillis, K.a(this.backgroundCalibrationTimeoutMillis, K.a(this.stopBackgroundMillis, K.a(this.stopNoMovementMillis, K.a(this.positioningSessionTimeoutMillis, me.oriient.internal.infra.scheduler.a.a(this.allowPositioningWhenLocationIsUnknown, me.oriient.internal.infra.scheduler.a.a(this.allowPositioningOutOfBuilding, me.oriient.internal.infra.scheduler.a.a(this.isAutomaticPositioningPartOfCalibration, J.a(this.maximumLocationAccuracyToAutoStartMeters, K.a(this.autoStartPositioningPauseAfterClientStartMillis, K.a(this.autoStartPositioningPauseAfterClientStopMillis, K.a(this.autoStartPositioningPauseAfterErrorMillis, K.a(this.autoStartPositioningPauseAfterAutoStopMillis, me.oriient.internal.infra.scheduler.a.a(this.enableChargingBasedAutoStartPositioning, me.oriient.internal.infra.scheduler.a.a(this.ignorePublicAPIIsAutomaticCalibrationEnabled, me.oriient.internal.infra.scheduler.a.a(this.enableAutoCalib, me.oriient.internal.infra.scheduler.a.a(this.enableAutoStartPositioning, Boolean.hashCode(this.isPreheatingEnabledByDefault) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31, this.supportedCustomEventTagTypes), 31);
    }

    public final boolean isAutomaticPositioningPartOfCalibration() {
        return this.isAutomaticPositioningPartOfCalibration;
    }

    public final boolean isPreheatingEnabledByDefault() {
        return this.isPreheatingEnabledByDefault;
    }

    @NotNull
    public String toString() {
        return "PositioningConfig(isPreheatingEnabledByDefault=" + this.isPreheatingEnabledByDefault + ", enableAutoStartPositioning=" + this.enableAutoStartPositioning + ", enableAutoCalib=" + this.enableAutoCalib + ", ignorePublicAPIIsAutomaticCalibrationEnabled=" + this.ignorePublicAPIIsAutomaticCalibrationEnabled + ", enableChargingBasedAutoStartPositioning=" + this.enableChargingBasedAutoStartPositioning + ", autoStartPositioningPauseAfterAutoStopMillis=" + this.autoStartPositioningPauseAfterAutoStopMillis + ", autoStartPositioningPauseAfterErrorMillis=" + this.autoStartPositioningPauseAfterErrorMillis + ", autoStartPositioningPauseAfterClientStopMillis=" + this.autoStartPositioningPauseAfterClientStopMillis + ", autoStartPositioningPauseAfterClientStartMillis=" + this.autoStartPositioningPauseAfterClientStartMillis + ", maximumLocationAccuracyToAutoStartMeters=" + this.maximumLocationAccuracyToAutoStartMeters + ", isAutomaticPositioningPartOfCalibration=" + this.isAutomaticPositioningPartOfCalibration + ", allowPositioningOutOfBuilding=" + this.allowPositioningOutOfBuilding + ", allowPositioningWhenLocationIsUnknown=" + this.allowPositioningWhenLocationIsUnknown + ", positioningSessionTimeoutMillis=" + this.positioningSessionTimeoutMillis + ", stopNoMovementMillis=" + this.stopNoMovementMillis + ", stopBackgroundMillis=" + this.stopBackgroundMillis + ", backgroundCalibrationTimeoutMillis=" + this.backgroundCalibrationTimeoutMillis + ", maxPositionAgeToEventTagMillis=" + this.maxPositionAgeToEventTagMillis + ", noMovementDeltaMeters=" + this.noMovementDeltaMeters + ", supportedCustomEventTagTypes=" + this.supportedCustomEventTagTypes + ", secondsSinceChargingToUseKiosk=" + this.secondsSinceChargingToUseKiosk + ", autoStop=" + this.autoStop + ')';
    }
}
