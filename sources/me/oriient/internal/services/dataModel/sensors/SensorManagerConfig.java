package me.oriient.internal.services.dataModel.sensors;

import androidx.annotation.Keep;
import androidx.camera.core.impl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.infra.locationManager.J;
import me.oriient.internal.services.config.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\t¢\u0006\u0002\u0010\u0017J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0005HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0015HÆ\u0003J\t\u00105\u001a\u00020\tHÆ\u0003J\t\u00106\u001a\u00020\u0005HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\tHÆ\u0003J\t\u0010:\u001a\u00020\tHÆ\u0003J\t\u0010;\u001a\u00020\tHÆ\u0003J\t\u0010<\u001a\u00020\tHÆ\u0003J\t\u0010=\u001a\u00020\tHÆ\u0003J³\u0001\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\tHÆ\u0001J\u0013\u0010?\u001a\u00020\t2\b\u0010@\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010A\u001a\u00020\u0005HÖ\u0001J\t\u0010B\u001a\u00020CHÖ\u0001R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0019R\u0011\u0010\u0016\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001dR\u0011\u0010\r\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001dR\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001dR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001d¨\u0006D"}, d2 = {"Lme/oriient/internal/services/dataModel/sensors/SensorManagerConfig;", "", "sensorSamplingRateHz", "", "sensorsDataBufferSize", "", "sensorsDataRelevanceLimitSec", "sensorsDataRelevanceLimitPressureSec", "useNewSensorManager", "", "monitorFreezes", "validateSamples", "stopSessionOnSensorError", "stopSessionIfSensorDataOutdated", "foregroundServiceMonitoringIntervalSec", "monitoringIntervalSec", "recoveryWaitingDurationSec", "restartWaitingDurationSec", "maxSessionLengthMin", "sensorIssuesELogIntervalSec", "sensorsConfig", "Lme/oriient/internal/services/dataModel/sensors/SensorsConfig;", "shouldNeverStopPressure", "(DIDDZZZZZDDDDIDLme/oriient/internal/services/dataModel/sensors/SensorsConfig;Z)V", "getForegroundServiceMonitoringIntervalSec", "()D", "getMaxSessionLengthMin", "()I", "getMonitorFreezes", "()Z", "getMonitoringIntervalSec", "getRecoveryWaitingDurationSec", "getRestartWaitingDurationSec", "getSensorIssuesELogIntervalSec", "getSensorSamplingRateHz", "getSensorsConfig", "()Lme/oriient/internal/services/dataModel/sensors/SensorsConfig;", "getSensorsDataBufferSize", "getSensorsDataRelevanceLimitPressureSec", "getSensorsDataRelevanceLimitSec", "getShouldNeverStopPressure", "getStopSessionIfSensorDataOutdated", "getStopSessionOnSensorError", "getUseNewSensorManager", "getValidateSamples", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class SensorManagerConfig {
    private final double foregroundServiceMonitoringIntervalSec;
    private final int maxSessionLengthMin;
    private final boolean monitorFreezes;
    private final double monitoringIntervalSec;
    private final double recoveryWaitingDurationSec;
    private final double restartWaitingDurationSec;
    private final double sensorIssuesELogIntervalSec;
    private final double sensorSamplingRateHz;

    @NotNull
    private final SensorsConfig sensorsConfig;
    private final int sensorsDataBufferSize;
    private final double sensorsDataRelevanceLimitPressureSec;
    private final double sensorsDataRelevanceLimitSec;
    private final boolean shouldNeverStopPressure;
    private final boolean stopSessionIfSensorDataOutdated;
    private final boolean stopSessionOnSensorError;
    private final boolean useNewSensorManager;
    private final boolean validateSamples;

    public SensorManagerConfig(double d, int i, double d2, double d3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, double d4, double d5, double d6, double d7, int i2, double d8, @NotNull SensorsConfig sensorsConfig, boolean z6) {
        Intrinsics.h(sensorsConfig, "sensorsConfig");
        this.sensorSamplingRateHz = d;
        this.sensorsDataBufferSize = i;
        this.sensorsDataRelevanceLimitSec = d2;
        this.sensorsDataRelevanceLimitPressureSec = d3;
        this.useNewSensorManager = z;
        this.monitorFreezes = z2;
        this.validateSamples = z3;
        this.stopSessionOnSensorError = z4;
        this.stopSessionIfSensorDataOutdated = z5;
        this.foregroundServiceMonitoringIntervalSec = d4;
        this.monitoringIntervalSec = d5;
        this.recoveryWaitingDurationSec = d6;
        this.restartWaitingDurationSec = d7;
        this.maxSessionLengthMin = i2;
        this.sensorIssuesELogIntervalSec = d8;
        this.sensorsConfig = sensorsConfig;
        this.shouldNeverStopPressure = z6;
    }

    public static /* synthetic */ SensorManagerConfig copy$default(SensorManagerConfig sensorManagerConfig, double d, int i, double d2, double d3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, double d4, double d5, double d6, double d7, int i2, double d8, SensorsConfig sensorsConfig, boolean z6, int i3, Object obj) {
        boolean z7;
        double d9;
        double d10 = (i3 & 1) != 0 ? sensorManagerConfig.sensorSamplingRateHz : d;
        int i4 = (i3 & 2) != 0 ? sensorManagerConfig.sensorsDataBufferSize : i;
        double d11 = (i3 & 4) != 0 ? sensorManagerConfig.sensorsDataRelevanceLimitSec : d2;
        double d12 = (i3 & 8) != 0 ? sensorManagerConfig.sensorsDataRelevanceLimitPressureSec : d3;
        boolean z8 = (i3 & 16) != 0 ? sensorManagerConfig.useNewSensorManager : z;
        boolean z9 = (i3 & 32) != 0 ? sensorManagerConfig.monitorFreezes : z2;
        boolean z10 = (i3 & 64) != 0 ? sensorManagerConfig.validateSamples : z3;
        boolean z11 = (i3 & 128) != 0 ? sensorManagerConfig.stopSessionOnSensorError : z4;
        boolean z12 = (i3 & 256) != 0 ? sensorManagerConfig.stopSessionIfSensorDataOutdated : z5;
        double d13 = (i3 & 512) != 0 ? sensorManagerConfig.foregroundServiceMonitoringIntervalSec : d4;
        double d14 = d10;
        double d15 = (i3 & 1024) != 0 ? sensorManagerConfig.monitoringIntervalSec : d5;
        double d16 = (i3 & 2048) != 0 ? sensorManagerConfig.recoveryWaitingDurationSec : d6;
        double d17 = (i3 & 4096) != 0 ? sensorManagerConfig.restartWaitingDurationSec : d7;
        int i5 = (i3 & 8192) != 0 ? sensorManagerConfig.maxSessionLengthMin : i2;
        double d18 = (i3 & 16384) != 0 ? sensorManagerConfig.sensorIssuesELogIntervalSec : d8;
        SensorsConfig sensorsConfig2 = (i3 & 32768) != 0 ? sensorManagerConfig.sensorsConfig : sensorsConfig;
        if ((i3 & 65536) != 0) {
            d9 = d18;
            z7 = sensorManagerConfig.shouldNeverStopPressure;
        } else {
            z7 = z6;
            d9 = d18;
        }
        return sensorManagerConfig.copy(d14, i4, d11, d12, z8, z9, z10, z11, z12, d13, d15, d16, d17, i5, d9, sensorsConfig2, z7);
    }

    /* renamed from: component1, reason: from getter */
    public final double getSensorSamplingRateHz() {
        return this.sensorSamplingRateHz;
    }

    /* renamed from: component10, reason: from getter */
    public final double getForegroundServiceMonitoringIntervalSec() {
        return this.foregroundServiceMonitoringIntervalSec;
    }

    /* renamed from: component11, reason: from getter */
    public final double getMonitoringIntervalSec() {
        return this.monitoringIntervalSec;
    }

    /* renamed from: component12, reason: from getter */
    public final double getRecoveryWaitingDurationSec() {
        return this.recoveryWaitingDurationSec;
    }

    /* renamed from: component13, reason: from getter */
    public final double getRestartWaitingDurationSec() {
        return this.restartWaitingDurationSec;
    }

    /* renamed from: component14, reason: from getter */
    public final int getMaxSessionLengthMin() {
        return this.maxSessionLengthMin;
    }

    /* renamed from: component15, reason: from getter */
    public final double getSensorIssuesELogIntervalSec() {
        return this.sensorIssuesELogIntervalSec;
    }

    @NotNull
    /* renamed from: component16, reason: from getter */
    public final SensorsConfig getSensorsConfig() {
        return this.sensorsConfig;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getShouldNeverStopPressure() {
        return this.shouldNeverStopPressure;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSensorsDataBufferSize() {
        return this.sensorsDataBufferSize;
    }

    /* renamed from: component3, reason: from getter */
    public final double getSensorsDataRelevanceLimitSec() {
        return this.sensorsDataRelevanceLimitSec;
    }

    /* renamed from: component4, reason: from getter */
    public final double getSensorsDataRelevanceLimitPressureSec() {
        return this.sensorsDataRelevanceLimitPressureSec;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getUseNewSensorManager() {
        return this.useNewSensorManager;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getMonitorFreezes() {
        return this.monitorFreezes;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getValidateSamples() {
        return this.validateSamples;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getStopSessionOnSensorError() {
        return this.stopSessionOnSensorError;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getStopSessionIfSensorDataOutdated() {
        return this.stopSessionIfSensorDataOutdated;
    }

    @NotNull
    public final SensorManagerConfig copy(double sensorSamplingRateHz, int sensorsDataBufferSize, double sensorsDataRelevanceLimitSec, double sensorsDataRelevanceLimitPressureSec, boolean useNewSensorManager, boolean monitorFreezes, boolean validateSamples, boolean stopSessionOnSensorError, boolean stopSessionIfSensorDataOutdated, double foregroundServiceMonitoringIntervalSec, double monitoringIntervalSec, double recoveryWaitingDurationSec, double restartWaitingDurationSec, int maxSessionLengthMin, double sensorIssuesELogIntervalSec, @NotNull SensorsConfig sensorsConfig, boolean shouldNeverStopPressure) {
        Intrinsics.h(sensorsConfig, "sensorsConfig");
        return new SensorManagerConfig(sensorSamplingRateHz, sensorsDataBufferSize, sensorsDataRelevanceLimitSec, sensorsDataRelevanceLimitPressureSec, useNewSensorManager, monitorFreezes, validateSamples, stopSessionOnSensorError, stopSessionIfSensorDataOutdated, foregroundServiceMonitoringIntervalSec, monitoringIntervalSec, recoveryWaitingDurationSec, restartWaitingDurationSec, maxSessionLengthMin, sensorIssuesELogIntervalSec, sensorsConfig, shouldNeverStopPressure);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SensorManagerConfig)) {
            return false;
        }
        SensorManagerConfig sensorManagerConfig = (SensorManagerConfig) other;
        return Double.compare(this.sensorSamplingRateHz, sensorManagerConfig.sensorSamplingRateHz) == 0 && this.sensorsDataBufferSize == sensorManagerConfig.sensorsDataBufferSize && Double.compare(this.sensorsDataRelevanceLimitSec, sensorManagerConfig.sensorsDataRelevanceLimitSec) == 0 && Double.compare(this.sensorsDataRelevanceLimitPressureSec, sensorManagerConfig.sensorsDataRelevanceLimitPressureSec) == 0 && this.useNewSensorManager == sensorManagerConfig.useNewSensorManager && this.monitorFreezes == sensorManagerConfig.monitorFreezes && this.validateSamples == sensorManagerConfig.validateSamples && this.stopSessionOnSensorError == sensorManagerConfig.stopSessionOnSensorError && this.stopSessionIfSensorDataOutdated == sensorManagerConfig.stopSessionIfSensorDataOutdated && Double.compare(this.foregroundServiceMonitoringIntervalSec, sensorManagerConfig.foregroundServiceMonitoringIntervalSec) == 0 && Double.compare(this.monitoringIntervalSec, sensorManagerConfig.monitoringIntervalSec) == 0 && Double.compare(this.recoveryWaitingDurationSec, sensorManagerConfig.recoveryWaitingDurationSec) == 0 && Double.compare(this.restartWaitingDurationSec, sensorManagerConfig.restartWaitingDurationSec) == 0 && this.maxSessionLengthMin == sensorManagerConfig.maxSessionLengthMin && Double.compare(this.sensorIssuesELogIntervalSec, sensorManagerConfig.sensorIssuesELogIntervalSec) == 0 && Intrinsics.c(this.sensorsConfig, sensorManagerConfig.sensorsConfig) && this.shouldNeverStopPressure == sensorManagerConfig.shouldNeverStopPressure;
    }

    public final double getForegroundServiceMonitoringIntervalSec() {
        return this.foregroundServiceMonitoringIntervalSec;
    }

    public final int getMaxSessionLengthMin() {
        return this.maxSessionLengthMin;
    }

    public final boolean getMonitorFreezes() {
        return this.monitorFreezes;
    }

    public final double getMonitoringIntervalSec() {
        return this.monitoringIntervalSec;
    }

    public final double getRecoveryWaitingDurationSec() {
        return this.recoveryWaitingDurationSec;
    }

    public final double getRestartWaitingDurationSec() {
        return this.restartWaitingDurationSec;
    }

    public final double getSensorIssuesELogIntervalSec() {
        return this.sensorIssuesELogIntervalSec;
    }

    public final double getSensorSamplingRateHz() {
        return this.sensorSamplingRateHz;
    }

    @NotNull
    public final SensorsConfig getSensorsConfig() {
        return this.sensorsConfig;
    }

    public final int getSensorsDataBufferSize() {
        return this.sensorsDataBufferSize;
    }

    public final double getSensorsDataRelevanceLimitPressureSec() {
        return this.sensorsDataRelevanceLimitPressureSec;
    }

    public final double getSensorsDataRelevanceLimitSec() {
        return this.sensorsDataRelevanceLimitSec;
    }

    public final boolean getShouldNeverStopPressure() {
        return this.shouldNeverStopPressure;
    }

    public final boolean getStopSessionIfSensorDataOutdated() {
        return this.stopSessionIfSensorDataOutdated;
    }

    public final boolean getStopSessionOnSensorError() {
        return this.stopSessionOnSensorError;
    }

    public final boolean getUseNewSensorManager() {
        return this.useNewSensorManager;
    }

    public final boolean getValidateSamples() {
        return this.validateSamples;
    }

    public int hashCode() {
        return Boolean.hashCode(this.shouldNeverStopPressure) + ((this.sensorsConfig.hashCode() + J.a(this.sensorIssuesELogIntervalSec, a.a(this.maxSessionLengthMin, J.a(this.restartWaitingDurationSec, J.a(this.recoveryWaitingDurationSec, J.a(this.monitoringIntervalSec, J.a(this.foregroundServiceMonitoringIntervalSec, me.oriient.internal.infra.scheduler.a.a(this.stopSessionIfSensorDataOutdated, me.oriient.internal.infra.scheduler.a.a(this.stopSessionOnSensorError, me.oriient.internal.infra.scheduler.a.a(this.validateSamples, me.oriient.internal.infra.scheduler.a.a(this.monitorFreezes, me.oriient.internal.infra.scheduler.a.a(this.useNewSensorManager, J.a(this.sensorsDataRelevanceLimitPressureSec, J.a(this.sensorsDataRelevanceLimitSec, a.a(this.sensorsDataBufferSize, Double.hashCode(this.sensorSamplingRateHz) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31)) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("SensorManagerConfig(sensorSamplingRateHz=");
        sb.append(this.sensorSamplingRateHz);
        sb.append(", sensorsDataBufferSize=");
        sb.append(this.sensorsDataBufferSize);
        sb.append(", sensorsDataRelevanceLimitSec=");
        sb.append(this.sensorsDataRelevanceLimitSec);
        sb.append(", sensorsDataRelevanceLimitPressureSec=");
        sb.append(this.sensorsDataRelevanceLimitPressureSec);
        sb.append(", useNewSensorManager=");
        sb.append(this.useNewSensorManager);
        sb.append(", monitorFreezes=");
        sb.append(this.monitorFreezes);
        sb.append(", validateSamples=");
        sb.append(this.validateSamples);
        sb.append(", stopSessionOnSensorError=");
        sb.append(this.stopSessionOnSensorError);
        sb.append(", stopSessionIfSensorDataOutdated=");
        sb.append(this.stopSessionIfSensorDataOutdated);
        sb.append(", foregroundServiceMonitoringIntervalSec=");
        sb.append(this.foregroundServiceMonitoringIntervalSec);
        sb.append(", monitoringIntervalSec=");
        sb.append(this.monitoringIntervalSec);
        sb.append(", recoveryWaitingDurationSec=");
        sb.append(this.recoveryWaitingDurationSec);
        sb.append(", restartWaitingDurationSec=");
        sb.append(this.restartWaitingDurationSec);
        sb.append(", maxSessionLengthMin=");
        sb.append(this.maxSessionLengthMin);
        sb.append(", sensorIssuesELogIntervalSec=");
        sb.append(this.sensorIssuesELogIntervalSec);
        sb.append(", sensorsConfig=");
        sb.append(this.sensorsConfig);
        sb.append(", shouldNeverStopPressure=");
        return b.s(sb, this.shouldNeverStopPressure, ')');
    }
}
