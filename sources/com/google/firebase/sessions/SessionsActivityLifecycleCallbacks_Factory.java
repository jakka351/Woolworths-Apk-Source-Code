package com.google.firebase.sessions;

import com.google.firebase.sessions.dagger.internal.DaggerGenerated;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.Provider;
import com.google.firebase.sessions.dagger.internal.QualifierMetadata;
import com.google.firebase.sessions.dagger.internal.ScopeMetadata;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
/* loaded from: classes.dex */
public final class SessionsActivityLifecycleCallbacks_Factory implements Factory<SessionsActivityLifecycleCallbacks> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider f15824a;

    public SessionsActivityLifecycleCallbacks_Factory(Provider provider) {
        this.f15824a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new SessionsActivityLifecycleCallbacks((SharedSessionRepository) this.f15824a.get());
    }
}
