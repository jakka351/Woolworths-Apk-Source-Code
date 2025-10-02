package com.google.firebase.sessions;

import com.google.firebase.sessions.dagger.internal.DaggerGenerated;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.QualifierMetadata;
import com.google.firebase.sessions.dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
/* loaded from: classes.dex */
public final class SessionGenerator_Factory implements Factory<SessionGenerator> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider f15822a;
    public final com.google.firebase.sessions.dagger.internal.Provider b;

    public SessionGenerator_Factory(com.google.firebase.sessions.dagger.internal.Provider provider, com.google.firebase.sessions.dagger.internal.Provider provider2) {
        this.f15822a = provider;
        this.b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new SessionGenerator((TimeProvider) this.f15822a.get(), (UuidGenerator) this.b.get());
    }
}
