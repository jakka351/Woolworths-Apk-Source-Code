package au.com.woolworths.shop.buyagain.di;

import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import au.com.woolworths.shop.buyagain.domain.BuyAgainEntryPointInteractor;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class BuyAgainAppModule_ProvideBuyAgainEntryPointInteractorFactory implements Factory<BuyAgainEntryPointInteractor> {
    public static BuyAgainEntryPointInteractor a(BuyAgainAppModule buyAgainAppModule, ShopAccountInteractor accountInteractor, CollectionModeInteractor collectionModeInteractor, FeatureToggleManager featureToggleManager) {
        buyAgainAppModule.getClass();
        Intrinsics.h(accountInteractor, "accountInteractor");
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        return new BuyAgainEntryPointInteractor(accountInteractor, collectionModeInteractor, featureToggleManager);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
