package au.com.woolworths.foundation.swrve.embedded.campaign.consumer;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.foundation.swrve.embedded.campaign.consumer.StandardCampaignContent;
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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"au/com/woolworths/foundation/swrve/embedded/campaign/consumer/StandardCampaignContent.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lau/com/woolworths/foundation/swrve/embedded/campaign/consumer/StandardCampaignContent;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "embedded-campaign_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Deprecated
/* loaded from: classes4.dex */
public /* synthetic */ class StandardCampaignContent$$serializer implements GeneratedSerializer<StandardCampaignContent> {

    /* renamed from: a, reason: collision with root package name */
    public static final StandardCampaignContent$$serializer f8899a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        StandardCampaignContent$$serializer standardCampaignContent$$serializer = new StandardCampaignContent$$serializer();
        f8899a = standardCampaignContent$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("au.com.woolworths.foundation.swrve.embedded.campaign.consumer.StandardCampaignContent", standardCampaignContent$$serializer, 7);
        pluginGeneratedSerialDescriptor.k("swrveCampaignCode", true);
        pluginGeneratedSerialDescriptor.k("presentationStyle", false);
        pluginGeneratedSerialDescriptor.k("bannerAsset", false);
        pluginGeneratedSerialDescriptor.k("bottomSheetTitle", false);
        pluginGeneratedSerialDescriptor.k("bottomSheetBody", false);
        pluginGeneratedSerialDescriptor.k("primaryCta", false);
        pluginGeneratedSerialDescriptor.k("secondaryCta", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = StandardCampaignContent.h;
        StringSerializer stringSerializer = StringSerializer.f24821a;
        StandardCampaignContent$Cta$$serializer standardCampaignContent$Cta$$serializer = StandardCampaignContent$Cta$$serializer.f8901a;
        return new KSerializer[]{stringSerializer, lazyArr[1].getD(), BuiltinSerializersKt.d(StandardCampaignContent$BannerAsset$$serializer.f8900a), stringSerializer, stringSerializer, BuiltinSerializersKt.d(standardCampaignContent$Cta$$serializer), BuiltinSerializersKt.d(standardCampaignContent$Cta$$serializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderB = decoder.b(serialDescriptor);
        Lazy[] lazyArr = StandardCampaignContent.h;
        int i = 0;
        String strJ = null;
        StandardCampaignContent.PresentationStyle presentationStyle = null;
        StandardCampaignContent.BannerAsset bannerAsset = null;
        String strJ2 = null;
        String strJ3 = null;
        StandardCampaignContent.Cta cta = null;
        StandardCampaignContent.Cta cta2 = null;
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
                    presentationStyle = (StandardCampaignContent.PresentationStyle) compositeDecoderB.o(serialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getD(), presentationStyle);
                    i |= 2;
                    break;
                case 2:
                    bannerAsset = (StandardCampaignContent.BannerAsset) compositeDecoderB.k(serialDescriptor, 2, StandardCampaignContent$BannerAsset$$serializer.f8900a, bannerAsset);
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
                    cta = (StandardCampaignContent.Cta) compositeDecoderB.k(serialDescriptor, 5, StandardCampaignContent$Cta$$serializer.f8901a, cta);
                    i |= 32;
                    break;
                case 6:
                    cta2 = (StandardCampaignContent.Cta) compositeDecoderB.k(serialDescriptor, 6, StandardCampaignContent$Cta$$serializer.f8901a, cta2);
                    i |= 64;
                    break;
                default:
                    throw new UnknownFieldException(iU);
            }
        }
        compositeDecoderB.c(serialDescriptor);
        return new StandardCampaignContent(i, strJ, presentationStyle, bannerAsset, strJ2, strJ3, cta, cta2);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        StandardCampaignContent value = (StandardCampaignContent) obj;
        Intrinsics.h(value, "value");
        String str = value.f8898a;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderB = encoder.b(serialDescriptor);
        Lazy[] lazyArr = StandardCampaignContent.h;
        if (compositeEncoderB.q(serialDescriptor, 0) || !Intrinsics.c(str, "")) {
            compositeEncoderB.p(serialDescriptor, 0, str);
        }
        compositeEncoderB.F(serialDescriptor, 1, (SerializationStrategy) lazyArr[1].getD(), value.b);
        compositeEncoderB.w(serialDescriptor, 2, StandardCampaignContent$BannerAsset$$serializer.f8900a, value.c);
        compositeEncoderB.p(serialDescriptor, 3, value.d);
        compositeEncoderB.p(serialDescriptor, 4, value.e);
        StandardCampaignContent$Cta$$serializer standardCampaignContent$Cta$$serializer = StandardCampaignContent$Cta$$serializer.f8901a;
        compositeEncoderB.w(serialDescriptor, 5, standardCampaignContent$Cta$$serializer, value.f);
        compositeEncoderB.w(serialDescriptor, 6, standardCampaignContent$Cta$$serializer, value.g);
        compositeEncoderB.c(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f24815a;
    }
}
