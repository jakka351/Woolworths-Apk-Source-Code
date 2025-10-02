package com.braintreepayments.api;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/braintreepayments/api/BraintreeClient;", "", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes4.dex */
public class BraintreeClient {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13701a;
    public final String b;
    public final String c;
    public final AuthorizationLoader d;
    public final AnalyticsClient e;
    public final BraintreeHttpClient f;
    public final BrowserSwitchClient g;
    public final ConfigurationLoader h;
    public final String i;
    public final Uri j;
    public final DeviceInspector k;

    public BraintreeClient(Context context, String str) {
        Intrinsics.h(context, "context");
        BraintreeClientParams braintreeClientParams = new BraintreeClientParams(new BraintreeOptions(context, str, 98));
        Context applicationContext = braintreeClientParams.n;
        Intrinsics.h(applicationContext, "applicationContext");
        String integrationType = braintreeClientParams.m;
        Intrinsics.h(integrationType, "integrationType");
        String sessionId = braintreeClientParams.b;
        Intrinsics.h(sessionId, "sessionId");
        AuthorizationLoader authorizationLoader = braintreeClientParams.c;
        Intrinsics.h(authorizationLoader, "authorizationLoader");
        AnalyticsClient analyticsClient = braintreeClientParams.h;
        Intrinsics.h(analyticsClient, "analyticsClient");
        BraintreeHttpClient httpClient = braintreeClientParams.f;
        Intrinsics.h(httpClient, "httpClient");
        BraintreeGraphQLClient graphQLClient = braintreeClientParams.g;
        Intrinsics.h(graphQLClient, "graphQLClient");
        BrowserSwitchClient browserSwitchClient = braintreeClientParams.i;
        Intrinsics.h(browserSwitchClient, "browserSwitchClient");
        ConfigurationLoader configurationLoader = braintreeClientParams.l;
        Intrinsics.h(configurationLoader, "configurationLoader");
        ManifestValidator manifestValidator = braintreeClientParams.j;
        Intrinsics.h(manifestValidator, "manifestValidator");
        String returnUrlScheme = braintreeClientParams.d;
        Intrinsics.h(returnUrlScheme, "returnUrlScheme");
        String braintreeDeepLinkReturnUrlScheme = braintreeClientParams.o;
        Intrinsics.h(braintreeDeepLinkReturnUrlScheme, "braintreeDeepLinkReturnUrlScheme");
        this.f13701a = applicationContext;
        this.b = integrationType;
        this.c = sessionId;
        this.d = authorizationLoader;
        this.e = analyticsClient;
        this.f = httpClient;
        this.g = browserSwitchClient;
        this.h = configurationLoader;
        this.i = returnUrlScheme;
        this.j = braintreeClientParams.e;
        CrashReporter crashReporter = new CrashReporter(this);
        crashReporter.b = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(crashReporter);
        this.k = new DeviceInspector();
    }

    public static void e(BraintreeClient braintreeClient, String str) {
        braintreeClient.b(new a(braintreeClient, str, new AnalyticsEventParams(null, null, null)));
    }

    public static void g(BraintreeClient braintreeClient, String url, String str, HttpResponseCallback httpResponseCallback) {
        Map map = EmptyMap.d;
        braintreeClient.getClass();
        Intrinsics.h(url, "url");
        braintreeClient.b(new androidx.compose.foundation.text.input.internal.a(braintreeClient, httpResponseCallback, url, str, map));
    }

    public final BrowserSwitchResult a(FragmentActivity fragmentActivity) {
        Uri uri;
        BrowserSwitchClient browserSwitchClient = this.g;
        browserSwitchClient.getClass();
        Context applicationContext = fragmentActivity.getApplicationContext();
        BrowserSwitchPersistentStore browserSwitchPersistentStore = browserSwitchClient.b;
        browserSwitchPersistentStore.getClass();
        BrowserSwitchRequest browserSwitchRequestA = BrowserSwitchPersistentStore.a(applicationContext);
        BrowserSwitchResult browserSwitchResult = null;
        if (browserSwitchRequestA != null) {
            Intent intent = fragmentActivity.getIntent();
            Context applicationContext2 = fragmentActivity.getApplicationContext();
            browserSwitchPersistentStore.getClass();
            BrowserSwitchRequest browserSwitchRequestA2 = BrowserSwitchPersistentStore.a(applicationContext2);
            if (browserSwitchRequestA2 != null && intent != null) {
                Uri data = intent.getData();
                if (data != null && ((data.getScheme() != null && data.getScheme().equalsIgnoreCase(browserSwitchRequestA2.d)) || ((uri = browserSwitchRequestA2.e) != null && data.getScheme().equals(uri.getScheme()) && data.getHost().equals(uri.getHost())))) {
                    browserSwitchResult = new BrowserSwitchResult(1, browserSwitchRequestA2, data);
                } else if (browserSwitchRequestA2.f) {
                    browserSwitchResult = new BrowserSwitchResult(2, browserSwitchRequestA2, null);
                }
            }
            if (browserSwitchResult != null) {
                int i = browserSwitchResult.f13712a;
                if (i == 1) {
                    applicationContext.getApplicationContext().getSharedPreferences("com.braintreepayment.browserswitch.persistentstore", 0).edit().remove("browserSwitch.request").apply();
                } else if (i == 2) {
                    browserSwitchRequestA.f = false;
                    BrowserSwitchPersistentStore.b(browserSwitchRequestA, fragmentActivity);
                    return browserSwitchResult;
                }
            }
        }
        return browserSwitchResult;
    }

    public final void b(AuthorizationCallback authorizationCallback) {
        AuthorizationLoader authorizationLoader = this.d;
        authorizationLoader.getClass();
        Authorization authorization = authorizationLoader.f13699a;
        if (authorization != null) {
            authorizationCallback.b(authorization, null);
        } else {
            authorizationCallback.b(null, new BraintreeException("Authorization required. See https://developer.paypal.com/braintree/docs/guides/client-sdk/setup/android/v4#initialization for more info.", null));
        }
    }

    public final void c(ConfigurationCallback configurationCallback) {
        b(new b(this, configurationCallback));
    }

    public final void d(String str, AnalyticsEventParams analyticsEventParams) {
        b(new a(this, str, analyticsEventParams));
    }

    public final void f(String str, HttpResponseTiming httpResponseTiming) {
        b(new a(this, "core:api-request-latency", new AnalyticsEventParams(androidx.camera.core.impl.b.D("/merchants/([A-Za-z0-9]+)/client_api", str, ""), Long.valueOf(httpResponseTiming.f13728a), Long.valueOf(httpResponseTiming.b))));
    }
}
