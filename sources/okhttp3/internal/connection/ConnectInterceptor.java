package okhttp3.internal.connection;

import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http1.Http1ExchangeCodec;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2ExchangeCodec;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Timeout;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/connection/ConnectInterceptor;", "Lokhttp3/Interceptor;", "<init>", "()V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ConnectInterceptor implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    public static final ConnectInterceptor f26710a = new ConnectInterceptor();

    private ConnectInterceptor() {
    }

    @Override // okhttp3.Interceptor
    public final Response a(RealInterceptorChain realInterceptorChain) throws IOException {
        ExchangeCodec http1ExchangeCodec;
        RealCall realCall = realInterceptorChain.f26729a;
        synchronized (realCall) {
            try {
                if (!realCall.r) {
                    throw new IllegalStateException("released");
                }
                if (realCall.q) {
                    throw new IllegalStateException("Check failed.");
                }
                if (realCall.p) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ExchangeFinder exchangeFinder = realCall.l;
        Intrinsics.e(exchangeFinder);
        RealConnection realConnectionA = exchangeFinder.a();
        OkHttpClient okHttpClient = realCall.d;
        realConnectionA.getClass();
        int i = realInterceptorChain.g;
        Socket socket = realConnectionA.i;
        BufferedSource bufferedSource = realConnectionA.l;
        BufferedSink bufferedSink = realConnectionA.m;
        Http2Connection http2Connection = realConnectionA.p;
        if (http2Connection != null) {
            http1ExchangeCodec = new Http2ExchangeCodec(okHttpClient, realConnectionA, realInterceptorChain, http2Connection);
        } else {
            socket.setSoTimeout(i);
            Timeout e = bufferedSource.getE();
            long j = i;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            e.h(j, timeUnit);
            bufferedSink.getE().h(realInterceptorChain.h, timeUnit);
            http1ExchangeCodec = new Http1ExchangeCodec(okHttpClient, realConnectionA, bufferedSource, bufferedSink);
        }
        Exchange exchange = new Exchange(realCall, realCall.h, exchangeFinder, http1ExchangeCodec);
        realCall.o = exchange;
        realCall.t = exchange;
        synchronized (realCall) {
            realCall.p = true;
            realCall.q = true;
        }
        if (realCall.s) {
            throw new IOException("Canceled");
        }
        return RealInterceptorChain.b(realInterceptorChain, 0, exchange, null, 61).c(realInterceptorChain.e);
    }
}
