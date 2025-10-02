package au.com.woolworths.feature.shop.instore.navigation.di;

import au.com.woolworths.feature.shop.instore.navigation.map.utils.PositionAnimator;
import au.com.woolworths.feature.shop.instore.navigation.map.utils.PositionAnimatorImpl;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class InstoreNavigationModule_ProvidePositionAnimatorFactory implements Factory<PositionAnimator> {
    public static PositionAnimatorImpl a(InstoreNavigationModule instoreNavigationModule) {
        instoreNavigationModule.getClass();
        return new PositionAnimatorImpl();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a(null);
        throw null;
    }
}
