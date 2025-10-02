package me.oriient.internal.services.dataModel.sensors;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JO\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\""}, d2 = {"Lme/oriient/internal/services/dataModel/sensors/SensorsConfig;", "", "gyroscope", "Lme/oriient/internal/services/dataModel/sensors/SensorConfig;", "gyroscopeUncalibrated", "accelerometer", "gameRotation", "magneticField", "magneticFieldUncalibrated", "pressure", "(Lme/oriient/internal/services/dataModel/sensors/SensorConfig;Lme/oriient/internal/services/dataModel/sensors/SensorConfig;Lme/oriient/internal/services/dataModel/sensors/SensorConfig;Lme/oriient/internal/services/dataModel/sensors/SensorConfig;Lme/oriient/internal/services/dataModel/sensors/SensorConfig;Lme/oriient/internal/services/dataModel/sensors/SensorConfig;Lme/oriient/internal/services/dataModel/sensors/SensorConfig;)V", "getAccelerometer", "()Lme/oriient/internal/services/dataModel/sensors/SensorConfig;", "getGameRotation", "getGyroscope", "getGyroscopeUncalibrated", "getMagneticField", "getMagneticFieldUncalibrated", "getPressure", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class SensorsConfig {

    @NotNull
    private final SensorConfig accelerometer;

    @NotNull
    private final SensorConfig gameRotation;

    @NotNull
    private final SensorConfig gyroscope;

    @NotNull
    private final SensorConfig gyroscopeUncalibrated;

    @NotNull
    private final SensorConfig magneticField;

    @NotNull
    private final SensorConfig magneticFieldUncalibrated;

    @NotNull
    private final SensorConfig pressure;

    public SensorsConfig(@NotNull SensorConfig gyroscope, @NotNull SensorConfig gyroscopeUncalibrated, @NotNull SensorConfig accelerometer, @NotNull SensorConfig gameRotation, @NotNull SensorConfig magneticField, @NotNull SensorConfig magneticFieldUncalibrated, @NotNull SensorConfig pressure) {
        Intrinsics.h(gyroscope, "gyroscope");
        Intrinsics.h(gyroscopeUncalibrated, "gyroscopeUncalibrated");
        Intrinsics.h(accelerometer, "accelerometer");
        Intrinsics.h(gameRotation, "gameRotation");
        Intrinsics.h(magneticField, "magneticField");
        Intrinsics.h(magneticFieldUncalibrated, "magneticFieldUncalibrated");
        Intrinsics.h(pressure, "pressure");
        this.gyroscope = gyroscope;
        this.gyroscopeUncalibrated = gyroscopeUncalibrated;
        this.accelerometer = accelerometer;
        this.gameRotation = gameRotation;
        this.magneticField = magneticField;
        this.magneticFieldUncalibrated = magneticFieldUncalibrated;
        this.pressure = pressure;
    }

    public static /* synthetic */ SensorsConfig copy$default(SensorsConfig sensorsConfig, SensorConfig sensorConfig, SensorConfig sensorConfig2, SensorConfig sensorConfig3, SensorConfig sensorConfig4, SensorConfig sensorConfig5, SensorConfig sensorConfig6, SensorConfig sensorConfig7, int i, Object obj) {
        if ((i & 1) != 0) {
            sensorConfig = sensorsConfig.gyroscope;
        }
        if ((i & 2) != 0) {
            sensorConfig2 = sensorsConfig.gyroscopeUncalibrated;
        }
        if ((i & 4) != 0) {
            sensorConfig3 = sensorsConfig.accelerometer;
        }
        if ((i & 8) != 0) {
            sensorConfig4 = sensorsConfig.gameRotation;
        }
        if ((i & 16) != 0) {
            sensorConfig5 = sensorsConfig.magneticField;
        }
        if ((i & 32) != 0) {
            sensorConfig6 = sensorsConfig.magneticFieldUncalibrated;
        }
        if ((i & 64) != 0) {
            sensorConfig7 = sensorsConfig.pressure;
        }
        SensorConfig sensorConfig8 = sensorConfig6;
        SensorConfig sensorConfig9 = sensorConfig7;
        SensorConfig sensorConfig10 = sensorConfig5;
        SensorConfig sensorConfig11 = sensorConfig3;
        return sensorsConfig.copy(sensorConfig, sensorConfig2, sensorConfig11, sensorConfig4, sensorConfig10, sensorConfig8, sensorConfig9);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final SensorConfig getGyroscope() {
        return this.gyroscope;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final SensorConfig getGyroscopeUncalibrated() {
        return this.gyroscopeUncalibrated;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final SensorConfig getAccelerometer() {
        return this.accelerometer;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final SensorConfig getGameRotation() {
        return this.gameRotation;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final SensorConfig getMagneticField() {
        return this.magneticField;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final SensorConfig getMagneticFieldUncalibrated() {
        return this.magneticFieldUncalibrated;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final SensorConfig getPressure() {
        return this.pressure;
    }

    @NotNull
    public final SensorsConfig copy(@NotNull SensorConfig gyroscope, @NotNull SensorConfig gyroscopeUncalibrated, @NotNull SensorConfig accelerometer, @NotNull SensorConfig gameRotation, @NotNull SensorConfig magneticField, @NotNull SensorConfig magneticFieldUncalibrated, @NotNull SensorConfig pressure) {
        Intrinsics.h(gyroscope, "gyroscope");
        Intrinsics.h(gyroscopeUncalibrated, "gyroscopeUncalibrated");
        Intrinsics.h(accelerometer, "accelerometer");
        Intrinsics.h(gameRotation, "gameRotation");
        Intrinsics.h(magneticField, "magneticField");
        Intrinsics.h(magneticFieldUncalibrated, "magneticFieldUncalibrated");
        Intrinsics.h(pressure, "pressure");
        return new SensorsConfig(gyroscope, gyroscopeUncalibrated, accelerometer, gameRotation, magneticField, magneticFieldUncalibrated, pressure);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SensorsConfig)) {
            return false;
        }
        SensorsConfig sensorsConfig = (SensorsConfig) other;
        return Intrinsics.c(this.gyroscope, sensorsConfig.gyroscope) && Intrinsics.c(this.gyroscopeUncalibrated, sensorsConfig.gyroscopeUncalibrated) && Intrinsics.c(this.accelerometer, sensorsConfig.accelerometer) && Intrinsics.c(this.gameRotation, sensorsConfig.gameRotation) && Intrinsics.c(this.magneticField, sensorsConfig.magneticField) && Intrinsics.c(this.magneticFieldUncalibrated, sensorsConfig.magneticFieldUncalibrated) && Intrinsics.c(this.pressure, sensorsConfig.pressure);
    }

    @NotNull
    public final SensorConfig getAccelerometer() {
        return this.accelerometer;
    }

    @NotNull
    public final SensorConfig getGameRotation() {
        return this.gameRotation;
    }

    @NotNull
    public final SensorConfig getGyroscope() {
        return this.gyroscope;
    }

    @NotNull
    public final SensorConfig getGyroscopeUncalibrated() {
        return this.gyroscopeUncalibrated;
    }

    @NotNull
    public final SensorConfig getMagneticField() {
        return this.magneticField;
    }

    @NotNull
    public final SensorConfig getMagneticFieldUncalibrated() {
        return this.magneticFieldUncalibrated;
    }

    @NotNull
    public final SensorConfig getPressure() {
        return this.pressure;
    }

    public int hashCode() {
        return this.pressure.hashCode() + ((this.magneticFieldUncalibrated.hashCode() + ((this.magneticField.hashCode() + ((this.gameRotation.hashCode() + ((this.accelerometer.hashCode() + ((this.gyroscopeUncalibrated.hashCode() + (this.gyroscope.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "SensorsConfig(gyroscope=" + this.gyroscope + ", gyroscopeUncalibrated=" + this.gyroscopeUncalibrated + ", accelerometer=" + this.accelerometer + ", gameRotation=" + this.gameRotation + ", magneticField=" + this.magneticField + ", magneticFieldUncalibrated=" + this.magneticFieldUncalibrated + ", pressure=" + this.pressure + ')';
    }
}
