package com.woolworths.scanlibrary.di.module;

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
public final class ScanNGoModule_GetSchedulerFactory implements Factory<Scheduler> {
    public static Scheduler a(ScanNGoModule scanNGoModule) {
        scanNGoModule.getClass();
        Scheduler scheduler = Schedulers.b;
        Intrinsics.g(scheduler, "computation(...)");
        return scheduler;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a(null);
        throw null;
    }
}
