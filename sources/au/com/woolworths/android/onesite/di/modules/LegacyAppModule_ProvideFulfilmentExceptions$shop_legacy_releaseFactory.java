package au.com.woolworths.android.onesite.di.modules;

import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.network.NetworkExceptions;
import au.com.woolworths.android.onesite.utils.FulfilmentExceptions;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class LegacyAppModule_ProvideFulfilmentExceptions$shop_legacy_releaseFactory implements Factory<FulfilmentExceptions> {
    public static FulfilmentExceptions a(LegacyAppModule legacyAppModule, AnalyticsManager analyticsManager, NetworkExceptions networkExceptions) {
        legacyAppModule.getClass();
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(networkExceptions, "networkExceptions");
        return new FulfilmentExceptions(networkExceptions, analyticsManager);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
