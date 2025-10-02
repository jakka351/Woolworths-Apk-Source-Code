package com.google.firebase.sessions;

import android.content.Context;
import com.google.firebase.sessions.dagger.internal.DaggerGenerated;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.InstanceFactory;
import com.google.firebase.sessions.dagger.internal.QualifierMetadata;
import com.google.firebase.sessions.dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
/* loaded from: classes.dex */
public final class ProcessDataManagerImpl_Factory implements Factory<ProcessDataManagerImpl> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider f15809a;
    public final Provider b;

    public ProcessDataManagerImpl_Factory(InstanceFactory instanceFactory, com.google.firebase.sessions.dagger.internal.Provider provider) {
        this.f15809a = instanceFactory;
        this.b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new ProcessDataManagerImpl((Context) this.f15809a.get(), (UuidGenerator) this.b.get());
    }
}
