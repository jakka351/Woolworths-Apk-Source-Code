package au.com.woolworths.shop.rewards;

import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class ShopRewardsActivity_MembersInjector implements MembersInjector<ShopRewardsActivity> {
    public static void a(ShopRewardsActivity shopRewardsActivity, FeatureToggleManager featureToggleManager) {
        shopRewardsActivity.x = featureToggleManager;
    }

    public static void b(ShopRewardsActivity shopRewardsActivity, RewardsAccountInteractor rewardsAccountInteractor) {
        shopRewardsActivity.y = rewardsAccountInteractor;
    }
}
