package au.com.woolworths.auth.auth0;

import android.content.Context;
import android.util.Log;
import au.com.woolworths.android.onesite.analytics.adobe.AdobeAnalyticsInteractor;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import au.com.woolworths.auth.api.AuthConfig;
import au.com.woolworths.auth.api.AuthManagerApi;
import com.auth0.android.Auth0;
import com.auth0.android.authentication.AuthenticationAPIClient;
import com.auth0.android.authentication.AuthenticationException;
import com.auth0.android.authentication.storage.CredentialsManager;
import com.auth0.android.authentication.storage.SharedPreferencesStorage;
import com.auth0.android.callback.Callback;
import com.auth0.android.provider.WebAuthProvider;
import com.auth0.android.result.Credentials;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import timber.log.Timber;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/auth/auth0/Auth0AuthManager;", "Lau/com/woolworths/auth/api/AuthManagerApi;", "auth-auth0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class Auth0AuthManager implements AuthManagerApi {

    /* renamed from: a, reason: collision with root package name */
    public final AuthConfig f4604a;
    public final AdobeAnalyticsInteractor b;
    public final Context c;
    public Auth0 d;
    public CredentialsManager e;

    public Auth0AuthManager(AuthConfig authConfig, AdobeAnalyticsInteractor adobeAnalyticsInteractor, Context applicationContext) {
        Intrinsics.h(authConfig, "authConfig");
        Intrinsics.h(adobeAnalyticsInteractor, "adobeAnalyticsInteractor");
        Intrinsics.h(applicationContext, "applicationContext");
        this.f4604a = authConfig;
        this.b = adobeAnalyticsInteractor;
        this.c = applicationContext;
    }

    @Override // au.com.woolworths.auth.api.AuthManagerApi
    public final Object a(Continuation continuation) {
        if (this.d == null) {
            g(this.c);
        }
        CredentialsManager credentialsManager = this.e;
        if (credentialsManager != null) {
            return Boolean.valueOf(credentialsManager.c());
        }
        Intrinsics.p("credentialsManager");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // au.com.woolworths.auth.api.AuthManagerApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof au.com.woolworths.auth.auth0.Auth0AuthManager$getAccessToken$1
            if (r0 == 0) goto L13
            r0 = r11
            au.com.woolworths.auth.auth0.Auth0AuthManager$getAccessToken$1 r0 = (au.com.woolworths.auth.auth0.Auth0AuthManager$getAccessToken$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.auth.auth0.Auth0AuthManager$getAccessToken$1 r0 = new au.com.woolworths.auth.auth0.Auth0AuthManager$getAccessToken$1
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.b(r11)     // Catch: com.auth0.android.authentication.storage.CredentialsManagerException -> L27
            goto L6f
        L27:
            r0 = move-exception
            r11 = r0
            goto L7d
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L32:
            kotlin.ResultKt.b(r11)
            com.auth0.android.Auth0 r11 = r10.d
            if (r11 != 0) goto L3e
            android.content.Context r11 = r10.c
            r10.g(r11)
        L3e:
            com.auth0.android.authentication.storage.CredentialsManager r5 = r10.e     // Catch: com.auth0.android.authentication.storage.CredentialsManagerException -> L27
            if (r5 == 0) goto L76
            r0.r = r3     // Catch: com.auth0.android.authentication.storage.CredentialsManagerException -> L27
            java.util.Map r7 = kotlin.collections.MapsKt.d()     // Catch: com.auth0.android.authentication.storage.CredentialsManagerException -> L27
            java.util.Map r8 = kotlin.collections.MapsKt.d()     // Catch: com.auth0.android.authentication.storage.CredentialsManagerException -> L27
            kotlinx.coroutines.CancellableContinuationImpl r11 = new kotlinx.coroutines.CancellableContinuationImpl     // Catch: com.auth0.android.authentication.storage.CredentialsManagerException -> L27
            kotlin.coroutines.Continuation r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.b(r0)     // Catch: com.auth0.android.authentication.storage.CredentialsManagerException -> L27
            r11.<init>(r3, r0)     // Catch: com.auth0.android.authentication.storage.CredentialsManagerException -> L27
            r11.o()     // Catch: com.auth0.android.authentication.storage.CredentialsManagerException -> L27
            com.auth0.android.authentication.storage.CredentialsManager$awaitCredentials$6$1 r6 = new com.auth0.android.authentication.storage.CredentialsManager$awaitCredentials$6$1     // Catch: com.auth0.android.authentication.storage.CredentialsManagerException -> L27
            r6.<init>(r11)     // Catch: com.auth0.android.authentication.storage.CredentialsManagerException -> L27
            java.util.concurrent.ExecutorService r0 = r5.d     // Catch: com.auth0.android.authentication.storage.CredentialsManagerException -> L27
            androidx.camera.core.processing.a r4 = new androidx.camera.core.processing.a     // Catch: com.auth0.android.authentication.storage.CredentialsManagerException -> L27
            r9 = 3
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: com.auth0.android.authentication.storage.CredentialsManagerException -> L27
            r0.execute(r4)     // Catch: com.auth0.android.authentication.storage.CredentialsManagerException -> L27
            java.lang.Object r11 = r11.n()     // Catch: com.auth0.android.authentication.storage.CredentialsManagerException -> L27
            if (r11 != r1) goto L6f
            return r1
        L6f:
            com.auth0.android.result.Credentials r11 = (com.auth0.android.result.Credentials) r11     // Catch: com.auth0.android.authentication.storage.CredentialsManagerException -> L27
            java.lang.String r11 = r11.getAccessToken()     // Catch: com.auth0.android.authentication.storage.CredentialsManagerException -> L27
            return r11
        L76:
            java.lang.String r11 = "credentialsManager"
            kotlin.jvm.internal.Intrinsics.p(r11)     // Catch: com.auth0.android.authentication.storage.CredentialsManagerException -> L27
            r11 = 0
            throw r11     // Catch: com.auth0.android.authentication.storage.CredentialsManagerException -> L27
        L7d:
            au.com.woolworths.auth.auth0.Auth0CredentialException r0 = new au.com.woolworths.auth.auth0.Auth0CredentialException
            java.lang.String r1 = r11.getMessage()
            if (r1 != 0) goto L87
            java.lang.String r1 = "Error while getting Auth0 accessToken"
        L87:
            java.lang.Throwable r11 = r11.getCause()
            r0.<init>(r1, r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.auth.auth0.Auth0AuthManager.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // au.com.woolworths.auth.api.AuthManagerApi
    public final Object c(Context context, SuspendLambda suspendLambda) {
        if (this.d == null) {
            g(this.c);
        }
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(suspendLambda));
        cancellableContinuationImpl.o();
        Auth0 auth0 = this.d;
        if (auth0 == null) {
            Intrinsics.p("account");
            throw null;
        }
        String str = WebAuthProvider.f13671a;
        WebAuthProvider.LogoutBuilder logoutBuilder = new WebAuthProvider.LogoutBuilder(auth0);
        this.f4604a.getClass();
        logoutBuilder.b("app");
        logoutBuilder.a(context, new Callback<Void, AuthenticationException>() { // from class: au.com.woolworths.auth.auth0.Auth0AuthManager$logout$2$1
            @Override // com.auth0.android.callback.Callback
            public final void a(com.auth0.android.Auth0Exception auth0Exception) {
                AuthenticationException error = (AuthenticationException) auth0Exception;
                Intrinsics.h(error, "error");
                String message = error.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                cancellableContinuationImpl.resumeWith(ResultKt.a(new Auth0Exception(message, error.getCause())));
            }

            @Override // com.auth0.android.callback.Callback
            public final void onSuccess(Object obj) {
                CredentialsManager credentialsManager = this.e;
                if (credentialsManager == null) {
                    Intrinsics.p("credentialsManager");
                    throw null;
                }
                credentialsManager.b();
                cancellableContinuationImpl.resumeWith(Unit.f24250a);
            }
        });
        Object objN = cancellableContinuationImpl.n();
        return objN == CoroutineSingletons.d ? objN : Unit.f24250a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028  */
    @Override // au.com.woolworths.auth.api.AuthManagerApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(android.content.Context r5, java.lang.String r6, java.lang.Boolean r7, java.util.Map r8, kotlin.coroutines.Continuation r9) {
        /*
            r4 = this;
            com.auth0.android.Auth0 r0 = r4.d
            if (r0 != 0) goto L9
            android.content.Context r0 = r4.c
            r4.g(r0)
        L9:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r7 = kotlin.jvm.internal.Intrinsics.c(r7, r1)
            if (r7 != 0) goto L28
            com.auth0.android.authentication.storage.CredentialsManager r7 = r4.e
            if (r7 == 0) goto L21
            boolean r7 = r7.c()
            if (r7 != 0) goto L2f
            goto L28
        L21:
            java.lang.String r5 = "credentialsManager"
            kotlin.jvm.internal.Intrinsics.p(r5)
            r5 = 0
            throw r5
        L28:
            java.lang.String r7 = "prompt"
            java.lang.String r1 = "login"
            r0.put(r7, r1)
        L2f:
            if (r6 == 0) goto L3d
            int r7 = r6.length()
            if (r7 != 0) goto L38
            goto L3d
        L38:
            java.lang.String r7 = "login_hint"
            r0.put(r7, r6)
        L3d:
            au.com.woolworths.auth.api.AuthConfig r6 = r4.f4604a
            java.lang.String r7 = r6.a()
            int r7 = r7.length()
            if (r7 != 0) goto L4a
            goto L61
        L4a:
            java.lang.String r6 = r6.a()
            java.lang.String r7 = r5.getPackageName()
            java.lang.String r1 = "/android/"
            java.lang.String r2 = "/callback/signup"
            java.lang.String r3 = "app://"
            java.lang.String r6 = YU.a.j(r3, r6, r1, r7, r2)
            java.lang.String r7 = "ext-signupurl"
            r0.put(r7, r6)
        L61:
            au.com.woolworths.android.onesite.analytics.adobe.AdobeAnalyticsInteractor r6 = r4.b
            au.com.woolworths.android.onesite.analytics.adobe.AdobeAnalyticsRepository r6 = r6.c
            java.lang.String r6 = r6.a()
            boolean r7 = kotlin.text.StringsKt.D(r6)
            if (r7 == 0) goto L71
            java.lang.String r6 = "na"
        L71:
            java.lang.String r7 = "ext-adobeECID"
            r0.put(r7, r6)
            java.lang.String r6 = "ext-appversion"
            java.lang.String r7 = au.com.woolworths.android.onesite.extensions.ContextExtKt.c(r5)
            r0.put(r6, r7)
            if (r8 == 0) goto L84
            r0.putAll(r8)
        L84:
            kotlin.coroutines.jvm.internal.SuspendLambda r9 = (kotlin.coroutines.jvm.internal.SuspendLambda) r9
            java.lang.Object r5 = r4.h(r5, r0, r9)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.auth.auth0.Auth0AuthManager.d(android.content.Context, java.lang.String, java.lang.Boolean, java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // au.com.woolworths.auth.api.AuthManagerApi
    public final Object e(ContinuationImpl continuationImpl) {
        if (this.d == null) {
            g(this.c);
        }
        CredentialsManager credentialsManager = this.e;
        if (credentialsManager != null) {
            credentialsManager.b();
            return Unit.f24250a;
        }
        Intrinsics.p("credentialsManager");
        throw null;
    }

    @Override // au.com.woolworths.auth.api.AuthManagerApi
    public final Object f(Context context, Map map, Continuation continuation) {
        if (this.d == null) {
            g(this.c);
        }
        Pair pair = new Pair("prompt", "login");
        Pair pair2 = new Pair("screen_hint", "signup");
        String strA = this.b.c.a();
        if (StringsKt.D(strA)) {
            strA = "na";
        }
        Map mapJ = MapsKt.j(pair, pair2, new Pair("ext-adobeECID", strA), new Pair("ext-appversion", ContextExtKt.c(context)));
        if (map == null) {
            map = EmptyMap.d;
        }
        return h(context, MapsKt.m(mapJ, map), (SuspendLambda) continuation);
    }

    public final void g(Context context) {
        Intrinsics.h(context, "context");
        AuthConfig authConfig = this.f4604a;
        if (authConfig.b().length() == 0 || authConfig.c().length() == 0) {
            Timber.f27013a.b("Auth0 can't be initialized at this moment", new Object[0]);
            return;
        }
        Auth0 auth0 = new Auth0(authConfig.b(), authConfig.c());
        this.d = auth0;
        this.e = new CredentialsManager(new AuthenticationAPIClient(auth0), new SharedPreferencesStorage(context, 0));
    }

    public final Object h(Context context, LinkedHashMap linkedHashMap, SuspendLambda suspendLambda) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(suspendLambda));
        cancellableContinuationImpl.o();
        Auth0 auth0 = this.d;
        if (auth0 == null) {
            Intrinsics.p("account");
            throw null;
        }
        String str = WebAuthProvider.f13671a;
        WebAuthProvider.Builder builder = new WebAuthProvider.Builder(auth0);
        this.f4604a.getClass();
        Locale ROOT = Locale.ROOT;
        Intrinsics.g(ROOT, "ROOT");
        String lowerCase = "app".toLowerCase(ROOT);
        Intrinsics.g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        if (!"app".equals(lowerCase)) {
            Log.w(WebAuthProvider.f13671a, "Please provide the scheme in lowercase and make sure it's the same configured in the intent filter. Android expects the scheme to be lowercase.");
        }
        builder.d = "app";
        LinkedHashMap linkedHashMap2 = builder.b;
        linkedHashMap2.put("audience", "https://www.woolworths.com.au/auth/");
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str2 = (String) entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                linkedHashMap2.put(str2, value.toString());
            }
        }
        linkedHashMap2.put("scope", "openid offline_access");
        builder.a(context, new Callback<Credentials, AuthenticationException>() { // from class: au.com.woolworths.auth.auth0.Auth0AuthManager$openAuth0WebForm$2$1
            @Override // com.auth0.android.callback.Callback
            public final void a(com.auth0.android.Auth0Exception auth0Exception) {
                AuthenticationException error = (AuthenticationException) auth0Exception;
                Intrinsics.h(error, "error");
                String message = error.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                cancellableContinuationImpl.resumeWith(ResultKt.a(new Auth0Exception(message, error)));
            }

            @Override // com.auth0.android.callback.Callback
            public final void onSuccess(Object obj) {
                Credentials result = (Credentials) obj;
                Intrinsics.h(result, "result");
                CredentialsManager credentialsManager = this.e;
                if (credentialsManager == null) {
                    Intrinsics.p("credentialsManager");
                    throw null;
                }
                credentialsManager.d(result);
                cancellableContinuationImpl.resumeWith(new Auth0Identity(result));
            }
        });
        Object objN = cancellableContinuationImpl.n();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        return objN;
    }
}
