package com.auth0.android.provider;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.auth0.android.Auth0;
import com.auth0.android.Auth0Exception;
import com.auth0.android.authentication.AuthenticationAPIClient;
import com.auth0.android.authentication.AuthenticationException;
import com.auth0.android.authentication.ParameterBuilder;
import com.auth0.android.callback.AuthenticationCallback;
import com.auth0.android.callback.Callback;
import com.auth0.android.request.HttpMethod;
import com.auth0.android.request.internal.BaseRequest;
import com.auth0.android.request.internal.GsonAdapter;
import com.auth0.android.request.internal.Jwt;
import com.auth0.android.request.internal.RequestFactory;
import com.auth0.android.result.Credentials;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/auth0/android/provider/OAuthManager;", "Lcom/auth0/android/provider/ResumableManager;", "Companion", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OAuthManager extends ResumableManager {

    /* renamed from: a, reason: collision with root package name */
    public final Callback f13664a;
    public final LinkedHashMap b;
    public final HashMap c;
    public final CustomTabsOptions d;
    public final AuthenticationAPIClient e;
    public PKCE f;
    public String g;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0014\u0010\u0014\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0004R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0004R\u0014\u0010\u0017\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0004R\u0014\u0010\u0018\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0004R\u0014\u0010\u0019\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0004R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0004R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0004R\u0014\u0010\u001c\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0004R\u001c\u0010\u001e\u001a\n \u001d*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0004¨\u0006\u001f"}, d2 = {"Lcom/auth0/android/provider/OAuthManager$Companion;", "", "", "DEFAULT_SCOPE", "Ljava/lang/String;", "ERROR_VALUE_ACCESS_DENIED", "ERROR_VALUE_ID_TOKEN_VALIDATION_FAILED", "ERROR_VALUE_INVALID_CONFIGURATION", "ERROR_VALUE_LOGIN_REQUIRED", "ERROR_VALUE_UNAUTHORIZED", "KEY_AUTH0_CLIENT_INFO", "KEY_CLIENT_ID", "KEY_CODE", "KEY_CODE_CHALLENGE", "KEY_CODE_CHALLENGE_METHOD", "KEY_CONNECTION", "KEY_ERROR", "KEY_ERROR_DESCRIPTION", "KEY_INVITATION", "KEY_MAX_AGE", "KEY_NONCE", "KEY_ORGANIZATION", "KEY_REDIRECT_URI", "KEY_RESPONSE_TYPE", "KEY_SCOPE", "KEY_STATE", "METHOD_SHA_256", "REQUIRED_SCOPE", "RESPONSE_TYPE_CODE", "kotlin.jvm.PlatformType", "TAG", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    public OAuthManager(Auth0 account, Callback callback, LinkedHashMap parameters, CustomTabsOptions ctOptions) {
        Intrinsics.h(account, "account");
        Intrinsics.h(parameters, "parameters");
        Intrinsics.h(ctOptions, "ctOptions");
        this.f13664a = callback;
        this.c = new HashMap();
        LinkedHashMap linkedHashMapS = MapsKt.s(parameters);
        this.b = linkedHashMapS;
        linkedHashMapS.put("response_type", "code");
        this.e = new AuthenticationAPIClient(account);
        this.d = ctOptions;
    }

    public static void c(String str, String str2) {
        if (str == null) {
            return;
        }
        Log.e("OAuthManager", "Error, access denied. Check that the required Permissions are granted and that the Application has this Connection configured in Auth0 Dashboard.");
        if ("access_denied".equalsIgnoreCase(str)) {
            if (str2 == null) {
                str2 = "Permissions were not granted. Try again.";
            }
            throw new AuthenticationException("access_denied", str2);
        }
        if ("unauthorized".equalsIgnoreCase(str)) {
            if (str2 == null) {
                str2 = "An unexpected error occurred.";
            }
            throw new AuthenticationException("unauthorized", str2);
        }
        if ("login_required".equals(str)) {
            if (str2 == null) {
                str2 = "An unexpected error occurred.";
            }
            throw new AuthenticationException(str, str2);
        }
        if (str2 == null) {
            str2 = "An unexpected error occurred.";
        }
        throw new AuthenticationException(str, str2);
    }

    @Override // com.auth0.android.provider.ResumableManager
    public final void a(AuthenticationException authenticationException) {
        this.f13664a.a(authenticationException);
    }

    @Override // com.auth0.android.provider.ResumableManager
    public final boolean b(AuthorizeResult authorizeResult) {
        Map map;
        int i;
        if (!authorizeResult.a() && authorizeResult.f13661a != -1) {
            Log.d("AuthorizeResult", "Result is invalid: Either the received Intent is null or the Request Code doesn't match the expected one.");
            Log.w("OAuthManager", "The Authorize Result is invalid.");
            return false;
        }
        boolean zA = authorizeResult.a();
        Callback callback = this.f13664a;
        if (zA) {
            callback.a(new AuthenticationException("a0.authentication_canceled", "The user closed the browser app and the authentication was canceled."));
            return true;
        }
        Intent intent = authorizeResult.b;
        Uri data = intent == null ? null : intent.getData();
        if (data == null) {
            map = Collections.EMPTY_MAP;
        } else {
            String query = data.getQuery() != null ? data.getQuery() : data.getFragment();
            if (query == null) {
                map = new HashMap();
            } else {
                String[] strArrSplit = query.length() > 0 ? query.split("&") : new String[0];
                HashMap map2 = new HashMap(strArrSplit.length);
                for (String str : strArrSplit) {
                    int iIndexOf = str.indexOf("=");
                    String strSubstring = iIndexOf > 0 ? str.substring(0, iIndexOf) : str;
                    String strSubstring2 = (iIndexOf <= 0 || str.length() <= (i = iIndexOf + 1)) ? null : str.substring(i);
                    if (strSubstring2 != null) {
                        map2.put(strSubstring, strSubstring2);
                    }
                }
                map = map2;
            }
        }
        Intrinsics.g(map, "getValuesFromUri(result.intentData)");
        if (map.isEmpty()) {
            Log.w("OAuthManager", "The response didn't contain any of these values: code, state");
            return false;
        }
        Log.d("OAuthManager", "The parsed CallbackURI contains the following parameters: " + map.keySet());
        try {
            c((String) map.get("error"), (String) map.get("error_description"));
            Object obj = this.b.get("state");
            Intrinsics.e(obj);
            String str2 = (String) obj;
            String str3 = (String) map.get("state");
            if (!str2.equals(str3)) {
                Log.e("OAuthManager", String.format("Received state doesn't match. Received %s but expected %s", Arrays.copyOf(new Object[]{str3, str2}, 2)));
                throw new AuthenticationException("access_denied", "The received state is invalid. Try again.");
            }
            PKCE pkce = this.f;
            Intrinsics.e(pkce);
            String authorizationCode = (String) map.get("code");
            Callback<Credentials, AuthenticationException> callback2 = new Callback<Credentials, AuthenticationException>() { // from class: com.auth0.android.provider.OAuthManager$resume$1
                @Override // com.auth0.android.callback.Callback
                public final void a(Auth0Exception auth0Exception) {
                    AuthenticationException error = (AuthenticationException) auth0Exception;
                    Intrinsics.h(error, "error");
                    boolean zEquals = "Unauthorized".equals(error.getDescription());
                    OAuthManager oAuthManager = this.f13666a;
                    if (zEquals) {
                        Log.e("PKCE", "Unable to complete authentication with PKCE. PKCE support can be enabled by setting Application Type to 'Native' and Token Endpoint Authentication Method to 'None' for this app at 'https://manage.auth0.com/#/applications/" + oAuthManager.e.f13651a.f13650a + "/settings'.");
                    }
                    oAuthManager.f13664a.a(error);
                }

                @Override // com.auth0.android.callback.Callback
                public final void onSuccess(Object obj2) {
                    Credentials credentials = (Credentials) obj2;
                    Intrinsics.h(credentials, "credentials");
                    String idToken = credentials.getIdToken();
                    OAuthManager oAuthManager = this.f13666a;
                    OAuthManager$resume$1$onSuccess$1 oAuthManager$resume$1$onSuccess$1 = new OAuthManager$resume$1$onSuccess$1(oAuthManager, credentials);
                    if (TextUtils.isEmpty(idToken)) {
                        oAuthManager$resume$1$onSuccess$1.a(new IdTokenMissingException("ID token is required but missing", 0));
                        return;
                    }
                    try {
                        Intrinsics.e(idToken);
                        Jwt jwt = new Jwt(idToken);
                        OAuthManager$assertValidIdToken$signatureVerifierCallback$1 oAuthManager$assertValidIdToken$signatureVerifierCallback$1 = new OAuthManager$assertValidIdToken$signatureVerifierCallback$1(oAuthManager$resume$1$onSuccess$1, oAuthManager, jwt);
                        AuthenticationAPIClient authenticationAPIClient = oAuthManager.e;
                        authenticationAPIClient.getClass();
                        HttpUrl.Companion companion = HttpUrl.j;
                        String strValueOf = String.valueOf(authenticationAPIClient.f13651a.b);
                        companion.getClass();
                        HttpUrl.Builder builderG = HttpUrl.Companion.c(strValueOf).g();
                        builderG.b(".well-known");
                        builderG.b("jwks.json");
                        HttpUrl httpUrlD = builderG.d();
                        Gson gson = authenticationAPIClient.c;
                        Intrinsics.h(gson, "gson");
                        TypeToken<?> parameterized = TypeToken.getParameterized(Map.class, String.class, PublicKey.class);
                        Intrinsics.f(parameterized, "null cannot be cast to non-null type com.google.gson.reflect.TypeToken<kotlin.collections.Map<kotlin.String, T of com.auth0.android.request.internal.GsonAdapter.Companion.forMapOf>>");
                        GsonAdapter gsonAdapter = new GsonAdapter(gson, parameterized);
                        RequestFactory requestFactory = authenticationAPIClient.b;
                        String url = httpUrlD.i;
                        requestFactory.getClass();
                        Intrinsics.h(url, "url");
                        requestFactory.a(HttpMethod.GET.f13676a, url, gsonAdapter, requestFactory.b).d(new AuthenticationCallback<Map<String, PublicKey>>() { // from class: com.auth0.android.provider.SignatureVerifier.1

                            /* renamed from: a */
                            public final /* synthetic */ String f13670a;
                            public final /* synthetic */ OAuthManager$assertValidIdToken$signatureVerifierCallback$1 b;

                            public AnonymousClass1(String str4, OAuthManager$assertValidIdToken$signatureVerifierCallback$1 oAuthManager$assertValidIdToken$signatureVerifierCallback$12) {
                                str = str4;
                                oAuthManager$assertValidIdToken$signatureVerifierCallback$1 = oAuthManager$assertValidIdToken$signatureVerifierCallback$12;
                            }

                            @Override // com.auth0.android.callback.Callback
                            public final void a(Auth0Exception auth0Exception) {
                                oAuthManager$assertValidIdToken$signatureVerifierCallback$1.a(new PublicKeyNotFoundException(str));
                            }

                            @Override // com.auth0.android.callback.Callback
                            public final void onSuccess(Object obj3) throws NoSuchAlgorithmException, InvalidKeyException {
                                OAuthManager$assertValidIdToken$signatureVerifierCallback$1 oAuthManager$assertValidIdToken$signatureVerifierCallback$12 = oAuthManager$assertValidIdToken$signatureVerifierCallback$1;
                                String str4 = str;
                                PublicKey publicKey = (PublicKey) ((Map) obj3).get(str4);
                                try {
                                    AsymmetricSignatureVerifier asymmetricSignatureVerifier = new AsymmetricSignatureVerifier(Collections.singletonList("RS256"));
                                    try {
                                        Signature signature = Signature.getInstance("SHA256withRSA");
                                        asymmetricSignatureVerifier.b = signature;
                                        signature.initVerify(publicKey);
                                    } catch (NoSuchAlgorithmException unused) {
                                    }
                                    oAuthManager$assertValidIdToken$signatureVerifierCallback$12.onSuccess(asymmetricSignatureVerifier);
                                } catch (InvalidKeyException unused2) {
                                    oAuthManager$assertValidIdToken$signatureVerifierCallback$12.a(new PublicKeyNotFoundException(str4));
                                }
                            }
                        });
                    } catch (Exception e) {
                        oAuthManager$resume$1$onSuccess$1.a(new UnexpectedIdTokenException("ID token could not be decoded", e));
                    }
                }
            };
            AuthenticationAPIClient authenticationAPIClient = pkce.f13668a;
            String codeVerifier = pkce.b;
            String redirectUri = pkce.c;
            authenticationAPIClient.getClass();
            Intrinsics.h(authorizationCode, "authorizationCode");
            Intrinsics.h(codeVerifier, "codeVerifier");
            Intrinsics.h(redirectUri, "redirectUri");
            ParameterBuilder parameterBuilderA = ParameterBuilder.Companion.a();
            Auth0 auth0 = authenticationAPIClient.f13651a;
            parameterBuilderA.c(auth0.f13650a);
            parameterBuilderA.d("authorization_code");
            parameterBuilderA.b("code", authorizationCode);
            parameterBuilderA.b("redirect_uri", redirectUri);
            parameterBuilderA.b("code_verifier", codeVerifier);
            Map mapA = parameterBuilderA.a();
            HttpUrl.Companion companion = HttpUrl.j;
            String strValueOf = String.valueOf(auth0.b);
            companion.getClass();
            HttpUrl.Builder builderG = HttpUrl.Companion.c(strValueOf).g();
            builderG.b("oauth");
            builderG.b("token");
            HttpUrl httpUrlD = builderG.d();
            GsonAdapter gsonAdapter = new GsonAdapter(authenticationAPIClient.c);
            RequestFactory requestFactory = authenticationAPIClient.b;
            String url = httpUrlD.i;
            requestFactory.getClass();
            Intrinsics.h(url, "url");
            BaseRequest baseRequestA = requestFactory.a(HttpMethod.POST.f13678a, url, gsonAdapter, requestFactory.b);
            baseRequestA.b(mapA);
            for (Map.Entry entry : pkce.e.entrySet()) {
                baseRequestA.a((String) entry.getKey(), (String) entry.getValue());
            }
            baseRequestA.d(callback2);
            return true;
        } catch (AuthenticationException e) {
            callback.a(e);
            return true;
        }
    }
}
