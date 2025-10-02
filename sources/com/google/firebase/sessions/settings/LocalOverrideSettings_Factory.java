package com.google.firebase.sessions.settings;

import android.content.Context;
import com.google.firebase.sessions.dagger.internal.DaggerGenerated;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.InstanceFactory;
import com.google.firebase.sessions.dagger.internal.QualifierMetadata;
import com.google.firebase.sessions.dagger.internal.ScopeMetadata;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
/* loaded from: classes.dex */
public final class LocalOverrideSettings_Factory implements Factory<LocalOverrideSettings> {

    /* renamed from: a, reason: collision with root package name */
    public final InstanceFactory f15838a;

    public LocalOverrideSettings_Factory(InstanceFactory instanceFactory) {
        this.f15838a = instanceFactory;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new LocalOverrideSettings((Context) this.f15838a.f15836a);
    }
}
