package au.com.woolworths.feature.shop.catalogue;

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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/CatalogueInterceptor;", "Lokhttp3/Interceptor;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CatalogueInterceptor implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    public final ConnectionManager f6777a;

    public CatalogueInterceptor(CatalogueConfigInteractorImpl catalogueConfigInteractorImpl, ConnectionManager connectionManager) {
        Intrinsics.h(connectionManager, "connectionManager");
        this.f6777a = connectionManager;
    }

    @Override // okhttp3.Interceptor
    public final Response a(RealInterceptorChain realInterceptorChain) throws NoConnectivityException {
        if (!this.f6777a.isConnected()) {
            throw new NoConnectivityException();
        }
        Request request = realInterceptorChain.e;
        HttpUrl.Builder builderG = request.f26690a.g();
        builderG.c("apikey", "w00lw0rth5A48E69B9C93E236B");
        builderG.c("format", "json");
        HttpUrl httpUrlD = builderG.d();
        Request.Builder builderB = request.b();
        builderB.f26691a = httpUrlD;
        return realInterceptorChain.c(new Request(builderB));
    }
}
