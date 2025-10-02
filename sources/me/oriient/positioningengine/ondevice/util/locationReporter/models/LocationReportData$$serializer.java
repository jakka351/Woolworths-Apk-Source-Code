package me.oriient.positioningengine.ondevice.util.locationReporter.models;

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
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"me/oriient/positioningengine/ondevice/util/locationReporter/models/LocationReportData.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lme/oriient/positioningengine/ondevice/util/locationReporter/models/LocationReportData;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated
/* loaded from: classes8.dex */
public final class LocationReportData$$serializer implements GeneratedSerializer<LocationReportData> {

    @NotNull
    public static final LocationReportData$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        LocationReportData$$serializer locationReportData$$serializer = new LocationReportData$$serializer();
        INSTANCE = locationReportData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("me.oriient.positioningengine.ondevice.util.locationReporter.models.LocationReportData", locationReportData$$serializer, 15);
        pluginGeneratedSerialDescriptor.k("x", false);
        pluginGeneratedSerialDescriptor.k("y", false);
        pluginGeneratedSerialDescriptor.k("z", false);
        pluginGeneratedSerialDescriptor.k("d", false);
        pluginGeneratedSerialDescriptor.k("lng", false);
        pluginGeneratedSerialDescriptor.k("lat", false);
        pluginGeneratedSerialDescriptor.k("elv", false);
        pluginGeneratedSerialDescriptor.k("azm", false);
        pluginGeneratedSerialDescriptor.k("td", false);
        pluginGeneratedSerialDescriptor.k("t", false);
        pluginGeneratedSerialDescriptor.k("lp", false);
        pluginGeneratedSerialDescriptor.k("u", false);
        pluginGeneratedSerialDescriptor.k("h", false);
        pluginGeneratedSerialDescriptor.k("mo", false);
        pluginGeneratedSerialDescriptor.k("f", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private LocationReportData$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        DoubleSerializer doubleSerializer = DoubleSerializer.f24792a;
        KSerializer<?> kSerializerD = BuiltinSerializersKt.d(doubleSerializer);
        KSerializer<?> kSerializerD2 = BuiltinSerializersKt.d(doubleSerializer);
        KSerializer<?> kSerializerD3 = BuiltinSerializersKt.d(doubleSerializer);
        KSerializer<?> kSerializerD4 = BuiltinSerializersKt.d(doubleSerializer);
        KSerializer<?> kSerializerD5 = BuiltinSerializersKt.d(doubleSerializer);
        KSerializer<?> kSerializerD6 = BuiltinSerializersKt.d(doubleSerializer);
        KSerializer<?> kSerializerD7 = BuiltinSerializersKt.d(IntSerializer.f24800a);
        LocationReportCoordinate$$serializer locationReportCoordinate$$serializer = LocationReportCoordinate$$serializer.INSTANCE;
        return new KSerializer[]{doubleSerializer, doubleSerializer, kSerializerD, kSerializerD2, kSerializerD3, kSerializerD4, kSerializerD5, kSerializerD6, doubleSerializer, StringSerializer.f24821a, doubleSerializer, doubleSerializer, locationReportCoordinate$$serializer, locationReportCoordinate$$serializer, kSerializerD7};
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
    public LocationReportData deserialize(@NotNull Decoder decoder) {
        Intrinsics.h(decoder, "decoder");
        SerialDescriptor b = getB();
        CompositeDecoder compositeDecoderB = decoder.b(b);
        Double d = null;
        double D = 0.0d;
        double D2 = 0.0d;
        double D3 = 0.0d;
        double D4 = 0.0d;
        double D5 = 0.0d;
        Integer num = null;
        Double d2 = null;
        Double d3 = null;
        LocationReportCoordinate locationReportCoordinate = null;
        LocationReportCoordinate locationReportCoordinate2 = null;
        Double d4 = null;
        Double d5 = null;
        Double d6 = null;
        String strJ = null;
        int i = 0;
        boolean z = true;
        while (true) {
            double d7 = D;
            if (!z) {
                compositeDecoderB.c(b);
                return new LocationReportData(i, D, D2, d4, d5, d6, d, d2, d3, D3, strJ, D4, D5, locationReportCoordinate, locationReportCoordinate2, num, null);
            }
            int iU = compositeDecoderB.u(b);
            switch (iU) {
                case -1:
                    z = false;
                    break;
                case 0:
                    i |= 1;
                    D = compositeDecoderB.D(b, 0);
                    continue;
                case 1:
                    D2 = compositeDecoderB.D(b, 1);
                    i |= 2;
                    break;
                case 2:
                    d4 = (Double) compositeDecoderB.k(b, 2, DoubleSerializer.f24792a, d4);
                    i |= 4;
                    break;
                case 3:
                    d5 = (Double) compositeDecoderB.k(b, 3, DoubleSerializer.f24792a, d5);
                    i |= 8;
                    break;
                case 4:
                    d6 = (Double) compositeDecoderB.k(b, 4, DoubleSerializer.f24792a, d6);
                    i |= 16;
                    break;
                case 5:
                    d = (Double) compositeDecoderB.k(b, 5, DoubleSerializer.f24792a, d);
                    i |= 32;
                    break;
                case 6:
                    d2 = (Double) compositeDecoderB.k(b, 6, DoubleSerializer.f24792a, d2);
                    i |= 64;
                    break;
                case 7:
                    d3 = (Double) compositeDecoderB.k(b, 7, DoubleSerializer.f24792a, d3);
                    i |= 128;
                    break;
                case 8:
                    D3 = compositeDecoderB.D(b, 8);
                    i |= 256;
                    break;
                case 9:
                    strJ = compositeDecoderB.j(b, 9);
                    i |= 512;
                    break;
                case 10:
                    D4 = compositeDecoderB.D(b, 10);
                    i |= 1024;
                    break;
                case 11:
                    D5 = compositeDecoderB.D(b, 11);
                    i |= 2048;
                    break;
                case 12:
                    locationReportCoordinate = (LocationReportCoordinate) compositeDecoderB.o(b, 12, LocationReportCoordinate$$serializer.INSTANCE, locationReportCoordinate);
                    i |= 4096;
                    break;
                case 13:
                    locationReportCoordinate2 = (LocationReportCoordinate) compositeDecoderB.o(b, 13, LocationReportCoordinate$$serializer.INSTANCE, locationReportCoordinate2);
                    i |= 8192;
                    break;
                case 14:
                    num = (Integer) compositeDecoderB.k(b, 14, IntSerializer.f24800a, num);
                    i |= 16384;
                    break;
                default:
                    throw new UnknownFieldException(iU);
            }
            D = d7;
        }
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull LocationReportData value) {
        Intrinsics.h(encoder, "encoder");
        Intrinsics.h(value, "value");
        SerialDescriptor b = getB();
        CompositeEncoder compositeEncoderB = encoder.b(b);
        LocationReportData.write$Self$service_positioning_engine_publishRelease(value, compositeEncoderB, b);
        compositeEncoderB.c(b);
    }
}
