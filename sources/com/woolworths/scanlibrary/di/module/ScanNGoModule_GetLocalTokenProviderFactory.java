package com.woolworths.scanlibrary.di.module;

import au.com.woolworths.shop.securedpreference.preference.SecuredSharedPreference;
import com.woolworths.scanlibrary.data.authentication.DefaultLocalTokenProvider;
import com.woolworths.scanlibrary.data.authentication.LocalTokenProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes7.dex */
public final class ScanNGoModule_GetLocalTokenProviderFactory implements Factory<LocalTokenProvider> {
    public static DefaultLocalTokenProvider a(ScanNGoModule scanNGoModule, SecuredSharedPreference securedSharedPreference) {
        scanNGoModule.getClass();
        return new DefaultLocalTokenProvider(securedSharedPreference);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
