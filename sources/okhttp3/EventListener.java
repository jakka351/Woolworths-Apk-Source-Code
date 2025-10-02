package okhttp3;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.connection.RealCall;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lokhttp3/EventListener;", "", "<init>", "()V", "Factory", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class EventListener {

    /* renamed from: a, reason: collision with root package name */
    public static final EventListener$Companion$NONE$1 f26679a;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lokhttp3/EventListener$Companion;", "", "<init>", "()V", "NONE", "Lokhttp3/EventListener;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lokhttp3/EventListener$Factory;", "", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Factory {
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [okhttp3.EventListener$Companion$NONE$1] */
    static {
        new Companion(0);
        f26679a = new EventListener() { // from class: okhttp3.EventListener$Companion$NONE$1
        };
    }

    public void A(Call call, Response response) {
        Intrinsics.h(call, "call");
    }

    public void B(Call call, Handshake handshake) {
    }

    public void C(Call call) {
    }

    public void a(Call call, Response cachedResponse) {
        Intrinsics.h(call, "call");
        Intrinsics.h(cachedResponse, "cachedResponse");
    }

    public void b(Call call, Response response) {
        Intrinsics.h(call, "call");
    }

    public void c(Call call) {
        Intrinsics.h(call, "call");
    }

    public void d(RealCall realCall) {
    }

    public void e(RealCall realCall, IOException iOException) {
    }

    public void f(RealCall realCall) {
    }

    public void g(RealCall realCall) {
    }

    public void h(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        Intrinsics.h(inetSocketAddress, "inetSocketAddress");
    }

    public void i(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, IOException iOException) {
        Intrinsics.h(inetSocketAddress, "inetSocketAddress");
    }

    public void j(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        Intrinsics.h(inetSocketAddress, "inetSocketAddress");
    }

    public void k(Call call, Connection connection) {
        Intrinsics.h(connection, "connection");
    }

    public void l(Call call, Connection connection) {
        Intrinsics.h(connection, "connection");
    }

    public void m(Call call, String str, List list) {
    }

    public void n(Call call, String str) {
    }

    public void o(Call call, HttpUrl url, List list) {
        Intrinsics.h(url, "url");
    }

    public void p(Call call, HttpUrl url) {
        Intrinsics.h(url, "url");
    }

    public void q(Call call, long j) {
    }

    public void r(Call call) {
    }

    public void s(Call call, IOException ioe) {
        Intrinsics.h(ioe, "ioe");
    }

    public void t(Call call, Request request) {
        Intrinsics.h(request, "request");
    }

    public void u(Call call) {
    }

    public void v(Call call, long j) {
    }

    public void w(Call call) {
    }

    public void x(Call call, IOException ioe) {
        Intrinsics.h(ioe, "ioe");
    }

    public void y(Call call, Response response) {
    }

    public void z(Call call) {
    }
}
