package me.oriient.internal.services.dataManager.floorMetadata;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"me/oriient/internal/services/dataManager/floorMetadata/RestrictedAreaResponse.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lme/oriient/internal/services/dataManager/floorMetadata/RestrictedAreaResponse;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated
/* loaded from: classes7.dex */
public final class RestrictedAreaResponse$$serializer implements GeneratedSerializer<RestrictedAreaResponse> {

    @NotNull
    public static final RestrictedAreaResponse$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        RestrictedAreaResponse$$serializer restrictedAreaResponse$$serializer = new RestrictedAreaResponse$$serializer();
        INSTANCE = restrictedAreaResponse$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("me.oriient.internal.services.dataManager.floorMetadata.RestrictedAreaResponse", restrictedAreaResponse$$serializer, 9);
        pluginGeneratedSerialDescriptor.k("restrictedAreaId", true);
        pluginGeneratedSerialDescriptor.k("mapId", true);
        pluginGeneratedSerialDescriptor.k(AppMeasurementSdk.ConditionalUserProperty.NAME, true);
        pluginGeneratedSerialDescriptor.k("shapeType", true);
        pluginGeneratedSerialDescriptor.k("topRight", true);
        pluginGeneratedSerialDescriptor.k("bottomLeft", true);
        pluginGeneratedSerialDescriptor.k("center", true);
        pluginGeneratedSerialDescriptor.k("radius", true);
        pluginGeneratedSerialDescriptor.k("points", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private RestrictedAreaResponse$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = RestrictedAreaResponse.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.f24821a;
        return new KSerializer[]{BuiltinSerializersKt.d(stringSerializer), BuiltinSerializersKt.d(stringSerializer), BuiltinSerializersKt.d(stringSerializer), BuiltinSerializersKt.d(stringSerializer), BuiltinSerializersKt.d(kSerializerArr[4]), BuiltinSerializersKt.d(kSerializerArr[5]), BuiltinSerializersKt.d(kSerializerArr[6]), BuiltinSerializersKt.d(DoubleSerializer.f24792a), BuiltinSerializersKt.d(kSerializerArr[8])};
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
    public RestrictedAreaResponse deserialize(@NotNull Decoder decoder) {
        Intrinsics.h(decoder, "decoder");
        SerialDescriptor b = getB();
        CompositeDecoder compositeDecoderB = decoder.b(b);
        KSerializer[] kSerializerArr = RestrictedAreaResponse.$childSerializers;
        List list = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        Double d = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int iU = compositeDecoderB.u(b);
            switch (iU) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) compositeDecoderB.k(b, 0, StringSerializer.f24821a, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) compositeDecoderB.k(b, 1, StringSerializer.f24821a, str2);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) compositeDecoderB.k(b, 2, StringSerializer.f24821a, str3);
                    i |= 4;
                    break;
                case 3:
                    str4 = (String) compositeDecoderB.k(b, 3, StringSerializer.f24821a, str4);
                    i |= 8;
                    break;
                case 4:
                    list2 = (List) compositeDecoderB.k(b, 4, kSerializerArr[4], list2);
                    i |= 16;
                    break;
                case 5:
                    list3 = (List) compositeDecoderB.k(b, 5, kSerializerArr[5], list3);
                    i |= 32;
                    break;
                case 6:
                    list4 = (List) compositeDecoderB.k(b, 6, kSerializerArr[6], list4);
                    i |= 64;
                    break;
                case 7:
                    d = (Double) compositeDecoderB.k(b, 7, DoubleSerializer.f24792a, d);
                    i |= 128;
                    break;
                case 8:
                    list = (List) compositeDecoderB.k(b, 8, kSerializerArr[8], list);
                    i |= 256;
                    break;
                default:
                    throw new UnknownFieldException(iU);
            }
        }
        compositeDecoderB.c(b);
        return new RestrictedAreaResponse(i, str, str2, str3, str4, list2, list3, list4, d, list, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull RestrictedAreaResponse value) {
        Intrinsics.h(encoder, "encoder");
        Intrinsics.h(value, "value");
        SerialDescriptor b = getB();
        CompositeEncoder compositeEncoderB = encoder.b(b);
        RestrictedAreaResponse.write$Self$internal_publishRelease(value, compositeEncoderB, b);
        compositeEncoderB.c(b);
    }
}
