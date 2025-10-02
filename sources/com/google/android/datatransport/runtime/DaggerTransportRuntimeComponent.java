package com.google.android.datatransport.runtime;

import android.content.Context;
import com.google.android.datatransport.runtime.ExecutionModule_ExecutorFactory;
import com.google.android.datatransport.runtime.TransportRuntimeComponent;
import com.google.android.datatransport.runtime.backends.CreationContextFactory_Factory;
import com.google.android.datatransport.runtime.backends.MetadataBackendRegistry_Factory;
import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.DoubleCheck;
import com.google.android.datatransport.runtime.dagger.internal.InstanceFactory;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler_Factory;
import com.google.android.datatransport.runtime.scheduling.SchedulingConfigModule_ConfigFactory;
import com.google.android.datatransport.runtime.scheduling.SchedulingModule_WorkSchedulerFactory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader_Factory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer_Factory;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_PackageNameFactory;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore_Factory;
import com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager_Factory;
import com.google.android.datatransport.runtime.time.TimeModule_EventClockFactory;
import com.google.android.datatransport.runtime.time.TimeModule_UptimeClockFactory;
import javax.inject.Provider;

@DaggerGenerated
/* loaded from: classes.dex */
final class DaggerTransportRuntimeComponent {

    public static final class Builder implements TransportRuntimeComponent.Builder {

        /* renamed from: a, reason: collision with root package name */
        public Context f14438a;

        public final TransportRuntimeComponentImpl a() {
            Context context = this.f14438a;
            if (context == null) {
                throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
            }
            TransportRuntimeComponentImpl transportRuntimeComponentImpl = new TransportRuntimeComponentImpl();
            transportRuntimeComponentImpl.d = DoubleCheck.a(ExecutionModule_ExecutorFactory.InstanceHolder.f14440a);
            InstanceFactory instanceFactory = new InstanceFactory(context);
            transportRuntimeComponentImpl.e = instanceFactory;
            transportRuntimeComponentImpl.f = DoubleCheck.a(new MetadataBackendRegistry_Factory(transportRuntimeComponentImpl.e, new CreationContextFactory_Factory(instanceFactory, TimeModule_EventClockFactory.a(), TimeModule_UptimeClockFactory.a())));
            InstanceFactory instanceFactory2 = transportRuntimeComponentImpl.e;
            transportRuntimeComponentImpl.g = new SchemaManager_Factory(instanceFactory2);
            transportRuntimeComponentImpl.h = DoubleCheck.a(new EventStoreModule_PackageNameFactory(instanceFactory2));
            transportRuntimeComponentImpl.i = DoubleCheck.a(new SQLiteEventStore_Factory(TimeModule_EventClockFactory.a(), TimeModule_UptimeClockFactory.a(), transportRuntimeComponentImpl.g, transportRuntimeComponentImpl.h));
            SchedulingModule_WorkSchedulerFactory schedulingModule_WorkSchedulerFactory = new SchedulingModule_WorkSchedulerFactory(transportRuntimeComponentImpl.e, transportRuntimeComponentImpl.i, new SchedulingConfigModule_ConfigFactory(), TimeModule_UptimeClockFactory.a());
            transportRuntimeComponentImpl.j = schedulingModule_WorkSchedulerFactory;
            Provider provider = transportRuntimeComponentImpl.d;
            Provider provider2 = transportRuntimeComponentImpl.f;
            Provider provider3 = transportRuntimeComponentImpl.i;
            transportRuntimeComponentImpl.k = new DefaultScheduler_Factory(provider, provider2, schedulingModule_WorkSchedulerFactory, provider3, provider3);
            InstanceFactory instanceFactory3 = transportRuntimeComponentImpl.e;
            TimeModule_EventClockFactory timeModule_EventClockFactoryA = TimeModule_EventClockFactory.a();
            TimeModule_UptimeClockFactory timeModule_UptimeClockFactoryA = TimeModule_UptimeClockFactory.a();
            Provider provider4 = transportRuntimeComponentImpl.i;
            transportRuntimeComponentImpl.l = new Uploader_Factory(instanceFactory3, provider2, provider3, schedulingModule_WorkSchedulerFactory, provider, provider3, timeModule_EventClockFactoryA, timeModule_UptimeClockFactoryA, provider4);
            transportRuntimeComponentImpl.m = new WorkInitializer_Factory(transportRuntimeComponentImpl.d, provider4, transportRuntimeComponentImpl.j, provider4);
            transportRuntimeComponentImpl.n = DoubleCheck.a(new TransportRuntime_Factory(TimeModule_EventClockFactory.a(), TimeModule_UptimeClockFactory.a(), transportRuntimeComponentImpl.k, transportRuntimeComponentImpl.l, transportRuntimeComponentImpl.m));
            return transportRuntimeComponentImpl;
        }
    }

    public static final class TransportRuntimeComponentImpl extends TransportRuntimeComponent {
        public Provider d;
        public InstanceFactory e;
        public Provider f;
        public SchemaManager_Factory g;
        public Provider h;
        public Provider i;
        public SchedulingModule_WorkSchedulerFactory j;
        public DefaultScheduler_Factory k;
        public Uploader_Factory l;
        public WorkInitializer_Factory m;
        public Provider n;

        @Override // com.google.android.datatransport.runtime.TransportRuntimeComponent
        public final EventStore a() {
            return (EventStore) this.i.get();
        }

        @Override // com.google.android.datatransport.runtime.TransportRuntimeComponent
        public final TransportRuntime b() {
            return (TransportRuntime) this.n.get();
        }
    }
}
