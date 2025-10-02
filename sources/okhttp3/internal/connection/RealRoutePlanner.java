package okhttp3.internal.connection;

import java.io.IOException;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import okhttp3.Address;
import okhttp3.ConnectionSpec;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal._HeadersCommonKt;
import okhttp3.internal._HostnamesCommonKt;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RoutePlanner;
import okhttp3.internal.connection.RouteSelector;
import okhttp3.internal.platform.Platform;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/connection/RealRoutePlanner;", "Lokhttp3/internal/connection/RoutePlanner;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class RealRoutePlanner implements RoutePlanner {

    /* renamed from: a, reason: collision with root package name */
    public final TaskRunner f26718a;
    public final RealConnectionPool b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final boolean h;
    public final boolean i;
    public final Address j;
    public final RouteDatabase k;
    public final ConnectionUser l;
    public RouteSelector.Selection m;
    public RouteSelector n;
    public Route o;
    public final ArrayDeque p;

    public RealRoutePlanner(TaskRunner taskRunner, RealConnectionPool connectionPool, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, Address address, RouteDatabase routeDatabase, ConnectionUser connectionUser) {
        Intrinsics.h(taskRunner, "taskRunner");
        Intrinsics.h(connectionPool, "connectionPool");
        Intrinsics.h(address, "address");
        Intrinsics.h(routeDatabase, "routeDatabase");
        Intrinsics.h(connectionUser, "connectionUser");
        this.f26718a = taskRunner;
        this.b = connectionPool;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = z;
        this.i = z2;
        this.j = address;
        this.k = routeDatabase;
        this.l = connectionUser;
        this.p = new ArrayDeque();
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public final boolean a(RealConnection realConnection) {
        RouteSelector routeSelector;
        Route route;
        if (this.p.isEmpty() && this.o == null) {
            if (realConnection != null) {
                synchronized (realConnection) {
                    route = null;
                    if (realConnection.s == 0 && realConnection.q && _UtilJvmKt.a(realConnection.g.f26694a.h, this.j.h)) {
                        route = realConnection.g;
                    }
                }
                if (route != null) {
                    this.o = route;
                    return true;
                }
            }
            RouteSelector.Selection selection = this.m;
            if ((selection == null || selection.b >= selection.f26722a.size()) && (routeSelector = this.n) != null) {
                return routeSelector.a();
            }
        }
        return true;
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    /* renamed from: b, reason: from getter */
    public final ArrayDeque getP() {
        return this.p;
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public final boolean c(HttpUrl url) {
        Intrinsics.h(url, "url");
        HttpUrl httpUrl = this.j.h;
        return url.e == httpUrl.e && Intrinsics.c(url.d, httpUrl.d);
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    /* renamed from: d, reason: from getter */
    public final Address getJ() {
        return this.j;
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public final RoutePlanner.Plan e() throws IOException {
        Socket socketS;
        boolean z;
        ReusePlan reusePlan;
        RealConnection realConnectionI = this.l.i();
        if (realConnectionI == null) {
            reusePlan = null;
        } else {
            boolean zH = realConnectionI.h(this.l.g());
            synchronized (realConnectionI) {
                try {
                    if (!zH) {
                        z = !realConnectionI.q;
                        realConnectionI.q = true;
                        socketS = this.l.s();
                    } else if (realConnectionI.q || !c(realConnectionI.g.f26694a.h)) {
                        socketS = this.l.s();
                        z = false;
                    } else {
                        z = false;
                        socketS = null;
                    }
                } finally {
                }
            }
            if (this.l.i() == null) {
                if (socketS != null) {
                    _UtilJvmKt.c(socketS);
                }
                this.l.j(realConnectionI);
                this.l.f(realConnectionI);
                if (socketS != null) {
                    this.l.t(realConnectionI);
                } else if (z) {
                    this.l.o(realConnectionI);
                }
                reusePlan = null;
            } else {
                if (socketS != null) {
                    throw new IllegalStateException("Check failed.");
                }
                reusePlan = new ReusePlan(realConnectionI);
            }
        }
        if (reusePlan != null) {
            return reusePlan;
        }
        ReusePlan reusePlanH = h(null, null);
        if (reusePlanH != null) {
            return reusePlanH;
        }
        if (!this.p.isEmpty()) {
            return (RoutePlanner.Plan) this.p.removeFirst();
        }
        ConnectPlan connectPlanF = f();
        ReusePlan reusePlanH2 = h(connectPlanF, connectPlanF.o);
        return reusePlanH2 != null ? reusePlanH2 : connectPlanF;
    }

    /* JADX WARN: Type inference failed for: r2v29, types: [java.lang.Object, java.util.List] */
    public final ConnectPlan f() throws IOException {
        String hostAddress;
        int port;
        List listQ;
        boolean zContains;
        Route route = this.o;
        if (route != null) {
            this.o = null;
            return g(route, null);
        }
        RouteSelector.Selection selection = this.m;
        if (selection != null && selection.b < selection.f26722a.size()) {
            int i = selection.b;
            ArrayList arrayList = selection.f26722a;
            if (i >= arrayList.size()) {
                throw new NoSuchElementException();
            }
            int i2 = selection.b;
            selection.b = i2 + 1;
            return g((Route) arrayList.get(i2), null);
        }
        RouteSelector routeSelector = this.n;
        if (routeSelector == null) {
            routeSelector = new RouteSelector(this.j, this.k, this.l, this.i);
            this.n = routeSelector;
        }
        if (!routeSelector.a()) {
            throw new IOException("exhausted all routes");
        }
        if (!routeSelector.a()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList2 = new ArrayList();
        while (routeSelector.f < routeSelector.e.size()) {
            Address address = routeSelector.f26721a;
            if (routeSelector.f >= routeSelector.e.size()) {
                throw new SocketException("No route to " + address.h.d + "; exhausted proxy configurations: " + routeSelector.e);
            }
            List list = routeSelector.e;
            int i3 = routeSelector.f;
            routeSelector.f = i3 + 1;
            Proxy proxy = (Proxy) list.get(i3);
            ConnectionUser connectionUser = routeSelector.c;
            ArrayList arrayList3 = new ArrayList();
            routeSelector.g = arrayList3;
            if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                HttpUrl httpUrl = address.h;
                hostAddress = httpUrl.d;
                port = httpUrl.e;
            } else {
                SocketAddress socketAddressAddress = proxy.address();
                if (!(socketAddressAddress instanceof InetSocketAddress)) {
                    throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass()).toString());
                }
                InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                RouteSelector.i.getClass();
                InetAddress address2 = inetSocketAddress.getAddress();
                if (address2 == null) {
                    hostAddress = inetSocketAddress.getHostName();
                    Intrinsics.g(hostAddress, "getHostName(...)");
                } else {
                    hostAddress = address2.getHostAddress();
                    Intrinsics.g(hostAddress, "getHostAddress(...)");
                }
                port = inetSocketAddress.getPort();
            }
            if (1 > port || port >= 65536) {
                throw new SocketException("No route to " + hostAddress + ':' + port + "; port is out of range");
            }
            if (proxy.type() == Proxy.Type.SOCKS) {
                arrayList3.add(InetSocketAddress.createUnresolved(hostAddress, port));
            } else {
                Regex regex = _HostnamesCommonKt.f26697a;
                Intrinsics.h(hostAddress, "<this>");
                if (_HostnamesCommonKt.f26697a.f(hostAddress)) {
                    listQ = CollectionsKt.Q(InetAddress.getByName(hostAddress));
                } else {
                    connectionUser.n(hostAddress);
                    List listA = address.f26659a.a(hostAddress);
                    if (listA.isEmpty()) {
                        throw new UnknownHostException(address.f26659a + " returned no addresses for " + hostAddress);
                    }
                    connectionUser.l(hostAddress, listA);
                    listQ = listA;
                }
                if (routeSelector.d && listQ.size() >= 2) {
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj : listQ) {
                        if (((InetAddress) obj) instanceof Inet6Address) {
                            arrayList4.add(obj);
                        } else {
                            arrayList5.add(obj);
                        }
                    }
                    if (!arrayList4.isEmpty() && !arrayList5.isEmpty()) {
                        byte[] bArr = _UtilCommonKt.f26698a;
                        Iterator it = arrayList4.iterator();
                        Iterator it2 = arrayList5.iterator();
                        ListBuilder listBuilderV = CollectionsKt.v();
                        while (true) {
                            if (!it.hasNext() && !it2.hasNext()) {
                                break;
                            }
                            if (it.hasNext()) {
                                listBuilderV.add(it.next());
                            }
                            if (it2.hasNext()) {
                                listBuilderV.add(it2.next());
                            }
                        }
                        listQ = CollectionsKt.q(listBuilderV);
                    }
                }
                Iterator it3 = listQ.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(new InetSocketAddress((InetAddress) it3.next(), port));
                }
            }
            Iterator it4 = routeSelector.g.iterator();
            while (it4.hasNext()) {
                Route route2 = new Route(routeSelector.f26721a, proxy, (InetSocketAddress) it4.next());
                RouteDatabase routeDatabase = routeSelector.b;
                synchronized (routeDatabase) {
                    zContains = routeDatabase.f26719a.contains(route2);
                }
                if (zContains) {
                    routeSelector.h.add(route2);
                } else {
                    arrayList2.add(route2);
                }
            }
            if (!arrayList2.isEmpty()) {
                break;
            }
        }
        if (arrayList2.isEmpty()) {
            CollectionsKt.h(routeSelector.h, arrayList2);
            routeSelector.h.clear();
        }
        RouteSelector.Selection selection2 = new RouteSelector.Selection(arrayList2);
        this.m = selection2;
        if (this.l.isCanceled()) {
            throw new IOException("Canceled");
        }
        if (selection2.b >= arrayList2.size()) {
            throw new NoSuchElementException();
        }
        int i4 = selection2.b;
        selection2.b = i4 + 1;
        return g((Route) arrayList2.get(i4), arrayList2);
    }

    public final ConnectPlan g(Route route, ArrayList arrayList) throws UnknownServiceException {
        Intrinsics.h(route, "route");
        Address address = route.f26694a;
        if (address.c == null) {
            if (!address.j.contains(ConnectionSpec.h)) {
                throw new UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
            String str = route.f26694a.h.d;
            Platform.f26752a.getClass();
            if (!Platform.b.g(str)) {
                throw new UnknownServiceException(YU.a.h("CLEARTEXT communication to ", str, " not permitted by network security policy"));
            }
        } else if (address.i.contains(Protocol.j)) {
            throw new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        Request request = null;
        if (route.b.type() == Proxy.Type.HTTP) {
            Address address2 = route.f26694a;
            if (address2.c != null || address2.i.contains(Protocol.j)) {
                Request.Builder builder = new Request.Builder();
                HttpUrl url = route.f26694a.h;
                Intrinsics.h(url, "url");
                builder.f26691a = url;
                builder.e("CONNECT", null);
                Address address3 = route.f26694a;
                builder.c("Host", _UtilJvmKt.i(address3.h, true));
                builder.c("Proxy-Connection", "Keep-Alive");
                builder.c("User-Agent", "okhttp/5.1.0");
                request = new Request(builder);
                Response.Builder builder2 = new Response.Builder();
                builder2.f26693a = request;
                builder2.b = Protocol.g;
                builder2.c = 407;
                builder2.d = "Preemptive Authenticate";
                builder2.k = -1L;
                builder2.l = -1L;
                Headers.Builder builder3 = builder2.f;
                builder3.getClass();
                _HeadersCommonKt.b("Proxy-Authenticate");
                _HeadersCommonKt.c("OkHttp-Preemptive", "Proxy-Authenticate");
                builder3.g("Proxy-Authenticate");
                _HeadersCommonKt.a(builder3, "Proxy-Authenticate", "OkHttp-Preemptive");
                Request requestA = address3.f.a(route, builder2.a());
                if (requestA != null) {
                    request = requestA;
                }
            }
        }
        return new ConnectPlan(this.f26718a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.l, this, route, arrayList, 0, request, -1, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0051 A[Catch: all -> 0x004f, TryCatch #1 {all -> 0x004f, blocks: (B:14:0x0044, B:22:0x0051, B:25:0x0058), top: B:53:0x0044 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final okhttp3.internal.connection.ReusePlan h(okhttp3.internal.connection.ConnectPlan r11, java.util.List r12) {
        /*
            r10 = this;
            okhttp3.internal.connection.RealConnectionPool r0 = r10.b
            okhttp3.internal.connection.ConnectionUser r1 = r10.l
            boolean r1 = r1.g()
            okhttp3.Address r2 = r10.j
            okhttp3.internal.connection.ConnectionUser r3 = r10.l
            r4 = 0
            r5 = 1
            if (r11 == 0) goto L18
            boolean r6 = r11.isReady()
            if (r6 == 0) goto L18
            r6 = r5
            goto L19
        L18:
            r6 = r4
        L19:
            r0.getClass()
            java.lang.String r7 = "address"
            kotlin.jvm.internal.Intrinsics.h(r2, r7)
            java.lang.String r7 = "connectionUser"
            kotlin.jvm.internal.Intrinsics.h(r3, r7)
            java.util.concurrent.ConcurrentLinkedQueue r0 = r0.g
            java.util.Iterator r0 = r0.iterator()
            java.lang.String r7 = "iterator(...)"
            kotlin.jvm.internal.Intrinsics.g(r0, r7)
        L31:
            boolean r7 = r0.hasNext()
            r8 = 0
            if (r7 == 0) goto L79
            java.lang.Object r7 = r0.next()
            okhttp3.internal.connection.RealConnection r7 = (okhttp3.internal.connection.RealConnection) r7
            kotlin.jvm.internal.Intrinsics.e(r7)
            monitor-enter(r7)
            if (r6 == 0) goto L51
            okhttp3.internal.http2.Http2Connection r9 = r7.p     // Catch: java.lang.Throwable -> L4f
            if (r9 == 0) goto L4a
            r9 = r5
            goto L4b
        L4a:
            r9 = r4
        L4b:
            if (r9 != 0) goto L51
        L4d:
            r9 = r4
            goto L5c
        L4f:
            r11 = move-exception
            goto L77
        L51:
            boolean r9 = r7.g(r2, r12)     // Catch: java.lang.Throwable -> L4f
            if (r9 != 0) goto L58
            goto L4d
        L58:
            r3.e(r7)     // Catch: java.lang.Throwable -> L4f
            r9 = r5
        L5c:
            monitor-exit(r7)
            if (r9 == 0) goto L31
            boolean r9 = r7.h(r1)
            if (r9 == 0) goto L66
            goto L7a
        L66:
            monitor-enter(r7)
            r7.q = r5     // Catch: java.lang.Throwable -> L74
            java.net.Socket r8 = r3.s()     // Catch: java.lang.Throwable -> L74
            monitor-exit(r7)
            if (r8 == 0) goto L31
            okhttp3.internal._UtilJvmKt.c(r8)
            goto L31
        L74:
            r11 = move-exception
            monitor-exit(r7)
            throw r11
        L77:
            monitor-exit(r7)
            throw r11
        L79:
            r7 = r8
        L7a:
            if (r7 != 0) goto L7d
            return r8
        L7d:
            if (r11 == 0) goto L8a
            okhttp3.Route r12 = r11.n
            r10.o = r12
            java.net.Socket r11 = r11.v
            if (r11 == 0) goto L8a
            okhttp3.internal._UtilJvmKt.c(r11)
        L8a:
            okhttp3.internal.connection.ConnectionUser r11 = r10.l
            r11.k(r7)
            okhttp3.internal.connection.ConnectionUser r11 = r10.l
            r11.a(r7)
            okhttp3.internal.connection.ReusePlan r11 = new okhttp3.internal.connection.ReusePlan
            r11.<init>(r7)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealRoutePlanner.h(okhttp3.internal.connection.ConnectPlan, java.util.List):okhttp3.internal.connection.ReusePlan");
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public final boolean isCanceled() {
        return this.l.isCanceled();
    }
}
