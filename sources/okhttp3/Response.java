package okhttp3;

import java.io.Closeable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.internal.connection.Exchange;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/Response;", "Ljava/io/Closeable;", "Builder", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Response implements Closeable {
    public final Request d;
    public final Protocol e;
    public final String f;
    public final int g;
    public final Handshake h;
    public final Headers i;
    public final ResponseBody j;
    public final Response k;
    public final Response l;
    public final Response m;
    public final long n;
    public final long o;
    public final Exchange p;
    public final TrailersSource q;
    public CacheControl r;
    public final boolean s;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/Response$Builder;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        public Request f26693a;
        public Protocol b;
        public String d;
        public Handshake e;
        public Response h;
        public Response i;
        public Response j;
        public long k;
        public long l;
        public Exchange m;
        public int c = -1;
        public ResponseBody g = ResponseBody.f;
        public TrailersSource n = TrailersSource.f26695a;
        public Headers.Builder f = new Headers.Builder();

        public static void b(String str, Response response) {
            if (response != null) {
                if (response.k != null) {
                    throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
                }
                if (response.l != null) {
                    throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
                }
                if (response.m != null) {
                    throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
                }
            }
        }

        public final Response a() {
            int i = this.c;
            if (i < 0) {
                throw new IllegalStateException(("code < 0: " + this.c).toString());
            }
            Request request = this.f26693a;
            if (request == null) {
                throw new IllegalStateException("request == null");
            }
            Protocol protocol = this.b;
            if (protocol == null) {
                throw new IllegalStateException("protocol == null");
            }
            String str = this.d;
            if (str != null) {
                return new Response(request, protocol, str, i, this.e, this.f.e(), this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n);
            }
            throw new IllegalStateException("message == null");
        }

        public final void c(Headers headers) {
            Intrinsics.h(headers, "headers");
            this.f = headers.g();
        }
    }

    public Response(Request request, Protocol protocol, String message, int i, Handshake handshake, Headers headers, ResponseBody body, Response response, Response response2, Response response3, long j, long j2, Exchange exchange, TrailersSource trailersSource) {
        Intrinsics.h(request, "request");
        Intrinsics.h(protocol, "protocol");
        Intrinsics.h(message, "message");
        Intrinsics.h(body, "body");
        Intrinsics.h(trailersSource, "trailersSource");
        this.d = request;
        this.e = protocol;
        this.f = message;
        this.g = i;
        this.h = handshake;
        this.i = headers;
        this.j = body;
        this.k = response;
        this.l = response2;
        this.m = response3;
        this.n = j;
        this.o = j2;
        this.p = exchange;
        this.q = trailersSource;
        boolean z = false;
        if (200 <= i && i < 300) {
            z = true;
        }
        this.s = z;
    }

    public static String b(String str, Response response) {
        response.getClass();
        String strB = response.i.b(str);
        if (strB == null) {
            return null;
        }
        return strB;
    }

    public final CacheControl a() {
        CacheControl cacheControl = this.r;
        if (cacheControl != null) {
            return cacheControl;
        }
        CacheControl.n.getClass();
        CacheControl cacheControlA = CacheControl.Companion.a(this.i);
        this.r = cacheControlA;
        return cacheControlA;
    }

    public final Builder c() {
        Builder builder = new Builder();
        builder.c = -1;
        builder.g = ResponseBody.f;
        builder.n = TrailersSource.f26695a;
        builder.f26693a = this.d;
        builder.b = this.e;
        builder.c = this.g;
        builder.d = this.f;
        builder.e = this.h;
        builder.f = this.i.g();
        builder.g = this.j;
        builder.h = this.k;
        builder.i = this.l;
        builder.j = this.m;
        builder.k = this.n;
        builder.l = this.o;
        builder.m = this.p;
        builder.n = this.q;
        return builder;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.j.close();
    }

    public final String toString() {
        return "Response{protocol=" + this.e + ", code=" + this.g + ", message=" + this.f + ", url=" + this.d.f26690a + '}';
    }
}
