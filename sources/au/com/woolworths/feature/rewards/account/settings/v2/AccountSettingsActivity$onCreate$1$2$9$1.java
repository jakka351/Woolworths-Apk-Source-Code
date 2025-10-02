package au.com.woolworths.feature.rewards.account.settings.v2;

import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.analytics.Screens;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.feature.rewards.account.settings.v2.model.AccountItemSeen;
import au.com.woolworths.foundation.rewards.banner.model.RewardsNotificationBannerApiData;
import au.com.woolworths.rewards.base.homepage.RewardsBannerInteractor;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class AccountSettingsActivity$onCreate$1$2$9$1 extends FunctionReferenceImpl implements Function1<AccountItemSeen, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AccountItemSeen p0 = (AccountItemSeen) obj;
        Intrinsics.h(p0, "p0");
        AccountSettingsViewModel accountSettingsViewModel = (AccountSettingsViewModel) this.receiver;
        accountSettingsViewModel.getClass();
        if (!(p0 instanceof AccountItemSeen.Banner)) {
            throw new NoWhenBranchMatchedException();
        }
        final RewardsNotificationBannerApiData rewardsNotificationBannerApiData = ((AccountItemSeen.Banner) p0).f5791a;
        RewardsBannerInteractor rewardsBannerInteractor = accountSettingsViewModel.h;
        if (!CollectionsKt.t(rewardsBannerInteractor.d, rewardsNotificationBannerApiData.getId())) {
            String bannerDataId = rewardsNotificationBannerApiData.getId();
            Intrinsics.h(bannerDataId, "bannerDataId");
            rewardsBannerInteractor.d.add(bannerDataId);
            AnalyticsManager analyticsManager = accountSettingsViewModel.j;
            Action action = new Action(rewardsNotificationBannerApiData) { // from class: au.com.woolworths.feature.rewards.account.settings.v2.AccountSettingsViewModel$onBannerSeen$1
                public final Screens d = Screens.D;
                public final Category e = Category.H;
                public final String f;

                {
                    String label;
                    ContentCta primaryCta = rewardsNotificationBannerApiData.getPrimaryCta();
                    this.f = (primaryCta == null || (label = primaryCta.getLabel()) == null) ? "" : label;
                }

                @Override // au.com.woolworths.android.onesite.analytics.BaseAction
                /* renamed from: a, reason: from getter */
                public final String getF() {
                    return this.f;
                }

                @Override // au.com.woolworths.android.onesite.analytics.BaseAction
                /* renamed from: b, reason: from getter */
                public final Category getE() {
                    return this.e;
                }

                @Override // au.com.woolworths.android.onesite.analytics.Action
                /* renamed from: f */
                public final Screen getD() {
                    return this.d;
                }
            };
            TrackingMetadata trackingMetadataA = TrackingMetadata.Companion.a(TrackableValue.q0, rewardsNotificationBannerApiData.getId());
            TrackableValue trackableValue = TrackableValue.o0;
            String title = rewardsNotificationBannerApiData.getTitle();
            if (title == null) {
                title = "";
            }
            trackingMetadataA.b(trackableValue, title);
            analyticsManager.j(action, trackingMetadataA);
        }
        return Unit.f24250a;
    }
}
