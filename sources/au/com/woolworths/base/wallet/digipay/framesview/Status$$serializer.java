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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"au/com/woolworths/base/wallet/digipay/framesview/Status.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lau/com/woolworths/base/wallet/digipay/framesview/Status;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Deprecated
/* loaded from: classes3.dex */
public /* synthetic */ class Status$$serializer implements GeneratedSerializer<Status> {

    /* renamed from: a, reason: collision with root package name */
    public static final Status$$serializer f4688a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        Status$$serializer status$$serializer = new Status$$serializer();
        f4688a = status$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("au.com.woolworths.base.wallet.digipay.framesview.Status", status$$serializer, 6);
        pluginGeneratedSerialDescriptor.k("auditID", false);
        pluginGeneratedSerialDescriptor.k("error", true);
        pluginGeneratedSerialDescriptor.k("esResponse", true);
        pluginGeneratedSerialDescriptor.k("responseCode", false);
        pluginGeneratedSerialDescriptor.k("responseText", false);
        pluginGeneratedSerialDescriptor.k("txnTime", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerD = BuiltinSerializersKt.d(ErrorDescription$$serializer.f4668a);
        KSerializer kSerializerD2 = BuiltinSerializersKt.d(ESResponse$$serializer.f4663a);
        StringSerializer stringSerializer = StringSerializer.f24821a;
        return new KSerializer[]{stringSerializer, kSerializerD, kSerializerD2, stringSerializer, stringSerializer, LongSerializer.f24804a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderB = decoder.b(serialDescriptor);
        int i = 0;
        String strJ = null;
        ErrorDescription errorDescription = null;
        ESResponse eSResponse = null;
        String strJ2 = null;
        String strJ3 = null;
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
                    errorDescription = (ErrorDescription) compositeDecoderB.k(serialDescriptor, 1, ErrorDescription$$serializer.f4668a, errorDescription);
                    i |= 2;
                    break;
                case 2:
                    eSResponse = (ESResponse) compositeDecoderB.k(serialDescriptor, 2, ESResponse$$serializer.f4663a, eSResponse);
                    i |= 4;
                    break;
                case 3:
                    strJ2 = compositeDecoderB.j(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    strJ3 = compositeDecoderB.j(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    jF = compositeDecoderB.f(serialDescriptor, 5);
                    i |= 32;
                    break;
                default:
                    throw new UnknownFieldException(iU);
            }
        }
        compositeDecoderB.c(serialDescriptor);
        return new Status(i, strJ, errorDescription, eSResponse, strJ2, strJ3, jF);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        Status value = (Status) obj;
        Intrinsics.h(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderB = encoder.b(serialDescriptor);
        String str = value.f4687a;
        ESResponse eSResponse = value.c;
        ErrorDescription errorDescription = value.b;
        compositeEncoderB.p(serialDescriptor, 0, str);
        if (compositeEncoderB.q(serialDescriptor, 1) || errorDescription != null) {
            compositeEncoderB.w(serialDescriptor, 1, ErrorDescription$$serializer.f4668a, errorDescription);
        }
        if (compositeEncoderB.q(serialDescriptor, 2) || eSResponse != null) {
            compositeEncoderB.w(serialDescriptor, 2, ESResponse$$serializer.f4663a, eSResponse);
        }
        compositeEncoderB.p(serialDescriptor, 3, value.d);
        compositeEncoderB.p(serialDescriptor, 4, value.e);
        compositeEncoderB.t(serialDescriptor, 5, value.f);
        compositeEncoderB.c(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f24815a;
    }
}
