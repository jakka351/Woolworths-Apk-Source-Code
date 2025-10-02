package au.com.woolworths.feature.rewards.offers.listpage;

import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class OfferListPageActivity_MembersInjector implements MembersInjector<OfferListPageActivity> {
    public static void a(OfferListPageActivity offerListPageActivity, FeatureToggleManager featureToggleManager) {
        offerListPageActivity.x = featureToggleManager;
    }

    public static void b(OfferListPageActivity offerListPageActivity, RewardsAccountInteractor rewardsAccountInteractor) {
        offerListPageActivity.y = rewardsAccountInteractor;
    }
}
