package au.com.woolworths.base.wallet.digipay.framesview;

import androidx.compose.runtime.internal.StabilityInferred;
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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"au/com/woolworths/base/wallet/digipay/framesview/ThreeDSChallengeResponse.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lau/com/woolworths/base/wallet/digipay/framesview/ThreeDSChallengeResponse;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Deprecated
/* loaded from: classes3.dex */
public /* synthetic */ class ThreeDSChallengeResponse$$serializer implements GeneratedSerializer<ThreeDSChallengeResponse> {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreeDSChallengeResponse$$serializer f4690a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        ThreeDSChallengeResponse$$serializer threeDSChallengeResponse$$serializer = new ThreeDSChallengeResponse$$serializer();
        f4690a = threeDSChallengeResponse$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("au.com.woolworths.base.wallet.digipay.framesview.ThreeDSChallengeResponse", threeDSChallengeResponse$$serializer, 2);
        pluginGeneratedSerialDescriptor.k("challengeResponse", true);
        pluginGeneratedSerialDescriptor.k("threeDSData", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.d(ChallengeResponse$$serializer.f4657a), ThreeDSData$$serializer.f4692a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderB = decoder.b(serialDescriptor);
        ChallengeResponse challengeResponse = null;
        boolean z = true;
        int i = 0;
        ThreeDSData threeDSData = null;
        while (z) {
            int iU = compositeDecoderB.u(serialDescriptor);
            if (iU == -1) {
                z = false;
            } else if (iU == 0) {
                challengeResponse = (ChallengeResponse) compositeDecoderB.k(serialDescriptor, 0, ChallengeResponse$$serializer.f4657a, challengeResponse);
                i |= 1;
            } else {
                if (iU != 1) {
                    throw new UnknownFieldException(iU);
                }
                threeDSData = (ThreeDSData) compositeDecoderB.o(serialDescriptor, 1, ThreeDSData$$serializer.f4692a, threeDSData);
                i |= 2;
            }
        }
        compositeDecoderB.c(serialDescriptor);
        return new ThreeDSChallengeResponse(i, challengeResponse, threeDSData);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        ThreeDSChallengeResponse value = (ThreeDSChallengeResponse) obj;
        Intrinsics.h(value, "value");
        ChallengeResponse challengeResponse = value.f4689a;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderB = encoder.b(serialDescriptor);
        if (compositeEncoderB.q(serialDescriptor, 0) || challengeResponse != null) {
            compositeEncoderB.w(serialDescriptor, 0, ChallengeResponse$$serializer.f4657a, challengeResponse);
        }
        compositeEncoderB.F(serialDescriptor, 1, ThreeDSData$$serializer.f4692a, value.b);
        compositeEncoderB.c(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f24815a;
    }
}
