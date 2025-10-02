package com.woolworths.scanlibrary.di.module;

import android.content.Context;
import android.content.SharedPreferences;
import com.woolworths.scanlibrary.configuration.ScanAndGoFeatureConfig;
import com.woolworths.scanlibrary.util.device.DeviceInfoProvider;
import com.woolworths.scanlibrary.util.device.DeviceInfoProviderImpl;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes7.dex */
public final class ScanNGoModule_ProvideDeviceInfoProviderFactory implements Factory<DeviceInfoProvider> {
    public static DeviceInfoProviderImpl a(ScanNGoModule scanNGoModule, Context context, SharedPreferences preferences, ScanAndGoFeatureConfig config) {
        scanNGoModule.getClass();
        Intrinsics.h(context, "context");
        Intrinsics.h(preferences, "preferences");
        Intrinsics.h(config, "config");
        return new DeviceInfoProviderImpl(context, preferences, config);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
