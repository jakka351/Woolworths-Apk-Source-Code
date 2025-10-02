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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"au/com/woolworths/foundation/swrve/embedded/campaign/consumer/StandardCampaignContent.BannerAsset.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lau/com/woolworths/foundation/swrve/embedded/campaign/consumer/StandardCampaignContent$BannerAsset;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "embedded-campaign_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Deprecated
/* loaded from: classes4.dex */
public /* synthetic */ class StandardCampaignContent$BannerAsset$$serializer implements GeneratedSerializer<StandardCampaignContent.BannerAsset> {

    /* renamed from: a, reason: collision with root package name */
    public static final StandardCampaignContent$BannerAsset$$serializer f8900a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        StandardCampaignContent$BannerAsset$$serializer standardCampaignContent$BannerAsset$$serializer = new StandardCampaignContent$BannerAsset$$serializer();
        f8900a = standardCampaignContent$BannerAsset$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("au.com.woolworths.foundation.swrve.embedded.campaign.consumer.StandardCampaignContent.BannerAsset", standardCampaignContent$BannerAsset$$serializer, 5);
        pluginGeneratedSerialDescriptor.k("assetType", false);
        pluginGeneratedSerialDescriptor.k("assetUrl", false);
        pluginGeneratedSerialDescriptor.k("assetWidth", false);
        pluginGeneratedSerialDescriptor.k("assetHeight", false);
        pluginGeneratedSerialDescriptor.k("fit", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = StandardCampaignContent.BannerAsset.f;
        IntSerializer intSerializer = IntSerializer.f24800a;
        return new KSerializer[]{lazyArr[0].getD(), StringSerializer.f24821a, intSerializer, intSerializer, BuiltinSerializersKt.d((KSerializer) lazyArr[4].getD())};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderB = decoder.b(serialDescriptor);
        Lazy[] lazyArr = StandardCampaignContent.BannerAsset.f;
        int i = 0;
        int iG = 0;
        int iG2 = 0;
        StandardCampaignContent.AssetType assetType = null;
        String strJ = null;
        StandardCampaignContent.AssetFit assetFit = null;
        boolean z = true;
        while (z) {
            int iU = compositeDecoderB.u(serialDescriptor);
            if (iU == -1) {
                z = false;
            } else if (iU == 0) {
                assetType = (StandardCampaignContent.AssetType) compositeDecoderB.o(serialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getD(), assetType);
                i |= 1;
            } else if (iU == 1) {
                strJ = compositeDecoderB.j(serialDescriptor, 1);
                i |= 2;
            } else if (iU == 2) {
                iG = compositeDecoderB.g(serialDescriptor, 2);
                i |= 4;
            } else if (iU == 3) {
                iG2 = compositeDecoderB.g(serialDescriptor, 3);
                i |= 8;
            } else {
                if (iU != 4) {
                    throw new UnknownFieldException(iU);
                }
                assetFit = (StandardCampaignContent.AssetFit) compositeDecoderB.k(serialDescriptor, 4, (DeserializationStrategy) lazyArr[4].getD(), assetFit);
                i |= 16;
            }
        }
        compositeDecoderB.c(serialDescriptor);
        return new StandardCampaignContent.BannerAsset(i, assetType, strJ, iG, iG2, assetFit);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        StandardCampaignContent.BannerAsset value = (StandardCampaignContent.BannerAsset) obj;
        Intrinsics.h(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderB = encoder.b(serialDescriptor);
        Lazy[] lazyArr = StandardCampaignContent.BannerAsset.f;
        compositeEncoderB.F(serialDescriptor, 0, (SerializationStrategy) lazyArr[0].getD(), value.f8902a);
        compositeEncoderB.p(serialDescriptor, 1, value.b);
        compositeEncoderB.C(2, value.c, serialDescriptor);
        compositeEncoderB.C(3, value.d, serialDescriptor);
        compositeEncoderB.w(serialDescriptor, 4, (SerializationStrategy) lazyArr[4].getD(), value.e);
        compositeEncoderB.c(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f24815a;
    }
}
