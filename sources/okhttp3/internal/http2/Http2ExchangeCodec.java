package okhttp3.internal.http2;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http2.Http2Stream;
import okio.ByteString;
import okio.Sink;
import okio.Source;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/http2/Http2ExchangeCodec;", "Lokhttp3/internal/http/ExchangeCodec;", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Http2ExchangeCodec implements ExchangeCodec {
    public static final Companion g = new Companion(0);
    public static final List h = _UtilJvmKt.k(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority"});
    public static final List i = _UtilJvmKt.k(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade"});

    /* renamed from: a, reason: collision with root package name */
    public final RealConnection f26742a;
    public final RealInterceptorChain b;
    public final Http2Connection c;
    public volatile Http2Stream d;
    public final Protocol e;
    public volatile boolean f;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"Lokhttp3/internal/http2/Http2ExchangeCodec$Companion;", "", "<init>", "()V", "", "CONNECTION", "Ljava/lang/String;", "HOST", "KEEP_ALIVE", "PROXY_CONNECTION", "TRANSFER_ENCODING", "TE", "ENCODING", "UPGRADE", "", "HTTP_2_SKIPPED_REQUEST_HEADERS", "Ljava/util/List;", "HTTP_2_SKIPPED_RESPONSE_HEADERS", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }

    public Http2ExchangeCodec(OkHttpClient okHttpClient, RealConnection realConnection, RealInterceptorChain realInterceptorChain, Http2Connection http2Connection) {
        Intrinsics.h(http2Connection, "http2Connection");
        this.f26742a = realConnection;
        this.b = realInterceptorChain;
        this.c = http2Connection;
        List list = okHttpClient.s;
        Protocol protocol = Protocol.j;
        this.e = list.contains(protocol) ? protocol : Protocol.i;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final Source a(Response response) {
        Http2Stream http2Stream = this.d;
        Intrinsics.e(http2Stream);
        return http2Stream.k;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final Sink b(Request request, long j) {
        Intrinsics.h(request, "request");
        Http2Stream http2Stream = this.d;
        Intrinsics.e(http2Stream);
        return http2Stream.l;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void c() {
        this.c.A.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void cancel() {
        this.f = true;
        Http2Stream http2Stream = this.d;
        if (http2Stream != null) {
            http2Stream.e(ErrorCode.k);
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void d() throws SocketTimeoutException {
        Http2Stream http2Stream = this.d;
        Intrinsics.e(http2Stream);
        http2Stream.l.close();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final long e(Response response) {
        if (HttpHeaders.a(response)) {
            return _UtilJvmKt.e(response);
        }
        return 0L;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void f(Request request) throws IOException {
        int i2;
        Http2Stream http2Stream;
        boolean z;
        Intrinsics.h(request, "request");
        if (this.d != null) {
            return;
        }
        boolean z2 = request.d != null;
        g.getClass();
        Headers headers = request.c;
        ArrayList arrayList = new ArrayList(headers.size() + 4);
        arrayList.add(new Header(Header.f, request.b));
        ByteString byteString = Header.g;
        RequestLine requestLine = RequestLine.f26730a;
        HttpUrl httpUrl = request.f26690a;
        requestLine.getClass();
        arrayList.add(new Header(byteString, RequestLine.a(httpUrl)));
        String strB = request.c.b("Host");
        if (strB != null) {
            arrayList.add(new Header(Header.i, strB));
        }
        arrayList.add(new Header(Header.h, httpUrl.f26683a));
        int size = headers.size();
        for (int i3 = 0; i3 < size; i3++) {
            String strD = headers.d(i3);
            Locale locale = Locale.US;
            String strM = androidx.constraintlayout.core.state.a.m(locale, "US", strD, locale, "toLowerCase(...)");
            if (!h.contains(strM) || (strM.equals("te") && headers.i(i3).equals("trailers"))) {
                arrayList.add(new Header(strM, headers.i(i3)));
            }
        }
        Http2Connection http2Connection = this.c;
        http2Connection.getClass();
        boolean z3 = !z2;
        synchronized (http2Connection.A) {
            synchronized (http2Connection) {
                try {
                    if (http2Connection.h > 1073741823) {
                        http2Connection.d(ErrorCode.j);
                    }
                    if (http2Connection.i) {
                        throw new ConnectionShutdownException();
                    }
                    i2 = http2Connection.h;
                    http2Connection.h = i2 + 2;
                    http2Stream = new Http2Stream(i2, http2Connection, z3, false, null);
                    z = !z2 || http2Connection.x >= http2Connection.y || http2Stream.g >= http2Stream.h;
                    if (http2Stream.h()) {
                        http2Connection.e.put(Integer.valueOf(i2), http2Stream);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            http2Connection.A.d(z3, i2, arrayList);
        }
        if (z) {
            http2Connection.A.flush();
        }
        this.d = http2Stream;
        if (this.f) {
            Http2Stream http2Stream2 = this.d;
            Intrinsics.e(http2Stream2);
            http2Stream2.e(ErrorCode.k);
            throw new IOException("Canceled");
        }
        Http2Stream http2Stream3 = this.d;
        Intrinsics.e(http2Stream3);
        Http2Stream.StreamTimeout streamTimeout = http2Stream3.m;
        long j = this.b.g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        streamTimeout.h(j, timeUnit);
        Http2Stream http2Stream4 = this.d;
        Intrinsics.e(http2Stream4);
        http2Stream4.n.h(this.b.h, timeUnit);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0019  */
    @Override // okhttp3.internal.http.ExchangeCodec
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g() {
        /*
            r5 = this;
            okhttp3.internal.http2.Http2Stream r0 = r5.d
            r1 = 0
            if (r0 == 0) goto L21
            monitor-enter(r0)
            okhttp3.internal.http2.Http2Stream$FramingSource r2 = r0.k     // Catch: java.lang.Throwable -> L17
            boolean r3 = r2.e     // Catch: java.lang.Throwable -> L17
            r4 = 1
            if (r3 == 0) goto L19
            okio.Buffer r2 = r2.g     // Catch: java.lang.Throwable -> L17
            boolean r2 = r2.X1()     // Catch: java.lang.Throwable -> L17
            if (r2 == 0) goto L19
            r2 = r4
            goto L1a
        L17:
            r1 = move-exception
            goto L1f
        L19:
            r2 = r1
        L1a:
            monitor-exit(r0)
            if (r2 != r4) goto L1e
            return r4
        L1e:
            return r1
        L1f:
            monitor-exit(r0)
            throw r1
        L21:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2ExchangeCodec.g():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002c  */
    @Override // okhttp3.internal.http.ExchangeCodec
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final okhttp3.Response.Builder h(boolean r11) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2ExchangeCodec.h(boolean):okhttp3.Response$Builder");
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    /* renamed from: i */
    public final ExchangeCodec.Carrier getB() {
        return this.f26742a;
    }
}
