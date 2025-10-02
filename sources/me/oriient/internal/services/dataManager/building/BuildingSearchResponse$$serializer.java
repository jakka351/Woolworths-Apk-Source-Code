package me.oriient.internal.services.dataManager.building;

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
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"me/oriient/internal/services/dataManager/building/BuildingSearchResponse.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lme/oriient/internal/services/dataManager/building/BuildingSearchResponse;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated
/* loaded from: classes7.dex */
public final class BuildingSearchResponse$$serializer implements GeneratedSerializer<BuildingSearchResponse> {

    @NotNull
    public static final BuildingSearchResponse$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BuildingSearchResponse$$serializer buildingSearchResponse$$serializer = new BuildingSearchResponse$$serializer();
        INSTANCE = buildingSearchResponse$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("me.oriient.internal.services.dataManager.building.BuildingSearchResponse", buildingSearchResponse$$serializer, 9);
        pluginGeneratedSerialDescriptor.k("buildingId", false);
        pluginGeneratedSerialDescriptor.k("buildingName", false);
        pluginGeneratedSerialDescriptor.k("buildingToEnuRotation", false);
        pluginGeneratedSerialDescriptor.k("buildingOrigin", false);
        pluginGeneratedSerialDescriptor.k("geofenceOrigin", false);
        pluginGeneratedSerialDescriptor.k("geofenceRadius", false);
        pluginGeneratedSerialDescriptor.k("primaryFloorId", false);
        pluginGeneratedSerialDescriptor.k("clientBuildingId", true);
        pluginGeneratedSerialDescriptor.k("displayName", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BuildingSearchResponse$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.f24821a;
        KSerializer<?> kSerializerD = BuiltinSerializersKt.d(DoubleSerializer.f24792a);
        KSerializer<?> kSerializerD2 = BuiltinSerializersKt.d(FloatSerializer.f24797a);
        KSerializer<?> kSerializerD3 = BuiltinSerializersKt.d(stringSerializer);
        WorldCoordinateResponse$$serializer worldCoordinateResponse$$serializer = WorldCoordinateResponse$$serializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, kSerializerD, worldCoordinateResponse$$serializer, worldCoordinateResponse$$serializer, kSerializerD2, stringSerializer, kSerializerD3, stringSerializer};
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
    public BuildingSearchResponse deserialize(@NotNull Decoder decoder) {
        Intrinsics.h(decoder, "decoder");
        SerialDescriptor b = getB();
        CompositeDecoder compositeDecoderB = decoder.b(b);
        String strJ = null;
        String strJ2 = null;
        Double d = null;
        WorldCoordinateResponse worldCoordinateResponse = null;
        WorldCoordinateResponse worldCoordinateResponse2 = null;
        Float f = null;
        String strJ3 = null;
        String str = null;
        String strJ4 = null;
        int i = 0;
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
                    d = (Double) compositeDecoderB.k(b, 2, DoubleSerializer.f24792a, d);
                    i |= 4;
                    break;
                case 3:
                    worldCoordinateResponse = (WorldCoordinateResponse) compositeDecoderB.o(b, 3, WorldCoordinateResponse$$serializer.INSTANCE, worldCoordinateResponse);
                    i |= 8;
                    break;
                case 4:
                    worldCoordinateResponse2 = (WorldCoordinateResponse) compositeDecoderB.o(b, 4, WorldCoordinateResponse$$serializer.INSTANCE, worldCoordinateResponse2);
                    i |= 16;
                    break;
                case 5:
                    f = (Float) compositeDecoderB.k(b, 5, FloatSerializer.f24797a, f);
                    i |= 32;
                    break;
                case 6:
                    strJ3 = compositeDecoderB.j(b, 6);
                    i |= 64;
                    break;
                case 7:
                    str = (String) compositeDecoderB.k(b, 7, StringSerializer.f24821a, str);
                    i |= 128;
                    break;
                case 8:
                    strJ4 = compositeDecoderB.j(b, 8);
                    i |= 256;
                    break;
                default:
                    throw new UnknownFieldException(iU);
            }
        }
        compositeDecoderB.c(b);
        return new BuildingSearchResponse(i, strJ, strJ2, d, worldCoordinateResponse, worldCoordinateResponse2, f, strJ3, str, strJ4, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull BuildingSearchResponse value) {
        Intrinsics.h(encoder, "encoder");
        Intrinsics.h(value, "value");
        SerialDescriptor b = getB();
        CompositeEncoder compositeEncoderB = encoder.b(b);
        BuildingSearchResponse.write$Self$internal_publishRelease(value, compositeEncoderB, b);
        compositeEncoderB.c(b);
    }
}
