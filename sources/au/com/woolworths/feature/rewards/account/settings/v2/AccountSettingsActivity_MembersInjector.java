package au.com.woolworths.feature.rewards.account.settings.v2;

import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class AccountSettingsActivity_MembersInjector implements MembersInjector<AccountSettingsActivity> {
    public static void a(AccountSettingsActivity accountSettingsActivity, FeatureToggleManager featureToggleManager) {
        accountSettingsActivity.x = featureToggleManager;
    }
}
