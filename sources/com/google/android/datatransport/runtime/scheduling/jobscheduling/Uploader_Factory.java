package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;
import com.google.android.datatransport.runtime.scheduling.SchedulingModule_WorkSchedulerFactory;
import com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.datatransport.runtime.time.TimeModule_EventClockFactory;
import com.google.android.datatransport.runtime.time.TimeModule_UptimeClockFactory;
import com.google.android.datatransport.runtime.time.UptimeClock;
import com.google.android.datatransport.runtime.time.WallTimeClock;
import java.util.concurrent.Executor;
import javax.inject.Provider;

@QualifierMetadata
@ScopeMetadata
@DaggerGenerated
/* loaded from: classes.dex */
public final class Uploader_Factory implements Factory<Uploader> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider f14477a;
    public final Provider b;
    public final Provider c;
    public final SchedulingModule_WorkSchedulerFactory d;
    public final Provider e;
    public final Provider f;
    public final Provider g;

    public Uploader_Factory(Provider provider, Provider provider2, Provider provider3, SchedulingModule_WorkSchedulerFactory schedulingModule_WorkSchedulerFactory, Provider provider4, Provider provider5, TimeModule_EventClockFactory timeModule_EventClockFactory, TimeModule_UptimeClockFactory timeModule_UptimeClockFactory, Provider provider6) {
        this.f14477a = provider;
        this.b = provider2;
        this.c = provider3;
        this.d = schedulingModule_WorkSchedulerFactory;
        this.e = provider4;
        this.f = provider5;
        this.g = provider6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new Uploader((Context) this.f14477a.get(), (BackendRegistry) this.b.get(), (EventStore) this.c.get(), (WorkScheduler) this.d.get(), (Executor) this.e.get(), (SynchronizationGuard) this.f.get(), new WallTimeClock(), new UptimeClock(), (ClientHealthMetricsStore) this.g.get());
    }
}
