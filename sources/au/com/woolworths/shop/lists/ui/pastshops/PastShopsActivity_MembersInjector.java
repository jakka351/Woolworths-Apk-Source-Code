package au.com.woolworths.shop.lists.ui.pastshops;

import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class PastShopsActivity_MembersInjector implements MembersInjector<PastShopsActivity> {
    public static void a(PastShopsActivity pastShopsActivity, CartUpdateInteractor cartUpdateInteractor) {
        pastShopsActivity.x = cartUpdateInteractor;
    }

    public static void b(PastShopsActivity pastShopsActivity, FeatureToggleManager featureToggleManager) {
        pastShopsActivity.y = featureToggleManager;
    }
}
