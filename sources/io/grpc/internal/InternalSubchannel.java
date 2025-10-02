package io.grpc.internal;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import com.google.common.base.Supplier;
import io.grpc.Attributes;
import io.grpc.CallOptions;
import io.grpc.ChannelLogger;
import io.grpc.ClientStreamTracer;
import io.grpc.ClientTransportFilter;
import io.grpc.ConnectivityState;
import io.grpc.ConnectivityStateInfo;
import io.grpc.EquivalentAddressGroup;
import io.grpc.HttpConnectProxiedSocketAddress;
import io.grpc.InternalChannelz;
import io.grpc.InternalInstrumented;
import io.grpc.InternalLogId;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;
import io.grpc.Status;
import io.grpc.SynchronizationContext;
import io.grpc.internal.BackoffPolicy;
import io.grpc.internal.ClientStreamListener;
import io.grpc.internal.ClientTransportFactory;
import io.grpc.internal.ExponentialBackoffPolicy;
import io.grpc.internal.ManagedChannelImpl;
import io.grpc.internal.ManagedClientTransport;
import io.grpc.internal.TimeProvider;
import java.net.SocketAddress;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: classes7.dex */
final class InternalSubchannel implements InternalInstrumented<InternalChannelz.ChannelStats>, TransportProvider {

    /* renamed from: a, reason: collision with root package name */
    public final InternalLogId f24023a;
    public final String b;
    public final BackoffPolicy.Provider c;
    public final ManagedChannelImpl.SubchannelImpl.C1ManagedInternalSubchannelCallback d;
    public final ClientTransportFactory e;
    public final ScheduledExecutorService f;
    public final InternalChannelz g;
    public final CallTracer h;
    public final ChannelLogger i;
    public final List j;
    public final SynchronizationContext k;
    public final Index l;
    public volatile List m;
    public BackoffPolicy n;
    public final Stopwatch o;
    public SynchronizationContext.ScheduledHandle p;
    public SynchronizationContext.ScheduledHandle q;
    public ManagedClientTransport r;
    public ConnectionClientTransport u;
    public volatile ManagedClientTransport v;
    public Status x;
    public final ArrayList s = new ArrayList();
    public final InUseStateAggregator t = new InUseStateAggregator<ConnectionClientTransport>() { // from class: io.grpc.internal.InternalSubchannel.1
        @Override // io.grpc.internal.InUseStateAggregator
        public final void a() {
            InternalSubchannel internalSubchannel = InternalSubchannel.this;
            ManagedChannelImpl.this.c0.c(internalSubchannel, true);
        }

        @Override // io.grpc.internal.InUseStateAggregator
        public final void b() {
            InternalSubchannel internalSubchannel = InternalSubchannel.this;
            ManagedChannelImpl.this.c0.c(internalSubchannel, false);
        }
    };
    public volatile ConnectivityStateInfo w = ConnectivityStateInfo.a(ConnectivityState.g);

    /* renamed from: io.grpc.internal.InternalSubchannel$3, reason: invalid class name */
    class AnonymousClass3 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* renamed from: io.grpc.internal.InternalSubchannel$5, reason: invalid class name */
    class AnonymousClass5 implements Runnable {
        public final /* synthetic */ Status d;

        public AnonymousClass5(Status status) {
            this.d = status;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ConnectivityState connectivityState = InternalSubchannel.this.w.f23930a;
            ConnectivityState connectivityState2 = ConnectivityState.h;
            if (connectivityState == connectivityState2) {
                return;
            }
            InternalSubchannel internalSubchannel = InternalSubchannel.this;
            internalSubchannel.x = this.d;
            ManagedClientTransport managedClientTransport = internalSubchannel.v;
            InternalSubchannel internalSubchannel2 = InternalSubchannel.this;
            ConnectionClientTransport connectionClientTransport = internalSubchannel2.u;
            internalSubchannel2.v = null;
            InternalSubchannel internalSubchannel3 = InternalSubchannel.this;
            internalSubchannel3.u = null;
            InternalSubchannel.h(internalSubchannel3, connectivityState2);
            InternalSubchannel.this.l.a();
            if (InternalSubchannel.this.s.isEmpty()) {
                InternalSubchannel internalSubchannel4 = InternalSubchannel.this;
                internalSubchannel4.k.execute(internalSubchannel4.new AnonymousClass6());
            }
            InternalSubchannel internalSubchannel5 = InternalSubchannel.this;
            internalSubchannel5.k.e();
            SynchronizationContext.ScheduledHandle scheduledHandle = internalSubchannel5.p;
            if (scheduledHandle != null) {
                scheduledHandle.a();
                internalSubchannel5.p = null;
                internalSubchannel5.n = null;
            }
            SynchronizationContext.ScheduledHandle scheduledHandle2 = InternalSubchannel.this.q;
            if (scheduledHandle2 != null) {
                scheduledHandle2.a();
                InternalSubchannel.this.r.g(this.d);
                InternalSubchannel internalSubchannel6 = InternalSubchannel.this;
                internalSubchannel6.q = null;
                internalSubchannel6.r = null;
            }
            if (managedClientTransport != null) {
                ((ForwardingConnectionClientTransport) managedClientTransport).g(this.d);
            }
            if (connectionClientTransport != null) {
                ((ForwardingConnectionClientTransport) connectionClientTransport).g(this.d);
            }
        }
    }

    /* renamed from: io.grpc.internal.InternalSubchannel$6, reason: invalid class name */
    class AnonymousClass6 implements Runnable {
        public AnonymousClass6() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            InternalSubchannel internalSubchannel = InternalSubchannel.this;
            internalSubchannel.i.a(ChannelLogger.ChannelLogLevel.e, "Terminated");
            ManagedChannelImpl managedChannelImpl = ManagedChannelImpl.this;
            managedChannelImpl.B.remove(internalSubchannel);
            InternalChannelz.a(managedChannelImpl.Q.b, internalSubchannel);
            ManagedChannelImpl.o(managedChannelImpl);
        }
    }

    /* renamed from: io.grpc.internal.InternalSubchannel$7, reason: invalid class name */
    class AnonymousClass7 implements Runnable {
        public final /* synthetic */ ConnectionClientTransport d;
        public final /* synthetic */ boolean e;

        public AnonymousClass7(ConnectionClientTransport connectionClientTransport, boolean z) {
            this.d = connectionClientTransport;
            this.e = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            InternalSubchannel.this.t.c(this.d, this.e);
        }
    }

    /* renamed from: io.grpc.internal.InternalSubchannel$9, reason: invalid class name */
    class AnonymousClass9 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            new InternalChannelz.ChannelStats.Builder();
            throw null;
        }
    }

    @VisibleForTesting
    public static final class CallTracingTransport extends ForwardingConnectionClientTransport {

        /* renamed from: a, reason: collision with root package name */
        public final ConnectionClientTransport f24024a;
        public final CallTracer b;

        public CallTracingTransport(ConnectionClientTransport connectionClientTransport, CallTracer callTracer) {
            this.f24024a = connectionClientTransport;
            this.b = callTracer;
        }

        @Override // io.grpc.internal.ForwardingConnectionClientTransport
        public final ConnectionClientTransport a() {
            return this.f24024a;
        }

        @Override // io.grpc.internal.ForwardingConnectionClientTransport, io.grpc.internal.ClientTransport
        public final ClientStream d(MethodDescriptor methodDescriptor, Metadata metadata, CallOptions callOptions, ClientStreamTracer[] clientStreamTracerArr) {
            final ClientStream clientStreamD = super.d(methodDescriptor, metadata, callOptions, clientStreamTracerArr);
            return new ForwardingClientStream() { // from class: io.grpc.internal.InternalSubchannel.CallTracingTransport.1
                @Override // io.grpc.internal.ForwardingClientStream, io.grpc.internal.ClientStream
                public final void n(final ClientStreamListener clientStreamListener) {
                    CallTracer callTracer = CallTracingTransport.this.b;
                    callTracer.b.a();
                    ((TimeProvider.AnonymousClass1) callTracer.f23991a).a();
                    super.n(new ForwardingClientStreamListener() { // from class: io.grpc.internal.InternalSubchannel.CallTracingTransport.1.1
                        @Override // io.grpc.internal.ForwardingClientStreamListener, io.grpc.internal.ClientStreamListener
                        public final void c(Status status, ClientStreamListener.RpcProgress rpcProgress, Metadata metadata2) {
                            CallTracingTransport.this.b.a(status.f());
                            super.c(status, rpcProgress, metadata2);
                        }

                        @Override // io.grpc.internal.ForwardingClientStreamListener
                        public final ClientStreamListener d() {
                            return clientStreamListener;
                        }
                    });
                }

                @Override // io.grpc.internal.ForwardingClientStream
                public final ClientStream o() {
                    return clientStreamD;
                }
            };
        }
    }

    public static abstract class Callback {
    }

    @VisibleForTesting
    public static final class Index {

        /* renamed from: a, reason: collision with root package name */
        public List f24027a;
        public int b;
        public int c;

        public final void a() {
            this.b = 0;
            this.c = 0;
        }
    }

    public class TransportListener implements ManagedClientTransport.Listener {

        /* renamed from: a, reason: collision with root package name */
        public final ConnectionClientTransport f24028a;
        public boolean b = false;

        public TransportListener(ConnectionClientTransport connectionClientTransport) {
            this.f24028a = connectionClientTransport;
        }

        @Override // io.grpc.internal.ManagedClientTransport.Listener
        public final void a(final Status status) {
            InternalSubchannel internalSubchannel = InternalSubchannel.this;
            internalSubchannel.i.b(ChannelLogger.ChannelLogLevel.e, "{0} SHUTDOWN with {1}", ((ForwardingConnectionClientTransport) this.f24028a).b(), InternalSubchannel.k(status));
            this.b = true;
            internalSubchannel.k.execute(new Runnable() { // from class: io.grpc.internal.InternalSubchannel.TransportListener.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (InternalSubchannel.this.w.f23930a == ConnectivityState.h) {
                        return;
                    }
                    ManagedClientTransport managedClientTransport = InternalSubchannel.this.v;
                    TransportListener transportListener = TransportListener.this;
                    ConnectionClientTransport connectionClientTransport = transportListener.f24028a;
                    if (managedClientTransport == connectionClientTransport) {
                        InternalSubchannel.this.v = null;
                        InternalSubchannel.this.l.a();
                        InternalSubchannel.h(InternalSubchannel.this, ConnectivityState.g);
                        return;
                    }
                    InternalSubchannel internalSubchannel2 = InternalSubchannel.this;
                    if (internalSubchannel2.u == connectionClientTransport) {
                        Preconditions.p("Expected state is CONNECTING, actual state is %s", InternalSubchannel.this.w.f23930a, internalSubchannel2.w.f23930a == ConnectivityState.d);
                        Index index = InternalSubchannel.this.l;
                        EquivalentAddressGroup equivalentAddressGroup = (EquivalentAddressGroup) index.f24027a.get(index.b);
                        int i = index.c + 1;
                        index.c = i;
                        if (i >= equivalentAddressGroup.f23936a.size()) {
                            index.b++;
                            index.c = 0;
                        }
                        Index index2 = InternalSubchannel.this.l;
                        if (index2.b < index2.f24027a.size()) {
                            InternalSubchannel.i(InternalSubchannel.this);
                            return;
                        }
                        InternalSubchannel internalSubchannel3 = InternalSubchannel.this;
                        internalSubchannel3.u = null;
                        internalSubchannel3.l.a();
                        final InternalSubchannel internalSubchannel4 = InternalSubchannel.this;
                        Status status2 = status;
                        internalSubchannel4.k.e();
                        Preconditions.f("The error status must not be OK", !status2.f());
                        internalSubchannel4.j(new ConnectivityStateInfo(ConnectivityState.f, status2));
                        if (internalSubchannel4.n == null) {
                            internalSubchannel4.n = internalSubchannel4.c.get();
                        }
                        long jA = internalSubchannel4.n.a();
                        Stopwatch stopwatch = internalSubchannel4.o;
                        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                        long jA2 = jA - stopwatch.a();
                        internalSubchannel4.i.b(ChannelLogger.ChannelLogLevel.e, "TRANSIENT_FAILURE ({0}). Will reconnect after {1} ns", InternalSubchannel.k(status2), Long.valueOf(jA2));
                        Preconditions.q("previous reconnectTask is not done", internalSubchannel4.p == null);
                        internalSubchannel4.p = internalSubchannel4.k.c(new Runnable() { // from class: io.grpc.internal.InternalSubchannel.1EndOfCurrentBackoff
                            @Override // java.lang.Runnable
                            public final void run() {
                                InternalSubchannel internalSubchannel5 = InternalSubchannel.this;
                                internalSubchannel5.p = null;
                                internalSubchannel5.i.a(ChannelLogger.ChannelLogLevel.e, "CONNECTING after backoff");
                                InternalSubchannel.h(internalSubchannel5, ConnectivityState.d);
                                InternalSubchannel.i(internalSubchannel5);
                            }
                        }, jA2, timeUnit, internalSubchannel4.f);
                    }
                }
            });
        }

        @Override // io.grpc.internal.ManagedClientTransport.Listener
        public final void b() {
            InternalSubchannel internalSubchannel = InternalSubchannel.this;
            internalSubchannel.i.a(ChannelLogger.ChannelLogLevel.e, "READY");
            internalSubchannel.k.execute(new Runnable() { // from class: io.grpc.internal.InternalSubchannel.TransportListener.1
                @Override // java.lang.Runnable
                public final void run() {
                    TransportListener transportListener = TransportListener.this;
                    InternalSubchannel internalSubchannel2 = InternalSubchannel.this;
                    internalSubchannel2.n = null;
                    if (internalSubchannel2.x != null) {
                        Preconditions.q("Unexpected non-null activeTransport", internalSubchannel2.v == null);
                        TransportListener transportListener2 = TransportListener.this;
                        ((ForwardingConnectionClientTransport) transportListener2.f24028a).g(InternalSubchannel.this.x);
                        return;
                    }
                    ConnectionClientTransport connectionClientTransport = internalSubchannel2.u;
                    ConnectionClientTransport connectionClientTransport2 = transportListener.f24028a;
                    if (connectionClientTransport == connectionClientTransport2) {
                        internalSubchannel2.v = connectionClientTransport2;
                        InternalSubchannel internalSubchannel3 = InternalSubchannel.this;
                        internalSubchannel3.u = null;
                        InternalSubchannel.h(internalSubchannel3, ConnectivityState.e);
                    }
                }
            });
        }

        @Override // io.grpc.internal.ManagedClientTransport.Listener
        public final void c() {
            Preconditions.q("transportShutdown() must be called before transportTerminated().", this.b);
            InternalSubchannel internalSubchannel = InternalSubchannel.this;
            ChannelLogger channelLogger = internalSubchannel.i;
            ConnectionClientTransport connectionClientTransport = this.f24028a;
            ForwardingConnectionClientTransport forwardingConnectionClientTransport = (ForwardingConnectionClientTransport) connectionClientTransport;
            channelLogger.b(ChannelLogger.ChannelLogLevel.e, "{0} Terminated", forwardingConnectionClientTransport.b());
            InternalChannelz.a(internalSubchannel.g.c, connectionClientTransport);
            SynchronizationContext synchronizationContext = internalSubchannel.k;
            synchronizationContext.execute(internalSubchannel.new AnonymousClass7(connectionClientTransport, false));
            for (ClientTransportFilter clientTransportFilter : internalSubchannel.j) {
                forwardingConnectionClientTransport.getAttributes();
                clientTransportFilter.getClass();
            }
            synchronizationContext.execute(new Runnable() { // from class: io.grpc.internal.InternalSubchannel.TransportListener.3
                @Override // java.lang.Runnable
                public final void run() {
                    TransportListener transportListener = TransportListener.this;
                    InternalSubchannel.this.s.remove(transportListener.f24028a);
                    if (InternalSubchannel.this.w.f23930a == ConnectivityState.h && InternalSubchannel.this.s.isEmpty()) {
                        InternalSubchannel internalSubchannel2 = InternalSubchannel.this;
                        internalSubchannel2.k.execute(internalSubchannel2.new AnonymousClass6());
                    }
                }
            });
        }

        @Override // io.grpc.internal.ManagedClientTransport.Listener
        public final void d(boolean z) {
            InternalSubchannel internalSubchannel = InternalSubchannel.this;
            internalSubchannel.k.execute(internalSubchannel.new AnonymousClass7(this.f24028a, z));
        }

        @Override // io.grpc.internal.ManagedClientTransport.Listener
        public final Attributes e(Attributes attributes) {
            for (ClientTransportFilter clientTransportFilter : InternalSubchannel.this.j) {
                clientTransportFilter.getClass();
                Preconditions.k(attributes, "Filter %s returned null", clientTransportFilter);
            }
            return attributes;
        }
    }

    @VisibleForTesting
    public static final class TransportLogger extends ChannelLogger {

        /* renamed from: a, reason: collision with root package name */
        public InternalLogId f24029a;

        @Override // io.grpc.ChannelLogger
        public final void a(ChannelLogger.ChannelLogLevel channelLogLevel, String str) {
            InternalLogId internalLogId = this.f24029a;
            Level levelD = ChannelLoggerImpl.d(channelLogLevel);
            if (ChannelTracer.d.isLoggable(levelD)) {
                ChannelTracer.a(internalLogId, levelD, str);
            }
        }

        @Override // io.grpc.ChannelLogger
        public final void b(ChannelLogger.ChannelLogLevel channelLogLevel, String str, Object... objArr) {
            InternalLogId internalLogId = this.f24029a;
            Level levelD = ChannelLoggerImpl.d(channelLogLevel);
            if (ChannelTracer.d.isLoggable(levelD)) {
                ChannelTracer.a(internalLogId, levelD, MessageFormat.format(str, objArr));
            }
        }
    }

    public InternalSubchannel(List list, String str, ExponentialBackoffPolicy.Provider provider, ClientTransportFactory clientTransportFactory, ScheduledExecutorService scheduledExecutorService, Supplier supplier, SynchronizationContext synchronizationContext, ManagedChannelImpl.SubchannelImpl.C1ManagedInternalSubchannelCallback c1ManagedInternalSubchannelCallback, InternalChannelz internalChannelz, CallTracer callTracer, ChannelTracer channelTracer, InternalLogId internalLogId, ChannelLogger channelLogger, ArrayList arrayList) {
        Preconditions.j(list, "addressGroups");
        Preconditions.f("addressGroups is empty", !list.isEmpty());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Preconditions.j(it.next(), "addressGroups contains null entry");
        }
        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.m = listUnmodifiableList;
        Index index = new Index();
        index.f24027a = listUnmodifiableList;
        this.l = index;
        this.b = str;
        this.c = provider;
        this.e = clientTransportFactory;
        this.f = scheduledExecutorService;
        this.o = (Stopwatch) supplier.get();
        this.k = synchronizationContext;
        this.d = c1ManagedInternalSubchannelCallback;
        this.g = internalChannelz;
        this.h = callTracer;
        Preconditions.j(channelTracer, "channelTracer");
        Preconditions.j(internalLogId, "logId");
        this.f24023a = internalLogId;
        Preconditions.j(channelLogger, "channelLogger");
        this.i = channelLogger;
        this.j = arrayList;
    }

    public static void h(InternalSubchannel internalSubchannel, ConnectivityState connectivityState) {
        internalSubchannel.k.e();
        internalSubchannel.j(ConnectivityStateInfo.a(connectivityState));
    }

    public static void i(InternalSubchannel internalSubchannel) {
        SocketAddress socketAddress;
        HttpConnectProxiedSocketAddress httpConnectProxiedSocketAddress;
        Index index = internalSubchannel.l;
        SynchronizationContext synchronizationContext = internalSubchannel.k;
        synchronizationContext.e();
        Preconditions.q("Should have no reconnectTask scheduled", internalSubchannel.p == null);
        if (index.b == 0 && index.c == 0) {
            Stopwatch stopwatch = internalSubchannel.o;
            stopwatch.b = 0L;
            stopwatch.f14868a = false;
            stopwatch.b();
        }
        SocketAddress socketAddress2 = (SocketAddress) ((EquivalentAddressGroup) index.f24027a.get(index.b)).f23936a.get(index.c);
        if (socketAddress2 instanceof HttpConnectProxiedSocketAddress) {
            httpConnectProxiedSocketAddress = (HttpConnectProxiedSocketAddress) socketAddress2;
            socketAddress = httpConnectProxiedSocketAddress.e;
        } else {
            socketAddress = socketAddress2;
            httpConnectProxiedSocketAddress = null;
        }
        Attributes attributes = ((EquivalentAddressGroup) index.f24027a.get(index.b)).b;
        String str = (String) attributes.f23916a.get(EquivalentAddressGroup.d);
        ClientTransportFactory.ClientTransportOptions clientTransportOptions = new ClientTransportFactory.ClientTransportOptions();
        clientTransportOptions.f23999a = "unknown-authority";
        clientTransportOptions.b = Attributes.b;
        if (str == null) {
            str = internalSubchannel.b;
        }
        Preconditions.j(str, "authority");
        clientTransportOptions.f23999a = str;
        clientTransportOptions.b = attributes;
        clientTransportOptions.c = httpConnectProxiedSocketAddress;
        TransportLogger transportLogger = new TransportLogger();
        transportLogger.f24029a = internalSubchannel.f24023a;
        CallTracingTransport callTracingTransport = new CallTracingTransport(internalSubchannel.e.K0(socketAddress, clientTransportOptions, transportLogger), internalSubchannel.h);
        transportLogger.f24029a = callTracingTransport.b();
        internalSubchannel.u = callTracingTransport;
        internalSubchannel.s.add(callTracingTransport);
        Runnable runnableE = callTracingTransport.e(internalSubchannel.new TransportListener(callTracingTransport));
        if (runnableE != null) {
            synchronizationContext.b(runnableE);
        }
        internalSubchannel.i.b(ChannelLogger.ChannelLogLevel.e, "Started transport {0}", transportLogger.f24029a);
    }

    public static String k(Status status) {
        StringBuilder sb = new StringBuilder();
        Status.Code code = status.f23971a;
        Throwable th = status.c;
        sb.append(code);
        String str = status.b;
        if (str != null) {
            androidx.compose.ui.input.pointer.a.w(sb, "(", str, ")");
        }
        if (th != null) {
            sb.append("[");
            sb.append(th);
            sb.append("]");
        }
        return sb.toString();
    }

    @Override // io.grpc.internal.TransportProvider
    public final ManagedClientTransport a() {
        ManagedClientTransport managedClientTransport = this.v;
        if (managedClientTransport != null) {
            return managedClientTransport;
        }
        this.k.execute(new Runnable() { // from class: io.grpc.internal.InternalSubchannel.2
            @Override // java.lang.Runnable
            public final void run() {
                if (InternalSubchannel.this.w.f23930a == ConnectivityState.g) {
                    InternalSubchannel.this.i.a(ChannelLogger.ChannelLogLevel.e, "CONNECTING as requested");
                    InternalSubchannel.h(InternalSubchannel.this, ConnectivityState.d);
                    InternalSubchannel.i(InternalSubchannel.this);
                }
            }
        });
        return null;
    }

    @Override // io.grpc.InternalWithLogId
    public final InternalLogId b() {
        return this.f24023a;
    }

    public final void j(ConnectivityStateInfo connectivityStateInfo) {
        this.k.e();
        if (this.w.f23930a != connectivityStateInfo.f23930a) {
            Preconditions.q("Cannot transition out of SHUTDOWN to " + connectivityStateInfo, this.w.f23930a != ConnectivityState.h);
            this.w = connectivityStateInfo;
            this.d.f24050a.a(connectivityStateInfo);
        }
    }

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.b(this.f24023a.c, "logId");
        toStringHelperB.c(this.m, "addressGroups");
        return toStringHelperB.toString();
    }
}
