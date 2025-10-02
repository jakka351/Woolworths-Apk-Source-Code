package okhttp3.internal.http;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.infra.rest.RequestBuilder;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal._UtilJvmKt;
import okio.GzipSource;
import okio.Okio;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http/BridgeInterceptor;", "Lokhttp3/Interceptor;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class BridgeInterceptor implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    public final CookieJar f26724a;

    public BridgeInterceptor(CookieJar cookieJar) {
        Intrinsics.h(cookieJar, "cookieJar");
        this.f26724a = cookieJar;
    }

    @Override // okhttp3.Interceptor
    public final Response a(RealInterceptorChain realInterceptorChain) {
        ResponseBody responseBody;
        Request request = realInterceptorChain.e;
        Request.Builder builderB = request.b();
        Headers headers = request.c;
        HttpUrl httpUrl = request.f26690a;
        RequestBody requestBody = request.d;
        if (requestBody != null) {
            MediaType d = requestBody.getD();
            if (d != null) {
                builderB.c(RequestBuilder.CONTENT_TYPE, d.f26685a);
            }
            long jA = requestBody.a();
            if (jA != -1) {
                builderB.c("Content-Length", String.valueOf(jA));
                builderB.c.g("Transfer-Encoding");
            } else {
                builderB.c("Transfer-Encoding", "chunked");
                builderB.c.g("Content-Length");
            }
        }
        boolean z = false;
        if (headers.b("Host") == null) {
            builderB.c("Host", _UtilJvmKt.i(httpUrl, false));
        }
        if (headers.b("Connection") == null) {
            builderB.c("Connection", "Keep-Alive");
        }
        if (headers.b("Accept-Encoding") == null && headers.b("Range") == null) {
            builderB.c("Accept-Encoding", "gzip");
            z = true;
        }
        CookieJar cookieJar = this.f26724a;
        cookieJar.a(httpUrl);
        if (headers.b("User-Agent") == null) {
            builderB.c("User-Agent", "okhttp/5.1.0");
        }
        Request request2 = new Request(builderB);
        Response responseC = realInterceptorChain.c(request2);
        Headers headers2 = responseC.i;
        HttpHeaders.d(cookieJar, request2.f26690a, headers2);
        Response.Builder builderC = responseC.c();
        builderC.f26693a = request2;
        if (z && "gzip".equalsIgnoreCase(Response.b(RequestBuilder.CONTENT_ENCODING, responseC)) && HttpHeaders.a(responseC) && (responseBody = responseC.j) != null) {
            GzipSource gzipSource = new GzipSource(responseBody.U0());
            Headers.Builder builderG = headers2.g();
            builderG.g(RequestBuilder.CONTENT_ENCODING);
            builderG.g("Content-Length");
            builderC.c(builderG.e());
            builderC.g = new RealResponseBody(Response.b(RequestBuilder.CONTENT_TYPE, responseC), -1L, Okio.c(gzipSource));
        }
        return builderC.a();
    }
}
