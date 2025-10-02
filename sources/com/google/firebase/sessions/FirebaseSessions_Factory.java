package com.google.firebase.sessions;

import com.google.firebase.FirebaseApp;
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
public final class FirebaseSessions_Factory implements Factory<FirebaseSessions> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider f15804a;
    public final Provider b;
    public final Provider c;
    public final com.google.firebase.sessions.dagger.internal.Provider d;

    public FirebaseSessions_Factory(InstanceFactory instanceFactory, com.google.firebase.sessions.dagger.internal.Provider provider, InstanceFactory instanceFactory2, com.google.firebase.sessions.dagger.internal.Provider provider2) {
        this.f15804a = instanceFactory;
        this.b = provider;
        this.c = instanceFactory2;
        this.d = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new FirebaseSessions((FirebaseApp) this.f15804a.get(), (SessionsSettings) this.b.get(), (CoroutineContext) this.c.get(), (SessionsActivityLifecycleCallbacks) this.d.get());
    }
}
