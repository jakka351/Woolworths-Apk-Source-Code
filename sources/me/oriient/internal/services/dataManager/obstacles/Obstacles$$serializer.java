package me.oriient.internal.services.dataManager.obstacles;

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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import me.oriient.internal.services.dataManager.utils.MatlabTwoLevelArray;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"me/oriient/internal/services/dataManager/obstacles/Obstacles.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lme/oriient/internal/services/dataManager/obstacles/Obstacles;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated
/* loaded from: classes7.dex */
public final class Obstacles$$serializer implements GeneratedSerializer<Obstacles> {

    @NotNull
    public static final Obstacles$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        Obstacles$$serializer obstacles$$serializer = new Obstacles$$serializer();
        INSTANCE = obstacles$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("me.oriient.internal.services.dataManager.obstacles.Obstacles", obstacles$$serializer, 5);
        pluginGeneratedSerialDescriptor.k("mapVersion", false);
        pluginGeneratedSerialDescriptor.k("pR", false);
        pluginGeneratedSerialDescriptor.k("pCenter", false);
        pluginGeneratedSerialDescriptor.k("poly", false);
        pluginGeneratedSerialDescriptor.k("box", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Obstacles$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = Obstacles.$childSerializers;
        return new KSerializer[]{IntSerializer.f24800a, kSerializerArr[1], kSerializerArr[2], kSerializerArr[3], kSerializerArr[4]};
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
    public Obstacles deserialize(@NotNull Decoder decoder) {
        Intrinsics.h(decoder, "decoder");
        SerialDescriptor b = getB();
        CompositeDecoder compositeDecoderB = decoder.b(b);
        KSerializer[] kSerializerArr = Obstacles.$childSerializers;
        int i = 0;
        int iG = 0;
        MatlabTwoLevelArray matlabTwoLevelArray = null;
        MatlabTwoLevelArray matlabTwoLevelArray2 = null;
        MatlabTwoLevelArray matlabTwoLevelArray3 = null;
        MatlabTwoLevelArray matlabTwoLevelArray4 = null;
        boolean z = true;
        while (z) {
            int iU = compositeDecoderB.u(b);
            if (iU == -1) {
                z = false;
            } else if (iU == 0) {
                iG = compositeDecoderB.g(b, 0);
                i |= 1;
            } else if (iU == 1) {
                matlabTwoLevelArray = (MatlabTwoLevelArray) compositeDecoderB.o(b, 1, kSerializerArr[1], matlabTwoLevelArray);
                i |= 2;
            } else if (iU == 2) {
                matlabTwoLevelArray2 = (MatlabTwoLevelArray) compositeDecoderB.o(b, 2, kSerializerArr[2], matlabTwoLevelArray2);
                i |= 4;
            } else if (iU == 3) {
                matlabTwoLevelArray3 = (MatlabTwoLevelArray) compositeDecoderB.o(b, 3, kSerializerArr[3], matlabTwoLevelArray3);
                i |= 8;
            } else {
                if (iU != 4) {
                    throw new UnknownFieldException(iU);
                }
                matlabTwoLevelArray4 = (MatlabTwoLevelArray) compositeDecoderB.o(b, 4, kSerializerArr[4], matlabTwoLevelArray4);
                i |= 16;
            }
        }
        compositeDecoderB.c(b);
        return new Obstacles(i, iG, matlabTwoLevelArray, matlabTwoLevelArray2, matlabTwoLevelArray3, matlabTwoLevelArray4, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull Obstacles value) {
        Intrinsics.h(encoder, "encoder");
        Intrinsics.h(value, "value");
        SerialDescriptor b = getB();
        CompositeEncoder compositeEncoderB = encoder.b(b);
        Obstacles.write$Self$internal_publishRelease(value, compositeEncoderB, b);
        compositeEncoderB.c(b);
    }
}
