package au.com.woolworths.android.onesite.network;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Authenticator;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.RealInterceptorChain;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/network/PreemptiveTokenRefreshInterceptor;", "Lokhttp3/Interceptor;", "Companion", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class PreemptiveTokenRefreshInterceptor implements Interceptor {
    public static final MediaType b;

    /* renamed from: a, reason: collision with root package name */
    public OkHttpClient f4573a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/android/onesite/network/PreemptiveTokenRefreshInterceptor$Companion;", "", "Lokhttp3/MediaType;", "JSON_TYPE", "Lokhttp3/MediaType;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        MediaType.e.getClass();
        b = MediaType.Companion.a("application/json; charset=utf-8");
    }

    @Override // okhttp3.Interceptor
    public final Response a(RealInterceptorChain realInterceptorChain) {
        Request request = realInterceptorChain.e;
        if (b()) {
            if (this.f4573a == null) {
                throw new IllegalStateException("::client must be set after the okhttp client is initialised");
            }
            Response.Builder builder = new Response.Builder();
            builder.c = 401;
            builder.d = "Token has expired";
            builder.b = Protocol.i;
            ResponseBody.e.getClass();
            builder.g = ResponseBody.Companion.a("{}", b);
            Intrinsics.h(request, "request");
            builder.f26693a = request;
            Response responseA = builder.a();
            OkHttpClient okHttpClient = this.f4573a;
            if (okHttpClient == null) {
                Intrinsics.p("client");
                throw null;
            }
            Authenticator authenticator = okHttpClient.g;
            RealConnection realConnectionA = realInterceptorChain.a();
            Request requestA = authenticator.a(realConnectionA != null ? realConnectionA.g : null, responseA);
            if (requestA != null) {
                request = requestA;
            }
        }
        return realInterceptorChain.c(request);
    }

    public abstract boolean b();
}
