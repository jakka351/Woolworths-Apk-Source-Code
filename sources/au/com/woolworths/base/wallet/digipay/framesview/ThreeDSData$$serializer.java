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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"au/com/woolworths/base/wallet/digipay/framesview/ThreeDSData.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lau/com/woolworths/base/wallet/digipay/framesview/ThreeDSData;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Deprecated
/* loaded from: classes3.dex */
public /* synthetic */ class ThreeDSData$$serializer implements GeneratedSerializer<ThreeDSData> {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreeDSData$$serializer f4692a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        ThreeDSData$$serializer threeDSData$$serializer = new ThreeDSData$$serializer();
        f4692a = threeDSData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("au.com.woolworths.base.wallet.digipay.framesview.ThreeDSData", threeDSData$$serializer, 6);
        pluginGeneratedSerialDescriptor.k("ActionCode", true);
        pluginGeneratedSerialDescriptor.k("ErrorDescription", true);
        pluginGeneratedSerialDescriptor.k("ErrorNumber", true);
        pluginGeneratedSerialDescriptor.k("Payment", true);
        pluginGeneratedSerialDescriptor.k("Validated", true);
        pluginGeneratedSerialDescriptor.k("data", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.f24821a;
        return new KSerializer[]{BuiltinSerializersKt.d(stringSerializer), BuiltinSerializersKt.d(stringSerializer), BuiltinSerializersKt.d(IntSerializer.f24800a), BuiltinSerializersKt.d(Payment$$serializer.f4682a), BuiltinSerializersKt.d(BooleanSerializer.f24779a), BuiltinSerializersKt.d(Data$$serializer.f4661a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderB = decoder.b(serialDescriptor);
        int i = 0;
        String str = null;
        String str2 = null;
        Integer num = null;
        Payment payment = null;
        Boolean bool = null;
        Data data = null;
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
                    num = (Integer) compositeDecoderB.k(serialDescriptor, 2, IntSerializer.f24800a, num);
                    i |= 4;
                    break;
                case 3:
                    payment = (Payment) compositeDecoderB.k(serialDescriptor, 3, Payment$$serializer.f4682a, payment);
                    i |= 8;
                    break;
                case 4:
                    bool = (Boolean) compositeDecoderB.k(serialDescriptor, 4, BooleanSerializer.f24779a, bool);
                    i |= 16;
                    break;
                case 5:
                    data = (Data) compositeDecoderB.k(serialDescriptor, 5, Data$$serializer.f4661a, data);
                    i |= 32;
                    break;
                default:
                    throw new UnknownFieldException(iU);
            }
        }
        compositeDecoderB.c(serialDescriptor);
        return new ThreeDSData(i, str, str2, num, payment, bool, data);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        ThreeDSData value = (ThreeDSData) obj;
        Intrinsics.h(value, "value");
        Data data = value.f;
        Boolean bool = value.e;
        Payment payment = value.d;
        Integer num = value.c;
        String str = value.b;
        String str2 = value.f4691a;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderB = encoder.b(serialDescriptor);
        if (compositeEncoderB.q(serialDescriptor, 0) || str2 != null) {
            compositeEncoderB.w(serialDescriptor, 0, StringSerializer.f24821a, str2);
        }
        if (compositeEncoderB.q(serialDescriptor, 1) || str != null) {
            compositeEncoderB.w(serialDescriptor, 1, StringSerializer.f24821a, str);
        }
        if (compositeEncoderB.q(serialDescriptor, 2) || num != null) {
            compositeEncoderB.w(serialDescriptor, 2, IntSerializer.f24800a, num);
        }
        if (compositeEncoderB.q(serialDescriptor, 3) || payment != null) {
            compositeEncoderB.w(serialDescriptor, 3, Payment$$serializer.f4682a, payment);
        }
        if (compositeEncoderB.q(serialDescriptor, 4) || bool != null) {
            compositeEncoderB.w(serialDescriptor, 4, BooleanSerializer.f24779a, bool);
        }
        if (compositeEncoderB.q(serialDescriptor, 5) || data != null) {
            compositeEncoderB.w(serialDescriptor, 5, Data$$serializer.f4661a, data);
        }
        compositeEncoderB.c(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f24815a;
    }
}
