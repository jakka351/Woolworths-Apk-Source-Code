package com.google.firebase.sessions.settings;

import androidx.datastore.core.DataStore;
import com.google.firebase.sessions.TimeProvider;
import com.google.firebase.sessions.dagger.internal.DaggerGenerated;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.InstanceFactory;
import com.google.firebase.sessions.dagger.internal.QualifierMetadata;
import com.google.firebase.sessions.dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import kotlin.coroutines.CoroutineContext;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
/* loaded from: classes.dex */
public final class SettingsCacheImpl_Factory implements Factory<SettingsCacheImpl> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider f15849a;
    public final Provider b;
    public final com.google.firebase.sessions.dagger.internal.Provider c;

    public SettingsCacheImpl_Factory(InstanceFactory instanceFactory, com.google.firebase.sessions.dagger.internal.Provider provider, com.google.firebase.sessions.dagger.internal.Provider provider2) {
        this.f15849a = instanceFactory;
        this.b = provider;
        this.c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new SettingsCacheImpl((CoroutineContext) this.f15849a.get(), (TimeProvider) this.b.get(), (DataStore) this.c.get());
    }
}
