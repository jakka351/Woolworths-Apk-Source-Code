package me.oriient.internal.services.dataModel.geofence;

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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"me/oriient/internal/services/dataModel/geofence/GeofenceConfig.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lme/oriient/internal/services/dataModel/geofence/GeofenceConfig;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated
/* loaded from: classes7.dex */
public final class GeofenceConfig$$serializer implements GeneratedSerializer<GeofenceConfig> {

    @NotNull
    public static final GeofenceConfig$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        GeofenceConfig$$serializer geofenceConfig$$serializer = new GeofenceConfig$$serializer();
        INSTANCE = geofenceConfig$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("me.oriient.internal.services.dataModel.geofence.GeofenceConfig", geofenceConfig$$serializer, 7);
        pluginGeneratedSerialDescriptor.k("geofenceStabilityTimeLimitMillis", false);
        pluginGeneratedSerialDescriptor.k("circleConfig", false);
        pluginGeneratedSerialDescriptor.k("polygonConfig", false);
        pluginGeneratedSerialDescriptor.k("additionalPercentageToEnterGeofence", false);
        pluginGeneratedSerialDescriptor.k("usePolygonalGeofence", false);
        pluginGeneratedSerialDescriptor.k("geofenceFreshnessTimeLimitMillis", false);
        pluginGeneratedSerialDescriptor.k("geofencingRequiresHighAccuracy", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private GeofenceConfig$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        LongSerializer longSerializer = LongSerializer.f24804a;
        BooleanSerializer booleanSerializer = BooleanSerializer.f24779a;
        return new KSerializer[]{longSerializer, CircleBasedStrategyConfig$$serializer.INSTANCE, PolygonBasedStrategyConfig$$serializer.INSTANCE, DoubleSerializer.f24792a, booleanSerializer, longSerializer, booleanSerializer};
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
    public GeofenceConfig deserialize(@NotNull Decoder decoder) {
        Intrinsics.h(decoder, "decoder");
        SerialDescriptor b = getB();
        CompositeDecoder compositeDecoderB = decoder.b(b);
        int i = 0;
        boolean zB = false;
        boolean zB2 = false;
        long jF = 0;
        long jF2 = 0;
        CircleBasedStrategyConfig circleBasedStrategyConfig = null;
        PolygonBasedStrategyConfig polygonBasedStrategyConfig = null;
        double D = 0.0d;
        boolean z = true;
        while (z) {
            int iU = compositeDecoderB.u(b);
            switch (iU) {
                case -1:
                    z = false;
                    break;
                case 0:
                    jF = compositeDecoderB.f(b, 0);
                    i |= 1;
                    break;
                case 1:
                    circleBasedStrategyConfig = (CircleBasedStrategyConfig) compositeDecoderB.o(b, 1, CircleBasedStrategyConfig$$serializer.INSTANCE, circleBasedStrategyConfig);
                    i |= 2;
                    break;
                case 2:
                    polygonBasedStrategyConfig = (PolygonBasedStrategyConfig) compositeDecoderB.o(b, 2, PolygonBasedStrategyConfig$$serializer.INSTANCE, polygonBasedStrategyConfig);
                    i |= 4;
                    break;
                case 3:
                    D = compositeDecoderB.D(b, 3);
                    i |= 8;
                    break;
                case 4:
                    zB = compositeDecoderB.B(b, 4);
                    i |= 16;
                    break;
                case 5:
                    jF2 = compositeDecoderB.f(b, 5);
                    i |= 32;
                    break;
                case 6:
                    zB2 = compositeDecoderB.B(b, 6);
                    i |= 64;
                    break;
                default:
                    throw new UnknownFieldException(iU);
            }
        }
        compositeDecoderB.c(b);
        return new GeofenceConfig(i, jF, circleBasedStrategyConfig, polygonBasedStrategyConfig, D, zB, jF2, zB2, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull GeofenceConfig value) {
        Intrinsics.h(encoder, "encoder");
        Intrinsics.h(value, "value");
        SerialDescriptor b = getB();
        CompositeEncoder compositeEncoderB = encoder.b(b);
        GeofenceConfig.write$Self$internal_publishRelease(value, compositeEncoderB, b);
        compositeEncoderB.c(b);
    }
}
