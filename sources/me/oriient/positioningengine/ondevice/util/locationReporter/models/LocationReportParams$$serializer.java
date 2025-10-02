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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"me/oriient/positioningengine/ondevice/util/locationReporter/models/LocationReportParams.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lme/oriient/positioningengine/ondevice/util/locationReporter/models/LocationReportParams;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated
/* loaded from: classes8.dex */
public final class LocationReportParams$$serializer implements GeneratedSerializer<LocationReportParams> {

    @NotNull
    public static final LocationReportParams$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        LocationReportParams$$serializer locationReportParams$$serializer = new LocationReportParams$$serializer();
        INSTANCE = locationReportParams$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("me.oriient.positioningengine.ondevice.util.locationReporter.models.LocationReportParams", locationReportParams$$serializer, 10);
        pluginGeneratedSerialDescriptor.k("spaceId", false);
        pluginGeneratedSerialDescriptor.k("buildingId", false);
        pluginGeneratedSerialDescriptor.k("floorId", false);
        pluginGeneratedSerialDescriptor.k("mapId", false);
        pluginGeneratedSerialDescriptor.k("startTime", false);
        pluginGeneratedSerialDescriptor.k("isOutOfGeofence", false);
        pluginGeneratedSerialDescriptor.k("sessionId", false);
        pluginGeneratedSerialDescriptor.k("startPosition", false);
        pluginGeneratedSerialDescriptor.k("senderId", false);
        pluginGeneratedSerialDescriptor.k("senderName", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private LocationReportParams$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.f24821a;
        return new KSerializer[]{stringSerializer, stringSerializer, BuiltinSerializersKt.d(stringSerializer), BuiltinSerializersKt.d(stringSerializer), stringSerializer, BooleanSerializer.f24779a, stringSerializer, BuiltinSerializersKt.d(LocationReportStartPosition$$serializer.INSTANCE), stringSerializer, stringSerializer};
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
    public LocationReportParams deserialize(@NotNull Decoder decoder) {
        Intrinsics.h(decoder, "decoder");
        SerialDescriptor b = getB();
        CompositeDecoder compositeDecoderB = decoder.b(b);
        String strJ = null;
        String strJ2 = null;
        String str = null;
        String str2 = null;
        String strJ3 = null;
        String strJ4 = null;
        LocationReportStartPosition locationReportStartPosition = null;
        String strJ5 = null;
        String strJ6 = null;
        int i = 0;
        boolean zB = false;
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
                    str = (String) compositeDecoderB.k(b, 2, StringSerializer.f24821a, str);
                    i |= 4;
                    break;
                case 3:
                    str2 = (String) compositeDecoderB.k(b, 3, StringSerializer.f24821a, str2);
                    i |= 8;
                    break;
                case 4:
                    strJ3 = compositeDecoderB.j(b, 4);
                    i |= 16;
                    break;
                case 5:
                    zB = compositeDecoderB.B(b, 5);
                    i |= 32;
                    break;
                case 6:
                    strJ4 = compositeDecoderB.j(b, 6);
                    i |= 64;
                    break;
                case 7:
                    locationReportStartPosition = (LocationReportStartPosition) compositeDecoderB.k(b, 7, LocationReportStartPosition$$serializer.INSTANCE, locationReportStartPosition);
                    i |= 128;
                    break;
                case 8:
                    strJ5 = compositeDecoderB.j(b, 8);
                    i |= 256;
                    break;
                case 9:
                    strJ6 = compositeDecoderB.j(b, 9);
                    i |= 512;
                    break;
                default:
                    throw new UnknownFieldException(iU);
            }
        }
        compositeDecoderB.c(b);
        return new LocationReportParams(i, strJ, strJ2, str, str2, strJ3, zB, strJ4, locationReportStartPosition, strJ5, strJ6, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull LocationReportParams value) {
        Intrinsics.h(encoder, "encoder");
        Intrinsics.h(value, "value");
        SerialDescriptor b = getB();
        CompositeEncoder compositeEncoderB = encoder.b(b);
        LocationReportParams.write$Self$service_positioning_engine_publishRelease(value, compositeEncoderB, b);
        compositeEncoderB.c(b);
    }
}
