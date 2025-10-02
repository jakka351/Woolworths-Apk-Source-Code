package io.grpc.okhttp;

import com.google.common.base.Preconditions;
import io.grpc.ChannelLogger;
import io.grpc.ExperimentalApi;
import io.grpc.ForwardingChannelBuilder2;
import io.grpc.Internal;
import io.grpc.ManagedChannelBuilder;
import io.grpc.TlsChannelCredentials;
import io.grpc.internal.AtomicBackoff;
import io.grpc.internal.AtomicBackoff.State;
import io.grpc.internal.ClientTransportFactory;
import io.grpc.internal.ConnectionClientTransport;
import io.grpc.internal.GrpcUtil;
import io.grpc.internal.KeepAliveManager;
import io.grpc.internal.ManagedChannelImplBuilder;
import io.grpc.internal.ObjectPool;
import io.grpc.internal.SharedResourceHolder;
import io.grpc.internal.SharedResourcePool;
import io.grpc.internal.TransportTracer;
import io.grpc.okhttp.internal.CipherSuite;
import io.grpc.okhttp.internal.ConnectionSpec;
import io.grpc.okhttp.internal.Platform;
import io.grpc.okhttp.internal.TlsVersion;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.security.GeneralSecurityException;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

@ExperimentalApi
/* loaded from: classes7.dex */
public final class OkHttpChannelBuilder extends ForwardingChannelBuilder2<OkHttpChannelBuilder> {
    public static final ConnectionSpec m;
    public static final long n;
    public static final SharedResourceHolder.Resource o = null;
    public static final SharedResourcePool p;
    public SSLSocketFactory e;
    public final TransportTracer.Factory b = TransportTracer.c;
    public final SharedResourcePool c = p;
    public final SharedResourcePool d = new SharedResourcePool(GrpcUtil.q);
    public final ConnectionSpec f = m;
    public final NegotiationType g = NegotiationType.d;
    public long h = Long.MAX_VALUE;
    public final long i = GrpcUtil.l;
    public final int j = Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
    public final int k = 4194304;
    public final int l = Integer.MAX_VALUE;

    /* renamed from: a, reason: collision with root package name */
    public final ManagedChannelImplBuilder f24117a = new ManagedChannelImplBuilder(new OkHttpChannelTransportFactoryBuilder(), new OkHttpChannelDefaultPortProvider());

    /* renamed from: io.grpc.okhttp.OkHttpChannelBuilder$1, reason: invalid class name */
    public class AnonymousClass1 implements SharedResourceHolder.Resource<Executor> {
        @Override // io.grpc.internal.SharedResourceHolder.Resource
        public final void b(Object obj) {
            ((ExecutorService) ((Executor) obj)).shutdown();
        }

        @Override // io.grpc.internal.SharedResourceHolder.Resource
        public final Object create() {
            return Executors.newCachedThreadPool(GrpcUtil.e("grpc-okhttp-%d"));
        }
    }

    /* renamed from: io.grpc.okhttp.OkHttpChannelBuilder$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24118a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[NegotiationType.values().length];
            b = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[io.grpc.okhttp.NegotiationType.values().length];
            f24118a = iArr2;
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24118a[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class NegotiationType {
        public static final NegotiationType d;
        public static final /* synthetic */ NegotiationType[] e;

        static {
            NegotiationType negotiationType = new NegotiationType("TLS", 0);
            d = negotiationType;
            e = new NegotiationType[]{negotiationType, new NegotiationType("PLAINTEXT", 1)};
        }

        public static NegotiationType valueOf(String str) {
            return (NegotiationType) Enum.valueOf(NegotiationType.class, str);
        }

        public static NegotiationType[] values() {
            return (NegotiationType[]) e.clone();
        }
    }

    public final class OkHttpChannelDefaultPortProvider implements ManagedChannelImplBuilder.ChannelBuilderDefaultPortProvider {
        public OkHttpChannelDefaultPortProvider() {
        }

        @Override // io.grpc.internal.ManagedChannelImplBuilder.ChannelBuilderDefaultPortProvider
        public final int a() {
            OkHttpChannelBuilder okHttpChannelBuilder = OkHttpChannelBuilder.this;
            int iOrdinal = okHttpChannelBuilder.g.ordinal();
            if (iOrdinal == 0) {
                return 443;
            }
            if (iOrdinal == 1) {
                return 80;
            }
            throw new AssertionError(okHttpChannelBuilder.g + " not handled");
        }
    }

    public final class OkHttpChannelTransportFactoryBuilder implements ManagedChannelImplBuilder.ClientTransportFactoryBuilder {
        public OkHttpChannelTransportFactoryBuilder() {
        }

        @Override // io.grpc.internal.ManagedChannelImplBuilder.ClientTransportFactoryBuilder
        public final ClientTransportFactory a() {
            SSLSocketFactory sSLSocketFactory;
            OkHttpChannelBuilder okHttpChannelBuilder = OkHttpChannelBuilder.this;
            boolean z = okHttpChannelBuilder.h != Long.MAX_VALUE;
            SharedResourcePool sharedResourcePool = okHttpChannelBuilder.c;
            SharedResourcePool sharedResourcePool2 = okHttpChannelBuilder.d;
            int iOrdinal = okHttpChannelBuilder.g.ordinal();
            if (iOrdinal == 0) {
                try {
                    if (okHttpChannelBuilder.e == null) {
                        okHttpChannelBuilder.e = SSLContext.getInstance("Default", Platform.d.f24139a).getSocketFactory();
                    }
                    sSLSocketFactory = okHttpChannelBuilder.e;
                } catch (GeneralSecurityException e) {
                    throw new RuntimeException("TLS Provider failure", e);
                }
            } else {
                if (iOrdinal != 1) {
                    throw new RuntimeException("Unknown negotiation type: " + okHttpChannelBuilder.g);
                }
                sSLSocketFactory = null;
            }
            return new OkHttpTransportFactory(sharedResourcePool, sharedResourcePool2, sSLSocketFactory, okHttpChannelBuilder.f, okHttpChannelBuilder.k, z, okHttpChannelBuilder.h, okHttpChannelBuilder.i, okHttpChannelBuilder.j, okHttpChannelBuilder.l, okHttpChannelBuilder.b);
        }
    }

    @Internal
    public static final class OkHttpTransportFactory implements ClientTransportFactory {
        public final ObjectPool d;
        public final Executor e;
        public final ObjectPool f;
        public final ScheduledExecutorService g;
        public final TransportTracer.Factory h;
        public final SSLSocketFactory i;
        public final ConnectionSpec j;
        public final int k;
        public final boolean l;
        public final AtomicBackoff m;
        public final long n;
        public final int o;
        public final int p;
        public boolean q;

        /* renamed from: io.grpc.okhttp.OkHttpChannelBuilder$OkHttpTransportFactory$1, reason: invalid class name */
        class AnonymousClass1 implements Runnable {
            public final /* synthetic */ AtomicBackoff.State d;

            public AnonymousClass1(AtomicBackoff.State state) {
                this.d = state;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AtomicBackoff.State state = this.d;
                long j = state.f23983a;
                long jMax = Math.max(2 * j, j);
                AtomicBackoff atomicBackoff = AtomicBackoff.this;
                if (atomicBackoff.b.compareAndSet(j, jMax)) {
                    AtomicBackoff.c.log(Level.WARNING, "Increased {0} to {1}", new Object[]{atomicBackoff.f23982a, Long.valueOf(jMax)});
                }
            }
        }

        public OkHttpTransportFactory(ObjectPool objectPool, SharedResourcePool sharedResourcePool, SSLSocketFactory sSLSocketFactory, ConnectionSpec connectionSpec, int i, boolean z, long j, long j2, int i2, int i3, TransportTracer.Factory factory) {
            this.d = objectPool;
            this.e = (Executor) objectPool.getObject();
            this.f = sharedResourcePool;
            this.g = (ScheduledExecutorService) SharedResourceHolder.a(sharedResourcePool.f24106a);
            this.i = sSLSocketFactory;
            this.j = connectionSpec;
            this.k = i;
            this.l = z;
            this.m = new AtomicBackoff(j);
            this.n = j2;
            this.o = i2;
            this.p = i3;
            Preconditions.j(factory, "transportTracerFactory");
            this.h = factory;
        }

        @Override // io.grpc.internal.ClientTransportFactory
        public final ConnectionClientTransport K0(SocketAddress socketAddress, ClientTransportFactory.ClientTransportOptions clientTransportOptions, ChannelLogger channelLogger) {
            if (this.q) {
                throw new IllegalStateException("The transport factory is closed.");
            }
            AtomicBackoff atomicBackoff = this.m;
            long j = atomicBackoff.b.get();
            OkHttpClientTransport okHttpClientTransport = new OkHttpClientTransport(this, (InetSocketAddress) socketAddress, clientTransportOptions.f23999a, clientTransportOptions.b, clientTransportOptions.c, new AnonymousClass1(atomicBackoff.new State(j)));
            if (this.l) {
                okHttpClientTransport.G = true;
                okHttpClientTransport.H = j;
                okHttpClientTransport.I = this.n;
            }
            return okHttpClientTransport;
        }

        @Override // io.grpc.internal.ClientTransportFactory
        public final Collection Y0() {
            ConnectionSpec connectionSpec = OkHttpChannelBuilder.m;
            return Collections.singleton(InetSocketAddress.class);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.q) {
                return;
            }
            this.q = true;
            this.d.a(this.e);
            this.f.a(this.g);
        }

        @Override // io.grpc.internal.ClientTransportFactory
        public final ScheduledExecutorService j0() {
            return this.g;
        }
    }

    public static final class SslSocketFactoryResult {
    }

    static {
        Logger.getLogger(OkHttpChannelBuilder.class.getName());
        ConnectionSpec.Builder builder = new ConnectionSpec.Builder(ConnectionSpec.e);
        builder.a(CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, CipherSuite.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256);
        builder.b(TlsVersion.TLS_1_2);
        if (!builder.f24133a) {
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        builder.d = true;
        m = new ConnectionSpec(builder);
        n = TimeUnit.DAYS.toNanos(1000L);
        p = new SharedResourcePool(new AnonymousClass1());
        EnumSet.of(TlsChannelCredentials.Feature.d, TlsChannelCredentials.Feature.e);
    }

    @Override // io.grpc.ForwardingChannelBuilder2, io.grpc.ManagedChannelBuilder
    public final void c() {
        long nanos = TimeUnit.SECONDS.toNanos(30L);
        this.h = nanos;
        long jMax = Math.max(nanos, KeepAliveManager.k);
        this.h = jMax;
        if (jMax >= n) {
            this.h = Long.MAX_VALUE;
        }
    }

    @Override // io.grpc.ForwardingChannelBuilder2
    public final ManagedChannelBuilder d() {
        return this.f24117a;
    }
}
