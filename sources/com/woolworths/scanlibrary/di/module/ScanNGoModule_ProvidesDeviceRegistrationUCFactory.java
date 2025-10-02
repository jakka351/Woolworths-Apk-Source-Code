package com.woolworths.scanlibrary.di.module;

import com.woolworths.scanlibrary.data.ScanNGoRepository;
import com.woolworths.scanlibrary.domain.device.DeviceRegistrationUC;
import com.woolworths.scanlibrary.util.device.DeviceInfoProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import io.reactivex.Scheduler;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes7.dex */
public final class ScanNGoModule_ProvidesDeviceRegistrationUCFactory implements Factory<DeviceRegistrationUC> {
    public static DeviceRegistrationUC a(ScanNGoModule scanNGoModule, ScanNGoRepository scanNGoRepository, Scheduler scheduler, DeviceInfoProvider deviceInfoProvider) {
        scanNGoModule.getClass();
        Intrinsics.h(deviceInfoProvider, "deviceInfoProvider");
        return new DeviceRegistrationUC(scanNGoRepository, deviceInfoProvider, scheduler);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
