package au.com.woolworths.shop.cart.ui;

import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class CartActivity_MembersInjector implements MembersInjector<CartActivity> {
    public static void a(CartActivity cartActivity, CollectionModeInteractor collectionModeInteractor) {
        cartActivity.x = collectionModeInteractor;
    }

    public static void b(CartActivity cartActivity, FeatureToggleManager featureToggleManager) {
        cartActivity.y = featureToggleManager;
    }
}
