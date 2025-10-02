package me.oriient.internal.services.dataModel.auth;

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
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"me/oriient/internal/services/dataModel/auth/AuthConfig.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lme/oriient/internal/services/dataModel/auth/AuthConfig;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated
/* loaded from: classes7.dex */
public final class AuthConfig$$serializer implements GeneratedSerializer<AuthConfig> {

    @NotNull
    public static final AuthConfig$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        AuthConfig$$serializer authConfig$$serializer = new AuthConfig$$serializer();
        INSTANCE = authConfig$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("me.oriient.internal.services.dataModel.auth.AuthConfig", authConfig$$serializer, 7);
        pluginGeneratedSerialDescriptor.k("loginRetryAttempts", false);
        pluginGeneratedSerialDescriptor.k("loginRetryIntervalMillis", false);
        pluginGeneratedSerialDescriptor.k("timeIntervalBeforeRefreshMillis", false);
        pluginGeneratedSerialDescriptor.k("maxRefreshAttempts", false);
        pluginGeneratedSerialDescriptor.k("refreshBaseIntervalMillis", false);
        pluginGeneratedSerialDescriptor.k("refreshIntervalMultiplier", false);
        pluginGeneratedSerialDescriptor.k("inactivityTimeToStopJwtRefreshesMillis", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private AuthConfig$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        IntSerializer intSerializer = IntSerializer.f24800a;
        LongSerializer longSerializer = LongSerializer.f24804a;
        return new KSerializer[]{intSerializer, longSerializer, longSerializer, intSerializer, longSerializer, DoubleSerializer.f24792a, longSerializer};
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
    public AuthConfig deserialize(@NotNull Decoder decoder) {
        Intrinsics.h(decoder, "decoder");
        SerialDescriptor b = getB();
        CompositeDecoder compositeDecoderB = decoder.b(b);
        int i = 0;
        int iG = 0;
        int iG2 = 0;
        long jF = 0;
        long jF2 = 0;
        long jF3 = 0;
        long jF4 = 0;
        double D = 0.0d;
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
                    jF = compositeDecoderB.f(b, 1);
                    i |= 2;
                    break;
                case 2:
                    jF2 = compositeDecoderB.f(b, 2);
                    i |= 4;
                    break;
                case 3:
                    iG2 = compositeDecoderB.g(b, 3);
                    i |= 8;
                    break;
                case 4:
                    jF3 = compositeDecoderB.f(b, 4);
                    i |= 16;
                    break;
                case 5:
                    D = compositeDecoderB.D(b, 5);
                    i |= 32;
                    break;
                case 6:
                    jF4 = compositeDecoderB.f(b, 6);
                    i |= 64;
                    break;
                default:
                    throw new UnknownFieldException(iU);
            }
        }
        compositeDecoderB.c(b);
        return new AuthConfig(i, iG, jF, jF2, iG2, jF3, D, jF4, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull AuthConfig value) {
        Intrinsics.h(encoder, "encoder");
        Intrinsics.h(value, "value");
        SerialDescriptor b = getB();
        CompositeEncoder compositeEncoderB = encoder.b(b);
        AuthConfig.write$Self$internal_publishRelease(value, compositeEncoderB, b);
        compositeEncoderB.c(b);
    }
}
