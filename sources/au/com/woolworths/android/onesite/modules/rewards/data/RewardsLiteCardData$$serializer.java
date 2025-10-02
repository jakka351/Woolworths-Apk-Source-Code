package au.com.woolworths.android.onesite.modules.rewards.data;

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

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"au/com/woolworths/android/onesite/modules/rewards/data/RewardsLiteCardData.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsLiteCardData;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Deprecated
/* loaded from: classes3.dex */
public /* synthetic */ class RewardsLiteCardData$$serializer implements GeneratedSerializer<RewardsLiteCardData> {

    /* renamed from: a, reason: collision with root package name */
    public static final RewardsLiteCardData$$serializer f4397a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        RewardsLiteCardData$$serializer rewardsLiteCardData$$serializer = new RewardsLiteCardData$$serializer();
        f4397a = rewardsLiteCardData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("au.com.woolworths.android.onesite.modules.rewards.data.RewardsLiteCardData", rewardsLiteCardData$$serializer, 6);
        pluginGeneratedSerialDescriptor.k("created", false);
        pluginGeneratedSerialDescriptor.k("expires", false);
        pluginGeneratedSerialDescriptor.k("campaignID", true);
        pluginGeneratedSerialDescriptor.k("cardNumber", false);
        pluginGeneratedSerialDescriptor.k("displayCardNumber", false);
        pluginGeneratedSerialDescriptor.k("registerID", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.f24821a;
        return new KSerializer[]{stringSerializer, stringSerializer, BuiltinSerializersKt.d(stringSerializer), stringSerializer, stringSerializer, stringSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderB = decoder.b(serialDescriptor);
        int i = 0;
        String strJ = null;
        String strJ2 = null;
        String str = null;
        String strJ3 = null;
        String strJ4 = null;
        String strJ5 = null;
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
                    str = (String) compositeDecoderB.k(serialDescriptor, 2, StringSerializer.f24821a, str);
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
                default:
                    throw new UnknownFieldException(iU);
            }
        }
        compositeDecoderB.c(serialDescriptor);
        return new RewardsLiteCardData(strJ, strJ2, str, strJ3, strJ4, i, strJ5);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        RewardsLiteCardData value = (RewardsLiteCardData) obj;
        Intrinsics.h(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderB = encoder.b(serialDescriptor);
        String str = value.f4396a;
        String str2 = value.c;
        compositeEncoderB.p(serialDescriptor, 0, str);
        compositeEncoderB.p(serialDescriptor, 1, value.b);
        if (compositeEncoderB.q(serialDescriptor, 2) || str2 != null) {
            compositeEncoderB.w(serialDescriptor, 2, StringSerializer.f24821a, str2);
        }
        compositeEncoderB.p(serialDescriptor, 3, value.d);
        compositeEncoderB.p(serialDescriptor, 4, value.e);
        compositeEncoderB.p(serialDescriptor, 5, value.f);
        compositeEncoderB.c(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f24815a;
    }
}
