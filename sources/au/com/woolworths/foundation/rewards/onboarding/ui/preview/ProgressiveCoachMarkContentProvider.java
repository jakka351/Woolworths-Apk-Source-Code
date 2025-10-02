package au.com.woolworths.foundation.rewards.onboarding.ui.preview;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.android.onesite.data.DownloadableAsset;
import au.com.woolworths.android.onesite.data.DownloadableAssetType;
import au.com.woolworths.foundation.rewards.onboarding.ProgressiveCoachMarkContent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/foundation/rewards/onboarding/ui/preview/ProgressiveCoachMarkContentProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/foundation/rewards/onboarding/ProgressiveCoachMarkContent;", "Companion", "onboarding-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProgressiveCoachMarkContentProvider implements PreviewParameterProvider<ProgressiveCoachMarkContent> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lau/com/woolworths/foundation/rewards/onboarding/ui/preview/ProgressiveCoachMarkContentProvider$Companion;", "", "Lau/com/woolworths/foundation/rewards/onboarding/ProgressiveCoachMarkContent;", "coachMark1", "Lau/com/woolworths/foundation/rewards/onboarding/ProgressiveCoachMarkContent;", "coachMark2", "coachMark3", "coachMark4", "onboarding-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        DownloadableAssetType downloadableAssetType = DownloadableAssetType.IMAGE;
        new DownloadableAsset(downloadableAssetType, "https://prod.mobile-api.woolworths.com.au/zeus/mnemosyne/v1/public/onboarding/in_app_card_coachmark.png", 1372, 688, null, null);
        new ContentCta("Next", "com.woolworths.rewards://progressiveOnboarding/next", (String) null, (Boolean) null, (AnalyticsData) null, 28, (DefaultConstructorMarker) null);
        new DownloadableAsset(downloadableAssetType, "https://prod.mobile-api.woolworths.com.au/zeus/mnemosyne/v1/public/onboarding/boost_coachmark.png", 1372, 688, null, null);
        new ContentCta("Previous", "com.woolworths.rewards://progressiveOnboarding/previous", (String) null, (Boolean) null, (AnalyticsData) null, 28, (DefaultConstructorMarker) null);
        new ContentCta("Next", "com.woolworths.rewards://progressiveOnboarding/next", (String) null, (Boolean) null, (AnalyticsData) null, 28, (DefaultConstructorMarker) null);
        new DownloadableAsset(downloadableAssetType, "https://prod.mobile-api.woolworths.com.au/zeus/mnemosyne/v1/public/onboarding/rewards_coachmark.png", 1372, 688, null, null);
        new ContentCta("Previous", "com.woolworths.rewards://progressiveOnboarding/previous", (String) null, (Boolean) null, (AnalyticsData) null, 28, (DefaultConstructorMarker) null);
        new ContentCta("Next", "com.woolworths.rewards://progressiveOnboarding/next", (String) null, (Boolean) null, (AnalyticsData) null, 28, (DefaultConstructorMarker) null);
        new DownloadableAsset(downloadableAssetType, "https://prod.mobile-api.woolworths.com.au/zeus/mnemosyne/v1/public/onboarding/fuel_voucher_coachmark.png", 1372, 688, null, null);
        new ContentCta("Previous", "com.woolworths.rewards://progressiveOnboarding/previous", (String) null, (Boolean) null, (AnalyticsData) null, 28, (DefaultConstructorMarker) null);
        new ContentCta("Finish", "com.woolworths.rewards://progressiveOnboarding/next", (String) null, (Boolean) null, (AnalyticsData) null, 28, (DefaultConstructorMarker) null);
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final Sequence getValues() {
        return null;
    }
}
