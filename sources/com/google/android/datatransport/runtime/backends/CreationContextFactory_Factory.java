package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.InstanceFactory;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;
import com.google.android.datatransport.runtime.time.TimeModule_EventClockFactory;
import com.google.android.datatransport.runtime.time.TimeModule_UptimeClockFactory;
import com.google.android.datatransport.runtime.time.UptimeClock;
import com.google.android.datatransport.runtime.time.WallTimeClock;

@QualifierMetadata
@ScopeMetadata
@DaggerGenerated
/* loaded from: classes.dex */
public final class CreationContextFactory_Factory implements Factory<CreationContextFactory> {

    /* renamed from: a, reason: collision with root package name */
    public final InstanceFactory f14451a;

    public CreationContextFactory_Factory(InstanceFactory instanceFactory, TimeModule_EventClockFactory timeModule_EventClockFactory, TimeModule_UptimeClockFactory timeModule_UptimeClockFactory) {
        this.f14451a = instanceFactory;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new CreationContextFactory((Context) this.f14451a.f14456a, new WallTimeClock(), new UptimeClock());
    }
}
