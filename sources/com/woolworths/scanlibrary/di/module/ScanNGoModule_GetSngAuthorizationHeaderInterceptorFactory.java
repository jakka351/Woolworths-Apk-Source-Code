package com.woolworths.scanlibrary.di.module;

import com.woolworths.scanlibrary.data.authentication.DefaultLocalTokenProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import okhttp3.Interceptor;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes7.dex */
public final class ScanNGoModule_GetSngAuthorizationHeaderInterceptorFactory implements Factory<Interceptor> {
    public static b a(ScanNGoModule scanNGoModule, DefaultLocalTokenProvider defaultLocalTokenProvider) {
        scanNGoModule.getClass();
        return new b(defaultLocalTokenProvider, 0);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
