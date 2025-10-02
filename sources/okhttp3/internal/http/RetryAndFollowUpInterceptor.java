package okhttp3.internal.http;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.ExchangeFinder;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RoutePlanner;
import okhttp3.internal.http2.ConnectionShutdownException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/http/RetryAndFollowUpInterceptor;", "Lokhttp3/Interceptor;", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RetryAndFollowUpInterceptor implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    public final OkHttpClient f26731a;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lokhttp3/internal/http/RetryAndFollowUpInterceptor$Companion;", "", "<init>", "()V", "MAX_FOLLOW_UPS", "", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }

    static {
        new Companion(0);
    }

    public RetryAndFollowUpInterceptor(OkHttpClient okHttpClient) {
        this.f26731a = okHttpClient;
    }

    public static int d(Response response, int i) throws NumberFormatException {
        String strB = Response.b("Retry-After", response);
        if (strB == null) {
            return i;
        }
        if (!new Regex("\\d+").f(strB)) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strB);
        Intrinsics.g(numValueOf, "valueOf(...)");
        return numValueOf.intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c8, code lost:
    
        r0 = r37.c(r4).c();
        r0.f26693a = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ce, code lost:
    
        if (r9 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d0, code lost:
    
        r4 = okhttp3.internal.UnreadableResponseBodyKt.a(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d9, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00da, code lost:
    
        r0.j = r4;
        r9 = r0.a();
        r4 = b(r9, r3.o);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e6, code lost:
    
        if (r4 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e8, code lost:
    
        r3.h.getClass();
        r0 = okhttp3.EventListener.f26679a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ef, code lost:
    
        r3.c(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f3, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f4, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f7, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f9, code lost:
    
        r0 = r4.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00fb, code lost:
    
        if (r0 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0101, code lost:
    
        if (r0.c() == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0103, code lost:
    
        r3.h.getClass();
        r0 = okhttp3.EventListener.f26679a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x010a, code lost:
    
        r3.c(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x010e, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0110, code lost:
    
        okhttp3.internal._UtilCommonKt.b(r9.j);
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0119, code lost:
    
        if (r10 > 20) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x011b, code lost:
    
        r3.h.getClass();
        r0 = okhttp3.EventListener.f26679a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0128, code lost:
    
        r3.h.getClass();
        r0 = okhttp3.EventListener.f26679a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0145, code lost:
    
        throw new java.net.ProtocolException("Too many follow-up requests: " + r10);
     */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final okhttp3.Response a(okhttp3.internal.http.RealInterceptorChain r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 427
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.RetryAndFollowUpInterceptor.a(okhttp3.internal.http.RealInterceptorChain):okhttp3.Response");
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final okhttp3.Request b(okhttp3.Response r12, okhttp3.internal.connection.Exchange r13) throws java.net.ProtocolException {
        /*
            Method dump skipped, instructions count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.RetryAndFollowUpInterceptor.b(okhttp3.Response, okhttp3.internal.connection.Exchange):okhttp3.Request");
    }

    public final boolean c(IOException iOException, RealCall realCall, Request request) {
        RequestBody requestBody;
        boolean z = iOException instanceof ConnectionShutdownException;
        if (!this.f26731a.e) {
            return false;
        }
        if ((!z && (((requestBody = request.d) != null && requestBody.c()) || (iOException instanceof FileNotFoundException))) || (iOException instanceof ProtocolException)) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || !z) {
                return false;
            }
        } else if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        Exchange exchange = realCall.t;
        if (exchange == null || !exchange.e) {
            return false;
        }
        ExchangeFinder exchangeFinder = realCall.l;
        Intrinsics.e(exchangeFinder);
        RoutePlanner routePlannerB = exchangeFinder.getF26714a();
        Exchange exchange2 = realCall.t;
        return routePlannerB.a(exchange2 != null ? exchange2.d() : null);
    }
}
