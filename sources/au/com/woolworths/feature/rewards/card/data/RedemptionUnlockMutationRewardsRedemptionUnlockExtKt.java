package au.com.woolworths.feature.rewards.card.data;

import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.android.onesite.data.DownloadableAsset;
import au.com.woolworths.android.onesite.data.DownloadableAssetFit;
import au.com.woolworths.rewards.base.data.RewardsRedemptionUnlockButton;
import au.com.woolworths.rewards.base.data.RewardsRedemptionUnlockConfirmation;
import au.com.woolworths.rewards.graphql.type.DownloadableAssetType;
import com.woolworths.rewards.card.RedemptionUnlockMutation;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"card_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RedemptionUnlockMutationRewardsRedemptionUnlockExtKt {
    public static final RewardsRedemptionUnlockConfirmation a(RedemptionUnlockMutation.RewardsRedemptionUnlock rewardsRedemptionUnlock) {
        DownloadableAssetFit downloadableAssetFit;
        Intrinsics.h(rewardsRedemptionUnlock, "<this>");
        String str = rewardsRedemptionUnlock.f20651a;
        RedemptionUnlockMutation.HeaderImage headerImage = rewardsRedemptionUnlock.b;
        Intrinsics.h(headerImage, "<this>");
        DownloadableAssetType downloadableAssetType = headerImage.f20650a;
        Intrinsics.h(downloadableAssetType, "<this>");
        int iOrdinal = downloadableAssetType.ordinal();
        au.com.woolworths.android.onesite.data.DownloadableAssetType downloadableAssetType2 = iOrdinal != 0 ? iOrdinal != 1 ? au.com.woolworths.android.onesite.data.DownloadableAssetType.d : au.com.woolworths.android.onesite.data.DownloadableAssetType.IMAGE : au.com.woolworths.android.onesite.data.DownloadableAssetType.LOTTIE_ANIMATION;
        String str2 = headerImage.b;
        int i = headerImage.c;
        int i2 = headerImage.d;
        au.com.woolworths.rewards.graphql.type.DownloadableAssetFit downloadableAssetFit2 = headerImage.e;
        if (downloadableAssetFit2 != null) {
            int iOrdinal2 = downloadableAssetFit2.ordinal();
            downloadableAssetFit = (iOrdinal2 == 0 || iOrdinal2 != 1) ? DownloadableAssetFit.ASPECT_FILL : DownloadableAssetFit.CENTER;
        } else {
            downloadableAssetFit = null;
        }
        DownloadableAsset downloadableAsset = new DownloadableAsset(downloadableAssetType2, str2, i, i2, downloadableAssetFit, (String) null, 32, (DefaultConstructorMarker) null);
        String str3 = rewardsRedemptionUnlock.c;
        String str4 = rewardsRedemptionUnlock.e;
        boolean z = rewardsRedemptionUnlock.d;
        RedemptionUnlockMutation.Button button = rewardsRedemptionUnlock.f;
        Intrinsics.h(button, "<this>");
        RewardsRedemptionUnlockButton rewardsRedemptionUnlockButton = new RewardsRedemptionUnlockButton(button.b, button.f20647a, null, button.c);
        String str5 = rewardsRedemptionUnlock.g;
        RedemptionUnlockMutation.CallToAction callToAction = rewardsRedemptionUnlock.h;
        return new RewardsRedemptionUnlockConfirmation(str, downloadableAsset, str3, str4, z, rewardsRedemptionUnlockButton, str5, callToAction != null ? new ContentCta(callToAction.f20648a, callToAction.b, (String) null, (Boolean) null, (AnalyticsData) null, 28, (DefaultConstructorMarker) null) : null, null, rewardsRedemptionUnlock.i);
    }
}
