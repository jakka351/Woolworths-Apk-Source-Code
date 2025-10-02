package me.oriient.internal.services.dataModel.navigation;

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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"me/oriient/internal/services/dataModel/navigation/NavigationConfigResponse.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lme/oriient/internal/services/dataModel/navigation/NavigationConfigResponse;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated
/* loaded from: classes7.dex */
public final class NavigationConfigResponse$$serializer implements GeneratedSerializer<NavigationConfigResponse> {

    @NotNull
    public static final NavigationConfigResponse$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        NavigationConfigResponse$$serializer navigationConfigResponse$$serializer = new NavigationConfigResponse$$serializer();
        INSTANCE = navigationConfigResponse$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("me.oriient.internal.services.dataModel.navigation.NavigationConfigResponse", navigationConfigResponse$$serializer, 11);
        pluginGeneratedSerialDescriptor.k("isNavigationDataPreloadingEnabled", true);
        pluginGeneratedSerialDescriptor.k("minDistanceToRecalculateNavRouteMeters", true);
        pluginGeneratedSerialDescriptor.k("shouldUseTailTrimming", true);
        pluginGeneratedSerialDescriptor.k("tailTrimming_maxPositionJumpMeters", true);
        pluginGeneratedSerialDescriptor.k("tailTrimming_AcceptableDistanceToRouteSegmentMeters", true);
        pluginGeneratedSerialDescriptor.k("tailTrimming_RouteSegmentLengthMeters", true);
        pluginGeneratedSerialDescriptor.k("tailTrimming_DistanceShrinkingRation", true);
        pluginGeneratedSerialDescriptor.k("tailTrimming_RouteRecalculationDistanceMeters", true);
        pluginGeneratedSerialDescriptor.k("tailTrimming_AllowFirstWaypointTrimming", true);
        pluginGeneratedSerialDescriptor.k("tailTrimming_FirstWaypointTrimmingMaxDistance", true);
        pluginGeneratedSerialDescriptor.k("minDistanceBetweenStartAndPosition", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private NavigationConfigResponse$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        BooleanSerializer booleanSerializer = BooleanSerializer.f24779a;
        KSerializer<?> kSerializerD = BuiltinSerializersKt.d(booleanSerializer);
        DoubleSerializer doubleSerializer = DoubleSerializer.f24792a;
        return new KSerializer[]{kSerializerD, BuiltinSerializersKt.d(doubleSerializer), BuiltinSerializersKt.d(booleanSerializer), BuiltinSerializersKt.d(doubleSerializer), BuiltinSerializersKt.d(doubleSerializer), BuiltinSerializersKt.d(doubleSerializer), BuiltinSerializersKt.d(doubleSerializer), BuiltinSerializersKt.d(doubleSerializer), BuiltinSerializersKt.d(booleanSerializer), BuiltinSerializersKt.d(doubleSerializer), BuiltinSerializersKt.d(doubleSerializer)};
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
    public NavigationConfigResponse deserialize(@NotNull Decoder decoder) {
        boolean z;
        Intrinsics.h(decoder, "decoder");
        SerialDescriptor b = getB();
        CompositeDecoder compositeDecoderB = decoder.b(b);
        Double d = null;
        Double d2 = null;
        Boolean bool = null;
        Double d3 = null;
        Boolean bool2 = null;
        Double d4 = null;
        Double d5 = null;
        Double d6 = null;
        Double d7 = null;
        Double d8 = null;
        Boolean bool3 = null;
        int i = 0;
        boolean z2 = true;
        while (z2) {
            int iU = compositeDecoderB.u(b);
            switch (iU) {
                case -1:
                    z2 = false;
                    continue;
                case 0:
                    z = z2;
                    bool = (Boolean) compositeDecoderB.k(b, 0, BooleanSerializer.f24779a, bool);
                    i |= 1;
                    break;
                case 1:
                    z = z2;
                    d3 = (Double) compositeDecoderB.k(b, 1, DoubleSerializer.f24792a, d3);
                    i |= 2;
                    break;
                case 2:
                    z = z2;
                    bool2 = (Boolean) compositeDecoderB.k(b, 2, BooleanSerializer.f24779a, bool2);
                    i |= 4;
                    break;
                case 3:
                    z = z2;
                    d4 = (Double) compositeDecoderB.k(b, 3, DoubleSerializer.f24792a, d4);
                    i |= 8;
                    break;
                case 4:
                    z = z2;
                    d5 = (Double) compositeDecoderB.k(b, 4, DoubleSerializer.f24792a, d5);
                    i |= 16;
                    break;
                case 5:
                    z = z2;
                    d6 = (Double) compositeDecoderB.k(b, 5, DoubleSerializer.f24792a, d6);
                    i |= 32;
                    break;
                case 6:
                    z = z2;
                    d7 = (Double) compositeDecoderB.k(b, 6, DoubleSerializer.f24792a, d7);
                    i |= 64;
                    break;
                case 7:
                    z = z2;
                    d8 = (Double) compositeDecoderB.k(b, 7, DoubleSerializer.f24792a, d8);
                    i |= 128;
                    break;
                case 8:
                    z = z2;
                    bool3 = (Boolean) compositeDecoderB.k(b, 8, BooleanSerializer.f24779a, bool3);
                    i |= 256;
                    break;
                case 9:
                    z = z2;
                    d = (Double) compositeDecoderB.k(b, 9, DoubleSerializer.f24792a, d);
                    i |= 512;
                    break;
                case 10:
                    z = z2;
                    d2 = (Double) compositeDecoderB.k(b, 10, DoubleSerializer.f24792a, d2);
                    i |= 1024;
                    break;
                default:
                    throw new UnknownFieldException(iU);
            }
            z2 = z;
        }
        compositeDecoderB.c(b);
        return new NavigationConfigResponse(i, bool, d3, bool2, d4, d5, d6, d7, d8, bool3, d, d2, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull NavigationConfigResponse value) {
        Intrinsics.h(encoder, "encoder");
        Intrinsics.h(value, "value");
        SerialDescriptor b = getB();
        CompositeEncoder compositeEncoderB = encoder.b(b);
        NavigationConfigResponse.write$Self$internal_publishRelease(value, compositeEncoderB, b);
        compositeEncoderB.c(b);
    }
}
