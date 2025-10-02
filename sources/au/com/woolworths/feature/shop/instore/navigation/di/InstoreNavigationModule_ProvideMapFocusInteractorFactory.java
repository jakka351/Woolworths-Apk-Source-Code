package au.com.woolworths.feature.shop.instore.navigation.di;

import au.com.woolworths.feature.shop.instore.navigation.map.domain.BuildingInteractor;
import au.com.woolworths.feature.shop.instore.navigation.map.domain.MapFocusInteractor;
import au.com.woolworths.feature.shop.instore.navigation.map.domain.MapFocusManagerImpl;
import au.com.woolworths.feature.shop.instore.navigation.map.domain.PositioningInteractor;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class InstoreNavigationModule_ProvideMapFocusInteractorFactory implements Factory<MapFocusInteractor> {
    public static MapFocusManagerImpl a(InstoreNavigationModule instoreNavigationModule, PositioningInteractor positioningInteractor, BuildingInteractor buildingInteractor) {
        instoreNavigationModule.getClass();
        Intrinsics.h(positioningInteractor, "positioningInteractor");
        Intrinsics.h(buildingInteractor, "buildingInteractor");
        return new MapFocusManagerImpl(positioningInteractor, buildingInteractor);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
