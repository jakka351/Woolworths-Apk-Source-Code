package au.com.woolworths.feature.rewards.account.sso;

import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.feature.shared.web.file.uploader.WebChromeFileUploadHelper;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class RewardsMagicLinkActivity_MembersInjector implements MembersInjector<RewardsMagicLinkActivity> {
    public static void a(RewardsMagicLinkActivity rewardsMagicLinkActivity, FeatureToggleManager featureToggleManager) {
        rewardsMagicLinkActivity.y = featureToggleManager;
    }

    public static void b(RewardsMagicLinkActivity rewardsMagicLinkActivity, WebChromeFileUploadHelper webChromeFileUploadHelper) {
        rewardsMagicLinkActivity.z = webChromeFileUploadHelper;
    }

    public static void c(RewardsMagicLinkActivity rewardsMagicLinkActivity, MandyJsInterface mandyJsInterface) {
        rewardsMagicLinkActivity.A = mandyJsInterface;
    }
}
