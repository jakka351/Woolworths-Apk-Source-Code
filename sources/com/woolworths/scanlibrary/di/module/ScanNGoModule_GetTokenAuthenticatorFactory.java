package com.woolworths.scanlibrary.di.module;

import com.woolworths.scanlibrary.data.authentication.TokenAuthenticator;
import com.woolworths.scanlibrary.data.authentication.token.DefaultTokenProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes7.dex */
public final class ScanNGoModule_GetTokenAuthenticatorFactory implements Factory<TokenAuthenticator> {
    public static TokenAuthenticator a(ScanNGoModule scanNGoModule, DefaultTokenProvider defaultTokenProvider) {
        scanNGoModule.getClass();
        return new TokenAuthenticator(defaultTokenProvider);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
