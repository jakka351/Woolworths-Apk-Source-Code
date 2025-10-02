package au.com.woolworths.feature.shop.recipes.details;

import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class RecipeDetailsActivity_MembersInjector implements MembersInjector<RecipeDetailsActivity> {
    public static void a(RecipeDetailsActivity recipeDetailsActivity, AnalyticsManager analyticsManager) {
        recipeDetailsActivity.x = analyticsManager;
    }

    public static void b(RecipeDetailsActivity recipeDetailsActivity, FeatureToggleManager featureToggleManager) {
        recipeDetailsActivity.w = featureToggleManager;
    }
}
