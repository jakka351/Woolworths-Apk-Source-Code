package com.woolworths.scanlibrary.di.module;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes7.dex */
public final class ScanNGoModule_CreateBaseHttpClientFactory implements Factory<OkHttpClient> {
    public static OkHttpClient a(ScanNGoModule scanNGoModule) {
        scanNGoModule.getClass();
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        long j = scanNGoModule.f21164a;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        builder.d(j, timeUnit);
        builder.e(j, timeUnit);
        return new OkHttpClient(builder);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
