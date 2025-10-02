package okhttp3;

import com.apollographql.apollo.network.ws.DefaultWebSocketEngine$open$webSocket$1;
import com.dynatrace.android.callback.OkCallback;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.llqqqql;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Call;
import okhttp3.WebSocket;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RouteDatabase;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.proxy.NullProxySelector;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.OkHostnameVerifier;
import okhttp3.internal.ws.RealWebSocket;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lokhttp3/OkHttpClient;", "Lokhttp3/Call$Factory;", "Lokhttp3/WebSocket$Factory;", "<init>", "()V", "Builder", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public class OkHttpClient implements Call.Factory, WebSocket.Factory {
    public static final Companion F = new Companion(0);
    public static final List G = _UtilJvmKt.k(new Protocol[]{Protocol.i, Protocol.g});
    public static final List H = _UtilJvmKt.k(new ConnectionSpec[]{ConnectionSpec.g, ConnectionSpec.h});
    public final int A;
    public final long B;
    public final RouteDatabase C;
    public final TaskRunner D;
    public final ConnectionPool E;

    /* renamed from: a, reason: collision with root package name */
    public final Dispatcher f26688a;
    public final List b;
    public final List c;
    public final androidx.compose.runtime.snapshots.a d;
    public final boolean e;
    public final boolean f;
    public final Authenticator g;
    public final boolean h;
    public final boolean i;
    public final CookieJar j;
    public final Cache k;
    public final Dns l;
    public final ProxySelector m;
    public final Authenticator n;
    public final SocketFactory o;
    public final SSLSocketFactory p;
    public final X509TrustManager q;
    public final List r;
    public final List s;
    public final HostnameVerifier t;
    public final CertificatePinner u;
    public final CertificateChainCleaner v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/OkHttpClient$Builder;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Builder {
        public int A;
        public int B;
        public long C;
        public RouteDatabase D;
        public TaskRunner E;
        public ConnectionPool b;
        public androidx.compose.runtime.snapshots.a e;
        public boolean f;
        public boolean g;
        public Authenticator h;
        public boolean i;
        public boolean j;
        public CookieJar k;
        public Cache l;
        public Dns m;
        public ProxySelector n;
        public Authenticator o;
        public SocketFactory p;
        public SSLSocketFactory q;
        public X509TrustManager r;
        public List s;
        public List t;
        public HostnameVerifier u;
        public CertificatePinner v;
        public CertificateChainCleaner w;
        public int x;
        public int y;
        public int z;

        /* renamed from: a, reason: collision with root package name */
        public Dispatcher f26689a = new Dispatcher();
        public final ArrayList c = new ArrayList();
        public final ArrayList d = new ArrayList();

        public Builder() {
            EventListener$Companion$NONE$1 eventListener$Companion$NONE$1 = EventListener.f26679a;
            TimeZone timeZone = _UtilJvmKt.f26699a;
            Intrinsics.h(eventListener$Companion$NONE$1, "<this>");
            this.e = new androidx.compose.runtime.snapshots.a(eventListener$Companion$NONE$1, 13);
            this.f = true;
            this.g = true;
            Authenticator authenticator = Authenticator.f26660a;
            this.h = authenticator;
            this.i = true;
            this.j = true;
            this.k = CookieJar.f26674a;
            this.m = Dns.f26677a;
            this.o = authenticator;
            SocketFactory socketFactory = SocketFactory.getDefault();
            Intrinsics.g(socketFactory, "getDefault(...)");
            this.p = socketFactory;
            OkHttpClient.F.getClass();
            this.s = OkHttpClient.H;
            this.t = OkHttpClient.G;
            this.u = OkHostnameVerifier.f26767a;
            this.v = CertificatePinner.d;
            this.y = ModuleDescriptor.MODULE_VERSION;
            this.z = ModuleDescriptor.MODULE_VERSION;
            this.A = ModuleDescriptor.MODULE_VERSION;
            this.B = 60000;
            this.C = llqqqql.c00630063c0063c0063;
        }

        public final void a(Interceptor interceptor) {
            Intrinsics.h(interceptor, "interceptor");
            this.c.add(interceptor);
        }

        public final void b(Duration duration) {
            long millis = duration.toMillis();
            TimeUnit unit = TimeUnit.MILLISECONDS;
            Intrinsics.h(unit, "unit");
            this.x = _UtilJvmKt.b(millis, unit);
        }

        public final void c(long j, TimeUnit unit) {
            Intrinsics.h(unit, "unit");
            this.y = _UtilJvmKt.b(j, unit);
        }

        public final void d(long j, TimeUnit unit) {
            Intrinsics.h(unit, "unit");
            this.z = _UtilJvmKt.b(j, unit);
        }

        public final void e(long j, TimeUnit unit) {
            Intrinsics.h(unit, "unit");
            this.A = _UtilJvmKt.b(j, unit);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/OkHttpClient$Companion;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }

    public OkHttpClient(Builder builder) throws NoSuchAlgorithmException, KeyStoreException, KeyManagementException {
        OkCallback.a(builder);
        this.f26688a = builder.f26689a;
        this.b = _UtilJvmKt.j(builder.c);
        this.c = _UtilJvmKt.j(builder.d);
        this.d = builder.e;
        boolean z = builder.f;
        this.e = z;
        boolean z2 = builder.g;
        this.f = z2;
        this.g = builder.h;
        this.h = builder.i;
        this.i = builder.j;
        this.j = builder.k;
        this.k = builder.l;
        this.l = builder.m;
        ProxySelector proxySelector = builder.n;
        if (proxySelector == null && (proxySelector = ProxySelector.getDefault()) == null) {
            proxySelector = NullProxySelector.f26761a;
        }
        this.m = proxySelector;
        this.n = builder.o;
        this.o = builder.p;
        List list = builder.s;
        this.r = list;
        this.s = builder.t;
        this.t = builder.u;
        this.w = builder.x;
        int i = builder.y;
        this.x = i;
        int i2 = builder.z;
        this.y = i2;
        int i3 = builder.A;
        this.z = i3;
        this.A = builder.B;
        this.B = builder.C;
        RouteDatabase routeDatabase = builder.D;
        RouteDatabase routeDatabase2 = routeDatabase == null ? new RouteDatabase() : routeDatabase;
        this.C = routeDatabase2;
        TaskRunner taskRunner = builder.E;
        this.D = taskRunner == null ? TaskRunner.o : taskRunner;
        ConnectionPool connectionPool = builder.b;
        if (connectionPool == null) {
            connectionPool = new ConnectionPool(null, null, i2, i3, i, i2, z, z2, routeDatabase2, 31);
            builder.b = connectionPool;
        }
        this.E = connectionPool;
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            this.p = null;
            this.v = null;
            this.q = null;
            this.u = CertificatePinner.d;
        } else {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((ConnectionSpec) it.next()).f26671a) {
                    SSLSocketFactory sSLSocketFactory = builder.q;
                    if (sSLSocketFactory == null) {
                        Platform.Companion companion = Platform.f26752a;
                        companion.getClass();
                        Platform.b.getClass();
                        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                        trustManagerFactory.init((KeyStore) null);
                        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                        Intrinsics.e(trustManagers);
                        if (trustManagers.length == 1) {
                            TrustManager trustManager = trustManagers[0];
                            if (trustManager instanceof X509TrustManager) {
                                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                                this.q = x509TrustManager;
                                Platform platform = Platform.b;
                                platform.getClass();
                                try {
                                    SSLContext sSLContextJ = platform.j();
                                    sSLContextJ.init(null, new TrustManager[]{x509TrustManager}, null);
                                    SSLSocketFactory socketFactory = sSLContextJ.getSocketFactory();
                                    Intrinsics.g(socketFactory, "getSocketFactory(...)");
                                    this.p = socketFactory;
                                    CertificateChainCleaner.f26766a.getClass();
                                    companion.getClass();
                                    CertificateChainCleaner certificateChainCleanerA = Platform.b.a(x509TrustManager);
                                    this.v = certificateChainCleanerA;
                                    CertificatePinner certificatePinner = builder.v;
                                    certificatePinner.getClass();
                                    this.u = Intrinsics.c(certificatePinner.b, certificateChainCleanerA) ? certificatePinner : new CertificatePinner(certificatePinner.f26666a, certificateChainCleanerA);
                                } catch (GeneralSecurityException e) {
                                    throw new AssertionError("No System TLS: " + e, e);
                                }
                            }
                        }
                        String string = Arrays.toString(trustManagers);
                        Intrinsics.g(string, "toString(...)");
                        throw new IllegalStateException("Unexpected default trust managers: ".concat(string).toString());
                    }
                    this.p = sSLSocketFactory;
                    CertificateChainCleaner certificateChainCleaner = builder.w;
                    Intrinsics.e(certificateChainCleaner);
                    this.v = certificateChainCleaner;
                    X509TrustManager x509TrustManager2 = builder.r;
                    Intrinsics.e(x509TrustManager2);
                    this.q = x509TrustManager2;
                    CertificatePinner certificatePinner2 = builder.v;
                    certificatePinner2.getClass();
                    this.u = Intrinsics.c(certificatePinner2.b, certificateChainCleaner) ? certificatePinner2 : new CertificatePinner(certificatePinner2.f26666a, certificateChainCleaner);
                }
            }
            this.p = null;
            this.v = null;
            this.q = null;
            this.u = CertificatePinner.d;
        }
        X509TrustManager x509TrustManager3 = this.q;
        CertificateChainCleaner certificateChainCleaner2 = this.v;
        SSLSocketFactory sSLSocketFactory2 = this.p;
        List list3 = this.c;
        List list4 = this.b;
        Intrinsics.f(list4, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list4.contains(null)) {
            throw new IllegalStateException(("Null interceptor: " + list4).toString());
        }
        Intrinsics.f(list3, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list3.contains(null)) {
            throw new IllegalStateException(("Null network interceptor: " + list3).toString());
        }
        List list5 = this.r;
        if (!(list5 instanceof Collection) || !list5.isEmpty()) {
            Iterator it2 = list5.iterator();
            while (it2.hasNext()) {
                if (((ConnectionSpec) it2.next()).f26671a) {
                    if (sSLSocketFactory2 == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (certificateChainCleaner2 == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (x509TrustManager3 == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (sSLSocketFactory2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (certificateChainCleaner2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (x509TrustManager3 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!Intrinsics.c(this.u, CertificatePinner.d)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    @Override // okhttp3.Call.Factory
    public final RealCall a(Request request) {
        Intrinsics.h(request, "request");
        return new RealCall(this, request, false);
    }

    @Override // okhttp3.WebSocket.Factory
    public final RealWebSocket b(Request request, DefaultWebSocketEngine$open$webSocket$1 defaultWebSocketEngine$open$webSocket$1) {
        RealWebSocket realWebSocket = new RealWebSocket(this.D, request, defaultWebSocketEngine$open$webSocket$1, new Random(), 0, this.B, this.A);
        realWebSocket.j(this);
        return realWebSocket;
    }

    public final Builder c() {
        Builder builder = new Builder();
        builder.f26689a = this.f26688a;
        builder.b = this.E;
        CollectionsKt.h(this.b, builder.c);
        CollectionsKt.h(this.c, builder.d);
        builder.e = this.d;
        builder.f = this.e;
        builder.g = this.f;
        builder.h = this.g;
        builder.i = this.h;
        builder.j = this.i;
        builder.k = this.j;
        builder.l = this.k;
        builder.m = this.l;
        builder.n = this.m;
        builder.o = this.n;
        builder.p = this.o;
        builder.q = this.p;
        builder.r = this.q;
        builder.s = this.r;
        builder.t = this.s;
        builder.u = this.t;
        builder.v = this.u;
        builder.w = this.v;
        builder.x = this.w;
        builder.y = this.x;
        builder.z = this.y;
        builder.A = this.z;
        builder.B = this.A;
        builder.C = this.B;
        builder.D = this.C;
        builder.E = this.D;
        return builder;
    }

    public OkHttpClient() {
        this(new Builder());
    }
}
