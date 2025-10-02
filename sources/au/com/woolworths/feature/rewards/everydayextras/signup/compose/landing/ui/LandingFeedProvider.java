package au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.android.onesite.data.DownloadableAsset;
import au.com.woolworths.android.onesite.data.DownloadableAssetType;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.landing.EverydayExtrasLandingFeed;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.landing.EverydayExtrasLandingFooter;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.landing.EverydayExtrasLandingFooterItem;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.landing.EverydayExtrasTab;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.landing.EverydayExtrasTermsAndConditions;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.shared.EverydayExtrasButtonActionType;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.shared.EverydayExtrasButtonStyle;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.sequences.Sequence;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumEngine;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/landing/ui/LandingFeedProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/landing/EverydayExtrasLandingFeed;", "Companion", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LandingFeedProvider implements PreviewParameterProvider<EverydayExtrasLandingFeed> {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/landing/ui/LandingFeedProvider$Companion;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        DownloadableAssetType downloadableAssetType = DownloadableAssetType.IMAGE;
        DownloadableAsset downloadableAsset = new DownloadableAsset(downloadableAssetType, "", 640, DilithiumEngine.DilithiumPolyT1PackedBytes, null, null);
        BenefitsContentItem benefitsContentItem = BenefitsContentProvider.f6100a;
        BenefitsContentItem benefitsContentItem2 = BenefitsContentProvider.f6100a;
        EverydayExtrasTab.EverydayExtrasKeyBenefitsTab everydayExtrasKeyBenefitsTab = benefitsContentItem2.f6099a;
        FaqsContentItem faqsContentItem = FaqsContentProvider.f6107a;
        FaqsContentItem faqsContentItem2 = FaqsContentProvider.f6107a;
        List listR = CollectionsKt.R(everydayExtrasKeyBenefitsTab, faqsContentItem2.f6106a);
        EverydayExtrasTermsAndConditions everydayExtrasTermsAndConditions = new EverydayExtrasTermsAndConditions("Terms and Conditions", "***10% off discount**  \nExtra Discount only applies to 1 Woolworths and 1 BIG W shop in-store, with single transaction value up to $500 each, each month. Exclusions apply, see [this FAQ](https://www.everyday.com.au/support.html?id=721) for more.");
        EverydayExtrasButtonActionType everydayExtrasButtonActionType = EverydayExtrasButtonActionType.d;
        EverydayExtrasButtonStyle everydayExtrasButtonStyle = EverydayExtrasButtonStyle.d;
        new EverydayExtrasLandingFeed("Everyday Extra", downloadableAsset, listR, everydayExtrasTermsAndConditions, new EverydayExtrasLandingFooter("", CollectionsKt.Q(new EverydayExtrasLandingFooterItem.Button("Start your 30-day free trial", everydayExtrasButtonActionType, "", everydayExtrasButtonStyle))), null);
        new EverydayExtrasLandingFeed("Everyday Extra", new DownloadableAsset(downloadableAssetType, "", 640, DilithiumEngine.DilithiumPolyT1PackedBytes, null, null), CollectionsKt.R(benefitsContentItem2.f6099a, faqsContentItem2.f6106a), new EverydayExtrasTermsAndConditions("Terms and Conditions", "***10% off discount**  \nExtra Discount only applies to 1 Woolworths and 1 BIG W shop in-store, with single transaction value up to $500 each, each month. Exclusions apply, see [this FAQ](https://www.everyday.com.au/support.html?id=721) for more."), new EverydayExtrasLandingFooter("", CollectionsKt.Q(new EverydayExtrasLandingFooterItem.Button("Start your 30-day free trial", EverydayExtrasButtonActionType.f, "com.woolworths.rewards://everydayExtras/signUp/finalGlance", everydayExtrasButtonStyle))), null);
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final Sequence getValues() {
        return null;
    }
}
