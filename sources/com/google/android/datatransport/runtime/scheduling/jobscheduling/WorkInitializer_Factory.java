package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.concurrent.Executor;
import javax.inject.Provider;

@QualifierMetadata
@ScopeMetadata
@DaggerGenerated
/* loaded from: classes.dex */
public final class WorkInitializer_Factory implements Factory<WorkInitializer> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider f14479a;
    public final Provider b;
    public final Provider c;
    public final Provider d;

    public WorkInitializer_Factory(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f14479a = provider;
        this.b = provider2;
        this.c = provider3;
        this.d = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new WorkInitializer((Executor) this.f14479a.get(), (EventStore) this.b.get(), (WorkScheduler) this.c.get(), (SynchronizationGuard) this.d.get());
    }
}
