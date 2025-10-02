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
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import me.oriient.ipssdk.realtime.services.rest.responses.Content;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"me/oriient/ipssdk/realtime/services/rest/responses/Content.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lme/oriient/ipssdk/realtime/services/rest/responses/Content;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated
/* loaded from: classes8.dex */
public final class Content$$serializer implements GeneratedSerializer<Content> {

    @NotNull
    public static final Content$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        Content$$serializer content$$serializer = new Content$$serializer();
        INSTANCE = content$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("me.oriient.ipssdk.realtime.services.rest.responses.Content", content$$serializer, 20);
        pluginGeneratedSerialDescriptor.k("type", true);
        pluginGeneratedSerialDescriptor.k("contentType", true);
        pluginGeneratedSerialDescriptor.k("regionId", true);
        pluginGeneratedSerialDescriptor.k("regionName", true);
        pluginGeneratedSerialDescriptor.k("regionMetadata", true);
        pluginGeneratedSerialDescriptor.k("attachedTriggers", true);
        pluginGeneratedSerialDescriptor.k("placements", true);
        pluginGeneratedSerialDescriptor.k("regionType", true);
        pluginGeneratedSerialDescriptor.k("topRight", true);
        pluginGeneratedSerialDescriptor.k("bottomLeft", true);
        pluginGeneratedSerialDescriptor.k("center", true);
        pluginGeneratedSerialDescriptor.k("points", true);
        pluginGeneratedSerialDescriptor.k("radius", true);
        pluginGeneratedSerialDescriptor.k("locTagId", true);
        pluginGeneratedSerialDescriptor.k("locTagName", true);
        pluginGeneratedSerialDescriptor.k("locTagDesc", true);
        pluginGeneratedSerialDescriptor.k("locTagUrl", true);
        pluginGeneratedSerialDescriptor.k("locTagMetadata", true);
        pluginGeneratedSerialDescriptor.k("regionsPlacements", true);
        pluginGeneratedSerialDescriptor.k("alternatives", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Content$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = Content.$childSerializers;
        KSerializer<?> kSerializer = kSerializerArr[0];
        StringSerializer stringSerializer = StringSerializer.f24821a;
        return new KSerializer[]{kSerializer, BuiltinSerializersKt.d(stringSerializer), BuiltinSerializersKt.d(stringSerializer), BuiltinSerializersKt.d(stringSerializer), BuiltinSerializersKt.d(stringSerializer), BuiltinSerializersKt.d(kSerializerArr[5]), BuiltinSerializersKt.d(kSerializerArr[6]), BuiltinSerializersKt.d(stringSerializer), BuiltinSerializersKt.d(kSerializerArr[8]), BuiltinSerializersKt.d(kSerializerArr[9]), BuiltinSerializersKt.d(kSerializerArr[10]), BuiltinSerializersKt.d(kSerializerArr[11]), BuiltinSerializersKt.d(DoubleSerializer.f24792a), BuiltinSerializersKt.d(stringSerializer), BuiltinSerializersKt.d(stringSerializer), BuiltinSerializersKt.d(stringSerializer), BuiltinSerializersKt.d(stringSerializer), BuiltinSerializersKt.d(stringSerializer), BuiltinSerializersKt.d(kSerializerArr[18]), BuiltinSerializersKt.d(new ArrayListSerializer(INSTANCE))};
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
    public Content deserialize(@NotNull Decoder decoder) {
        Double d;
        List list;
        int i;
        String str;
        int i2;
        Double d2;
        Intrinsics.h(decoder, "decoder");
        SerialDescriptor b = getB();
        CompositeDecoder compositeDecoderB = decoder.b(b);
        KSerializer[] kSerializerArr = Content.$childSerializers;
        String str2 = null;
        Double d3 = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        List list5 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        List list6 = null;
        List list7 = null;
        List list8 = null;
        String str7 = null;
        Content.Type type = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        List list9 = null;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1;
        while (i5 != 0) {
            List list10 = list8;
            int iU = compositeDecoderB.u(b);
            String str12 = str7;
            switch (iU) {
                case -1:
                    str7 = str12;
                    i5 = i3;
                    list8 = list10;
                    str4 = str4;
                    list2 = list2;
                    str9 = str9;
                    str11 = str11;
                    list6 = list6;
                    d3 = d3;
                case 0:
                    d = d3;
                    list = list2;
                    String str13 = str9;
                    List list11 = list6;
                    i = i3;
                    type = (Content.Type) compositeDecoderB.o(b, i, kSerializerArr[i3], type);
                    list8 = list10;
                    str3 = str3;
                    list7 = list7;
                    str = str8;
                    str12 = str12;
                    str10 = str10;
                    str4 = str4;
                    i2 = 1;
                    str9 = str13;
                    str11 = str11;
                    list6 = list11;
                    d3 = d;
                    i4 |= i2;
                    i3 = i;
                    str8 = str;
                    str7 = str12;
                    list2 = list;
                case 1:
                    list = list2;
                    String str14 = str11;
                    i = i3;
                    list9 = list9;
                    list8 = list10;
                    list7 = list7;
                    str9 = str9;
                    str = (String) compositeDecoderB.k(b, 1, StringSerializer.f24821a, str8);
                    str12 = str12;
                    str4 = str4;
                    d3 = d3;
                    i2 = 2;
                    str11 = str14;
                    list6 = list6;
                    i4 |= i2;
                    i3 = i;
                    str8 = str;
                    str7 = str12;
                    list2 = list;
                case 2:
                    list = list2;
                    i = i3;
                    str = str8;
                    str10 = str10;
                    list8 = list10;
                    str9 = (String) compositeDecoderB.k(b, 2, StringSerializer.f24821a, str9);
                    str11 = str11;
                    d3 = d3;
                    i2 = 4;
                    i4 |= i2;
                    i3 = i;
                    str8 = str;
                    str7 = str12;
                    list2 = list;
                case 3:
                    list = list2;
                    i = i3;
                    str10 = (String) compositeDecoderB.k(b, 3, StringSerializer.f24821a, str10);
                    str = str8;
                    list8 = list10;
                    d3 = d3;
                    str11 = str11;
                    i2 = 8;
                    i4 |= i2;
                    i3 = i;
                    str8 = str;
                    str7 = str12;
                    list2 = list;
                case 4:
                    d = d3;
                    list = list2;
                    str = str8;
                    list9 = list9;
                    list8 = list10;
                    i2 = 16;
                    i = i3;
                    str11 = (String) compositeDecoderB.k(b, 4, StringSerializer.f24821a, str11);
                    d3 = d;
                    i4 |= i2;
                    i3 = i;
                    str8 = str;
                    str7 = str12;
                    list2 = list;
                case 5:
                    d2 = d3;
                    i2 = 32;
                    list9 = (List) compositeDecoderB.k(b, 5, kSerializerArr[5], list9);
                    list = list2;
                    str = str8;
                    list8 = list10;
                    d3 = d2;
                    i = i3;
                    i4 |= i2;
                    i3 = i;
                    str8 = str;
                    str7 = str12;
                    list2 = list;
                case 6:
                    d2 = d3;
                    i2 = 64;
                    list8 = (List) compositeDecoderB.k(b, 6, kSerializerArr[6], list10);
                    list = list2;
                    str = str8;
                    d3 = d2;
                    i = i3;
                    i4 |= i2;
                    i3 = i;
                    str8 = str;
                    str7 = str12;
                    list2 = list;
                case 7:
                    d2 = d3;
                    i2 = 128;
                    str12 = (String) compositeDecoderB.k(b, 7, StringSerializer.f24821a, str12);
                    list = list2;
                    str = str8;
                    list8 = list10;
                    d3 = d2;
                    i = i3;
                    i4 |= i2;
                    i3 = i;
                    str8 = str;
                    str7 = str12;
                    list2 = list;
                case 8:
                    list4 = (List) compositeDecoderB.k(b, 8, kSerializerArr[8], list4);
                    i2 = 256;
                    list = list2;
                    str = str8;
                    list8 = list10;
                    i = i3;
                    i4 |= i2;
                    i3 = i;
                    str8 = str;
                    str7 = str12;
                    list2 = list;
                case 9:
                    list5 = (List) compositeDecoderB.k(b, 9, kSerializerArr[9], list5);
                    i2 = 512;
                    list = list2;
                    str = str8;
                    list8 = list10;
                    i = i3;
                    i4 |= i2;
                    i3 = i;
                    str8 = str;
                    str7 = str12;
                    list2 = list;
                case 10:
                    list3 = (List) compositeDecoderB.k(b, 10, kSerializerArr[10], list3);
                    i2 = 1024;
                    list = list2;
                    str = str8;
                    list8 = list10;
                    i = i3;
                    i4 |= i2;
                    i3 = i;
                    str8 = str;
                    str7 = str12;
                    list2 = list;
                case 11:
                    list2 = (List) compositeDecoderB.k(b, 11, kSerializerArr[11], list2);
                    i2 = 2048;
                    list = list2;
                    str = str8;
                    list8 = list10;
                    i = i3;
                    i4 |= i2;
                    i3 = i;
                    str8 = str;
                    str7 = str12;
                    list2 = list;
                case 12:
                    d3 = (Double) compositeDecoderB.k(b, 12, DoubleSerializer.f24792a, d3);
                    i2 = 4096;
                    list = list2;
                    str = str8;
                    list8 = list10;
                    i = i3;
                    i4 |= i2;
                    i3 = i;
                    str8 = str;
                    str7 = str12;
                    list2 = list;
                case 13:
                    str3 = (String) compositeDecoderB.k(b, 13, StringSerializer.f24821a, str3);
                    i2 = 8192;
                    list = list2;
                    str = str8;
                    list8 = list10;
                    i = i3;
                    i4 |= i2;
                    i3 = i;
                    str8 = str;
                    str7 = str12;
                    list2 = list;
                case 14:
                    str4 = (String) compositeDecoderB.k(b, 14, StringSerializer.f24821a, str4);
                    i2 = 16384;
                    list = list2;
                    str = str8;
                    list8 = list10;
                    i = i3;
                    i4 |= i2;
                    i3 = i;
                    str8 = str;
                    str7 = str12;
                    list2 = list;
                case 15:
                    str5 = (String) compositeDecoderB.k(b, 15, StringSerializer.f24821a, str5);
                    i2 = 32768;
                    list = list2;
                    str = str8;
                    list8 = list10;
                    i = i3;
                    i4 |= i2;
                    i3 = i;
                    str8 = str;
                    str7 = str12;
                    list2 = list;
                case 16:
                    str6 = (String) compositeDecoderB.k(b, 16, StringSerializer.f24821a, str6);
                    i2 = 65536;
                    list = list2;
                    str = str8;
                    list8 = list10;
                    i = i3;
                    i4 |= i2;
                    i3 = i;
                    str8 = str;
                    str7 = str12;
                    list2 = list;
                case 17:
                    str2 = (String) compositeDecoderB.k(b, 17, StringSerializer.f24821a, str2);
                    i2 = 131072;
                    list = list2;
                    str = str8;
                    list8 = list10;
                    i = i3;
                    i4 |= i2;
                    i3 = i;
                    str8 = str;
                    str7 = str12;
                    list2 = list;
                case 18:
                    list6 = (List) compositeDecoderB.k(b, 18, kSerializerArr[18], list6);
                    i2 = 262144;
                    list = list2;
                    str = str8;
                    list8 = list10;
                    i = i3;
                    i4 |= i2;
                    i3 = i;
                    str8 = str;
                    str7 = str12;
                    list2 = list;
                case 19:
                    list7 = (List) compositeDecoderB.k(b, 19, new ArrayListSerializer(INSTANCE), list7);
                    i2 = 524288;
                    list = list2;
                    str = str8;
                    list8 = list10;
                    i = i3;
                    i4 |= i2;
                    i3 = i;
                    str8 = str;
                    str7 = str12;
                    list2 = list;
                default:
                    throw new UnknownFieldException(iU);
            }
        }
        Double d4 = d3;
        List list12 = list6;
        List list13 = list7;
        String str15 = str9;
        String str16 = str10;
        String str17 = str11;
        List list14 = list9;
        String str18 = str3;
        String str19 = str4;
        Content.Type type2 = type;
        String str20 = str8;
        compositeDecoderB.c(b);
        return new Content(i4, type2, str20, str15, str16, str17, list14, list8, str7, list4, list5, list3, list2, d4, str18, str19, str5, str6, str2, list12, list13, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull Content value) {
        Intrinsics.h(encoder, "encoder");
        Intrinsics.h(value, "value");
        SerialDescriptor b = getB();
        CompositeEncoder compositeEncoderB = encoder.b(b);
        Content.write$Self$me_oriient_sdk_realtime(value, compositeEncoderB, b);
        compositeEncoderB.c(b);
    }
}
