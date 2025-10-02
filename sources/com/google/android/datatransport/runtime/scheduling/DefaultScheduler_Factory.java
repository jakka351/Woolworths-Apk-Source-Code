package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.concurrent.Executor;
import javax.inject.Provider;

@QualifierMetadata
@ScopeMetadata
@DaggerGenerated
/* loaded from: classes.dex */
public final class DefaultScheduler_Factory implements Factory<DefaultScheduler> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider f14468a;
    public final Provider b;
    public final SchedulingModule_WorkSchedulerFactory c;
    public final Provider d;
    public final Provider e;

    public DefaultScheduler_Factory(Provider provider, Provider provider2, SchedulingModule_WorkSchedulerFactory schedulingModule_WorkSchedulerFactory, Provider provider3, Provider provider4) {
        this.f14468a = provider;
        this.b = provider2;
        this.c = schedulingModule_WorkSchedulerFactory;
        this.d = provider3;
        this.e = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new DefaultScheduler((Executor) this.f14468a.get(), (BackendRegistry) this.b.get(), (WorkScheduler) this.c.get(), (EventStore) this.d.get(), (SynchronizationGuard) this.e.get());
    }
}
