package com.auth0.android.provider;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.auth0.android.Auth0;
import com.auth0.android.authentication.AuthenticationAPIClient;
import com.auth0.android.authentication.AuthenticationException;
import com.auth0.android.callback.Callback;
import com.auth0.android.provider.AuthenticationActivity;
import com.auth0.android.request.internal.OidcUtils;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/auth0/android/provider/WebAuthProvider;", "", "Builder", "LogoutBuilder", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WebAuthProvider {

    /* renamed from: a, reason: collision with root package name */
    public static final String f13671a = Reflection.f24268a.b(WebAuthProvider.class).B();
    public static ResumableManager b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/auth0/android/provider/WebAuthProvider$Builder;", "", "Companion", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final Auth0 f13672a;
        public final LinkedHashMap b;
        public final LinkedHashMap c;
        public String d;
        public String e;
        public final CustomTabsOptions f;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/auth0/android/provider/WebAuthProvider$Builder$Companion;", "", "", "KEY_AUDIENCE", "Ljava/lang/String;", "KEY_CONNECTION_SCOPE", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
        }

        public Builder(Auth0 account) {
            Intrinsics.h(account, "account");
            this.f13672a = account;
            this.b = new LinkedHashMap();
            this.c = new LinkedHashMap();
            this.d = "https";
            this.f = new CustomTabsOptions(new BrowserPicker());
        }

        public final void a(Context context, Callback callback) {
            Intrinsics.h(context, "context");
            WebAuthProvider.b = null;
            PackageManager packageManager = context.getPackageManager();
            CustomTabsOptions customTabsOptions = this.f;
            if (customTabsOptions.a(packageManager) == null) {
                callback.a(new AuthenticationException("a0.browser_not_available", "No compatible Browser application is installed."));
                return;
            }
            LinkedHashMap linkedHashMap = this.b;
            Auth0 auth0 = this.f13672a;
            OAuthManager oAuthManager = new OAuthManager(auth0, callback, linkedHashMap, customTabsOptions);
            LinkedHashMap headers = this.c;
            Intrinsics.h(headers, "headers");
            HashMap map = oAuthManager.c;
            map.putAll(headers);
            oAuthManager.f = null;
            boolean zIsEmpty = TextUtils.isEmpty(null);
            AuthenticationAPIClient authenticationAPIClient = oAuthManager.e;
            oAuthManager.g = zIsEmpty ? String.valueOf(authenticationAPIClient.f13651a.b) : null;
            WebAuthProvider.b = oAuthManager;
            if (this.e == null) {
                this.e = CallbackHelper.a(this.d, context.getApplicationContext().getPackageName(), String.valueOf(auth0.b));
            }
            String str = this.e;
            Intrinsics.e(str);
            LinkedHashMap parameters = oAuthManager.b;
            Intrinsics.h(parameters, "parameters");
            parameters.put("scope", parameters.containsKey("scope") ? OidcUtils.a((String) MapsKt.e("scope", parameters)) : "openid profile email");
            if (oAuthManager.f == null) {
                oAuthManager.f = new PKCE(authenticationAPIClient, str, map);
            }
            PKCE pkce = oAuthManager.f;
            Intrinsics.e(pkce);
            String codeChallenge = pkce.d;
            Intrinsics.g(codeChallenge, "codeChallenge");
            parameters.put("code_challenge", codeChallenge);
            parameters.put("code_challenge_method", "S256");
            Log.v("OAuthManager", "Using PKCE authentication flow");
            parameters.put("auth0Client", auth0.c.b);
            parameters.put("client_id", auth0.f13650a);
            parameters.put("redirect_uri", str);
            String strEncodeToString = (String) parameters.get("state");
            if (strEncodeToString == null) {
                byte[] bArr = new byte[32];
                new SecureRandom().nextBytes(bArr);
                strEncodeToString = Base64.encodeToString(bArr, 11);
                Intrinsics.g(strEncodeToString, "encodeToString(\n        ….NO_PADDING\n            )");
            }
            String strEncodeToString2 = (String) parameters.get("nonce");
            if (strEncodeToString2 == null) {
                byte[] bArr2 = new byte[32];
                new SecureRandom().nextBytes(bArr2);
                strEncodeToString2 = Base64.encodeToString(bArr2, 11);
                Intrinsics.g(strEncodeToString2, "encodeToString(\n        ….NO_PADDING\n            )");
            }
            parameters.put("state", strEncodeToString);
            parameters.put("nonce", strEncodeToString2);
            HttpUrl httpUrl = auth0.b;
            Intrinsics.e(httpUrl);
            HttpUrl.Builder builderG = httpUrl.g();
            builderG.f("authorize", 0, 9, false, true);
            Uri.Builder builderBuildUpon = Uri.parse(builderG.d().i).buildUpon();
            for (Map.Entry entry : parameters.entrySet()) {
                builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
            Uri uri = builderBuildUpon.build();
            Log.d("OAuthManager", "Using the following Authorize URI: " + uri);
            Intrinsics.g(uri, "uri");
            int i = AuthenticationActivity.f;
            AuthenticationActivity.Companion.a(context, uri, oAuthManager.d);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/auth0/android/provider/WebAuthProvider$LogoutBuilder;", "", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class LogoutBuilder {

        /* renamed from: a, reason: collision with root package name */
        public final Auth0 f13673a;
        public String b;
        public String c;
        public final CustomTabsOptions d;

        public LogoutBuilder(Auth0 account) {
            Intrinsics.h(account, "account");
            this.f13673a = account;
            this.b = "https";
            this.d = new CustomTabsOptions(new BrowserPicker());
        }

        public final void a(Context context, Callback callback) {
            Intrinsics.h(context, "context");
            WebAuthProvider.b = null;
            PackageManager packageManager = context.getPackageManager();
            CustomTabsOptions customTabsOptions = this.d;
            if (customTabsOptions.a(packageManager) == null) {
                callback.a(new AuthenticationException("a0.browser_not_available", "No compatible Browser application is installed."));
                return;
            }
            String str = this.c;
            Auth0 auth0 = this.f13673a;
            if (str == null) {
                this.c = CallbackHelper.a(this.b, context.getApplicationContext().getPackageName(), String.valueOf(auth0.b));
            }
            String str2 = this.c;
            Intrinsics.e(str2);
            LogoutManager logoutManager = new LogoutManager(auth0, callback, str2, customTabsOptions);
            WebAuthProvider.b = logoutManager;
            String str3 = auth0.c.b;
            HashMap map = logoutManager.b;
            map.put("auth0Client", str3);
            map.put("client_id", auth0.f13650a);
            HttpUrl httpUrl = auth0.b;
            Intrinsics.e(httpUrl);
            HttpUrl.Builder builderG = httpUrl.g();
            builderG.f("v2", 0, 2, false, true);
            builderG.f("logout", 0, 6, false, true);
            Uri.Builder builderBuildUpon = Uri.parse(builderG.d().i).buildUpon();
            for (Map.Entry entry : map.entrySet()) {
                builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
            Uri uri = builderBuildUpon.build();
            Log.d("LogoutManager", "Using the following Logout URI: " + uri);
            Intrinsics.g(uri, "uri");
            int i = AuthenticationActivity.f;
            AuthenticationActivity.Companion.a(context, uri, logoutManager.c);
        }

        public final void b(String str) {
            Locale ROOT = Locale.ROOT;
            Intrinsics.g(ROOT, "ROOT");
            String lowerCase = str.toLowerCase(ROOT);
            Intrinsics.g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!str.equals(lowerCase)) {
                Log.w(WebAuthProvider.f13671a, "Please provide the scheme in lowercase and make sure it's the same configured in the intent filter. Android expects the scheme to be lowercase.");
            }
            this.b = str;
        }
    }
}
