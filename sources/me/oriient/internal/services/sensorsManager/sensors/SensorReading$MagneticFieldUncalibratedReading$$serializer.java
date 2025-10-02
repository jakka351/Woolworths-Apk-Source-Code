package me.oriient.internal.services.sensorsManager.sensors;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import me.oriient.internal.services.sensorsManager.sensors.SensorReading;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"me/oriient/internal/services/sensorsManager/sensors/SensorReading.MagneticFieldUncalibratedReading.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$MagneticFieldUncalibratedReading;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated
/* loaded from: classes7.dex */
public final class SensorReading$MagneticFieldUncalibratedReading$$serializer implements GeneratedSerializer<SensorReading.MagneticFieldUncalibratedReading> {

    @NotNull
    public static final SensorReading$MagneticFieldUncalibratedReading$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SensorReading$MagneticFieldUncalibratedReading$$serializer sensorReading$MagneticFieldUncalibratedReading$$serializer = new SensorReading$MagneticFieldUncalibratedReading$$serializer();
        INSTANCE = sensorReading$MagneticFieldUncalibratedReading$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("me.oriient.internal.services.sensorsManager.sensors.SensorReading.MagneticFieldUncalibratedReading", sensorReading$MagneticFieldUncalibratedReading$$serializer, 9);
        pluginGeneratedSerialDescriptor.k("type", false);
        pluginGeneratedSerialDescriptor.k("timestampNanos", false);
        pluginGeneratedSerialDescriptor.k("timestampUnixMillis", false);
        pluginGeneratedSerialDescriptor.k("x", false);
        pluginGeneratedSerialDescriptor.k("y", false);
        pluginGeneratedSerialDescriptor.k("z", false);
        pluginGeneratedSerialDescriptor.k("isZeroes", true);
        pluginGeneratedSerialDescriptor.k("isNaN", true);
        pluginGeneratedSerialDescriptor.k("hasNaN", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SensorReading$MagneticFieldUncalibratedReading$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        LongSerializer longSerializer = LongSerializer.f24804a;
        DoubleSerializer doubleSerializer = DoubleSerializer.f24792a;
        BooleanSerializer booleanSerializer = BooleanSerializer.f24779a;
        return new KSerializer[]{SensorReading.MagneticFieldUncalibratedReading.$childSerializers[0], longSerializer, longSerializer, doubleSerializer, doubleSerializer, doubleSerializer, booleanSerializer, booleanSerializer, booleanSerializer};
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
    public SensorReading.MagneticFieldUncalibratedReading deserialize(@NotNull Decoder decoder) {
        Intrinsics.h(decoder, "decoder");
        SerialDescriptor b = getB();
        CompositeDecoder compositeDecoderB = decoder.b(b);
        KSerializer[] kSerializerArr = SensorReading.MagneticFieldUncalibratedReading.$childSerializers;
        int i = 0;
        boolean zB = false;
        boolean zB2 = false;
        boolean zB3 = false;
        SystemSensor systemSensor = null;
        long jF = 0;
        long jF2 = 0;
        double D = 0.0d;
        double D2 = 0.0d;
        double D3 = 0.0d;
        boolean z = true;
        while (z) {
            int iU = compositeDecoderB.u(b);
            switch (iU) {
                case -1:
                    z = false;
                    break;
                case 0:
                    systemSensor = (SystemSensor) compositeDecoderB.o(b, 0, kSerializerArr[0], systemSensor);
                    i |= 1;
                    break;
                case 1:
                    jF = compositeDecoderB.f(b, 1);
                    i |= 2;
                    break;
                case 2:
                    jF2 = compositeDecoderB.f(b, 2);
                    i |= 4;
                    break;
                case 3:
                    D = compositeDecoderB.D(b, 3);
                    i |= 8;
                    break;
                case 4:
                    D2 = compositeDecoderB.D(b, 4);
                    i |= 16;
                    break;
                case 5:
                    D3 = compositeDecoderB.D(b, 5);
                    i |= 32;
                    break;
                case 6:
                    zB = compositeDecoderB.B(b, 6);
                    i |= 64;
                    break;
                case 7:
                    zB2 = compositeDecoderB.B(b, 7);
                    i |= 128;
                    break;
                case 8:
                    zB3 = compositeDecoderB.B(b, 8);
                    i |= 256;
                    break;
                default:
                    throw new UnknownFieldException(iU);
            }
        }
        compositeDecoderB.c(b);
        return new SensorReading.MagneticFieldUncalibratedReading(i, systemSensor, jF, jF2, D, D2, D3, zB, zB2, zB3, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull SensorReading.MagneticFieldUncalibratedReading value) {
        Intrinsics.h(encoder, "encoder");
        Intrinsics.h(value, "value");
        SerialDescriptor b = getB();
        CompositeEncoder compositeEncoderB = encoder.b(b);
        SensorReading.MagneticFieldUncalibratedReading.write$Self$internal_publishRelease(value, compositeEncoderB, b);
        compositeEncoderB.c(b);
    }
}
