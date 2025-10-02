package au.com.woolworths.feature.shop.account.ui.delete;

import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.shop.auth.ShopAuthManager;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class DeleteAccountActivity_MembersInjector implements MembersInjector<DeleteAccountActivity> {
    public static void a(DeleteAccountActivity deleteAccountActivity, ShopAuthManager shopAuthManager) {
        deleteAccountActivity.y = shopAuthManager;
    }

    public static void b(DeleteAccountActivity deleteAccountActivity, FeatureToggleManager featureToggleManager) {
        deleteAccountActivity.x = featureToggleManager;
    }
}
