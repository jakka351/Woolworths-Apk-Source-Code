package me.oriient.internal.services.dataModel.auth;

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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"me/oriient/internal/services/dataModel/auth/AuthConfigResponse.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lme/oriient/internal/services/dataModel/auth/AuthConfigResponse;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated
/* loaded from: classes7.dex */
public final class AuthConfigResponse$$serializer implements GeneratedSerializer<AuthConfigResponse> {

    @NotNull
    public static final AuthConfigResponse$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        AuthConfigResponse$$serializer authConfigResponse$$serializer = new AuthConfigResponse$$serializer();
        INSTANCE = authConfigResponse$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("me.oriient.internal.services.dataModel.auth.AuthConfigResponse", authConfigResponse$$serializer, 7);
        pluginGeneratedSerialDescriptor.k("loginRetryAttempts", true);
        pluginGeneratedSerialDescriptor.k("loginRetryInterval", true);
        pluginGeneratedSerialDescriptor.k("timeIntervalBeforeRefresh", true);
        pluginGeneratedSerialDescriptor.k("maxRefreshAttempts", true);
        pluginGeneratedSerialDescriptor.k("refreshBaseInterval", true);
        pluginGeneratedSerialDescriptor.k("refreshIntervalMultiplier", true);
        pluginGeneratedSerialDescriptor.k("inactivityTimeToStopJwtRefreshesMillis", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private AuthConfigResponse$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        IntSerializer intSerializer = IntSerializer.f24800a;
        KSerializer<?> kSerializerD = BuiltinSerializersKt.d(intSerializer);
        DoubleSerializer doubleSerializer = DoubleSerializer.f24792a;
        return new KSerializer[]{kSerializerD, BuiltinSerializersKt.d(doubleSerializer), BuiltinSerializersKt.d(doubleSerializer), BuiltinSerializersKt.d(intSerializer), BuiltinSerializersKt.d(doubleSerializer), BuiltinSerializersKt.d(doubleSerializer), BuiltinSerializersKt.d(LongSerializer.f24804a)};
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
    public AuthConfigResponse deserialize(@NotNull Decoder decoder) {
        Intrinsics.h(decoder, "decoder");
        SerialDescriptor b = getB();
        CompositeDecoder compositeDecoderB = decoder.b(b);
        int i = 0;
        Integer num = null;
        Double d = null;
        Double d2 = null;
        Integer num2 = null;
        Double d3 = null;
        Double d4 = null;
        Long l = null;
        boolean z = true;
        while (z) {
            int iU = compositeDecoderB.u(b);
            switch (iU) {
                case -1:
                    z = false;
                    break;
                case 0:
                    num = (Integer) compositeDecoderB.k(b, 0, IntSerializer.f24800a, num);
                    i |= 1;
                    break;
                case 1:
                    d = (Double) compositeDecoderB.k(b, 1, DoubleSerializer.f24792a, d);
                    i |= 2;
                    break;
                case 2:
                    d2 = (Double) compositeDecoderB.k(b, 2, DoubleSerializer.f24792a, d2);
                    i |= 4;
                    break;
                case 3:
                    num2 = (Integer) compositeDecoderB.k(b, 3, IntSerializer.f24800a, num2);
                    i |= 8;
                    break;
                case 4:
                    d3 = (Double) compositeDecoderB.k(b, 4, DoubleSerializer.f24792a, d3);
                    i |= 16;
                    break;
                case 5:
                    d4 = (Double) compositeDecoderB.k(b, 5, DoubleSerializer.f24792a, d4);
                    i |= 32;
                    break;
                case 6:
                    l = (Long) compositeDecoderB.k(b, 6, LongSerializer.f24804a, l);
                    i |= 64;
                    break;
                default:
                    throw new UnknownFieldException(iU);
            }
        }
        compositeDecoderB.c(b);
        return new AuthConfigResponse(i, num, d, d2, num2, d3, d4, l, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull AuthConfigResponse value) {
        Intrinsics.h(encoder, "encoder");
        Intrinsics.h(value, "value");
        SerialDescriptor b = getB();
        CompositeEncoder compositeEncoderB = encoder.b(b);
        AuthConfigResponse.write$Self$internal_publishRelease(value, compositeEncoderB, b);
        compositeEncoderB.c(b);
    }
}
