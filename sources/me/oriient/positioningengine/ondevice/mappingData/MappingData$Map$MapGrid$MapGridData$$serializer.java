package me.oriient.positioningengine.ondevice.mappingData;

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
import kotlinx.serialization.internal.ByteSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;
import me.oriient.positioningengine.ondevice.mappingData.MappingData;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"me/oriient/positioningengine/ondevice/mappingData/MappingData.Map.MapGrid.MapGridData.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map$MapGrid$MapGridData;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated
/* loaded from: classes8.dex */
public final class MappingData$Map$MapGrid$MapGridData$$serializer implements GeneratedSerializer<MappingData.Map.MapGrid.MapGridData> {

    @NotNull
    public static final MappingData$Map$MapGrid$MapGridData$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        MappingData$Map$MapGrid$MapGridData$$serializer mappingData$Map$MapGrid$MapGridData$$serializer = new MappingData$Map$MapGrid$MapGridData$$serializer();
        INSTANCE = mappingData$Map$MapGrid$MapGridData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("me.oriient.positioningengine.ondevice.mappingData.MappingData.Map.MapGrid.MapGridData", mappingData$Map$MapGrid$MapGridData$$serializer, 12);
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
        pluginGeneratedSerialDescriptor.k("majorVersion", false);
        pluginGeneratedSerialDescriptor.k("version", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MappingData$Map$MapGrid$MapGridData$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        DoubleSerializer doubleSerializer = DoubleSerializer.f24792a;
        KSerializer<?> kSerializerD = BuiltinSerializersKt.d(doubleSerializer);
        KSerializer<?> kSerializerD2 = BuiltinSerializersKt.d(doubleSerializer);
        MappingData$Map$MapGrid$MapGridData$Range$$serializer mappingData$Map$MapGrid$MapGridData$Range$$serializer = MappingData$Map$MapGrid$MapGridData$Range$$serializer.INSTANCE;
        MappingData$Map$MapGrid$MapGridData$CoarseRange$$serializer mappingData$Map$MapGrid$MapGridData$CoarseRange$$serializer = MappingData$Map$MapGrid$MapGridData$CoarseRange$$serializer.INSTANCE;
        return new KSerializer[]{StringSerializer.f24821a, MappingData$Map$MapGrid$MapGridData$Grid$$serializer.INSTANCE, mappingData$Map$MapGrid$MapGridData$Range$$serializer, mappingData$Map$MapGrid$MapGridData$Range$$serializer, MappingData$Map$MapGrid$MapGridData$CoarseGrid$$serializer.INSTANCE, mappingData$Map$MapGrid$MapGridData$CoarseRange$$serializer, mappingData$Map$MapGrid$MapGridData$CoarseRange$$serializer, MappingData$Map$MapGrid$MapGridData$GmmPdf$$serializer.INSTANCE, ByteSerializer.f24781a, doubleSerializer, kSerializerD, kSerializerD2};
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
    public MappingData.Map.MapGrid.MapGridData deserialize(@NotNull Decoder decoder) {
        Intrinsics.h(decoder, "decoder");
        SerialDescriptor b = getB();
        CompositeDecoder compositeDecoderB = decoder.b(b);
        MappingData.Map.MapGrid.MapGridData.GmmPdf gmmPdf = null;
        String strJ = null;
        MappingData.Map.MapGrid.MapGridData.Grid grid = null;
        MappingData.Map.MapGrid.MapGridData.Range range = null;
        MappingData.Map.MapGrid.MapGridData.Range range2 = null;
        MappingData.Map.MapGrid.MapGridData.CoarseGrid coarseGrid = null;
        MappingData.Map.MapGrid.MapGridData.CoarseRange coarseRange = null;
        MappingData.Map.MapGrid.MapGridData.CoarseRange coarseRange2 = null;
        double D = 0.0d;
        boolean z = true;
        int i = 0;
        byte bA = 0;
        Double d = null;
        Double d2 = null;
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
                    grid = (MappingData.Map.MapGrid.MapGridData.Grid) compositeDecoderB.o(b, 1, MappingData$Map$MapGrid$MapGridData$Grid$$serializer.INSTANCE, grid);
                    i |= 2;
                    break;
                case 2:
                    range = (MappingData.Map.MapGrid.MapGridData.Range) compositeDecoderB.o(b, 2, MappingData$Map$MapGrid$MapGridData$Range$$serializer.INSTANCE, range);
                    i |= 4;
                    break;
                case 3:
                    range2 = (MappingData.Map.MapGrid.MapGridData.Range) compositeDecoderB.o(b, 3, MappingData$Map$MapGrid$MapGridData$Range$$serializer.INSTANCE, range2);
                    i |= 8;
                    break;
                case 4:
                    coarseGrid = (MappingData.Map.MapGrid.MapGridData.CoarseGrid) compositeDecoderB.o(b, 4, MappingData$Map$MapGrid$MapGridData$CoarseGrid$$serializer.INSTANCE, coarseGrid);
                    i |= 16;
                    break;
                case 5:
                    coarseRange = (MappingData.Map.MapGrid.MapGridData.CoarseRange) compositeDecoderB.o(b, 5, MappingData$Map$MapGrid$MapGridData$CoarseRange$$serializer.INSTANCE, coarseRange);
                    i |= 32;
                    break;
                case 6:
                    coarseRange2 = (MappingData.Map.MapGrid.MapGridData.CoarseRange) compositeDecoderB.o(b, 6, MappingData$Map$MapGrid$MapGridData$CoarseRange$$serializer.INSTANCE, coarseRange2);
                    i |= 64;
                    break;
                case 7:
                    gmmPdf = (MappingData.Map.MapGrid.MapGridData.GmmPdf) compositeDecoderB.o(b, 7, MappingData$Map$MapGrid$MapGridData$GmmPdf$$serializer.INSTANCE, gmmPdf);
                    i |= 128;
                    break;
                case 8:
                    bA = compositeDecoderB.A(b, 8);
                    i |= 256;
                    break;
                case 9:
                    D = compositeDecoderB.D(b, 9);
                    i |= 512;
                    break;
                case 10:
                    d = (Double) compositeDecoderB.k(b, 10, DoubleSerializer.f24792a, d);
                    i |= 1024;
                    break;
                case 11:
                    d2 = (Double) compositeDecoderB.k(b, 11, DoubleSerializer.f24792a, d2);
                    i |= 2048;
                    break;
                default:
                    throw new UnknownFieldException(iU);
            }
        }
        compositeDecoderB.c(b);
        return new MappingData.Map.MapGrid.MapGridData(i, strJ, grid, range, range2, coarseGrid, coarseRange, coarseRange2, gmmPdf, bA, D, d, d2, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull MappingData.Map.MapGrid.MapGridData value) {
        Intrinsics.h(encoder, "encoder");
        Intrinsics.h(value, "value");
        SerialDescriptor b = getB();
        CompositeEncoder compositeEncoderB = encoder.b(b);
        MappingData.Map.MapGrid.MapGridData.write$Self$service_positioning_engine_publishRelease(value, compositeEncoderB, b);
        compositeEncoderB.c(b);
    }
}
