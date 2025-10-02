package au.com.woolworths.android.onesite.app.di;

import au.com.woolworths.android.onesite.app.ShopAppSngFeatureConfig;
import com.woolworths.scanlibrary.configuration.ScanAndGoFeatureConfig;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class AppModule_ProvideScanAndGoFeatureConfigFactory implements Factory<ScanAndGoFeatureConfig> {
    public static ShopAppSngFeatureConfig a(AppModule appModule) {
        appModule.getClass();
        return new ShopAppSngFeatureConfig();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a(null);
        throw null;
    }
}
