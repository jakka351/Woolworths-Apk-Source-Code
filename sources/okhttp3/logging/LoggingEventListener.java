package okhttp3.logging;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.connection.RealCall;
import okhttp3.logging.HttpLoggingInterceptor;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/logging/LoggingEventListener;", "Lokhttp3/EventListener;", "Factory", "Companion", "logging-interceptor"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class LoggingEventListener extends EventListener {
    public long b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/logging/LoggingEventListener$Companion;", "", "<init>", "()V", "logging-interceptor"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/logging/LoggingEventListener$Factory;", "Lokhttp3/EventListener$Factory;", "logging-interceptor"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static class Factory implements EventListener.Factory {
        public final HttpLoggingInterceptor.Logger d;

        @JvmOverloads
        public Factory() {
            HttpLoggingInterceptor.Logger logger = HttpLoggingInterceptor.Logger.f26775a;
            Intrinsics.h(logger, "logger");
            this.d = logger;
        }
    }

    static {
        new Companion(0);
    }

    @Override // okhttp3.EventListener
    public final void A(Call call, Response response) {
        Intrinsics.h(call, "call");
        D("satisfactionFailure: " + response);
    }

    @Override // okhttp3.EventListener
    public final void B(Call call, Handshake handshake) {
        D("secureConnectEnd: " + handshake);
    }

    @Override // okhttp3.EventListener
    public final void C(Call call) {
        D("secureConnectStart");
    }

    public final void D(String str) {
        long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.b);
        StringBuilder sb = new StringBuilder("[");
        sb.append(millis);
        sb.append(" ms] ");
        sb.append(str);
        throw null;
    }

    @Override // okhttp3.EventListener
    public final void a(Call call, Response cachedResponse) {
        Intrinsics.h(call, "call");
        Intrinsics.h(cachedResponse, "cachedResponse");
        D("cacheConditionalHit: " + cachedResponse);
    }

    @Override // okhttp3.EventListener
    public final void b(Call call, Response response) {
        Intrinsics.h(call, "call");
        D("cacheHit: " + response);
    }

    @Override // okhttp3.EventListener
    public final void c(Call call) {
        Intrinsics.h(call, "call");
        D("cacheMiss");
    }

    @Override // okhttp3.EventListener
    public final void d(RealCall realCall) {
        D("callEnd");
    }

    @Override // okhttp3.EventListener
    public final void e(RealCall realCall, IOException iOException) {
        D("callFailed: " + iOException);
    }

    @Override // okhttp3.EventListener
    public final void f(RealCall realCall) {
        this.b = System.nanoTime();
        D("callStart: " + realCall.e);
    }

    @Override // okhttp3.EventListener
    public final void g(RealCall realCall) {
        D("canceled");
    }

    @Override // okhttp3.EventListener
    public final void h(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        Intrinsics.h(inetSocketAddress, "inetSocketAddress");
        D("connectEnd: " + protocol);
    }

    @Override // okhttp3.EventListener
    public final void i(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, IOException iOException) {
        Intrinsics.h(inetSocketAddress, "inetSocketAddress");
        D("connectFailed: null " + iOException);
    }

    @Override // okhttp3.EventListener
    public final void j(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        Intrinsics.h(inetSocketAddress, "inetSocketAddress");
        D("connectStart: " + inetSocketAddress + ' ' + proxy);
    }

    @Override // okhttp3.EventListener
    public final void k(Call call, Connection connection) {
        Intrinsics.h(connection, "connection");
        D("connectionAcquired: " + connection);
    }

    @Override // okhttp3.EventListener
    public final void l(Call call, Connection connection) {
        Intrinsics.h(connection, "connection");
        D("connectionReleased");
    }

    @Override // okhttp3.EventListener
    public final void m(Call call, String str, List list) {
        D("dnsEnd: " + list);
    }

    @Override // okhttp3.EventListener
    public final void n(Call call, String str) {
        D("dnsStart: ".concat(str));
    }

    @Override // okhttp3.EventListener
    public final void o(Call call, HttpUrl url, List list) {
        Intrinsics.h(url, "url");
        D("proxySelectEnd: " + list);
    }

    @Override // okhttp3.EventListener
    public final void p(Call call, HttpUrl url) {
        Intrinsics.h(url, "url");
        D("proxySelectStart: " + url);
    }

    @Override // okhttp3.EventListener
    public final void q(Call call, long j) {
        D("requestBodyEnd: byteCount=" + j);
    }

    @Override // okhttp3.EventListener
    public final void r(Call call) {
        D("requestBodyStart");
    }

    @Override // okhttp3.EventListener
    public final void s(Call call, IOException ioe) {
        Intrinsics.h(ioe, "ioe");
        D("requestFailed: " + ioe);
    }

    @Override // okhttp3.EventListener
    public final void t(Call call, Request request) {
        Intrinsics.h(request, "request");
        D("requestHeadersEnd");
    }

    @Override // okhttp3.EventListener
    public final void u(Call call) {
        D("requestHeadersStart");
    }

    @Override // okhttp3.EventListener
    public final void v(Call call, long j) {
        D("responseBodyEnd: byteCount=" + j);
    }

    @Override // okhttp3.EventListener
    public final void w(Call call) {
        D("responseBodyStart");
    }

    @Override // okhttp3.EventListener
    public final void x(Call call, IOException ioe) {
        Intrinsics.h(ioe, "ioe");
        D("responseFailed: " + ioe);
    }

    @Override // okhttp3.EventListener
    public final void y(Call call, Response response) {
        D("responseHeadersEnd: " + response);
    }

    @Override // okhttp3.EventListener
    public final void z(Call call) {
        D("responseHeadersStart");
    }
}
