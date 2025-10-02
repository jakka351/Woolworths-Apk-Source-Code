package au.com.woolworths.feature.rewards.account.settings.v2;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.feature.shared.feedback.medallia.MedalliaInteractor;
import au.com.woolworths.rewards.base.homepage.AccountNotificationBadgeInteractor;
import au.com.woolworths.rewards.base.homepage.RewardsBannerInteractor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/settings/v2/AccountSettingsInteractor;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class AccountSettingsInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final AccountSettingsRepository f5786a;
    public final MedalliaInteractor b;
    public final RewardsBannerInteractor c;
    public final AccountNotificationBadgeInteractor d;
    public final FeatureToggleManager e;

    public AccountSettingsInteractor(AccountSettingsRepository accountSettingsRepository, MedalliaInteractor medalliaInteractor, RewardsBannerInteractor rewardsBannerInteractor, AccountNotificationBadgeInteractor accountNotificationBadgeInteractor, FeatureToggleManager featureToggleManager) {
        Intrinsics.h(medalliaInteractor, "medalliaInteractor");
        Intrinsics.h(rewardsBannerInteractor, "rewardsBannerInteractor");
        Intrinsics.h(accountNotificationBadgeInteractor, "accountNotificationBadgeInteractor");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.f5786a = accountSettingsRepository;
        this.b = medalliaInteractor;
        this.c = rewardsBannerInteractor;
        this.d = accountNotificationBadgeInteractor;
        this.e = featureToggleManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0195  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.rewards.account.settings.v2.AccountSettingsInteractor.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
