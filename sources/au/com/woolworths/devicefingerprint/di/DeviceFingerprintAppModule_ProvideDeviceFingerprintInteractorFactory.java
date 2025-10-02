package au.com.woolworths.devicefingerprint.di;

import android.app.Application;
import au.com.woolworths.android.onesite.appdata.AppConfig;
import au.com.woolworths.devicefingerprint.DeviceFingerprintInteractor;
import au.com.woolworths.devicefingerprint.DeviceFingerprintInteractorImpl;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class DeviceFingerprintAppModule_ProvideDeviceFingerprintInteractorFactory implements Factory<DeviceFingerprintInteractor> {
    public static DeviceFingerprintInteractorImpl a(DeviceFingerprintAppModule deviceFingerprintAppModule, Application application, AppConfig appConfig) {
        deviceFingerprintAppModule.getClass();
        Intrinsics.h(appConfig, "appConfig");
        return new DeviceFingerprintInteractorImpl(appConfig.getU(), application);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
