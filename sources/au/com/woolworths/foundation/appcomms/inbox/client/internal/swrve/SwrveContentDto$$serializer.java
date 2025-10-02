package au.com.woolworths.foundation.appcomms.inbox.client.internal.swrve;

import au.com.woolworths.foundation.appcomms.inbox.client.internal.swrve.SwrveContentDto;
import java.util.List;
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

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"au/com/woolworths/foundation/appcomms/inbox/client/internal/swrve/SwrveContentDto.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lau/com/woolworths/foundation/appcomms/inbox/client/internal/swrve/SwrveContentDto;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "inbox-client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Deprecated
/* loaded from: classes4.dex */
public /* synthetic */ class SwrveContentDto$$serializer implements GeneratedSerializer<SwrveContentDto> {

    /* renamed from: a, reason: collision with root package name */
    public static final SwrveContentDto$$serializer f8425a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        SwrveContentDto$$serializer swrveContentDto$$serializer = new SwrveContentDto$$serializer();
        f8425a = swrveContentDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("au.com.woolworths.foundation.appcomms.inbox.client.internal.swrve.SwrveContentDto", swrveContentDto$$serializer, 6);
        pluginGeneratedSerialDescriptor.k("swrveCampaignCode", false);
        pluginGeneratedSerialDescriptor.k("title", false);
        pluginGeneratedSerialDescriptor.k("body", false);
        pluginGeneratedSerialDescriptor.k("button", false);
        pluginGeneratedSerialDescriptor.k("categoryTags", false);
        pluginGeneratedSerialDescriptor.k("termsAndConditions", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = SwrveContentDto.g;
        KSerializer kSerializerD = BuiltinSerializersKt.d(SwrveContentDto$Button$$serializer.f8426a);
        KSerializer kSerializerD2 = BuiltinSerializersKt.d((KSerializer) lazyArr[4].getD());
        KSerializer kSerializerD3 = BuiltinSerializersKt.d(SwrveContentDto$TermsAndConditions$$serializer.f8428a);
        StringSerializer stringSerializer = StringSerializer.f24821a;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, kSerializerD, kSerializerD2, kSerializerD3};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderB = decoder.b(serialDescriptor);
        Lazy[] lazyArr = SwrveContentDto.g;
        int i = 0;
        String strJ = null;
        String strJ2 = null;
        String strJ3 = null;
        SwrveContentDto.Button button = null;
        List list = null;
        SwrveContentDto.TermsAndConditions termsAndConditions = null;
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
                    strJ2 = compositeDecoderB.j(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    strJ3 = compositeDecoderB.j(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    button = (SwrveContentDto.Button) compositeDecoderB.k(serialDescriptor, 3, SwrveContentDto$Button$$serializer.f8426a, button);
                    i |= 8;
                    break;
                case 4:
                    list = (List) compositeDecoderB.k(serialDescriptor, 4, (DeserializationStrategy) lazyArr[4].getD(), list);
                    i |= 16;
                    break;
                case 5:
                    termsAndConditions = (SwrveContentDto.TermsAndConditions) compositeDecoderB.k(serialDescriptor, 5, SwrveContentDto$TermsAndConditions$$serializer.f8428a, termsAndConditions);
                    i |= 32;
                    break;
                default:
                    throw new UnknownFieldException(iU);
            }
        }
        compositeDecoderB.c(serialDescriptor);
        return new SwrveContentDto(i, strJ, strJ2, strJ3, button, list, termsAndConditions);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        SwrveContentDto value = (SwrveContentDto) obj;
        Intrinsics.h(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderB = encoder.b(serialDescriptor);
        Lazy[] lazyArr = SwrveContentDto.g;
        compositeEncoderB.p(serialDescriptor, 0, value.f8424a);
        compositeEncoderB.p(serialDescriptor, 1, value.b);
        compositeEncoderB.p(serialDescriptor, 2, value.c);
        compositeEncoderB.w(serialDescriptor, 3, SwrveContentDto$Button$$serializer.f8426a, value.d);
        compositeEncoderB.w(serialDescriptor, 4, (SerializationStrategy) lazyArr[4].getD(), value.e);
        compositeEncoderB.w(serialDescriptor, 5, SwrveContentDto$TermsAndConditions$$serializer.f8428a, value.f);
        compositeEncoderB.c(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f24815a;
    }
}
