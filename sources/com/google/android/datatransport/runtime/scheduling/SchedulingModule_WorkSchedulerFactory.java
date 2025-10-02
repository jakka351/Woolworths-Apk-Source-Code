package com.google.android.datatransport.runtime.scheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoScheduler;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.time.TimeModule_UptimeClockFactory;
import javax.inject.Provider;

@QualifierMetadata
@ScopeMetadata
@DaggerGenerated
/* loaded from: classes.dex */
public final class SchedulingModule_WorkSchedulerFactory implements Factory<WorkScheduler> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider f14469a;
    public final Provider b;
    public final SchedulingConfigModule_ConfigFactory c;

    public SchedulingModule_WorkSchedulerFactory(Provider provider, Provider provider2, SchedulingConfigModule_ConfigFactory schedulingConfigModule_ConfigFactory, TimeModule_UptimeClockFactory timeModule_UptimeClockFactory) {
        this.f14469a = provider;
        this.b = provider2;
        this.c = schedulingConfigModule_ConfigFactory;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new JobInfoScheduler((Context) this.f14469a.get(), (EventStore) this.b.get(), (SchedulerConfig) this.c.get());
    }
}
