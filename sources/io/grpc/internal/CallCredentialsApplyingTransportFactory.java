package io.grpc.internal;

import com.google.common.base.Preconditions;
import io.grpc.CallCredentials;
import io.grpc.CallOptions;
import io.grpc.ChannelLogger;
import io.grpc.ClientStreamTracer;
import io.grpc.InternalMayRequireSpecificExecutor;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;
import io.grpc.Status;
import io.grpc.internal.ClientTransportFactory;
import io.grpc.internal.MetadataApplierImpl;
import java.io.IOException;
import java.net.SocketAddress;
import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes7.dex */
final class CallCredentialsApplyingTransportFactory implements ClientTransportFactory {
    public final ClientTransportFactory d;
    public final Executor e;

    public class CallCredentialsApplyingTransport extends ForwardingConnectionClientTransport {

        /* renamed from: a, reason: collision with root package name */
        public final ConnectionClientTransport f23989a;
        public volatile Status c;
        public Status d;
        public Status e;
        public final AtomicInteger b = new AtomicInteger(-2147483647);
        public final MetadataApplierImpl.MetadataApplierListener f = new AnonymousClass1();

        /* renamed from: io.grpc.internal.CallCredentialsApplyingTransportFactory$CallCredentialsApplyingTransport$1, reason: invalid class name */
        public class AnonymousClass1 implements MetadataApplierImpl.MetadataApplierListener {
            public AnonymousClass1() {
            }

            @Override // io.grpc.internal.MetadataApplierImpl.MetadataApplierListener
            public final void onComplete() {
                CallCredentialsApplyingTransport callCredentialsApplyingTransport = CallCredentialsApplyingTransport.this;
                if (callCredentialsApplyingTransport.b.decrementAndGet() == 0) {
                    CallCredentialsApplyingTransport.h(callCredentialsApplyingTransport);
                }
            }
        }

        /* renamed from: io.grpc.internal.CallCredentialsApplyingTransportFactory$CallCredentialsApplyingTransport$2, reason: invalid class name */
        class AnonymousClass2 extends CallCredentials.RequestInfo {
        }

        public CallCredentialsApplyingTransport(ConnectionClientTransport connectionClientTransport, String str) {
            Preconditions.j(connectionClientTransport, "delegate");
            this.f23989a = connectionClientTransport;
            Preconditions.j(str, "authority");
        }

        public static void h(CallCredentialsApplyingTransport callCredentialsApplyingTransport) {
            synchronized (callCredentialsApplyingTransport) {
                try {
                    if (callCredentialsApplyingTransport.b.get() != 0) {
                        return;
                    }
                    Status status = callCredentialsApplyingTransport.d;
                    Status status2 = callCredentialsApplyingTransport.e;
                    callCredentialsApplyingTransport.d = null;
                    callCredentialsApplyingTransport.e = null;
                    if (status != null) {
                        super.g(status);
                    }
                    if (status2 != null) {
                        super.f(status2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // io.grpc.internal.ForwardingConnectionClientTransport
        public final ConnectionClientTransport a() {
            return this.f23989a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [io.grpc.CallCredentials] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        @Override // io.grpc.internal.ForwardingConnectionClientTransport, io.grpc.internal.ClientTransport
        public final ClientStream d(MethodDescriptor methodDescriptor, Metadata metadata, CallOptions callOptions, ClientStreamTracer[] clientStreamTracerArr) {
            ClientStream clientStream;
            Executor executor;
            CallCredentials callCredentials = callOptions.c;
            InternalMayRequireSpecificExecutor internalMayRequireSpecificExecutor = callCredentials;
            if (callCredentials == null) {
                internalMayRequireSpecificExecutor = 0;
            }
            if (internalMayRequireSpecificExecutor == 0) {
                return this.b.get() >= 0 ? new FailingClientStream(this.c, clientStreamTracerArr) : this.f23989a.d(methodDescriptor, metadata, callOptions, clientStreamTracerArr);
            }
            MetadataApplierImpl metadataApplierImpl = new MetadataApplierImpl(this.f23989a, methodDescriptor, metadata, callOptions, this.f, clientStreamTracerArr);
            if (this.b.incrementAndGet() > 0) {
                ((AnonymousClass1) this.f).onComplete();
                return new FailingClientStream(this.c, clientStreamTracerArr);
            }
            AnonymousClass2 anonymousClass2 = new AnonymousClass2();
            try {
                if (!(internalMayRequireSpecificExecutor instanceof InternalMayRequireSpecificExecutor) || !internalMayRequireSpecificExecutor.a() || (executor = callOptions.b) == null) {
                    executor = CallCredentialsApplyingTransportFactory.this.e;
                }
                internalMayRequireSpecificExecutor.a(anonymousClass2, executor, metadataApplierImpl);
            } catch (Throwable th) {
                metadataApplierImpl.b(Status.j.i("Credentials should use fail() instead of throwing exceptions").h(th));
            }
            synchronized (metadataApplierImpl.h) {
                try {
                    ClientStream clientStream2 = metadataApplierImpl.i;
                    clientStream = clientStream2;
                    if (clientStream2 == null) {
                        DelayedStream delayedStream = new DelayedStream();
                        metadataApplierImpl.k = delayedStream;
                        metadataApplierImpl.i = delayedStream;
                    }
                } finally {
                }
            }
            return clientStream;
        }

        @Override // io.grpc.internal.ForwardingConnectionClientTransport, io.grpc.internal.ManagedClientTransport
        public final void f(Status status) {
            Preconditions.j(status, "status");
            synchronized (this) {
                try {
                    if (this.b.get() < 0) {
                        this.c = status;
                        this.b.addAndGet(Integer.MAX_VALUE);
                    } else if (this.e != null) {
                        return;
                    }
                    if (this.b.get() != 0) {
                        this.e = status;
                    } else {
                        super.f(status);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // io.grpc.internal.ForwardingConnectionClientTransport, io.grpc.internal.ManagedClientTransport
        public final void g(Status status) {
            Preconditions.j(status, "status");
            synchronized (this) {
                try {
                    if (this.b.get() < 0) {
                        this.c = status;
                        this.b.addAndGet(Integer.MAX_VALUE);
                        if (this.b.get() != 0) {
                            this.d = status;
                        } else {
                            super.g(status);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public CallCredentialsApplyingTransportFactory(ClientTransportFactory clientTransportFactory, Executor executor) {
        Preconditions.j(clientTransportFactory, "delegate");
        this.d = clientTransportFactory;
        this.e = executor;
    }

    @Override // io.grpc.internal.ClientTransportFactory
    public final ConnectionClientTransport K0(SocketAddress socketAddress, ClientTransportFactory.ClientTransportOptions clientTransportOptions, ChannelLogger channelLogger) {
        return new CallCredentialsApplyingTransport(this.d.K0(socketAddress, clientTransportOptions, channelLogger), clientTransportOptions.f23999a);
    }

    @Override // io.grpc.internal.ClientTransportFactory
    public final Collection Y0() {
        return this.d.Y0();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.d.close();
    }

    @Override // io.grpc.internal.ClientTransportFactory
    public final ScheduledExecutorService j0() {
        return this.d.j0();
    }
}
