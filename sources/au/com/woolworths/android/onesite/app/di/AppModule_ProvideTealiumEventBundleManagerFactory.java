package au.com.woolworths.android.onesite.app.di;

import au.com.woolworths.android.onesite.analytics.tealium.TealiumEventBundleManager;
import au.com.woolworths.base.shopapp.analytics.TealiumEventBundleManagerImpl;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class AppModule_ProvideTealiumEventBundleManagerFactory implements Factory<TealiumEventBundleManager> {
    public static TealiumEventBundleManagerImpl a(AppModule appModule) {
        appModule.getClass();
        return new TealiumEventBundleManagerImpl();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a(null);
        throw null;
    }
}
