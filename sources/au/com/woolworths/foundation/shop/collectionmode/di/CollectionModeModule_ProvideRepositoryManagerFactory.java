package au.com.woolworths.foundation.shop.collectionmode.di;

import android.content.SharedPreferences;
import au.com.woolworths.android.onesite.analytics.FirebaseAnalyticsLogger;
import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.repository.PreferencesManager;
import au.com.woolworths.android.onesite.rxutils.SchedulersProvider;
import au.com.woolworths.base.shopapp.appdata.LegacyShopAnalyticsManager;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.foundation.shop.collectionmode.RepositoryManager;
import au.com.woolworths.foundation.shop.collectionmode.RepositoryManagerImpl;
import au.com.woolworths.foundation.shop.storelocator.network.StoreLocatorApiInterface;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class CollectionModeModule_ProvideRepositoryManagerFactory implements Factory<RepositoryManager> {
    public static RepositoryManagerImpl a(CollectionModeModule collectionModeModule, PreferencesManager preferencesManager, StoreLocatorApiInterface storeLocatorApiInterface, CollectionModeInteractor collectionModeInteractor, LegacyShopAnalyticsManager analyticsManager, FirebaseAnalyticsLogger firebaseAnalyticsLogger, DispatcherProvider dispatcherProvider, SchedulersProvider schedulersProvider, SharedPreferences sharedPreferences, FeatureToggleManager featureToggleManager) {
        collectionModeModule.getClass();
        Intrinsics.h(preferencesManager, "preferencesManager");
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(firebaseAnalyticsLogger, "firebaseAnalyticsLogger");
        Intrinsics.h(dispatcherProvider, "dispatcherProvider");
        Intrinsics.h(schedulersProvider, "schedulersProvider");
        Intrinsics.h(sharedPreferences, "sharedPreferences");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        return new RepositoryManagerImpl(preferencesManager, storeLocatorApiInterface, collectionModeInteractor, analyticsManager, firebaseAnalyticsLogger, dispatcherProvider, schedulersProvider, sharedPreferences, featureToggleManager);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
