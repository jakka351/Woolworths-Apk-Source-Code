package au.com.woolworths.scanandgo.di;

import au.com.woolworths.scanandgo.HandleOnSngRewardsTokenExpired;
import au.com.woolworths.scanandgo.ScanAndGoInteractor;
import com.woolworths.scanlibrary.configuration.OnSngRewardsTokenExpired;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class ShopScanAndGoAppModule_ProvideOnCredentialsExpiredFactory implements Factory<OnSngRewardsTokenExpired> {
    public static HandleOnSngRewardsTokenExpired a(ShopScanAndGoAppModule shopScanAndGoAppModule, ScanAndGoInteractor scanAndGoInteractor) {
        shopScanAndGoAppModule.getClass();
        return new HandleOnSngRewardsTokenExpired(scanAndGoInteractor);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
