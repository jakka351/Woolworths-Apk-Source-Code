package au.com.woolworths.feature.rewards.everydayextras.signup.compose.onboarding.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.android.onesite.data.DownloadableAsset;
import au.com.woolworths.android.onesite.data.DownloadableAssetFit;
import au.com.woolworths.android.onesite.data.DownloadableAssetType;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.onboarding.EverydayExtrasOnBoarding;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.onboarding.EverydayExtrasSubscribeContentItem;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.onboarding.EverydayExtrasSubscribeFooterItem;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.shared.EverydayExtrasButtonActionType;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.shared.EverydayExtrasButtonStyle;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/onboarding/ui/OnboardingProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/onboarding/EverydayExtrasOnBoarding;", "Companion", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OnboardingProvider implements PreviewParameterProvider<EverydayExtrasOnBoarding> {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/onboarding/ui/OnboardingProvider$Companion;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        CollectionsKt.R(new EverydayExtrasSubscribeContentItem.HeaderImage(new DownloadableAsset(DownloadableAssetType.IMAGE, "", 80, 80, DownloadableAssetFit.CENTER, null)), new EverydayExtrasSubscribeContentItem.TitleTextItem("Welcome to the club, Lessie!"), new EverydayExtrasSubscribeContentItem.ParagraphTextItem("Congratulations, you've now got early access to Everyday Extra! Your subscription is now active and ready to use", EverydayExtrasSubscribeContentItem.ParagraphTextItem.Alignment.e), new EverydayExtrasSubscribeContentItem.IconListItemWithNestedItems("", CollectionsKt.R(new EverydayExtrasSubscribeContentItem.IconListItemWithNestedItems.NestedItem.NestedMarkdownContentItem("We’ve sent you an email with everything you need to know to start enjoying your benefits"), new EverydayExtrasSubscribeContentItem.IconListItemWithNestedItems.NestedItem.NestedMarkdownContentItem("Enjoy 10% off one shop every month* at both Woolworths and BIG W in-store or online")), "We’ve sent you an email with everything you need to know to start enjoying your benefits\n\nEnjoy 10% off one shop every month* at both Woolworths and BIG W in-store or online"), new EverydayExtrasSubscribeContentItem.IconListItemWithNestedItems("", CollectionsKt.Q(new EverydayExtrasSubscribeContentItem.IconListItemWithNestedItems.NestedItem.NestedMarkdownContentItem("Collect 3x points on every shop in-store or online at Woolworths and BIG W˚")), "Collect 3x points on every shop in-store or online at Woolworths and BIG W˚"));
        CollectionsKt.Q(new EverydayExtrasSubscribeFooterItem.SubscribeContentCta(new ContentCta("Get started ContentCta", "", (String) null, (Boolean) null, (AnalyticsData) null, 28, (DefaultConstructorMarker) null)));
        CollectionsKt.Q(new EverydayExtrasSubscribeFooterItem.Button("Get started EverydayExtraButton", EverydayExtrasButtonActionType.d, null, EverydayExtrasButtonStyle.d));
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final Sequence getValues() {
        return null;
    }
}
