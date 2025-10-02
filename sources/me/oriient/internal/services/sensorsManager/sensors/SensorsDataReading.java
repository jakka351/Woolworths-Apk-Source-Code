package me.oriient.internal.services.sensorsManager.sensors;

import androidx.annotation.Keep;
import java.nio.ByteBuffer;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ByteSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import me.oriient.internal.services.sensorsManager.sensors.SensorReading;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 P2\u00020\u0001:\u0002OPB{\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0002\u0010\u001aBW\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0002\u0010\u001bJ\u0016\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u0017J\t\u00106\u001a\u00020\u0005HÆ\u0003J\t\u00107\u001a\u00020\u0017HÆ\u0003J\t\u00108\u001a\u00020\u0007HÆ\u0003J\t\u00109\u001a\u00020\tHÆ\u0003J\t\u0010:\u001a\u00020\u000bHÆ\u0003J\t\u0010;\u001a\u00020\rHÆ\u0003J\t\u0010<\u001a\u00020\u000fHÆ\u0003J\t\u0010=\u001a\u00020\u0011HÆ\u0003J\t\u0010>\u001a\u00020\u0013HÆ\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010-Jt\u0010@\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017HÆ\u0001¢\u0006\u0002\u0010AJ\u0013\u0010B\u001a\u00020C2\b\u0010D\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010E\u001a\u00020\u0003HÖ\u0001J\t\u0010F\u001a\u00020GHÖ\u0001J&\u0010H\u001a\u0002022\u0006\u0010I\u001a\u00020\u00002\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020MHÁ\u0001¢\u0006\u0002\bNR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u0010.\u001a\u0004\b,\u0010-R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b/\u00100¨\u0006Q"}, d2 = {"Lme/oriient/internal/services/sensorsManager/sensors/SensorsDataReading;", "", "seen1", "", "gyroReading", "Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$GyroscopeReading;", "gyroscopeUncalibratedReading", "Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$GyroscopeUncalibratedReading;", "gameRotationVectorReading", "Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$GameRotationVectorReading;", "accelerometerReading", "Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$AccelerometerReading;", "magneticFieldReading", "Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$MagneticFieldReading;", "magneticFieldUncalibratedReading", "Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$MagneticFieldUncalibratedReading;", "pressureReading", "Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$PressureReading;", "locationReading", "Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$LocationReading;", "marker", "", "buildingStartTimestampMillis", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILme/oriient/internal/services/sensorsManager/sensors/SensorReading$GyroscopeReading;Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$GyroscopeUncalibratedReading;Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$GameRotationVectorReading;Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$AccelerometerReading;Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$MagneticFieldReading;Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$MagneticFieldUncalibratedReading;Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$PressureReading;Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$LocationReading;Ljava/lang/Byte;JLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$GyroscopeReading;Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$GyroscopeUncalibratedReading;Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$GameRotationVectorReading;Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$AccelerometerReading;Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$MagneticFieldReading;Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$MagneticFieldUncalibratedReading;Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$PressureReading;Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$LocationReading;Ljava/lang/Byte;J)V", "getAccelerometerReading", "()Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$AccelerometerReading;", "getBuildingStartTimestampMillis", "()J", "getGameRotationVectorReading", "()Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$GameRotationVectorReading;", "getGyroReading", "()Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$GyroscopeReading;", "getGyroscopeUncalibratedReading", "()Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$GyroscopeUncalibratedReading;", "getLocationReading", "()Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$LocationReading;", "getMagneticFieldReading", "()Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$MagneticFieldReading;", "getMagneticFieldUncalibratedReading", "()Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$MagneticFieldUncalibratedReading;", "getMarker", "()Ljava/lang/Byte;", "Ljava/lang/Byte;", "getPressureReading", "()Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$PressureReading;", "appendRsmp", "", "appendTo", "Ljava/nio/ByteBuffer;", "firstTimestampNanos", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$GyroscopeReading;Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$GyroscopeUncalibratedReading;Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$GameRotationVectorReading;Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$AccelerometerReading;Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$MagneticFieldReading;Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$MagneticFieldUncalibratedReading;Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$PressureReading;Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$LocationReading;Ljava/lang/Byte;J)Lme/oriient/internal/services/sensorsManager/sensors/SensorsDataReading;", "equals", "", "other", "hashCode", "toString", "", "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes7.dex */
public final /* data */ class SensorsDataReading {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    private final SensorReading.AccelerometerReading accelerometerReading;
    private final long buildingStartTimestampMillis;

    @NotNull
    private final SensorReading.GameRotationVectorReading gameRotationVectorReading;

    @NotNull
    private final SensorReading.GyroscopeReading gyroReading;

    @NotNull
    private final SensorReading.GyroscopeUncalibratedReading gyroscopeUncalibratedReading;

    @NotNull
    private final SensorReading.LocationReading locationReading;

    @NotNull
    private final SensorReading.MagneticFieldReading magneticFieldReading;

    @NotNull
    private final SensorReading.MagneticFieldUncalibratedReading magneticFieldUncalibratedReading;

    @Nullable
    private final Byte marker;

    @NotNull
    private final SensorReading.PressureReading pressureReading;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/sensorsManager/sensors/SensorsDataReading$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/sensorsManager/sensors/SensorsDataReading;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<SensorsDataReading> serializer() {
            return SensorsDataReading$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ SensorsDataReading(int i, SensorReading.GyroscopeReading gyroscopeReading, SensorReading.GyroscopeUncalibratedReading gyroscopeUncalibratedReading, SensorReading.GameRotationVectorReading gameRotationVectorReading, SensorReading.AccelerometerReading accelerometerReading, SensorReading.MagneticFieldReading magneticFieldReading, SensorReading.MagneticFieldUncalibratedReading magneticFieldUncalibratedReading, SensorReading.PressureReading pressureReading, SensorReading.LocationReading locationReading, Byte b, long j, SerializationConstructorMarker serializationConstructorMarker) {
        if (1023 != (i & 1023)) {
            PluginExceptionsKt.a(i, 1023, SensorsDataReading$$serializer.INSTANCE.getB());
            throw null;
        }
        this.gyroReading = gyroscopeReading;
        this.gyroscopeUncalibratedReading = gyroscopeUncalibratedReading;
        this.gameRotationVectorReading = gameRotationVectorReading;
        this.accelerometerReading = accelerometerReading;
        this.magneticFieldReading = magneticFieldReading;
        this.magneticFieldUncalibratedReading = magneticFieldUncalibratedReading;
        this.pressureReading = pressureReading;
        this.locationReading = locationReading;
        this.marker = b;
        this.buildingStartTimestampMillis = j;
    }

    public static /* synthetic */ SensorsDataReading copy$default(SensorsDataReading sensorsDataReading, SensorReading.GyroscopeReading gyroscopeReading, SensorReading.GyroscopeUncalibratedReading gyroscopeUncalibratedReading, SensorReading.GameRotationVectorReading gameRotationVectorReading, SensorReading.AccelerometerReading accelerometerReading, SensorReading.MagneticFieldReading magneticFieldReading, SensorReading.MagneticFieldUncalibratedReading magneticFieldUncalibratedReading, SensorReading.PressureReading pressureReading, SensorReading.LocationReading locationReading, Byte b, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            gyroscopeReading = sensorsDataReading.gyroReading;
        }
        if ((i & 2) != 0) {
            gyroscopeUncalibratedReading = sensorsDataReading.gyroscopeUncalibratedReading;
        }
        if ((i & 4) != 0) {
            gameRotationVectorReading = sensorsDataReading.gameRotationVectorReading;
        }
        if ((i & 8) != 0) {
            accelerometerReading = sensorsDataReading.accelerometerReading;
        }
        if ((i & 16) != 0) {
            magneticFieldReading = sensorsDataReading.magneticFieldReading;
        }
        if ((i & 32) != 0) {
            magneticFieldUncalibratedReading = sensorsDataReading.magneticFieldUncalibratedReading;
        }
        if ((i & 64) != 0) {
            pressureReading = sensorsDataReading.pressureReading;
        }
        if ((i & 128) != 0) {
            locationReading = sensorsDataReading.locationReading;
        }
        if ((i & 256) != 0) {
            b = sensorsDataReading.marker;
        }
        if ((i & 512) != 0) {
            j = sensorsDataReading.buildingStartTimestampMillis;
        }
        long j2 = j;
        SensorReading.LocationReading locationReading2 = locationReading;
        Byte b2 = b;
        SensorReading.MagneticFieldUncalibratedReading magneticFieldUncalibratedReading2 = magneticFieldUncalibratedReading;
        SensorReading.PressureReading pressureReading2 = pressureReading;
        SensorReading.MagneticFieldReading magneticFieldReading2 = magneticFieldReading;
        SensorReading.GameRotationVectorReading gameRotationVectorReading2 = gameRotationVectorReading;
        return sensorsDataReading.copy(gyroscopeReading, gyroscopeUncalibratedReading, gameRotationVectorReading2, accelerometerReading, magneticFieldReading2, magneticFieldUncalibratedReading2, pressureReading2, locationReading2, b2, j2);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$internal_publishRelease(SensorsDataReading self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.F(serialDesc, 0, SensorReading$GyroscopeReading$$serializer.INSTANCE, self.gyroReading);
        output.F(serialDesc, 1, SensorReading$GyroscopeUncalibratedReading$$serializer.INSTANCE, self.gyroscopeUncalibratedReading);
        output.F(serialDesc, 2, SensorReading$GameRotationVectorReading$$serializer.INSTANCE, self.gameRotationVectorReading);
        output.F(serialDesc, 3, SensorReading$AccelerometerReading$$serializer.INSTANCE, self.accelerometerReading);
        output.F(serialDesc, 4, SensorReading$MagneticFieldReading$$serializer.INSTANCE, self.magneticFieldReading);
        output.F(serialDesc, 5, SensorReading$MagneticFieldUncalibratedReading$$serializer.INSTANCE, self.magneticFieldUncalibratedReading);
        output.F(serialDesc, 6, SensorReading$PressureReading$$serializer.INSTANCE, self.pressureReading);
        output.F(serialDesc, 7, SensorReading$LocationReading$$serializer.INSTANCE, self.locationReading);
        output.w(serialDesc, 8, ByteSerializer.f24781a, self.marker);
        output.t(serialDesc, 9, self.buildingStartTimestampMillis);
    }

    public final void appendRsmp(@NotNull ByteBuffer appendTo, long firstTimestampNanos) {
        Intrinsics.h(appendTo, "appendTo");
        int iPosition = appendTo.position();
        this.gyroReading.appendRsmp(appendTo, firstTimestampNanos);
        this.accelerometerReading.appendRsmp(appendTo, firstTimestampNanos);
        this.magneticFieldUncalibratedReading.appendRsmp(appendTo, firstTimestampNanos);
        this.magneticFieldReading.appendRsmp(appendTo, firstTimestampNanos);
        this.gameRotationVectorReading.appendRsmp(appendTo, firstTimestampNanos);
        this.locationReading.appendRsmp(appendTo, firstTimestampNanos);
        this.pressureReading.appendRsmp(appendTo, firstTimestampNanos);
        this.gyroscopeUncalibratedReading.appendRsmp(appendTo, firstTimestampNanos);
        int iPosition2 = 200 - (appendTo.position() - iPosition);
        for (int i = 0; i < iPosition2; i++) {
            appendTo.put((byte) 0);
        }
        appendTo.put(appendTo.position() - 4, (byte) 0);
        appendTo.put(appendTo.position() - 3, (byte) this.gyroReading.getAppState().getCode());
        appendTo.put(appendTo.position() - 2, (byte) 0);
        Byte b = this.marker;
        if (b != null) {
            appendTo.put(appendTo.position() - 1, b.byteValue());
        }
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final SensorReading.GyroscopeReading getGyroReading() {
        return this.gyroReading;
    }

    /* renamed from: component10, reason: from getter */
    public final long getBuildingStartTimestampMillis() {
        return this.buildingStartTimestampMillis;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final SensorReading.GyroscopeUncalibratedReading getGyroscopeUncalibratedReading() {
        return this.gyroscopeUncalibratedReading;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final SensorReading.GameRotationVectorReading getGameRotationVectorReading() {
        return this.gameRotationVectorReading;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final SensorReading.AccelerometerReading getAccelerometerReading() {
        return this.accelerometerReading;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final SensorReading.MagneticFieldReading getMagneticFieldReading() {
        return this.magneticFieldReading;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final SensorReading.MagneticFieldUncalibratedReading getMagneticFieldUncalibratedReading() {
        return this.magneticFieldUncalibratedReading;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final SensorReading.PressureReading getPressureReading() {
        return this.pressureReading;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final SensorReading.LocationReading getLocationReading() {
        return this.locationReading;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Byte getMarker() {
        return this.marker;
    }

    @NotNull
    public final SensorsDataReading copy(@NotNull SensorReading.GyroscopeReading gyroReading, @NotNull SensorReading.GyroscopeUncalibratedReading gyroscopeUncalibratedReading, @NotNull SensorReading.GameRotationVectorReading gameRotationVectorReading, @NotNull SensorReading.AccelerometerReading accelerometerReading, @NotNull SensorReading.MagneticFieldReading magneticFieldReading, @NotNull SensorReading.MagneticFieldUncalibratedReading magneticFieldUncalibratedReading, @NotNull SensorReading.PressureReading pressureReading, @NotNull SensorReading.LocationReading locationReading, @Nullable Byte marker, long buildingStartTimestampMillis) {
        Intrinsics.h(gyroReading, "gyroReading");
        Intrinsics.h(gyroscopeUncalibratedReading, "gyroscopeUncalibratedReading");
        Intrinsics.h(gameRotationVectorReading, "gameRotationVectorReading");
        Intrinsics.h(accelerometerReading, "accelerometerReading");
        Intrinsics.h(magneticFieldReading, "magneticFieldReading");
        Intrinsics.h(magneticFieldUncalibratedReading, "magneticFieldUncalibratedReading");
        Intrinsics.h(pressureReading, "pressureReading");
        Intrinsics.h(locationReading, "locationReading");
        return new SensorsDataReading(gyroReading, gyroscopeUncalibratedReading, gameRotationVectorReading, accelerometerReading, magneticFieldReading, magneticFieldUncalibratedReading, pressureReading, locationReading, marker, buildingStartTimestampMillis);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SensorsDataReading)) {
            return false;
        }
        SensorsDataReading sensorsDataReading = (SensorsDataReading) other;
        return Intrinsics.c(this.gyroReading, sensorsDataReading.gyroReading) && Intrinsics.c(this.gyroscopeUncalibratedReading, sensorsDataReading.gyroscopeUncalibratedReading) && Intrinsics.c(this.gameRotationVectorReading, sensorsDataReading.gameRotationVectorReading) && Intrinsics.c(this.accelerometerReading, sensorsDataReading.accelerometerReading) && Intrinsics.c(this.magneticFieldReading, sensorsDataReading.magneticFieldReading) && Intrinsics.c(this.magneticFieldUncalibratedReading, sensorsDataReading.magneticFieldUncalibratedReading) && Intrinsics.c(this.pressureReading, sensorsDataReading.pressureReading) && Intrinsics.c(this.locationReading, sensorsDataReading.locationReading) && Intrinsics.c(this.marker, sensorsDataReading.marker) && this.buildingStartTimestampMillis == sensorsDataReading.buildingStartTimestampMillis;
    }

    @NotNull
    public final SensorReading.AccelerometerReading getAccelerometerReading() {
        return this.accelerometerReading;
    }

    public final long getBuildingStartTimestampMillis() {
        return this.buildingStartTimestampMillis;
    }

    @NotNull
    public final SensorReading.GameRotationVectorReading getGameRotationVectorReading() {
        return this.gameRotationVectorReading;
    }

    @NotNull
    public final SensorReading.GyroscopeReading getGyroReading() {
        return this.gyroReading;
    }

    @NotNull
    public final SensorReading.GyroscopeUncalibratedReading getGyroscopeUncalibratedReading() {
        return this.gyroscopeUncalibratedReading;
    }

    @NotNull
    public final SensorReading.LocationReading getLocationReading() {
        return this.locationReading;
    }

    @NotNull
    public final SensorReading.MagneticFieldReading getMagneticFieldReading() {
        return this.magneticFieldReading;
    }

    @NotNull
    public final SensorReading.MagneticFieldUncalibratedReading getMagneticFieldUncalibratedReading() {
        return this.magneticFieldUncalibratedReading;
    }

    @Nullable
    public final Byte getMarker() {
        return this.marker;
    }

    @NotNull
    public final SensorReading.PressureReading getPressureReading() {
        return this.pressureReading;
    }

    public int hashCode() {
        int iHashCode = (this.locationReading.hashCode() + ((this.pressureReading.hashCode() + ((this.magneticFieldUncalibratedReading.hashCode() + ((this.magneticFieldReading.hashCode() + ((this.accelerometerReading.hashCode() + ((this.gameRotationVectorReading.hashCode() + ((this.gyroscopeUncalibratedReading.hashCode() + (this.gyroReading.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        Byte b = this.marker;
        return Long.hashCode(this.buildingStartTimestampMillis) + ((iHashCode + (b == null ? 0 : b.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("SensorsDataReading(gyroReading=");
        sb.append(this.gyroReading);
        sb.append(", gyroscopeUncalibratedReading=");
        sb.append(this.gyroscopeUncalibratedReading);
        sb.append(", gameRotationVectorReading=");
        sb.append(this.gameRotationVectorReading);
        sb.append(", accelerometerReading=");
        sb.append(this.accelerometerReading);
        sb.append(", magneticFieldReading=");
        sb.append(this.magneticFieldReading);
        sb.append(", magneticFieldUncalibratedReading=");
        sb.append(this.magneticFieldUncalibratedReading);
        sb.append(", pressureReading=");
        sb.append(this.pressureReading);
        sb.append(", locationReading=");
        sb.append(this.locationReading);
        sb.append(", marker=");
        sb.append(this.marker);
        sb.append(", buildingStartTimestampMillis=");
        return androidx.camera.core.impl.b.q(sb, this.buildingStartTimestampMillis, ')');
    }

    public SensorsDataReading(@NotNull SensorReading.GyroscopeReading gyroReading, @NotNull SensorReading.GyroscopeUncalibratedReading gyroscopeUncalibratedReading, @NotNull SensorReading.GameRotationVectorReading gameRotationVectorReading, @NotNull SensorReading.AccelerometerReading accelerometerReading, @NotNull SensorReading.MagneticFieldReading magneticFieldReading, @NotNull SensorReading.MagneticFieldUncalibratedReading magneticFieldUncalibratedReading, @NotNull SensorReading.PressureReading pressureReading, @NotNull SensorReading.LocationReading locationReading, @Nullable Byte b, long j) {
        Intrinsics.h(gyroReading, "gyroReading");
        Intrinsics.h(gyroscopeUncalibratedReading, "gyroscopeUncalibratedReading");
        Intrinsics.h(gameRotationVectorReading, "gameRotationVectorReading");
        Intrinsics.h(accelerometerReading, "accelerometerReading");
        Intrinsics.h(magneticFieldReading, "magneticFieldReading");
        Intrinsics.h(magneticFieldUncalibratedReading, "magneticFieldUncalibratedReading");
        Intrinsics.h(pressureReading, "pressureReading");
        Intrinsics.h(locationReading, "locationReading");
        this.gyroReading = gyroReading;
        this.gyroscopeUncalibratedReading = gyroscopeUncalibratedReading;
        this.gameRotationVectorReading = gameRotationVectorReading;
        this.accelerometerReading = accelerometerReading;
        this.magneticFieldReading = magneticFieldReading;
        this.magneticFieldUncalibratedReading = magneticFieldUncalibratedReading;
        this.pressureReading = pressureReading;
        this.locationReading = locationReading;
        this.marker = b;
        this.buildingStartTimestampMillis = j;
    }
}
