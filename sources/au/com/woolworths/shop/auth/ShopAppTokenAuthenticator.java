package au.com.woolworths.shop.auth;

import au.com.woolworths.android.onesite.analytics.FirebasePerfMonitor;
import au.com.woolworths.android.onesite.appdata.AppConfig;
import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.android.onesite.network.NetworkExceptions;
import au.com.woolworths.android.onesite.network.RefreshTokenListener;
import au.com.woolworths.auth.api.AuthManagerApi;
import au.com.woolworths.auth.auth0.Auth0AuthManager;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import com.google.gson.Gson;
import dagger.Lazy;
import java.util.ArrayList;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import okhttp3.Authenticator;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import retrofit2.HttpException;
import timber.log.Timber;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/auth/ShopAppTokenAuthenticator;", "Lokhttp3/Authenticator;", "Lau/com/woolworths/android/onesite/network/RefreshTokenListener;", "ShopAppTokenUnauthorizedException", "shop-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ShopAppTokenAuthenticator implements Authenticator, RefreshTokenListener {
    public final Gson b;
    public final Lazy c;
    public final AppConfig d;
    public final FirebasePerfMonitor e;
    public final ShopAccountInteractor f;
    public final Lazy g;
    public final AuthManagerApi h;
    public final NetworkExceptions i;
    public final DispatcherProvider j;
    public final ArrayList k;
    public final kotlin.Lazy l;
    public final kotlin.Lazy m;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/auth/ShopAppTokenAuthenticator$ShopAppTokenUnauthorizedException;", "Lretrofit2/HttpException;", "shop-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class ShopAppTokenUnauthorizedException extends HttpException {
    }

    public ShopAppTokenAuthenticator(Gson gson, Lazy okHttpClientLazy, AppConfig appConfig, FirebasePerfMonitor firebasePerfMonitor, ShopAccountInteractor accountInteractor, Lazy authInteractorLazy, Auth0AuthManager authManager, NetworkExceptions networkExceptions, DispatcherProvider dispatcherProvider) {
        Intrinsics.h(gson, "gson");
        Intrinsics.h(okHttpClientLazy, "okHttpClientLazy");
        Intrinsics.h(appConfig, "appConfig");
        Intrinsics.h(firebasePerfMonitor, "firebasePerfMonitor");
        Intrinsics.h(accountInteractor, "accountInteractor");
        Intrinsics.h(authInteractorLazy, "authInteractorLazy");
        Intrinsics.h(authManager, "authManager");
        Intrinsics.h(networkExceptions, "networkExceptions");
        Intrinsics.h(dispatcherProvider, "dispatcherProvider");
        this.b = gson;
        this.c = okHttpClientLazy;
        this.d = appConfig;
        this.e = firebasePerfMonitor;
        this.f = accountInteractor;
        this.g = authInteractorLazy;
        this.h = authManager;
        this.i = networkExceptions;
        this.j = dispatcherProvider;
        this.k = new ArrayList();
        final int i = 0;
        this.l = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.shop.auth.a
            public final /* synthetic */ ShopAppTokenAuthenticator e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (OkHttpClient) this.e.c.get();
                    default:
                        return (AuthInteractor) this.e.g.get();
                }
            }
        });
        final int i2 = 1;
        this.m = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.shop.auth.a
            public final /* synthetic */ ShopAppTokenAuthenticator e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (OkHttpClient) this.e.c.get();
                    default:
                        return (AuthInteractor) this.e.g.get();
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(au.com.woolworths.shop.auth.ShopAppTokenAuthenticator r4, java.lang.String r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            boolean r0 = r6 instanceof au.com.woolworths.shop.auth.ShopAppTokenAuthenticator$exchangeToken$1
            if (r0 == 0) goto L13
            r0 = r6
            au.com.woolworths.shop.auth.ShopAppTokenAuthenticator$exchangeToken$1 r0 = (au.com.woolworths.shop.auth.ShopAppTokenAuthenticator$exchangeToken$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.shop.auth.ShopAppTokenAuthenticator$exchangeToken$1 r0 = new au.com.woolworths.shop.auth.ShopAppTokenAuthenticator$exchangeToken$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.b(r6)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L27
            goto L45
        L27:
            r5 = move-exception
            goto L48
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.ResultKt.b(r6)
            kotlin.Lazy r6 = r4.m     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L27
            java.lang.Object r6 = r6.getD()     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L27
            au.com.woolworths.shop.auth.AuthInteractor r6 = (au.com.woolworths.shop.auth.AuthInteractor) r6     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L27
            r0.r = r3     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L27
            java.lang.Object r6 = r6.a(r5, r0)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L27
            if (r6 != r1) goto L45
            return r1
        L45:
            au.com.woolworths.shop.auth.data.MemberData r6 = (au.com.woolworths.shop.auth.data.MemberData) r6     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L27
            return r6
        L48:
            java.lang.Throwable r5 = r5.getCause()
            r6 = 0
            if (r5 == 0) goto L6b
            au.com.woolworths.android.onesite.network.NetworkExceptions r4 = r4.i
            r4.getClass()
            retrofit2.HttpException r4 = au.com.woolworths.android.onesite.network.NetworkExceptions.a(r5)
            if (r4 == 0) goto L6b
            int r4 = r4.d
            r5 = 401(0x191, float:5.62E-43)
            if (r4 != r5) goto L6b
            timber.log.Timber$Forest r4 = timber.log.Timber.f27013a
            java.lang.String r5 = "Failed to exchange token due to authorization error"
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r4.o(r5, r6)
            r4 = 0
            return r4
        L6b:
            timber.log.Timber$Forest r4 = timber.log.Timber.f27013a
            java.lang.String r5 = "Failed to exchange token due to other error"
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r4.o(r5, r6)
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Refresh access token failed while exchanging-token"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.auth.ShopAppTokenAuthenticator.b(au.com.woolworths.shop.auth.ShopAppTokenAuthenticator, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Throwable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0081 -> B:20:0x0084). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(au.com.woolworths.shop.auth.ShopAppTokenAuthenticator r4, java.lang.String r5, java.lang.RuntimeException r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r4.getClass()
            boolean r0 = r7 instanceof au.com.woolworths.shop.auth.ShopAppTokenAuthenticator$notifyForceLogout$1
            if (r0 == 0) goto L16
            r0 = r7
            au.com.woolworths.shop.auth.ShopAppTokenAuthenticator$notifyForceLogout$1 r0 = (au.com.woolworths.shop.auth.ShopAppTokenAuthenticator$notifyForceLogout$1) r0
            int r1 = r0.u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.u = r1
            goto L1b
        L16:
            au.com.woolworths.shop.auth.ShopAppTokenAuthenticator$notifyForceLogout$1 r0 = new au.com.woolworths.shop.auth.ShopAppTokenAuthenticator$notifyForceLogout$1
            r0.<init>(r4, r7)
        L1b:
            java.lang.Object r7 = r0.s
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.u
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            au.com.woolworths.android.onesite.network.RefreshTokenListener$Callback r4 = r0.r
            java.util.Iterator r5 = r0.q
            java.lang.Throwable r6 = r0.p
            kotlin.ResultKt.b(r7)
            goto L84
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L38:
            kotlin.ResultKt.b(r7)
            java.lang.String r7 = "shopperId"
            kotlin.jvm.internal.Intrinsics.h(r5, r7)
            java.lang.String r7 = "error"
            kotlin.jvm.internal.Intrinsics.h(r6, r7)
            timber.log.Timber$Forest r7 = timber.log.Timber.f27013a
            java.lang.String r2 = "force logging in as guest -- Shopper ID: "
            java.lang.String r5 = r2.concat(r5)
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r7.o(r5, r2)
            au.com.woolworths.foundation.bark.Bark$Companion r5 = au.com.woolworths.foundation.bark.Bark.f8483a
            au.com.woolworths.foundation.bark.common.ReportOwner$Squad r5 = au.com.woolworths.foundation.bark.common.ReportOwner.Squad.m
            au.com.woolworths.foundation.bark.common.ReportOwner r5 = r5.a()
            java.lang.String r7 = "Force logging out user"
            r2 = 24
            au.com.woolworths.foundation.bark.Bark.Barker.h(r5, r6, r7, r2)
            java.util.ArrayList r4 = r4.k
            java.util.Iterator r4 = r4.iterator()
            r5 = r4
        L69:
            boolean r4 = r5.hasNext()
            if (r4 == 0) goto L88
            java.lang.Object r4 = r5.next()
            au.com.woolworths.android.onesite.network.RefreshTokenListener$Callback r4 = (au.com.woolworths.android.onesite.network.RefreshTokenListener.Callback) r4
            r0.p = r6
            r0.q = r5
            r0.r = r4
            r0.u = r3
            java.lang.Object r7 = r4.c(r0)
            if (r7 != r1) goto L84
            return r1
        L84:
            r4.a(r6)
            goto L69
        L88:
            kotlin.Unit r4 = kotlin.Unit.f24250a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.auth.ShopAppTokenAuthenticator.c(au.com.woolworths.shop.auth.ShopAppTokenAuthenticator, java.lang.String, java.lang.RuntimeException, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // okhttp3.Authenticator
    public final Request a(Route route, Response response) {
        Request request = response.d;
        String str = request.f26690a.i;
        int iD = SequencesKt.d(SequencesKt.m(response, new au.com.woolworths.android.onesite.analytics.a11y.a(14)));
        Object objB = request.c.b("x-apollo-operation-name");
        if (objB == null) {
            objB = request.f26690a;
        }
        if (!StringsKt.o(str, "wow/v2/commerce/token", false) && !StringsKt.v(str, "wow/v2/commerce/guest", false) && !StringsKt.v(str, "wow/woolworthsrewards/v3/login", false)) {
            if (!StringsKt.v(str, this.d.d() + "login/user", false) && !StringsKt.v(str, "wow/v2/commerce/token-exchange", false) && !StringsKt.v(str, "wow/v2/commerce/config", false)) {
                if (iD <= 3) {
                    FirebasePerfMonitor firebasePerfMonitor = this.e;
                    firebasePerfMonitor.c("token_refresh_time");
                    FirebasePerfMonitor.b(firebasePerfMonitor, "token_refresh_on_load");
                    String strD = d(request);
                    firebasePerfMonitor.d("token_refresh_time");
                    if (strD != null) {
                        Timber.f27013a.b("Access token renewed for " + objB + " in the attempt no " + iD, new Object[0]);
                        String strConcat = "Bearer ".concat(strD);
                        Request.Builder builderB = request.b();
                        builderB.c.g("Authorization");
                        builderB.a("Authorization", strConcat);
                        return new Request(builderB);
                    }
                } else {
                    Bark.Companion companion = Bark.f8483a;
                    Bark.f8483a.f(ReportOwner.Squad.m.a(), "Service is failing with fresh token for " + objB, null);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized java.lang.String d(okhttp3.Request r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            if (r5 == 0) goto L17
            java.lang.String r1 = "Authorization"
            okhttp3.Headers r2 = r5.c     // Catch: java.lang.Throwable -> L15
            java.lang.String r1 = r2.b(r1)     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L17
            java.lang.String r2 = "Bearer "
            java.lang.String r1 = kotlin.text.StringsKt.L(r2, r1)     // Catch: java.lang.Throwable -> L15
            goto L18
        L15:
            r5 = move-exception
            goto L78
        L17:
            r1 = r0
        L18:
            au.com.woolworths.shop.auth.ShopAccountInteractor r2 = r4.f     // Catch: java.lang.Throwable -> L15
            au.com.woolworths.android.onesite.models.authentication.Member r2 = r2.n()     // Catch: java.lang.Throwable -> L15
            if (r2 == 0) goto L25
            java.lang.String r2 = r2.getAccessToken()     // Catch: java.lang.Throwable -> L15
            goto L26
        L25:
            r2 = r0
        L26:
            kotlin.jvm.internal.Ref$ObjectRef r3 = new kotlin.jvm.internal.Ref$ObjectRef     // Catch: java.lang.Throwable -> L15
            r3.<init>()     // Catch: java.lang.Throwable -> L15
            if (r5 == 0) goto L37
            boolean r5 = kotlin.jvm.internal.Intrinsics.c(r1, r2)     // Catch: java.lang.Throwable -> L15
            if (r5 == 0) goto L34
            goto L37
        L34:
            r3.d = r2     // Catch: java.lang.Throwable -> L15
            goto L72
        L37:
            au.com.woolworths.shop.auth.ShopAccountInteractor r5 = r4.f     // Catch: java.lang.Throwable -> L15
            au.com.woolworths.android.onesite.models.authentication.Member r5 = r5.n()     // Catch: java.lang.Throwable -> L15
            r1 = 0
            if (r5 == 0) goto L69
            au.com.woolworths.shop.auth.ShopAppTokenAuthenticator$requestRefreshToken$1 r2 = new au.com.woolworths.shop.auth.ShopAppTokenAuthenticator$requestRefreshToken$1     // Catch: java.lang.Throwable -> L15 java.lang.Exception -> L49
            r2.<init>(r5, r4, r3, r0)     // Catch: java.lang.Throwable -> L15 java.lang.Exception -> L49
            kotlinx.coroutines.BuildersKt.e(r2)     // Catch: java.lang.Throwable -> L15 java.lang.Exception -> L49
            goto L72
        L49:
            r5 = move-exception
            timber.log.Timber$Forest r0 = timber.log.Timber.f27013a     // Catch: java.lang.Throwable -> L15
            java.lang.String r2 = "refresh token failed with generic exception."
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L15
            r0.o(r2, r1)     // Catch: java.lang.Throwable -> L15
            java.util.ArrayList r0 = r4.k     // Catch: java.lang.Throwable -> L15
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L15
        L59:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L72
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L15
            au.com.woolworths.android.onesite.network.RefreshTokenListener$Callback r1 = (au.com.woolworths.android.onesite.network.RefreshTokenListener.Callback) r1     // Catch: java.lang.Throwable -> L15
            r1.a(r5)     // Catch: java.lang.Throwable -> L15
            goto L59
        L69:
            timber.log.Timber$Forest r5 = timber.log.Timber.f27013a     // Catch: java.lang.Throwable -> L15
            java.lang.String r0 = "user is not logged in"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L15
            r5.h(r0, r1)     // Catch: java.lang.Throwable -> L15
        L72:
            java.lang.Object r5 = r3.d     // Catch: java.lang.Throwable -> L15
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L15
            monitor-exit(r4)
            return r5
        L78:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L15
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.auth.ShopAppTokenAuthenticator.d(okhttp3.Request):java.lang.String");
    }
}
