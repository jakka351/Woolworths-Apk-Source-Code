package au.com.woolworths.android.onesite.network;

import au.com.woolworths.graphql.subscriptions.sse.util.SseSafeInterceptor;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.logging.HttpLoggingInterceptor;
import okio.Buffer;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/network/CurlLoggingInterceptor;", "Lokhttp3/Interceptor;", "Companion", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CurlLoggingInterceptor implements Interceptor {
    public static final Charset b = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final HttpLoggingInterceptor.Logger f4564a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001c\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/android/onesite/network/CurlLoggingInterceptor$Companion;", "", "Ljava/nio/charset/Charset;", "kotlin.jvm.PlatformType", "UTF8", "Ljava/nio/charset/Charset;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public CurlLoggingInterceptor() {
        HttpLoggingInterceptor.Logger logger = HttpLoggingInterceptor.Logger.f26775a;
        Intrinsics.h(logger, "logger");
        this.f4564a = logger;
    }

    @Override // okhttp3.Interceptor
    public final Response a(RealInterceptorChain realInterceptorChain) {
        Request request = realInterceptorChain.e;
        String str = SseSafeInterceptor.Companion.a(realInterceptorChain) ? "curl -s -N" : "curl";
        String str2 = request.b;
        HttpUrl httpUrl = request.f26690a;
        String strO = androidx.camera.core.impl.b.o(str, " -X ", str2);
        Headers headers = request.c;
        boolean z = headers.b("X-APOLLO-OPERATION-NAME") != null;
        if (z) {
            strO = YU.a.g(YU.a.g(strO, " -H \"Content-Type: application/json\""), " -H \"Accept: application/json\"");
        }
        int size = headers.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            String strD = headers.d(i);
            String strI = headers.i(i);
            if ("Accept-Encoding".equalsIgnoreCase(strD) && "gzip".equalsIgnoreCase(strI)) {
                z2 = true;
            }
            strO = strO + " -H \"" + strD + ": " + strI + "\"";
        }
        RequestBody requestBody = request.d;
        if (requestBody != null) {
            Buffer buffer = new Buffer();
            requestBody.d(buffer);
            MediaType mediaTypeB = requestBody.b();
            Charset charsetA = b;
            if (mediaTypeB != null) {
                charsetA = mediaTypeB.a(charsetA);
            }
            if (z) {
                Intrinsics.e(charsetA);
                strO = androidx.constraintlayout.core.state.a.i(strO, " --data-binary '", StringsKt.Q(buffer.I0(charsetA), "\n", "\\n", false), "'");
            } else {
                Intrinsics.e(charsetA);
                strO = androidx.constraintlayout.core.state.a.i(strO, " --data $'", StringsKt.Q(buffer.I0(charsetA), "\n", "\\n", false), "'");
            }
        }
        String strG = strO + (z2 ? " --compressed " : " ") + httpUrl;
        if (!SseSafeInterceptor.Companion.a(realInterceptorChain)) {
            strG = YU.a.g(strG, " | json_pp");
        }
        String str3 = "╭--- cURL (" + httpUrl + ")";
        HttpLoggingInterceptor.Logger logger = this.f4564a;
        logger.a(str3);
        logger.a(strG);
        logger.a("╰--- (copy and paste the above line to a terminal)");
        return realInterceptorChain.c(request);
    }
}
