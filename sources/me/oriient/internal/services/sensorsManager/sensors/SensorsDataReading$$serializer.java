package me.oriient.internal.services.sensorsManager.sensors;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.ByteSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import me.oriient.internal.services.sensorsManager.sensors.SensorReading;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"me/oriient/internal/services/sensorsManager/sensors/SensorsDataReading.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lme/oriient/internal/services/sensorsManager/sensors/SensorsDataReading;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated
/* loaded from: classes7.dex */
public final class SensorsDataReading$$serializer implements GeneratedSerializer<SensorsDataReading> {

    @NotNull
    public static final SensorsDataReading$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SensorsDataReading$$serializer sensorsDataReading$$serializer = new SensorsDataReading$$serializer();
        INSTANCE = sensorsDataReading$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("me.oriient.internal.services.sensorsManager.sensors.SensorsDataReading", sensorsDataReading$$serializer, 10);
        pluginGeneratedSerialDescriptor.k("gyroReading", false);
        pluginGeneratedSerialDescriptor.k("gyroscopeUncalibratedReading", false);
        pluginGeneratedSerialDescriptor.k("gameRotationVectorReading", false);
        pluginGeneratedSerialDescriptor.k("accelerometerReading", false);
        pluginGeneratedSerialDescriptor.k("magneticFieldReading", false);
        pluginGeneratedSerialDescriptor.k("magneticFieldUncalibratedReading", false);
        pluginGeneratedSerialDescriptor.k("pressureReading", false);
        pluginGeneratedSerialDescriptor.k("locationReading", false);
        pluginGeneratedSerialDescriptor.k("marker", false);
        pluginGeneratedSerialDescriptor.k("buildingStartTimestampMillis", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SensorsDataReading$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{SensorReading$GyroscopeReading$$serializer.INSTANCE, SensorReading$GyroscopeUncalibratedReading$$serializer.INSTANCE, SensorReading$GameRotationVectorReading$$serializer.INSTANCE, SensorReading$AccelerometerReading$$serializer.INSTANCE, SensorReading$MagneticFieldReading$$serializer.INSTANCE, SensorReading$MagneticFieldUncalibratedReading$$serializer.INSTANCE, SensorReading$PressureReading$$serializer.INSTANCE, SensorReading$LocationReading$$serializer.INSTANCE, BuiltinSerializersKt.d(ByteSerializer.f24781a), LongSerializer.f24804a};
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    @NotNull
    /* renamed from: getDescriptor */
    public SerialDescriptor getB() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f24815a;
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public SensorsDataReading deserialize(@NotNull Decoder decoder) {
        Intrinsics.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getB();
        CompositeDecoder compositeDecoderB = decoder.b(descriptor2);
        SensorReading.LocationReading locationReading = null;
        SensorReading.GyroscopeReading gyroscopeReading = null;
        SensorReading.GyroscopeUncalibratedReading gyroscopeUncalibratedReading = null;
        SensorReading.GameRotationVectorReading gameRotationVectorReading = null;
        SensorReading.AccelerometerReading accelerometerReading = null;
        SensorReading.MagneticFieldReading magneticFieldReading = null;
        SensorReading.MagneticFieldUncalibratedReading magneticFieldUncalibratedReading = null;
        SensorReading.PressureReading pressureReading = null;
        long jF = 0;
        int i = 0;
        boolean z = true;
        Byte b = null;
        while (z) {
            int iU = compositeDecoderB.u(descriptor2);
            switch (iU) {
                case -1:
                    z = false;
                    break;
                case 0:
                    gyroscopeReading = (SensorReading.GyroscopeReading) compositeDecoderB.o(descriptor2, 0, SensorReading$GyroscopeReading$$serializer.INSTANCE, gyroscopeReading);
                    i |= 1;
                    break;
                case 1:
                    gyroscopeUncalibratedReading = (SensorReading.GyroscopeUncalibratedReading) compositeDecoderB.o(descriptor2, 1, SensorReading$GyroscopeUncalibratedReading$$serializer.INSTANCE, gyroscopeUncalibratedReading);
                    i |= 2;
                    break;
                case 2:
                    gameRotationVectorReading = (SensorReading.GameRotationVectorReading) compositeDecoderB.o(descriptor2, 2, SensorReading$GameRotationVectorReading$$serializer.INSTANCE, gameRotationVectorReading);
                    i |= 4;
                    break;
                case 3:
                    accelerometerReading = (SensorReading.AccelerometerReading) compositeDecoderB.o(descriptor2, 3, SensorReading$AccelerometerReading$$serializer.INSTANCE, accelerometerReading);
                    i |= 8;
                    break;
                case 4:
                    magneticFieldReading = (SensorReading.MagneticFieldReading) compositeDecoderB.o(descriptor2, 4, SensorReading$MagneticFieldReading$$serializer.INSTANCE, magneticFieldReading);
                    i |= 16;
                    break;
                case 5:
                    magneticFieldUncalibratedReading = (SensorReading.MagneticFieldUncalibratedReading) compositeDecoderB.o(descriptor2, 5, SensorReading$MagneticFieldUncalibratedReading$$serializer.INSTANCE, magneticFieldUncalibratedReading);
                    i |= 32;
                    break;
                case 6:
                    pressureReading = (SensorReading.PressureReading) compositeDecoderB.o(descriptor2, 6, SensorReading$PressureReading$$serializer.INSTANCE, pressureReading);
                    i |= 64;
                    break;
                case 7:
                    locationReading = (SensorReading.LocationReading) compositeDecoderB.o(descriptor2, 7, SensorReading$LocationReading$$serializer.INSTANCE, locationReading);
                    i |= 128;
                    break;
                case 8:
                    b = (Byte) compositeDecoderB.k(descriptor2, 8, ByteSerializer.f24781a, b);
                    i |= 256;
                    break;
                case 9:
                    jF = compositeDecoderB.f(descriptor2, 9);
                    i |= 512;
                    break;
                default:
                    throw new UnknownFieldException(iU);
            }
        }
        compositeDecoderB.c(descriptor2);
        return new SensorsDataReading(i, gyroscopeReading, gyroscopeUncalibratedReading, gameRotationVectorReading, accelerometerReading, magneticFieldReading, magneticFieldUncalibratedReading, pressureReading, locationReading, b, jF, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull SensorsDataReading value) {
        Intrinsics.h(encoder, "encoder");
        Intrinsics.h(value, "value");
        SerialDescriptor descriptor2 = getB();
        CompositeEncoder compositeEncoderB = encoder.b(descriptor2);
        SensorsDataReading.write$Self$internal_publishRelease(value, compositeEncoderB, descriptor2);
        compositeEncoderB.c(descriptor2);
    }
}
