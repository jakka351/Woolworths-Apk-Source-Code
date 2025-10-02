package au.com.woolworths.rewards.modal;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.AnalyticsData$$serializer;
import au.com.woolworths.android.onesite.data.DownloadableAsset;
import au.com.woolworths.android.onesite.data.DownloadableAsset$$serializer;
import au.com.woolworths.rewards.base.info.FeatureInfoFooter;
import au.com.woolworths.rewards.base.info.FeatureInfoFooter$$serializer;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.bouncycastle.i18n.ErrorBundle;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"au/com/woolworths/rewards/modal/RewardsAppModalData.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lau/com/woolworths/rewards/modal/RewardsAppModalData;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Deprecated
/* loaded from: classes4.dex */
public /* synthetic */ class RewardsAppModalData$$serializer implements GeneratedSerializer<RewardsAppModalData> {

    /* renamed from: a, reason: collision with root package name */
    public static final RewardsAppModalData$$serializer f9966a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        RewardsAppModalData$$serializer rewardsAppModalData$$serializer = new RewardsAppModalData$$serializer();
        f9966a = rewardsAppModalData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("au.com.woolworths.rewards.modal.RewardsAppModalData", rewardsAppModalData$$serializer, 8);
        pluginGeneratedSerialDescriptor.k("headerImage", true);
        pluginGeneratedSerialDescriptor.k("title", false);
        pluginGeneratedSerialDescriptor.k(ErrorBundle.SUMMARY_ENTRY, false);
        pluginGeneratedSerialDescriptor.k("dismissActionUrl", true);
        pluginGeneratedSerialDescriptor.k("infoItems", false);
        pluginGeneratedSerialDescriptor.k("footer", true);
        pluginGeneratedSerialDescriptor.k("impressionAnalytics", true);
        pluginGeneratedSerialDescriptor.k("dismissAnalytics", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = RewardsAppModalData.j;
        StringSerializer stringSerializer = StringSerializer.f24821a;
        AnalyticsData$$serializer analyticsData$$serializer = AnalyticsData$$serializer.f4018a;
        return new KSerializer[]{BuiltinSerializersKt.d(DownloadableAsset$$serializer.f4241a), stringSerializer, stringSerializer, BuiltinSerializersKt.d(stringSerializer), lazyArr[4].getD(), BuiltinSerializersKt.d(FeatureInfoFooter$$serializer.f9371a), BuiltinSerializersKt.d(analyticsData$$serializer), BuiltinSerializersKt.d(analyticsData$$serializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderB = decoder.b(serialDescriptor);
        Lazy[] lazyArr = RewardsAppModalData.j;
        DownloadableAsset downloadableAsset = null;
        String strJ = null;
        String strJ2 = null;
        String str = null;
        List list = null;
        FeatureInfoFooter featureInfoFooter = null;
        AnalyticsData analyticsData = null;
        AnalyticsData analyticsData2 = null;
        int i = 0;
        boolean z = true;
        while (z) {
            int iU = compositeDecoderB.u(serialDescriptor);
            switch (iU) {
                case -1:
                    z = false;
                    break;
                case 0:
                    downloadableAsset = (DownloadableAsset) compositeDecoderB.k(serialDescriptor, 0, DownloadableAsset$$serializer.f4241a, downloadableAsset);
                    i |= 1;
                    break;
                case 1:
                    strJ = compositeDecoderB.j(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    strJ2 = compositeDecoderB.j(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str = (String) compositeDecoderB.k(serialDescriptor, 3, StringSerializer.f24821a, str);
                    i |= 8;
                    break;
                case 4:
                    list = (List) compositeDecoderB.o(serialDescriptor, 4, (DeserializationStrategy) lazyArr[4].getD(), list);
                    i |= 16;
                    break;
                case 5:
                    featureInfoFooter = (FeatureInfoFooter) compositeDecoderB.k(serialDescriptor, 5, FeatureInfoFooter$$serializer.f9371a, featureInfoFooter);
                    i |= 32;
                    break;
                case 6:
                    analyticsData = (AnalyticsData) compositeDecoderB.k(serialDescriptor, 6, AnalyticsData$$serializer.f4018a, analyticsData);
                    i |= 64;
                    break;
                case 7:
                    analyticsData2 = (AnalyticsData) compositeDecoderB.k(serialDescriptor, 7, AnalyticsData$$serializer.f4018a, analyticsData2);
                    i |= 128;
                    break;
                default:
                    throw new UnknownFieldException(iU);
            }
        }
        compositeDecoderB.c(serialDescriptor);
        return new RewardsAppModalData(i, downloadableAsset, strJ, strJ2, str, list, featureInfoFooter, analyticsData, analyticsData2, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        RewardsAppModalData value = (RewardsAppModalData) obj;
        Intrinsics.h(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderB = encoder.b(serialDescriptor);
        RewardsAppModalData.c(value, compositeEncoderB, serialDescriptor);
        compositeEncoderB.c(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f24815a;
    }
}
