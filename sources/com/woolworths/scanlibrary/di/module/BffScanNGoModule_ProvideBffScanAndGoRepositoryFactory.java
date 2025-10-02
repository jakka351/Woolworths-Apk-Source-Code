package com.woolworths.scanlibrary.di.module;

import android.app.Application;
import android.content.SharedPreferences;
import com.woolworths.scanlibrary.data.launch.BffScanAndGoRepository;
import com.woolworths.scanlibrary.data.source.remote.BffDataSource;
import com.woolworths.scanlibrary.util.device.DeviceInfoProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes7.dex */
public final class BffScanNGoModule_ProvideBffScanAndGoRepositoryFactory implements Factory<BffScanAndGoRepository> {
    public static BffScanAndGoRepository a(BffScanNGoModule bffScanNGoModule, Application application, BffDataSource bffDataSource, DeviceInfoProvider deviceInfoProvider, SharedPreferences sharedPreferences) {
        bffScanNGoModule.getClass();
        Intrinsics.h(deviceInfoProvider, "deviceInfoProvider");
        return new BffScanAndGoRepository(application, bffDataSource, deviceInfoProvider, sharedPreferences);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
