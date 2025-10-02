package com.woolworths.scanlibrary.di.module;

import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import com.woolworths.scanlibrary.data.ScanNGoRepository;
import com.woolworths.scanlibrary.data.source.remote.ApigeeDataSource;
import com.woolworths.scanlibrary.data.source.remote.RemoteDataSource;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import io.reactivex.Scheduler;
import io.reactivex.schedulers.Schedulers;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes7.dex */
public final class ScanNGoModule_GetRemoteSourceFactory implements Factory<ScanNGoRepository> {
    public static ScanNGoRepository a(ScanNGoModule scanNGoModule, ApigeeDataSource apigeeDataSource, FeatureToggleManager featureToggleManager) {
        scanNGoModule.getClass();
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        RemoteDataSource remoteDataSource = new RemoteDataSource(apigeeDataSource, featureToggleManager);
        Scheduler scheduler = Schedulers.c;
        Intrinsics.g(scheduler, "io(...)");
        return new ScanNGoRepository(remoteDataSource, scheduler);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
