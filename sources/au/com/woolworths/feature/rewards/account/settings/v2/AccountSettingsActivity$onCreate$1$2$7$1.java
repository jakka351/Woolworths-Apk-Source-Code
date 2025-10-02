package au.com.woolworths.feature.rewards.account.settings.v2;

import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.analytics.Screens;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.feature.rewards.account.settings.v2.AccountSettingsContract;
import au.com.woolworths.foundation.rewards.banner.model.RewardsNotificationBannerApiData;
import au.com.woolworths.rewards.base.homepage.RewardsBannerInteractor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class AccountSettingsActivity$onCreate$1$2$7$1 extends FunctionReferenceImpl implements Function1<RewardsNotificationBannerApiData, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String url;
        final RewardsNotificationBannerApiData p0 = (RewardsNotificationBannerApiData) obj;
        Intrinsics.h(p0, "p0");
        AccountSettingsViewModel accountSettingsViewModel = (AccountSettingsViewModel) this.receiver;
        accountSettingsViewModel.getClass();
        RewardsBannerInteractor rewardsBannerInteractor = accountSettingsViewModel.h;
        String bannerDataId = p0.getId();
        rewardsBannerInteractor.getClass();
        Intrinsics.h(bannerDataId, "bannerDataId");
        rewardsBannerInteractor.b.add(bannerDataId);
        ContentCta primaryCta = p0.getPrimaryCta();
        if (primaryCta != null && (url = primaryCta.getUrl()) != null) {
            accountSettingsViewModel.m.k(new AccountSettingsContract.Action.OpenUrl(url));
        }
        AnalyticsManager analyticsManager = accountSettingsViewModel.j;
        Action action = new Action(p0) { // from class: au.com.woolworths.feature.rewards.account.settings.v2.AccountSettingsViewModel$onBannerActionButtonClick$2
            public final Screens d = Screens.D;
            public final Category e = Category.G;
            public final String f;

            {
                String label;
                ContentCta primaryCta2 = p0.getPrimaryCta();
                this.f = (primaryCta2 == null || (label = primaryCta2.getLabel()) == null) ? "" : label;
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
        TrackingMetadata trackingMetadataA = TrackingMetadata.Companion.a(TrackableValue.q0, p0.getId());
        TrackableValue trackableValue = TrackableValue.o0;
        String title = p0.getTitle();
        if (title == null) {
            title = "";
        }
        trackingMetadataA.b(trackableValue, title);
        analyticsManager.j(action, trackingMetadataA);
        return Unit.f24250a;
    }
}
