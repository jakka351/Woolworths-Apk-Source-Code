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
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;
import me.oriient.internal.services.dataManager.floorMetadata.FloorMap;
import me.oriient.internal.services.dataManager.floorMetadata.FloorMap$$serializer;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"me/oriient/internal/services/dataManager/building/Floor.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lme/oriient/internal/services/dataManager/building/Floor;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated
/* loaded from: classes7.dex */
public final class Floor$$serializer implements GeneratedSerializer<Floor> {

    @NotNull
    public static final Floor$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        Floor$$serializer floor$$serializer = new Floor$$serializer();
        INSTANCE = floor$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("me.oriient.internal.services.dataManager.building.Floor", floor$$serializer, 9);
        pluginGeneratedSerialDescriptor.k("id", false);
        pluginGeneratedSerialDescriptor.k(AppMeasurementSdk.ConditionalUserProperty.NAME, false);
        pluginGeneratedSerialDescriptor.k("shortName", false);
        pluginGeneratedSerialDescriptor.k("order", false);
        pluginGeneratedSerialDescriptor.k("maps", false);
        pluginGeneratedSerialDescriptor.k("primaryMap", false);
        pluginGeneratedSerialDescriptor.k("floorEntrances", false);
        pluginGeneratedSerialDescriptor.k("height", false);
        pluginGeneratedSerialDescriptor.k("kiosk", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Floor$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = Floor.$childSerializers;
        KSerializer<?> kSerializer = kSerializerArr[4];
        KSerializer<?> kSerializerD = BuiltinSerializersKt.d(FloorMap$$serializer.INSTANCE);
        KSerializer<?> kSerializer2 = kSerializerArr[6];
        KSerializer<?> kSerializerD2 = BuiltinSerializersKt.d(Kiosk$$serializer.INSTANCE);
        StringSerializer stringSerializer = StringSerializer.f24821a;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, IntSerializer.f24800a, kSerializer, kSerializerD, kSerializer2, DoubleSerializer.f24792a, kSerializerD2};
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
    public Floor deserialize(@NotNull Decoder decoder) {
        Intrinsics.h(decoder, "decoder");
        SerialDescriptor b = getB();
        CompositeDecoder compositeDecoderB = decoder.b(b);
        KSerializer[] kSerializerArr = Floor.$childSerializers;
        List list = null;
        String strJ = null;
        String strJ2 = null;
        String strJ3 = null;
        List list2 = null;
        FloorMap floorMap = null;
        double D = 0.0d;
        int i = 0;
        int iG = 0;
        boolean z = true;
        Kiosk kiosk = null;
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
                    iG = compositeDecoderB.g(b, 3);
                    i |= 8;
                    break;
                case 4:
                    list2 = (List) compositeDecoderB.o(b, 4, kSerializerArr[4], list2);
                    i |= 16;
                    break;
                case 5:
                    floorMap = (FloorMap) compositeDecoderB.k(b, 5, FloorMap$$serializer.INSTANCE, floorMap);
                    i |= 32;
                    break;
                case 6:
                    list = (List) compositeDecoderB.o(b, 6, kSerializerArr[6], list);
                    i |= 64;
                    break;
                case 7:
                    D = compositeDecoderB.D(b, 7);
                    i |= 128;
                    break;
                case 8:
                    kiosk = (Kiosk) compositeDecoderB.k(b, 8, Kiosk$$serializer.INSTANCE, kiosk);
                    i |= 256;
                    break;
                default:
                    throw new UnknownFieldException(iU);
            }
        }
        compositeDecoderB.c(b);
        return new Floor(i, strJ, strJ2, strJ3, iG, list2, floorMap, list, D, kiosk, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull Floor value) {
        Intrinsics.h(encoder, "encoder");
        Intrinsics.h(value, "value");
        SerialDescriptor b = getB();
        CompositeEncoder compositeEncoderB = encoder.b(b);
        Floor.write$Self$internal_publishRelease(value, compositeEncoderB, b);
        compositeEncoderB.c(b);
    }
}
