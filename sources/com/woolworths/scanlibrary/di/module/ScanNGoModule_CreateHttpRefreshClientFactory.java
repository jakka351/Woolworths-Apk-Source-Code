package com.woolworths.scanlibrary.di.module;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import okhttp3.OkHttpClient;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes7.dex */
public final class ScanNGoModule_CreateHttpRefreshClientFactory implements Factory<OkHttpClient> {
    public static OkHttpClient a(ScanNGoModule scanNGoModule, OkHttpClient okHttpClient, a aVar) {
        scanNGoModule.getClass();
        OkHttpClient.Builder builderC = okHttpClient.c();
        builderC.a(aVar);
        return new OkHttpClient(builderC);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
