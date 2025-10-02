package au.com.woolworths.feature.shop.instore.navigation.di;

import au.com.woolworths.feature.shop.instore.navigation.map.domain.BuildingInteractor;
import au.com.woolworths.feature.shop.instore.navigation.map.domain.PositioningInteractor;
import au.com.woolworths.feature.shop.instore.navigation.map.domain.RoutingInteractor;
import au.com.woolworths.feature.shop.instore.navigation.map.domain.RoutingInteractorImpl;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class InstoreNavigationModule_ProvideRoutingInteractorFactory implements Factory<RoutingInteractor> {
    public static RoutingInteractorImpl a(InstoreNavigationModule instoreNavigationModule, PositioningInteractor positioningManager, BuildingInteractor buildingManager) {
        instoreNavigationModule.getClass();
        Intrinsics.h(positioningManager, "positioningManager");
        Intrinsics.h(buildingManager, "buildingManager");
        return new RoutingInteractorImpl(positioningManager, buildingManager);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
