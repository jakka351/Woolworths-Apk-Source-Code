package au.com.woolworths.shop.product.navigation.ui.subcategory;

import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class SubCategoryActivity_MembersInjector implements MembersInjector<SubCategoryActivity> {
    public static void a(SubCategoryActivity subCategoryActivity, CartUpdateInteractor cartUpdateInteractor) {
        subCategoryActivity.x = cartUpdateInteractor;
    }

    public static void b(SubCategoryActivity subCategoryActivity, FeatureToggleManager featureToggleManager) {
        subCategoryActivity.y = featureToggleManager;
    }
}
