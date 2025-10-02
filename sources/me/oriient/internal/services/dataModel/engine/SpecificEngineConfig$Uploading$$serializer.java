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
import me.oriient.internal.services.dataModel.engine.SpecificEngineConfig;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"me/oriient/internal/services/dataModel/engine/SpecificEngineConfig.Uploading.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lme/oriient/internal/services/dataModel/engine/SpecificEngineConfig$Uploading;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated
/* loaded from: classes7.dex */
public final class SpecificEngineConfig$Uploading$$serializer implements GeneratedSerializer<SpecificEngineConfig.Uploading> {

    @NotNull
    public static final SpecificEngineConfig$Uploading$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SpecificEngineConfig$Uploading$$serializer specificEngineConfig$Uploading$$serializer = new SpecificEngineConfig$Uploading$$serializer();
        INSTANCE = specificEngineConfig$Uploading$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("me.oriient.internal.services.dataModel.engine.SpecificEngineConfig.Uploading", specificEngineConfig$Uploading$$serializer, 22);
        pluginGeneratedSerialDescriptor.k("enableValidationUploading", false);
        pluginGeneratedSerialDescriptor.k("enablePositionsUploading", false);
        pluginGeneratedSerialDescriptor.k("enableSensorsDataUploading", false);
        pluginGeneratedSerialDescriptor.k("enableRestrictedAreasValidationUploading", false);
        pluginGeneratedSerialDescriptor.k("aggressiveMode", false);
        pluginGeneratedSerialDescriptor.k("enableEventsUploading", false);
        pluginGeneratedSerialDescriptor.k("uploadWriteToFileRecords", false);
        pluginGeneratedSerialDescriptor.k("writeToFileIntervalSec", false);
        pluginGeneratedSerialDescriptor.k("metadataUpdateIntervalSec", false);
        pluginGeneratedSerialDescriptor.k("uploadChunkLengthSeconds", false);
        pluginGeneratedSerialDescriptor.k("uploadMaxSessionLengthMin", false);
        pluginGeneratedSerialDescriptor.k("uploadingExpirationTimeDays", false);
        pluginGeneratedSerialDescriptor.k("uploadTaskMaxDelayMin", false);
        pluginGeneratedSerialDescriptor.k("controlTaskMaxTimeMin", false);
        pluginGeneratedSerialDescriptor.k("controlTaskIntervalMin", false);
        pluginGeneratedSerialDescriptor.k("chargerTaskIntervalMin", false);
        pluginGeneratedSerialDescriptor.k("uploadingWifiRequired", false);
        pluginGeneratedSerialDescriptor.k("uploadingChargerRequired", false);
        pluginGeneratedSerialDescriptor.k("minimumStorageLeftToUploadPositionsMb", false);
        pluginGeneratedSerialDescriptor.k("minimumStorageLeftToUploadSensorsMb", false);
        pluginGeneratedSerialDescriptor.k("minimumStorageLeftToUploadValidationsMb", false);
        pluginGeneratedSerialDescriptor.k("minimumStorageLeftToUploadEventsMb", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SpecificEngineConfig$Uploading$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        BooleanSerializer booleanSerializer = BooleanSerializer.f24779a;
        DoubleSerializer doubleSerializer = DoubleSerializer.f24792a;
        LongSerializer longSerializer = LongSerializer.f24804a;
        return new KSerializer[]{booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, IntSerializer.f24800a, doubleSerializer, doubleSerializer, doubleSerializer, doubleSerializer, doubleSerializer, longSerializer, longSerializer, longSerializer, longSerializer, booleanSerializer, booleanSerializer, doubleSerializer, doubleSerializer, doubleSerializer, doubleSerializer};
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
    public SpecificEngineConfig.Uploading deserialize(@NotNull Decoder decoder) {
        Intrinsics.h(decoder, "decoder");
        SerialDescriptor b = getB();
        CompositeDecoder compositeDecoderB = decoder.b(b);
        double D = 0.0d;
        double D2 = 0.0d;
        double D3 = 0.0d;
        double D4 = 0.0d;
        double D5 = 0.0d;
        double D6 = 0.0d;
        double D7 = 0.0d;
        double D8 = 0.0d;
        double D9 = 0.0d;
        long jF = 0;
        long jF2 = 0;
        long jF3 = 0;
        long jF4 = 0;
        int i = 0;
        boolean zB = false;
        boolean zB2 = false;
        boolean zB3 = false;
        boolean zB4 = false;
        boolean zB5 = false;
        boolean zB6 = false;
        int iG = 0;
        boolean zB7 = false;
        boolean zB8 = false;
        boolean z = true;
        while (z) {
            int iU = compositeDecoderB.u(b);
            int i2 = 16;
            int i3 = 2;
            switch (iU) {
                case -1:
                    z = false;
                case 0:
                    zB = compositeDecoderB.B(b, 0);
                    i2 = 1;
                    i |= i2;
                case 1:
                    zB2 = compositeDecoderB.B(b, 1);
                    i2 = i3;
                    i |= i2;
                case 2:
                    zB3 = compositeDecoderB.B(b, 2);
                    i2 = 4;
                    i |= i2;
                case 3:
                    zB4 = compositeDecoderB.B(b, 3);
                    i2 = 8;
                    i |= i2;
                case 4:
                    zB5 = compositeDecoderB.B(b, 4);
                    i |= i2;
                case 5:
                    zB6 = compositeDecoderB.B(b, 5);
                    i2 = 32;
                    i |= i2;
                case 6:
                    iG = compositeDecoderB.g(b, 6);
                    i2 = 64;
                    i |= i2;
                case 7:
                    i3 = 128;
                    D = compositeDecoderB.D(b, 7);
                    i2 = i3;
                    i |= i2;
                case 8:
                    i3 = 256;
                    D2 = compositeDecoderB.D(b, 8);
                    i2 = i3;
                    i |= i2;
                case 9:
                    i3 = 512;
                    D3 = compositeDecoderB.D(b, 9);
                    i2 = i3;
                    i |= i2;
                case 10:
                    i3 = 1024;
                    D4 = compositeDecoderB.D(b, 10);
                    i2 = i3;
                    i |= i2;
                case 11:
                    i3 = 2048;
                    D5 = compositeDecoderB.D(b, 11);
                    i2 = i3;
                    i |= i2;
                case 12:
                    i3 = 4096;
                    jF = compositeDecoderB.f(b, 12);
                    i2 = i3;
                    i |= i2;
                case 13:
                    i3 = 8192;
                    jF2 = compositeDecoderB.f(b, 13);
                    i2 = i3;
                    i |= i2;
                case 14:
                    i3 = 16384;
                    jF3 = compositeDecoderB.f(b, 14);
                    i2 = i3;
                    i |= i2;
                case 15:
                    i3 = 32768;
                    jF4 = compositeDecoderB.f(b, 15);
                    i2 = i3;
                    i |= i2;
                case 16:
                    zB7 = compositeDecoderB.B(b, 16);
                    i2 = 65536;
                    i |= i2;
                case 17:
                    zB8 = compositeDecoderB.B(b, 17);
                    i2 = 131072;
                    i |= i2;
                case 18:
                    i3 = 262144;
                    D6 = compositeDecoderB.D(b, 18);
                    i2 = i3;
                    i |= i2;
                case 19:
                    i3 = 524288;
                    D7 = compositeDecoderB.D(b, 19);
                    i2 = i3;
                    i |= i2;
                case 20:
                    i3 = 1048576;
                    D8 = compositeDecoderB.D(b, 20);
                    i2 = i3;
                    i |= i2;
                case 21:
                    i3 = 2097152;
                    D9 = compositeDecoderB.D(b, 21);
                    i2 = i3;
                    i |= i2;
                default:
                    throw new UnknownFieldException(iU);
            }
        }
        compositeDecoderB.c(b);
        return new SpecificEngineConfig.Uploading(i, zB, zB2, zB3, zB4, zB5, zB6, iG, D, D2, D3, D4, D5, jF, jF2, jF3, jF4, zB7, zB8, D6, D7, D8, D9, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull SpecificEngineConfig.Uploading value) {
        Intrinsics.h(encoder, "encoder");
        Intrinsics.h(value, "value");
        SerialDescriptor b = getB();
        CompositeEncoder compositeEncoderB = encoder.b(b);
        SpecificEngineConfig.Uploading.write$Self$internal_publishRelease(value, compositeEncoderB, b);
        compositeEncoderB.c(b);
    }
}
