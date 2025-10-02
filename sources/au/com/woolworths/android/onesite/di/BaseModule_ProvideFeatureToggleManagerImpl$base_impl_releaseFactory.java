package au.com.woolworths.android.onesite.di;

import android.app.Application;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManagerImpl;
import au.com.woolworths.android.onesite.featuretoggles.FirebaseRepository;
import au.com.woolworths.android.onesite.repository.ReleaseSettingsInteractorImpl;
import au.com.woolworths.android.onesite.utils.ConnectionManager;
import com.google.common.collect.ImmutableSet;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class BaseModule_ProvideFeatureToggleManagerImpl$base_impl_releaseFactory implements Factory<FeatureToggleManagerImpl> {
    public static FeatureToggleManagerImpl a(Application application, ImmutableSet features, ImmutableSet remoteConfigs, ReleaseSettingsInteractorImpl releaseSettingsInteractorImpl, FirebaseRepository firebaseRepository, ConnectionManager connectionManager) {
        Intrinsics.h(features, "features");
        Intrinsics.h(remoteConfigs, "remoteConfigs");
        Intrinsics.h(firebaseRepository, "firebaseRepository");
        Intrinsics.h(connectionManager, "connectionManager");
        return new FeatureToggleManagerImpl(application, features, remoteConfigs, firebaseRepository, connectionManager);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
