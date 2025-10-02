package au.com.woolworths.foundation.rewards.banner.model;

import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.foundation.rewards.common.ui.banners.data.RewardsNotificationBannerData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"banner-model_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RewardsNotificationBannerApiDataKt {
    public static final RewardsNotificationBannerData a(RewardsNotificationBannerApiData rewardsNotificationBannerApiData) {
        Intrinsics.h(rewardsNotificationBannerApiData, "<this>");
        Integer numValueOf = Integer.valueOf(rewardsNotificationBannerApiData.getDisplayType().d);
        long j = rewardsNotificationBannerApiData.getDisplayType().e;
        String title = rewardsNotificationBannerApiData.getTitle();
        String message = rewardsNotificationBannerApiData.getMessage();
        long j2 = rewardsNotificationBannerApiData.getDisplayType().f;
        ContentCta primaryCta = rewardsNotificationBannerApiData.getPrimaryCta();
        return new RewardsNotificationBannerData(numValueOf, j, title, message, j2, primaryCta != null ? primaryCta.getLabel() : null, Boolean.valueOf(rewardsNotificationBannerApiData.getCanDismiss()), Boolean.valueOf(rewardsNotificationBannerApiData.getShouldShowNewBadge()), rewardsNotificationBannerApiData.getAnalytics());
    }
}
