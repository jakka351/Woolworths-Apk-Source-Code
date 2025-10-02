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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"au/com/woolworths/base/wallet/digipay/framesview/ExtendedData.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lau/com/woolworths/base/wallet/digipay/framesview/ExtendedData;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Deprecated
/* loaded from: classes3.dex */
public /* synthetic */ class ExtendedData$$serializer implements GeneratedSerializer<ExtendedData> {

    /* renamed from: a, reason: collision with root package name */
    public static final ExtendedData$$serializer f4670a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        ExtendedData$$serializer extendedData$$serializer = new ExtendedData$$serializer();
        f4670a = extendedData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("au.com.woolworths.base.wallet.digipay.framesview.ExtendedData", extendedData$$serializer, 7);
        pluginGeneratedSerialDescriptor.k("Amount", true);
        pluginGeneratedSerialDescriptor.k("CAVV", true);
        pluginGeneratedSerialDescriptor.k("CurrencyCode", true);
        pluginGeneratedSerialDescriptor.k("ECIFlag", true);
        pluginGeneratedSerialDescriptor.k("PAResStatus", true);
        pluginGeneratedSerialDescriptor.k("SignatureVerification", true);
        pluginGeneratedSerialDescriptor.k("ThreeDSVersion", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.f24821a;
        return new KSerializer[]{BuiltinSerializersKt.d(stringSerializer), BuiltinSerializersKt.d(stringSerializer), BuiltinSerializersKt.d(stringSerializer), BuiltinSerializersKt.d(stringSerializer), BuiltinSerializersKt.d(stringSerializer), BuiltinSerializersKt.d(stringSerializer), BuiltinSerializersKt.d(stringSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderB = decoder.b(serialDescriptor);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        boolean z = true;
        while (z) {
            int iU = compositeDecoderB.u(serialDescriptor);
            switch (iU) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) compositeDecoderB.k(serialDescriptor, 0, StringSerializer.f24821a, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) compositeDecoderB.k(serialDescriptor, 1, StringSerializer.f24821a, str2);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) compositeDecoderB.k(serialDescriptor, 2, StringSerializer.f24821a, str3);
                    i |= 4;
                    break;
                case 3:
                    str4 = (String) compositeDecoderB.k(serialDescriptor, 3, StringSerializer.f24821a, str4);
                    i |= 8;
                    break;
                case 4:
                    str5 = (String) compositeDecoderB.k(serialDescriptor, 4, StringSerializer.f24821a, str5);
                    i |= 16;
                    break;
                case 5:
                    str6 = (String) compositeDecoderB.k(serialDescriptor, 5, StringSerializer.f24821a, str6);
                    i |= 32;
                    break;
                case 6:
                    str7 = (String) compositeDecoderB.k(serialDescriptor, 6, StringSerializer.f24821a, str7);
                    i |= 64;
                    break;
                default:
                    throw new UnknownFieldException(iU);
            }
        }
        compositeDecoderB.c(serialDescriptor);
        return new ExtendedData(i, str, str2, str3, str4, str5, str6, str7);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        ExtendedData value = (ExtendedData) obj;
        Intrinsics.h(value, "value");
        String str = value.g;
        String str2 = value.f;
        String str3 = value.e;
        String str4 = value.d;
        String str5 = value.c;
        String str6 = value.b;
        String str7 = value.f4669a;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderB = encoder.b(serialDescriptor);
        if (compositeEncoderB.q(serialDescriptor, 0) || str7 != null) {
            compositeEncoderB.w(serialDescriptor, 0, StringSerializer.f24821a, str7);
        }
        if (compositeEncoderB.q(serialDescriptor, 1) || str6 != null) {
            compositeEncoderB.w(serialDescriptor, 1, StringSerializer.f24821a, str6);
        }
        if (compositeEncoderB.q(serialDescriptor, 2) || str5 != null) {
            compositeEncoderB.w(serialDescriptor, 2, StringSerializer.f24821a, str5);
        }
        if (compositeEncoderB.q(serialDescriptor, 3) || str4 != null) {
            compositeEncoderB.w(serialDescriptor, 3, StringSerializer.f24821a, str4);
        }
        if (compositeEncoderB.q(serialDescriptor, 4) || str3 != null) {
            compositeEncoderB.w(serialDescriptor, 4, StringSerializer.f24821a, str3);
        }
        if (compositeEncoderB.q(serialDescriptor, 5) || str2 != null) {
            compositeEncoderB.w(serialDescriptor, 5, StringSerializer.f24821a, str2);
        }
        if (compositeEncoderB.q(serialDescriptor, 6) || str != null) {
            compositeEncoderB.w(serialDescriptor, 6, StringSerializer.f24821a, str);
        }
        compositeEncoderB.c(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f24815a;
    }
}
