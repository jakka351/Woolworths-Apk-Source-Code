package me.oriient.internal.services.dataModel.geofence;

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
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"me/oriient/internal/services/dataModel/geofence/GeofenceConfigResponse.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lme/oriient/internal/services/dataModel/geofence/GeofenceConfigResponse;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated
/* loaded from: classes7.dex */
public final class GeofenceConfigResponse$$serializer implements GeneratedSerializer<GeofenceConfigResponse> {

    @NotNull
    public static final GeofenceConfigResponse$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        GeofenceConfigResponse$$serializer geofenceConfigResponse$$serializer = new GeofenceConfigResponse$$serializer();
        INSTANCE = geofenceConfigResponse$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("me.oriient.internal.services.dataModel.geofence.GeofenceConfigResponse", geofenceConfigResponse$$serializer, 12);
        pluginGeneratedSerialDescriptor.k("defaultBuildingsFetchRadius", true);
        pluginGeneratedSerialDescriptor.k("nearbyBuildingsSearchRadiusMeters", true);
        pluginGeneratedSerialDescriptor.k("periodicGeofenceCheckIntervalSeconds", true);
        pluginGeneratedSerialDescriptor.k("geofenceStabilityTimeLimitSeconds", true);
        pluginGeneratedSerialDescriptor.k("locationThrottlingDurationSeconds", true);
        pluginGeneratedSerialDescriptor.k("maximumLocationAccuracyToAutoStartMeters", true);
        pluginGeneratedSerialDescriptor.k("shouldMonitorAppStateForGeofencing", true);
        pluginGeneratedSerialDescriptor.k("appStateThrottlingDurationSeconds", true);
        pluginGeneratedSerialDescriptor.k("additionalPercentageToEnterGeofence", true);
        pluginGeneratedSerialDescriptor.k("usePolygonalGeofence", true);
        pluginGeneratedSerialDescriptor.k("geofenceFreshnessTimeLimitSeconds", true);
        pluginGeneratedSerialDescriptor.k("geofencingRequiresHighAccuracy", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private GeofenceConfigResponse$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        FloatSerializer floatSerializer = FloatSerializer.f24797a;
        KSerializer<?> kSerializerD = BuiltinSerializersKt.d(floatSerializer);
        KSerializer<?> kSerializerD2 = BuiltinSerializersKt.d(floatSerializer);
        DoubleSerializer doubleSerializer = DoubleSerializer.f24792a;
        KSerializer<?> kSerializerD3 = BuiltinSerializersKt.d(doubleSerializer);
        KSerializer<?> kSerializerD4 = BuiltinSerializersKt.d(doubleSerializer);
        KSerializer<?> kSerializerD5 = BuiltinSerializersKt.d(doubleSerializer);
        KSerializer<?> kSerializerD6 = BuiltinSerializersKt.d(doubleSerializer);
        BooleanSerializer booleanSerializer = BooleanSerializer.f24779a;
        return new KSerializer[]{kSerializerD, kSerializerD2, kSerializerD3, kSerializerD4, kSerializerD5, kSerializerD6, BuiltinSerializersKt.d(booleanSerializer), BuiltinSerializersKt.d(doubleSerializer), BuiltinSerializersKt.d(doubleSerializer), BuiltinSerializersKt.d(booleanSerializer), BuiltinSerializersKt.d(doubleSerializer), BuiltinSerializersKt.d(booleanSerializer)};
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
    public GeofenceConfigResponse deserialize(@NotNull Decoder decoder) {
        Float f;
        Intrinsics.h(decoder, "decoder");
        SerialDescriptor b = getB();
        CompositeDecoder compositeDecoderB = decoder.b(b);
        Boolean bool = null;
        Double d = null;
        Boolean bool2 = null;
        Float f2 = null;
        Float f3 = null;
        Double d2 = null;
        Double d3 = null;
        Double d4 = null;
        Double d5 = null;
        Boolean bool3 = null;
        Double d6 = null;
        Double d7 = null;
        int i = 0;
        boolean z = true;
        while (z) {
            int iU = compositeDecoderB.u(b);
            switch (iU) {
                case -1:
                    z = false;
                    i = i;
                    continue;
                case 0:
                    f2 = (Float) compositeDecoderB.k(b, 0, FloatSerializer.f24797a, f2);
                    i |= 1;
                    continue;
                case 1:
                    f = f2;
                    f3 = (Float) compositeDecoderB.k(b, 1, FloatSerializer.f24797a, f3);
                    i |= 2;
                    break;
                case 2:
                    f = f2;
                    d2 = (Double) compositeDecoderB.k(b, 2, DoubleSerializer.f24792a, d2);
                    i |= 4;
                    break;
                case 3:
                    f = f2;
                    d3 = (Double) compositeDecoderB.k(b, 3, DoubleSerializer.f24792a, d3);
                    i |= 8;
                    break;
                case 4:
                    f = f2;
                    d4 = (Double) compositeDecoderB.k(b, 4, DoubleSerializer.f24792a, d4);
                    i |= 16;
                    break;
                case 5:
                    f = f2;
                    d5 = (Double) compositeDecoderB.k(b, 5, DoubleSerializer.f24792a, d5);
                    i |= 32;
                    break;
                case 6:
                    f = f2;
                    bool3 = (Boolean) compositeDecoderB.k(b, 6, BooleanSerializer.f24779a, bool3);
                    i |= 64;
                    break;
                case 7:
                    f = f2;
                    d6 = (Double) compositeDecoderB.k(b, 7, DoubleSerializer.f24792a, d6);
                    i |= 128;
                    break;
                case 8:
                    f = f2;
                    d7 = (Double) compositeDecoderB.k(b, 8, DoubleSerializer.f24792a, d7);
                    i |= 256;
                    break;
                case 9:
                    f = f2;
                    bool = (Boolean) compositeDecoderB.k(b, 9, BooleanSerializer.f24779a, bool);
                    i |= 512;
                    break;
                case 10:
                    f = f2;
                    d = (Double) compositeDecoderB.k(b, 10, DoubleSerializer.f24792a, d);
                    i |= 1024;
                    break;
                case 11:
                    f = f2;
                    bool2 = (Boolean) compositeDecoderB.k(b, 11, BooleanSerializer.f24779a, bool2);
                    i |= 2048;
                    break;
                default:
                    throw new UnknownFieldException(iU);
            }
            f2 = f;
        }
        compositeDecoderB.c(b);
        return new GeofenceConfigResponse(i, f2, f3, d2, d3, d4, d5, bool3, d6, d7, bool, d, bool2, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull GeofenceConfigResponse value) {
        Intrinsics.h(encoder, "encoder");
        Intrinsics.h(value, "value");
        SerialDescriptor b = getB();
        CompositeEncoder compositeEncoderB = encoder.b(b);
        GeofenceConfigResponse.write$Self$internal_publishRelease(value, compositeEncoderB, b);
        compositeEncoderB.c(b);
    }
}
