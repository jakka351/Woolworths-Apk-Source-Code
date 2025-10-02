package au.com.woolworths.scanandgo.di;

import android.app.Application;
import android.content.SharedPreferences;
import au.com.woolworths.scanandgo.ScanAndGoRepository;
import au.com.woolworths.scanandgo.network.ScanAndGoApi;
import com.woolworths.scanlibrary.util.device.DeviceInfoProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class ShopScanAndGoAppModule_ProvideScanAndGoRepositoryFactory implements Factory<ScanAndGoRepository> {
    public static ScanAndGoRepository a(ShopScanAndGoAppModule shopScanAndGoAppModule, Application application, ScanAndGoApi scanAndGoApi, DeviceInfoProvider deviceInfoProvider, SharedPreferences sharedPreferences) {
        shopScanAndGoAppModule.getClass();
        Intrinsics.h(deviceInfoProvider, "deviceInfoProvider");
        return new ScanAndGoRepository(application, scanAndGoApi, deviceInfoProvider, sharedPreferences);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
