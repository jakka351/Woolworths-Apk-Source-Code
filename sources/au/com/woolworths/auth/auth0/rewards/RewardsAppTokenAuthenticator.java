package au.com.woolworths.auth.auth0.rewards;

import au.com.woolworths.android.onesite.analytics.FirebasePerfMonitor;
import au.com.woolworths.android.onesite.appdata.AppConfig;
import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsTokenInfo;
import au.com.woolworths.android.onesite.network.NetworkExceptions;
import au.com.woolworths.android.onesite.repository.b;
import au.com.woolworths.auth.api.AuthManagerApi;
import au.com.woolworths.auth.auth0.Auth0AuthManager;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import com.google.gson.Gson;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import okhttp3.Authenticator;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import timber.log.Timber;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/auth/auth0/rewards/RewardsAppTokenAuthenticator;", "Lokhttp3/Authenticator;", "TokenRefreshListener", "auth-auth0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RewardsAppTokenAuthenticator implements Authenticator {
    public final AppConfig b;
    public final Gson c;
    public final FirebasePerfMonitor d;
    public final DispatcherProvider e;
    public final FeatureToggleManager f;
    public final AuthManagerApi g;
    public final NetworkExceptions h;
    public final Lazy i;
    public final Lazy j;
    public final ArrayList k;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/auth/auth0/rewards/RewardsAppTokenAuthenticator$TokenRefreshListener;", "", "auth-auth0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface TokenRefreshListener {
        void a();
    }

    public RewardsAppTokenAuthenticator(final dagger.Lazy okHttpClientLazy, final dagger.Lazy rewardsAccountInteractorLazy, AppConfig appConfig, Gson gson, FirebasePerfMonitor firebasePerfMonitor, DispatcherProvider dispatcherProvider, FeatureToggleManager featureToggleManager, Auth0AuthManager authManager, NetworkExceptions networkExceptions) {
        Intrinsics.h(okHttpClientLazy, "okHttpClientLazy");
        Intrinsics.h(rewardsAccountInteractorLazy, "rewardsAccountInteractorLazy");
        Intrinsics.h(appConfig, "appConfig");
        Intrinsics.h(gson, "gson");
        Intrinsics.h(firebasePerfMonitor, "firebasePerfMonitor");
        Intrinsics.h(dispatcherProvider, "dispatcherProvider");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(authManager, "authManager");
        Intrinsics.h(networkExceptions, "networkExceptions");
        this.b = appConfig;
        this.c = gson;
        this.d = firebasePerfMonitor;
        this.e = dispatcherProvider;
        this.f = featureToggleManager;
        this.g = authManager;
        this.h = networkExceptions;
        final int i = 0;
        this.i = LazyKt.b(new Function0() { // from class: au.com.woolworths.auth.auth0.rewards.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (OkHttpClient) okHttpClientLazy.get();
                    default:
                        return (RewardsAccountInteractor) okHttpClientLazy.get();
                }
            }
        });
        final int i2 = 1;
        this.j = LazyKt.b(new Function0() { // from class: au.com.woolworths.auth.auth0.rewards.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (OkHttpClient) rewardsAccountInteractorLazy.get();
                    default:
                        return (RewardsAccountInteractor) rewardsAccountInteractorLazy.get();
                }
            }
        });
        this.k = new ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(au.com.woolworths.auth.auth0.rewards.RewardsAppTokenAuthenticator r5, java.lang.String r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            boolean r0 = r7 instanceof au.com.woolworths.auth.auth0.rewards.RewardsAppTokenAuthenticator$exchangeToken$1
            if (r0 == 0) goto L13
            r0 = r7
            au.com.woolworths.auth.auth0.rewards.RewardsAppTokenAuthenticator$exchangeToken$1 r0 = (au.com.woolworths.auth.auth0.rewards.RewardsAppTokenAuthenticator$exchangeToken$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.auth.auth0.rewards.RewardsAppTokenAuthenticator$exchangeToken$1 r0 = new au.com.woolworths.auth.auth0.rewards.RewardsAppTokenAuthenticator$exchangeToken$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.b(r7)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28
            goto L42
        L28:
            r6 = move-exception
            goto L5e
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            kotlin.ResultKt.b(r7)
            au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor r7 = r5.c()     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28
            r0.r = r3     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28
            java.lang.Object r7 = r7.exchangeToken(r6, r4, r0)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28
            if (r7 != r1) goto L42
            return r1
        L42:
            au.com.woolworths.android.onesite.network.Component r7 = (au.com.woolworths.android.onesite.network.Component) r7     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28
            java.lang.Object r6 = r7.b()     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28
            au.com.woolworths.android.onesite.modules.rewards.data.RewardsLoginSuccessData r6 = (au.com.woolworths.android.onesite.modules.rewards.data.RewardsLoginSuccessData) r6     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28
            java.lang.String r7 = "<this>"
            kotlin.jvm.internal.Intrinsics.h(r6, r7)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28
            au.com.woolworths.android.onesite.network.Component r6 = r6.getTokenData()     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28
            java.lang.Object r6 = r6.b()     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28
            au.com.woolworths.android.onesite.modules.rewards.data.RewardsTokenData r6 = (au.com.woolworths.android.onesite.modules.rewards.data.RewardsTokenData) r6     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28
            au.com.woolworths.android.onesite.modules.rewards.data.RewardsTokenAndCardInfo r5 = au.com.woolworths.android.onesite.modules.rewards.data.RewardsTokenDataKt.a(r6)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L28
            return r5
        L5e:
            java.lang.Throwable r6 = r6.getCause()
            if (r6 == 0) goto L80
            au.com.woolworths.android.onesite.network.NetworkExceptions r5 = r5.h
            r5.getClass()
            retrofit2.HttpException r5 = au.com.woolworths.android.onesite.network.NetworkExceptions.a(r6)
            if (r5 == 0) goto L80
            int r5 = r5.d
            r6 = 401(0x191, float:5.62E-43)
            if (r5 != r6) goto L80
            timber.log.Timber$Forest r5 = timber.log.Timber.f27013a
            java.lang.String r6 = "Failed to exchange token due to authorization error"
            java.lang.Object[] r7 = new java.lang.Object[r4]
            r5.o(r6, r7)
            r5 = 0
            return r5
        L80:
            timber.log.Timber$Forest r5 = timber.log.Timber.f27013a
            java.lang.String r6 = "Failed to exchange token due to other error"
            java.lang.Object[] r7 = new java.lang.Object[r4]
            r5.o(r6, r7)
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Refresh access token failed while exchanging-token"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.auth.auth0.rewards.RewardsAppTokenAuthenticator.b(au.com.woolworths.auth.auth0.rewards.RewardsAppTokenAuthenticator, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // okhttp3.Authenticator
    public final Request a(Route route, Response response) {
        Request request = response.d;
        HttpUrl httpUrl = request.f26690a;
        Headers headers = request.c;
        String str = httpUrl.i;
        if (!StringsKt.o(str, "rewards/token", false) && !StringsKt.o(str, "rewards/token-exchange", false)) {
            int iD = SequencesKt.d(SequencesKt.m(response, new b(4)));
            Object objB = headers.b("x-apollo-operation-name");
            if (objB == null) {
                objB = request.f26690a;
            }
            if (iD <= 3) {
                FirebasePerfMonitor firebasePerfMonitor = this.d;
                firebasePerfMonitor.c("token_refresh_time");
                String strB = headers.b("Authorization");
                String strE = e(strB != null ? StringsKt.L("Bearer ", strB) : null);
                firebasePerfMonitor.d("token_refresh_time");
                if (strE != null) {
                    Timber.f27013a.b("Access token renewed as " + objB + " failed, attempt " + iD + " at the original request", new Object[0]);
                    Request.Builder builderB = request.b();
                    builderB.c.g("Authorization");
                    builderB.a("Authorization", "Bearer ".concat(strE));
                    return new Request(builderB);
                }
            } else {
                Bark.Companion companion = Bark.f8483a;
                Bark.f8483a.f(new ReportOwner(ReportOwner.Squad.d), "Service is failing with fresh token for " + objB, null);
            }
        }
        return null;
    }

    public final RewardsAccountInteractor c() {
        return (RewardsAccountInteractor) this.j.getD();
    }

    public final void d(IllegalStateException illegalStateException) {
        Timber.f27013a.o(YU.a.A("force logging in as guest -- HashCRN : ", c().getVisitorId()), new Object[0]);
        Bark.Companion companion = Bark.f8483a;
        ReportOwner reportOwner = new ReportOwner(ReportOwner.Squad.m);
        if (illegalStateException == null) {
            illegalStateException = new IllegalStateException("The refresh token request failed. Forcing the user to log out.");
        }
        Bark.Barker.h(reportOwner, illegalStateException, "Force logging out user", 24);
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((TokenRefreshListener) it.next()).a();
        }
    }

    public final synchronized String e(String str) {
        Ref.ObjectRef objectRef;
        try {
            RewardsTokenInfo tokenData = c().getTokenData();
            objectRef = new Ref.ObjectRef();
            if (tokenData == null) {
                Timber.f27013a.h("User is not logged in", new Object[0]);
                objectRef.d = null;
            } else if (Intrinsics.c(str, tokenData.getAccessToken())) {
                try {
                    BuildersKt.d(EmptyCoroutineContext.d, new RewardsAppTokenAuthenticator$requestAccessToken$1(this, tokenData, objectRef, null));
                } catch (IOException e) {
                    Timber.f27013a.n("Refresh access token api call failed to execute", e, new Object[0]);
                } catch (RuntimeException e2) {
                    Timber.f27013a.p(e2);
                }
            } else {
                objectRef.d = tokenData.getAccessToken();
            }
        } catch (Throwable th) {
            throw th;
        }
        return (String) objectRef.d;
    }
}
