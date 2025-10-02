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
public final class SessionDataSerializer_Factory implements Factory<SessionDataSerializer> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider f15814a;

    public SessionDataSerializer_Factory(com.google.firebase.sessions.dagger.internal.Provider provider) {
        this.f15814a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new SessionDataSerializer((SessionGenerator) this.f15814a.get());
    }
}
