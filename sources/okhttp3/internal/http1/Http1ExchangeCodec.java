package okhttp3.internal.http1;

import YU.a;
import androidx.camera.core.impl.b;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ForwardingTimeout;
import okio.Sink;
import okio.Source;
import okio.Timeout;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec;", "Lokhttp3/internal/http/ExchangeCodec;", "KnownLengthSink", "ChunkedSink", "AbstractSource", "FixedLengthSource", "ChunkedSource", "UnknownLengthSource", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class Http1ExchangeCodec implements ExchangeCodec {
    public static final Headers g;

    /* renamed from: a, reason: collision with root package name */
    public final OkHttpClient f26734a;
    public final ExchangeCodec.Carrier b;
    public final BufferedSource c;
    public final BufferedSink d;
    public int e;
    public final HeadersReader f;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b¢\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lokio/Source;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public abstract class AbstractSource implements Source {
        public final HttpUrl d;
        public final ForwardingTimeout e;
        public boolean f;
        public final /* synthetic */ Http1ExchangeCodec g;

        public AbstractSource(Http1ExchangeCodec http1ExchangeCodec, HttpUrl url) {
            Intrinsics.h(url, "url");
            this.g = http1ExchangeCodec;
            this.d = url;
            this.e = new ForwardingTimeout(http1ExchangeCodec.c.getE());
        }

        public final void a(Headers trailers) {
            OkHttpClient okHttpClient;
            CookieJar cookieJar;
            Intrinsics.h(trailers, "trailers");
            Http1ExchangeCodec http1ExchangeCodec = this.g;
            int i = http1ExchangeCodec.e;
            if (i == 6) {
                return;
            }
            if (i != 5) {
                throw new IllegalStateException("state: " + http1ExchangeCodec.e);
            }
            ForwardingTimeout forwardingTimeout = this.e;
            Timeout timeout = forwardingTimeout.f;
            forwardingTimeout.f = Timeout.e;
            timeout.b();
            timeout.c();
            http1ExchangeCodec.e = 6;
            if (trailers.size() <= 0 || (okHttpClient = http1ExchangeCodec.f26734a) == null || (cookieJar = okHttpClient.j) == null) {
                return;
            }
            HttpHeaders.d(cookieJar, this.d, trailers);
        }

        @Override // okio.Source
        /* renamed from: n */
        public final Timeout getE() {
            return this.e;
        }

        @Override // okio.Source
        public long q2(Buffer sink, long j) throws IOException {
            Http1ExchangeCodec http1ExchangeCodec = this.g;
            Intrinsics.h(sink, "sink");
            try {
                return http1ExchangeCodec.c.q2(sink, j);
            } catch (IOException e) {
                http1ExchangeCodec.b.c();
                a(Http1ExchangeCodec.g);
                throw e;
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSink;", "Lokio/Sink;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    /* loaded from: classes8.dex */
    public final class ChunkedSink implements Sink {
        public final ForwardingTimeout d;
        public boolean e;

        public ChunkedSink() {
            this.d = new ForwardingTimeout(Http1ExchangeCodec.this.d.getE());
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() {
            if (this.e) {
                return;
            }
            this.e = true;
            Http1ExchangeCodec.this.d.r1("0\r\n\r\n");
            ForwardingTimeout forwardingTimeout = this.d;
            Timeout timeout = forwardingTimeout.f;
            forwardingTimeout.f = Timeout.e;
            timeout.b();
            timeout.c();
            Http1ExchangeCodec.this.e = 3;
        }

        @Override // okio.Sink, java.io.Flushable
        public final synchronized void flush() {
            if (this.e) {
                return;
            }
            Http1ExchangeCodec.this.d.flush();
        }

        @Override // okio.Sink
        /* renamed from: n */
        public final Timeout getE() {
            return this.d;
        }

        @Override // okio.Sink
        public final void w1(Buffer source, long j) {
            BufferedSink bufferedSink = Http1ExchangeCodec.this.d;
            Intrinsics.h(source, "source");
            if (this.e) {
                throw new IllegalStateException("closed");
            }
            if (j == 0) {
                return;
            }
            bufferedSink.L0(j);
            bufferedSink.r1("\r\n");
            bufferedSink.w1(source, j);
            bufferedSink.r1("\r\n");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    /* loaded from: classes8.dex */
    public final class ChunkedSource extends AbstractSource {
        public long h;
        public boolean i;
        public final /* synthetic */ Http1ExchangeCodec j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChunkedSource(Http1ExchangeCodec http1ExchangeCodec, HttpUrl url) {
            super(http1ExchangeCodec, url);
            Intrinsics.h(url, "url");
            this.j = http1ExchangeCodec;
            this.h = -1L;
            this.i = true;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            boolean zG;
            if (this.f) {
                return;
            }
            if (this.i) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                TimeZone timeZone = _UtilJvmKt.f26699a;
                Intrinsics.h(timeUnit, "timeUnit");
                try {
                    zG = _UtilJvmKt.g(this, 100);
                } catch (IOException unused) {
                    zG = false;
                }
                if (!zG) {
                    this.j.b.c();
                    a(Http1ExchangeCodec.g);
                }
            }
            this.f = true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0091, code lost:
        
            if (r11.i == false) goto L34;
         */
        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, okio.Source
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final long q2(okio.Buffer r12, long r13) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 248
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http1.Http1ExchangeCodec.ChunkedSource.q2(okio.Buffer, long):long");
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$Companion;", "", "<init>", "()V", "NO_CHUNK_YET", "", "STATE_IDLE", "", "STATE_OPEN_REQUEST_BODY", "STATE_WRITING_REQUEST_BODY", "STATE_READ_RESPONSE_HEADERS", "STATE_OPEN_RESPONSE_BODY", "STATE_READING_RESPONSE_BODY", "STATE_CLOSED", "TRAILERS_RESPONSE_BODY_TRUNCATED", "Lokhttp3/Headers;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$FixedLengthSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public final class FixedLengthSource extends AbstractSource {
        public long h;
        public final /* synthetic */ Http1ExchangeCodec i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FixedLengthSource(Http1ExchangeCodec http1ExchangeCodec, HttpUrl url, long j) {
            super(http1ExchangeCodec, url);
            Intrinsics.h(url, "url");
            this.i = http1ExchangeCodec;
            this.h = j;
            if (j == 0) {
                a(Headers.f);
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            boolean zG;
            if (this.f) {
                return;
            }
            if (this.h != 0) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                TimeZone timeZone = _UtilJvmKt.f26699a;
                Intrinsics.h(timeUnit, "timeUnit");
                try {
                    zG = _UtilJvmKt.g(this, 100);
                } catch (IOException unused) {
                    zG = false;
                }
                if (!zG) {
                    this.i.b.c();
                    a(Http1ExchangeCodec.g);
                }
            }
            this.f = true;
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, okio.Source
        public final long q2(Buffer sink, long j) throws IOException {
            Intrinsics.h(sink, "sink");
            if (j < 0) {
                throw new IllegalArgumentException(b.k(j, "byteCount < 0: ").toString());
            }
            if (this.f) {
                throw new IllegalStateException("closed");
            }
            long j2 = this.h;
            if (j2 == 0) {
                return -1L;
            }
            long jQ2 = super.q2(sink, Math.min(j2, j));
            if (jQ2 == -1) {
                this.i.b.c();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                a(Http1ExchangeCodec.g);
                throw protocolException;
            }
            long j3 = this.h - jQ2;
            this.h = j3;
            if (j3 == 0) {
                a(Headers.f);
            }
            return jQ2;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$KnownLengthSink;", "Lokio/Sink;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    /* loaded from: classes8.dex */
    public final class KnownLengthSink implements Sink {
        public final ForwardingTimeout d;
        public boolean e;

        public KnownLengthSink() {
            this.d = new ForwardingTimeout(Http1ExchangeCodec.this.d.getE());
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.e) {
                return;
            }
            this.e = true;
            Headers headers = Http1ExchangeCodec.g;
            ForwardingTimeout forwardingTimeout = this.d;
            Timeout timeout = forwardingTimeout.f;
            forwardingTimeout.f = Timeout.e;
            timeout.b();
            timeout.c();
            Http1ExchangeCodec.this.e = 3;
        }

        @Override // okio.Sink, java.io.Flushable
        public final void flush() {
            if (this.e) {
                return;
            }
            Http1ExchangeCodec.this.d.flush();
        }

        @Override // okio.Sink
        /* renamed from: n */
        public final Timeout getE() {
            return this.d;
        }

        @Override // okio.Sink
        public final void w1(Buffer source, long j) {
            Intrinsics.h(source, "source");
            if (this.e) {
                throw new IllegalStateException("closed");
            }
            _UtilCommonKt.a(source.e, 0L, j);
            Http1ExchangeCodec.this.d.w1(source, j);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$UnknownLengthSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    /* loaded from: classes8.dex */
    public final class UnknownLengthSource extends AbstractSource {
        public boolean h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnknownLengthSource(Http1ExchangeCodec http1ExchangeCodec, HttpUrl url) {
            super(http1ExchangeCodec, url);
            Intrinsics.h(url, "url");
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f) {
                return;
            }
            if (!this.h) {
                a(Http1ExchangeCodec.g);
            }
            this.f = true;
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, okio.Source
        public final long q2(Buffer sink, long j) throws IOException {
            Intrinsics.h(sink, "sink");
            if (j < 0) {
                throw new IllegalArgumentException(b.k(j, "byteCount < 0: ").toString());
            }
            if (this.f) {
                throw new IllegalStateException("closed");
            }
            if (this.h) {
                return -1L;
            }
            long jQ2 = super.q2(sink, j);
            if (jQ2 != -1) {
                return jQ2;
            }
            this.h = true;
            a(Headers.f);
            return -1L;
        }
    }

    static {
        new Companion(0);
        Headers.e.getClass();
        g = Headers.Companion.a("OkHttp-Response-Body", "Truncated");
    }

    public Http1ExchangeCodec(OkHttpClient okHttpClient, ExchangeCodec.Carrier carrier, BufferedSource source, BufferedSink sink) {
        Intrinsics.h(source, "source");
        Intrinsics.h(sink, "sink");
        this.f26734a = okHttpClient;
        this.b = carrier;
        this.c = source;
        this.d = sink;
        this.f = new HeadersReader(source);
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final Source a(Response response) {
        Request request = response.d;
        if (!HttpHeaders.a(response)) {
            return j(request.f26690a, 0L);
        }
        if ("chunked".equalsIgnoreCase(Response.b("Transfer-Encoding", response))) {
            HttpUrl httpUrl = request.f26690a;
            if (this.e == 4) {
                this.e = 5;
                return new ChunkedSource(this, httpUrl);
            }
            throw new IllegalStateException(("state: " + this.e).toString());
        }
        long jE = _UtilJvmKt.e(response);
        if (jE != -1) {
            return j(request.f26690a, jE);
        }
        HttpUrl httpUrl2 = request.f26690a;
        if (this.e == 4) {
            this.e = 5;
            this.b.c();
            return new UnknownLengthSource(this, httpUrl2);
        }
        throw new IllegalStateException(("state: " + this.e).toString());
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final Sink b(Request request, long j) {
        Intrinsics.h(request, "request");
        if ("chunked".equalsIgnoreCase(request.c.b("Transfer-Encoding"))) {
            if (this.e == 1) {
                this.e = 2;
                return new ChunkedSink();
            }
            throw new IllegalStateException(("state: " + this.e).toString());
        }
        if (j == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.e == 1) {
            this.e = 2;
            return new KnownLengthSink();
        }
        throw new IllegalStateException(("state: " + this.e).toString());
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void c() {
        this.d.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void cancel() {
        this.b.cancel();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void d() {
        this.d.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final long e(Response response) {
        if (!HttpHeaders.a(response)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(Response.b("Transfer-Encoding", response))) {
            return -1L;
        }
        return _UtilJvmKt.e(response);
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void f(Request request) {
        Intrinsics.h(request, "request");
        RequestLine requestLine = RequestLine.f26730a;
        Proxy.Type type = this.b.getN().b.type();
        Intrinsics.g(type, "type(...)");
        requestLine.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(request.b);
        sb.append(' ');
        HttpUrl httpUrl = request.f26690a;
        if (httpUrl.f() || type != Proxy.Type.HTTP) {
            sb.append(RequestLine.a(httpUrl));
        } else {
            sb.append(httpUrl);
        }
        sb.append(" HTTP/1.1");
        l(request.c, sb.toString());
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final boolean g() {
        return this.e == 6;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final Response.Builder h(boolean z) {
        HeadersReader headersReader = this.f;
        int i = this.e;
        if (i != 0 && i != 1 && i != 2 && i != 3) {
            throw new IllegalStateException(("state: " + this.e).toString());
        }
        try {
            StatusLine.Companion companion = StatusLine.d;
            String strN1 = headersReader.f26733a.n1(headersReader.b);
            headersReader.b -= strN1.length();
            companion.getClass();
            StatusLine statusLineA = StatusLine.Companion.a(strN1);
            int i2 = statusLineA.b;
            Response.Builder builder = new Response.Builder();
            Protocol protocol = statusLineA.f26732a;
            Intrinsics.h(protocol, "protocol");
            builder.b = protocol;
            builder.c = i2;
            String message = statusLineA.c;
            Intrinsics.h(message, "message");
            builder.d = message;
            Headers.Builder builder2 = new Headers.Builder();
            while (true) {
                String strN12 = headersReader.f26733a.n1(headersReader.b);
                headersReader.b -= strN12.length();
                if (strN12.length() == 0) {
                    break;
                }
                builder2.b(strN12);
            }
            builder.c(builder2.e());
            if (z && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.e = 3;
                return builder;
            }
            if (102 > i2 || i2 >= 200) {
                this.e = 4;
                return builder;
            }
            this.e = 3;
            return builder;
        } catch (EOFException e) {
            throw new IOException(a.A("unexpected end of stream on ", this.b.getN().f26694a.h.k()), e);
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    /* renamed from: i, reason: from getter */
    public final ExchangeCodec.Carrier getB() {
        return this.b;
    }

    public final Source j(HttpUrl httpUrl, long j) {
        if (this.e == 4) {
            this.e = 5;
            return new FixedLengthSource(this, httpUrl, j);
        }
        throw new IllegalStateException(("state: " + this.e).toString());
    }

    public final void k(Response response) {
        long jE = _UtilJvmKt.e(response);
        if (jE == -1) {
            return;
        }
        Source sourceJ = j(response.d.f26690a, jE);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        _UtilJvmKt.g(sourceJ, Integer.MAX_VALUE);
        ((FixedLengthSource) sourceJ).close();
    }

    public final void l(Headers headers, String requestLine) {
        Intrinsics.h(headers, "headers");
        Intrinsics.h(requestLine, "requestLine");
        if (this.e != 0) {
            throw new IllegalStateException(("state: " + this.e).toString());
        }
        BufferedSink bufferedSink = this.d;
        bufferedSink.r1(requestLine).r1("\r\n");
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            bufferedSink.r1(headers.d(i)).r1(": ").r1(headers.i(i)).r1("\r\n");
        }
        bufferedSink.r1("\r\n");
        this.e = 1;
    }
}
