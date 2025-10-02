package me.oriient.internal.services.dataManager.floorMetadata;

import java.util.List;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"me/oriient/internal/services/dataManager/floorMetadata/FloorMetadataResponse.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lme/oriient/internal/services/dataManager/floorMetadata/FloorMetadataResponse;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated
/* loaded from: classes7.dex */
public final class FloorMetadataResponse$$serializer implements GeneratedSerializer<FloorMetadataResponse> {

    @NotNull
    public static final FloorMetadataResponse$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        FloorMetadataResponse$$serializer floorMetadataResponse$$serializer = new FloorMetadataResponse$$serializer();
        INSTANCE = floorMetadataResponse$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("me.oriient.internal.services.dataManager.floorMetadata.FloorMetadataResponse", floorMetadataResponse$$serializer, 11);
        pluginGeneratedSerialDescriptor.k("floorId", false);
        pluginGeneratedSerialDescriptor.k("floorName", false);
        pluginGeneratedSerialDescriptor.k("height", false);
        pluginGeneratedSerialDescriptor.k("floorIndex", false);
        pluginGeneratedSerialDescriptor.k("primary", false);
        pluginGeneratedSerialDescriptor.k("mapComponentImageRotation", true);
        pluginGeneratedSerialDescriptor.k("floorImages", false);
        pluginGeneratedSerialDescriptor.k("maps", false);
        pluginGeneratedSerialDescriptor.k("exitRegions", true);
        pluginGeneratedSerialDescriptor.k("signMarks", true);
        pluginGeneratedSerialDescriptor.k("restrictedAreas", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private FloorMetadataResponse$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = FloorMetadataResponse.$childSerializers;
        DoubleSerializer doubleSerializer = DoubleSerializer.f24792a;
        KSerializer<?> kSerializerD = BuiltinSerializersKt.d(doubleSerializer);
        KSerializer<?> kSerializer = kSerializerArr[6];
        KSerializer<?> kSerializer2 = kSerializerArr[7];
        KSerializer<?> kSerializerD2 = BuiltinSerializersKt.d(kSerializerArr[8]);
        KSerializer<?> kSerializerD3 = BuiltinSerializersKt.d(kSerializerArr[9]);
        KSerializer<?> kSerializerD4 = BuiltinSerializersKt.d(kSerializerArr[10]);
        StringSerializer stringSerializer = StringSerializer.f24821a;
        return new KSerializer[]{stringSerializer, stringSerializer, doubleSerializer, IntSerializer.f24800a, BooleanSerializer.f24779a, kSerializerD, kSerializer, kSerializer2, kSerializerD2, kSerializerD3, kSerializerD4};
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
    public FloorMetadataResponse deserialize(@NotNull Decoder decoder) {
        KSerializer[] kSerializerArr;
        Intrinsics.h(decoder, "decoder");
        SerialDescriptor b = getB();
        CompositeDecoder compositeDecoderB = decoder.b(b);
        KSerializer[] kSerializerArr2 = FloorMetadataResponse.$childSerializers;
        Double d = null;
        List list = null;
        List list2 = null;
        String strJ = null;
        String strJ2 = null;
        List list3 = null;
        double D = 0.0d;
        int i = 0;
        boolean z = true;
        int iG = 0;
        boolean zB = false;
        List list4 = null;
        List list5 = null;
        while (z) {
            int iU = compositeDecoderB.u(b);
            switch (iU) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    kSerializerArr = kSerializerArr2;
                    strJ = compositeDecoderB.j(b, 0);
                    i |= 1;
                    break;
                case 1:
                    kSerializerArr = kSerializerArr2;
                    strJ2 = compositeDecoderB.j(b, 1);
                    i |= 2;
                    break;
                case 2:
                    kSerializerArr = kSerializerArr2;
                    D = compositeDecoderB.D(b, 2);
                    i |= 4;
                    break;
                case 3:
                    kSerializerArr = kSerializerArr2;
                    iG = compositeDecoderB.g(b, 3);
                    i |= 8;
                    break;
                case 4:
                    kSerializerArr = kSerializerArr2;
                    zB = compositeDecoderB.B(b, 4);
                    i |= 16;
                    break;
                case 5:
                    kSerializerArr = kSerializerArr2;
                    d = (Double) compositeDecoderB.k(b, 5, DoubleSerializer.f24792a, d);
                    i |= 32;
                    break;
                case 6:
                    kSerializerArr = kSerializerArr2;
                    list4 = (List) compositeDecoderB.o(b, 6, kSerializerArr[6], list4);
                    i |= 64;
                    break;
                case 7:
                    kSerializerArr = kSerializerArr2;
                    list5 = (List) compositeDecoderB.o(b, 7, kSerializerArr[7], list5);
                    i |= 128;
                    break;
                case 8:
                    kSerializerArr = kSerializerArr2;
                    list = (List) compositeDecoderB.k(b, 8, kSerializerArr[8], list);
                    i |= 256;
                    break;
                case 9:
                    kSerializerArr = kSerializerArr2;
                    list2 = (List) compositeDecoderB.k(b, 9, kSerializerArr[9], list2);
                    i |= 512;
                    break;
                case 10:
                    kSerializerArr = kSerializerArr2;
                    list3 = (List) compositeDecoderB.k(b, 10, kSerializerArr[10], list3);
                    i |= 1024;
                    break;
                default:
                    throw new UnknownFieldException(iU);
            }
            kSerializerArr2 = kSerializerArr;
        }
        compositeDecoderB.c(b);
        return new FloorMetadataResponse(i, strJ, strJ2, D, iG, zB, d, list4, list5, list, list2, list3, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull FloorMetadataResponse value) {
        Intrinsics.h(encoder, "encoder");
        Intrinsics.h(value, "value");
        SerialDescriptor b = getB();
        CompositeEncoder compositeEncoderB = encoder.b(b);
        FloorMetadataResponse.write$Self$internal_publishRelease(value, compositeEncoderB, b);
        compositeEncoderB.c(b);
    }
}
