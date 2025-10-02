package au.com.woolworths.feature.rewards.account.settings;

import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.analytics.Screens;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.foundation.rewards.banner.model.RewardsNotificationBannerApiData;
import au.com.woolworths.rewards.base.homepage.RewardsBannerInteractor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.account.settings.AccountSettingsControllerOld$buildAccountBanner$1$1$3$1", f = "AccountSettingsControllerOld.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AccountSettingsControllerOld$buildAccountBanner$1$1$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ AccountSettingsControllerOld p;
    public final /* synthetic */ RewardsNotificationBannerApiData q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountSettingsControllerOld$buildAccountBanner$1$1$3$1(AccountSettingsControllerOld accountSettingsControllerOld, RewardsNotificationBannerApiData rewardsNotificationBannerApiData, Continuation continuation) {
        super(2, continuation);
        this.p = accountSettingsControllerOld;
        this.q = rewardsNotificationBannerApiData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AccountSettingsControllerOld$buildAccountBanner$1$1$3$1(this.p, this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        AccountSettingsControllerOld$buildAccountBanner$1$1$3$1 accountSettingsControllerOld$buildAccountBanner$1$1$3$1 = (AccountSettingsControllerOld$buildAccountBanner$1$1$3$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        accountSettingsControllerOld$buildAccountBanner$1$1$3$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        AccountSettingsControllerOld accountSettingsControllerOld = this.p;
        RewardsBannerInteractor rewardsBannerInteractor = accountSettingsControllerOld.rewardsBannerInteractor;
        RewardsNotificationBannerApiData rewardsNotificationBannerApiData = this.q;
        if (!CollectionsKt.t(rewardsBannerInteractor.d, rewardsNotificationBannerApiData.getId())) {
            RewardsBannerInteractor rewardsBannerInteractor2 = accountSettingsControllerOld.rewardsBannerInteractor;
            String bannerDataId = rewardsNotificationBannerApiData.getId();
            rewardsBannerInteractor2.getClass();
            Intrinsics.h(bannerDataId, "bannerDataId");
            rewardsBannerInteractor2.d.add(bannerDataId);
            AnalyticsManager analyticsManager = accountSettingsControllerOld.analyticsManager;
            Action action = new Action(rewardsNotificationBannerApiData) { // from class: au.com.woolworths.feature.rewards.account.settings.AccountSettingsControllerOld$buildAccountBanner$1$1$3$1.1
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
