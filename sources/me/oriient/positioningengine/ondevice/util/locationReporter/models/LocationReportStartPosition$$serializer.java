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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"me/oriient/positioningengine/ondevice/util/locationReporter/models/LocationReportStartPosition.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lme/oriient/positioningengine/ondevice/util/locationReporter/models/LocationReportStartPosition;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated
/* loaded from: classes8.dex */
public final class LocationReportStartPosition$$serializer implements GeneratedSerializer<LocationReportStartPosition> {

    @NotNull
    public static final LocationReportStartPosition$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        LocationReportStartPosition$$serializer locationReportStartPosition$$serializer = new LocationReportStartPosition$$serializer();
        INSTANCE = locationReportStartPosition$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("me.oriient.positioningengine.ondevice.util.locationReporter.models.LocationReportStartPosition", locationReportStartPosition$$serializer, 5);
        pluginGeneratedSerialDescriptor.k("x", false);
        pluginGeneratedSerialDescriptor.k("y", false);
        pluginGeneratedSerialDescriptor.k("accuracy", false);
        pluginGeneratedSerialDescriptor.k("heading", false);
        pluginGeneratedSerialDescriptor.k("isExternal", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private LocationReportStartPosition$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        KSerializer<?> kSerializerD = BuiltinSerializersKt.d(LocationReportCoordinate$$serializer.INSTANCE);
        DoubleSerializer doubleSerializer = DoubleSerializer.f24792a;
        return new KSerializer[]{doubleSerializer, doubleSerializer, doubleSerializer, kSerializerD, BooleanSerializer.f24779a};
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
    public LocationReportStartPosition deserialize(@NotNull Decoder decoder) {
        Intrinsics.h(decoder, "decoder");
        SerialDescriptor b = getB();
        CompositeDecoder compositeDecoderB = decoder.b(b);
        int i = 0;
        boolean zB = false;
        double D = 0.0d;
        double D2 = 0.0d;
        double D3 = 0.0d;
        LocationReportCoordinate locationReportCoordinate = null;
        boolean z = true;
        while (z) {
            int iU = compositeDecoderB.u(b);
            if (iU == -1) {
                z = false;
            } else if (iU == 0) {
                D = compositeDecoderB.D(b, 0);
                i |= 1;
            } else if (iU == 1) {
                D2 = compositeDecoderB.D(b, 1);
                i |= 2;
            } else if (iU == 2) {
                D3 = compositeDecoderB.D(b, 2);
                i |= 4;
            } else if (iU == 3) {
                locationReportCoordinate = (LocationReportCoordinate) compositeDecoderB.k(b, 3, LocationReportCoordinate$$serializer.INSTANCE, locationReportCoordinate);
                i |= 8;
            } else {
                if (iU != 4) {
                    throw new UnknownFieldException(iU);
                }
                zB = compositeDecoderB.B(b, 4);
                i |= 16;
            }
        }
        compositeDecoderB.c(b);
        return new LocationReportStartPosition(i, D, D2, D3, locationReportCoordinate, zB, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull LocationReportStartPosition value) {
        Intrinsics.h(encoder, "encoder");
        Intrinsics.h(value, "value");
        SerialDescriptor b = getB();
        CompositeEncoder compositeEncoderB = encoder.b(b);
        LocationReportStartPosition.write$Self$service_positioning_engine_publishRelease(value, compositeEncoderB, b);
        compositeEncoderB.c(b);
    }
}
