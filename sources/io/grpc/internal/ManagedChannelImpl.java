package io.grpc.internal;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import com.google.common.base.Supplier;
import com.google.firebase.firestore.remote.h;
import com.google.protobuf.GeneratedMessageLite;
import com.medallia.digital.mobilesdk.q2;
import io.grpc.Attributes;
import io.grpc.CallOptions;
import io.grpc.Channel;
import io.grpc.ChannelCredentials;
import io.grpc.ChannelLogger;
import io.grpc.ClientCall;
import io.grpc.ClientInterceptors;
import io.grpc.ClientStreamTracer;
import io.grpc.CompressorRegistry;
import io.grpc.ConnectivityState;
import io.grpc.Context;
import io.grpc.Deadline;
import io.grpc.DecompressorRegistry;
import io.grpc.EquivalentAddressGroup;
import io.grpc.ForwardingChannelBuilder2;
import io.grpc.ForwardingClientCall;
import io.grpc.InternalChannelz;
import io.grpc.InternalConfigSelector;
import io.grpc.InternalInstrumented;
import io.grpc.InternalLogId;
import io.grpc.LoadBalancer;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;
import io.grpc.NameResolver;
import io.grpc.NameResolverProvider;
import io.grpc.NameResolverRegistry;
import io.grpc.ProxyDetector;
import io.grpc.Status;
import io.grpc.SynchronizationContext;
import io.grpc.internal.AutoConfiguredLoadBalancerFactory;
import io.grpc.internal.AutoConfiguredLoadBalancerFactory.AutoConfiguredLoadBalancer;
import io.grpc.internal.CallTracer;
import io.grpc.internal.ClientCallImpl;
import io.grpc.internal.ConnectivityStateManager;
import io.grpc.internal.ExponentialBackoffPolicy;
import io.grpc.internal.InternalSubchannel;
import io.grpc.internal.InternalSubchannel.AnonymousClass5;
import io.grpc.internal.ManagedChannelImplBuilder;
import io.grpc.internal.ManagedChannelServiceConfig;
import io.grpc.internal.ManagedClientTransport;
import io.grpc.internal.Rescheduler.FutureRunnable;
import io.grpc.internal.RetriableStream;
import io.grpc.internal.TimeProvider;
import java.lang.Thread;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: classes7.dex */
final class ManagedChannelImpl extends ManagedChannel implements InternalInstrumented<InternalChannelz.ChannelStats> {
    public static final Logger f0 = Logger.getLogger(ManagedChannelImpl.class.getName());
    public static final Pattern g0 = Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");
    public static final Status h0;
    public static final Status i0;
    public static final Status j0;
    public static final ManagedChannelServiceConfig k0;
    public static final InternalConfigSelector l0;
    public static final ClientCall m0;
    public boolean A;
    public final HashSet B;
    public LinkedHashSet C;
    public final Object D;
    public final HashSet E;
    public final DelayedClientTransport F;
    public final UncommittedRetriableStreamsRegistry G;
    public final AtomicBoolean H;
    public boolean I;
    public boolean J;
    public volatile boolean K;
    public final CountDownLatch L;
    public final CallTracer.Factory M;
    public final CallTracer N;
    public final ChannelTracer O;
    public final ChannelLogger P;
    public final InternalChannelz Q;
    public final RealChannel R;
    public ResolutionState S;
    public ManagedChannelServiceConfig T;
    public boolean U;
    public final boolean V;
    public final RetriableStream.ChannelBufferMeter W;
    public final long X;
    public final long Y;
    public final boolean Z;

    /* renamed from: a, reason: collision with root package name */
    public final InternalLogId f24038a;
    public final Deadline.Ticker a0;
    public final String b;
    public final ManagedClientTransport.Listener b0;
    public final NameResolverRegistry c;
    public final InUseStateAggregator c0;
    public final NameResolver.Args d;
    public final ChannelStreamProvider d0;
    public final AutoConfiguredLoadBalancerFactory e;
    public final Rescheduler e0;
    public final ClientTransportFactory f;
    public final ClientTransportFactory g;
    public final RestrictedScheduledExecutor h;
    public final Executor i;
    public final ObjectPool j;
    public final ExecutorHolder k;
    public final ExecutorHolder l;
    public final TimeProvider m;
    public final SynchronizationContext n;
    public final DecompressorRegistry o;
    public final CompressorRegistry p;
    public final Supplier q;
    public final long r;
    public final ConnectivityStateManager s;
    public final ExponentialBackoffPolicy.Provider t;
    public final Channel u;
    public final ArrayList v;
    public NameResolver w;
    public boolean x;
    public LbHelperImpl y;
    public volatile LoadBalancer.SubchannelPicker z;

    /* renamed from: io.grpc.internal.ManagedChannelImpl$1, reason: invalid class name */
    public class AnonymousClass1 extends InternalConfigSelector {
        @Override // io.grpc.InternalConfigSelector
        public final InternalConfigSelector.Result a() {
            throw new IllegalStateException("Resolution is pending");
        }
    }

    /* renamed from: io.grpc.internal.ManagedChannelImpl$1ResetConnectBackoff, reason: invalid class name */
    final class C1ResetConnectBackoff implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* renamed from: io.grpc.internal.ManagedChannelImpl$1StatsFetcher, reason: invalid class name */
    final class C1StatsFetcher implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            new InternalChannelz.ChannelStats.Builder();
            throw null;
        }
    }

    /* renamed from: io.grpc.internal.ManagedChannelImpl$3, reason: invalid class name */
    class AnonymousClass3 extends ForwardingNameResolver {
        @Override // io.grpc.internal.ForwardingNameResolver, io.grpc.NameResolver
        public final String a() {
            return null;
        }
    }

    /* renamed from: io.grpc.internal.ManagedChannelImpl$4, reason: invalid class name */
    public class AnonymousClass4 extends ClientCall<Object, Object> {
        @Override // io.grpc.ClientCall
        public final void a(String str, Throwable th) {
        }

        @Override // io.grpc.ClientCall
        public final void b() {
        }

        @Override // io.grpc.ClientCall
        public final void c() {
        }

        @Override // io.grpc.ClientCall
        public final void d(GeneratedMessageLite generatedMessageLite) {
        }

        @Override // io.grpc.ClientCall
        public final void e(ClientCall.Listener listener, Metadata metadata) {
        }
    }

    public final class ChannelStreamProvider implements ClientCallImpl.ClientStreamProvider {

        /* renamed from: a, reason: collision with root package name */
        public volatile RetriableStream.Throttle f24042a;

        public ChannelStreamProvider() {
        }

        @Override // io.grpc.internal.ClientCallImpl.ClientStreamProvider
        public final ClientStream a(MethodDescriptor methodDescriptor, CallOptions callOptions, Metadata metadata, Context context) {
            if (ManagedChannelImpl.this.Z) {
                ManagedChannelServiceConfig.MethodInfo methodInfo = (ManagedChannelServiceConfig.MethodInfo) callOptions.a(ManagedChannelServiceConfig.MethodInfo.g);
                return new RetriableStream<ReqT>(methodDescriptor, metadata, callOptions, methodInfo == null ? null : methodInfo.e, methodInfo != null ? methodInfo.f : null, context) { // from class: io.grpc.internal.ManagedChannelImpl.ChannelStreamProvider.1RetryStream
                    public final /* synthetic */ MethodDescriptor E;
                    public final /* synthetic */ CallOptions F;
                    public final /* synthetic */ Context G;

                    /* JADX WARN: Illegal instructions before constructor call */
                    {
                        this.E = methodDescriptor;
                        this.F = callOptions;
                        this.G = context;
                        ManagedChannelImpl managedChannelImpl = ManagedChannelImpl.this;
                        RetriableStream.ChannelBufferMeter channelBufferMeter = managedChannelImpl.W;
                        long j = managedChannelImpl.X;
                        long j2 = managedChannelImpl.Y;
                        Executor executor = callOptions.b;
                        super(methodDescriptor, metadata, channelBufferMeter, j, j2, executor == null ? managedChannelImpl.i : executor, ((CallCredentialsApplyingTransportFactory) managedChannelImpl.g).d.j0(), retryPolicy, hedgingPolicy, ChannelStreamProvider.this.f24042a);
                    }

                    @Override // io.grpc.internal.RetriableStream
                    public final ClientStream v(Metadata metadata2, ClientStreamTracer.Factory factory, int i, boolean z) {
                        CallOptions callOptionsJ = this.F.j(factory);
                        ClientStreamTracer[] clientStreamTracerArrC = GrpcUtil.c(callOptionsJ, metadata2, i, z);
                        MethodDescriptor methodDescriptor2 = this.E;
                        ClientTransport clientTransportB = ChannelStreamProvider.this.b(new PickSubchannelArgsImpl(methodDescriptor2, metadata2, callOptionsJ));
                        Context context2 = this.G;
                        Context contextB = context2.b();
                        try {
                            return clientTransportB.d(methodDescriptor2, metadata2, callOptionsJ, clientStreamTracerArrC);
                        } finally {
                            context2.e(contextB);
                        }
                    }

                    @Override // io.grpc.internal.RetriableStream
                    public final void w() {
                        Status status;
                        UncommittedRetriableStreamsRegistry uncommittedRetriableStreamsRegistry = ManagedChannelImpl.this.G;
                        synchronized (uncommittedRetriableStreamsRegistry.f24051a) {
                            try {
                                uncommittedRetriableStreamsRegistry.b.remove(this);
                                if (uncommittedRetriableStreamsRegistry.b.isEmpty()) {
                                    status = uncommittedRetriableStreamsRegistry.c;
                                    uncommittedRetriableStreamsRegistry.b = new HashSet();
                                } else {
                                    status = null;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (status != null) {
                            ManagedChannelImpl.this.F.g(status);
                        }
                    }

                    @Override // io.grpc.internal.RetriableStream
                    public final Status x() {
                        UncommittedRetriableStreamsRegistry uncommittedRetriableStreamsRegistry = ManagedChannelImpl.this.G;
                        synchronized (uncommittedRetriableStreamsRegistry.f24051a) {
                            try {
                                Status status = uncommittedRetriableStreamsRegistry.c;
                                if (status != null) {
                                    return status;
                                }
                                uncommittedRetriableStreamsRegistry.b.add(this);
                                return null;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                };
            }
            ClientTransport clientTransportB = b(new PickSubchannelArgsImpl(methodDescriptor, metadata, callOptions));
            Context contextB = context.b();
            try {
                return clientTransportB.d(methodDescriptor, metadata, callOptions, GrpcUtil.c(callOptions, metadata, 0, false));
            } finally {
                context.e(contextB);
            }
        }

        public final ClientTransport b(PickSubchannelArgsImpl pickSubchannelArgsImpl) {
            LoadBalancer.SubchannelPicker subchannelPicker = ManagedChannelImpl.this.z;
            if (ManagedChannelImpl.this.H.get()) {
                return ManagedChannelImpl.this.F;
            }
            if (subchannelPicker == null) {
                ManagedChannelImpl.this.n.execute(new Runnable() { // from class: io.grpc.internal.ManagedChannelImpl.ChannelStreamProvider.1ExitIdleModeForTransport
                    @Override // java.lang.Runnable
                    public final void run() {
                        ManagedChannelImpl.this.q();
                    }
                });
                return ManagedChannelImpl.this.F;
            }
            ClientTransport clientTransportF = GrpcUtil.f(subchannelPicker.a(pickSubchannelArgsImpl), pickSubchannelArgsImpl.f24074a.b());
            return clientTransportF != null ? clientTransportF : ManagedChannelImpl.this.F;
        }
    }

    public static final class ConfigSelectingClientCall<ReqT, RespT> extends ForwardingClientCall<ReqT, RespT> {

        /* renamed from: a, reason: collision with root package name */
        public final InternalConfigSelector f24043a;
        public final Channel b;
        public final Executor c;
        public final MethodDescriptor d;
        public final Context e;
        public CallOptions f;
        public ClientCall g;

        public ConfigSelectingClientCall(InternalConfigSelector internalConfigSelector, Channel channel, Executor executor, MethodDescriptor methodDescriptor, CallOptions callOptions) {
            this.f24043a = internalConfigSelector;
            this.b = channel;
            this.d = methodDescriptor;
            Executor executor2 = callOptions.b;
            executor = executor2 != null ? executor2 : executor;
            this.c = executor;
            this.f = callOptions.f(executor);
            this.e = Context.d();
        }

        @Override // io.grpc.PartialForwardingClientCall, io.grpc.ClientCall
        public final void a(String str, Throwable th) {
            ClientCall clientCall = this.g;
            if (clientCall != null) {
                clientCall.a(str, th);
            }
        }

        @Override // io.grpc.ForwardingClientCall, io.grpc.ClientCall
        public final void e(final ClientCall.Listener listener, Metadata metadata) {
            CallOptions callOptions = this.f;
            MethodDescriptor methodDescriptor = this.d;
            new PickSubchannelArgsImpl(methodDescriptor, metadata, callOptions);
            InternalConfigSelector.Result resultA = this.f24043a.a();
            Status status = resultA.f23945a;
            if (!status.f()) {
                final Status statusH = GrpcUtil.h(status);
                this.c.execute(new ContextRunnable(this) { // from class: io.grpc.internal.ManagedChannelImpl.ConfigSelectingClientCall.1CloseInContext
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(this.e);
                    }

                    @Override // io.grpc.internal.ContextRunnable
                    public final void a() {
                        listener.a(statusH, new Metadata());
                    }
                });
                this.g = ManagedChannelImpl.m0;
                return;
            }
            ManagedChannelServiceConfig managedChannelServiceConfig = (ManagedChannelServiceConfig) resultA.b;
            ManagedChannelServiceConfig.MethodInfo methodInfo = (ManagedChannelServiceConfig.MethodInfo) managedChannelServiceConfig.b.get(methodDescriptor.b);
            if (methodInfo == null) {
                methodInfo = (ManagedChannelServiceConfig.MethodInfo) managedChannelServiceConfig.c.get(methodDescriptor.c);
            }
            if (methodInfo == null) {
                methodInfo = managedChannelServiceConfig.f24055a;
            }
            if (methodInfo != null) {
                this.f = this.f.i(ManagedChannelServiceConfig.MethodInfo.g, methodInfo);
            }
            ClientCall clientCallH = this.b.h(methodDescriptor, this.f);
            this.g = clientCallH;
            clientCallH.e(listener, metadata);
        }

        @Override // io.grpc.PartialForwardingClientCall
        public final ClientCall f() {
            return this.g;
        }
    }

    public final class DelayedTransportListener implements ManagedClientTransport.Listener {
        public DelayedTransportListener() {
        }

        @Override // io.grpc.internal.ManagedClientTransport.Listener
        public final void a(Status status) {
            Preconditions.q("Channel must have been shut down", ManagedChannelImpl.this.H.get());
        }

        @Override // io.grpc.internal.ManagedClientTransport.Listener
        public final void b() {
        }

        @Override // io.grpc.internal.ManagedClientTransport.Listener
        public final void c() {
            ManagedChannelImpl managedChannelImpl = ManagedChannelImpl.this;
            Preconditions.q("Channel must have been shut down", managedChannelImpl.H.get());
            managedChannelImpl.J = true;
            managedChannelImpl.t(false);
            ManagedChannelImpl.n(managedChannelImpl);
            ManagedChannelImpl.o(managedChannelImpl);
        }

        @Override // io.grpc.internal.ManagedClientTransport.Listener
        public final void d(boolean z) {
            ManagedChannelImpl managedChannelImpl = ManagedChannelImpl.this;
            managedChannelImpl.c0.c(managedChannelImpl.F, z);
        }

        @Override // io.grpc.internal.ManagedClientTransport.Listener
        public final Attributes e(Attributes attributes) {
            return attributes;
        }
    }

    @VisibleForTesting
    public static final class ExecutorHolder implements Executor {
        public final ObjectPool d;
        public Executor e;

        public ExecutorHolder(ObjectPool objectPool) {
            Preconditions.j(objectPool, "executorPool");
            this.d = objectPool;
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            Executor executor;
            synchronized (this) {
                try {
                    if (this.e == null) {
                        Executor executor2 = (Executor) this.d.getObject();
                        Preconditions.k(executor2, "%s.getObject()", this.e);
                        this.e = executor2;
                    }
                    executor = this.e;
                } catch (Throwable th) {
                    throw th;
                }
            }
            executor.execute(runnable);
        }

        public final synchronized void release() {
            Executor executor = this.e;
            if (executor != null) {
                this.d.a(executor);
                this.e = null;
            }
        }
    }

    public final class IdleModeStateAggregator extends InUseStateAggregator<Object> {
        public IdleModeStateAggregator() {
        }

        @Override // io.grpc.internal.InUseStateAggregator
        public final void a() {
            ManagedChannelImpl.this.q();
        }

        @Override // io.grpc.internal.InUseStateAggregator
        public final void b() {
            ManagedChannelImpl managedChannelImpl = ManagedChannelImpl.this;
            if (managedChannelImpl.H.get()) {
                return;
            }
            managedChannelImpl.s();
        }
    }

    public class IdleModeTimer implements Runnable {
        public IdleModeTimer() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ManagedChannelImpl managedChannelImpl = ManagedChannelImpl.this;
            if (managedChannelImpl.y == null) {
                return;
            }
            ManagedChannelImpl.m(managedChannelImpl);
        }
    }

    public final class LbHelperImpl extends LoadBalancer.Helper {

        /* renamed from: a, reason: collision with root package name */
        public AutoConfiguredLoadBalancerFactory.AutoConfiguredLoadBalancer f24045a;

        /* renamed from: io.grpc.internal.ManagedChannelImpl$LbHelperImpl$1AddOobChannel, reason: invalid class name */
        final class C1AddOobChannel implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        /* renamed from: io.grpc.internal.ManagedChannelImpl$LbHelperImpl$1ManagedOobChannelCallback, reason: invalid class name */
        final class C1ManagedOobChannelCallback extends InternalSubchannel.Callback {
        }

        /* renamed from: io.grpc.internal.ManagedChannelImpl$LbHelperImpl$1ResolvingOobChannelBuilder, reason: invalid class name */
        final class C1ResolvingOobChannelBuilder extends ForwardingChannelBuilder2<C1ResolvingOobChannelBuilder> {

            /* renamed from: io.grpc.internal.ManagedChannelImpl$LbHelperImpl$1ResolvingOobChannelBuilder$1, reason: invalid class name */
            class AnonymousClass1 implements ManagedChannelImplBuilder.ClientTransportFactoryBuilder {
                @Override // io.grpc.internal.ManagedChannelImplBuilder.ClientTransportFactoryBuilder
                public final ClientTransportFactory a() {
                    return null;
                }
            }

            @Override // io.grpc.ForwardingChannelBuilder2
            public final ManagedChannelBuilder d() {
                return null;
            }
        }

        public final class DefaultChannelCreds extends ChannelCredentials {
        }

        public LbHelperImpl() {
        }

        @Override // io.grpc.LoadBalancer.Helper
        public final LoadBalancer.Subchannel a(LoadBalancer.CreateSubchannelArgs createSubchannelArgs) {
            ManagedChannelImpl managedChannelImpl = ManagedChannelImpl.this;
            managedChannelImpl.n.e();
            Preconditions.q("Channel is being terminated", !managedChannelImpl.J);
            return managedChannelImpl.new SubchannelImpl(createSubchannelArgs);
        }

        @Override // io.grpc.LoadBalancer.Helper
        public final ChannelLogger b() {
            return ManagedChannelImpl.this.P;
        }

        @Override // io.grpc.LoadBalancer.Helper
        public final ScheduledExecutorService c() {
            return ManagedChannelImpl.this.h;
        }

        @Override // io.grpc.LoadBalancer.Helper
        public final SynchronizationContext d() {
            return ManagedChannelImpl.this.n;
        }

        @Override // io.grpc.LoadBalancer.Helper
        public final void e() {
            SynchronizationContext synchronizationContext = ManagedChannelImpl.this.n;
            synchronizationContext.e();
            synchronizationContext.execute(new Runnable() { // from class: io.grpc.internal.ManagedChannelImpl.LbHelperImpl.1LoadBalancerRefreshNameResolution
                @Override // java.lang.Runnable
                public final void run() {
                    ManagedChannelImpl managedChannelImpl = ManagedChannelImpl.this;
                    Logger logger = ManagedChannelImpl.f0;
                    managedChannelImpl.n.e();
                    if (managedChannelImpl.x) {
                        managedChannelImpl.w.b();
                    }
                }
            });
        }

        @Override // io.grpc.LoadBalancer.Helper
        public final void f(final ConnectivityState connectivityState, final LoadBalancer.SubchannelPicker subchannelPicker) {
            SynchronizationContext synchronizationContext = ManagedChannelImpl.this.n;
            synchronizationContext.e();
            Preconditions.j(connectivityState, "newState");
            Preconditions.j(subchannelPicker, "newPicker");
            synchronizationContext.execute(new Runnable() { // from class: io.grpc.internal.ManagedChannelImpl.LbHelperImpl.1UpdateBalancingState
                @Override // java.lang.Runnable
                public final void run() {
                    ConnectivityState connectivityState2 = connectivityState;
                    LoadBalancer.SubchannelPicker subchannelPicker2 = subchannelPicker;
                    LbHelperImpl lbHelperImpl = LbHelperImpl.this;
                    ManagedChannelImpl managedChannelImpl = ManagedChannelImpl.this;
                    if (lbHelperImpl != managedChannelImpl.y) {
                        return;
                    }
                    managedChannelImpl.z = subchannelPicker2;
                    managedChannelImpl.F.i(subchannelPicker2);
                    if (connectivityState2 != ConnectivityState.h) {
                        ManagedChannelImpl.this.P.b(ChannelLogger.ChannelLogLevel.e, "Entering {0} state with picker: {1}", connectivityState2, subchannelPicker2);
                        ManagedChannelImpl.this.s.a(connectivityState2);
                    }
                }
            });
        }
    }

    public final class NameResolverListener extends NameResolver.Listener2 {

        /* renamed from: a, reason: collision with root package name */
        public final LbHelperImpl f24046a;
        public final NameResolver b;

        public NameResolverListener(LbHelperImpl lbHelperImpl, NameResolver nameResolver) {
            this.f24046a = lbHelperImpl;
            Preconditions.j(nameResolver, "resolver");
            this.b = nameResolver;
        }

        @Override // io.grpc.NameResolver.Listener
        public final void a(final Status status) {
            Preconditions.f("the error status must not be OK", !status.f());
            ManagedChannelImpl.this.n.execute(new Runnable() { // from class: io.grpc.internal.ManagedChannelImpl.NameResolverListener.1NameResolverErrorHandler
                @Override // java.lang.Runnable
                public final void run() {
                    Logger logger = ManagedChannelImpl.f0;
                    Level level = Level.WARNING;
                    NameResolverListener nameResolverListener = NameResolverListener.this;
                    ManagedChannelImpl managedChannelImpl = ManagedChannelImpl.this;
                    InternalLogId internalLogId = managedChannelImpl.f24038a;
                    Status status2 = status;
                    logger.log(level, "[{0}] Failed to resolve name. status={1}", new Object[]{internalLogId, status2});
                    RealChannel realChannel = managedChannelImpl.R;
                    if (realChannel.f24047a.get() == ManagedChannelImpl.l0) {
                        realChannel.j(null);
                    }
                    ResolutionState resolutionState = managedChannelImpl.S;
                    ResolutionState resolutionState2 = ResolutionState.f;
                    if (resolutionState != resolutionState2) {
                        managedChannelImpl.P.b(ChannelLogger.ChannelLogLevel.f, "Failed to resolve name: {0}", status2);
                        managedChannelImpl.S = resolutionState2;
                    }
                    LbHelperImpl lbHelperImpl = nameResolverListener.f24046a;
                    if (lbHelperImpl != managedChannelImpl.y) {
                        return;
                    }
                    lbHelperImpl.f24045a.b.c(status2);
                }
            });
        }

        @Override // io.grpc.NameResolver.Listener2
        public final void b(final NameResolver.ResolutionResult resolutionResult) {
            ManagedChannelImpl.this.n.execute(new Runnable() { // from class: io.grpc.internal.ManagedChannelImpl.NameResolverListener.1NamesResolved
                /* JADX WARN: Removed duplicated region for block: B:79:0x0229  */
                /* JADX WARN: Removed duplicated region for block: B:81:0x0266  */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void run() throws io.grpc.internal.AutoConfiguredLoadBalancerFactory.PolicyException {
                    /*
                        Method dump skipped, instructions count: 683
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.ManagedChannelImpl.NameResolverListener.C1NamesResolved.run():void");
                }
            });
        }
    }

    public class RealChannel extends Channel {
        public final String b;

        /* renamed from: a, reason: collision with root package name */
        public final AtomicReference f24047a = new AtomicReference(ManagedChannelImpl.l0);
        public final Channel c = new Channel() { // from class: io.grpc.internal.ManagedChannelImpl.RealChannel.1
            @Override // io.grpc.Channel
            public final String a() {
                return RealChannel.this.b;
            }

            @Override // io.grpc.Channel
            public final ClientCall h(MethodDescriptor methodDescriptor, CallOptions callOptions) {
                ManagedChannelImpl managedChannelImpl = ManagedChannelImpl.this;
                Logger logger = ManagedChannelImpl.f0;
                Executor executor = callOptions.b;
                if (executor == null) {
                    executor = managedChannelImpl.i;
                }
                ClientCallImpl clientCallImpl = new ClientCallImpl(methodDescriptor, executor, callOptions, managedChannelImpl.d0, managedChannelImpl.K ? null : ((CallCredentialsApplyingTransportFactory) ManagedChannelImpl.this.g).d.j0(), ManagedChannelImpl.this.N);
                clientCallImpl.p = ManagedChannelImpl.this.o;
                return clientCallImpl;
            }
        };

        /* renamed from: io.grpc.internal.ManagedChannelImpl$RealChannel$3, reason: invalid class name */
        class AnonymousClass3 extends ClientCall<Object, Object> {
            @Override // io.grpc.ClientCall
            public final void a(String str, Throwable th) {
            }

            @Override // io.grpc.ClientCall
            public final void b() {
            }

            @Override // io.grpc.ClientCall
            public final void c() {
            }

            @Override // io.grpc.ClientCall
            public final void d(GeneratedMessageLite generatedMessageLite) {
            }

            @Override // io.grpc.ClientCall
            public final void e(ClientCall.Listener listener, Metadata metadata) {
                listener.a(ManagedChannelImpl.i0, new Metadata());
            }
        }

        public final class PendingCall<ReqT, RespT> extends DelayedClientCall<ReqT, RespT> {
            public final Context l;
            public final MethodDescriptor m;
            public final CallOptions n;
            public final long o;

            public final class PendingCallRemoval implements Runnable {
                public PendingCallRemoval() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    PendingCall pendingCall = PendingCall.this;
                    RealChannel realChannel = RealChannel.this;
                    RealChannel realChannel2 = RealChannel.this;
                    LinkedHashSet linkedHashSet = ManagedChannelImpl.this.C;
                    if (linkedHashSet != null) {
                        linkedHashSet.remove(pendingCall);
                        if (ManagedChannelImpl.this.C.isEmpty()) {
                            ManagedChannelImpl managedChannelImpl = ManagedChannelImpl.this;
                            managedChannelImpl.c0.c(managedChannelImpl.D, false);
                            ManagedChannelImpl managedChannelImpl2 = ManagedChannelImpl.this;
                            managedChannelImpl2.C = null;
                            if (managedChannelImpl2.H.get()) {
                                ManagedChannelImpl.this.G.a(ManagedChannelImpl.i0);
                            }
                        }
                    }
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public PendingCall(Context context, MethodDescriptor methodDescriptor, CallOptions callOptions) {
                ManagedChannelImpl managedChannelImpl = ManagedChannelImpl.this;
                Logger logger = ManagedChannelImpl.f0;
                Executor executor = callOptions.b;
                super(executor == null ? managedChannelImpl.i : executor, managedChannelImpl.h, callOptions.f23919a);
                this.l = context;
                this.m = methodDescriptor;
                this.n = callOptions;
                this.o = managedChannelImpl.a0.a();
            }

            @Override // io.grpc.internal.DelayedClientCall
            public final void f() {
                ManagedChannelImpl.this.n.execute(new PendingCallRemoval());
            }

            public final void j() {
                final ContextRunnable contextRunnable;
                Context contextB = this.l.b();
                try {
                    ClientCall clientCallI = RealChannel.this.i(this.m, this.n.i(ClientStreamTracer.f23924a, Long.valueOf(ManagedChannelImpl.this.a0.a() - this.o)));
                    synchronized (this) {
                        try {
                            if (this.f != null) {
                                contextRunnable = null;
                            } else {
                                Preconditions.j(clientCallI, "call");
                                ClientCall clientCall = this.f;
                                Preconditions.p("realCall already set to %s", clientCall, clientCall == null);
                                ScheduledFuture scheduledFuture = this.f24002a;
                                if (scheduledFuture != null) {
                                    scheduledFuture.cancel(false);
                                }
                                this.f = clientCallI;
                                contextRunnable = new ContextRunnable(this.c) { // from class: io.grpc.internal.DelayedClientCall.1
                                    @Override // io.grpc.internal.ContextRunnable
                                    public final void a() {
                                        Logger logger = DelayedClientCall.j;
                                        DelayedClientCall.this.i();
                                    }
                                };
                            }
                        } finally {
                        }
                    }
                    if (contextRunnable == null) {
                        ManagedChannelImpl.this.n.execute(new PendingCallRemoval());
                        return;
                    }
                    ManagedChannelImpl managedChannelImpl = ManagedChannelImpl.this;
                    Executor executor = this.n.b;
                    if (executor == null) {
                        executor = managedChannelImpl.i;
                    }
                    executor.execute(new Runnable() { // from class: io.grpc.internal.ManagedChannelImpl.RealChannel.PendingCall.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            contextRunnable.run();
                            PendingCall pendingCall = PendingCall.this;
                            ManagedChannelImpl.this.n.execute(new PendingCallRemoval());
                        }
                    });
                } finally {
                    this.l.e(contextB);
                }
            }
        }

        public RealChannel(String str) {
            Preconditions.j(str, "authority");
            this.b = str;
        }

        @Override // io.grpc.Channel
        public final String a() {
            return this.b;
        }

        @Override // io.grpc.Channel
        public final ClientCall h(MethodDescriptor methodDescriptor, CallOptions callOptions) {
            ManagedChannelImpl managedChannelImpl = ManagedChannelImpl.this;
            SynchronizationContext synchronizationContext = managedChannelImpl.n;
            AtomicReference atomicReference = this.f24047a;
            Object obj = atomicReference.get();
            InternalConfigSelector internalConfigSelector = ManagedChannelImpl.l0;
            if (obj != internalConfigSelector) {
                return i(methodDescriptor, callOptions);
            }
            synchronizationContext.execute(new Runnable() { // from class: io.grpc.internal.ManagedChannelImpl.RealChannel.2
                @Override // java.lang.Runnable
                public final void run() {
                    ManagedChannelImpl.this.q();
                }
            });
            if (atomicReference.get() != internalConfigSelector) {
                return i(methodDescriptor, callOptions);
            }
            if (managedChannelImpl.H.get()) {
                return new AnonymousClass3();
            }
            final PendingCall pendingCall = new PendingCall(Context.d(), methodDescriptor, callOptions);
            synchronizationContext.execute(new Runnable() { // from class: io.grpc.internal.ManagedChannelImpl.RealChannel.4
                @Override // java.lang.Runnable
                public final void run() {
                    RealChannel realChannel = RealChannel.this;
                    ManagedChannelImpl managedChannelImpl2 = ManagedChannelImpl.this;
                    Object obj2 = realChannel.f24047a.get();
                    InternalConfigSelector internalConfigSelector2 = ManagedChannelImpl.l0;
                    PendingCall pendingCall2 = pendingCall;
                    if (obj2 != internalConfigSelector2) {
                        pendingCall2.j();
                        return;
                    }
                    if (managedChannelImpl2.C == null) {
                        managedChannelImpl2.C = new LinkedHashSet();
                        managedChannelImpl2.c0.c(managedChannelImpl2.D, true);
                    }
                    managedChannelImpl2.C.add(pendingCall2);
                }
            });
            return pendingCall;
        }

        public final ClientCall i(MethodDescriptor methodDescriptor, CallOptions callOptions) {
            InternalConfigSelector internalConfigSelector = (InternalConfigSelector) this.f24047a.get();
            Channel channel = this.c;
            if (internalConfigSelector == null) {
                return channel.h(methodDescriptor, callOptions);
            }
            if (!(internalConfigSelector instanceof ManagedChannelServiceConfig.ServiceConfigConvertedSelector)) {
                return new ConfigSelectingClientCall(internalConfigSelector, channel, ManagedChannelImpl.this.i, methodDescriptor, callOptions);
            }
            ManagedChannelServiceConfig managedChannelServiceConfig = ((ManagedChannelServiceConfig.ServiceConfigConvertedSelector) internalConfigSelector).b;
            ManagedChannelServiceConfig.MethodInfo methodInfo = (ManagedChannelServiceConfig.MethodInfo) managedChannelServiceConfig.b.get(methodDescriptor.b);
            if (methodInfo == null) {
                methodInfo = (ManagedChannelServiceConfig.MethodInfo) managedChannelServiceConfig.c.get(methodDescriptor.c);
            }
            if (methodInfo == null) {
                methodInfo = managedChannelServiceConfig.f24055a;
            }
            if (methodInfo != null) {
                callOptions = callOptions.i(ManagedChannelServiceConfig.MethodInfo.g, methodInfo);
            }
            return channel.h(methodDescriptor, callOptions);
        }

        public final void j(InternalConfigSelector internalConfigSelector) {
            LinkedHashSet linkedHashSet;
            AtomicReference atomicReference = this.f24047a;
            InternalConfigSelector internalConfigSelector2 = (InternalConfigSelector) atomicReference.get();
            atomicReference.set(internalConfigSelector);
            if (internalConfigSelector2 != ManagedChannelImpl.l0 || (linkedHashSet = ManagedChannelImpl.this.C) == null) {
                return;
            }
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                ((PendingCall) it.next()).j();
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ResolutionState {
        public static final ResolutionState d;
        public static final ResolutionState e;
        public static final ResolutionState f;
        public static final /* synthetic */ ResolutionState[] g;

        static {
            ResolutionState resolutionState = new ResolutionState("NO_RESOLUTION", 0);
            d = resolutionState;
            ResolutionState resolutionState2 = new ResolutionState("SUCCESS", 1);
            e = resolutionState2;
            ResolutionState resolutionState3 = new ResolutionState("ERROR", 2);
            f = resolutionState3;
            g = new ResolutionState[]{resolutionState, resolutionState2, resolutionState3};
        }

        public static ResolutionState valueOf(String str) {
            return (ResolutionState) Enum.valueOf(ResolutionState.class, str);
        }

        public static ResolutionState[] values() {
            return (ResolutionState[]) g.clone();
        }
    }

    public static final class RestrictedScheduledExecutor implements ScheduledExecutorService, AutoCloseable {
        public final ScheduledExecutorService d;

        public RestrictedScheduledExecutor(ScheduledExecutorService scheduledExecutorService) {
            Preconditions.j(scheduledExecutorService, "delegate");
            this.d = scheduledExecutorService;
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean awaitTermination(long j, TimeUnit timeUnit) {
            return this.d.awaitTermination(j, timeUnit);
        }

        @Override // java.lang.AutoCloseable
        public final /* synthetic */ void close() {
            if (this == ForkJoinPool.commonPool() || isTerminated()) {
                return;
            }
            shutdown();
            throw null;
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.d.execute(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public final List invokeAll(Collection collection) {
            return this.d.invokeAll(collection);
        }

        @Override // java.util.concurrent.ExecutorService
        public final Object invokeAny(Collection collection) {
            return this.d.invokeAny(collection);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isShutdown() {
            return this.d.isShutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isTerminated() {
            return this.d.isTerminated();
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
            return this.d.schedule(callable, j, timeUnit);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            return this.d.scheduleAtFixedRate(runnable, j, j2, timeUnit);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            return this.d.scheduleWithFixedDelay(runnable, j, j2, timeUnit);
        }

        @Override // java.util.concurrent.ExecutorService
        public final void shutdown() {
            throw new UnsupportedOperationException("Restricted: shutdown() is not allowed");
        }

        @Override // java.util.concurrent.ExecutorService
        public final List shutdownNow() {
            throw new UnsupportedOperationException("Restricted: shutdownNow() is not allowed");
        }

        @Override // java.util.concurrent.ExecutorService
        public final Future submit(Callable callable) {
            return this.d.submit(callable);
        }

        @Override // java.util.concurrent.ExecutorService
        public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
            return this.d.invokeAll(collection, j, timeUnit);
        }

        @Override // java.util.concurrent.ExecutorService
        public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
            return this.d.invokeAny(collection, j, timeUnit);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
            return this.d.schedule(runnable, j, timeUnit);
        }

        @Override // java.util.concurrent.ExecutorService
        public final Future submit(Runnable runnable) {
            return this.d.submit(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public final Future submit(Runnable runnable, Object obj) {
            return this.d.submit(runnable, obj);
        }
    }

    public final class SubchannelImpl extends AbstractSubchannel {

        /* renamed from: a, reason: collision with root package name */
        public final LoadBalancer.CreateSubchannelArgs f24049a;
        public final InternalLogId b;
        public final ChannelLoggerImpl c;
        public final ChannelTracer d;
        public List e;
        public InternalSubchannel f;
        public boolean g;
        public boolean h;
        public SynchronizationContext.ScheduledHandle i;

        /* renamed from: io.grpc.internal.ManagedChannelImpl$SubchannelImpl$1ManagedInternalSubchannelCallback, reason: invalid class name */
        final class C1ManagedInternalSubchannelCallback extends InternalSubchannel.Callback {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ LoadBalancer.SubchannelStateListener f24050a;

            public C1ManagedInternalSubchannelCallback(LoadBalancer.SubchannelStateListener subchannelStateListener) {
                this.f24050a = subchannelStateListener;
            }
        }

        public SubchannelImpl(LoadBalancer.CreateSubchannelArgs createSubchannelArgs) {
            List list = createSubchannelArgs.f23950a;
            this.e = list;
            this.f24049a = createSubchannelArgs;
            InternalLogId internalLogId = new InternalLogId("Subchannel", ManagedChannelImpl.this.u.a(), InternalLogId.d.incrementAndGet());
            this.b = internalLogId;
            Logger logger = ManagedChannelImpl.f0;
            TimeProvider.AnonymousClass1 anonymousClass1 = (TimeProvider.AnonymousClass1) ManagedChannelImpl.this.m;
            ChannelTracer channelTracer = new ChannelTracer(internalLogId, anonymousClass1.a(), "Subchannel for " + list);
            this.d = channelTracer;
            this.c = new ChannelLoggerImpl(channelTracer, anonymousClass1);
        }

        @Override // io.grpc.LoadBalancer.Subchannel
        public final List b() {
            ManagedChannelImpl.this.n.e();
            Preconditions.q("not started", this.g);
            return this.e;
        }

        @Override // io.grpc.LoadBalancer.Subchannel
        public final Attributes c() {
            return this.f24049a.b;
        }

        @Override // io.grpc.LoadBalancer.Subchannel
        public final ChannelLogger d() {
            return this.c;
        }

        @Override // io.grpc.LoadBalancer.Subchannel
        public final Object e() {
            Preconditions.q("Subchannel is not started", this.g);
            return this.f;
        }

        @Override // io.grpc.LoadBalancer.Subchannel
        public final void f() {
            ManagedChannelImpl.this.n.e();
            Preconditions.q("not started", this.g);
            this.f.a();
        }

        @Override // io.grpc.LoadBalancer.Subchannel
        public final void g() {
            SynchronizationContext.ScheduledHandle scheduledHandle;
            ManagedChannelImpl managedChannelImpl = ManagedChannelImpl.this;
            managedChannelImpl.n.e();
            if (this.f == null) {
                this.h = true;
                return;
            }
            if (!this.h) {
                this.h = true;
            } else {
                if (!managedChannelImpl.J || (scheduledHandle = this.i) == null) {
                    return;
                }
                scheduledHandle.a();
                this.i = null;
            }
            if (!managedChannelImpl.J) {
                this.i = managedChannelImpl.n.c(new LogExceptionRunnable(new Runnable() { // from class: io.grpc.internal.ManagedChannelImpl.SubchannelImpl.1ShutdownSubchannel
                    @Override // java.lang.Runnable
                    public final void run() {
                        InternalSubchannel internalSubchannel = SubchannelImpl.this.f;
                        internalSubchannel.k.execute(internalSubchannel.new AnonymousClass5(ManagedChannelImpl.j0));
                    }
                }), 5L, TimeUnit.SECONDS, ((CallCredentialsApplyingTransportFactory) managedChannelImpl.g).d.j0());
            } else {
                InternalSubchannel internalSubchannel = this.f;
                internalSubchannel.k.execute(internalSubchannel.new AnonymousClass5(ManagedChannelImpl.i0));
            }
        }

        @Override // io.grpc.LoadBalancer.Subchannel
        public final void h(LoadBalancer.SubchannelStateListener subchannelStateListener) {
            ManagedChannelImpl managedChannelImpl = ManagedChannelImpl.this;
            managedChannelImpl.n.e();
            Preconditions.q("already started", !this.g);
            Preconditions.q("already shutdown", !this.h);
            Preconditions.q("Channel is being terminated", !managedChannelImpl.J);
            this.g = true;
            List list = this.f24049a.f23950a;
            String strA = managedChannelImpl.u.a();
            ExponentialBackoffPolicy.Provider provider = managedChannelImpl.t;
            ClientTransportFactory clientTransportFactory = managedChannelImpl.g;
            ScheduledExecutorService scheduledExecutorServiceJ0 = ((CallCredentialsApplyingTransportFactory) clientTransportFactory).d.j0();
            Supplier supplier = managedChannelImpl.q;
            SynchronizationContext synchronizationContext = managedChannelImpl.n;
            C1ManagedInternalSubchannelCallback c1ManagedInternalSubchannelCallback = new C1ManagedInternalSubchannelCallback(subchannelStateListener);
            InternalChannelz internalChannelz = managedChannelImpl.Q;
            ((C1ChannelCallTracerFactory) managedChannelImpl.M).getClass();
            InternalSubchannel internalSubchannel = new InternalSubchannel(list, strA, provider, clientTransportFactory, scheduledExecutorServiceJ0, supplier, synchronizationContext, c1ManagedInternalSubchannelCallback, internalChannelz, new CallTracer(), this.d, this.b, this.c, managedChannelImpl.v);
            ChannelTracer channelTracer = managedChannelImpl.O;
            InternalChannelz.ChannelTrace.Event.Builder builder = new InternalChannelz.ChannelTrace.Event.Builder();
            builder.f23943a = "Child Subchannel started";
            builder.b = InternalChannelz.ChannelTrace.Event.Severity.d;
            builder.c = Long.valueOf(((TimeProvider.AnonymousClass1) managedChannelImpl.m).a());
            builder.d = internalSubchannel;
            channelTracer.b(builder.a());
            this.f = internalSubchannel;
            managedChannelImpl.B.add(internalSubchannel);
        }

        @Override // io.grpc.LoadBalancer.Subchannel
        public final void i(List list) {
            ManagedChannelImpl.this.n.e();
            this.e = list;
            final InternalSubchannel internalSubchannel = this.f;
            internalSubchannel.getClass();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Preconditions.j(it.next(), "newAddressGroups contains null entry");
            }
            Preconditions.f("newAddressGroups is empty", !list.isEmpty());
            final List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(list));
            internalSubchannel.k.execute(new Runnable() { // from class: io.grpc.internal.InternalSubchannel.4
                @Override // java.lang.Runnable
                public final void run() {
                    ManagedClientTransport managedClientTransport;
                    Index index = InternalSubchannel.this.l;
                    SocketAddress socketAddress = (SocketAddress) ((EquivalentAddressGroup) index.f24027a.get(index.b)).f23936a.get(index.c);
                    Index index2 = InternalSubchannel.this.l;
                    index2.f24027a = listUnmodifiableList;
                    index2.a();
                    InternalSubchannel.this.m = listUnmodifiableList;
                    ConnectivityState connectivityState = InternalSubchannel.this.w.f23930a;
                    ConnectivityState connectivityState2 = ConnectivityState.e;
                    if (connectivityState == connectivityState2 || InternalSubchannel.this.w.f23930a == ConnectivityState.d) {
                        Index index3 = InternalSubchannel.this.l;
                        int i = 0;
                        while (true) {
                            if (i < index3.f24027a.size()) {
                                int iIndexOf = ((EquivalentAddressGroup) index3.f24027a.get(i)).f23936a.indexOf(socketAddress);
                                if (iIndexOf != -1) {
                                    index3.b = i;
                                    index3.c = iIndexOf;
                                    break;
                                }
                                i++;
                            } else if (InternalSubchannel.this.w.f23930a == connectivityState2) {
                                managedClientTransport = InternalSubchannel.this.v;
                                InternalSubchannel.this.v = null;
                                InternalSubchannel.this.l.a();
                                InternalSubchannel.h(InternalSubchannel.this, ConnectivityState.g);
                            } else {
                                ((ForwardingConnectionClientTransport) InternalSubchannel.this.u).g(Status.n.i("InternalSubchannel closed pending transport due to address change"));
                                InternalSubchannel internalSubchannel2 = InternalSubchannel.this;
                                internalSubchannel2.u = null;
                                internalSubchannel2.l.a();
                                InternalSubchannel.i(InternalSubchannel.this);
                            }
                        }
                        managedClientTransport = null;
                    } else {
                        managedClientTransport = null;
                    }
                    if (managedClientTransport != null) {
                        InternalSubchannel internalSubchannel3 = InternalSubchannel.this;
                        if (internalSubchannel3.q != null) {
                            internalSubchannel3.r.g(Status.n.i("InternalSubchannel closed transport early due to address change"));
                            InternalSubchannel.this.q.a();
                            InternalSubchannel internalSubchannel4 = InternalSubchannel.this;
                            internalSubchannel4.q = null;
                            internalSubchannel4.r = null;
                        }
                        InternalSubchannel internalSubchannel5 = InternalSubchannel.this;
                        internalSubchannel5.r = managedClientTransport;
                        internalSubchannel5.q = internalSubchannel5.k.c(new Runnable() { // from class: io.grpc.internal.InternalSubchannel.4.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                InternalSubchannel internalSubchannel6 = InternalSubchannel.this;
                                ManagedClientTransport managedClientTransport2 = internalSubchannel6.r;
                                internalSubchannel6.q = null;
                                internalSubchannel6.r = null;
                                managedClientTransport2.g(Status.n.i("InternalSubchannel closed transport due to address change"));
                            }
                        }, 5L, TimeUnit.SECONDS, internalSubchannel5.f);
                    }
                }
            });
        }

        public final String toString() {
            return this.b.toString();
        }
    }

    public final class UncommittedRetriableStreamsRegistry {

        /* renamed from: a, reason: collision with root package name */
        public final Object f24051a = new Object();
        public HashSet b = new HashSet();
        public Status c;

        public UncommittedRetriableStreamsRegistry() {
        }

        public final void a(Status status) {
            synchronized (this.f24051a) {
                try {
                    if (this.c != null) {
                        return;
                    }
                    this.c = status;
                    boolean zIsEmpty = this.b.isEmpty();
                    if (zIsEmpty) {
                        ManagedChannelImpl.this.F.g(status);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    static {
        Status status = Status.n;
        h0 = status.i("Channel shutdownNow invoked");
        i0 = status.i("Channel shutdown invoked");
        j0 = status.i("Subchannel shutdown invoked");
        k0 = new ManagedChannelServiceConfig(null, new HashMap(), new HashMap(), null, null, null);
        l0 = new AnonymousClass1();
        m0 = new AnonymousClass4();
    }

    public ManagedChannelImpl(ManagedChannelImplBuilder managedChannelImplBuilder, ClientTransportFactory clientTransportFactory, ExponentialBackoffPolicy.Provider provider, SharedResourcePool sharedResourcePool, Supplier supplier, ArrayList arrayList) {
        TimeProvider timeProvider = TimeProvider.f24111a;
        SynchronizationContext synchronizationContext = new SynchronizationContext(new Thread.UncaughtExceptionHandler() { // from class: io.grpc.internal.ManagedChannelImpl.2
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                Logger logger = ManagedChannelImpl.f0;
                Level level = Level.SEVERE;
                StringBuilder sb = new StringBuilder("[");
                ManagedChannelImpl managedChannelImpl = ManagedChannelImpl.this;
                sb.append(managedChannelImpl.f24038a);
                sb.append("] Uncaught exception in the SynchronizationContext. Panic!");
                logger.log(level, sb.toString(), th);
                if (managedChannelImpl.A) {
                    return;
                }
                managedChannelImpl.A = true;
                managedChannelImpl.p(true);
                managedChannelImpl.t(false);
                LoadBalancer.SubchannelPicker subchannelPicker = new LoadBalancer.SubchannelPicker(th) { // from class: io.grpc.internal.ManagedChannelImpl.1PanicSubchannelPicker

                    /* renamed from: a, reason: collision with root package name */
                    public final LoadBalancer.PickResult f24040a;

                    {
                        Status statusH = Status.m.i("Panic! This is a bug!").h(th);
                        LoadBalancer.PickResult pickResult = LoadBalancer.PickResult.e;
                        Preconditions.f("drop status shouldn't be OK", !statusH.f());
                        this.f24040a = new LoadBalancer.PickResult(null, null, statusH, true);
                    }

                    @Override // io.grpc.LoadBalancer.SubchannelPicker
                    public final LoadBalancer.PickResult a(LoadBalancer.PickSubchannelArgs pickSubchannelArgs) {
                        return this.f24040a;
                    }

                    public final String toString() {
                        MoreObjects.ToStringHelper toStringHelper = new MoreObjects.ToStringHelper(C1PanicSubchannelPicker.class.getSimpleName());
                        toStringHelper.c(this.f24040a, "panicPickResult");
                        return toStringHelper.toString();
                    }
                };
                managedChannelImpl.z = subchannelPicker;
                managedChannelImpl.F.i(subchannelPicker);
                managedChannelImpl.R.j(null);
                managedChannelImpl.P.a(ChannelLogger.ChannelLogLevel.g, "PANIC! Entering TRANSIENT_FAILURE");
                managedChannelImpl.s.a(ConnectivityState.f);
            }
        });
        this.n = synchronizationContext;
        ConnectivityStateManager connectivityStateManager = new ConnectivityStateManager();
        connectivityStateManager.f24000a = new ArrayList();
        connectivityStateManager.b = ConnectivityState.g;
        this.s = connectivityStateManager;
        this.B = new HashSet(16, 0.75f);
        this.D = new Object();
        this.E = new HashSet(1, 0.75f);
        this.G = new UncommittedRetriableStreamsRegistry();
        this.H = new AtomicBoolean(false);
        this.L = new CountDownLatch(1);
        this.S = ResolutionState.d;
        this.T = k0;
        this.U = false;
        this.W = new RetriableStream.ChannelBufferMeter();
        this.a0 = Deadline.g;
        DelayedTransportListener delayedTransportListener = new DelayedTransportListener();
        this.b0 = delayedTransportListener;
        this.c0 = new IdleModeStateAggregator();
        this.d0 = new ChannelStreamProvider();
        String str = managedChannelImplBuilder.f;
        Preconditions.j(str, "target");
        this.b = str;
        InternalLogId internalLogId = new InternalLogId("Channel", str, InternalLogId.d.incrementAndGet());
        this.f24038a = internalLogId;
        this.m = timeProvider;
        SharedResourcePool sharedResourcePool2 = managedChannelImplBuilder.f24052a;
        Preconditions.j(sharedResourcePool2, "executorPool");
        this.j = sharedResourcePool2;
        Executor executor = (Executor) sharedResourcePool2.getObject();
        Preconditions.j(executor, "executor");
        Executor executor2 = executor;
        this.i = executor2;
        this.f = clientTransportFactory;
        SharedResourcePool sharedResourcePool3 = managedChannelImplBuilder.b;
        Preconditions.j(sharedResourcePool3, "offloadExecutorPool");
        ExecutorHolder executorHolder = new ExecutorHolder(sharedResourcePool3);
        this.l = executorHolder;
        CallCredentialsApplyingTransportFactory callCredentialsApplyingTransportFactory = new CallCredentialsApplyingTransportFactory(clientTransportFactory, executorHolder);
        this.g = callCredentialsApplyingTransportFactory;
        new CallCredentialsApplyingTransportFactory(clientTransportFactory, executorHolder);
        RestrictedScheduledExecutor restrictedScheduledExecutor = new RestrictedScheduledExecutor(callCredentialsApplyingTransportFactory.d.j0());
        this.h = restrictedScheduledExecutor;
        ChannelTracer channelTracer = new ChannelTracer(internalLogId, ((TimeProvider.AnonymousClass1) timeProvider).a(), YU.a.h("Channel for '", str, "'"));
        this.O = channelTracer;
        ChannelLoggerImpl channelLoggerImpl = new ChannelLoggerImpl(channelTracer, timeProvider);
        this.P = channelLoggerImpl;
        ProxyDetector proxyDetector = GrpcUtil.m;
        boolean z = managedChannelImplBuilder.o;
        this.Z = z;
        AutoConfiguredLoadBalancerFactory autoConfiguredLoadBalancerFactory = new AutoConfiguredLoadBalancerFactory(managedChannelImplBuilder.g);
        this.e = autoConfiguredLoadBalancerFactory;
        NameResolverRegistry nameResolverRegistry = managedChannelImplBuilder.d;
        this.c = nameResolverRegistry;
        ScParser scParser = new ScParser(z, managedChannelImplBuilder.k, managedChannelImplBuilder.l, autoConfiguredLoadBalancerFactory);
        NameResolver.Args.Builder builder = new NameResolver.Args.Builder();
        builder.f23965a = Integer.valueOf(managedChannelImplBuilder.x.a());
        proxyDetector.getClass();
        builder.b = proxyDetector;
        builder.c = restrictedScheduledExecutor;
        builder.d = executorHolder;
        NameResolver.Args args = new NameResolver.Args(builder.f23965a, proxyDetector, synchronizationContext, scParser, restrictedScheduledExecutor, channelLoggerImpl, executorHolder);
        this.d = args;
        this.w = r(str, nameResolverRegistry, args, callCredentialsApplyingTransportFactory.d.Y0());
        this.k = new ExecutorHolder(sharedResourcePool);
        DelayedClientTransport delayedClientTransport = new DelayedClientTransport(executor2, synchronizationContext);
        this.F = delayedClientTransport;
        delayedClientTransport.e(delayedTransportListener);
        this.t = provider;
        boolean z2 = managedChannelImplBuilder.q;
        this.V = z2;
        RealChannel realChannel = new RealChannel(this.w.a());
        this.R = realChannel;
        this.u = ClientInterceptors.a(realChannel, arrayList);
        this.v = new ArrayList(managedChannelImplBuilder.e);
        Preconditions.j(supplier, "stopwatchSupplier");
        this.q = supplier;
        long j = managedChannelImplBuilder.j;
        if (j == -1) {
            this.r = j;
        } else {
            Preconditions.c(j, "invalid idleTimeoutMillis %s", j >= ManagedChannelImplBuilder.A);
            this.r = managedChannelImplBuilder.j;
        }
        this.e0 = new Rescheduler(new IdleModeTimer(), synchronizationContext, callCredentialsApplyingTransportFactory.d.j0(), (Stopwatch) supplier.get());
        DecompressorRegistry decompressorRegistry = managedChannelImplBuilder.h;
        Preconditions.j(decompressorRegistry, "decompressorRegistry");
        this.o = decompressorRegistry;
        CompressorRegistry compressorRegistry = managedChannelImplBuilder.i;
        Preconditions.j(compressorRegistry, "compressorRegistry");
        this.p = compressorRegistry;
        this.Y = managedChannelImplBuilder.m;
        this.X = managedChannelImplBuilder.n;
        this.M = new CallTracer.Factory() { // from class: io.grpc.internal.ManagedChannelImpl.1ChannelCallTracerFactory

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ TimeProvider f24039a = TimeProvider.f24111a;
        };
        this.N = new CallTracer();
        InternalChannelz internalChannelz = managedChannelImplBuilder.p;
        internalChannelz.getClass();
        this.Q = internalChannelz;
        if (z2) {
            return;
        }
        this.U = true;
    }

    public static void m(ManagedChannelImpl managedChannelImpl) {
        managedChannelImpl.t(true);
        DelayedClientTransport delayedClientTransport = managedChannelImpl.F;
        delayedClientTransport.i(null);
        managedChannelImpl.P.a(ChannelLogger.ChannelLogLevel.e, "Entering IDLE state");
        managedChannelImpl.s.a(ConnectivityState.g);
        InUseStateAggregator inUseStateAggregator = managedChannelImpl.c0;
        Object[] objArr = {managedChannelImpl.D, delayedClientTransport};
        inUseStateAggregator.getClass();
        for (int i = 0; i < 2; i++) {
            if (inUseStateAggregator.f24021a.contains(objArr[i])) {
                managedChannelImpl.q();
                return;
            }
        }
    }

    public static void n(ManagedChannelImpl managedChannelImpl) {
        if (managedChannelImpl.I) {
            Iterator it = managedChannelImpl.B.iterator();
            while (it.hasNext()) {
                final InternalSubchannel internalSubchannel = (InternalSubchannel) it.next();
                SynchronizationContext synchronizationContext = internalSubchannel.k;
                final Status status = h0;
                synchronizationContext.execute(internalSubchannel.new AnonymousClass5(status));
                synchronizationContext.execute(new Runnable() { // from class: io.grpc.internal.InternalSubchannel.8
                    @Override // java.lang.Runnable
                    public final void run() {
                        Iterator it2 = new ArrayList(InternalSubchannel.this.s).iterator();
                        while (it2.hasNext()) {
                            ((ManagedClientTransport) it2.next()).f(status);
                        }
                    }
                });
            }
            Iterator it2 = managedChannelImpl.E.iterator();
            if (it2.hasNext()) {
                ((OobChannel) it2.next()).getClass();
                throw null;
            }
        }
    }

    public static void o(ManagedChannelImpl managedChannelImpl) {
        if (!managedChannelImpl.K && managedChannelImpl.H.get() && managedChannelImpl.B.isEmpty() && managedChannelImpl.E.isEmpty()) {
            managedChannelImpl.P.a(ChannelLogger.ChannelLogLevel.e, "Terminated");
            InternalChannelz.a(managedChannelImpl.Q.f23940a, managedChannelImpl);
            managedChannelImpl.j.a(managedChannelImpl.i);
            managedChannelImpl.k.release();
            managedChannelImpl.l.release();
            ((CallCredentialsApplyingTransportFactory) managedChannelImpl.g).close();
            managedChannelImpl.K = true;
            managedChannelImpl.L.countDown();
        }
    }

    public static NameResolver r(String str, NameResolverRegistry nameResolverRegistry, NameResolver.Args args, Collection collection) {
        URI uri;
        String str2;
        String str3 = "";
        StringBuilder sb = new StringBuilder();
        try {
            uri = new URI(str);
        } catch (URISyntaxException e) {
            sb.append(e.getMessage());
            uri = null;
        }
        NameResolverProvider nameResolverProviderB = uri != null ? nameResolverRegistry.b(uri.getScheme()) : null;
        if (nameResolverProviderB == null && !g0.matcher(str).matches()) {
            try {
                synchronized (nameResolverRegistry) {
                    str2 = nameResolverRegistry.f23969a;
                }
                uri = new URI(str2, "", q2.c + str, null);
                nameResolverProviderB = nameResolverRegistry.b(uri.getScheme());
            } catch (URISyntaxException e2) {
                throw new IllegalArgumentException(e2);
            }
        }
        if (nameResolverProviderB == null) {
            if (sb.length() > 0) {
                str3 = " (" + ((Object) sb) + ")";
            }
            throw new IllegalArgumentException(YU.a.h("Could not find a NameResolverProvider for ", str, str3));
        }
        if (collection != null && !collection.containsAll(nameResolverProviderB.c())) {
            throw new IllegalArgumentException(YU.a.j("Address types of NameResolver '", uri.getScheme(), "' for '", str, "' not supported by transport"));
        }
        NameResolver nameResolverB = nameResolverProviderB.b(uri, args);
        if (nameResolverB != null) {
            ExponentialBackoffPolicy.Provider provider = new ExponentialBackoffPolicy.Provider();
            ScheduledExecutorService scheduledExecutorService = args.e;
            if (scheduledExecutorService == null) {
                throw new IllegalStateException("ScheduledExecutorService not set in Builder");
            }
            SynchronizationContext synchronizationContext = args.c;
            return new RetryingNameResolver(nameResolverB, new BackoffPolicyRetryScheduler(provider, scheduledExecutorService, synchronizationContext), synchronizationContext);
        }
        if (sb.length() > 0) {
            str3 = " (" + ((Object) sb) + ")";
        }
        throw new IllegalArgumentException(YU.a.h("cannot create a NameResolver for ", str, str3));
    }

    @Override // io.grpc.Channel
    public final String a() {
        return this.u.a();
    }

    @Override // io.grpc.InternalWithLogId
    public final InternalLogId b() {
        return this.f24038a;
    }

    @Override // io.grpc.Channel
    public final ClientCall h(MethodDescriptor methodDescriptor, CallOptions callOptions) {
        return this.u.h(methodDescriptor, callOptions);
    }

    @Override // io.grpc.ManagedChannel
    public final void i() {
        this.n.execute(new Runnable() { // from class: io.grpc.internal.ManagedChannelImpl.1PrepareToLoseNetworkRunnable
            @Override // java.lang.Runnable
            public final void run() {
                ManagedChannelImpl managedChannelImpl = ManagedChannelImpl.this;
                if (managedChannelImpl.H.get() || managedChannelImpl.y == null) {
                    return;
                }
                managedChannelImpl.p(false);
                ManagedChannelImpl.m(managedChannelImpl);
            }
        });
    }

    @Override // io.grpc.ManagedChannel
    public final ConnectivityState j() {
        ConnectivityState connectivityState = this.s.b;
        if (connectivityState == null) {
            throw new UnsupportedOperationException("Channel state API is not implemented");
        }
        if (connectivityState == ConnectivityState.g) {
            this.n.execute(new Runnable() { // from class: io.grpc.internal.ManagedChannelImpl.1RequestConnection
                @Override // java.lang.Runnable
                public final void run() {
                    ManagedChannelImpl.this.q();
                    if (ManagedChannelImpl.this.z != null) {
                        ManagedChannelImpl.this.z.getClass();
                    }
                    LbHelperImpl lbHelperImpl = ManagedChannelImpl.this.y;
                    if (lbHelperImpl != null) {
                        lbHelperImpl.f24045a.b.e();
                    }
                }
            });
        }
        return connectivityState;
    }

    @Override // io.grpc.ManagedChannel
    public final void k(final ConnectivityState connectivityState, final h hVar) {
        this.n.execute(new Runnable() { // from class: io.grpc.internal.ManagedChannelImpl.1NotifyStateChanged
            @Override // java.lang.Runnable
            public final void run() {
                ManagedChannelImpl managedChannelImpl = ManagedChannelImpl.this;
                ConnectivityStateManager connectivityStateManager = managedChannelImpl.s;
                h hVar2 = hVar;
                Executor executor = managedChannelImpl.i;
                ConnectivityState connectivityState2 = connectivityState;
                connectivityStateManager.getClass();
                Preconditions.j(executor, "executor");
                Preconditions.j(connectivityState2, "source");
                ConnectivityStateManager.Listener listener = new ConnectivityStateManager.Listener(hVar2, executor);
                if (connectivityStateManager.b != connectivityState2) {
                    executor.execute(hVar2);
                } else {
                    connectivityStateManager.f24000a.add(listener);
                }
            }
        });
    }

    @Override // io.grpc.ManagedChannel
    public final ManagedChannel l() {
        ChannelLogger channelLogger = this.P;
        ChannelLogger.ChannelLogLevel channelLogLevel = ChannelLogger.ChannelLogLevel.d;
        channelLogger.a(channelLogLevel, "shutdownNow() called");
        channelLogger.a(channelLogLevel, "shutdown() called");
        boolean zCompareAndSet = this.H.compareAndSet(false, true);
        final RealChannel realChannel = this.R;
        SynchronizationContext synchronizationContext = this.n;
        if (zCompareAndSet) {
            synchronizationContext.execute(new Runnable() { // from class: io.grpc.internal.ManagedChannelImpl.1Shutdown
                @Override // java.lang.Runnable
                public final void run() {
                    ManagedChannelImpl managedChannelImpl = ManagedChannelImpl.this;
                    managedChannelImpl.P.a(ChannelLogger.ChannelLogLevel.e, "Entering SHUTDOWN state");
                    managedChannelImpl.s.a(ConnectivityState.h);
                }
            });
            ManagedChannelImpl.this.n.execute(new Runnable() { // from class: io.grpc.internal.ManagedChannelImpl.RealChannel.1RealChannelShutdown
                @Override // java.lang.Runnable
                public final void run() {
                    RealChannel realChannel2 = RealChannel.this;
                    ManagedChannelImpl managedChannelImpl = ManagedChannelImpl.this;
                    AtomicReference atomicReference = realChannel2.f24047a;
                    if (managedChannelImpl.C == null) {
                        if (atomicReference.get() == ManagedChannelImpl.l0) {
                            atomicReference.set(null);
                        }
                        ManagedChannelImpl.this.G.a(ManagedChannelImpl.i0);
                    }
                }
            });
            synchronizationContext.execute(new Runnable() { // from class: io.grpc.internal.ManagedChannelImpl.1CancelIdleTimer
                @Override // java.lang.Runnable
                public final void run() {
                    Logger logger = ManagedChannelImpl.f0;
                    ManagedChannelImpl.this.p(true);
                }
            });
        }
        ManagedChannelImpl.this.n.execute(new Runnable() { // from class: io.grpc.internal.ManagedChannelImpl.RealChannel.1RealChannelShutdownNow
            @Override // java.lang.Runnable
            public final void run() {
                ArrayList arrayList;
                if (RealChannel.this.f24047a.get() == ManagedChannelImpl.l0) {
                    RealChannel.this.f24047a.set(null);
                }
                LinkedHashSet linkedHashSet = ManagedChannelImpl.this.C;
                if (linkedHashSet != null) {
                    Iterator it = linkedHashSet.iterator();
                    while (it.hasNext()) {
                        ((PendingCall) it.next()).a("Channel is forcefully shutdown", null);
                    }
                }
                UncommittedRetriableStreamsRegistry uncommittedRetriableStreamsRegistry = ManagedChannelImpl.this.G;
                Status status = ManagedChannelImpl.h0;
                uncommittedRetriableStreamsRegistry.a(status);
                synchronized (uncommittedRetriableStreamsRegistry.f24051a) {
                    arrayList = new ArrayList(uncommittedRetriableStreamsRegistry.b);
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((ClientStream) it2.next()).e(status);
                }
                ManagedChannelImpl.this.F.f(status);
            }
        });
        synchronizationContext.execute(new Runnable() { // from class: io.grpc.internal.ManagedChannelImpl.1ShutdownNow
            @Override // java.lang.Runnable
            public final void run() {
                ManagedChannelImpl managedChannelImpl = ManagedChannelImpl.this;
                if (managedChannelImpl.I) {
                    return;
                }
                managedChannelImpl.I = true;
                ManagedChannelImpl.n(managedChannelImpl);
            }
        });
        return this;
    }

    public final void p(boolean z) {
        ScheduledFuture scheduledFuture;
        Rescheduler rescheduler = this.e0;
        rescheduler.f = false;
        if (!z || (scheduledFuture = rescheduler.g) == null) {
            return;
        }
        scheduledFuture.cancel(false);
        rescheduler.g = null;
    }

    public final void q() {
        this.n.e();
        if (this.H.get() || this.A) {
            return;
        }
        if (this.c0.f24021a.isEmpty()) {
            s();
        } else {
            p(false);
        }
        if (this.y != null) {
            return;
        }
        this.P.a(ChannelLogger.ChannelLogLevel.e, "Exiting idle mode");
        LbHelperImpl lbHelperImpl = new LbHelperImpl();
        AutoConfiguredLoadBalancerFactory autoConfiguredLoadBalancerFactory = this.e;
        autoConfiguredLoadBalancerFactory.getClass();
        lbHelperImpl.f24045a = autoConfiguredLoadBalancerFactory.new AutoConfiguredLoadBalancer(lbHelperImpl);
        this.y = lbHelperImpl;
        this.w.e(new NameResolverListener(lbHelperImpl, this.w));
        this.x = true;
    }

    public final void s() {
        long j = this.r;
        if (j == -1) {
            return;
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Rescheduler rescheduler = this.e0;
        rescheduler.getClass();
        long nanos = timeUnit.toNanos(j);
        Stopwatch stopwatch = rescheduler.d;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        long jA = stopwatch.a() + nanos;
        rescheduler.f = true;
        if (jA - rescheduler.e < 0 || rescheduler.g == null) {
            ScheduledFuture scheduledFuture = rescheduler.g;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            rescheduler.g = rescheduler.f24078a.schedule(rescheduler.new FutureRunnable(), nanos, timeUnit2);
        }
        rescheduler.e = jA;
    }

    public final void t(boolean z) {
        this.n.e();
        if (z) {
            Preconditions.q("nameResolver is not started", this.x);
            Preconditions.q("lbHelper is null", this.y != null);
        }
        NameResolver nameResolver = this.w;
        if (nameResolver != null) {
            nameResolver.c();
            this.x = false;
            if (z) {
                this.w = r(this.b, this.c, this.d, ((CallCredentialsApplyingTransportFactory) this.g).d.Y0());
            } else {
                this.w = null;
            }
        }
        LbHelperImpl lbHelperImpl = this.y;
        if (lbHelperImpl != null) {
            AutoConfiguredLoadBalancerFactory.AutoConfiguredLoadBalancer autoConfiguredLoadBalancer = lbHelperImpl.f24045a;
            autoConfiguredLoadBalancer.b.f();
            autoConfiguredLoadBalancer.b = null;
            this.y = null;
        }
        this.z = null;
    }

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.b(this.f24038a.c, "logId");
        toStringHelperB.c(this.b, "target");
        return toStringHelperB.toString();
    }
}
