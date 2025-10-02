package au.com.woolworths.base.wallet.digipay.framesview;

import androidx.compose.runtime.internal.StabilityInferred;
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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"au/com/woolworths/base/wallet/digipay/framesview/PaymentInstrument.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lau/com/woolworths/base/wallet/digipay/framesview/PaymentInstrument;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Deprecated
/* loaded from: classes3.dex */
public /* synthetic */ class PaymentInstrument$$serializer implements GeneratedSerializer<PaymentInstrument> {

    /* renamed from: a, reason: collision with root package name */
    public static final PaymentInstrument$$serializer f4686a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        PaymentInstrument$$serializer paymentInstrument$$serializer = new PaymentInstrument$$serializer();
        f4686a = paymentInstrument$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("au.com.woolworths.base.wallet.digipay.framesview.PaymentInstrument", paymentInstrument$$serializer, 10);
        pluginGeneratedSerialDescriptor.k("bin", false);
        pluginGeneratedSerialDescriptor.k("created", false);
        pluginGeneratedSerialDescriptor.k("expiryMonth", false);
        pluginGeneratedSerialDescriptor.k("expiryYear", false);
        pluginGeneratedSerialDescriptor.k("itemId", false);
        pluginGeneratedSerialDescriptor.k("nickname", false);
        pluginGeneratedSerialDescriptor.k("paymentToken", false);
        pluginGeneratedSerialDescriptor.k("scheme", false);
        pluginGeneratedSerialDescriptor.k("status", false);
        pluginGeneratedSerialDescriptor.k("suffix", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.f24821a;
        return new KSerializer[]{stringSerializer, LongSerializer.f24804a, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderB = decoder.b(serialDescriptor);
        int i = 0;
        String strJ = null;
        String strJ2 = null;
        String strJ3 = null;
        String strJ4 = null;
        String strJ5 = null;
        String strJ6 = null;
        String strJ7 = null;
        String strJ8 = null;
        String strJ9 = null;
        long jF = 0;
        boolean z = true;
        while (z) {
            int iU = compositeDecoderB.u(serialDescriptor);
            switch (iU) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strJ = compositeDecoderB.j(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    jF = compositeDecoderB.f(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    strJ2 = compositeDecoderB.j(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    strJ3 = compositeDecoderB.j(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    strJ4 = compositeDecoderB.j(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    strJ5 = compositeDecoderB.j(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    strJ6 = compositeDecoderB.j(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    strJ7 = compositeDecoderB.j(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    strJ8 = compositeDecoderB.j(serialDescriptor, 8);
                    i |= 256;
                    break;
                case 9:
                    strJ9 = compositeDecoderB.j(serialDescriptor, 9);
                    i |= 512;
                    break;
                default:
                    throw new UnknownFieldException(iU);
            }
        }
        compositeDecoderB.c(serialDescriptor);
        return new PaymentInstrument(i, strJ, jF, strJ2, strJ3, strJ4, strJ5, strJ6, strJ7, strJ8, strJ9);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        PaymentInstrument value = (PaymentInstrument) obj;
        Intrinsics.h(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderB = encoder.b(serialDescriptor);
        compositeEncoderB.p(serialDescriptor, 0, value.f4685a);
        compositeEncoderB.t(serialDescriptor, 1, value.b);
        compositeEncoderB.p(serialDescriptor, 2, value.c);
        compositeEncoderB.p(serialDescriptor, 3, value.d);
        compositeEncoderB.p(serialDescriptor, 4, value.e);
        compositeEncoderB.p(serialDescriptor, 5, value.f);
        compositeEncoderB.p(serialDescriptor, 6, value.g);
        compositeEncoderB.p(serialDescriptor, 7, value.h);
        compositeEncoderB.p(serialDescriptor, 8, value.i);
        compositeEncoderB.p(serialDescriptor, 9, value.j);
        compositeEncoderB.c(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f24815a;
    }
}
