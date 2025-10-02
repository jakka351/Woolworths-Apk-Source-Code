package au.com.woolworths.base.wallet.digipay.framesview;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"au/com/woolworths/base/wallet/digipay/framesview/CardCaptureResponse.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lau/com/woolworths/base/wallet/digipay/framesview/CardCaptureResponse;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Deprecated
/* loaded from: classes3.dex */
public /* synthetic */ class CardCaptureResponse$$serializer implements GeneratedSerializer<CardCaptureResponse> {

    /* renamed from: a, reason: collision with root package name */
    public static final CardCaptureResponse$$serializer f4649a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        CardCaptureResponse$$serializer cardCaptureResponse$$serializer = new CardCaptureResponse$$serializer();
        f4649a = cardCaptureResponse$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("au.com.woolworths.base.wallet.digipay.framesview.CardCaptureResponse", cardCaptureResponse$$serializer, 8);
        pluginGeneratedSerialDescriptor.k("fraudResponse", true);
        pluginGeneratedSerialDescriptor.k("paymentInstrument", true);
        pluginGeneratedSerialDescriptor.k("status", true);
        pluginGeneratedSerialDescriptor.k("stepUpToken", true);
        pluginGeneratedSerialDescriptor.k("errorCode", true);
        pluginGeneratedSerialDescriptor.k("message", true);
        pluginGeneratedSerialDescriptor.k("token", true);
        pluginGeneratedSerialDescriptor.k("itemId", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = CardCaptureResponse.i;
        KSerializer kSerializerD = BuiltinSerializersKt.d(FraudResponse$$serializer.f4679a);
        KSerializer kSerializerD2 = BuiltinSerializersKt.d(PaymentInstrument$$serializer.f4686a);
        KSerializer kSerializerD3 = BuiltinSerializersKt.d(Status$$serializer.f4688a);
        StringSerializer stringSerializer = StringSerializer.f24821a;
        return new KSerializer[]{kSerializerD, kSerializerD2, kSerializerD3, BuiltinSerializersKt.d(stringSerializer), BuiltinSerializersKt.d((KSerializer) lazyArr[4].getD()), BuiltinSerializersKt.d(stringSerializer), BuiltinSerializersKt.d(stringSerializer), BuiltinSerializersKt.d(stringSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderB = decoder.b(serialDescriptor);
        Lazy[] lazyArr = CardCaptureResponse.i;
        FraudResponse fraudResponse = null;
        PaymentInstrument paymentInstrument = null;
        Status status = null;
        String str = null;
        ThreeDSError threeDSError = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i = 0;
        boolean z = true;
        while (z) {
            int iU = compositeDecoderB.u(serialDescriptor);
            switch (iU) {
                case -1:
                    z = false;
                    break;
                case 0:
                    fraudResponse = (FraudResponse) compositeDecoderB.k(serialDescriptor, 0, FraudResponse$$serializer.f4679a, fraudResponse);
                    i |= 1;
                    break;
                case 1:
                    paymentInstrument = (PaymentInstrument) compositeDecoderB.k(serialDescriptor, 1, PaymentInstrument$$serializer.f4686a, paymentInstrument);
                    i |= 2;
                    break;
                case 2:
                    status = (Status) compositeDecoderB.k(serialDescriptor, 2, Status$$serializer.f4688a, status);
                    i |= 4;
                    break;
                case 3:
                    str = (String) compositeDecoderB.k(serialDescriptor, 3, StringSerializer.f24821a, str);
                    i |= 8;
                    break;
                case 4:
                    threeDSError = (ThreeDSError) compositeDecoderB.k(serialDescriptor, 4, (DeserializationStrategy) lazyArr[4].getD(), threeDSError);
                    i |= 16;
                    break;
                case 5:
                    str2 = (String) compositeDecoderB.k(serialDescriptor, 5, StringSerializer.f24821a, str2);
                    i |= 32;
                    break;
                case 6:
                    str3 = (String) compositeDecoderB.k(serialDescriptor, 6, StringSerializer.f24821a, str3);
                    i |= 64;
                    break;
                case 7:
                    str4 = (String) compositeDecoderB.k(serialDescriptor, 7, StringSerializer.f24821a, str4);
                    i |= 128;
                    break;
                default:
                    throw new UnknownFieldException(iU);
            }
        }
        compositeDecoderB.c(serialDescriptor);
        return new CardCaptureResponse(i, fraudResponse, paymentInstrument, status, str, threeDSError, str2, str3, str4);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        CardCaptureResponse value = (CardCaptureResponse) obj;
        Intrinsics.h(value, "value");
        String str = value.h;
        String str2 = value.g;
        String str3 = value.f;
        ThreeDSError threeDSError = value.e;
        String str4 = value.d;
        Status status = value.c;
        PaymentInstrument paymentInstrument = value.b;
        FraudResponse fraudResponse = value.f4648a;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderB = encoder.b(serialDescriptor);
        Lazy[] lazyArr = CardCaptureResponse.i;
        if (compositeEncoderB.q(serialDescriptor, 0) || fraudResponse != null) {
            compositeEncoderB.w(serialDescriptor, 0, FraudResponse$$serializer.f4679a, fraudResponse);
        }
        if (compositeEncoderB.q(serialDescriptor, 1) || paymentInstrument != null) {
            compositeEncoderB.w(serialDescriptor, 1, PaymentInstrument$$serializer.f4686a, paymentInstrument);
        }
        if (compositeEncoderB.q(serialDescriptor, 2) || status != null) {
            compositeEncoderB.w(serialDescriptor, 2, Status$$serializer.f4688a, status);
        }
        if (compositeEncoderB.q(serialDescriptor, 3) || str4 != null) {
            compositeEncoderB.w(serialDescriptor, 3, StringSerializer.f24821a, str4);
        }
        if (compositeEncoderB.q(serialDescriptor, 4) || threeDSError != null) {
            compositeEncoderB.w(serialDescriptor, 4, (SerializationStrategy) lazyArr[4].getD(), threeDSError);
        }
        if (compositeEncoderB.q(serialDescriptor, 5) || str3 != null) {
            compositeEncoderB.w(serialDescriptor, 5, StringSerializer.f24821a, str3);
        }
        if (compositeEncoderB.q(serialDescriptor, 6) || str2 != null) {
            compositeEncoderB.w(serialDescriptor, 6, StringSerializer.f24821a, str2);
        }
        if (compositeEncoderB.q(serialDescriptor, 7) || str != null) {
            compositeEncoderB.w(serialDescriptor, 7, StringSerializer.f24821a, str);
        }
        compositeEncoderB.c(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f24815a;
    }
}
