package okhttp3.internal.connection;

import java.io.IOException;
import java.net.Socket;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Connection;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.Protocol;
import okhttp3.Route;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/connection/PoolConnectionUser;", "Lokhttp3/internal/connection/ConnectionUser;", "<init>", "()V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PoolConnectionUser implements ConnectionUser {
    static {
        new PoolConnectionUser();
    }

    private PoolConnectionUser() {
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void a(RealConnection connection) {
        Intrinsics.h(connection, "connection");
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void b(Route route, Protocol protocol) {
        Intrinsics.h(route, "route");
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void c(HttpUrl url) {
        Intrinsics.h(url, "url");
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void d(HttpUrl url, List list) {
        Intrinsics.h(url, "url");
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void e(RealConnection connection) {
        Intrinsics.h(connection, "connection");
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void f(RealConnection realConnection) {
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final boolean g() {
        return false;
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void h() {
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final RealConnection i() {
        return null;
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final boolean isCanceled() {
        return false;
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void j(RealConnection realConnection) {
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void k(Connection connection) {
        Intrinsics.h(connection, "connection");
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void l(String str, List list) {
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void m(Connection connection, Route route) {
        Intrinsics.h(connection, "connection");
        Intrinsics.h(route, "route");
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void n(String str) {
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void o(RealConnection realConnection) {
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void p(Handshake handshake) {
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void q(ConnectPlan connectPlan) {
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void r(Route route, IOException iOException) {
        Intrinsics.h(route, "route");
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final Socket s() {
        return null;
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void t(RealConnection realConnection) {
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void u(Route route) {
        Intrinsics.h(route, "route");
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void v(Route route) {
        Intrinsics.h(route, "route");
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void w(ConnectPlan connectPlan) {
    }
}
