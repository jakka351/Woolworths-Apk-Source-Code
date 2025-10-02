package me.oriient.internal.services.dataModel.navigation.turnByTurn;

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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"me/oriient/internal/services/dataModel/navigation/turnByTurn/TurnByTurnConfigResponse.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lme/oriient/internal/services/dataModel/navigation/turnByTurn/TurnByTurnConfigResponse;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated
/* loaded from: classes7.dex */
public final class TurnByTurnConfigResponse$$serializer implements GeneratedSerializer<TurnByTurnConfigResponse> {

    @NotNull
    public static final TurnByTurnConfigResponse$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        TurnByTurnConfigResponse$$serializer turnByTurnConfigResponse$$serializer = new TurnByTurnConfigResponse$$serializer();
        INSTANCE = turnByTurnConfigResponse$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("me.oriient.internal.services.dataModel.navigation.turnByTurn.TurnByTurnConfigResponse", turnByTurnConfigResponse$$serializer, 15);
        pluginGeneratedSerialDescriptor.k("minimumDistanceToArriveMeters", true);
        pluginGeneratedSerialDescriptor.k("minimumDistanceToStraightInstructionMeters", true);
        pluginGeneratedSerialDescriptor.k("distanceToTurnAfterStraightInstructionMeters", true);
        pluginGeneratedSerialDescriptor.k("distanceForTurnAroundInstructionMeters", true);
        pluginGeneratedSerialDescriptor.k("maximumDegreesForTurnCalculationLimit", true);
        pluginGeneratedSerialDescriptor.k("lastUnnecessaryDistanceTurnInMeters", true);
        pluginGeneratedSerialDescriptor.k("sameDirectionTurnsSkipMinLengthMeters", true);
        pluginGeneratedSerialDescriptor.k("sameDirectionTurnsSkipMinAngleDegrees", true);
        pluginGeneratedSerialDescriptor.k("sameDirectionTurnsSkipMaxAngleDegrees", true);
        pluginGeneratedSerialDescriptor.k("oppositeDirectionTurnsSkipMinLengthMeters", true);
        pluginGeneratedSerialDescriptor.k("oppositeDirectionTurnsSkipAngleDegrees", true);
        pluginGeneratedSerialDescriptor.k("maxTurnAroundEdgeValueDegrees", true);
        pluginGeneratedSerialDescriptor.k("minTurnAroundEdgeValueDegrees", true);
        pluginGeneratedSerialDescriptor.k("turnAroundUpdateDelayTime", true);
        pluginGeneratedSerialDescriptor.k("turnAroundSwitchToNoTurnAroundStateDelayTime", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TurnByTurnConfigResponse$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        DoubleSerializer doubleSerializer = DoubleSerializer.f24792a;
        return new KSerializer[]{BuiltinSerializersKt.d(doubleSerializer), BuiltinSerializersKt.d(doubleSerializer), BuiltinSerializersKt.d(doubleSerializer), BuiltinSerializersKt.d(doubleSerializer), BuiltinSerializersKt.d(doubleSerializer), BuiltinSerializersKt.d(doubleSerializer), BuiltinSerializersKt.d(doubleSerializer), BuiltinSerializersKt.d(doubleSerializer), BuiltinSerializersKt.d(doubleSerializer), BuiltinSerializersKt.d(doubleSerializer), BuiltinSerializersKt.d(doubleSerializer), BuiltinSerializersKt.d(doubleSerializer), BuiltinSerializersKt.d(doubleSerializer), BuiltinSerializersKt.d(doubleSerializer), BuiltinSerializersKt.d(doubleSerializer)};
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
    public TurnByTurnConfigResponse deserialize(@NotNull Decoder decoder) {
        Double d;
        Double d2;
        Double d3;
        Double d4;
        Double d5;
        Double d6;
        Intrinsics.h(decoder, "decoder");
        SerialDescriptor b = getB();
        CompositeDecoder compositeDecoderB = decoder.b(b);
        Double d7 = null;
        Double d8 = null;
        Double d9 = null;
        Double d10 = null;
        Double d11 = null;
        Double d12 = null;
        Double d13 = null;
        Double d14 = null;
        Double d15 = null;
        Double d16 = null;
        Double d17 = null;
        Double d18 = null;
        Double d19 = null;
        Double d20 = null;
        Double d21 = null;
        int i = 0;
        boolean z = true;
        while (z) {
            Double d22 = d13;
            int iU = compositeDecoderB.u(b);
            switch (iU) {
                case -1:
                    d = d8;
                    d2 = d14;
                    d3 = d21;
                    d4 = d9;
                    z = false;
                    d9 = d4;
                    d13 = d22;
                    d8 = d;
                    d21 = d3;
                    d14 = d2;
                case 0:
                    d = d8;
                    d2 = d14;
                    d3 = d21;
                    d4 = d9;
                    d20 = (Double) compositeDecoderB.k(b, 0, DoubleSerializer.f24792a, d20);
                    i |= 1;
                    d9 = d4;
                    d13 = d22;
                    d8 = d;
                    d21 = d3;
                    d14 = d2;
                case 1:
                    d5 = d8;
                    d6 = d14;
                    d21 = (Double) compositeDecoderB.k(b, 1, DoubleSerializer.f24792a, d21);
                    i |= 2;
                    d13 = d22;
                    d14 = d6;
                    d8 = d5;
                case 2:
                    d5 = d8;
                    d6 = d14;
                    d13 = (Double) compositeDecoderB.k(b, 2, DoubleSerializer.f24792a, d22);
                    i |= 4;
                    d14 = d6;
                    d8 = d5;
                case 3:
                    d5 = d8;
                    d14 = (Double) compositeDecoderB.k(b, 3, DoubleSerializer.f24792a, d14);
                    i |= 8;
                    d13 = d22;
                    d8 = d5;
                case 4:
                    d2 = d14;
                    d15 = (Double) compositeDecoderB.k(b, 4, DoubleSerializer.f24792a, d15);
                    i |= 16;
                    d13 = d22;
                    d14 = d2;
                case 5:
                    d2 = d14;
                    d16 = (Double) compositeDecoderB.k(b, 5, DoubleSerializer.f24792a, d16);
                    i |= 32;
                    d13 = d22;
                    d14 = d2;
                case 6:
                    d2 = d14;
                    d17 = (Double) compositeDecoderB.k(b, 6, DoubleSerializer.f24792a, d17);
                    i |= 64;
                    d13 = d22;
                    d14 = d2;
                case 7:
                    d2 = d14;
                    d18 = (Double) compositeDecoderB.k(b, 7, DoubleSerializer.f24792a, d18);
                    i |= 128;
                    d13 = d22;
                    d14 = d2;
                case 8:
                    d2 = d14;
                    d19 = (Double) compositeDecoderB.k(b, 8, DoubleSerializer.f24792a, d19);
                    i |= 256;
                    d13 = d22;
                    d14 = d2;
                case 9:
                    d2 = d14;
                    d7 = (Double) compositeDecoderB.k(b, 9, DoubleSerializer.f24792a, d7);
                    i |= 512;
                    d13 = d22;
                    d14 = d2;
                case 10:
                    d2 = d14;
                    d10 = (Double) compositeDecoderB.k(b, 10, DoubleSerializer.f24792a, d10);
                    i |= 1024;
                    d13 = d22;
                    d14 = d2;
                case 11:
                    d2 = d14;
                    d11 = (Double) compositeDecoderB.k(b, 11, DoubleSerializer.f24792a, d11);
                    i |= 2048;
                    d13 = d22;
                    d14 = d2;
                case 12:
                    d2 = d14;
                    d9 = (Double) compositeDecoderB.k(b, 12, DoubleSerializer.f24792a, d9);
                    i |= 4096;
                    d13 = d22;
                    d14 = d2;
                case 13:
                    d2 = d14;
                    d8 = (Double) compositeDecoderB.k(b, 13, DoubleSerializer.f24792a, d8);
                    i |= 8192;
                    d13 = d22;
                    d14 = d2;
                case 14:
                    d2 = d14;
                    d12 = (Double) compositeDecoderB.k(b, 14, DoubleSerializer.f24792a, d12);
                    i |= 16384;
                    d13 = d22;
                    d14 = d2;
                default:
                    throw new UnknownFieldException(iU);
            }
        }
        Double d23 = d8;
        Double d24 = d14;
        compositeDecoderB.c(b);
        return new TurnByTurnConfigResponse(i, d20, d21, d13, d24, d15, d16, d17, d18, d19, d7, d10, d11, d9, d23, d12, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull TurnByTurnConfigResponse value) {
        Intrinsics.h(encoder, "encoder");
        Intrinsics.h(value, "value");
        SerialDescriptor b = getB();
        CompositeEncoder compositeEncoderB = encoder.b(b);
        TurnByTurnConfigResponse.write$Self$internal_publishRelease(value, compositeEncoderB, b);
        compositeEncoderB.c(b);
    }
}
