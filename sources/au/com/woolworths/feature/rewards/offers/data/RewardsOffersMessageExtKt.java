package au.com.woolworths.feature.rewards.offers.data;

import au.com.woolworths.rewards.RewardsEmptyStateIconExtKt;
import au.com.woolworths.rewards.base.data.RewardsEmptyStateData;
import au.com.woolworths.rewards.base.data.RewardsEmptyStateIcon;
import com.woolworths.R;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"offers_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RewardsOffersMessageExtKt {
    public static final RewardsEmptyStateData a(RewardsOffersMessage rewardsOffersMessage) {
        if (rewardsOffersMessage == null) {
            return null;
        }
        RewardsEmptyStateIcon rewardsEmptyStateIcon = rewardsOffersMessage.f6294a;
        int i = rewardsEmptyStateIcon == null ? -1 : RewardsEmptyStateIconExtKt.WhenMappings.f9345a[rewardsEmptyStateIcon.ordinal()];
        return new RewardsEmptyStateData(i != 1 ? i != 2 ? 0 : R.drawable.ic_rewards_booster : R.drawable.ic_rewards_fuel_detailed, rewardsOffersMessage.b, rewardsOffersMessage.c, null, null, 24, null);
    }
}
