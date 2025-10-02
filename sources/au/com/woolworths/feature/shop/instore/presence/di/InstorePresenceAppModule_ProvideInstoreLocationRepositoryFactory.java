package au.com.woolworths.feature.shop.instore.presence.di;

import au.com.woolworths.feature.shop.instore.presence.data.InstorePresenceRepository;
import au.com.woolworths.foundation.shop.storelocator.network.StoreLocatorApiInterface;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class InstorePresenceAppModule_ProvideInstoreLocationRepositoryFactory implements Factory<InstorePresenceRepository> {
    public static InstorePresenceRepository a(InstorePresenceAppModule instorePresenceAppModule, StoreLocatorApiInterface storeLocatorApiInterface) {
        instorePresenceAppModule.getClass();
        return new InstorePresenceRepository(storeLocatorApiInterface);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
