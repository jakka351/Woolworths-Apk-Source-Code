package au.com.woolworths.base.shopapp.di;

import au.com.woolworths.android.onesite.modules.collectionmode.InStoreModeInteractor;
import au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode;
import au.com.woolworths.base.shopapp.modules.collectionmode.CollectionModeRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class BaseShopAppModule_ProvidesInStoreModeInteractor$base_shop_app_releaseFactory implements Factory<InStoreModeInteractor> {
    /* JADX WARN: Type inference failed for: r0v2, types: [au.com.woolworths.base.shopapp.di.BaseShopAppModule$providesInStoreModeInteractor$1] */
    public static BaseShopAppModule$providesInStoreModeInteractor$1 a(BaseShopAppModule baseShopAppModule, final CollectionModeRepository collectionModeRepository) {
        baseShopAppModule.getClass();
        Intrinsics.h(collectionModeRepository, "collectionModeRepository");
        return new InStoreModeInteractor() { // from class: au.com.woolworths.base.shopapp.di.BaseShopAppModule$providesInStoreModeInteractor$1
            @Override // au.com.woolworths.android.onesite.modules.collectionmode.InStoreModeInteractor
            public final boolean b() {
                return collectionModeRepository.c() instanceof CollectionMode.InStore;
            }
        };
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
