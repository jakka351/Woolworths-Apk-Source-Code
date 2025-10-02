package okhttp3.internal.connection;

import java.io.IOException;
import java.net.Socket;
import java.util.List;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Connection;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.Protocol;
import okhttp3.Route;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.http.RealInterceptorChain;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/connection/CallConnectionUser;", "Lokhttp3/internal/connection/ConnectionUser;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CallConnectionUser implements ConnectionUser {

    /* renamed from: a, reason: collision with root package name */
    public final RealCall f26709a;
    public final ConnectionListener b;
    public final RealInterceptorChain c;

    public CallConnectionUser(RealCall realCall, ConnectionListener connectionListener, RealInterceptorChain realInterceptorChain) {
        this.f26709a = realCall;
        this.b = connectionListener;
        this.c = realInterceptorChain;
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void a(RealConnection connection) {
        Intrinsics.h(connection, "connection");
        connection.o.getClass();
        RealCall call = this.f26709a;
        Intrinsics.h(call, "call");
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void b(Route route, Protocol protocol) {
        Intrinsics.h(route, "route");
        RealCall realCall = this.f26709a;
        realCall.h.h(realCall, route.c, route.b, protocol);
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void c(HttpUrl url) {
        Intrinsics.h(url, "url");
        RealCall realCall = this.f26709a;
        realCall.h.p(realCall, url);
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void d(HttpUrl url, List list) {
        Intrinsics.h(url, "url");
        RealCall realCall = this.f26709a;
        realCall.h.o(realCall, url, list);
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void e(RealConnection connection) {
        Intrinsics.h(connection, "connection");
        TimeZone timeZone = _UtilJvmKt.f26699a;
        RealCall realCall = this.f26709a;
        if (realCall.m != null) {
            throw new IllegalStateException("Check failed.");
        }
        realCall.m = connection;
        connection.w.add(new RealCall.CallReference(realCall, realCall.k));
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void f(RealConnection realConnection) {
        realConnection.o.getClass();
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final boolean g() {
        return !Intrinsics.c(this.c.e.b, "GET");
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void h() {
        RealCall realCall = this.f26709a;
        realCall.h.C(realCall);
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final RealConnection i() {
        return this.f26709a.m;
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final boolean isCanceled() {
        return this.f26709a.s;
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void j(RealConnection realConnection) {
        RealCall realCall = this.f26709a;
        realCall.h.l(realCall, realConnection);
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void k(Connection connection) {
        Intrinsics.h(connection, "connection");
        RealCall realCall = this.f26709a;
        realCall.h.k(realCall, connection);
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void l(String str, List list) {
        RealCall realCall = this.f26709a;
        realCall.h.m(realCall, str, list);
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void m(Connection connection, Route route) {
        Intrinsics.h(connection, "connection");
        Intrinsics.h(route, "route");
        this.b.getClass();
        RealCall call = this.f26709a;
        Intrinsics.h(call, "call");
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void n(String str) {
        RealCall realCall = this.f26709a;
        realCall.h.n(realCall, str);
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void o(RealConnection realConnection) {
        realConnection.o.getClass();
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void p(Handshake handshake) {
        RealCall realCall = this.f26709a;
        realCall.h.B(realCall, handshake);
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void q(ConnectPlan connectPlan) {
        this.f26709a.u.remove(connectPlan);
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void r(Route route, IOException iOException) {
        Intrinsics.h(route, "route");
        RealCall realCall = this.f26709a;
        realCall.h.i(realCall, route.c, route.b, iOException);
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final Socket s() {
        return this.f26709a.g();
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void t(RealConnection realConnection) {
        realConnection.o.getClass();
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void u(Route route) {
        Intrinsics.h(route, "route");
        RouteDatabase routeDatabase = this.f26709a.d.C;
        synchronized (routeDatabase) {
            routeDatabase.f26719a.remove(route);
        }
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void v(Route route) {
        Intrinsics.h(route, "route");
        RealCall realCall = this.f26709a;
        realCall.h.j(realCall, route.c, route.b);
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void w(ConnectPlan connectPlan) {
        this.f26709a.u.add(connectPlan);
    }
}
