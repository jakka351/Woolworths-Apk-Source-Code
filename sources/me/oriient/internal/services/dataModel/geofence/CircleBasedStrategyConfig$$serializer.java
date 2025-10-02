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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"me/oriient/internal/services/dataModel/geofence/CircleBasedStrategyConfig.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lme/oriient/internal/services/dataModel/geofence/CircleBasedStrategyConfig;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated
/* loaded from: classes7.dex */
public final class CircleBasedStrategyConfig$$serializer implements GeneratedSerializer<CircleBasedStrategyConfig> {

    @NotNull
    public static final CircleBasedStrategyConfig$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        CircleBasedStrategyConfig$$serializer circleBasedStrategyConfig$$serializer = new CircleBasedStrategyConfig$$serializer();
        INSTANCE = circleBasedStrategyConfig$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("me.oriient.internal.services.dataModel.geofence.CircleBasedStrategyConfig", circleBasedStrategyConfig$$serializer, 6);
        pluginGeneratedSerialDescriptor.k("fetchRadiusMeters", false);
        pluginGeneratedSerialDescriptor.k("searchRadiusMeters", false);
        pluginGeneratedSerialDescriptor.k("periodicGeofenceCheckIntervalSeconds", false);
        pluginGeneratedSerialDescriptor.k("locationThrottlingDurationSeconds", false);
        pluginGeneratedSerialDescriptor.k("shouldMonitorAppStateForGeofencing", false);
        pluginGeneratedSerialDescriptor.k("appStateThrottlingDurationSeconds", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CircleBasedStrategyConfig$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        DoubleSerializer doubleSerializer = DoubleSerializer.f24792a;
        return new KSerializer[]{doubleSerializer, doubleSerializer, doubleSerializer, doubleSerializer, BooleanSerializer.f24779a, doubleSerializer};
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
    public CircleBasedStrategyConfig deserialize(@NotNull Decoder decoder) {
        Intrinsics.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getB();
        CompositeDecoder compositeDecoderB = decoder.b(descriptor2);
        int i = 0;
        boolean zB = false;
        double D = 0.0d;
        double D2 = 0.0d;
        double D3 = 0.0d;
        double D4 = 0.0d;
        double D5 = 0.0d;
        boolean z = true;
        while (z) {
            int iU = compositeDecoderB.u(descriptor2);
            switch (iU) {
                case -1:
                    z = false;
                    break;
                case 0:
                    D = compositeDecoderB.D(descriptor2, 0);
                    i |= 1;
                    break;
                case 1:
                    D2 = compositeDecoderB.D(descriptor2, 1);
                    i |= 2;
                    break;
                case 2:
                    D3 = compositeDecoderB.D(descriptor2, 2);
                    i |= 4;
                    break;
                case 3:
                    D4 = compositeDecoderB.D(descriptor2, 3);
                    i |= 8;
                    break;
                case 4:
                    zB = compositeDecoderB.B(descriptor2, 4);
                    i |= 16;
                    break;
                case 5:
                    D5 = compositeDecoderB.D(descriptor2, 5);
                    i |= 32;
                    break;
                default:
                    throw new UnknownFieldException(iU);
            }
        }
        compositeDecoderB.c(descriptor2);
        return new CircleBasedStrategyConfig(i, D, D2, D3, D4, zB, D5, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull CircleBasedStrategyConfig value) {
        Intrinsics.h(encoder, "encoder");
        Intrinsics.h(value, "value");
        SerialDescriptor descriptor2 = getB();
        CompositeEncoder compositeEncoderB = encoder.b(descriptor2);
        CircleBasedStrategyConfig.write$Self$internal_publishRelease(value, compositeEncoderB, descriptor2);
        compositeEncoderB.c(descriptor2);
    }
}
