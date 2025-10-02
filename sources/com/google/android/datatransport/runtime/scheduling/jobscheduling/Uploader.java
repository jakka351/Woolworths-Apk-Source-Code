package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.runtime.EncodedPayload;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.ProtoEncoderDoNotUse;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.backends.BackendRequest;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.android.datatransport.runtime.backends.TransportBackend;
import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class Uploader {

    /* renamed from: a, reason: collision with root package name */
    public final Context f14476a;
    public final BackendRegistry b;
    public final EventStore c;
    public final WorkScheduler d;
    public final Executor e;
    public final SynchronizationGuard f;
    public final Clock g;
    public final Clock h;
    public final ClientHealthMetricsStore i;

    public Uploader(Context context, BackendRegistry backendRegistry, EventStore eventStore, WorkScheduler workScheduler, Executor executor, SynchronizationGuard synchronizationGuard, Clock clock, Clock clock2, ClientHealthMetricsStore clientHealthMetricsStore) {
        this.f14476a = context;
        this.b = backendRegistry;
        this.c = eventStore;
        this.d = workScheduler;
        this.e = executor;
        this.f = synchronizationGuard;
        this.g = clock;
        this.h = clock2;
        this.i = clientHealthMetricsStore;
    }

    public final void a(final TransportContext transportContext, int i) {
        BackendResponse backendResponseB;
        TransportBackend transportBackendB = this.b.b(transportContext.b());
        final long jMax = 0;
        BackendResponse.e(0L);
        while (true) {
            final int i2 = 0;
            SynchronizationGuard.CriticalSection criticalSection = new SynchronizationGuard.CriticalSection(this) { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.b
                public final /* synthetic */ Uploader e;

                {
                    this.e = this;
                }

                @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                public final Object execute() {
                    switch (i2) {
                        case 0:
                            return Boolean.valueOf(this.e.c.E1(transportContext));
                        default:
                            return this.e.c.T1(transportContext);
                    }
                }
            };
            SynchronizationGuard synchronizationGuard = this.f;
            if (!((Boolean) synchronizationGuard.d(criticalSection)).booleanValue()) {
                synchronizationGuard.d(new d(this, transportContext, jMax));
                return;
            }
            final int i3 = 1;
            final Iterable iterable = (Iterable) synchronizationGuard.d(new SynchronizationGuard.CriticalSection(this) { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.b
                public final /* synthetic */ Uploader e;

                {
                    this.e = this;
                }

                @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                public final Object execute() {
                    switch (i3) {
                        case 0:
                            return Boolean.valueOf(this.e.c.E1(transportContext));
                        default:
                            return this.e.c.T1(transportContext);
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (transportBackendB == null) {
                Logging.a("Uploader", "Unknown backend for %s, deleting event batch for it...", transportContext);
                backendResponseB = BackendResponse.a();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((PersistedEvent) it.next()).a());
                }
                if (transportContext.c() != null) {
                    ClientHealthMetricsStore clientHealthMetricsStore = this.i;
                    Objects.requireNonNull(clientHealthMetricsStore);
                    ClientMetrics clientMetrics = (ClientMetrics) synchronizationGuard.d(new androidx.compose.runtime.snapshots.a(clientHealthMetricsStore, 4));
                    EventInternal.Builder builderA = EventInternal.a();
                    builderA.f(this.g.a());
                    builderA.l(this.h.a());
                    builderA.k("GDT_CLIENT_METRICS");
                    Encoding encoding = new Encoding("proto");
                    clientMetrics.getClass();
                    ProtobufEncoder protobufEncoder = ProtoEncoderDoNotUse.f14441a;
                    protobufEncoder.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        protobufEncoder.a(clientMetrics, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    builderA.e(new EncodedPayload(encoding, byteArrayOutputStream.toByteArray()));
                    arrayList.add(transportBackendB.a(builderA.b()));
                }
                BackendRequest.Builder builderA2 = BackendRequest.a();
                builderA2.b(arrayList);
                builderA2.c(transportContext.c());
                backendResponseB = transportBackendB.b(builderA2.a());
            }
            if (backendResponseB.c() == BackendResponse.Status.e) {
                synchronizationGuard.d(new SynchronizationGuard.CriticalSection() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.c
                    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                    public final Object execute() {
                        Uploader uploader = this.d;
                        EventStore eventStore = uploader.c;
                        eventStore.G1(iterable);
                        eventStore.h2(uploader.g.a() + jMax, transportContext);
                        return null;
                    }
                });
                this.d.a(transportContext, i + 1, true);
                return;
            }
            synchronizationGuard.d(new androidx.work.d(2, this, iterable));
            if (backendResponseB.c() == BackendResponse.Status.d) {
                jMax = Math.max(jMax, backendResponseB.b());
                if (transportContext.c() != null) {
                    synchronizationGuard.d(new androidx.compose.runtime.snapshots.a(this, 5));
                }
            } else if (backendResponseB.c() == BackendResponse.Status.g) {
                HashMap map = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String strL = ((PersistedEvent) it2.next()).a().l();
                    if (map.containsKey(strL)) {
                        map.put(strL, Integer.valueOf(((Integer) map.get(strL)).intValue() + 1));
                    } else {
                        map.put(strL, 1);
                    }
                }
                synchronizationGuard.d(new androidx.work.d(3, this, map));
            }
        }
    }
}
