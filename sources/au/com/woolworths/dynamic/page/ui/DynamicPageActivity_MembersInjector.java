package au.com.woolworths.dynamic.page.ui;

import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class DynamicPageActivity_MembersInjector implements MembersInjector<DynamicPageActivity> {
    public static void a(DynamicPageActivity dynamicPageActivity, FeatureToggleManager featureToggleManager) {
        dynamicPageActivity.x = featureToggleManager;
    }
}
