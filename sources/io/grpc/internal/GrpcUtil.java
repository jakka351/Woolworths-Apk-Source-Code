package io.grpc.internal;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.base.Stopwatch;
import com.google.common.base.Supplier;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.grpc.CallOptions;
import io.grpc.ClientStreamTracer;
import io.grpc.InternalLogId;
import io.grpc.InternalMetadata;
import io.grpc.LoadBalancer;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;
import io.grpc.ProxiedSocketAddress;
import io.grpc.ProxyDetector;
import io.grpc.Status;
import io.grpc.internal.ClientStreamListener;
import io.grpc.internal.SharedResourceHolder;
import io.jsonwebtoken.JwtParser;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.concurrent.Immutable;

/* loaded from: classes7.dex */
public final class GrpcUtil {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f24015a = Logger.getLogger(GrpcUtil.class.getName());
    public static final Set b = Collections.unmodifiableSet(EnumSet.of(Status.Code.OK, Status.Code.INVALID_ARGUMENT, Status.Code.NOT_FOUND, Status.Code.ALREADY_EXISTS, Status.Code.FAILED_PRECONDITION, Status.Code.ABORTED, Status.Code.OUT_OF_RANGE, Status.Code.DATA_LOSS));
    public static final Metadata.Key c;
    public static final Metadata.Key d;
    public static final Metadata.Key e;
    public static final Metadata.Key f;
    public static final Metadata.Key g;
    public static final Metadata.Key h;
    public static final Metadata.Key i;
    public static final Metadata.Key j;
    public static final Metadata.Key k;
    public static final long l;
    public static final ProxyDetector m;
    public static final CallOptions.Key n;
    public static final ClientStreamTracer o;
    public static final SharedResourceHolder.Resource p;
    public static final SharedResourceHolder.Resource q;
    public static final Supplier r;

    /* renamed from: io.grpc.internal.GrpcUtil$1, reason: invalid class name */
    public class AnonymousClass1 implements ProxyDetector {
        @Override // io.grpc.ProxyDetector
        public final ProxiedSocketAddress a(InetSocketAddress inetSocketAddress) {
            return null;
        }
    }

    /* renamed from: io.grpc.internal.GrpcUtil$2, reason: invalid class name */
    public class AnonymousClass2 extends ClientStreamTracer {
    }

    /* renamed from: io.grpc.internal.GrpcUtil$3, reason: invalid class name */
    public class AnonymousClass3 implements SharedResourceHolder.Resource<Executor> {
        @Override // io.grpc.internal.SharedResourceHolder.Resource
        public final void b(Object obj) {
            ((ExecutorService) ((Executor) obj)).shutdown();
        }

        @Override // io.grpc.internal.SharedResourceHolder.Resource
        public final Object create() {
            return Executors.newCachedThreadPool(GrpcUtil.e("grpc-default-executor-%d"));
        }

        public final String toString() {
            return "grpc-default-executor";
        }
    }

    /* renamed from: io.grpc.internal.GrpcUtil$4, reason: invalid class name */
    public class AnonymousClass4 implements SharedResourceHolder.Resource<ScheduledExecutorService> {
        @Override // io.grpc.internal.SharedResourceHolder.Resource
        public final void b(Object obj) {
            ((ScheduledExecutorService) obj).shutdown();
        }

        @Override // io.grpc.internal.SharedResourceHolder.Resource
        public final Object create() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, GrpcUtil.e("grpc-timer-%d"));
            try {
                scheduledExecutorServiceNewScheduledThreadPool.getClass().getMethod("setRemoveOnCancelPolicy", Boolean.TYPE).invoke(scheduledExecutorServiceNewScheduledThreadPool, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
            return Executors.unconfigurableScheduledExecutorService(scheduledExecutorServiceNewScheduledThreadPool);
        }
    }

    /* renamed from: io.grpc.internal.GrpcUtil$5, reason: invalid class name */
    public class AnonymousClass5 implements Supplier<Stopwatch> {
        @Override // com.google.common.base.Supplier
        public final Object get() {
            return new Stopwatch();
        }
    }

    public static final class AcceptEncodingMarshaller implements InternalMetadata.TrustedAsciiMarshaller<byte[]> {
        @Override // io.grpc.Metadata.TrustedAsciiMarshaller
        public final byte[] a(Object obj) {
            return (byte[]) obj;
        }

        @Override // io.grpc.Metadata.TrustedAsciiMarshaller
        public final Object b(byte[] bArr) {
            return bArr;
        }
    }

    public static class AuthorityEscaper {

        /* renamed from: a, reason: collision with root package name */
        public static final Set f24017a;
        public static final Set b;
        public static final Set c;

        static {
            "0123456789ABCDEF".toCharArray();
            f24017a = Collections.unmodifiableSet(new HashSet(Arrays.asList('-', '_', Character.valueOf(JwtParser.SEPARATOR_CHAR), '~')));
            b = Collections.unmodifiableSet(new HashSet(Arrays.asList('!', '$', '&', '\'', '(', ')', '*', '+', ',', ';', '=')));
            c = Collections.unmodifiableSet(new HashSet(Arrays.asList(':', '[', ']', '@')));
        }
    }

    @Immutable
    public static final class GrpcBuildVersion {
        public final String toString() {
            return "null null";
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class Http2Error {
        public static final Http2Error f;
        public static final Http2Error[] g;
        public static final /* synthetic */ Http2Error[] h;
        public final int d;
        public final Status e;

        /* JADX INFO: Fake field, exist only in values array */
        Http2Error EF0;

        /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
            java.lang.NullPointerException
            	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
            	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:496)
            	at jadx.core.dex.visitors.regions.LoopRegionVisitor.checkArrayForEach(LoopRegionVisitor.java:230)
            	at jadx.core.dex.visitors.regions.LoopRegionVisitor.checkForIndexedLoop(LoopRegionVisitor.java:144)
            	at jadx.core.dex.visitors.regions.LoopRegionVisitor.processLoopRegion(LoopRegionVisitor.java:81)
            	at jadx.core.dex.visitors.regions.LoopRegionVisitor.enterRegion(LoopRegionVisitor.java:65)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
            	at jadx.core.dex.visitors.regions.LoopRegionVisitor.visit(LoopRegionVisitor.java:55)
            */
        static {
            /*
                Method dump skipped, instructions count: 200
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.GrpcUtil.Http2Error.<clinit>():void");
        }

        public Http2Error(String str, int i, int i2, Status status) {
            this.d = i2;
            String str2 = "HTTP/2 error code: " + name();
            this.e = status.i(status.b != null ? YU.a.o(YU.a.t(str2, " ("), status.b, ")") : str2);
        }

        public static Http2Error valueOf(String str) {
            return (Http2Error) Enum.valueOf(Http2Error.class, str);
        }

        public static Http2Error[] values() {
            return (Http2Error[]) h.clone();
        }
    }

    @VisibleForTesting
    public static class TimeoutMarshaller implements Metadata.AsciiMarshaller<Long> {
        @Override // io.grpc.Metadata.AsciiMarshaller
        public final String a(Object obj) {
            Long l = (Long) obj;
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            if (l.longValue() < 0) {
                throw new IllegalArgumentException("Timeout too small");
            }
            if (l.longValue() < 100000000) {
                return l + "n";
            }
            if (l.longValue() < 100000000000L) {
                return timeUnit.toMicros(l.longValue()) + "u";
            }
            if (l.longValue() < 100000000000000L) {
                return timeUnit.toMillis(l.longValue()) + "m";
            }
            if (l.longValue() < 100000000000000000L) {
                return timeUnit.toSeconds(l.longValue()) + "S";
            }
            if (l.longValue() < 6000000000000000000L) {
                return timeUnit.toMinutes(l.longValue()) + "M";
            }
            return timeUnit.toHours(l.longValue()) + "H";
        }

        @Override // io.grpc.Metadata.AsciiMarshaller
        public final Object b(String str) throws NumberFormatException {
            Preconditions.f("empty timeout", str.length() > 0);
            Preconditions.f("bad timeout format", str.length() <= 9);
            long j = Long.parseLong(str.substring(0, str.length() - 1));
            char cCharAt = str.charAt(str.length() - 1);
            if (cCharAt == 'H') {
                return Long.valueOf(TimeUnit.HOURS.toNanos(j));
            }
            if (cCharAt == 'M') {
                return Long.valueOf(TimeUnit.MINUTES.toNanos(j));
            }
            if (cCharAt == 'S') {
                return Long.valueOf(TimeUnit.SECONDS.toNanos(j));
            }
            if (cCharAt == 'u') {
                return Long.valueOf(TimeUnit.MICROSECONDS.toNanos(j));
            }
            if (cCharAt == 'm') {
                return Long.valueOf(TimeUnit.MILLISECONDS.toNanos(j));
            }
            if (cCharAt == 'n') {
                return Long.valueOf(j);
            }
            throw new IllegalArgumentException("Invalid timeout unit: " + cCharAt);
        }
    }

    static {
        Charset.forName("US-ASCII");
        c = Metadata.Key.a("grpc-timeout", new TimeoutMarshaller());
        Metadata.AsciiMarshaller asciiMarshaller = Metadata.d;
        d = Metadata.Key.a("grpc-encoding", asciiMarshaller);
        e = InternalMetadata.a("grpc-accept-encoding", new AcceptEncodingMarshaller());
        f = Metadata.Key.a("content-encoding", asciiMarshaller);
        g = InternalMetadata.a("accept-encoding", new AcceptEncodingMarshaller());
        h = Metadata.Key.a("content-length", asciiMarshaller);
        i = Metadata.Key.a("content-type", asciiMarshaller);
        j = Metadata.Key.a("te", asciiMarshaller);
        k = Metadata.Key.a("user-agent", asciiMarshaller);
        Splitter.a(',').d();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        l = timeUnit.toNanos(20L);
        TimeUnit.HOURS.toNanos(2L);
        timeUnit.toNanos(20L);
        m = new ProxyDetectorImpl();
        n = new CallOptions.Key("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER");
        o = new AnonymousClass2();
        p = new AnonymousClass3();
        q = new AnonymousClass4();
        r = new AnonymousClass5();
    }

    public static URI a(String str) {
        String str2;
        Preconditions.j(str, "authority");
        try {
            str2 = str;
        } catch (URISyntaxException e2) {
            e = e2;
            str2 = str;
        }
        try {
            return new URI(null, str2, null, null, null);
        } catch (URISyntaxException e3) {
            e = e3;
            throw new IllegalArgumentException("Invalid authority: ".concat(str2), e);
        }
    }

    public static void b(Closeable closeable) throws IOException {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e2) {
            f24015a.log(Level.WARNING, "exception caught in closeQuietly", (Throwable) e2);
        }
    }

    public static ClientStreamTracer[] c(CallOptions callOptions, Metadata metadata, int i2, boolean z) {
        List list = callOptions.e;
        int size = list.size();
        ClientStreamTracer[] clientStreamTracerArr = new ClientStreamTracer[size + 1];
        CallOptions callOptions2 = CallOptions.i;
        ClientStreamTracer.StreamInfo streamInfo = new ClientStreamTracer.StreamInfo(callOptions, i2, z);
        for (int i3 = 0; i3 < list.size(); i3++) {
            clientStreamTracerArr[i3] = ((ClientStreamTracer.Factory) list.get(i3)).a(streamInfo, metadata);
        }
        clientStreamTracerArr[size] = o;
        return clientStreamTracerArr;
    }

    public static String d(InetSocketAddress inetSocketAddress) {
        try {
            return (String) InetSocketAddress.class.getMethod("getHostString", null).invoke(inetSocketAddress, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return inetSocketAddress.getHostName();
        }
    }

    public static ThreadFactory e(String str) {
        ThreadFactoryBuilder threadFactoryBuilder = new ThreadFactoryBuilder();
        threadFactoryBuilder.b = Boolean.TRUE;
        String.format(Locale.ROOT, str, 0);
        threadFactoryBuilder.f14967a = str;
        return threadFactoryBuilder.a();
    }

    public static ClientTransport f(LoadBalancer.PickResult pickResult, boolean z) {
        LoadBalancer.Subchannel subchannel = pickResult.f23953a;
        Status status = pickResult.c;
        final ManagedClientTransport managedClientTransportA = subchannel != null ? ((TransportProvider) subchannel.e()).a() : null;
        if (managedClientTransportA != null) {
            final ClientStreamTracer.Factory factory = pickResult.b;
            return factory == null ? managedClientTransportA : new ClientTransport() { // from class: io.grpc.internal.GrpcUtil.6
                @Override // io.grpc.InternalWithLogId
                public final InternalLogId b() {
                    return managedClientTransportA.b();
                }

                @Override // io.grpc.internal.ClientTransport
                public final ClientStream d(MethodDescriptor methodDescriptor, Metadata metadata, CallOptions callOptions, ClientStreamTracer[] clientStreamTracerArr) {
                    CallOptions callOptions2 = CallOptions.i;
                    Preconditions.j(callOptions, "callOptions cannot be null");
                    ClientStreamTracer clientStreamTracerA = factory.a(new ClientStreamTracer.StreamInfo(callOptions, 0, false), metadata);
                    Preconditions.q("lb tracer already assigned", clientStreamTracerArr[clientStreamTracerArr.length - 1] == GrpcUtil.o);
                    clientStreamTracerArr[clientStreamTracerArr.length - 1] = clientStreamTracerA;
                    return managedClientTransportA.d(methodDescriptor, metadata, callOptions, clientStreamTracerArr);
                }
            };
        }
        if (!status.f()) {
            if (pickResult.d) {
                return new FailingClientTransport(h(status), ClientStreamListener.RpcProgress.f);
            }
            if (!z) {
                return new FailingClientTransport(h(status), ClientStreamListener.RpcProgress.d);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static io.grpc.Status g(int r3) {
        /*
            r0 = 100
            if (r3 < r0) goto Lb
            r0 = 200(0xc8, float:2.8E-43)
            if (r3 >= r0) goto Lb
            io.grpc.Status$Code r0 = io.grpc.Status.Code.INTERNAL
            goto L37
        Lb:
            r0 = 400(0x190, float:5.6E-43)
            if (r3 == r0) goto L35
            r0 = 401(0x191, float:5.62E-43)
            if (r3 == r0) goto L32
            r0 = 403(0x193, float:5.65E-43)
            if (r3 == r0) goto L2f
            r0 = 404(0x194, float:5.66E-43)
            if (r3 == r0) goto L2c
            r0 = 429(0x1ad, float:6.01E-43)
            if (r3 == r0) goto L29
            r0 = 431(0x1af, float:6.04E-43)
            if (r3 == r0) goto L35
            switch(r3) {
                case 502: goto L29;
                case 503: goto L29;
                case 504: goto L29;
                default: goto L26;
            }
        L26:
            io.grpc.Status$Code r0 = io.grpc.Status.Code.UNKNOWN
            goto L37
        L29:
            io.grpc.Status$Code r0 = io.grpc.Status.Code.UNAVAILABLE
            goto L37
        L2c:
            io.grpc.Status$Code r0 = io.grpc.Status.Code.UNIMPLEMENTED
            goto L37
        L2f:
            io.grpc.Status$Code r0 = io.grpc.Status.Code.PERMISSION_DENIED
            goto L37
        L32:
            io.grpc.Status$Code r0 = io.grpc.Status.Code.UNAUTHENTICATED
            goto L37
        L35:
            io.grpc.Status$Code r0 = io.grpc.Status.Code.INTERNAL
        L37:
            io.grpc.Status r0 = r0.a()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "HTTP status code "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            io.grpc.Status r3 = r0.i(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.GrpcUtil.g(int):io.grpc.Status");
    }

    public static Status h(Status status) {
        Preconditions.g(status != null);
        if (!b.contains(status.f23971a)) {
            return status;
        }
        return Status.m.i("Inappropriate status code from control plane: " + status.f23971a + " " + status.b).h(status.c);
    }
}
