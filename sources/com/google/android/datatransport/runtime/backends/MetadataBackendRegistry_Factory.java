package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@QualifierMetadata
@ScopeMetadata
@DaggerGenerated
/* loaded from: classes.dex */
public final class MetadataBackendRegistry_Factory implements Factory<MetadataBackendRegistry> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider f14454a;
    public final CreationContextFactory_Factory b;

    public MetadataBackendRegistry_Factory(Provider provider, CreationContextFactory_Factory creationContextFactory_Factory) {
        this.f14454a = provider;
        this.b = creationContextFactory_Factory;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new MetadataBackendRegistry((Context) this.f14454a.get(), (CreationContextFactory) this.b.get());
    }
}
