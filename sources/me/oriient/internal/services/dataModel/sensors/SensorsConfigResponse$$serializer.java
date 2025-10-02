package me.oriient.internal.services.dataModel.sensors;

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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"me/oriient/internal/services/dataModel/sensors/SensorsConfigResponse.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lme/oriient/internal/services/dataModel/sensors/SensorsConfigResponse;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated
/* loaded from: classes7.dex */
public final class SensorsConfigResponse$$serializer implements GeneratedSerializer<SensorsConfigResponse> {

    @NotNull
    public static final SensorsConfigResponse$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SensorsConfigResponse$$serializer sensorsConfigResponse$$serializer = new SensorsConfigResponse$$serializer();
        INSTANCE = sensorsConfigResponse$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("me.oriient.internal.services.dataModel.sensors.SensorsConfigResponse", sensorsConfigResponse$$serializer, 7);
        pluginGeneratedSerialDescriptor.k("gyroscope", true);
        pluginGeneratedSerialDescriptor.k("gyroscopeUncalibrated", true);
        pluginGeneratedSerialDescriptor.k("accelerometer", true);
        pluginGeneratedSerialDescriptor.k("gameRotation", true);
        pluginGeneratedSerialDescriptor.k("magneticField", true);
        pluginGeneratedSerialDescriptor.k("magneticFieldUncalibrated", true);
        pluginGeneratedSerialDescriptor.k("pressure", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SensorsConfigResponse$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        SensorConfigResponse$$serializer sensorConfigResponse$$serializer = SensorConfigResponse$$serializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.d(sensorConfigResponse$$serializer), BuiltinSerializersKt.d(sensorConfigResponse$$serializer), BuiltinSerializersKt.d(sensorConfigResponse$$serializer), BuiltinSerializersKt.d(sensorConfigResponse$$serializer), BuiltinSerializersKt.d(sensorConfigResponse$$serializer), BuiltinSerializersKt.d(sensorConfigResponse$$serializer), BuiltinSerializersKt.d(sensorConfigResponse$$serializer)};
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
    public SensorsConfigResponse deserialize(@NotNull Decoder decoder) {
        Intrinsics.h(decoder, "decoder");
        SerialDescriptor b = getB();
        CompositeDecoder compositeDecoderB = decoder.b(b);
        int i = 0;
        SensorConfigResponse sensorConfigResponse = null;
        SensorConfigResponse sensorConfigResponse2 = null;
        SensorConfigResponse sensorConfigResponse3 = null;
        SensorConfigResponse sensorConfigResponse4 = null;
        SensorConfigResponse sensorConfigResponse5 = null;
        SensorConfigResponse sensorConfigResponse6 = null;
        SensorConfigResponse sensorConfigResponse7 = null;
        boolean z = true;
        while (z) {
            int iU = compositeDecoderB.u(b);
            switch (iU) {
                case -1:
                    z = false;
                    break;
                case 0:
                    sensorConfigResponse = (SensorConfigResponse) compositeDecoderB.k(b, 0, SensorConfigResponse$$serializer.INSTANCE, sensorConfigResponse);
                    i |= 1;
                    break;
                case 1:
                    sensorConfigResponse2 = (SensorConfigResponse) compositeDecoderB.k(b, 1, SensorConfigResponse$$serializer.INSTANCE, sensorConfigResponse2);
                    i |= 2;
                    break;
                case 2:
                    sensorConfigResponse3 = (SensorConfigResponse) compositeDecoderB.k(b, 2, SensorConfigResponse$$serializer.INSTANCE, sensorConfigResponse3);
                    i |= 4;
                    break;
                case 3:
                    sensorConfigResponse4 = (SensorConfigResponse) compositeDecoderB.k(b, 3, SensorConfigResponse$$serializer.INSTANCE, sensorConfigResponse4);
                    i |= 8;
                    break;
                case 4:
                    sensorConfigResponse5 = (SensorConfigResponse) compositeDecoderB.k(b, 4, SensorConfigResponse$$serializer.INSTANCE, sensorConfigResponse5);
                    i |= 16;
                    break;
                case 5:
                    sensorConfigResponse6 = (SensorConfigResponse) compositeDecoderB.k(b, 5, SensorConfigResponse$$serializer.INSTANCE, sensorConfigResponse6);
                    i |= 32;
                    break;
                case 6:
                    sensorConfigResponse7 = (SensorConfigResponse) compositeDecoderB.k(b, 6, SensorConfigResponse$$serializer.INSTANCE, sensorConfigResponse7);
                    i |= 64;
                    break;
                default:
                    throw new UnknownFieldException(iU);
            }
        }
        compositeDecoderB.c(b);
        return new SensorsConfigResponse(i, sensorConfigResponse, sensorConfigResponse2, sensorConfigResponse3, sensorConfigResponse4, sensorConfigResponse5, sensorConfigResponse6, sensorConfigResponse7, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull SensorsConfigResponse value) {
        Intrinsics.h(encoder, "encoder");
        Intrinsics.h(value, "value");
        SerialDescriptor b = getB();
        CompositeEncoder compositeEncoderB = encoder.b(b);
        SensorsConfigResponse.write$Self$internal_publishRelease(value, compositeEncoderB, b);
        compositeEncoderB.c(b);
    }
}
