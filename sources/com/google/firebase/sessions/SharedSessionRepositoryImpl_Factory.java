package com.google.firebase.sessions;

import androidx.datastore.core.DataStore;
import com.google.firebase.sessions.dagger.internal.DaggerGenerated;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.InstanceFactory;
import com.google.firebase.sessions.dagger.internal.QualifierMetadata;
import com.google.firebase.sessions.dagger.internal.ScopeMetadata;
import com.google.firebase.sessions.settings.SessionsSettings;
import javax.inject.Provider;
import kotlin.coroutines.CoroutineContext;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
/* loaded from: classes.dex */
public final class SharedSessionRepositoryImpl_Factory implements Factory<SharedSessionRepositoryImpl> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider f15826a;
    public final Provider b;
    public final Provider c;
    public final Provider d;
    public final Provider e;
    public final com.google.firebase.sessions.dagger.internal.Provider f;
    public final Provider g;

    public SharedSessionRepositoryImpl_Factory(com.google.firebase.sessions.dagger.internal.Provider provider, com.google.firebase.sessions.dagger.internal.Provider provider2, com.google.firebase.sessions.dagger.internal.Provider provider3, com.google.firebase.sessions.dagger.internal.Provider provider4, com.google.firebase.sessions.dagger.internal.Provider provider5, com.google.firebase.sessions.dagger.internal.Provider provider6, InstanceFactory instanceFactory) {
        this.f15826a = provider;
        this.b = provider2;
        this.c = provider3;
        this.d = provider4;
        this.e = provider5;
        this.f = provider6;
        this.g = instanceFactory;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new SharedSessionRepositoryImpl((SessionsSettings) this.f15826a.get(), (SessionGenerator) this.b.get(), (SessionFirelogPublisher) this.c.get(), (TimeProvider) this.d.get(), (DataStore) this.e.get(), (ProcessDataManager) this.f.get(), (CoroutineContext) this.g.get());
    }
}
