package me.oriient.ipssdk.base.remoteconfig.responses;

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
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"me/oriient/ipssdk/base/remoteconfig/responses/ProximityConfigResponse.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lme/oriient/ipssdk/base/remoteconfig/responses/ProximityConfigResponse;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "me.oriient.sdk-base"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated
/* loaded from: classes2.dex */
public final class ProximityConfigResponse$$serializer implements GeneratedSerializer<ProximityConfigResponse> {

    @NotNull
    public static final ProximityConfigResponse$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ProximityConfigResponse$$serializer proximityConfigResponse$$serializer = new ProximityConfigResponse$$serializer();
        INSTANCE = proximityConfigResponse$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("me.oriient.ipssdk.base.remoteconfig.responses.ProximityConfigResponse", proximityConfigResponse$$serializer, 6);
        pluginGeneratedSerialDescriptor.k("pendingRequestTimeoutSeconds", true);
        pluginGeneratedSerialDescriptor.k("positionUpdatesThrottlingSeconds", true);
        pluginGeneratedSerialDescriptor.k("closeWalkingDistanceMeters", true);
        pluginGeneratedSerialDescriptor.k("mediumWalkingDistanceMeters", true);
        pluginGeneratedSerialDescriptor.k("longWalkingDistanceMeters", true);
        pluginGeneratedSerialDescriptor.k("resolverErrorsToDropState", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ProximityConfigResponse$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        DoubleSerializer doubleSerializer = DoubleSerializer.f24792a;
        return new KSerializer[]{BuiltinSerializersKt.d(doubleSerializer), BuiltinSerializersKt.d(doubleSerializer), BuiltinSerializersKt.d(doubleSerializer), BuiltinSerializersKt.d(doubleSerializer), BuiltinSerializersKt.d(doubleSerializer), BuiltinSerializersKt.d(IntSerializer.f24800a)};
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
    public ProximityConfigResponse deserialize(@NotNull Decoder decoder) {
        Intrinsics.h(decoder, "decoder");
        SerialDescriptor b = getB();
        CompositeDecoder compositeDecoderB = decoder.b(b);
        int i = 0;
        Double d = null;
        Double d2 = null;
        Double d3 = null;
        Double d4 = null;
        Double d5 = null;
        Integer num = null;
        boolean z = true;
        while (z) {
            int iU = compositeDecoderB.u(b);
            switch (iU) {
                case -1:
                    z = false;
                    break;
                case 0:
                    d = (Double) compositeDecoderB.k(b, 0, DoubleSerializer.f24792a, d);
                    i |= 1;
                    break;
                case 1:
                    d2 = (Double) compositeDecoderB.k(b, 1, DoubleSerializer.f24792a, d2);
                    i |= 2;
                    break;
                case 2:
                    d3 = (Double) compositeDecoderB.k(b, 2, DoubleSerializer.f24792a, d3);
                    i |= 4;
                    break;
                case 3:
                    d4 = (Double) compositeDecoderB.k(b, 3, DoubleSerializer.f24792a, d4);
                    i |= 8;
                    break;
                case 4:
                    d5 = (Double) compositeDecoderB.k(b, 4, DoubleSerializer.f24792a, d5);
                    i |= 16;
                    break;
                case 5:
                    num = (Integer) compositeDecoderB.k(b, 5, IntSerializer.f24800a, num);
                    i |= 32;
                    break;
                default:
                    throw new UnknownFieldException(iU);
            }
        }
        compositeDecoderB.c(b);
        return new ProximityConfigResponse(i, d, d2, d3, d4, d5, num, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull ProximityConfigResponse value) {
        Intrinsics.h(encoder, "encoder");
        Intrinsics.h(value, "value");
        SerialDescriptor b = getB();
        CompositeEncoder compositeEncoderB = encoder.b(b);
        ProximityConfigResponse.write$Self$me_oriient_sdk_base(value, compositeEncoderB, b);
        compositeEncoderB.c(b);
    }
}
