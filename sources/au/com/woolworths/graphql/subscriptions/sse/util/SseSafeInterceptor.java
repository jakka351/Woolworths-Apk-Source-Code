package au.com.woolworths.graphql.subscriptions.sse.util;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.infra.rest.RequestBuilder;
import okhttp3.Interceptor;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/graphql/subscriptions/sse/util/SseSafeInterceptor;", "Lokhttp3/Interceptor;", "Companion", "sse-protocol"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SseSafeInterceptor implements Interceptor {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/graphql/subscriptions/sse/util/SseSafeInterceptor$Companion;", "", "sse-protocol"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public static boolean a(RealInterceptorChain realInterceptorChain) {
            return Intrinsics.c(realInterceptorChain.e.c.b(RequestBuilder.ACCEPT), "text/event-stream");
        }
    }

    @Override // okhttp3.Interceptor
    public final Response a(RealInterceptorChain realInterceptorChain) {
        if (Companion.a(realInterceptorChain)) {
            return realInterceptorChain.c(realInterceptorChain.e);
        }
        throw null;
    }
}
