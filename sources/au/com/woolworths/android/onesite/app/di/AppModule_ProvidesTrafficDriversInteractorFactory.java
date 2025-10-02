package au.com.woolworths.android.onesite.app.di;

import au.com.woolworths.feature.shop.trafficdrivers.TrafficDriversInteractor;
import au.com.woolworths.feature.shop.trafficdrivers.TrafficDriversRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class AppModule_ProvidesTrafficDriversInteractorFactory implements Factory<TrafficDriversInteractor> {
    public static TrafficDriversInteractor a(AppModule appModule, TrafficDriversRepository trafficDriversRepository) {
        appModule.getClass();
        return new TrafficDriversInteractor(trafficDriversRepository);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
