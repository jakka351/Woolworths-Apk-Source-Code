package com.woolworths.scanlibrary.di.module;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes7.dex */
public final class ScanNGoModule_GetRewardPreAuthAPIKeyInterceptorFactory implements Factory<Interceptor> {
    public static a a(ScanNGoModule scanNGoModule, ScanAndGoConfig config) {
        scanNGoModule.getClass();
        Intrinsics.h(config, "config");
        return new a(config, 0);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
