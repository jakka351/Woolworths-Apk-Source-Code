package com.woolworths.scanlibrary.di.module;

import com.woolworths.scanlibrary.data.authentication.DefaultLocalTokenProvider;
import com.woolworths.scanlibrary.data.source.remote.RewardPreAuthService;
import com.woolworths.scanlibrary.domain.login.RewardSignInPreAuthUC;
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
public final class ScanNGoModule_ProvidesRewardSignInInitUseCaseFactory implements Factory<RewardSignInPreAuthUC> {
    public static RewardSignInPreAuthUC a(ScanNGoModule scanNGoModule, DefaultLocalTokenProvider defaultLocalTokenProvider, DeviceInfoProvider deviceInfoProvider, RewardPreAuthService rewardPreAuthService, Scheduler scheduler) {
        scanNGoModule.getClass();
        Intrinsics.h(deviceInfoProvider, "deviceInfoProvider");
        return new RewardSignInPreAuthUC(rewardPreAuthService, defaultLocalTokenProvider, deviceInfoProvider, scheduler);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
