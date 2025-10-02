package me.oriient.internal.services.dataManager.building;

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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import me.oriient.internal.services.dataManager.common.WorldCoordinate;
import me.oriient.internal.services.dataManager.common.WorldCoordinate$$serializer;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"me/oriient/internal/services/dataManager/building/Building.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lme/oriient/internal/services/dataManager/building/Building;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated
/* loaded from: classes7.dex */
public final class Building$$serializer implements GeneratedSerializer<Building> {

    @NotNull
    public static final Building$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        Building$$serializer building$$serializer = new Building$$serializer();
        INSTANCE = building$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("me.oriient.internal.services.dataManager.building.Building", building$$serializer, 16);
        pluginGeneratedSerialDescriptor.k("id", false);
        pluginGeneratedSerialDescriptor.k(AppMeasurementSdk.ConditionalUserProperty.NAME, false);
        pluginGeneratedSerialDescriptor.k("spaceId", false);
        pluginGeneratedSerialDescriptor.k("buildingOrigin", false);
        pluginGeneratedSerialDescriptor.k("geofenceOrigin", false);
        pluginGeneratedSerialDescriptor.k("geofenceRadiusMeters", false);
        pluginGeneratedSerialDescriptor.k("rotationToEnu", false);
        pluginGeneratedSerialDescriptor.k("primaryFloor", false);
        pluginGeneratedSerialDescriptor.k("floors", false);
        pluginGeneratedSerialDescriptor.k("externalRegions", false);
        pluginGeneratedSerialDescriptor.k("isFloorDetectionSupported", false);
        pluginGeneratedSerialDescriptor.k("strictModeEnabled", false);
        pluginGeneratedSerialDescriptor.k("clientBuildingId", true);
        pluginGeneratedSerialDescriptor.k("displayName", false);
        pluginGeneratedSerialDescriptor.k("gpsFusion", false);
        pluginGeneratedSerialDescriptor.k("metadata", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Building$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = Building.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.f24821a;
        KSerializer<?> kSerializer = kSerializerArr[8];
        KSerializer<?> kSerializer2 = kSerializerArr[9];
        KSerializer<?> kSerializerD = BuiltinSerializersKt.d(stringSerializer);
        KSerializer<?> kSerializerD2 = BuiltinSerializersKt.d(stringSerializer);
        WorldCoordinate$$serializer worldCoordinate$$serializer = WorldCoordinate$$serializer.INSTANCE;
        DoubleSerializer doubleSerializer = DoubleSerializer.f24792a;
        BooleanSerializer booleanSerializer = BooleanSerializer.f24779a;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, worldCoordinate$$serializer, worldCoordinate$$serializer, doubleSerializer, doubleSerializer, Floor$$serializer.INSTANCE, kSerializer, kSerializer2, booleanSerializer, booleanSerializer, kSerializerD, stringSerializer, booleanSerializer, kSerializerD2};
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
    public Building deserialize(@NotNull Decoder decoder) {
        KSerializer[] kSerializerArr;
        Intrinsics.h(decoder, "decoder");
        SerialDescriptor b = getB();
        CompositeDecoder compositeDecoderB = decoder.b(b);
        KSerializer[] kSerializerArr2 = Building.$childSerializers;
        List list = null;
        String str = null;
        Floor floor = null;
        String strJ = null;
        String strJ2 = null;
        String strJ3 = null;
        WorldCoordinate worldCoordinate = null;
        WorldCoordinate worldCoordinate2 = null;
        String strJ4 = null;
        double D = 0.0d;
        double D2 = 0.0d;
        int i = 0;
        boolean z = true;
        boolean zB = false;
        boolean zB2 = false;
        boolean zB3 = false;
        List list2 = null;
        String str2 = null;
        while (z) {
            int iU = compositeDecoderB.u(b);
            switch (iU) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    kSerializerArr = kSerializerArr2;
                    strJ = compositeDecoderB.j(b, 0);
                    i |= 1;
                    break;
                case 1:
                    kSerializerArr = kSerializerArr2;
                    strJ2 = compositeDecoderB.j(b, 1);
                    i |= 2;
                    break;
                case 2:
                    kSerializerArr = kSerializerArr2;
                    strJ3 = compositeDecoderB.j(b, 2);
                    i |= 4;
                    break;
                case 3:
                    kSerializerArr = kSerializerArr2;
                    worldCoordinate = (WorldCoordinate) compositeDecoderB.o(b, 3, WorldCoordinate$$serializer.INSTANCE, worldCoordinate);
                    i |= 8;
                    break;
                case 4:
                    kSerializerArr = kSerializerArr2;
                    worldCoordinate2 = (WorldCoordinate) compositeDecoderB.o(b, 4, WorldCoordinate$$serializer.INSTANCE, worldCoordinate2);
                    i |= 16;
                    break;
                case 5:
                    kSerializerArr = kSerializerArr2;
                    D = compositeDecoderB.D(b, 5);
                    i |= 32;
                    break;
                case 6:
                    kSerializerArr = kSerializerArr2;
                    D2 = compositeDecoderB.D(b, 6);
                    i |= 64;
                    break;
                case 7:
                    kSerializerArr = kSerializerArr2;
                    floor = (Floor) compositeDecoderB.o(b, 7, Floor$$serializer.INSTANCE, floor);
                    i |= 128;
                    break;
                case 8:
                    kSerializerArr = kSerializerArr2;
                    list = (List) compositeDecoderB.o(b, 8, kSerializerArr[8], list);
                    i |= 256;
                    break;
                case 9:
                    kSerializerArr = kSerializerArr2;
                    list2 = (List) compositeDecoderB.o(b, 9, kSerializerArr[9], list2);
                    i |= 512;
                    break;
                case 10:
                    kSerializerArr = kSerializerArr2;
                    zB = compositeDecoderB.B(b, 10);
                    i |= 1024;
                    break;
                case 11:
                    kSerializerArr = kSerializerArr2;
                    zB2 = compositeDecoderB.B(b, 11);
                    i |= 2048;
                    break;
                case 12:
                    kSerializerArr = kSerializerArr2;
                    str = (String) compositeDecoderB.k(b, 12, StringSerializer.f24821a, str);
                    i |= 4096;
                    break;
                case 13:
                    kSerializerArr = kSerializerArr2;
                    strJ4 = compositeDecoderB.j(b, 13);
                    i |= 8192;
                    break;
                case 14:
                    kSerializerArr = kSerializerArr2;
                    zB3 = compositeDecoderB.B(b, 14);
                    i |= 16384;
                    break;
                case 15:
                    kSerializerArr = kSerializerArr2;
                    str2 = (String) compositeDecoderB.k(b, 15, StringSerializer.f24821a, str2);
                    i |= 32768;
                    break;
                default:
                    throw new UnknownFieldException(iU);
            }
            kSerializerArr2 = kSerializerArr;
        }
        compositeDecoderB.c(b);
        return new Building(i, strJ, strJ2, strJ3, worldCoordinate, worldCoordinate2, D, D2, floor, list, list2, zB, zB2, str, strJ4, zB3, str2, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull Building value) {
        Intrinsics.h(encoder, "encoder");
        Intrinsics.h(value, "value");
        SerialDescriptor b = getB();
        CompositeEncoder compositeEncoderB = encoder.b(b);
        Building.write$Self$internal_publishRelease(value, compositeEncoderB, b);
        compositeEncoderB.c(b);
    }
}
