package au.com.woolworths.shop.receipt.details.di;

import au.com.woolworths.feature.shared.receipt.details.EReceiptUIProvider;
import au.com.woolworths.shop.receipt.details.ShopReceiptUiProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class ShopReceiptDetailsAppModule_ProvidesStoreLocationProvider$receipts_releaseFactory implements Factory<EReceiptUIProvider> {
    public static ShopReceiptUiProvider a(ShopReceiptDetailsAppModule shopReceiptDetailsAppModule) {
        shopReceiptDetailsAppModule.getClass();
        return new ShopReceiptUiProvider();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a(null);
        throw null;
    }
}
