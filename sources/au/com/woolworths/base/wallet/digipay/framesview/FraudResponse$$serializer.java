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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"au/com/woolworths/base/wallet/digipay/framesview/FraudResponse.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lau/com/woolworths/base/wallet/digipay/framesview/FraudResponse;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Deprecated
/* loaded from: classes3.dex */
public /* synthetic */ class FraudResponse$$serializer implements GeneratedSerializer<FraudResponse> {

    /* renamed from: a, reason: collision with root package name */
    public static final FraudResponse$$serializer f4679a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        FraudResponse$$serializer fraudResponse$$serializer = new FraudResponse$$serializer();
        f4679a = fraudResponse$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("au.com.woolworths.base.wallet.digipay.framesview.FraudResponse", fraudResponse$$serializer, 3);
        pluginGeneratedSerialDescriptor.k("fraudClientId", true);
        pluginGeneratedSerialDescriptor.k("fraudDecision", true);
        pluginGeneratedSerialDescriptor.k("fraudReasonCd", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.f24821a;
        return new KSerializer[]{BuiltinSerializersKt.d(stringSerializer), BuiltinSerializersKt.d(stringSerializer), BuiltinSerializersKt.d(stringSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderB = decoder.b(serialDescriptor);
        String str = null;
        boolean z = true;
        int i = 0;
        String str2 = null;
        String str3 = null;
        while (z) {
            int iU = compositeDecoderB.u(serialDescriptor);
            if (iU == -1) {
                z = false;
            } else if (iU == 0) {
                str = (String) compositeDecoderB.k(serialDescriptor, 0, StringSerializer.f24821a, str);
                i |= 1;
            } else if (iU == 1) {
                str2 = (String) compositeDecoderB.k(serialDescriptor, 1, StringSerializer.f24821a, str2);
                i |= 2;
            } else {
                if (iU != 2) {
                    throw new UnknownFieldException(iU);
                }
                str3 = (String) compositeDecoderB.k(serialDescriptor, 2, StringSerializer.f24821a, str3);
                i |= 4;
            }
        }
        compositeDecoderB.c(serialDescriptor);
        return new FraudResponse(i, str, str2, str3);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        FraudResponse value = (FraudResponse) obj;
        Intrinsics.h(value, "value");
        String str = value.c;
        String str2 = value.b;
        String str3 = value.f4678a;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderB = encoder.b(serialDescriptor);
        if (compositeEncoderB.q(serialDescriptor, 0) || str3 != null) {
            compositeEncoderB.w(serialDescriptor, 0, StringSerializer.f24821a, str3);
        }
        if (compositeEncoderB.q(serialDescriptor, 1) || str2 != null) {
            compositeEncoderB.w(serialDescriptor, 1, StringSerializer.f24821a, str2);
        }
        if (compositeEncoderB.q(serialDescriptor, 2) || str != null) {
            compositeEncoderB.w(serialDescriptor, 2, StringSerializer.f24821a, str);
        }
        compositeEncoderB.c(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f24815a;
    }
}
