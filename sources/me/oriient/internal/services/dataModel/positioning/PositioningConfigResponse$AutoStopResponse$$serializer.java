package me.oriient.internal.services.dataModel.positioning;

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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import me.oriient.internal.services.dataModel.positioning.PositioningConfigResponse;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"me/oriient/internal/services/dataModel/positioning/PositioningConfigResponse.AutoStopResponse.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lme/oriient/internal/services/dataModel/positioning/PositioningConfigResponse$AutoStopResponse;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated
/* loaded from: classes7.dex */
public final class PositioningConfigResponse$AutoStopResponse$$serializer implements GeneratedSerializer<PositioningConfigResponse.AutoStopResponse> {

    @NotNull
    public static final PositioningConfigResponse$AutoStopResponse$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        PositioningConfigResponse$AutoStopResponse$$serializer positioningConfigResponse$AutoStopResponse$$serializer = new PositioningConfigResponse$AutoStopResponse$$serializer();
        INSTANCE = positioningConfigResponse$AutoStopResponse$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("me.oriient.internal.services.dataModel.positioning.PositioningConfigResponse.AutoStopResponse", positioningConfigResponse$AutoStopResponse$$serializer, 13);
        pluginGeneratedSerialDescriptor.k("useBuildingGeofence", true);
        pluginGeneratedSerialDescriptor.k("useExternalRegion", true);
        pluginGeneratedSerialDescriptor.k("useExitRegions", true);
        pluginGeneratedSerialDescriptor.k("useCharging", true);
        pluginGeneratedSerialDescriptor.k("geofenceMaxDistanceMeters", true);
        pluginGeneratedSerialDescriptor.k("externalRegionSlidingWindowSize", true);
        pluginGeneratedSerialDescriptor.k("externalMaxDistanceFromBuildingMeters", true);
        pluginGeneratedSerialDescriptor.k("externalRequiredConsistentAttemptsToStop", true);
        pluginGeneratedSerialDescriptor.k("downloadExitRegionsRetryInterval", true);
        pluginGeneratedSerialDescriptor.k("downloadExitRegionsRetryCount", true);
        pluginGeneratedSerialDescriptor.k("exitRegionTriggerType", true);
        pluginGeneratedSerialDescriptor.k("exitRegionDwellTime", true);
        pluginGeneratedSerialDescriptor.k("exitRegionCooldownTime", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PositioningConfigResponse$AutoStopResponse$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        BooleanSerializer booleanSerializer = BooleanSerializer.f24779a;
        KSerializer<?> kSerializerD = BuiltinSerializersKt.d(booleanSerializer);
        KSerializer<?> kSerializerD2 = BuiltinSerializersKt.d(booleanSerializer);
        KSerializer<?> kSerializerD3 = BuiltinSerializersKt.d(booleanSerializer);
        KSerializer<?> kSerializerD4 = BuiltinSerializersKt.d(booleanSerializer);
        DoubleSerializer doubleSerializer = DoubleSerializer.f24792a;
        KSerializer<?> kSerializerD5 = BuiltinSerializersKt.d(doubleSerializer);
        IntSerializer intSerializer = IntSerializer.f24800a;
        return new KSerializer[]{kSerializerD, kSerializerD2, kSerializerD3, kSerializerD4, kSerializerD5, BuiltinSerializersKt.d(intSerializer), BuiltinSerializersKt.d(doubleSerializer), BuiltinSerializersKt.d(intSerializer), BuiltinSerializersKt.d(doubleSerializer), BuiltinSerializersKt.d(intSerializer), BuiltinSerializersKt.d(StringSerializer.f24821a), BuiltinSerializersKt.d(doubleSerializer), BuiltinSerializersKt.d(doubleSerializer)};
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
    public PositioningConfigResponse.AutoStopResponse deserialize(@NotNull Decoder decoder) {
        Boolean bool;
        Double d;
        Intrinsics.h(decoder, "decoder");
        SerialDescriptor b = getB();
        CompositeDecoder compositeDecoderB = decoder.b(b);
        Integer num = null;
        Double d2 = null;
        String str = null;
        Double d3 = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        Boolean bool5 = null;
        Double d4 = null;
        Integer num2 = null;
        Double d5 = null;
        Integer num3 = null;
        Double d6 = null;
        int i = 0;
        boolean z = true;
        while (z) {
            Boolean bool6 = bool2;
            int iU = compositeDecoderB.u(b);
            switch (iU) {
                case -1:
                    d = d2;
                    bool2 = bool6;
                    z = false;
                    i = i;
                    d2 = d;
                case 0:
                    d = d2;
                    bool2 = (Boolean) compositeDecoderB.k(b, 0, BooleanSerializer.f24779a, bool6);
                    i |= 1;
                    d2 = d;
                case 1:
                    bool3 = (Boolean) compositeDecoderB.k(b, 1, BooleanSerializer.f24779a, bool3);
                    i |= 2;
                    bool2 = bool6;
                case 2:
                    bool = bool3;
                    bool4 = (Boolean) compositeDecoderB.k(b, 2, BooleanSerializer.f24779a, bool4);
                    i |= 4;
                    bool2 = bool6;
                    bool3 = bool;
                case 3:
                    bool = bool3;
                    bool5 = (Boolean) compositeDecoderB.k(b, 3, BooleanSerializer.f24779a, bool5);
                    i |= 8;
                    bool2 = bool6;
                    bool3 = bool;
                case 4:
                    bool = bool3;
                    d4 = (Double) compositeDecoderB.k(b, 4, DoubleSerializer.f24792a, d4);
                    i |= 16;
                    bool2 = bool6;
                    bool3 = bool;
                case 5:
                    bool = bool3;
                    num2 = (Integer) compositeDecoderB.k(b, 5, IntSerializer.f24800a, num2);
                    i |= 32;
                    bool2 = bool6;
                    bool3 = bool;
                case 6:
                    bool = bool3;
                    d5 = (Double) compositeDecoderB.k(b, 6, DoubleSerializer.f24792a, d5);
                    i |= 64;
                    bool2 = bool6;
                    bool3 = bool;
                case 7:
                    bool = bool3;
                    num3 = (Integer) compositeDecoderB.k(b, 7, IntSerializer.f24800a, num3);
                    i |= 128;
                    bool2 = bool6;
                    bool3 = bool;
                case 8:
                    bool = bool3;
                    d6 = (Double) compositeDecoderB.k(b, 8, DoubleSerializer.f24792a, d6);
                    i |= 256;
                    bool2 = bool6;
                    bool3 = bool;
                case 9:
                    bool = bool3;
                    num = (Integer) compositeDecoderB.k(b, 9, IntSerializer.f24800a, num);
                    i |= 512;
                    bool2 = bool6;
                    bool3 = bool;
                case 10:
                    bool = bool3;
                    str = (String) compositeDecoderB.k(b, 10, StringSerializer.f24821a, str);
                    i |= 1024;
                    bool2 = bool6;
                    bool3 = bool;
                case 11:
                    bool = bool3;
                    d3 = (Double) compositeDecoderB.k(b, 11, DoubleSerializer.f24792a, d3);
                    i |= 2048;
                    bool2 = bool6;
                    bool3 = bool;
                case 12:
                    bool = bool3;
                    d2 = (Double) compositeDecoderB.k(b, 12, DoubleSerializer.f24792a, d2);
                    i |= 4096;
                    bool2 = bool6;
                    bool3 = bool;
                default:
                    throw new UnknownFieldException(iU);
            }
        }
        compositeDecoderB.c(b);
        return new PositioningConfigResponse.AutoStopResponse(i, bool2, bool3, bool4, bool5, d4, num2, d5, num3, d6, num, str, d3, d2, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull PositioningConfigResponse.AutoStopResponse value) {
        Intrinsics.h(encoder, "encoder");
        Intrinsics.h(value, "value");
        SerialDescriptor b = getB();
        CompositeEncoder compositeEncoderB = encoder.b(b);
        PositioningConfigResponse.AutoStopResponse.write$Self$internal_publishRelease(value, compositeEncoderB, b);
        compositeEncoderB.c(b);
    }
}
