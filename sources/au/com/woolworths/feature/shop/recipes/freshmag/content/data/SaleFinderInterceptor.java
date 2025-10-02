package au.com.woolworths.feature.shop.recipes.freshmag.content.data;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.utils.ConnectionManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/freshmag/content/data/SaleFinderInterceptor;", "Lokhttp3/Interceptor;", "Companion", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SaleFinderInterceptor implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    public final ConnectionManager f8028a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/freshmag/content/data/SaleFinderInterceptor$Companion;", "", "", "PARAM_API_KEY", "Ljava/lang/String;", "PARAM_FORMAT", "JSON", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public SaleFinderInterceptor(SaleFinderConfigInteractor saleFinderConfigInteractor, ConnectionManager connectionManager) {
        Intrinsics.h(connectionManager, "connectionManager");
        this.f8028a = connectionManager;
    }

    @Override // okhttp3.Interceptor
    public final Response a(RealInterceptorChain realInterceptorChain) throws NoConnectivityException {
        if (!this.f8028a.isConnected()) {
            throw new NoConnectivityException();
        }
        Request request = realInterceptorChain.e;
        HttpUrl.Builder builderG = request.f26690a.g();
        builderG.c("apikey", "wwm4gs865DF26D9FB65137");
        builderG.c("format", "json");
        HttpUrl httpUrlD = builderG.d();
        Request.Builder builderB = request.b();
        builderB.f26691a = httpUrlD;
        return realInterceptorChain.c(new Request(builderB));
    }
}
