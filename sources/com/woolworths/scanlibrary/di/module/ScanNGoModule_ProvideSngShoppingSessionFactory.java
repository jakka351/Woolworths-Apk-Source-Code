package com.woolworths.scanlibrary.di.module;

import com.woolworths.scanlibrary.data.cart.SngShoppingSession;
import com.woolworths.scanlibrary.data.cart.SngShoppingSessionImpl;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes7.dex */
public final class ScanNGoModule_ProvideSngShoppingSessionFactory implements Factory<SngShoppingSession> {
    public static SngShoppingSessionImpl a(ScanNGoModule scanNGoModule) {
        scanNGoModule.getClass();
        return new SngShoppingSessionImpl();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a(null);
        throw null;
    }
}
