package me.oriient.ipssdk.realtime.services.rest.responses;

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
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"me/oriient/ipssdk/realtime/services/rest/responses/PlacementResponse.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lme/oriient/ipssdk/realtime/services/rest/responses/PlacementResponse;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated
/* loaded from: classes8.dex */
public final class PlacementResponse$$serializer implements GeneratedSerializer<PlacementResponse> {

    @NotNull
    public static final PlacementResponse$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        PlacementResponse$$serializer placementResponse$$serializer = new PlacementResponse$$serializer();
        INSTANCE = placementResponse$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("me.oriient.ipssdk.realtime.services.rest.responses.PlacementResponse", placementResponse$$serializer, 11);
        pluginGeneratedSerialDescriptor.k("placementId", true);
        pluginGeneratedSerialDescriptor.k("floorIndex", true);
        pluginGeneratedSerialDescriptor.k("mapId", true);
        pluginGeneratedSerialDescriptor.k("clientCategory", true);
        pluginGeneratedSerialDescriptor.k("regionType", true);
        pluginGeneratedSerialDescriptor.k("topRight", true);
        pluginGeneratedSerialDescriptor.k("bottomLeft", true);
        pluginGeneratedSerialDescriptor.k("center", true);
        pluginGeneratedSerialDescriptor.k("radius", true);
        pluginGeneratedSerialDescriptor.k("points", true);
        pluginGeneratedSerialDescriptor.k("coordinates", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PlacementResponse$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = PlacementResponse.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.f24821a;
        KSerializer<?> kSerializerD = BuiltinSerializersKt.d(stringSerializer);
        IntSerializer intSerializer = IntSerializer.f24800a;
        return new KSerializer[]{kSerializerD, BuiltinSerializersKt.d(intSerializer), BuiltinSerializersKt.d(stringSerializer), BuiltinSerializersKt.d(intSerializer), BuiltinSerializersKt.d(stringSerializer), BuiltinSerializersKt.d(kSerializerArr[5]), BuiltinSerializersKt.d(kSerializerArr[6]), BuiltinSerializersKt.d(kSerializerArr[7]), BuiltinSerializersKt.d(DoubleSerializer.f24792a), BuiltinSerializersKt.d(kSerializerArr[9]), BuiltinSerializersKt.d(kSerializerArr[10])};
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
    public PlacementResponse deserialize(@NotNull Decoder decoder) {
        KSerializer[] kSerializerArr;
        Intrinsics.h(decoder, "decoder");
        SerialDescriptor b = getB();
        CompositeDecoder compositeDecoderB = decoder.b(b);
        KSerializer[] kSerializerArr2 = PlacementResponse.$childSerializers;
        Double d = null;
        List list = null;
        List list2 = null;
        String str = null;
        Integer num = null;
        String str2 = null;
        Integer num2 = null;
        String str3 = null;
        List list3 = null;
        List list4 = null;
        List list5 = null;
        int i = 0;
        boolean z = true;
        while (z) {
            int iU = compositeDecoderB.u(b);
            switch (iU) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    kSerializerArr = kSerializerArr2;
                    str = (String) compositeDecoderB.k(b, 0, StringSerializer.f24821a, str);
                    i |= 1;
                    break;
                case 1:
                    kSerializerArr = kSerializerArr2;
                    num = (Integer) compositeDecoderB.k(b, 1, IntSerializer.f24800a, num);
                    i |= 2;
                    break;
                case 2:
                    kSerializerArr = kSerializerArr2;
                    str2 = (String) compositeDecoderB.k(b, 2, StringSerializer.f24821a, str2);
                    i |= 4;
                    break;
                case 3:
                    kSerializerArr = kSerializerArr2;
                    num2 = (Integer) compositeDecoderB.k(b, 3, IntSerializer.f24800a, num2);
                    i |= 8;
                    break;
                case 4:
                    kSerializerArr = kSerializerArr2;
                    str3 = (String) compositeDecoderB.k(b, 4, StringSerializer.f24821a, str3);
                    i |= 16;
                    break;
                case 5:
                    kSerializerArr = kSerializerArr2;
                    list3 = (List) compositeDecoderB.k(b, 5, kSerializerArr[5], list3);
                    i |= 32;
                    break;
                case 6:
                    kSerializerArr = kSerializerArr2;
                    list4 = (List) compositeDecoderB.k(b, 6, kSerializerArr[6], list4);
                    i |= 64;
                    break;
                case 7:
                    kSerializerArr = kSerializerArr2;
                    list5 = (List) compositeDecoderB.k(b, 7, kSerializerArr[7], list5);
                    i |= 128;
                    break;
                case 8:
                    kSerializerArr = kSerializerArr2;
                    d = (Double) compositeDecoderB.k(b, 8, DoubleSerializer.f24792a, d);
                    i |= 256;
                    break;
                case 9:
                    kSerializerArr = kSerializerArr2;
                    list = (List) compositeDecoderB.k(b, 9, kSerializerArr[9], list);
                    i |= 512;
                    break;
                case 10:
                    kSerializerArr = kSerializerArr2;
                    list2 = (List) compositeDecoderB.k(b, 10, kSerializerArr[10], list2);
                    i |= 1024;
                    break;
                default:
                    throw new UnknownFieldException(iU);
            }
            kSerializerArr2 = kSerializerArr;
        }
        compositeDecoderB.c(b);
        return new PlacementResponse(i, str, num, str2, num2, str3, list3, list4, list5, d, list, list2, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull PlacementResponse value) {
        Intrinsics.h(encoder, "encoder");
        Intrinsics.h(value, "value");
        SerialDescriptor b = getB();
        CompositeEncoder compositeEncoderB = encoder.b(b);
        PlacementResponse.write$Self$me_oriient_sdk_realtime(value, compositeEncoderB, b);
        compositeEncoderB.c(b);
    }
}
