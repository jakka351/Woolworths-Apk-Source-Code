package io.grpc.internal;

import io.grpc.CallOptions;
import io.grpc.ClientStreamTracer;
import io.grpc.Context;
import io.grpc.InternalLogId;
import io.grpc.LoadBalancer;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;
import io.grpc.Status;
import io.grpc.SynchronizationContext;
import io.grpc.internal.ClientStreamListener;
import io.grpc.internal.DelayedStream;
import io.grpc.internal.ManagedChannelImpl;
import io.grpc.internal.ManagedClientTransport;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* loaded from: classes7.dex */
final class DelayedClientTransport implements ManagedClientTransport {
    public final Executor c;
    public final SynchronizationContext d;
    public Runnable e;
    public Runnable f;
    public Runnable g;
    public ManagedClientTransport.Listener h;
    public Status j;
    public LoadBalancer.SubchannelPicker k;
    public long l;

    /* renamed from: a, reason: collision with root package name */
    public final InternalLogId f24004a = InternalLogId.a(DelayedClientTransport.class, null);
    public final Object b = new Object();
    public Collection i = new LinkedHashSet();

    public class PendingStream extends DelayedStream {
        public final PickSubchannelArgsImpl j;
        public final Context k = Context.d();
        public final ClientStreamTracer[] l;

        public PendingStream(PickSubchannelArgsImpl pickSubchannelArgsImpl, ClientStreamTracer[] clientStreamTracerArr) {
            this.j = pickSubchannelArgsImpl;
            this.l = clientStreamTracerArr;
        }

        @Override // io.grpc.internal.DelayedStream, io.grpc.internal.ClientStream
        public final void e(Status status) {
            super.e(status);
            synchronized (DelayedClientTransport.this.b) {
                try {
                    DelayedClientTransport delayedClientTransport = DelayedClientTransport.this;
                    if (delayedClientTransport.g != null) {
                        boolean zRemove = delayedClientTransport.i.remove(this);
                        if (!DelayedClientTransport.this.h() && zRemove) {
                            DelayedClientTransport delayedClientTransport2 = DelayedClientTransport.this;
                            delayedClientTransport2.d.b(delayedClientTransport2.f);
                            DelayedClientTransport delayedClientTransport3 = DelayedClientTransport.this;
                            if (delayedClientTransport3.j != null) {
                                delayedClientTransport3.d.b(delayedClientTransport3.g);
                                DelayedClientTransport.this.g = null;
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            DelayedClientTransport.this.d.a();
        }

        @Override // io.grpc.internal.DelayedStream, io.grpc.internal.ClientStream
        public final void l(InsightBuilder insightBuilder) {
            if (this.j.f24074a.b()) {
                insightBuilder.f24022a.add("wait_for_ready");
            }
            super.l(insightBuilder);
        }

        @Override // io.grpc.internal.DelayedStream
        public final void r(Status status) {
            for (ClientStreamTracer clientStreamTracer : this.l) {
                clientStreamTracer.i(status);
            }
        }
    }

    public DelayedClientTransport(Executor executor, SynchronizationContext synchronizationContext) {
        this.c = executor;
        this.d = synchronizationContext;
    }

    public final PendingStream a(PickSubchannelArgsImpl pickSubchannelArgsImpl, ClientStreamTracer[] clientStreamTracerArr) {
        int size;
        PendingStream pendingStream = new PendingStream(pickSubchannelArgsImpl, clientStreamTracerArr);
        this.i.add(pendingStream);
        synchronized (this.b) {
            size = this.i.size();
        }
        if (size == 1) {
            this.d.b(this.e);
        }
        for (ClientStreamTracer clientStreamTracer : clientStreamTracerArr) {
            clientStreamTracer.j();
        }
        return pendingStream;
    }

    @Override // io.grpc.InternalWithLogId
    public final InternalLogId b() {
        return this.f24004a;
    }

    @Override // io.grpc.internal.ClientTransport
    public final ClientStream d(MethodDescriptor methodDescriptor, Metadata metadata, CallOptions callOptions, ClientStreamTracer[] clientStreamTracerArr) {
        ClientStream failingClientStream;
        try {
            PickSubchannelArgsImpl pickSubchannelArgsImpl = new PickSubchannelArgsImpl(methodDescriptor, metadata, callOptions);
            LoadBalancer.SubchannelPicker subchannelPicker = null;
            long j = -1;
            while (true) {
                synchronized (this.b) {
                    Status status = this.j;
                    if (status == null) {
                        LoadBalancer.SubchannelPicker subchannelPicker2 = this.k;
                        if (subchannelPicker2 != null) {
                            if (subchannelPicker != null && j == this.l) {
                                failingClientStream = a(pickSubchannelArgsImpl, clientStreamTracerArr);
                                break;
                            }
                            j = this.l;
                            ClientTransport clientTransportF = GrpcUtil.f(subchannelPicker2.a(pickSubchannelArgsImpl), callOptions.b());
                            if (clientTransportF != null) {
                                failingClientStream = clientTransportF.d(pickSubchannelArgsImpl.c, pickSubchannelArgsImpl.b, pickSubchannelArgsImpl.f24074a, clientStreamTracerArr);
                                break;
                            }
                            subchannelPicker = subchannelPicker2;
                        } else {
                            failingClientStream = a(pickSubchannelArgsImpl, clientStreamTracerArr);
                            break;
                        }
                    } else {
                        failingClientStream = new FailingClientStream(status, ClientStreamListener.RpcProgress.d, clientStreamTracerArr);
                        break;
                    }
                }
            }
            return failingClientStream;
        } finally {
            this.d.a();
        }
    }

    @Override // io.grpc.internal.ManagedClientTransport
    public final Runnable e(final ManagedClientTransport.Listener listener) {
        this.h = listener;
        this.e = new Runnable() { // from class: io.grpc.internal.DelayedClientTransport.1
            @Override // java.lang.Runnable
            public final void run() {
                ((ManagedChannelImpl.DelayedTransportListener) listener).d(true);
            }
        };
        this.f = new Runnable() { // from class: io.grpc.internal.DelayedClientTransport.2
            @Override // java.lang.Runnable
            public final void run() {
                ((ManagedChannelImpl.DelayedTransportListener) listener).d(false);
            }
        };
        this.g = new Runnable() { // from class: io.grpc.internal.DelayedClientTransport.3
            @Override // java.lang.Runnable
            public final void run() {
                listener.c();
            }
        };
        return null;
    }

    @Override // io.grpc.internal.ManagedClientTransport
    public final void f(Status status) {
        Collection<PendingStream> collection;
        Runnable runnable;
        g(status);
        synchronized (this.b) {
            try {
                collection = this.i;
                runnable = this.g;
                this.g = null;
                if (!collection.isEmpty()) {
                    this.i = Collections.EMPTY_LIST;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (runnable != null) {
            for (PendingStream pendingStream : collection) {
                Runnable runnableS = pendingStream.s(new FailingClientStream(status, ClientStreamListener.RpcProgress.e, pendingStream.l));
                if (runnableS != null) {
                    ((DelayedStream.AnonymousClass4) runnableS).run();
                }
            }
            this.d.execute(runnable);
        }
    }

    @Override // io.grpc.internal.ManagedClientTransport
    public final void g(final Status status) {
        Runnable runnable;
        synchronized (this.b) {
            try {
                if (this.j != null) {
                    return;
                }
                this.j = status;
                this.d.b(new Runnable() { // from class: io.grpc.internal.DelayedClientTransport.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        DelayedClientTransport.this.h.a(status);
                    }
                });
                if (!h() && (runnable = this.g) != null) {
                    this.d.b(runnable);
                    this.g = null;
                }
                this.d.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean h() {
        boolean z;
        synchronized (this.b) {
            z = !this.i.isEmpty();
        }
        return z;
    }

    public final void i(LoadBalancer.SubchannelPicker subchannelPicker) {
        Runnable runnable;
        synchronized (this.b) {
            this.k = subchannelPicker;
            this.l++;
            if (subchannelPicker != null && h()) {
                ArrayList arrayList = new ArrayList(this.i);
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    PendingStream pendingStream = (PendingStream) it.next();
                    LoadBalancer.PickResult pickResultA = subchannelPicker.a(pendingStream.j);
                    CallOptions callOptions = pendingStream.j.f24074a;
                    ClientTransport clientTransportF = GrpcUtil.f(pickResultA, callOptions.b());
                    if (clientTransportF != null) {
                        Executor executor = this.c;
                        Executor executor2 = callOptions.b;
                        if (executor2 != null) {
                            executor = executor2;
                        }
                        PickSubchannelArgsImpl pickSubchannelArgsImpl = pendingStream.j;
                        Context context = pendingStream.k;
                        Context contextB = context.b();
                        try {
                            ClientStream clientStreamD = clientTransportF.d(pickSubchannelArgsImpl.c, pickSubchannelArgsImpl.b, pickSubchannelArgsImpl.f24074a, pendingStream.l);
                            context.e(contextB);
                            Runnable runnableS = pendingStream.s(clientStreamD);
                            if (runnableS != null) {
                                executor.execute(runnableS);
                            }
                            arrayList2.add(pendingStream);
                        } catch (Throwable th) {
                            context.e(contextB);
                            throw th;
                        }
                    }
                }
                synchronized (this.b) {
                    try {
                        if (h()) {
                            this.i.removeAll(arrayList2);
                            if (this.i.isEmpty()) {
                                this.i = new LinkedHashSet();
                            }
                            if (!h()) {
                                this.d.b(this.f);
                                if (this.j != null && (runnable = this.g) != null) {
                                    this.d.b(runnable);
                                    this.g = null;
                                }
                            }
                            this.d.a();
                        }
                    } finally {
                    }
                }
            }
        }
    }
}
