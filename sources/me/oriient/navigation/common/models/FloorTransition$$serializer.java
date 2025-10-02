package me.oriient.navigation.common.models;

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
import kotlinx.serialization.internal.StringSerializer;
import me.oriient.internal.services.dataManager.common.IndoorCoordinate;
import me.oriient.internal.services.dataManager.common.IndoorCoordinate$$serializer;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"me/oriient/navigation/common/models/FloorTransition.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lme/oriient/navigation/common/models/FloorTransition;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "service-navigation_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated
/* loaded from: classes8.dex */
public final class FloorTransition$$serializer implements GeneratedSerializer<FloorTransition> {

    @NotNull
    public static final FloorTransition$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        FloorTransition$$serializer floorTransition$$serializer = new FloorTransition$$serializer();
        INSTANCE = floorTransition$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("me.oriient.navigation.common.models.FloorTransition", floorTransition$$serializer, 7);
        pluginGeneratedSerialDescriptor.k("id", false);
        pluginGeneratedSerialDescriptor.k("type", false);
        pluginGeneratedSerialDescriptor.k("buildingId", false);
        pluginGeneratedSerialDescriptor.k("floorOrder", false);
        pluginGeneratedSerialDescriptor.k("indexOnRoute", false);
        pluginGeneratedSerialDescriptor.k("destinationFloorOrder", false);
        pluginGeneratedSerialDescriptor.k("coordinate", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private FloorTransition$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        KSerializer<?> kSerializer = FloorTransition.$childSerializers[1];
        StringSerializer stringSerializer = StringSerializer.f24821a;
        IntSerializer intSerializer = IntSerializer.f24800a;
        return new KSerializer[]{stringSerializer, kSerializer, stringSerializer, intSerializer, intSerializer, intSerializer, IndoorCoordinate$$serializer.INSTANCE};
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
    public FloorTransition deserialize(@NotNull Decoder decoder) {
        Intrinsics.h(decoder, "decoder");
        SerialDescriptor b = getB();
        CompositeDecoder compositeDecoderB = decoder.b(b);
        KSerializer[] kSerializerArr = FloorTransition.$childSerializers;
        int i = 0;
        int iG = 0;
        int iG2 = 0;
        int iG3 = 0;
        String strJ = null;
        FloorTransitionType floorTransitionType = null;
        String strJ2 = null;
        IndoorCoordinate indoorCoordinate = null;
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
                    floorTransitionType = (FloorTransitionType) compositeDecoderB.o(b, 1, kSerializerArr[1], floorTransitionType);
                    i |= 2;
                    break;
                case 2:
                    strJ2 = compositeDecoderB.j(b, 2);
                    i |= 4;
                    break;
                case 3:
                    iG = compositeDecoderB.g(b, 3);
                    i |= 8;
                    break;
                case 4:
                    iG2 = compositeDecoderB.g(b, 4);
                    i |= 16;
                    break;
                case 5:
                    iG3 = compositeDecoderB.g(b, 5);
                    i |= 32;
                    break;
                case 6:
                    indoorCoordinate = (IndoorCoordinate) compositeDecoderB.o(b, 6, IndoorCoordinate$$serializer.INSTANCE, indoorCoordinate);
                    i |= 64;
                    break;
                default:
                    throw new UnknownFieldException(iU);
            }
        }
        compositeDecoderB.c(b);
        return new FloorTransition(i, strJ, floorTransitionType, strJ2, iG, iG2, iG3, indoorCoordinate, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull FloorTransition value) {
        Intrinsics.h(encoder, "encoder");
        Intrinsics.h(value, "value");
        SerialDescriptor b = getB();
        CompositeEncoder compositeEncoderB = encoder.b(b);
        FloorTransition.write$Self$service_navigation_publishRelease(value, compositeEncoderB, b);
        compositeEncoderB.c(b);
    }
}
