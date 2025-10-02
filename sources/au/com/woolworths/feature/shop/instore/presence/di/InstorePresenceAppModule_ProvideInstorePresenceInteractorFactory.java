package au.com.woolworths.feature.shop.instore.presence.di;

import android.content.Context;
import android.content.SharedPreferences;
import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.feature.shop.instore.presence.data.InstorePresenceRepository;
import au.com.woolworths.feature.shop.instore.presence.domain.InstorePresenceAnalyticsProvider;
import au.com.woolworths.feature.shop.instore.presence.domain.InstorePresenceInteractorImpl;
import au.com.woolworths.feature.shop.storelocator.legacy.LegacyStoreLocatorInteractorImpl;
import au.com.woolworths.foundation.shared.instore.wifi.InStoreWifiInteractor;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.foundation.shop.collectionmode.RepositoryManager;
import au.com.woolworths.foundation.shop.instore.presence.domain.InstorePresenceInteractor;
import au.com.woolworths.geolocation.location.LocationInteractor;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class InstorePresenceAppModule_ProvideInstorePresenceInteractorFactory implements Factory<InstorePresenceInteractor> {
    public static InstorePresenceInteractorImpl a(InstorePresenceAppModule instorePresenceAppModule, Context context, CollectionModeInteractor collectionModeInteractor, InstorePresenceRepository instoreLocationRepository, RepositoryManager repositoryManager, InStoreWifiInteractor inStoreWifiInteractor, LocationInteractor locationInteractor, LegacyStoreLocatorInteractorImpl legacyStoreLocatorInteractorImpl, FeatureToggleManager featureToggleManager, SharedPreferences sharedPreferences, InstorePresenceAnalyticsProvider instorePresenceAnalyticsProvider, DispatcherProvider dispatcherProvider) {
        instorePresenceAppModule.getClass();
        Intrinsics.h(context, "context");
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        Intrinsics.h(instoreLocationRepository, "instoreLocationRepository");
        Intrinsics.h(repositoryManager, "repositoryManager");
        Intrinsics.h(inStoreWifiInteractor, "inStoreWifiInteractor");
        Intrinsics.h(locationInteractor, "locationInteractor");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(instorePresenceAnalyticsProvider, "instorePresenceAnalyticsProvider");
        Intrinsics.h(dispatcherProvider, "dispatcherProvider");
        return new InstorePresenceInteractorImpl(context, collectionModeInteractor, instoreLocationRepository, repositoryManager, inStoreWifiInteractor, locationInteractor, legacyStoreLocatorInteractorImpl, featureToggleManager, sharedPreferences, instorePresenceAnalyticsProvider, dispatcherProvider);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
