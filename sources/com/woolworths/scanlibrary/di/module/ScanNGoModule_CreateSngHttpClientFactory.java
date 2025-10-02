package com.woolworths.scanlibrary.di.module;

import com.woolworths.scanlibrary.data.authentication.TokenAuthenticator;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes7.dex */
public final class ScanNGoModule_CreateSngHttpClientFactory implements Factory<OkHttpClient> {
    public static OkHttpClient a(ScanNGoModule scanNGoModule, OkHttpClient okHttpClient, b bVar, a aVar, b bVar2, TokenAuthenticator tokenAuthenticator) {
        scanNGoModule.getClass();
        Intrinsics.h(tokenAuthenticator, "tokenAuthenticator");
        OkHttpClient.Builder builderC = okHttpClient.c();
        builderC.h = tokenAuthenticator;
        builderC.a(bVar);
        builderC.a(aVar);
        builderC.a(bVar2);
        return new OkHttpClient(builderC);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
