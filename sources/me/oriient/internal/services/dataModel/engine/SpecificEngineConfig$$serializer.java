package me.oriient.internal.services.dataModel.engine;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;
import me.oriient.internal.services.dataModel.engine.SpecificEngineConfig;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"me/oriient/internal/services/dataModel/engine/SpecificEngineConfig.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lme/oriient/internal/services/dataModel/engine/SpecificEngineConfig;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated
/* loaded from: classes7.dex */
public final class SpecificEngineConfig$$serializer implements GeneratedSerializer<SpecificEngineConfig> {

    @NotNull
    public static final SpecificEngineConfig$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SpecificEngineConfig$$serializer specificEngineConfig$$serializer = new SpecificEngineConfig$$serializer();
        INSTANCE = specificEngineConfig$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("me.oriient.internal.services.dataModel.engine.SpecificEngineConfig", specificEngineConfig$$serializer, 10);
        pluginGeneratedSerialDescriptor.k("enableEnginePerformanceMonitor", false);
        pluginGeneratedSerialDescriptor.k("calibrationExpirationTimeMinutes", false);
        pluginGeneratedSerialDescriptor.k("sessionProgressLogsIntervalSeconds", false);
        pluginGeneratedSerialDescriptor.k("engineUpdatesBufferSize", false);
        pluginGeneratedSerialDescriptor.k("uploading", false);
        pluginGeneratedSerialDescriptor.k("librariesValidationStrategy", false);
        pluginGeneratedSerialDescriptor.k("coreConfigProvider", false);
        pluginGeneratedSerialDescriptor.k("startReportingRetryCount", false);
        pluginGeneratedSerialDescriptor.k("startReportingRetryIntervalSeconds", false);
        pluginGeneratedSerialDescriptor.k(AppMeasurementSdk.ConditionalUserProperty.NAME, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SpecificEngineConfig$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        KSerializer<?> kSerializer = SpecificEngineConfig.$childSerializers[5];
        DoubleSerializer doubleSerializer = DoubleSerializer.f24792a;
        IntSerializer intSerializer = IntSerializer.f24800a;
        return new KSerializer[]{BooleanSerializer.f24779a, doubleSerializer, doubleSerializer, intSerializer, SpecificEngineConfig$Uploading$$serializer.INSTANCE, kSerializer, OnDeviceEngineCoreConfigProvider$$serializer.INSTANCE, intSerializer, doubleSerializer, StringSerializer.f24821a};
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
    public SpecificEngineConfig deserialize(@NotNull Decoder decoder) {
        Intrinsics.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getB();
        CompositeDecoder compositeDecoderB = decoder.b(descriptor2);
        KSerializer[] kSerializerArr = SpecificEngineConfig.$childSerializers;
        SpecificEngineConfig.Uploading uploading = null;
        double D = 0.0d;
        double D2 = 0.0d;
        double D3 = 0.0d;
        SpecificEngineConfig.EngineLibrariesValidationStrategy engineLibrariesValidationStrategy = null;
        OnDeviceEngineCoreConfigProvider onDeviceEngineCoreConfigProvider = null;
        String strJ = null;
        boolean z = true;
        int i = 0;
        boolean zB = false;
        int iG = 0;
        int iG2 = 0;
        while (z) {
            int iU = compositeDecoderB.u(descriptor2);
            switch (iU) {
                case -1:
                    z = false;
                    break;
                case 0:
                    zB = compositeDecoderB.B(descriptor2, 0);
                    i |= 1;
                    break;
                case 1:
                    D = compositeDecoderB.D(descriptor2, 1);
                    i |= 2;
                    break;
                case 2:
                    D2 = compositeDecoderB.D(descriptor2, 2);
                    i |= 4;
                    break;
                case 3:
                    iG = compositeDecoderB.g(descriptor2, 3);
                    i |= 8;
                    break;
                case 4:
                    uploading = (SpecificEngineConfig.Uploading) compositeDecoderB.o(descriptor2, 4, SpecificEngineConfig$Uploading$$serializer.INSTANCE, uploading);
                    i |= 16;
                    break;
                case 5:
                    engineLibrariesValidationStrategy = (SpecificEngineConfig.EngineLibrariesValidationStrategy) compositeDecoderB.o(descriptor2, 5, kSerializerArr[5], engineLibrariesValidationStrategy);
                    i |= 32;
                    break;
                case 6:
                    onDeviceEngineCoreConfigProvider = (OnDeviceEngineCoreConfigProvider) compositeDecoderB.o(descriptor2, 6, OnDeviceEngineCoreConfigProvider$$serializer.INSTANCE, onDeviceEngineCoreConfigProvider);
                    i |= 64;
                    break;
                case 7:
                    iG2 = compositeDecoderB.g(descriptor2, 7);
                    i |= 128;
                    break;
                case 8:
                    D3 = compositeDecoderB.D(descriptor2, 8);
                    i |= 256;
                    break;
                case 9:
                    strJ = compositeDecoderB.j(descriptor2, 9);
                    i |= 512;
                    break;
                default:
                    throw new UnknownFieldException(iU);
            }
        }
        compositeDecoderB.c(descriptor2);
        return new SpecificEngineConfig(i, zB, D, D2, iG, uploading, engineLibrariesValidationStrategy, onDeviceEngineCoreConfigProvider, iG2, D3, strJ, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull SpecificEngineConfig value) {
        Intrinsics.h(encoder, "encoder");
        Intrinsics.h(value, "value");
        SerialDescriptor descriptor2 = getB();
        CompositeEncoder compositeEncoderB = encoder.b(descriptor2);
        SpecificEngineConfig.write$Self$internal_publishRelease(value, compositeEncoderB, descriptor2);
        compositeEncoderB.c(descriptor2);
    }
}
