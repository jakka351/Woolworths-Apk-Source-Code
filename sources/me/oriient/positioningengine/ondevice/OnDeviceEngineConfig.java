package me.oriient.positioningengine.ondevice;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.dataModel.engine.OnDeviceEngineCoreConfigProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0001=Bs\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010!\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b#\u0010\u0019J\u0088\u0001\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b)\u0010\u0017J\u001a\u0010+\u001a\u00020\u00072\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b/\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b1\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b\b\u0010\u0019R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b4\u0010\u001bR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b6\u0010\u001dR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b7\u0010\u001bR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b8\u0010\u001bR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u00103\u001a\u0004\b9\u0010\u001bR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010:\u001a\u0004\b;\u0010\"R\u0017\u0010\u0010\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0010\u00102\u001a\u0004\b\u0010\u0010\u0019¨\u0006>"}, d2 = {"Lme/oriient/positioningengine/ondevice/OnDeviceEngineConfig;", "", "", "calibrationExpirationTimeMillis", "sessionProgressLogsIntervalMillis", "", "engineUpdatesBufferSize", "", "isSmartCartMode", "pdrPredictionAlpha", "positioningExtrapolatePath", "maxTimeToFastForwardSeconds", "mainOrientationBorderAngleDegrees", "mainOrientationDiffAngleDegrees", "Lme/oriient/internal/services/dataModel/engine/OnDeviceEngineCoreConfigProvider;", "coreConfigProvider", "isPositioningDebuggingEnabled", "<init>", "(DDIZLjava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lme/oriient/internal/services/dataModel/engine/OnDeviceEngineCoreConfigProvider;Z)V", "component1", "()D", "component2", "component3", "()I", "component4", "()Z", "component5", "()Ljava/lang/Double;", "component6", "()Ljava/lang/Boolean;", "component7", "component8", "component9", "component10", "()Lme/oriient/internal/services/dataModel/engine/OnDeviceEngineCoreConfigProvider;", "component11", "copy", "(DDIZLjava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lme/oriient/internal/services/dataModel/engine/OnDeviceEngineCoreConfigProvider;Z)Lme/oriient/positioningengine/ondevice/OnDeviceEngineConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "D", "getCalibrationExpirationTimeMillis", "getSessionProgressLogsIntervalMillis", "I", "getEngineUpdatesBufferSize", "Z", "Ljava/lang/Double;", "getPdrPredictionAlpha", "Ljava/lang/Boolean;", "getPositioningExtrapolatePath", "getMaxTimeToFastForwardSeconds", "getMainOrientationBorderAngleDegrees", "getMainOrientationDiffAngleDegrees", "Lme/oriient/internal/services/dataModel/engine/OnDeviceEngineCoreConfigProvider;", "getCoreConfigProvider", "Companion", "me/oriient/positioningengine/ondevice/J", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class OnDeviceEngineConfig {

    @NotNull
    public static final J Companion = new J();
    private final double calibrationExpirationTimeMillis;

    @NotNull
    private final OnDeviceEngineCoreConfigProvider coreConfigProvider;
    private final int engineUpdatesBufferSize;
    private final boolean isPositioningDebuggingEnabled;
    private final boolean isSmartCartMode;

    @Nullable
    private final Double mainOrientationBorderAngleDegrees;

    @Nullable
    private final Double mainOrientationDiffAngleDegrees;

    @Nullable
    private final Double maxTimeToFastForwardSeconds;

    @Nullable
    private final Double pdrPredictionAlpha;

    @Nullable
    private final Boolean positioningExtrapolatePath;
    private final double sessionProgressLogsIntervalMillis;

    public OnDeviceEngineConfig(double d, double d2, int i, boolean z, @Nullable Double d3, @Nullable Boolean bool, @Nullable Double d4, @Nullable Double d5, @Nullable Double d6, @NotNull OnDeviceEngineCoreConfigProvider coreConfigProvider, boolean z2) {
        Intrinsics.h(coreConfigProvider, "coreConfigProvider");
        this.calibrationExpirationTimeMillis = d;
        this.sessionProgressLogsIntervalMillis = d2;
        this.engineUpdatesBufferSize = i;
        this.isSmartCartMode = z;
        this.pdrPredictionAlpha = d3;
        this.positioningExtrapolatePath = bool;
        this.maxTimeToFastForwardSeconds = d4;
        this.mainOrientationBorderAngleDegrees = d5;
        this.mainOrientationDiffAngleDegrees = d6;
        this.coreConfigProvider = coreConfigProvider;
        this.isPositioningDebuggingEnabled = z2;
    }

    /* renamed from: component1, reason: from getter */
    public final double getCalibrationExpirationTimeMillis() {
        return this.calibrationExpirationTimeMillis;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final OnDeviceEngineCoreConfigProvider getCoreConfigProvider() {
        return this.coreConfigProvider;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsPositioningDebuggingEnabled() {
        return this.isPositioningDebuggingEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final double getSessionProgressLogsIntervalMillis() {
        return this.sessionProgressLogsIntervalMillis;
    }

    /* renamed from: component3, reason: from getter */
    public final int getEngineUpdatesBufferSize() {
        return this.engineUpdatesBufferSize;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsSmartCartMode() {
        return this.isSmartCartMode;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Double getPdrPredictionAlpha() {
        return this.pdrPredictionAlpha;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Boolean getPositioningExtrapolatePath() {
        return this.positioningExtrapolatePath;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Double getMaxTimeToFastForwardSeconds() {
        return this.maxTimeToFastForwardSeconds;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Double getMainOrientationBorderAngleDegrees() {
        return this.mainOrientationBorderAngleDegrees;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Double getMainOrientationDiffAngleDegrees() {
        return this.mainOrientationDiffAngleDegrees;
    }

    @NotNull
    public final OnDeviceEngineConfig copy(double calibrationExpirationTimeMillis, double sessionProgressLogsIntervalMillis, int engineUpdatesBufferSize, boolean isSmartCartMode, @Nullable Double pdrPredictionAlpha, @Nullable Boolean positioningExtrapolatePath, @Nullable Double maxTimeToFastForwardSeconds, @Nullable Double mainOrientationBorderAngleDegrees, @Nullable Double mainOrientationDiffAngleDegrees, @NotNull OnDeviceEngineCoreConfigProvider coreConfigProvider, boolean isPositioningDebuggingEnabled) {
        Intrinsics.h(coreConfigProvider, "coreConfigProvider");
        return new OnDeviceEngineConfig(calibrationExpirationTimeMillis, sessionProgressLogsIntervalMillis, engineUpdatesBufferSize, isSmartCartMode, pdrPredictionAlpha, positioningExtrapolatePath, maxTimeToFastForwardSeconds, mainOrientationBorderAngleDegrees, mainOrientationDiffAngleDegrees, coreConfigProvider, isPositioningDebuggingEnabled);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnDeviceEngineConfig)) {
            return false;
        }
        OnDeviceEngineConfig onDeviceEngineConfig = (OnDeviceEngineConfig) other;
        return Double.compare(this.calibrationExpirationTimeMillis, onDeviceEngineConfig.calibrationExpirationTimeMillis) == 0 && Double.compare(this.sessionProgressLogsIntervalMillis, onDeviceEngineConfig.sessionProgressLogsIntervalMillis) == 0 && this.engineUpdatesBufferSize == onDeviceEngineConfig.engineUpdatesBufferSize && this.isSmartCartMode == onDeviceEngineConfig.isSmartCartMode && Intrinsics.c(this.pdrPredictionAlpha, onDeviceEngineConfig.pdrPredictionAlpha) && Intrinsics.c(this.positioningExtrapolatePath, onDeviceEngineConfig.positioningExtrapolatePath) && Intrinsics.c(this.maxTimeToFastForwardSeconds, onDeviceEngineConfig.maxTimeToFastForwardSeconds) && Intrinsics.c(this.mainOrientationBorderAngleDegrees, onDeviceEngineConfig.mainOrientationBorderAngleDegrees) && Intrinsics.c(this.mainOrientationDiffAngleDegrees, onDeviceEngineConfig.mainOrientationDiffAngleDegrees) && Intrinsics.c(this.coreConfigProvider, onDeviceEngineConfig.coreConfigProvider) && this.isPositioningDebuggingEnabled == onDeviceEngineConfig.isPositioningDebuggingEnabled;
    }

    public final double getCalibrationExpirationTimeMillis() {
        return this.calibrationExpirationTimeMillis;
    }

    @NotNull
    public final OnDeviceEngineCoreConfigProvider getCoreConfigProvider() {
        return this.coreConfigProvider;
    }

    public final int getEngineUpdatesBufferSize() {
        return this.engineUpdatesBufferSize;
    }

    @Nullable
    public final Double getMainOrientationBorderAngleDegrees() {
        return this.mainOrientationBorderAngleDegrees;
    }

    @Nullable
    public final Double getMainOrientationDiffAngleDegrees() {
        return this.mainOrientationDiffAngleDegrees;
    }

    @Nullable
    public final Double getMaxTimeToFastForwardSeconds() {
        return this.maxTimeToFastForwardSeconds;
    }

    @Nullable
    public final Double getPdrPredictionAlpha() {
        return this.pdrPredictionAlpha;
    }

    @Nullable
    public final Boolean getPositioningExtrapolatePath() {
        return this.positioningExtrapolatePath;
    }

    public final double getSessionProgressLogsIntervalMillis() {
        return this.sessionProgressLogsIntervalMillis;
    }

    public int hashCode() {
        int iA = me.oriient.positioningengine.common.x.a(this.isSmartCartMode, androidx.camera.core.impl.b.a(this.engineUpdatesBufferSize, me.oriient.positioningengine.common.v.a(this.sessionProgressLogsIntervalMillis, Double.hashCode(this.calibrationExpirationTimeMillis) * 31, 31), 31), 31);
        Double d = this.pdrPredictionAlpha;
        int iHashCode = (iA + (d == null ? 0 : d.hashCode())) * 31;
        Boolean bool = this.positioningExtrapolatePath;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Double d2 = this.maxTimeToFastForwardSeconds;
        int iHashCode3 = (iHashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.mainOrientationBorderAngleDegrees;
        int iHashCode4 = (iHashCode3 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.mainOrientationDiffAngleDegrees;
        return Boolean.hashCode(this.isPositioningDebuggingEnabled) + ((this.coreConfigProvider.hashCode() + ((iHashCode4 + (d4 != null ? d4.hashCode() : 0)) * 31)) * 31);
    }

    public final boolean isPositioningDebuggingEnabled() {
        return this.isPositioningDebuggingEnabled;
    }

    public final boolean isSmartCartMode() {
        return this.isSmartCartMode;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("OnDeviceEngineConfig(calibrationExpirationTimeMillis=");
        sb.append(this.calibrationExpirationTimeMillis);
        sb.append(", sessionProgressLogsIntervalMillis=");
        sb.append(this.sessionProgressLogsIntervalMillis);
        sb.append(", engineUpdatesBufferSize=");
        sb.append(this.engineUpdatesBufferSize);
        sb.append(", isSmartCartMode=");
        sb.append(this.isSmartCartMode);
        sb.append(", pdrPredictionAlpha=");
        sb.append(this.pdrPredictionAlpha);
        sb.append(", positioningExtrapolatePath=");
        sb.append(this.positioningExtrapolatePath);
        sb.append(", maxTimeToFastForwardSeconds=");
        sb.append(this.maxTimeToFastForwardSeconds);
        sb.append(", mainOrientationBorderAngleDegrees=");
        sb.append(this.mainOrientationBorderAngleDegrees);
        sb.append(", mainOrientationDiffAngleDegrees=");
        sb.append(this.mainOrientationDiffAngleDegrees);
        sb.append(", coreConfigProvider=");
        sb.append(this.coreConfigProvider);
        sb.append(", isPositioningDebuggingEnabled=");
        return androidx.camera.core.impl.b.s(sb, this.isPositioningDebuggingEnabled, ')');
    }

    public /* synthetic */ OnDeviceEngineConfig(double d, double d2, int i, boolean z, Double d3, Boolean bool, Double d4, Double d5, Double d6, OnDeviceEngineCoreConfigProvider onDeviceEngineCoreConfigProvider, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(d, d2, i, z, (i2 & 16) != 0 ? null : d3, (i2 & 32) != 0 ? null : bool, (i2 & 64) != 0 ? null : d4, (i2 & 128) != 0 ? null : d5, (i2 & 256) != 0 ? null : d6, onDeviceEngineCoreConfigProvider, z2);
    }
}
