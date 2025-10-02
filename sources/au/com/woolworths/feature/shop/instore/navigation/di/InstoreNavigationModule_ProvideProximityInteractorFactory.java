package au.com.woolworths.feature.shop.instore.navigation.di;

import au.com.woolworths.feature.shop.instore.navigation.map.domain.BuildingInteractor;
import au.com.woolworths.feature.shop.instore.navigation.map.domain.ProximityInteractor;
import au.com.woolworths.feature.shop.instore.navigation.map.domain.ProximityInteractorImpl;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class InstoreNavigationModule_ProvideProximityInteractorFactory implements Factory<ProximityInteractor> {
    public static ProximityInteractorImpl a(InstoreNavigationModule instoreNavigationModule, BuildingInteractor buildingInteractor) {
        instoreNavigationModule.getClass();
        Intrinsics.h(buildingInteractor, "buildingInteractor");
        return new ProximityInteractorImpl(buildingInteractor);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
