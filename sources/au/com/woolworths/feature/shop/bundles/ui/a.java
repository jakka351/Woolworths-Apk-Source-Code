package au.com.woolworths.feature.shop.bundles.ui;

import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import au.com.woolworths.android.onesite.deeplink.ShopAppDeepLinkModuleRegistry;
import au.com.woolworths.android.onesite.modules.common.InlineErrorType;
import au.com.woolworths.android.onesite.modules.customviews.loadingdialog.FullPageLoadingDialogFragment;
import au.com.woolworths.feature.shop.catalogue.details.CatalogueDetailLink;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapScreenKt;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapScreenKt$EmptyCallbacks$1;
import au.com.woolworths.feature.shop.myorders.details.OrderDetailsActivity;
import au.com.woolworths.feature.shop.onboarding.OnboardingActivity;
import au.com.woolworths.feature.shop.onboarding.OnboardingAdapter;
import au.com.woolworths.feature.shop.trafficdrivers.ui.TrafficDriverView;
import au.com.woolworths.feature.shop.wpay.ui.wpay.sectionoptionitem.SectionOptionItemProvider;
import au.com.woolworths.foundation.appcomms.inbox.client.internal.swrve.SwrveContentDto;
import au.com.woolworths.foundation.appcomms.inbox.client.internal.swrve.SwrveContentDto$CategoryTag$$serializer;
import au.com.woolworths.foundation.force.upgrade.common.data.AppConfigUpgradeType;
import au.com.woolworths.foundation.force.upgrade.data.UpgradeConfig;
import au.com.woolworths.foundation.force.upgrade.data.UpgradePromptType;
import au.com.woolworths.foundation.force.upgrade.data.UpgradeType;
import au.com.woolworths.foundation.internallinks.LinkMap;
import au.com.woolworths.foundation.internallinks.LinkSpec$$serializer;
import au.com.woolworths.foundation.rewards.common.ui.PreviewPackKt;
import au.com.woolworths.foundation.rewards.common.ui.home.HomepageStyle;
import au.com.woolworths.foundation.rewards.common.ui.home.HomepageStyleKt;
import au.com.woolworths.foundation.rewards.onboarding.CoachMarkBanner;
import au.com.woolworths.foundation.rewards.onboarding.ProgressiveCoachMarkContent$$serializer;
import au.com.woolworths.foundation.rewards.servicemessages.RewardsServiceMessage;
import au.com.woolworths.foundation.swrve.embedded.campaign.consumer.StandardCampaignContent;
import com.airbnb.deeplinkdispatch.DeepLinkEntry;
import com.airbnb.deeplinkdispatch.base.MatchIndex;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swrve.sdk.SwrveSDKBase;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonKt;
import okhttp3.OkHttpClient;
import org.bouncycastle.asn1.BERTags;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int d;

    public /* synthetic */ a(int i) {
        this.d = i;
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [com.swrve.sdk.ISwrveBase, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.d;
        Unit unit = Unit.f24250a;
        switch (i) {
            case 0:
                return SnapshotStateKt.f(Boolean.FALSE);
            case 1:
                Lazy lazy = CatalogueDetailLink.f6819a;
                MatchIndex matchIndex = new ShopAppDeepLinkModuleRegistry().b;
                ArrayList arrayListB = matchIndex.b(0, matchIndex.f13300a.length);
                ArrayList arrayList = new ArrayList(CollectionsKt.s(arrayListB, 10));
                Iterator it = arrayListB.iterator();
                while (it.hasNext()) {
                    arrayList.add(((DeepLinkEntry) it.next()).getD());
                }
                return CollectionsKt.L0(arrayList);
            case 2:
                InstoreMapScreenKt$EmptyCallbacks$1 instoreMapScreenKt$EmptyCallbacks$1 = InstoreMapScreenKt.f7385a;
                return unit;
            case 3:
                int i2 = OrderDetailsActivity.N;
                return new FullPageLoadingDialogFragment();
            case 4:
                return new OkHttpClient(new OkHttpClient.Builder());
            case 5:
                int i3 = OnboardingActivity.I;
                OnboardingAdapter onboardingAdapter = new OnboardingAdapter();
                onboardingAdapter.g = EmptyList.d;
                return onboardingAdapter;
            case 6:
                int i4 = TrafficDriverView.n;
                return unit;
            case 7:
                SectionOptionItemProvider.TestCase[] testCaseArr = SectionOptionItemProvider.TestCase.e;
                return unit;
            case 8:
                SwrveContentDto.Companion companion = SwrveContentDto.Companion;
                return new ArrayListSerializer(SwrveContentDto$CategoryTag$$serializer.f8427a);
            case 9:
                SwrveSDKBase.a();
                SwrveSDKBase.f19075a.k(null);
                return unit;
            case 10:
                return EnumsKt.b(AppConfigUpgradeType.values(), "au.com.woolworths.foundation.force.upgrade.common.data.AppConfigUpgradeType");
            case 11:
                UpgradeConfig.Companion companion2 = UpgradeConfig.INSTANCE;
                return UpgradeType.INSTANCE.serializer();
            case 12:
                UpgradeConfig.Companion companion3 = UpgradeConfig.INSTANCE;
                return UpgradePromptType.INSTANCE.serializer();
            case 13:
                return EnumsKt.b(UpgradePromptType.values(), "au.com.woolworths.foundation.force.upgrade.data.UpgradePromptType");
            case 14:
                return EnumsKt.b(UpgradeType.values(), "au.com.woolworths.foundation.force.upgrade.data.UpgradeType");
            case 15:
                LinkMap.Companion companion4 = LinkMap.Companion;
                return new LinkedHashMapSerializer(StringSerializer.f24821a, LinkSpec$$serializer.f8536a);
            case 16:
                ImageVector imageVectorD = PreviewPackKt.b;
                if (imageVectorD == null) {
                    float f = (float) 48.0d;
                    ImageVector.Builder builder = new ImageVector.Builder("FuelEmpty", f, f, 48.0f, 48.0f, 0L, 0, false, BERTags.FLAGS);
                    SolidColor solidColor = new SolidColor(ColorKt.d(4292101376L));
                    PathBuilder pathBuilder = new PathBuilder();
                    pathBuilder.i(20.3388f, 4.0f);
                    pathBuilder.e(11.902f);
                    pathBuilder.b(10.2483f, 4.0f, 8.9081f, 5.3401f, 8.9081f, 6.993f);
                    pathBuilder.l(39.9964f);
                    pathBuilder.e(20.3388f);
                    pathBuilder.l(4.0f);
                    pathBuilder.a();
                    builder.b((14420 & 16) != 0 ? 1.0f : 1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED, 4.0f, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, 1, 0, 0, solidColor, (14420 & 32) != 0 ? null : null, "", pathBuilder.f1816a);
                    SolidColor solidColor2 = new SolidColor(ColorKt.d(4292101376L));
                    PathBuilder pathBuilder2 = new PathBuilder();
                    pathBuilder2.i(38.4877f, 18.8041f);
                    pathBuilder2.l(18.8049f);
                    pathBuilder2.b(38.4006f, 19.09f, 38.2078f, 19.3244f, 37.945f, 19.4645f);
                    pathBuilder2.b(37.6792f, 19.6038f, 37.3797f, 19.6335f, 37.0932f, 19.5464f);
                    pathBuilder2.b(36.8081f, 19.4593f, 36.5734f, 19.2665f, 36.4336f, 19.0029f);
                    pathBuilder2.b(36.2935f, 18.7393f, 36.2646f, 18.4371f, 36.3517f, 18.1511f);
                    pathBuilder2.b(36.4389f, 17.866f, 36.6316f, 17.6313f, 36.8952f, 17.4915f);
                    pathBuilder2.b(37.059f, 17.4044f, 37.2377f, 17.3605f, 37.4178f, 17.3605f);
                    pathBuilder2.b(37.5281f, 17.3605f, 37.6376f, 17.376f, 37.7454f, 17.4096f);
                    pathBuilder2.b(38.3352f, 17.5897f, 38.6678f, 18.2159f, 38.4877f, 18.8041f);
                    pathBuilder2.a();
                    pathBuilder2.i(39.7109f, 17.2599f);
                    pathBuilder2.b(39.6334f, 17.1184f, 39.5457f, 16.9861f, 39.4459f, 16.8595f);
                    pathBuilder2.b(39.4377f, 16.849f, 39.4302f, 16.8394f, 39.4222f, 16.8303f);
                    pathBuilder2.b(39.3588f, 16.7506f, 39.3023f, 16.6673f, 39.23f, 16.5951f);
                    pathBuilder2.g(35.7978f, 12.9535f);
                    pathBuilder2.b(35.4566f, 12.6118f, 35.0025f, 12.4243f, 34.5208f, 12.4243f);
                    pathBuilder2.e(34.4397f);
                    pathBuilder2.b(34.2224f, 11.1415f, 33.113f, 10.1632f, 31.769f, 10.1624f);
                    pathBuilder2.l(15.596f);
                    pathBuilder2.b(32.9068f, 15.596f, 33.8783f, 14.8953f, 34.2825f, 13.9029f);
                    pathBuilder2.e(34.5208f);
                    pathBuilder2.b(34.6065f, 13.9029f, 34.6906f, 13.9379f, 34.7367f, 13.9834f);
                    pathBuilder2.g(36.6413f, 16.0038f);
                    pathBuilder2.b(36.4902f, 16.0524f, 36.3426f, 16.1103f, 36.2006f, 16.1856f);
                    pathBuilder2.b(35.5879f, 16.5118f, 35.1395f, 17.0558f, 34.9363f, 17.7193f);
                    pathBuilder2.b(34.7345f, 18.3827f, 34.8023f, 19.0848f, 35.1277f, 19.6967f);
                    pathBuilder2.b(35.4531f, 20.3094f, 35.9979f, 20.7583f, 36.6614f, 20.961f);
                    pathBuilder2.b(36.9132f, 21.0385f, 37.1677f, 21.0749f, 37.4178f, 21.0749f);
                    pathBuilder2.b(37.8369f, 21.0749f, 38.2442f, 20.972f, 38.6076f, 20.7845f);
                    pathBuilder2.l(34.0555f);
                    pathBuilder2.b(38.6076f, 34.574f, 38.1868f, 34.9953f, 37.6687f, 34.9953f);
                    pathBuilder2.b(37.1514f, 34.9953f, 36.7306f, 34.574f, 36.7306f, 34.0555f);
                    pathBuilder2.l(26.4101f);
                    pathBuilder2.b(36.7306f, 25.0774f, 35.6458f, 23.9926f, 34.3131f, 23.9926f);
                    pathBuilder2.e(31.7699f);
                    pathBuilder2.e(31.769f);
                    pathBuilder2.l(25.4712f);
                    pathBuilder2.e(31.7699f);
                    pathBuilder2.e(34.3131f);
                    pathBuilder2.b(34.8307f, 25.4712f, 35.2512f, 25.8928f, 35.2512f, 26.4101f);
                    pathBuilder2.l(34.0555f);
                    pathBuilder2.b(35.2512f, 35.3891f, 36.336f, 36.4739f, 37.6687f, 36.4739f);
                    pathBuilder2.b(39.0014f, 36.4739f, 40.0862f, 35.3891f, 40.0862f, 34.0555f);
                    pathBuilder2.l(18.685f);
                    pathBuilder2.b(40.0862f, 18.1743f, 39.947f, 17.6903f, 39.7109f, 17.2599f);
                    pathBuilder2.a();
                    builder.b((14420 & 16) != 0 ? 1.0f : 1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED, 4.0f, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, 1, 0, 0, solidColor2, (14420 & 32) != 0 ? null : null, "", pathBuilder2.f1816a);
                    SolidColor solidColor3 = new SolidColor(ColorKt.d(4294946187L));
                    PathBuilder pathBuilder3 = new PathBuilder();
                    pathBuilder3.i(31.7687f, 15.5961f);
                    pathBuilder3.l(10.1619f);
                    pathBuilder3.l(6.9924f);
                    pathBuilder3.b(31.7687f, 5.3401f, 30.4285f, 4.0002f, 28.7757f, 4.0002f);
                    pathBuilder3.e(28.7749f);
                    pathBuilder3.e(20.338f);
                    pathBuilder3.l(39.9956f);
                    pathBuilder3.e(31.7687f);
                    pathBuilder3.l(25.4715f);
                    pathBuilder3.l(23.9921f);
                    pathBuilder3.l(15.5961f);
                    pathBuilder3.a();
                    builder.b((14420 & 16) != 0 ? 1.0f : 1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED, 4.0f, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, 1, 0, 0, solidColor3, (14420 & 32) != 0 ? null : null, "", pathBuilder3.f1816a);
                    int i5 = VectorKt.f1820a;
                    builder.a("", BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, EmptyList.d);
                    SolidColor solidColor4 = new SolidColor(ColorKt.d(4292101376L));
                    PathBuilder pathBuilder4 = new PathBuilder();
                    pathBuilder4.i(32.1984f, 39.9961f);
                    pathBuilder4.e(31.7687f);
                    pathBuilder4.e(20.3381f);
                    pathBuilder4.e(8.9082f);
                    pathBuilder4.e(8.4792f);
                    pathBuilder4.b(7.6624f, 39.9961f, 6.9998f, 40.6587f, 6.9998f, 41.4747f);
                    pathBuilder4.l(43.261f);
                    pathBuilder4.b(6.9998f, 43.6696f, 7.3312f, 44.0003f, 7.7393f, 44.0003f);
                    pathBuilder4.e(32.9385f);
                    pathBuilder4.b(33.3463f, 44.0003f, 33.6769f, 43.6696f, 33.6769f, 43.261f);
                    pathBuilder4.l(41.4747f);
                    pathBuilder4.b(33.6769f, 40.6587f, 33.0159f, 39.9961f, 32.1984f, 39.9961f);
                    pathBuilder4.a();
                    builder.b((14420 & 16) != 0 ? 1.0f : 1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED, 4.0f, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, 1, 0, 0, solidColor4, (14420 & 32) != 0 ? null : null, "", pathBuilder4.f1816a);
                    SolidColor solidColor5 = new SolidColor(ColorKt.d(4294967295L));
                    PathBuilder pathBuilder5 = new PathBuilder();
                    pathBuilder5.i(24.2048f, 20.8376f);
                    pathBuilder5.e(13.3951f);
                    pathBuilder5.b(13.2454f, 20.8376f, 13.124f, 20.7163f, 13.124f, 20.5665f);
                    pathBuilder5.l(12.5279f);
                    pathBuilder5.b(13.124f, 10.6778f, 14.6241f, 9.1775f, 16.4744f, 9.1775f);
                    pathBuilder5.e(27.2841f);
                    pathBuilder5.b(27.4338f, 9.1775f, 27.5551f, 9.2988f, 27.5551f, 9.4477f);
                    pathBuilder5.l(17.4872f);
                    pathBuilder5.b(27.5551f, 19.3375f, 26.0542f, 20.8376f, 24.2048f, 20.8376f);
                    pathBuilder5.a();
                    builder.b((14420 & 16) != 0 ? 1.0f : 1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED, 4.0f, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, 1, 0, 0, solidColor5, (14420 & 32) != 0 ? null : null, "", pathBuilder5.f1816a);
                    builder.e();
                    imageVectorD = builder.d();
                    PreviewPackKt.b = imageVectorD;
                }
                return CollectionsKt.R(imageVectorD, PreviewPackKt.a());
            case 17:
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = HomepageStyleKt.f8583a;
                return HomepageStyle.d;
            case 18:
                return unit;
            case 19:
                CoachMarkBanner.Companion companion5 = CoachMarkBanner.Companion;
                return new ArrayListSerializer(ProgressiveCoachMarkContent$$serializer.f8633a);
            case 20:
                RewardsServiceMessage.Companion companion6 = RewardsServiceMessage.INSTANCE;
                return EnumsKt.b(InlineErrorType.values(), "au.com.woolworths.android.onesite.modules.common.InlineErrorType");
            case 21:
                return JsonKt.a(new au.com.woolworths.foundation.rewards.common.ui.collapinsgtoolbarextras.a(18));
            case 22:
                return SnapshotIntStateKt.a(1);
            case 23:
                StandardCampaignContent.Companion companion7 = StandardCampaignContent.INSTANCE;
                return StandardCampaignContent.PresentationStyle.INSTANCE.serializer();
            case 24:
                return EnumsKt.a("au.com.woolworths.foundation.swrve.embedded.campaign.consumer.StandardCampaignContent.AssetFit", StandardCampaignContent.AssetFit.values(), new String[]{"CENTER", "ASPECT_FILL"}, new Annotation[][]{null, null});
            case 25:
                return EnumsKt.a("au.com.woolworths.foundation.swrve.embedded.campaign.consumer.StandardCampaignContent.AssetType", StandardCampaignContent.AssetType.values(), new String[]{"LOTTIE_ANIMATION", "IMAGE"}, new Annotation[][]{null, null});
            case 26:
                StandardCampaignContent.BannerAsset.Companion companion8 = StandardCampaignContent.BannerAsset.INSTANCE;
                return StandardCampaignContent.AssetType.INSTANCE.serializer();
            case 27:
                StandardCampaignContent.BannerAsset.Companion companion9 = StandardCampaignContent.BannerAsset.INSTANCE;
                return StandardCampaignContent.AssetFit.INSTANCE.serializer();
            case 28:
                return EnumsKt.a("au.com.woolworths.foundation.swrve.embedded.campaign.consumer.StandardCampaignContent.PresentationStyle", StandardCampaignContent.PresentationStyle.values(), new String[]{"BOTTOMSHEET", "POPUP"}, new Annotation[][]{null, null});
            default:
                return 10;
        }
    }
}
