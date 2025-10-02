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
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import me.oriient.internal.services.dataManager.mapGrid.MapGrid;
import me.oriient.internal.services.dataManager.utils.MatLabArray;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"me/oriient/internal/services/dataManager/mapGrid/MapGrid.MapGridData.Grid.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lme/oriient/internal/services/dataManager/mapGrid/MapGrid$MapGridData$Grid;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated
/* loaded from: classes7.dex */
public final class MapGrid$MapGridData$Grid$$serializer implements GeneratedSerializer<MapGrid.MapGridData.Grid> {

    @NotNull
    public static final MapGrid$MapGridData$Grid$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        MapGrid$MapGridData$Grid$$serializer mapGrid$MapGridData$Grid$$serializer = new MapGrid$MapGridData$Grid$$serializer();
        INSTANCE = mapGrid$MapGridData$Grid$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("me.oriient.internal.services.dataManager.mapGrid.MapGrid.MapGridData.Grid", mapGrid$MapGridData$Grid$$serializer, 5);
        pluginGeneratedSerialDescriptor.k("mx", false);
        pluginGeneratedSerialDescriptor.k("my", false);
        pluginGeneratedSerialDescriptor.k("mz", false);
        pluginGeneratedSerialDescriptor.k("d", false);
        pluginGeneratedSerialDescriptor.k("res", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MapGrid$MapGridData$Grid$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = MapGrid.MapGridData.Grid.$childSerializers;
        return new KSerializer[]{kSerializerArr[0], kSerializerArr[1], kSerializerArr[2], kSerializerArr[3], DoubleSerializer.f24792a};
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
    public MapGrid.MapGridData.Grid deserialize(@NotNull Decoder decoder) {
        Intrinsics.h(decoder, "decoder");
        SerialDescriptor b = getB();
        CompositeDecoder compositeDecoderB = decoder.b(b);
        KSerializer[] kSerializerArr = MapGrid.MapGridData.Grid.$childSerializers;
        int i = 0;
        MatLabArray matLabArray = null;
        MatLabArray matLabArray2 = null;
        MatLabArray matLabArray3 = null;
        MatLabArray matLabArray4 = null;
        double D = 0.0d;
        boolean z = true;
        while (z) {
            int iU = compositeDecoderB.u(b);
            if (iU == -1) {
                z = false;
            } else if (iU == 0) {
                matLabArray = (MatLabArray) compositeDecoderB.o(b, 0, kSerializerArr[0], matLabArray);
                i |= 1;
            } else if (iU == 1) {
                matLabArray2 = (MatLabArray) compositeDecoderB.o(b, 1, kSerializerArr[1], matLabArray2);
                i |= 2;
            } else if (iU == 2) {
                matLabArray3 = (MatLabArray) compositeDecoderB.o(b, 2, kSerializerArr[2], matLabArray3);
                i |= 4;
            } else if (iU == 3) {
                matLabArray4 = (MatLabArray) compositeDecoderB.o(b, 3, kSerializerArr[3], matLabArray4);
                i |= 8;
            } else {
                if (iU != 4) {
                    throw new UnknownFieldException(iU);
                }
                D = compositeDecoderB.D(b, 4);
                i |= 16;
            }
        }
        compositeDecoderB.c(b);
        return new MapGrid.MapGridData.Grid(i, matLabArray, matLabArray2, matLabArray3, matLabArray4, D, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull MapGrid.MapGridData.Grid value) {
        Intrinsics.h(encoder, "encoder");
        Intrinsics.h(value, "value");
        SerialDescriptor b = getB();
        CompositeEncoder compositeEncoderB = encoder.b(b);
        MapGrid.MapGridData.Grid.write$Self$internal_publishRelease(value, compositeEncoderB, b);
        compositeEncoderB.c(b);
    }
}
