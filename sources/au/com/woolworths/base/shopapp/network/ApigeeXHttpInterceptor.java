package au.com.woolworths.base.shopapp.network;

import YU.a;
import android.app.Application;
import android.os.Build;
import au.com.woolworths.android.onesite.appdata.AccountInteractor;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import au.com.woolworths.android.onesite.models.authentication.Member;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.utils.ConnectionManager;
import au.com.woolworths.auth.auth0.Auth0AuthManager;
import au.com.woolworths.auth.auth0.Auth0CredentialException;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;
import timber.log.Timber;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/base/shopapp/network/ApigeeXHttpInterceptor;", "Lokhttp3/Interceptor;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ApigeeXHttpInterceptor implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    public final Application f4630a;
    public final ConnectionManager b;
    public final Auth0AuthManager c;
    public final AccountInteractor d;

    public ApigeeXHttpInterceptor(Application application, ConnectionManager connectionManager, Auth0AuthManager authManager, ShopAccountInteractor accountInteractor) {
        Intrinsics.h(connectionManager, "connectionManager");
        Intrinsics.h(authManager, "authManager");
        Intrinsics.h(accountInteractor, "accountInteractor");
        this.f4630a = application;
        this.b = connectionManager;
        this.c = authManager;
        this.d = accountInteractor;
    }

    @Override // okhttp3.Interceptor
    public final Response a(RealInterceptorChain realInterceptorChain) throws Throwable {
        if (!this.b.isConnected()) {
            throw new NoConnectivityException();
        }
        Member memberN = this.d.n();
        if (memberN != null && memberN.isGuestUser()) {
            throw new InvalidStateException("Auth0 token only available for logged-in users.");
        }
        Request.Builder builderB = realInterceptorChain.e.b();
        builderB.c.g("User-Agent");
        Application application = this.f4630a;
        String strC = ContextExtKt.c(application);
        String str = (application.getResources().getConfiguration().screenLayout & 15) >= 3 ? "AndroidTablet" : "AndroidPhone";
        int i = Build.VERSION.SDK_INT;
        StringBuilder sbV = a.v("Supers/", strC, " (", str, "; ");
        sbV.append(i);
        sbV.append(")");
        builderB.a("User-Agent", sbV.toString());
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        try {
            BuildersKt.d(EmptyCoroutineContext.d, new ApigeeXHttpInterceptor$getAccessToken$1(objectRef, this, null));
            String str2 = (String) objectRef.d;
            if (str2 != null) {
                builderB.a("Authorization", "Bearer ".concat(str2));
            }
            return realInterceptorChain.c(new Request(builderB));
        } catch (Auth0CredentialException e) {
            Timber.f27013a.o(a.h("Failed to get Auth0 token due to error [", e.b(), "]. Will be retried."), new Object[0]);
            String message = "Failed to get Auth0 token due to error [" + e.b() + "].";
            Intrinsics.h(message, "message");
            throw new InvalidStateException(message);
        }
    }
}
