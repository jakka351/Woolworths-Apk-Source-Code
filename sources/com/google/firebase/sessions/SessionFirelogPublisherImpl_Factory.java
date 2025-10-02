package com.google.firebase.sessions;

import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallationsApi;
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
public final class SessionFirelogPublisherImpl_Factory implements Factory<SessionFirelogPublisherImpl> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider f15820a;
    public final Provider b;
    public final Provider c;
    public final com.google.firebase.sessions.dagger.internal.Provider d;
    public final Provider e;

    public SessionFirelogPublisherImpl_Factory(InstanceFactory instanceFactory, InstanceFactory instanceFactory2, com.google.firebase.sessions.dagger.internal.Provider provider, com.google.firebase.sessions.dagger.internal.Provider provider2, InstanceFactory instanceFactory3) {
        this.f15820a = instanceFactory;
        this.b = instanceFactory2;
        this.c = provider;
        this.d = provider2;
        this.e = instanceFactory3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new SessionFirelogPublisherImpl((FirebaseApp) this.f15820a.get(), (FirebaseInstallationsApi) this.b.get(), (SessionsSettings) this.c.get(), (EventGDTLoggerInterface) this.d.get(), (CoroutineContext) this.e.get());
    }
}
