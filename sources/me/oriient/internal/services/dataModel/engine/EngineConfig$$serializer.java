package me.oriient.internal.services.dataModel.engine;

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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"me/oriient/internal/services/dataModel/engine/EngineConfig.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lme/oriient/internal/services/dataModel/engine/EngineConfig;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated
/* loaded from: classes7.dex */
public final class EngineConfig$$serializer implements GeneratedSerializer<EngineConfig> {

    @NotNull
    public static final EngineConfig$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        EngineConfig$$serializer engineConfig$$serializer = new EngineConfig$$serializer();
        INSTANCE = engineConfig$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("me.oriient.internal.services.dataModel.engine.EngineConfig", engineConfig$$serializer, 19);
        pluginGeneratedSerialDescriptor.k("enableLocationReporting", false);
        pluginGeneratedSerialDescriptor.k("locationReportingIntervalSeconds", false);
        pluginGeneratedSerialDescriptor.k("locationReportingTimeoutSeconds", false);
        pluginGeneratedSerialDescriptor.k("locationReportingTimeoutsToFail", false);
        pluginGeneratedSerialDescriptor.k("isSmartCartMode", false);
        pluginGeneratedSerialDescriptor.k("modelFetchRetryIntervalSeconds", false);
        pluginGeneratedSerialDescriptor.k("modelFetchRetryCount", false);
        pluginGeneratedSerialDescriptor.k("mapGridUrlExpirationTimeMinutes", false);
        pluginGeneratedSerialDescriptor.k("mapGridFetchingStrategy", false);
        pluginGeneratedSerialDescriptor.k("mapGridType", false);
        pluginGeneratedSerialDescriptor.k("engineSessionFetchRetryCount", false);
        pluginGeneratedSerialDescriptor.k("engineSessionFetchRetryIntervalSeconds", false);
        pluginGeneratedSerialDescriptor.k("engineSessionRefreshIntervalBeforeExpirationSeconds", false);
        pluginGeneratedSerialDescriptor.k("specificConfig", false);
        pluginGeneratedSerialDescriptor.k("mainOrientationCalculator", false);
        pluginGeneratedSerialDescriptor.k("isPositioningDebuggingEnabled", false);
        pluginGeneratedSerialDescriptor.k("locationReportingQueueLimit", false);
        pluginGeneratedSerialDescriptor.k("locationReportingConnectionRetryInitialIntervalMillis", false);
        pluginGeneratedSerialDescriptor.k("locationReportingConnectionRetryMaxIntervalMillis", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private EngineConfig$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = EngineConfig.$childSerializers;
        KSerializer<?> kSerializer = kSerializerArr[8];
        KSerializer<?> kSerializer2 = kSerializerArr[9];
        BooleanSerializer booleanSerializer = BooleanSerializer.f24779a;
        DoubleSerializer doubleSerializer = DoubleSerializer.f24792a;
        IntSerializer intSerializer = IntSerializer.f24800a;
        LongSerializer longSerializer = LongSerializer.f24804a;
        return new KSerializer[]{booleanSerializer, doubleSerializer, doubleSerializer, intSerializer, booleanSerializer, doubleSerializer, intSerializer, doubleSerializer, kSerializer, kSerializer2, intSerializer, doubleSerializer, doubleSerializer, SpecificEngineConfig$$serializer.INSTANCE, MainOrientationCalculatorConfig$$serializer.INSTANCE, booleanSerializer, intSerializer, longSerializer, longSerializer};
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
    public EngineConfig deserialize(@NotNull Decoder decoder) {
        int i;
        Intrinsics.h(decoder, "decoder");
        SerialDescriptor b = getB();
        CompositeDecoder compositeDecoderB = decoder.b(b);
        KSerializer[] kSerializerArr = EngineConfig.$childSerializers;
        MapGridFetchingStrategy mapGridFetchingStrategy = null;
        double D = 0.0d;
        double D2 = 0.0d;
        double D3 = 0.0d;
        double D4 = 0.0d;
        double D5 = 0.0d;
        double D6 = 0.0d;
        SpecificEngineConfig specificEngineConfig = null;
        MapGridType mapGridType = null;
        long jF = 0;
        long jF2 = 0;
        boolean z = true;
        int i2 = 0;
        boolean zB = false;
        int iG = 0;
        boolean zB2 = false;
        int iG2 = 0;
        int iG3 = 0;
        boolean zB3 = false;
        int iG4 = 0;
        MainOrientationCalculatorConfig mainOrientationCalculatorConfig = null;
        while (z) {
            int iU = compositeDecoderB.u(b);
            int i3 = 16;
            int i4 = 8;
            switch (iU) {
                case -1:
                    z = false;
                case 0:
                    zB = compositeDecoderB.B(b, 0);
                    i = 1;
                    i2 |= i;
                case 1:
                    D = compositeDecoderB.D(b, 1);
                    i = 2;
                    i2 |= i;
                case 2:
                    i4 = 4;
                    D2 = compositeDecoderB.D(b, 2);
                    i = i4;
                    i2 |= i;
                case 3:
                    iG = compositeDecoderB.g(b, 3);
                    i = i4;
                    i2 |= i;
                case 4:
                    zB2 = compositeDecoderB.B(b, 4);
                    i = i3;
                    i2 |= i;
                case 5:
                    i = 32;
                    D3 = compositeDecoderB.D(b, 5);
                    i2 |= i;
                case 6:
                    iG2 = compositeDecoderB.g(b, 6);
                    i3 = 64;
                    i = i3;
                    i2 |= i;
                case 7:
                    i = 128;
                    D4 = compositeDecoderB.D(b, 7);
                    i2 |= i;
                case 8:
                    i3 = 256;
                    mapGridFetchingStrategy = (MapGridFetchingStrategy) compositeDecoderB.o(b, 8, kSerializerArr[8], mapGridFetchingStrategy);
                    i = i3;
                    i2 |= i;
                case 9:
                    i3 = 512;
                    mapGridType = (MapGridType) compositeDecoderB.o(b, 9, kSerializerArr[9], mapGridType);
                    i = i3;
                    i2 |= i;
                case 10:
                    iG3 = compositeDecoderB.g(b, 10);
                    i3 = 1024;
                    i = i3;
                    i2 |= i;
                case 11:
                    i = 2048;
                    D5 = compositeDecoderB.D(b, 11);
                    i2 |= i;
                case 12:
                    i = 4096;
                    D6 = compositeDecoderB.D(b, 12);
                    i2 |= i;
                case 13:
                    i3 = 8192;
                    specificEngineConfig = (SpecificEngineConfig) compositeDecoderB.o(b, 13, SpecificEngineConfig$$serializer.INSTANCE, specificEngineConfig);
                    i = i3;
                    i2 |= i;
                case 14:
                    i3 = 16384;
                    mainOrientationCalculatorConfig = (MainOrientationCalculatorConfig) compositeDecoderB.o(b, 14, MainOrientationCalculatorConfig$$serializer.INSTANCE, mainOrientationCalculatorConfig);
                    i = i3;
                    i2 |= i;
                case 15:
                    zB3 = compositeDecoderB.B(b, 15);
                    i3 = 32768;
                    i = i3;
                    i2 |= i;
                case 16:
                    iG4 = compositeDecoderB.g(b, 16);
                    i3 = 65536;
                    i = i3;
                    i2 |= i;
                case 17:
                    i = 131072;
                    jF = compositeDecoderB.f(b, 17);
                    i2 |= i;
                case 18:
                    i = 262144;
                    jF2 = compositeDecoderB.f(b, 18);
                    i2 |= i;
                default:
                    throw new UnknownFieldException(iU);
            }
        }
        compositeDecoderB.c(b);
        return new EngineConfig(i2, zB, D, D2, iG, zB2, D3, iG2, D4, mapGridFetchingStrategy, mapGridType, iG3, D5, D6, specificEngineConfig, mainOrientationCalculatorConfig, zB3, iG4, jF, jF2, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull EngineConfig value) {
        Intrinsics.h(encoder, "encoder");
        Intrinsics.h(value, "value");
        SerialDescriptor b = getB();
        CompositeEncoder compositeEncoderB = encoder.b(b);
        EngineConfig.write$Self$internal_publishRelease(value, compositeEncoderB, b);
        compositeEncoderB.c(b);
    }
}
