package me.oriient.internal.services.dataManager.mapGrid;

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
import kotlinx.serialization.internal.ByteArraySerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;
import me.oriient.internal.services.dataModel.engine.MapGridType;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"me/oriient/internal/services/dataManager/mapGrid/MapGridRecord.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lme/oriient/internal/services/dataManager/mapGrid/MapGridRecord;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated
/* loaded from: classes7.dex */
public final class MapGridRecord$$serializer implements GeneratedSerializer<MapGridRecord> {

    @NotNull
    public static final MapGridRecord$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        MapGridRecord$$serializer mapGridRecord$$serializer = new MapGridRecord$$serializer();
        INSTANCE = mapGridRecord$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("me.oriient.internal.services.dataManager.mapGrid.MapGridRecord", mapGridRecord$$serializer, 11);
        pluginGeneratedSerialDescriptor.k("buildingId", false);
        pluginGeneratedSerialDescriptor.k("floorId", false);
        pluginGeneratedSerialDescriptor.k("mapId", false);
        pluginGeneratedSerialDescriptor.k("data", false);
        pluginGeneratedSerialDescriptor.k("vector", false);
        pluginGeneratedSerialDescriptor.k("tag", false);
        pluginGeneratedSerialDescriptor.k("engineVersion", false);
        pluginGeneratedSerialDescriptor.k("mapVersion", false);
        pluginGeneratedSerialDescriptor.k("type", false);
        pluginGeneratedSerialDescriptor.k("majorVersion", false);
        pluginGeneratedSerialDescriptor.k("createdBy", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MapGridRecord$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        KSerializer<?> kSerializer = MapGridRecord.$childSerializers[8];
        StringSerializer stringSerializer = StringSerializer.f24821a;
        ByteArraySerializer byteArraySerializer = ByteArraySerializer.c;
        IntSerializer intSerializer = IntSerializer.f24800a;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, byteArraySerializer, byteArraySerializer, byteArraySerializer, stringSerializer, intSerializer, kSerializer, intSerializer, stringSerializer};
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
    public MapGridRecord deserialize(@NotNull Decoder decoder) {
        Intrinsics.h(decoder, "decoder");
        SerialDescriptor b = getB();
        CompositeDecoder compositeDecoderB = decoder.b(b);
        KSerializer[] kSerializerArr = MapGridRecord.$childSerializers;
        MapGridType mapGridType = null;
        String strJ = null;
        String strJ2 = null;
        String strJ3 = null;
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        String strJ4 = null;
        String strJ5 = null;
        boolean z = true;
        int i = 0;
        int iG = 0;
        int iG2 = 0;
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
                    bArr = (byte[]) compositeDecoderB.o(b, 3, ByteArraySerializer.c, bArr);
                    i |= 8;
                    break;
                case 4:
                    bArr2 = (byte[]) compositeDecoderB.o(b, 4, ByteArraySerializer.c, bArr2);
                    i |= 16;
                    break;
                case 5:
                    bArr3 = (byte[]) compositeDecoderB.o(b, 5, ByteArraySerializer.c, bArr3);
                    i |= 32;
                    break;
                case 6:
                    strJ4 = compositeDecoderB.j(b, 6);
                    i |= 64;
                    break;
                case 7:
                    iG = compositeDecoderB.g(b, 7);
                    i |= 128;
                    break;
                case 8:
                    mapGridType = (MapGridType) compositeDecoderB.o(b, 8, kSerializerArr[8], mapGridType);
                    i |= 256;
                    break;
                case 9:
                    iG2 = compositeDecoderB.g(b, 9);
                    i |= 512;
                    break;
                case 10:
                    strJ5 = compositeDecoderB.j(b, 10);
                    i |= 1024;
                    break;
                default:
                    throw new UnknownFieldException(iU);
            }
        }
        compositeDecoderB.c(b);
        return new MapGridRecord(i, strJ, strJ2, strJ3, bArr, bArr2, bArr3, strJ4, iG, mapGridType, iG2, strJ5, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull MapGridRecord value) {
        Intrinsics.h(encoder, "encoder");
        Intrinsics.h(value, "value");
        SerialDescriptor b = getB();
        CompositeEncoder compositeEncoderB = encoder.b(b);
        MapGridRecord.write$Self$internal_publishRelease(value, compositeEncoderB, b);
        compositeEncoderB.c(b);
    }
}
