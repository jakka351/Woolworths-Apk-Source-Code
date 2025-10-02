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
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"me/oriient/internal/services/dataModel/engine/ExtraEngineConfig.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lme/oriient/internal/services/dataModel/engine/ExtraEngineConfig;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated
/* loaded from: classes7.dex */
public final class ExtraEngineConfig$$serializer implements GeneratedSerializer<ExtraEngineConfig> {

    @NotNull
    public static final ExtraEngineConfig$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ExtraEngineConfig$$serializer extraEngineConfig$$serializer = new ExtraEngineConfig$$serializer();
        INSTANCE = extraEngineConfig$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("me.oriient.internal.services.dataModel.engine.ExtraEngineConfig", extraEngineConfig$$serializer, 3);
        pluginGeneratedSerialDescriptor.k("mapGridUrlExpirationTimeMinutes", false);
        pluginGeneratedSerialDescriptor.k("mapGridFetchingStrategy", false);
        pluginGeneratedSerialDescriptor.k("mapGridType", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ExtraEngineConfig$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = ExtraEngineConfig.$childSerializers;
        return new KSerializer[]{DoubleSerializer.f24792a, kSerializerArr[1], kSerializerArr[2]};
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
    public ExtraEngineConfig deserialize(@NotNull Decoder decoder) {
        Intrinsics.h(decoder, "decoder");
        SerialDescriptor b = getB();
        CompositeDecoder compositeDecoderB = decoder.b(b);
        KSerializer[] kSerializerArr = ExtraEngineConfig.$childSerializers;
        int i = 0;
        double D = 0.0d;
        MapGridFetchingStrategy mapGridFetchingStrategy = null;
        MapGridType mapGridType = null;
        boolean z = true;
        while (z) {
            int iU = compositeDecoderB.u(b);
            if (iU == -1) {
                z = false;
            } else if (iU == 0) {
                D = compositeDecoderB.D(b, 0);
                i |= 1;
            } else if (iU == 1) {
                mapGridFetchingStrategy = (MapGridFetchingStrategy) compositeDecoderB.o(b, 1, kSerializerArr[1], mapGridFetchingStrategy);
                i |= 2;
            } else {
                if (iU != 2) {
                    throw new UnknownFieldException(iU);
                }
                mapGridType = (MapGridType) compositeDecoderB.o(b, 2, kSerializerArr[2], mapGridType);
                i |= 4;
            }
        }
        compositeDecoderB.c(b);
        return new ExtraEngineConfig(i, D, mapGridFetchingStrategy, mapGridType, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull ExtraEngineConfig value) {
        Intrinsics.h(encoder, "encoder");
        Intrinsics.h(value, "value");
        SerialDescriptor b = getB();
        CompositeEncoder compositeEncoderB = encoder.b(b);
        ExtraEngineConfig.write$Self$internal_publishRelease(value, compositeEncoderB, b);
        compositeEncoderB.c(b);
    }
}
