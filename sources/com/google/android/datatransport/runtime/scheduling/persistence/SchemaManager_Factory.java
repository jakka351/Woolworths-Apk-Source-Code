package com.google.android.datatransport.runtime.scheduling.persistence;

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
public final class SchemaManager_Factory implements Factory<SchemaManager> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider f14489a;

    public SchemaManager_Factory(Provider provider) {
        this.f14489a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new SchemaManager((Context) this.f14489a.get(), "com.google.android.datatransport.events", Integer.valueOf(SchemaManager.g).intValue());
    }
}
