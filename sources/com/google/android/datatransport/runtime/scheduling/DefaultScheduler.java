package com.google.android.datatransport.runtime.scheduling;

import androidx.work.impl.d;
import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public class DefaultScheduler implements Scheduler {
    public static final Logger f = Logger.getLogger(TransportRuntime.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final WorkScheduler f14467a;
    public final Executor b;
    public final BackendRegistry c;
    public final EventStore d;
    public final SynchronizationGuard e;

    public DefaultScheduler(Executor executor, BackendRegistry backendRegistry, WorkScheduler workScheduler, EventStore eventStore, SynchronizationGuard synchronizationGuard) {
        this.b = executor;
        this.c = backendRegistry;
        this.f14467a = workScheduler;
        this.d = eventStore;
        this.e = synchronizationGuard;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.Scheduler
    public final void a(TransportContext transportContext, EventInternal eventInternal, TransportScheduleCallback transportScheduleCallback) {
        this.b.execute(new d(this, transportContext, transportScheduleCallback, eventInternal, 1));
    }
}
