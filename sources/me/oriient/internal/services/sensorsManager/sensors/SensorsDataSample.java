package me.oriient.internal.services.sensorsManager.sensors;

import androidx.annotation.Keep;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import me.oriient.internal.infra.locationManager.K;
import me.oriient.internal.services.sensorsManager.sensors.SensorReading;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0012\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u00029:BQ\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fB;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0002\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003JK\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\tHÆ\u0001J\u000e\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0000J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\f\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u0006J\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u0006J\f\u0010-\u001a\b\u0012\u0004\u0012\u00020+0\u0006J\t\u0010.\u001a\u00020\u0003HÖ\u0001J\t\u0010/\u001a\u000200HÖ\u0001J&\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u00002\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000207HÁ\u0001¢\u0006\u0002\b8R\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012¨\u0006;"}, d2 = {"Lme/oriient/internal/services/sensorsManager/sensors/SensorsDataSample;", "", "seen1", "", "numReadingsInBatch", "readings", "", "Lme/oriient/internal/services/sensorsManager/sensors/SensorsDataReading;", "firstGyroTimestampNanos", "", "startTimeNanos", "endTimeNanos", "buildingStartTimestampNanos", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILjava/util/List;JJJJLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ILjava/util/List;JJJJ)V", "getBuildingStartTimestampNanos", "()J", "getEndTimeNanos", "getFirstGyroTimestampNanos", "getNumReadingsInBatch", "()I", "getReadings", "()Ljava/util/List;", "rsmpData", "", "getRsmpData", "()[B", "getStartTimeNanos", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "copyTimestampFrom", "from", "equals", "", "other", "getAllNaNSensorTypes", "Lme/oriient/internal/services/sensorsManager/sensors/SystemSensor;", "getHasNaNSensorTypes", "getZeroedSensorTypes", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
@SourceDebugExtension
/* loaded from: classes7.dex */
public final /* data */ class SensorsDataSample {
    public static final double DATA_FORMAT_VERSION = 6.0d;
    private final long buildingStartTimestampNanos;
    private final long endTimeNanos;
    private final long firstGyroTimestampNanos;
    private final int numReadingsInBatch;

    @NotNull
    private final List<SensorsDataReading> readings;
    private final long startTimeNanos;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @JvmField
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(SensorsDataReading$$serializer.INSTANCE), null, null, null, null};

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lme/oriient/internal/services/sensorsManager/sensors/SensorsDataSample$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/sensorsManager/sensors/SensorsDataSample;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "DATA_FORMAT_VERSION", "D", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<SensorsDataSample> serializer() {
            return SensorsDataSample$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ SensorsDataSample(int i, int i2, List list, long j, long j2, long j3, long j4, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.a(i, 63, SensorsDataSample$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.numReadingsInBatch = i2;
        this.readings = list;
        this.firstGyroTimestampNanos = j;
        this.startTimeNanos = j2;
        this.endTimeNanos = j3;
        this.buildingStartTimestampNanos = j4;
    }

    public static /* synthetic */ SensorsDataSample copy$default(SensorsDataSample sensorsDataSample, int i, List list, long j, long j2, long j3, long j4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = sensorsDataSample.numReadingsInBatch;
        }
        if ((i2 & 2) != 0) {
            list = sensorsDataSample.readings;
        }
        if ((i2 & 4) != 0) {
            j = sensorsDataSample.firstGyroTimestampNanos;
        }
        if ((i2 & 8) != 0) {
            j2 = sensorsDataSample.startTimeNanos;
        }
        if ((i2 & 16) != 0) {
            j3 = sensorsDataSample.endTimeNanos;
        }
        if ((i2 & 32) != 0) {
            j4 = sensorsDataSample.buildingStartTimestampNanos;
        }
        long j5 = j4;
        long j6 = j3;
        long j7 = j2;
        return sensorsDataSample.copy(i, list, j, j7, j6, j5);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$internal_publishRelease(SensorsDataSample self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.C(0, self.numReadingsInBatch, serialDesc);
        output.F(serialDesc, 1, kSerializerArr[1], self.readings);
        output.t(serialDesc, 2, self.firstGyroTimestampNanos);
        output.t(serialDesc, 3, self.startTimeNanos);
        output.t(serialDesc, 4, self.endTimeNanos);
        output.t(serialDesc, 5, self.buildingStartTimestampNanos);
    }

    /* renamed from: component1, reason: from getter */
    public final int getNumReadingsInBatch() {
        return this.numReadingsInBatch;
    }

    @NotNull
    public final List<SensorsDataReading> component2() {
        return this.readings;
    }

    /* renamed from: component3, reason: from getter */
    public final long getFirstGyroTimestampNanos() {
        return this.firstGyroTimestampNanos;
    }

    /* renamed from: component4, reason: from getter */
    public final long getStartTimeNanos() {
        return this.startTimeNanos;
    }

    /* renamed from: component5, reason: from getter */
    public final long getEndTimeNanos() {
        return this.endTimeNanos;
    }

    /* renamed from: component6, reason: from getter */
    public final long getBuildingStartTimestampNanos() {
        return this.buildingStartTimestampNanos;
    }

    @NotNull
    public final SensorsDataSample copy(int numReadingsInBatch, @NotNull List<SensorsDataReading> readings, long firstGyroTimestampNanos, long startTimeNanos, long endTimeNanos, long buildingStartTimestampNanos) {
        Intrinsics.h(readings, "readings");
        return new SensorsDataSample(numReadingsInBatch, readings, firstGyroTimestampNanos, startTimeNanos, endTimeNanos, buildingStartTimestampNanos);
    }

    @NotNull
    public final SensorsDataSample copyTimestampFrom(@NotNull SensorsDataSample from) {
        Intrinsics.h(from, "from");
        long j = from.firstGyroTimestampNanos;
        long j2 = from.startTimeNanos;
        long j3 = from.endTimeNanos;
        List<SensorsDataReading> list = this.readings;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.z0();
                throw null;
            }
            SensorsDataReading sensorsDataReading = (SensorsDataReading) obj;
            SensorReading.GyroscopeReading gyroscopeReadingCopy$default = SensorReading.GyroscopeReading.copy$default(sensorsDataReading.getGyroReading(), from.readings.get(i).getGyroReading().getTimestampNanos(), 0L, 0.0d, 0.0d, 0.0d, null, 62, null);
            SensorReading.GyroscopeUncalibratedReading gyroscopeUncalibratedReadingCopy$default = SensorReading.GyroscopeUncalibratedReading.copy$default(sensorsDataReading.getGyroscopeUncalibratedReading(), from.readings.get(i).getGyroscopeUncalibratedReading().getTimestampNanos(), 0L, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 254, null);
            SensorReading.GameRotationVectorReading gameRotationVectorReadingCopy$default = SensorReading.GameRotationVectorReading.copy$default(sensorsDataReading.getGameRotationVectorReading(), from.readings.get(i).getGameRotationVectorReading().getTimestampNanos(), 0L, 0.0d, 0.0d, 0.0d, 0.0d, 62, null);
            SensorReading.AccelerometerReading accelerometerReadingCopy$default = SensorReading.AccelerometerReading.copy$default(sensorsDataReading.getAccelerometerReading(), from.readings.get(i).getAccelerometerReading().getTimestampNanos(), 0L, 0.0d, 0.0d, 0.0d, 30, null);
            SensorReading.MagneticFieldReading magneticFieldReadingCopy$default = SensorReading.MagneticFieldReading.copy$default(sensorsDataReading.getMagneticFieldReading(), from.readings.get(i).getMagneticFieldReading().getTimestampNanos(), 0L, 0.0d, 0.0d, 0.0d, 30, null);
            SensorReading.MagneticFieldUncalibratedReading magneticFieldUncalibratedReadingCopy$default = SensorReading.MagneticFieldUncalibratedReading.copy$default(sensorsDataReading.getMagneticFieldUncalibratedReading(), from.readings.get(i).getMagneticFieldUncalibratedReading().getTimestampNanos(), 0L, 0.0d, 0.0d, 0.0d, 30, null);
            SensorReading.PressureReading pressureReadingCopy$default = SensorReading.PressureReading.copy$default(sensorsDataReading.getPressureReading(), from.readings.get(i).getPressureReading().getTimestampNanos(), 0L, 0.0d, 6, null);
            SensorReading.LocationReading locationReading = sensorsDataReading.getLocationReading();
            arrayList.add(SensorsDataReading.copy$default(sensorsDataReading, gyroscopeReadingCopy$default, gyroscopeUncalibratedReadingCopy$default, gameRotationVectorReadingCopy$default, accelerometerReadingCopy$default, magneticFieldReadingCopy$default, magneticFieldUncalibratedReadingCopy$default, pressureReadingCopy$default, locationReading.copy((126 & 1) != 0 ? locationReading.timestampNanos : from.readings.get(i).getLocationReading().getTimestampNanos(), (126 & 2) != 0 ? locationReading.timestampUnixMillis : 0L, (126 & 4) != 0 ? locationReading.latitude : 0.0d, (126 & 8) != 0 ? locationReading.longitude : 0.0d, (126 & 16) != 0 ? locationReading.altitude : 0.0d, (126 & 32) != 0 ? locationReading.horizontalAccuracy : 0.0d, (126 & 64) != 0 ? locationReading.verticalAccuracy : 0.0d), null, 0L, 768, null));
            i = i2;
        }
        return copy$default(this, 0, arrayList, j, j2, j3, 0L, 33, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SensorsDataSample)) {
            return false;
        }
        SensorsDataSample sensorsDataSample = (SensorsDataSample) other;
        return this.numReadingsInBatch == sensorsDataSample.numReadingsInBatch && Intrinsics.c(this.readings, sensorsDataSample.readings) && this.firstGyroTimestampNanos == sensorsDataSample.firstGyroTimestampNanos && this.startTimeNanos == sensorsDataSample.startTimeNanos && this.endTimeNanos == sensorsDataSample.endTimeNanos && this.buildingStartTimestampNanos == sensorsDataSample.buildingStartTimestampNanos;
    }

    @NotNull
    public final List<SystemSensor> getAllNaNSensorTypes() {
        boolean z = true;
        boolean z2 = true;
        boolean z3 = true;
        boolean z4 = true;
        boolean z5 = true;
        boolean z6 = true;
        boolean z7 = true;
        boolean z8 = true;
        for (SensorsDataReading sensorsDataReading : this.readings) {
            z = z && sensorsDataReading.getGyroReading().getIsNaN();
            z2 = z2 && sensorsDataReading.getGyroscopeUncalibratedReading().getIsNaN();
            z3 = z3 && sensorsDataReading.getGameRotationVectorReading().getIsNaN();
            z4 = z4 && sensorsDataReading.getAccelerometerReading().getIsNaN();
            z5 = z5 && sensorsDataReading.getMagneticFieldReading().getIsNaN();
            z6 = z6 && sensorsDataReading.getMagneticFieldUncalibratedReading().getIsNaN();
            z7 = z7 && sensorsDataReading.getPressureReading().getIsNaN();
            z8 = z8 && sensorsDataReading.getLocationReading().getIsNaN();
            if (!z && !z2 && !z3 && !z4 && !z5 && !z6 && !z7 && !z8) {
                return EmptyList.d;
            }
        }
        return ArraysKt.F(new SystemSensor[]{z ? SystemSensor.GYROSCOPE : null, z2 ? SystemSensor.GYROSCOPE_UNCALIBRATED : null, z3 ? SystemSensor.GAME_ROTATION_VECTOR : null, z4 ? SystemSensor.ACCELEROMETER : null, z5 ? SystemSensor.MAGNETIC_FIELD : null, z6 ? SystemSensor.MAGNETIC_FIELD_UNCALIBRATED : null, z7 ? SystemSensor.PRESSURE : null, z8 ? SystemSensor.LOCATION : null});
    }

    public final long getBuildingStartTimestampNanos() {
        return this.buildingStartTimestampNanos;
    }

    public final long getEndTimeNanos() {
        return this.endTimeNanos;
    }

    public final long getFirstGyroTimestampNanos() {
        return this.firstGyroTimestampNanos;
    }

    @NotNull
    public final List<SystemSensor> getHasNaNSensorTypes() {
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        for (SensorsDataReading sensorsDataReading : this.readings) {
            z = z || sensorsDataReading.getGyroReading().getHasNaN();
            z2 = z2 || sensorsDataReading.getGyroscopeUncalibratedReading().getHasNaN();
            z3 = z3 || sensorsDataReading.getGameRotationVectorReading().getHasNaN();
            z4 = z4 || sensorsDataReading.getAccelerometerReading().getHasNaN();
            z5 = z5 || sensorsDataReading.getMagneticFieldReading().getHasNaN();
            z6 = z6 || sensorsDataReading.getMagneticFieldUncalibratedReading().getHasNaN();
            z7 = z7 || sensorsDataReading.getPressureReading().getHasNaN();
            z8 = z8 || sensorsDataReading.getLocationReading().getHasNaN();
        }
        return ArraysKt.F(new SystemSensor[]{z ? SystemSensor.GYROSCOPE : null, z2 ? SystemSensor.GYROSCOPE_UNCALIBRATED : null, z3 ? SystemSensor.GAME_ROTATION_VECTOR : null, z4 ? SystemSensor.ACCELEROMETER : null, z5 ? SystemSensor.MAGNETIC_FIELD : null, z6 ? SystemSensor.MAGNETIC_FIELD_UNCALIBRATED : null, z7 ? SystemSensor.PRESSURE : null, z8 ? SystemSensor.LOCATION : null});
    }

    public final int getNumReadingsInBatch() {
        return this.numReadingsInBatch;
    }

    @NotNull
    public final List<SensorsDataReading> getReadings() {
        return this.readings;
    }

    @NotNull
    public final byte[] getRsmpData() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(this.numReadingsInBatch * 200);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        Iterator<T> it = this.readings.iterator();
        while (it.hasNext()) {
            ((SensorsDataReading) it.next()).appendRsmp(byteBufferAllocate, this.firstGyroTimestampNanos);
        }
        return (byte[]) byteBufferAllocate.array().clone();
    }

    public final long getStartTimeNanos() {
        return this.startTimeNanos;
    }

    @NotNull
    public final List<SystemSensor> getZeroedSensorTypes() {
        boolean z = true;
        boolean z2 = true;
        boolean z3 = true;
        boolean z4 = true;
        boolean z5 = true;
        boolean z6 = true;
        boolean z7 = true;
        boolean z8 = true;
        for (SensorsDataReading sensorsDataReading : this.readings) {
            z = z && sensorsDataReading.getGyroReading().getIsZeroes();
            z2 = z2 && sensorsDataReading.getGyroscopeUncalibratedReading().getIsZeroes();
            z3 = z3 && sensorsDataReading.getGameRotationVectorReading().getIsZeroes();
            z4 = z4 && sensorsDataReading.getAccelerometerReading().getIsZeroes();
            z5 = z5 && sensorsDataReading.getMagneticFieldReading().getIsZeroes();
            z6 = z6 && sensorsDataReading.getMagneticFieldUncalibratedReading().getIsZeroes();
            z7 = z7 && sensorsDataReading.getPressureReading().getIsZeroes();
            z8 = z8 && sensorsDataReading.getLocationReading().getIsZeroes();
            if (!z && !z2 && !z3 && !z4 && !z5 && !z6 && !z7 && !z8) {
                return EmptyList.d;
            }
        }
        return ArraysKt.F(new SystemSensor[]{z ? SystemSensor.GYROSCOPE : null, z2 ? SystemSensor.GYROSCOPE_UNCALIBRATED : null, z3 ? SystemSensor.GAME_ROTATION_VECTOR : null, z4 ? SystemSensor.ACCELEROMETER : null, z5 ? SystemSensor.MAGNETIC_FIELD : null, z6 ? SystemSensor.MAGNETIC_FIELD_UNCALIBRATED : null, z7 ? SystemSensor.PRESSURE : null, z8 ? SystemSensor.LOCATION : null});
    }

    public int hashCode() {
        return Long.hashCode(this.buildingStartTimestampNanos) + K.a(this.endTimeNanos, K.a(this.startTimeNanos, K.a(this.firstGyroTimestampNanos, androidx.camera.core.impl.b.d(Integer.hashCode(this.numReadingsInBatch) * 31, 31, this.readings), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("SensorsDataSample(numReadingsInBatch=");
        sb.append(this.numReadingsInBatch);
        sb.append(", readings=");
        sb.append(this.readings);
        sb.append(", firstGyroTimestampNanos=");
        sb.append(this.firstGyroTimestampNanos);
        sb.append(", startTimeNanos=");
        sb.append(this.startTimeNanos);
        sb.append(", endTimeNanos=");
        sb.append(this.endTimeNanos);
        sb.append(", buildingStartTimestampNanos=");
        return androidx.camera.core.impl.b.q(sb, this.buildingStartTimestampNanos, ')');
    }

    public SensorsDataSample(int i, @NotNull List<SensorsDataReading> readings, long j, long j2, long j3, long j4) {
        Intrinsics.h(readings, "readings");
        this.numReadingsInBatch = i;
        this.readings = readings;
        this.firstGyroTimestampNanos = j;
        this.startTimeNanos = j2;
        this.endTimeNanos = j3;
        this.buildingStartTimestampNanos = j4;
    }
}
