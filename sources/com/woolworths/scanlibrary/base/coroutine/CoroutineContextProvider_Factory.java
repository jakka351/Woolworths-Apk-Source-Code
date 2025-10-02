package com.woolworths.scanlibrary.base.coroutine;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes7.dex */
public final class CoroutineContextProvider_Factory implements Factory<CoroutineContextProvider> {

    public static final class InstanceHolder {
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new CoroutineContextProvider();
    }
}
