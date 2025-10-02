package com.google.firebase.sessions.settings;

import com.google.firebase.sessions.dagger.internal.DaggerGenerated;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.QualifierMetadata;
import com.google.firebase.sessions.dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
/* loaded from: classes.dex */
public final class SessionsSettings_Factory implements Factory<SessionsSettings> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider f15847a;
    public final com.google.firebase.sessions.dagger.internal.Provider b;

    public SessionsSettings_Factory(com.google.firebase.sessions.dagger.internal.Provider provider, com.google.firebase.sessions.dagger.internal.Provider provider2) {
        this.f15847a = provider;
        this.b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new SessionsSettings((SettingsProvider) this.f15847a.get(), (SettingsProvider) this.b.get());
    }
}
