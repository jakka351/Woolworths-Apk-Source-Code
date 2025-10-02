package au.com.woolworths.shop.rewards;

import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class RewardsActivityLegacy_MembersInjector implements MembersInjector<RewardsActivityLegacy> {
    public static void a(RewardsActivityLegacy rewardsActivityLegacy, RewardsAccountInteractor rewardsAccountInteractor) {
        rewardsActivityLegacy.x = rewardsAccountInteractor;
    }
}
