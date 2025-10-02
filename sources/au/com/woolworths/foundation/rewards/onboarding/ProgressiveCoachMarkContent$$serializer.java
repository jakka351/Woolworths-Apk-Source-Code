package au.com.woolworths.foundation.rewards.onboarding;

import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.android.onesite.data.ContentCta$$serializer;
import au.com.woolworths.android.onesite.data.DownloadableAsset;
import au.com.woolworths.android.onesite.data.DownloadableAsset$$serializer;
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

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"au/com/woolworths/foundation/rewards/onboarding/ProgressiveCoachMarkContent.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lau/com/woolworths/foundation/rewards/onboarding/ProgressiveCoachMarkContent;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "onboarding_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Deprecated
/* loaded from: classes4.dex */
public /* synthetic */ class ProgressiveCoachMarkContent$$serializer implements GeneratedSerializer<ProgressiveCoachMarkContent> {

    /* renamed from: a, reason: collision with root package name */
    public static final ProgressiveCoachMarkContent$$serializer f8633a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        ProgressiveCoachMarkContent$$serializer progressiveCoachMarkContent$$serializer = new ProgressiveCoachMarkContent$$serializer();
        f8633a = progressiveCoachMarkContent$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("au.com.woolworths.foundation.rewards.onboarding.ProgressiveCoachMarkContent", progressiveCoachMarkContent$$serializer, 8);
        pluginGeneratedSerialDescriptor.k("pageId", false);
        pluginGeneratedSerialDescriptor.k("elementId", false);
        pluginGeneratedSerialDescriptor.k("bannerImage", false);
        pluginGeneratedSerialDescriptor.k("contentTitle", false);
        pluginGeneratedSerialDescriptor.k("contentBody", false);
        pluginGeneratedSerialDescriptor.k("leftCta", false);
        pluginGeneratedSerialDescriptor.k("rightCta", false);
        pluginGeneratedSerialDescriptor.k("coachMarkId", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.f24821a;
        KSerializer kSerializerD = BuiltinSerializersKt.d(DownloadableAsset$$serializer.f4241a);
        ContentCta$$serializer contentCta$$serializer = ContentCta$$serializer.f4240a;
        return new KSerializer[]{stringSerializer, stringSerializer, kSerializerD, stringSerializer, stringSerializer, BuiltinSerializersKt.d(contentCta$$serializer), BuiltinSerializersKt.d(contentCta$$serializer), BuiltinSerializersKt.d(stringSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderB = decoder.b(serialDescriptor);
        int i = 0;
        String strJ = null;
        String strJ2 = null;
        DownloadableAsset downloadableAsset = null;
        String strJ3 = null;
        String strJ4 = null;
        ContentCta contentCta = null;
        ContentCta contentCta2 = null;
        String str = null;
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
                    downloadableAsset = (DownloadableAsset) compositeDecoderB.k(serialDescriptor, 2, DownloadableAsset$$serializer.f4241a, downloadableAsset);
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
                    contentCta = (ContentCta) compositeDecoderB.k(serialDescriptor, 5, ContentCta$$serializer.f4240a, contentCta);
                    i |= 32;
                    break;
                case 6:
                    contentCta2 = (ContentCta) compositeDecoderB.k(serialDescriptor, 6, ContentCta$$serializer.f4240a, contentCta2);
                    i |= 64;
                    break;
                case 7:
                    str = (String) compositeDecoderB.k(serialDescriptor, 7, StringSerializer.f24821a, str);
                    i |= 128;
                    break;
                default:
                    throw new UnknownFieldException(iU);
            }
        }
        compositeDecoderB.c(serialDescriptor);
        return new ProgressiveCoachMarkContent(i, strJ, strJ2, downloadableAsset, strJ3, strJ4, contentCta, contentCta2, str);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        ProgressiveCoachMarkContent value = (ProgressiveCoachMarkContent) obj;
        Intrinsics.h(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderB = encoder.b(serialDescriptor);
        String str = value.f8632a;
        String str2 = value.h;
        compositeEncoderB.p(serialDescriptor, 0, str);
        compositeEncoderB.p(serialDescriptor, 1, value.b);
        compositeEncoderB.w(serialDescriptor, 2, DownloadableAsset$$serializer.f4241a, value.c);
        compositeEncoderB.p(serialDescriptor, 3, value.d);
        compositeEncoderB.p(serialDescriptor, 4, value.e);
        ContentCta$$serializer contentCta$$serializer = ContentCta$$serializer.f4240a;
        compositeEncoderB.w(serialDescriptor, 5, contentCta$$serializer, value.f);
        compositeEncoderB.w(serialDescriptor, 6, contentCta$$serializer, value.g);
        if (compositeEncoderB.q(serialDescriptor, 7) || str2 != null) {
            compositeEncoderB.w(serialDescriptor, 7, StringSerializer.f24821a, str2);
        }
        compositeEncoderB.c(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f24815a;
    }
}
