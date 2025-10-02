package okhttp3.internal.connection;

import androidx.camera.core.impl.b;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.infra.rest.RequestBuilder;
import okhttp3.EventListener;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealResponseBody;
import okio.Buffer;
import okio.ForwardingSink;
import okio.ForwardingSource;
import okio.Okio;
import okio.Sink;
import okio.Source;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/connection/Exchange;", "", "RequestBodySink", "ResponseBodySource", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Exchange {

    /* renamed from: a, reason: collision with root package name */
    public final RealCall f26713a;
    public final EventListener b;
    public final ExchangeFinder c;
    public final ExchangeCodec d;
    public boolean e;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/connection/Exchange$RequestBodySink;", "Lokio/ForwardingSink;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public final class RequestBodySink extends ForwardingSink {
        public final long e;
        public boolean f;
        public long g;
        public boolean h;
        public final /* synthetic */ Exchange i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequestBodySink(Exchange exchange, Sink delegate, long j) {
            super(delegate);
            Intrinsics.h(delegate, "delegate");
            this.i = exchange;
            this.e = j;
        }

        public final IOException a(IOException iOException) {
            if (this.f) {
                return iOException;
            }
            this.f = true;
            return Exchange.b(this.i, this.g, iOException, 2);
        }

        @Override // okio.ForwardingSink, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.h) {
                return;
            }
            this.h = true;
            long j = this.e;
            if (j != -1 && this.g != j) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
            } catch (IOException e) {
                throw a(e);
            }
        }

        @Override // okio.ForwardingSink, okio.Sink, java.io.Flushable
        public final void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e) {
                throw a(e);
            }
        }

        @Override // okio.ForwardingSink, okio.Sink
        public final void w1(Buffer source, long j) throws IOException {
            Intrinsics.h(source, "source");
            if (this.h) {
                throw new IllegalStateException("closed");
            }
            long j2 = this.e;
            if (j2 != -1 && this.g + j > j2) {
                StringBuilder sbT = b.t(j2, "expected ", " bytes but received ");
                sbT.append(this.g + j);
                throw new ProtocolException(sbT.toString());
            }
            try {
                super.w1(source, j);
                this.g += j;
            } catch (IOException e) {
                throw a(e);
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/connection/Exchange$ResponseBodySource;", "Lokio/ForwardingSource;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public final class ResponseBodySource extends ForwardingSource {
        public final long e;
        public long f;
        public boolean g;
        public boolean h;
        public boolean i;
        public final /* synthetic */ Exchange j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResponseBodySource(Exchange exchange, Source delegate, long j) {
            super(delegate);
            Intrinsics.h(delegate, "delegate");
            this.j = exchange;
            this.e = j;
            this.g = true;
            if (j == 0) {
                a(null);
            }
        }

        public final IOException a(IOException iOException) {
            if (this.h) {
                return iOException;
            }
            this.h = true;
            Exchange exchange = this.j;
            if (iOException == null && this.g) {
                this.g = false;
                exchange.b.w(exchange.f26713a);
            }
            return Exchange.b(exchange, this.f, iOException, 4);
        }

        @Override // okio.ForwardingSource, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.i) {
                return;
            }
            this.i = true;
            try {
                super.close();
            } catch (IOException e) {
                throw a(e);
            }
        }

        @Override // okio.ForwardingSource, okio.Source
        public final long q2(Buffer sink, long j) throws IOException {
            Intrinsics.h(sink, "sink");
            if (this.i) {
                throw new IllegalStateException("closed");
            }
            try {
                long jQ2 = this.d.q2(sink, j);
                boolean z = this.g;
                Exchange exchange = this.j;
                if (z) {
                    this.g = false;
                    exchange.b.w(exchange.f26713a);
                }
                if (jQ2 == -1) {
                    a(null);
                    return -1L;
                }
                long j2 = this.f + jQ2;
                long j3 = this.e;
                if (j3 == -1 || j2 <= j3) {
                    this.f = j2;
                    if (exchange.d.g()) {
                        a(null);
                    }
                    return jQ2;
                }
                throw new ProtocolException("expected " + j3 + " bytes but received " + j2);
            } catch (IOException e) {
                throw a(e);
            }
        }
    }

    public Exchange(RealCall realCall, EventListener eventListener, ExchangeFinder finder, ExchangeCodec exchangeCodec) {
        Intrinsics.h(eventListener, "eventListener");
        Intrinsics.h(finder, "finder");
        this.f26713a = realCall;
        this.b = eventListener;
        this.c = finder;
        this.d = exchangeCodec;
    }

    public static /* synthetic */ IOException b(Exchange exchange, long j, IOException iOException, int i) {
        boolean z;
        Exchange exchange2;
        IOException iOException2;
        if ((i & 1) != 0) {
            j = -1;
        }
        long j2 = j;
        boolean z2 = (i & 2) == 0;
        if ((i & 4) != 0) {
            z = false;
            iOException2 = iOException;
            exchange2 = exchange;
        } else {
            z = true;
            exchange2 = exchange;
            iOException2 = iOException;
        }
        return exchange2.a(j2, z2, z, iOException2);
    }

    public final IOException a(long j, boolean z, boolean z2, IOException iOException) {
        if (iOException != null) {
            g(iOException);
        }
        EventListener eventListener = this.b;
        RealCall realCall = this.f26713a;
        if (z2) {
            if (iOException != null) {
                eventListener.s(realCall, iOException);
            } else {
                eventListener.q(realCall, j);
            }
        }
        if (z) {
            if (iOException != null) {
                eventListener.x(realCall, iOException);
            } else {
                eventListener.v(realCall, j);
            }
        }
        return realCall.e(this, z2, z, iOException);
    }

    public final Sink c(Request request) {
        Intrinsics.h(request, "request");
        RequestBody requestBody = request.d;
        Intrinsics.e(requestBody);
        long jA = requestBody.a();
        this.b.r(this.f26713a);
        return new RequestBodySink(this, this.d.b(request, jA), jA);
    }

    public final RealConnection d() {
        ExchangeCodec.Carrier carrierI = this.d.i();
        RealConnection realConnection = carrierI instanceof RealConnection ? (RealConnection) carrierI : null;
        if (realConnection != null) {
            return realConnection;
        }
        throw new IllegalStateException("no connection for CONNECT tunnels");
    }

    public final RealResponseBody e(Response response) throws IOException {
        ExchangeCodec exchangeCodec = this.d;
        try {
            String strB = Response.b(RequestBuilder.CONTENT_TYPE, response);
            long jE = exchangeCodec.e(response);
            return new RealResponseBody(strB, jE, Okio.c(new ResponseBodySource(this, exchangeCodec.a(response), jE)));
        } catch (IOException e) {
            this.b.x(this.f26713a, e);
            g(e);
            throw e;
        }
    }

    public final Response.Builder f(boolean z) throws IOException {
        try {
            Response.Builder builderH = this.d.h(z);
            if (builderH == null) {
                return builderH;
            }
            builderH.m = this;
            return builderH;
        } catch (IOException e) {
            this.b.x(this.f26713a, e);
            g(e);
            throw e;
        }
    }

    public final void g(IOException iOException) {
        this.e = true;
        this.d.i().f(this.f26713a, iOException);
    }
}
