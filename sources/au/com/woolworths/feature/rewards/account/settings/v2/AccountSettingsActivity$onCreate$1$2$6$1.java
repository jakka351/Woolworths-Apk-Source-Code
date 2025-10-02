package au.com.woolworths.feature.rewards.account.settings.v2;

import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.analytics.Screens;
import au.com.woolworths.feature.rewards.account.settings.v2.AccountSettingsContract;
import au.com.woolworths.feature.rewards.account.settings.v2.model.RewardsAccountMenu;
import au.com.woolworths.foundation.rewards.banner.model.RewardsNotificationBannerApiData;
import au.com.woolworths.rewards.base.homepage.CacheType;
import au.com.woolworths.rewards.base.homepage.RewardsBannerInteractor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class AccountSettingsActivity$onCreate$1$2$6$1 extends FunctionReferenceImpl implements Function1<RewardsNotificationBannerApiData, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        RewardsNotificationBannerApiData p0 = (RewardsNotificationBannerApiData) obj;
        Intrinsics.h(p0, "p0");
        AccountSettingsViewModel accountSettingsViewModel = (AccountSettingsViewModel) this.receiver;
        accountSettingsViewModel.getClass();
        RewardsBannerInteractor rewardsBannerInteractor = accountSettingsViewModel.h;
        String id = p0.getId();
        CacheType[] cacheTypeArr = CacheType.d;
        rewardsBannerInteractor.a(id);
        MutableStateFlow mutableStateFlow = accountSettingsViewModel.k;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.d(value, AccountSettingsContract.ViewState.a((AccountSettingsContract.ViewState) value, false, false, RewardsAccountMenu.a(((AccountSettingsContract.ViewState) mutableStateFlow.getValue()).c, null, 6), null, false, false, false, 251)));
        accountSettingsViewModel.t6();
        AnalyticsManager analyticsManager = accountSettingsViewModel.j;
        Action action = new Action() { // from class: au.com.woolworths.feature.rewards.account.settings.v2.AccountSettingsViewModel$onBannerCloseButtonClick$2
            public final Screens d = Screens.D;
            public final Category e = Category.G;
            public final String f = "Close";

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
