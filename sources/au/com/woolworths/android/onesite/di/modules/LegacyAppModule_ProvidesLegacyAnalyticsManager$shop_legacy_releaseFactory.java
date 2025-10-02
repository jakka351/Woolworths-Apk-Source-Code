package au.com.woolworths.android.onesite.di.modules;

import au.com.woolworths.android.onesite.analytics.LegacyShopAnalyticsManagerImpl;
import au.com.woolworths.base.shopapp.appdata.LegacyShopAnalyticsManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class LegacyAppModule_ProvidesLegacyAnalyticsManager$shop_legacy_releaseFactory implements Factory<LegacyShopAnalyticsManager> {
    public static void a(LegacyAppModule legacyAppModule, LegacyShopAnalyticsManagerImpl legacyShopAnalyticsManagerImpl) {
        legacyAppModule.getClass();
        Intrinsics.h(legacyShopAnalyticsManagerImpl, "legacyShopAnalyticsManagerImpl");
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
