package me.oriient.internal.services.dataManager.mapGrid;

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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import me.oriient.internal.services.dataManager.mapGrid.MapGridResponse;
import me.oriient.internal.services.dataManager.utils.MatLabArray;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"me/oriient/internal/services/dataManager/mapGrid/MapGridResponse.MapGridData.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lme/oriient/internal/services/dataManager/mapGrid/MapGridResponse$MapGridData;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated
/* loaded from: classes7.dex */
public final class MapGridResponse$MapGridData$$serializer implements GeneratedSerializer<MapGridResponse.MapGridData> {

    @NotNull
    public static final MapGridResponse$MapGridData$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        MapGridResponse$MapGridData$$serializer mapGridResponse$MapGridData$$serializer = new MapGridResponse$MapGridData$$serializer();
        INSTANCE = mapGridResponse$MapGridData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("me.oriient.internal.services.dataManager.mapGrid.MapGridResponse.MapGridData", mapGridResponse$MapGridData$$serializer, 12);
        pluginGeneratedSerialDescriptor.k("mapId", false);
        pluginGeneratedSerialDescriptor.k("mgrid", false);
        pluginGeneratedSerialDescriptor.k("mgridxqRange", false);
        pluginGeneratedSerialDescriptor.k("mgridyqRange", false);
        pluginGeneratedSerialDescriptor.k("mgridcoarse", false);
        pluginGeneratedSerialDescriptor.k("mgridcoarsexqRange", false);
        pluginGeneratedSerialDescriptor.k("mgridcoarseyqRange", false);
        pluginGeneratedSerialDescriptor.k("gmmpdf", false);
        pluginGeneratedSerialDescriptor.k("Done", false);
        pluginGeneratedSerialDescriptor.k("plmVersion", false);
        pluginGeneratedSerialDescriptor.k("majorVersion", true);
        pluginGeneratedSerialDescriptor.k("version", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MapGridResponse$MapGridData$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = MapGridResponse.MapGridData.$childSerializers;
        KSerializer<?> kSerializer = kSerializerArr[8];
        KSerializer<?> kSerializer2 = kSerializerArr[9];
        KSerializer<?> kSerializerD = BuiltinSerializersKt.d(kSerializerArr[10]);
        KSerializer<?> kSerializerD2 = BuiltinSerializersKt.d(kSerializerArr[11]);
        MapGridResponse$MapGridData$Range$$serializer mapGridResponse$MapGridData$Range$$serializer = MapGridResponse$MapGridData$Range$$serializer.INSTANCE;
        MapGridResponse$MapGridData$CoarseRange$$serializer mapGridResponse$MapGridData$CoarseRange$$serializer = MapGridResponse$MapGridData$CoarseRange$$serializer.INSTANCE;
        return new KSerializer[]{StringSerializer.f24821a, MapGridResponse$MapGridData$Grid$$serializer.INSTANCE, mapGridResponse$MapGridData$Range$$serializer, mapGridResponse$MapGridData$Range$$serializer, MapGridResponse$MapGridData$CoarseGrid$$serializer.INSTANCE, mapGridResponse$MapGridData$CoarseRange$$serializer, mapGridResponse$MapGridData$CoarseRange$$serializer, MapGridResponse$MapGridData$GmmPdf$$serializer.INSTANCE, kSerializer, kSerializer2, kSerializerD, kSerializerD2};
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
    public MapGridResponse.MapGridData deserialize(@NotNull Decoder decoder) {
        String str;
        Intrinsics.h(decoder, "decoder");
        SerialDescriptor b = getB();
        CompositeDecoder compositeDecoderB = decoder.b(b);
        KSerializer[] kSerializerArr = MapGridResponse.MapGridData.$childSerializers;
        MatLabArray matLabArray = null;
        MatLabArray matLabArray2 = null;
        MatLabArray matLabArray3 = null;
        MatLabArray matLabArray4 = null;
        String strJ = null;
        MapGridResponse.MapGridData.Grid grid = null;
        MapGridResponse.MapGridData.Range range = null;
        MapGridResponse.MapGridData.Range range2 = null;
        MapGridResponse.MapGridData.CoarseGrid coarseGrid = null;
        MapGridResponse.MapGridData.CoarseRange coarseRange = null;
        MapGridResponse.MapGridData.CoarseRange coarseRange2 = null;
        MapGridResponse.MapGridData.GmmPdf gmmPdf = null;
        int i = 0;
        boolean z = true;
        while (z) {
            KSerializer[] kSerializerArr2 = kSerializerArr;
            int iU = compositeDecoderB.u(b);
            switch (iU) {
                case -1:
                    z = false;
                    kSerializerArr = kSerializerArr2;
                case 0:
                    i |= 1;
                    strJ = compositeDecoderB.j(b, 0);
                    kSerializerArr = kSerializerArr2;
                case 1:
                    str = strJ;
                    grid = (MapGridResponse.MapGridData.Grid) compositeDecoderB.o(b, 1, MapGridResponse$MapGridData$Grid$$serializer.INSTANCE, grid);
                    i |= 2;
                    kSerializerArr = kSerializerArr2;
                    strJ = str;
                case 2:
                    str = strJ;
                    range = (MapGridResponse.MapGridData.Range) compositeDecoderB.o(b, 2, MapGridResponse$MapGridData$Range$$serializer.INSTANCE, range);
                    i |= 4;
                    kSerializerArr = kSerializerArr2;
                    strJ = str;
                case 3:
                    str = strJ;
                    range2 = (MapGridResponse.MapGridData.Range) compositeDecoderB.o(b, 3, MapGridResponse$MapGridData$Range$$serializer.INSTANCE, range2);
                    i |= 8;
                    kSerializerArr = kSerializerArr2;
                    strJ = str;
                case 4:
                    str = strJ;
                    coarseGrid = (MapGridResponse.MapGridData.CoarseGrid) compositeDecoderB.o(b, 4, MapGridResponse$MapGridData$CoarseGrid$$serializer.INSTANCE, coarseGrid);
                    i |= 16;
                    kSerializerArr = kSerializerArr2;
                    strJ = str;
                case 5:
                    str = strJ;
                    coarseRange = (MapGridResponse.MapGridData.CoarseRange) compositeDecoderB.o(b, 5, MapGridResponse$MapGridData$CoarseRange$$serializer.INSTANCE, coarseRange);
                    i |= 32;
                    kSerializerArr = kSerializerArr2;
                    strJ = str;
                case 6:
                    str = strJ;
                    coarseRange2 = (MapGridResponse.MapGridData.CoarseRange) compositeDecoderB.o(b, 6, MapGridResponse$MapGridData$CoarseRange$$serializer.INSTANCE, coarseRange2);
                    i |= 64;
                    kSerializerArr = kSerializerArr2;
                    strJ = str;
                case 7:
                    str = strJ;
                    gmmPdf = (MapGridResponse.MapGridData.GmmPdf) compositeDecoderB.o(b, 7, MapGridResponse$MapGridData$GmmPdf$$serializer.INSTANCE, gmmPdf);
                    i |= 128;
                    kSerializerArr = kSerializerArr2;
                    strJ = str;
                case 8:
                    str = strJ;
                    matLabArray = (MatLabArray) compositeDecoderB.o(b, 8, kSerializerArr2[8], matLabArray);
                    i |= 256;
                    kSerializerArr = kSerializerArr2;
                    strJ = str;
                case 9:
                    str = strJ;
                    matLabArray3 = (MatLabArray) compositeDecoderB.o(b, 9, kSerializerArr2[9], matLabArray3);
                    i |= 512;
                    kSerializerArr = kSerializerArr2;
                    strJ = str;
                case 10:
                    str = strJ;
                    matLabArray4 = (MatLabArray) compositeDecoderB.k(b, 10, kSerializerArr2[10], matLabArray4);
                    i |= 1024;
                    kSerializerArr = kSerializerArr2;
                    strJ = str;
                case 11:
                    str = strJ;
                    matLabArray2 = (MatLabArray) compositeDecoderB.k(b, 11, kSerializerArr2[11], matLabArray2);
                    i |= 2048;
                    kSerializerArr = kSerializerArr2;
                    strJ = str;
                default:
                    throw new UnknownFieldException(iU);
            }
        }
        compositeDecoderB.c(b);
        return new MapGridResponse.MapGridData(i, strJ, grid, range, range2, coarseGrid, coarseRange, coarseRange2, gmmPdf, matLabArray, matLabArray3, matLabArray4, matLabArray2, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull MapGridResponse.MapGridData value) {
        Intrinsics.h(encoder, "encoder");
        Intrinsics.h(value, "value");
        SerialDescriptor b = getB();
        CompositeEncoder compositeEncoderB = encoder.b(b);
        MapGridResponse.MapGridData.write$Self$internal_publishRelease(value, compositeEncoderB, b);
        compositeEncoderB.c(b);
    }
}
