package me.oriient.internal.services.sensorsManager.sensors;

import java.util.List;
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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"me/oriient/internal/services/sensorsManager/sensors/SensorsDataSample.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lme/oriient/internal/services/sensorsManager/sensors/SensorsDataSample;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated
/* loaded from: classes7.dex */
public final class SensorsDataSample$$serializer implements GeneratedSerializer<SensorsDataSample> {

    @NotNull
    public static final SensorsDataSample$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SensorsDataSample$$serializer sensorsDataSample$$serializer = new SensorsDataSample$$serializer();
        INSTANCE = sensorsDataSample$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("me.oriient.internal.services.sensorsManager.sensors.SensorsDataSample", sensorsDataSample$$serializer, 6);
        pluginGeneratedSerialDescriptor.k("numReadingsInBatch", false);
        pluginGeneratedSerialDescriptor.k("readings", false);
        pluginGeneratedSerialDescriptor.k("firstGyroTimestampNanos", false);
        pluginGeneratedSerialDescriptor.k("startTimeNanos", false);
        pluginGeneratedSerialDescriptor.k("endTimeNanos", false);
        pluginGeneratedSerialDescriptor.k("buildingStartTimestampNanos", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SensorsDataSample$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        KSerializer<?> kSerializer = SensorsDataSample.$childSerializers[1];
        LongSerializer longSerializer = LongSerializer.f24804a;
        return new KSerializer[]{IntSerializer.f24800a, kSerializer, longSerializer, longSerializer, longSerializer, longSerializer};
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
    public SensorsDataSample deserialize(@NotNull Decoder decoder) {
        Intrinsics.h(decoder, "decoder");
        SerialDescriptor b = getB();
        CompositeDecoder compositeDecoderB = decoder.b(b);
        KSerializer[] kSerializerArr = SensorsDataSample.$childSerializers;
        int i = 0;
        int iG = 0;
        List list = null;
        long jF = 0;
        long jF2 = 0;
        long jF3 = 0;
        long jF4 = 0;
        boolean z = true;
        while (z) {
            int iU = compositeDecoderB.u(b);
            switch (iU) {
                case -1:
                    z = false;
                    break;
                case 0:
                    iG = compositeDecoderB.g(b, 0);
                    i |= 1;
                    break;
                case 1:
                    list = (List) compositeDecoderB.o(b, 1, kSerializerArr[1], list);
                    i |= 2;
                    break;
                case 2:
                    jF = compositeDecoderB.f(b, 2);
                    i |= 4;
                    break;
                case 3:
                    jF2 = compositeDecoderB.f(b, 3);
                    i |= 8;
                    break;
                case 4:
                    jF3 = compositeDecoderB.f(b, 4);
                    i |= 16;
                    break;
                case 5:
                    jF4 = compositeDecoderB.f(b, 5);
                    i |= 32;
                    break;
                default:
                    throw new UnknownFieldException(iU);
            }
        }
        compositeDecoderB.c(b);
        return new SensorsDataSample(i, iG, list, jF, jF2, jF3, jF4, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull SensorsDataSample value) {
        Intrinsics.h(encoder, "encoder");
        Intrinsics.h(value, "value");
        SerialDescriptor b = getB();
        CompositeEncoder compositeEncoderB = encoder.b(b);
        SensorsDataSample.write$Self$internal_publishRelease(value, compositeEncoderB, b);
        compositeEncoderB.c(b);
    }
}
