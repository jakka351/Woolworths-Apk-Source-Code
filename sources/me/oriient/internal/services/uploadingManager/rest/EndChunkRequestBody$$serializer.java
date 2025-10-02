package me.oriient.internal.services.uploadingManager.rest;

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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"me/oriient/internal/services/uploadingManager/rest/EndChunkRequestBody.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lme/oriient/internal/services/uploadingManager/rest/EndChunkRequestBody;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated
/* loaded from: classes7.dex */
public final class EndChunkRequestBody$$serializer implements GeneratedSerializer<EndChunkRequestBody> {

    @NotNull
    public static final EndChunkRequestBody$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        EndChunkRequestBody$$serializer endChunkRequestBody$$serializer = new EndChunkRequestBody$$serializer();
        INSTANCE = endChunkRequestBody$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("me.oriient.internal.services.uploadingManager.rest.EndChunkRequestBody", endChunkRequestBody$$serializer, 10);
        pluginGeneratedSerialDescriptor.k("apiKeyId", false);
        pluginGeneratedSerialDescriptor.k("sessionId", false);
        pluginGeneratedSerialDescriptor.k("filename", false);
        pluginGeneratedSerialDescriptor.k("chunkStartTimeMilliUtc", false);
        pluginGeneratedSerialDescriptor.k("chunkEndTimeMilliUtc", false);
        pluginGeneratedSerialDescriptor.k("chunkDurationMilli", false);
        pluginGeneratedSerialDescriptor.k("chunkSize", false);
        pluginGeneratedSerialDescriptor.k("chunkNum", false);
        pluginGeneratedSerialDescriptor.k("endReason", false);
        pluginGeneratedSerialDescriptor.k("isLast", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private EndChunkRequestBody$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.f24821a;
        LongSerializer longSerializer = LongSerializer.f24804a;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, longSerializer, longSerializer, longSerializer, DoubleSerializer.f24792a, IntSerializer.f24800a, stringSerializer, BooleanSerializer.f24779a};
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
    public EndChunkRequestBody deserialize(@NotNull Decoder decoder) {
        Intrinsics.h(decoder, "decoder");
        SerialDescriptor b = getB();
        CompositeDecoder compositeDecoderB = decoder.b(b);
        int i = 0;
        int iG = 0;
        boolean zB = false;
        String strJ = null;
        String strJ2 = null;
        String strJ3 = null;
        String strJ4 = null;
        long jF = 0;
        long jF2 = 0;
        long jF3 = 0;
        double D = 0.0d;
        boolean z = true;
        while (z) {
            int iU = compositeDecoderB.u(b);
            switch (iU) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strJ = compositeDecoderB.j(b, 0);
                    i |= 1;
                    break;
                case 1:
                    strJ2 = compositeDecoderB.j(b, 1);
                    i |= 2;
                    break;
                case 2:
                    strJ3 = compositeDecoderB.j(b, 2);
                    i |= 4;
                    break;
                case 3:
                    jF = compositeDecoderB.f(b, 3);
                    i |= 8;
                    break;
                case 4:
                    jF2 = compositeDecoderB.f(b, 4);
                    i |= 16;
                    break;
                case 5:
                    jF3 = compositeDecoderB.f(b, 5);
                    i |= 32;
                    break;
                case 6:
                    D = compositeDecoderB.D(b, 6);
                    i |= 64;
                    break;
                case 7:
                    iG = compositeDecoderB.g(b, 7);
                    i |= 128;
                    break;
                case 8:
                    strJ4 = compositeDecoderB.j(b, 8);
                    i |= 256;
                    break;
                case 9:
                    zB = compositeDecoderB.B(b, 9);
                    i |= 512;
                    break;
                default:
                    throw new UnknownFieldException(iU);
            }
        }
        compositeDecoderB.c(b);
        return new EndChunkRequestBody(i, strJ, strJ2, strJ3, jF, jF2, jF3, D, iG, strJ4, zB, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull EndChunkRequestBody value) {
        Intrinsics.h(encoder, "encoder");
        Intrinsics.h(value, "value");
        SerialDescriptor b = getB();
        CompositeEncoder compositeEncoderB = encoder.b(b);
        EndChunkRequestBody.write$Self$internal_publishRelease(value, compositeEncoderB, b);
        compositeEncoderB.c(b);
    }
}
