package au.com.woolworths.android.onesite.app.di;

import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.repository.LaunchManager;
import au.com.woolworths.android.onesite.repository.LaunchManagerImpl;
import au.com.woolworths.android.onesite.repository.PreferencesManager;
import au.com.woolworths.foundation.shop.storelocator.PickUpLocatorRepository;
import dagger.Lazy;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class AppModule_ProvideLaunchManagerFactory implements Factory<LaunchManager> {
    public static LaunchManagerImpl a(AppModule appModule, Lazy rewardsAccountInteractorLazy, Lazy collectionModeInteractorLazy, Lazy repositoryManagerLazy, Lazy shoppingModeRepositoryLazy, Lazy accountInteractorLazy, FeatureToggleManager featureToggleManager, PreferencesManager preferencesManager, PickUpLocatorRepository pickUpLocatorRepository) {
        appModule.getClass();
        Intrinsics.h(rewardsAccountInteractorLazy, "rewardsAccountInteractorLazy");
        Intrinsics.h(collectionModeInteractorLazy, "collectionModeInteractorLazy");
        Intrinsics.h(repositoryManagerLazy, "repositoryManagerLazy");
        Intrinsics.h(shoppingModeRepositoryLazy, "shoppingModeRepositoryLazy");
        Intrinsics.h(accountInteractorLazy, "accountInteractorLazy");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(preferencesManager, "preferencesManager");
        Intrinsics.h(pickUpLocatorRepository, "pickUpLocatorRepository");
        LaunchManagerImpl launchManagerImpl = new LaunchManagerImpl();
        launchManagerImpl.f4586a = rewardsAccountInteractorLazy;
        launchManagerImpl.b = collectionModeInteractorLazy;
        launchManagerImpl.c = repositoryManagerLazy;
        launchManagerImpl.d = shoppingModeRepositoryLazy;
        launchManagerImpl.e = accountInteractorLazy;
        launchManagerImpl.f = preferencesManager;
        launchManagerImpl.g = preferencesManager.g();
        launchManagerImpl.h = featureToggleManager;
        launchManagerImpl.i = pickUpLocatorRepository;
        return launchManagerImpl;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        DoubleCheck.a(null);
        DoubleCheck.a(null);
        DoubleCheck.a(null);
        DoubleCheck.a(null);
        DoubleCheck.a(null);
        throw null;
    }
}
