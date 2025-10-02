package com.google.firebase.sessions.settings;

import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.ApplicationInfo;
import com.google.firebase.sessions.TimeProvider;
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
public final class RemoteSettings_Factory implements Factory<RemoteSettings> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider f15842a;
    public final Provider b;
    public final Provider c;
    public final Provider d;
    public final com.google.firebase.sessions.dagger.internal.Provider e;

    public RemoteSettings_Factory(com.google.firebase.sessions.dagger.internal.Provider provider, InstanceFactory instanceFactory, com.google.firebase.sessions.dagger.internal.Provider provider2, com.google.firebase.sessions.dagger.internal.Provider provider3, com.google.firebase.sessions.dagger.internal.Provider provider4) {
        this.f15842a = provider;
        this.b = instanceFactory;
        this.c = provider2;
        this.d = provider3;
        this.e = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new RemoteSettings((TimeProvider) this.f15842a.get(), (FirebaseInstallationsApi) this.b.get(), (ApplicationInfo) this.c.get(), (CrashlyticsSettingsFetcher) this.d.get(), (SettingsCache) this.e.get());
    }
}
