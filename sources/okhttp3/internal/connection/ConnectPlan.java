package okhttp3.internal.connection;

import java.io.IOException;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.NaturalOrderComparator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import okhttp3.Address;
import okhttp3.CertificatePinner;
import okhttp3.CipherSuite;
import okhttp3.ConnectionSpec;
import okhttp3.Handshake;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RoutePlanner;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http1.Http1ExchangeCodec;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.OkHostnameVerifier;
import okio.Base64;
import okio.ByteString;
import okio.Okio;
import okio.RealBufferedSink;
import okio.RealBufferedSource;
import okio.Timeout;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/connection/ConnectPlan;", "Lokhttp3/internal/connection/RoutePlanner$Plan;", "Lokhttp3/internal/http/ExchangeCodec$Carrier;", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ConnectPlan implements RoutePlanner.Plan, ExchangeCodec.Carrier {
    public static final /* synthetic */ int B = 0;
    public RealConnection A;
    public final TaskRunner d;
    public final RealConnectionPool e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final boolean k;
    public final ConnectionUser l;
    public final RealRoutePlanner m;
    public final Route n;
    public final List o;
    public final int p;
    public final Request q;
    public final int r;
    public final boolean s;
    public volatile boolean t;
    public Socket u;
    public Socket v;
    public Handshake w;
    public Protocol x;
    public RealBufferedSource y;
    public RealBufferedSink z;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lokhttp3/internal/connection/ConnectPlan$Companion;", "", "<init>", "()V", "NPE_THROW_WITH_NULL", "", "MAX_TUNNEL_ATTEMPTS", "", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26711a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Proxy.Type.HTTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f26711a = iArr;
        }
    }

    static {
        new Companion(0);
    }

    public ConnectPlan(TaskRunner taskRunner, RealConnectionPool connectionPool, int i, int i2, int i3, int i4, int i5, boolean z, ConnectionUser user, RealRoutePlanner realRoutePlanner, Route route, List list, int i6, Request request, int i7, boolean z2) {
        Intrinsics.h(taskRunner, "taskRunner");
        Intrinsics.h(connectionPool, "connectionPool");
        Intrinsics.h(user, "user");
        Intrinsics.h(route, "route");
        this.d = taskRunner;
        this.e = connectionPool;
        this.f = i;
        this.g = i2;
        this.h = i3;
        this.i = i4;
        this.j = i5;
        this.k = z;
        this.l = user;
        this.m = realRoutePlanner;
        this.n = route;
        this.o = list;
        this.p = i6;
        this.q = request;
        this.r = i7;
        this.s = z2;
    }

    public static ConnectPlan k(ConnectPlan connectPlan, int i, Request request, int i2, boolean z, int i3) {
        return new ConnectPlan(connectPlan.d, connectPlan.e, connectPlan.f, connectPlan.g, connectPlan.h, connectPlan.i, connectPlan.j, connectPlan.k, connectPlan.l, connectPlan.m, connectPlan.n, connectPlan.o, (i3 & 1) != 0 ? connectPlan.p : i, (i3 & 2) != 0 ? connectPlan.q : request, (i3 & 4) != 0 ? connectPlan.r : i2, (i3 & 8) != 0 ? connectPlan.s : z);
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    /* renamed from: a, reason: from getter */
    public final Route getN() {
        return this.n;
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    /* renamed from: b */
    public final RealConnection getD() {
        this.l.u(this.n);
        RealConnection realConnection = this.A;
        Intrinsics.e(realConnection);
        this.l.m(realConnection, this.n);
        ReusePlan reusePlanH = this.m.h(this, this.o);
        if (reusePlanH != null) {
            return reusePlanH.d;
        }
        synchronized (realConnection) {
            RealConnectionPool realConnectionPool = this.e;
            realConnectionPool.getClass();
            TimeZone timeZone = _UtilJvmKt.f26699a;
            realConnectionPool.g.add(realConnection);
            realConnectionPool.e.c(realConnectionPool.f, 0L);
            this.l.e(realConnection);
        }
        this.l.k(realConnection);
        this.l.a(realConnection);
        return realConnection;
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public final void c() {
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan, okhttp3.internal.http.ExchangeCodec.Carrier
    public final void cancel() throws IOException {
        this.t = true;
        Socket socket = this.u;
        if (socket != null) {
            _UtilJvmKt.c(socket);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0139 A[Catch: all -> 0x002d, TryCatch #10 {all -> 0x002d, blocks: (B:7:0x001c, B:9:0x0020, B:11:0x0028, B:23:0x0042, B:26:0x004b, B:28:0x004f, B:30:0x0057, B:32:0x005b, B:34:0x0063, B:35:0x0089, B:51:0x00c1, B:53:0x00c4, B:55:0x00c7, B:57:0x00d6, B:59:0x00e0, B:62:0x00e6, B:64:0x00ef, B:94:0x0132, B:96:0x0139, B:99:0x0140, B:82:0x011e, B:83:0x0121, B:86:0x0125, B:87:0x0129, B:39:0x009e, B:40:0x00a1, B:41:0x00a2, B:42:0x00a9, B:43:0x00aa, B:44:0x00ad, B:45:0x00ae, B:49:0x00bd, B:48:0x00bb), top: B:133:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x013f  */
    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final okhttp3.internal.connection.RoutePlanner.ConnectResult d() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.ConnectPlan.d():okhttp3.internal.connection.RoutePlanner$ConnectResult");
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    public final RoutePlanner.ConnectResult e() throws IOException {
        Socket socket;
        Socket socket2;
        Route route = this.n;
        if (this.u != null) {
            throw new IllegalStateException("TCP already connected");
        }
        ConnectionUser connectionUser = this.l;
        connectionUser.w(this);
        boolean z = false;
        try {
            try {
                connectionUser.v(route);
                h();
                z = true;
                RoutePlanner.ConnectResult connectResult = new RoutePlanner.ConnectResult(this, null, null, 6);
                connectionUser.q(this);
                return connectResult;
            } catch (IOException e) {
                route.f26694a.getClass();
                if (route.b.type() != Proxy.Type.DIRECT) {
                    Address address = route.f26694a;
                    address.g.connectFailed(address.h.l(), route.b.address(), e);
                }
                connectionUser.r(route, e);
                RoutePlanner.ConnectResult connectResult2 = new RoutePlanner.ConnectResult(this, null, e, 2);
                connectionUser.q(this);
                if (!z && (socket2 = this.u) != null) {
                    _UtilJvmKt.c(socket2);
                }
                return connectResult2;
            }
        } catch (Throwable th) {
            connectionUser.q(this);
            if (!z && (socket = this.u) != null) {
                _UtilJvmKt.c(socket);
            }
            throw th;
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public final void f(RealCall realCall, IOException iOException) {
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    public final RoutePlanner.Plan g() {
        return new ConnectPlan(this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s);
    }

    public final void h() throws IOException {
        Socket socketCreateSocket;
        Proxy.Type type = this.n.b.type();
        int i = type == null ? -1 : WhenMappings.f26711a[type.ordinal()];
        if (i == 1 || i == 2) {
            socketCreateSocket = this.n.f26694a.b.createSocket();
            Intrinsics.e(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(this.n.b);
        }
        this.u = socketCreateSocket;
        if (this.t) {
            throw new IOException("canceled");
        }
        socketCreateSocket.setSoTimeout(this.i);
        try {
            Platform.f26752a.getClass();
            Platform.b.d(socketCreateSocket, this.n.c, this.h);
            try {
                this.y = Okio.c(Okio.f(socketCreateSocket));
                this.z = Okio.b(Okio.e(socketCreateSocket));
            } catch (NullPointerException e) {
                if (Intrinsics.c(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.n.c);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    public final void i(SSLSocket sSLSocket, ConnectionSpec connectionSpec) throws IOException {
        Protocol protocolA;
        final Address address = this.n.f26694a;
        try {
            if (connectionSpec.b) {
                Platform.f26752a.getClass();
                Platform.b.c(sSLSocket, address.h.d, address.i);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            Handshake.Companion companion = Handshake.e;
            Intrinsics.e(session);
            companion.getClass();
            final Handshake handshakeA = Handshake.Companion.a(session);
            HostnameVerifier hostnameVerifier = address.d;
            Intrinsics.e(hostnameVerifier);
            if (hostnameVerifier.verify(address.h.d, session)) {
                final CertificatePinner certificatePinner = address.e;
                Intrinsics.e(certificatePinner);
                this.w = new Handshake(handshakeA.f26681a, handshakeA.b, handshakeA.c, new Function0() { // from class: okhttp3.internal.connection.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i = ConnectPlan.B;
                        CertificateChainCleaner certificateChainCleaner = certificatePinner.b;
                        Intrinsics.e(certificateChainCleaner);
                        return certificateChainCleaner.a(address.h.d, handshakeA.a());
                    }
                });
                String hostname = address.h.d;
                Intrinsics.h(hostname, "hostname");
                Iterator it = certificatePinner.f26666a.iterator();
                String strE = null;
                if (it.hasNext()) {
                    ((CertificatePinner.Pin) it.next()).getClass();
                    CertificatePinner.Pin.a(hostname);
                    throw null;
                }
                if (connectionSpec.b) {
                    Platform.f26752a.getClass();
                    strE = Platform.b.e(sSLSocket);
                }
                this.v = sSLSocket;
                this.y = Okio.c(Okio.f(sSLSocket));
                this.z = Okio.b(Okio.e(sSLSocket));
                if (strE != null) {
                    Protocol.e.getClass();
                    protocolA = Protocol.Companion.a(strE);
                } else {
                    protocolA = Protocol.g;
                }
                this.x = protocolA;
                Platform.f26752a.getClass();
                Platform.b.getClass();
                return;
            }
            List listA = handshakeA.a();
            if (listA.isEmpty()) {
                throw new SSLPeerUnverifiedException("Hostname " + address.h.d + " not verified (no certificates)");
            }
            Object obj = listA.get(0);
            Intrinsics.f(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) obj;
            StringBuilder sb = new StringBuilder("\n            |Hostname ");
            sb.append(address.h.d);
            sb.append(" not verified:\n            |    certificate: ");
            CertificatePinner.c.getClass();
            ByteString byteString = ByteString.g;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            Intrinsics.g(encoded, "getEncoded(...)");
            sb.append("sha256/".concat(Base64.b(ByteString.Companion.d(encoded).b("SHA-256").data, Base64.f26779a)));
            sb.append("\n            |    DN: ");
            sb.append(x509Certificate.getSubjectDN().getName());
            sb.append("\n            |    subjectAltNames: ");
            OkHostnameVerifier.f26767a.getClass();
            sb.append(CollectionsKt.c0(OkHostnameVerifier.a(x509Certificate, 2), OkHostnameVerifier.a(x509Certificate, 7)));
            sb.append("\n            ");
            throw new SSLPeerUnverifiedException(StringsKt.n0(sb.toString()));
        } catch (Throwable th) {
            Platform.f26752a.getClass();
            Platform.b.getClass();
            _UtilJvmKt.c(sSLSocket);
            throw th;
        }
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    public final boolean isReady() {
        return this.x != null;
    }

    public final RoutePlanner.ConnectResult j() throws IOException {
        Request request;
        Request request2 = this.q;
        Intrinsics.e(request2);
        Route route = this.n;
        String str = "CONNECT " + _UtilJvmKt.i(route.f26694a.h, true) + " HTTP/1.1";
        while (true) {
            RealBufferedSource realBufferedSource = this.y;
            if (realBufferedSource == null) {
                Intrinsics.p("source");
                throw null;
            }
            RealBufferedSink realBufferedSink = this.z;
            if (realBufferedSink == null) {
                Intrinsics.p("sink");
                throw null;
            }
            Http1ExchangeCodec http1ExchangeCodec = new Http1ExchangeCodec(null, this, realBufferedSource, realBufferedSink);
            RealBufferedSource realBufferedSource2 = this.y;
            if (realBufferedSource2 == null) {
                Intrinsics.p("source");
                throw null;
            }
            Timeout e = realBufferedSource2.d.getE();
            long j = this.f;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            e.h(j, timeUnit);
            RealBufferedSink realBufferedSink2 = this.z;
            if (realBufferedSink2 == null) {
                Intrinsics.p("sink");
                throw null;
            }
            realBufferedSink2.d.getE().h(this.g, timeUnit);
            http1ExchangeCodec.l(request2.c, str);
            http1ExchangeCodec.d();
            Response.Builder builderH = http1ExchangeCodec.h(false);
            Intrinsics.e(builderH);
            builderH.f26693a = request2;
            Response responseA = builderH.a();
            int i = responseA.g;
            http1ExchangeCodec.k(responseA);
            if (i == 200) {
                request = null;
                break;
            }
            if (i != 407) {
                throw new IOException(YU.a.d(i, "Unexpected response code for CONNECT: "));
            }
            Request requestA = route.f26694a.f.a(route, responseA);
            if (requestA == null) {
                throw new IOException("Failed to authenticate with proxy");
            }
            if ("close".equalsIgnoreCase(Response.b("Connection", responseA))) {
                request = requestA;
                break;
            }
            request2 = requestA;
        }
        if (request == null) {
            return new RoutePlanner.ConnectResult(this, null, null, 6);
        }
        Socket socket = this.u;
        if (socket != null) {
            _UtilJvmKt.c(socket);
        }
        int i2 = this.p + 1;
        ConnectionUser connectionUser = this.l;
        if (i2 < 21) {
            connectionUser.b(route, null);
            return new RoutePlanner.ConnectResult(this, k(this, i2, request, 0, false, 12), null, 4);
        }
        ProtocolException protocolException = new ProtocolException("Too many tunnel connections attempted: 21");
        connectionUser.r(route, protocolException);
        return new RoutePlanner.ConnectResult(this, null, protocolException, 2);
    }

    public final ConnectPlan l(List connectionSpecs, SSLSocket sSLSocket) {
        String[] strArr;
        Intrinsics.h(connectionSpecs, "connectionSpecs");
        int i = this.r;
        int size = connectionSpecs.size();
        for (int i2 = i + 1; i2 < size; i2++) {
            ConnectionSpec connectionSpec = (ConnectionSpec) connectionSpecs.get(i2);
            connectionSpec.getClass();
            if (connectionSpec.f26671a && ((strArr = connectionSpec.d) == null || _UtilCommonKt.h(strArr, sSLSocket.getEnabledProtocols(), NaturalOrderComparator.d))) {
                String[] strArr2 = connectionSpec.c;
                if (strArr2 != null) {
                    String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
                    CipherSuite.b.getClass();
                    if (!_UtilCommonKt.h(strArr2, enabledCipherSuites, CipherSuite.c)) {
                    }
                }
                return k(this, 0, null, i2, i != -1, 3);
            }
        }
        return null;
    }

    public final ConnectPlan m(List connectionSpecs, SSLSocket sSLSocket) throws UnknownServiceException {
        Intrinsics.h(connectionSpecs, "connectionSpecs");
        if (this.r != -1) {
            return this;
        }
        ConnectPlan connectPlanL = l(connectionSpecs, sSLSocket);
        if (connectPlanL != null) {
            return connectPlanL;
        }
        StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb.append(this.s);
        sb.append(", modes=");
        sb.append(connectionSpecs);
        sb.append(", supported protocols=");
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        Intrinsics.e(enabledProtocols);
        String string = Arrays.toString(enabledProtocols);
        Intrinsics.g(string, "toString(...)");
        sb.append(string);
        throw new UnknownServiceException(sb.toString());
    }
}
