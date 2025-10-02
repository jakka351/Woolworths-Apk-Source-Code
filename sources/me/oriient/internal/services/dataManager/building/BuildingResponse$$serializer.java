package me.oriient.internal.services.dataManager.building;

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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"me/oriient/internal/services/dataManager/building/BuildingResponse.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lme/oriient/internal/services/dataManager/building/BuildingResponse;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated
/* loaded from: classes7.dex */
public final class BuildingResponse$$serializer implements GeneratedSerializer<BuildingResponse> {

    @NotNull
    public static final BuildingResponse$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BuildingResponse$$serializer buildingResponse$$serializer = new BuildingResponse$$serializer();
        INSTANCE = buildingResponse$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("me.oriient.internal.services.dataManager.building.BuildingResponse", buildingResponse$$serializer, 17);
        pluginGeneratedSerialDescriptor.k("buildingId", false);
        pluginGeneratedSerialDescriptor.k("buildingName", false);
        pluginGeneratedSerialDescriptor.k("buildingToEnuRotation", false);
        pluginGeneratedSerialDescriptor.k("buildingOrigin", false);
        pluginGeneratedSerialDescriptor.k("geofenceOrigin", false);
        pluginGeneratedSerialDescriptor.k("geofenceRadius", false);
        pluginGeneratedSerialDescriptor.k("primaryFloorId", false);
        pluginGeneratedSerialDescriptor.k("floors", true);
        pluginGeneratedSerialDescriptor.k("entrances", true);
        pluginGeneratedSerialDescriptor.k("externalRegions", true);
        pluginGeneratedSerialDescriptor.k("autoFloorDetection", false);
        pluginGeneratedSerialDescriptor.k("strictModeEnabled", false);
        pluginGeneratedSerialDescriptor.k("clientBuildingId", true);
        pluginGeneratedSerialDescriptor.k("displayName", false);
        pluginGeneratedSerialDescriptor.k("gpsFusion", false);
        pluginGeneratedSerialDescriptor.k("kiosks", true);
        pluginGeneratedSerialDescriptor.k("buildingMetadata", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BuildingResponse$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = BuildingResponse.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.f24821a;
        KSerializer<?> kSerializerD = BuiltinSerializersKt.d(DoubleSerializer.f24792a);
        KSerializer<?> kSerializerD2 = BuiltinSerializersKt.d(FloatSerializer.f24797a);
        KSerializer<?> kSerializer = kSerializerArr[7];
        KSerializer<?> kSerializerD3 = BuiltinSerializersKt.d(kSerializerArr[8]);
        KSerializer<?> kSerializerD4 = BuiltinSerializersKt.d(kSerializerArr[9]);
        KSerializer<?> kSerializerD5 = BuiltinSerializersKt.d(stringSerializer);
        KSerializer<?> kSerializerD6 = BuiltinSerializersKt.d(kSerializerArr[15]);
        KSerializer<?> kSerializerD7 = BuiltinSerializersKt.d(stringSerializer);
        WorldCoordinateResponse$$serializer worldCoordinateResponse$$serializer = WorldCoordinateResponse$$serializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.f24779a;
        return new KSerializer[]{stringSerializer, stringSerializer, kSerializerD, worldCoordinateResponse$$serializer, worldCoordinateResponse$$serializer, kSerializerD2, stringSerializer, kSerializer, kSerializerD3, kSerializerD4, booleanSerializer, booleanSerializer, kSerializerD5, stringSerializer, booleanSerializer, kSerializerD6, kSerializerD7};
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
    public BuildingResponse deserialize(@NotNull Decoder decoder) {
        String str;
        int i;
        Intrinsics.h(decoder, "decoder");
        SerialDescriptor b = getB();
        CompositeDecoder compositeDecoderB = decoder.b(b);
        KSerializer[] kSerializerArr = BuildingResponse.$childSerializers;
        List list = null;
        List list2 = null;
        String str2 = null;
        List list3 = null;
        String str3 = null;
        String strJ = null;
        String strJ2 = null;
        Double d = null;
        WorldCoordinateResponse worldCoordinateResponse = null;
        WorldCoordinateResponse worldCoordinateResponse2 = null;
        Float f = null;
        String strJ3 = null;
        List list4 = null;
        String strJ4 = null;
        int i2 = 0;
        boolean z = true;
        boolean zB = false;
        boolean zB2 = false;
        boolean zB3 = false;
        while (true) {
            String str4 = strJ;
            if (!z) {
                compositeDecoderB.c(b);
                return new BuildingResponse(i2, strJ, strJ2, d, worldCoordinateResponse, worldCoordinateResponse2, f, strJ3, list4, list, list3, zB, zB2, str2, strJ4, zB3, list2, str3, (SerializationConstructorMarker) null);
            }
            int iU = compositeDecoderB.u(b);
            switch (iU) {
                case -1:
                    str = strJ2;
                    z = false;
                    strJ = str4;
                    strJ2 = str;
                case 0:
                    str = strJ2;
                    i2 |= 1;
                    strJ = compositeDecoderB.j(b, 0);
                    strJ2 = str;
                case 1:
                    strJ2 = compositeDecoderB.j(b, 1);
                    i2 |= 2;
                    strJ = str4;
                case 2:
                    str = strJ2;
                    d = (Double) compositeDecoderB.k(b, 2, DoubleSerializer.f24792a, d);
                    i2 |= 4;
                    strJ = str4;
                    strJ2 = str;
                case 3:
                    str = strJ2;
                    worldCoordinateResponse = (WorldCoordinateResponse) compositeDecoderB.o(b, 3, WorldCoordinateResponse$$serializer.INSTANCE, worldCoordinateResponse);
                    i2 |= 8;
                    strJ = str4;
                    strJ2 = str;
                case 4:
                    str = strJ2;
                    worldCoordinateResponse2 = (WorldCoordinateResponse) compositeDecoderB.o(b, 4, WorldCoordinateResponse$$serializer.INSTANCE, worldCoordinateResponse2);
                    i2 |= 16;
                    strJ = str4;
                    strJ2 = str;
                case 5:
                    str = strJ2;
                    f = (Float) compositeDecoderB.k(b, 5, FloatSerializer.f24797a, f);
                    i2 |= 32;
                    strJ = str4;
                    strJ2 = str;
                case 6:
                    strJ3 = compositeDecoderB.j(b, 6);
                    i2 |= 64;
                    strJ = str4;
                case 7:
                    str = strJ2;
                    list4 = (List) compositeDecoderB.o(b, 7, kSerializerArr[7], list4);
                    i2 |= 128;
                    strJ = str4;
                    strJ2 = str;
                case 8:
                    str = strJ2;
                    list = (List) compositeDecoderB.k(b, 8, kSerializerArr[8], list);
                    i2 |= 256;
                    strJ = str4;
                    strJ2 = str;
                case 9:
                    str = strJ2;
                    list3 = (List) compositeDecoderB.k(b, 9, kSerializerArr[9], list3);
                    i2 |= 512;
                    strJ = str4;
                    strJ2 = str;
                case 10:
                    zB = compositeDecoderB.B(b, 10);
                    i2 |= 1024;
                    strJ = str4;
                case 11:
                    zB2 = compositeDecoderB.B(b, 11);
                    i2 |= 2048;
                    strJ = str4;
                case 12:
                    str = strJ2;
                    str2 = (String) compositeDecoderB.k(b, 12, StringSerializer.f24821a, str2);
                    i2 |= 4096;
                    strJ = str4;
                    strJ2 = str;
                case 13:
                    strJ4 = compositeDecoderB.j(b, 13);
                    i2 |= 8192;
                    strJ = str4;
                case 14:
                    zB3 = compositeDecoderB.B(b, 14);
                    i2 |= 16384;
                    strJ = str4;
                case 15:
                    str = strJ2;
                    list2 = (List) compositeDecoderB.k(b, 15, kSerializerArr[15], list2);
                    i = 32768;
                    i2 |= i;
                    strJ = str4;
                    strJ2 = str;
                case 16:
                    str = strJ2;
                    str3 = (String) compositeDecoderB.k(b, 16, StringSerializer.f24821a, str3);
                    i = 65536;
                    i2 |= i;
                    strJ = str4;
                    strJ2 = str;
                default:
                    throw new UnknownFieldException(iU);
            }
        }
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull BuildingResponse value) {
        Intrinsics.h(encoder, "encoder");
        Intrinsics.h(value, "value");
        SerialDescriptor b = getB();
        CompositeEncoder compositeEncoderB = encoder.b(b);
        BuildingResponse.write$Self$internal_publishRelease(value, compositeEncoderB, b);
        compositeEncoderB.c(b);
    }
}
