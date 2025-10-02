package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class WorkInitializer {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f14478a;
    public final EventStore b;
    public final WorkScheduler c;
    public final SynchronizationGuard d;

    public WorkInitializer(Executor executor, EventStore eventStore, WorkScheduler workScheduler, SynchronizationGuard synchronizationGuard) {
        this.f14478a = executor;
        this.b = eventStore;
        this.c = workScheduler;
        this.d = synchronizationGuard;
    }
}
