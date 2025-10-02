package com.google.firebase.sessions.settings;

import com.google.firebase.sessions.ApplicationInfo;
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
public final class RemoteSettingsFetcher_Factory implements Factory<RemoteSettingsFetcher> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider f15841a;
    public final InstanceFactory b;

    public RemoteSettingsFetcher_Factory(InstanceFactory instanceFactory, com.google.firebase.sessions.dagger.internal.Provider provider) {
        this.f15841a = provider;
        this.b = instanceFactory;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new RemoteSettingsFetcher((ApplicationInfo) this.f15841a.get(), (CoroutineContext) this.b.f15836a);
    }
}
