package au.com.woolworths.android.onesite.network;

import kotlin.Metadata;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/network/GraphQlPerformanceTrackingInterceptor;", "Lokhttp3/Interceptor;", "Companion", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GraphQlPerformanceTrackingInterceptor implements Interceptor {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/android/onesite/network/GraphQlPerformanceTrackingInterceptor$Companion;", "", "", "QUERY_PARAM_OPERATION", "Ljava/lang/String;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Override // okhttp3.Interceptor
    public final Response a(RealInterceptorChain realInterceptorChain) {
        Request request = realInterceptorChain.e;
        String strB = request.c.b("X-APOLLO-OPERATION-NAME");
        if (strB != null) {
            HttpUrl.Builder builderG = request.f26690a.g();
            builderG.a("operationName", strB);
            HttpUrl httpUrlD = builderG.d();
            Request.Builder builderB = request.b();
            builderB.f26691a = httpUrlD;
            request = new Request(builderB);
        }
        return realInterceptorChain.c(request);
    }
}
