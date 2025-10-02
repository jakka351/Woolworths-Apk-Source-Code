package au.com.woolworths.android.onesite.app.di;

import au.com.woolworths.android.onesite.app.ShopAppScanAndGoConfig;
import au.com.woolworths.android.onesite.appdata.AppEnvironment;
import au.com.woolworths.android.onesite.repository.ReleaseSettingsInteractorImpl;
import com.woolworths.scanlibrary.di.module.ScanAndGoConfig;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.NoWhenBranchMatchedException;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class AppConfigModule_ProvideScanAndGoConfigFactory implements Factory<ScanAndGoConfig> {
    public static ScanAndGoConfig a(AppConfigModule appConfigModule, ReleaseSettingsInteractorImpl releaseSettingsInteractorImpl) {
        appConfigModule.getClass();
        if (AppEnvironment.Production.INSTANCE == null) {
            throw new NoWhenBranchMatchedException();
        }
        ShopAppScanAndGoConfig shopAppScanAndGoConfig = ShopAppScanAndGoConfig.h;
        Preconditions.d(shopAppScanAndGoConfig);
        return shopAppScanAndGoConfig;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
