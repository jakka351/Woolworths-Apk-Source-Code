package au.com.woolworths.android.onesite.app;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.android.onesite.app.BaseShopApplication$newImageLoader$lambda$10$lambda$9$$inlined$-addNetworkInterceptor$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class BaseShopApplication$newImageLoader$lambda$10$lambda$9$$inlined$addNetworkInterceptor$1 implements Interceptor {
    @Override // okhttp3.Interceptor
    public final Response a(RealInterceptorChain realInterceptorChain) {
        Request request = realInterceptorChain.e;
        Request.Builder builderB = request.b();
        String property = System.getProperty("http.agent");
        if (property == null) {
            property = "";
        }
        builderB.c("User-Agent", property);
        if (StringsKt.W(request.f26690a.d, "uat-assets", false)) {
            builderB.c("uat-assets-access", "QmL~:n6y!Em?8f2F");
        }
        return realInterceptorChain.c(new Request(builderB));
    }
}
