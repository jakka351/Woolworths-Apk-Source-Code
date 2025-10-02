package au.com.woolworths.feature.shop.instore.navigation.di;

import android.content.SharedPreferences;
import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.feature.shop.instore.navigation.map.InstoreNavigationInteractorImpl;
import au.com.woolworths.feature.shop.instore.navigation.map.domain.BuildingInteractor;
import au.com.woolworths.feature.shop.instore.navigation.map.domain.CredentialsInteractor;
import au.com.woolworths.feature.shop.instore.navigation.map.domain.PositioningInteractor;
import au.com.woolworths.feature.shop.storelocator.legacy.LegacyStoreLocatorInteractorImpl;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.foundation.shop.instore.navigation.map.InstoreNavigationInteractor;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class InstoreNavigationAppModule_ProvideInstoreNavigationInteractorFactory implements Factory<InstoreNavigationInteractor> {
    public static InstoreNavigationInteractorImpl a(InstoreNavigationAppModule instoreNavigationAppModule, CollectionModeInteractor collectionModeInteractor, PositioningInteractor positioningInteractor, CredentialsInteractor credentialsInteractor, BuildingInteractor buildingInteractor, LegacyStoreLocatorInteractorImpl legacyStoreLocatorInteractorImpl, SharedPreferences sharedPreferences, FeatureToggleManager featureToggleManager, DispatcherProvider dispatcher) {
        instoreNavigationAppModule.getClass();
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        Intrinsics.h(positioningInteractor, "positioningInteractor");
        Intrinsics.h(credentialsInteractor, "credentialsInteractor");
        Intrinsics.h(buildingInteractor, "buildingInteractor");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(dispatcher, "dispatcher");
        return new InstoreNavigationInteractorImpl(collectionModeInteractor, positioningInteractor, credentialsInteractor, buildingInteractor, legacyStoreLocatorInteractorImpl, sharedPreferences, featureToggleManager, dispatcher);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
