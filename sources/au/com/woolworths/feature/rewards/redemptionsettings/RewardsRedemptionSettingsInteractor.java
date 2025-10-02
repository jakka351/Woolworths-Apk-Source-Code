package au.com.woolworths.feature.rewards.redemptionsettings;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.base.rewards.account.RedemptionStateRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/redemptionsettings/RewardsRedemptionSettingsInteractor;", "", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RewardsRedemptionSettingsInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final RewardsRedemptionSettingsRepository f6433a;
    public final RedemptionStateRepository b;

    public RewardsRedemptionSettingsInteractor(RewardsRedemptionSettingsRepository rewardsRedemptionSettingsRepository, RedemptionStateRepository redemptionSettingRepository) {
        Intrinsics.h(redemptionSettingRepository, "redemptionSettingRepository");
        this.f6433a = rewardsRedemptionSettingsRepository;
        this.b = redemptionSettingRepository;
    }
}
