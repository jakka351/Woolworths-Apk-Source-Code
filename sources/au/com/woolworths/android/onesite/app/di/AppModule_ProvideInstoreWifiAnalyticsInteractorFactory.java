package au.com.woolworths.android.onesite.app.di;

import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.feature.shared.instore.wifi.analytics.InstoreWifiAnalyticsInteractor;
import au.com.woolworths.feature.shared.instore.wifi.analytics.ShopInstoreWifiAnalyticsInteractor;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class AppModule_ProvideInstoreWifiAnalyticsInteractorFactory implements Factory<InstoreWifiAnalyticsInteractor> {
    public static ShopInstoreWifiAnalyticsInteractor a(AppModule appModule, AnalyticsManager analyticsManager) {
        appModule.getClass();
        Intrinsics.h(analyticsManager, "analyticsManager");
        return new ShopInstoreWifiAnalyticsInteractor(analyticsManager);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
