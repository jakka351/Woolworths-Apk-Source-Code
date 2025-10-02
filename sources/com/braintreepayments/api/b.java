package com.braintreepayments.api;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.braintreepayments.api.ConfigurationLoader;
import com.google.android.gms.measurement.AppMeasurement;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements AuthorizationCallback, ConfigurationLoaderCallback, ConfigurationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f13754a;
    public final /* synthetic */ BraintreeClient b;

    public /* synthetic */ b(BraintreeClient braintreeClient, Object obj) {
        this.b = braintreeClient;
        this.f13754a = obj;
    }

    @Override // com.braintreepayments.api.ConfigurationCallback
    public void a(Configuration configuration, Exception exc) throws NoSuchFieldException, PackageManager.NameNotFoundException, SecurityException {
        Authorization authorization = (Authorization) this.f13754a;
        Intrinsics.h(authorization, "$authorization");
        BraintreeClient braintreeClient = this.b;
        AnalyticsClient analyticsClient = braintreeClient.e;
        Context context = braintreeClient.f13701a;
        String str = braintreeClient.c;
        String str2 = braintreeClient.b;
        analyticsClient.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        analyticsClient.d.getClass();
        try {
            JSONObject jSONObjectA = AnalyticsClient.a(authorization, CollectionsKt.Q(new AnalyticsEventBlob(AnalyticsClient.b(new AnalyticsEvent(AppMeasurement.CRASH_ORIGIN, null, false, false, null, null, null, jCurrentTimeMillis, 254)), 0L)), DeviceInspector.a(context, configuration, str, str2));
            BraintreeHttpClient braintreeHttpClient = analyticsClient.f13692a;
            String string = jSONObjectA.toString();
            Intrinsics.g(string, "analyticsRequest.toString()");
            braintreeHttpClient.b("https://api-m.paypal.com/v1/tracking/batch/events", string, null, authorization, EmptyMap.d, null);
        } catch (JSONException unused) {
        }
    }

    @Override // com.braintreepayments.api.AuthorizationCallback
    public void b(Authorization authorization, BraintreeException braintreeException) {
        Configuration configuration;
        Unit unit;
        ConfigurationCallback configurationCallback = (ConfigurationCallback) this.f13754a;
        if (authorization == null) {
            configurationCallback.a(null, braintreeException);
            return;
        }
        BraintreeClient braintreeClient = this.b;
        ConfigurationLoader configurationLoader = braintreeClient.h;
        b bVar = new b(configurationCallback, braintreeClient);
        configurationLoader.getClass();
        boolean z = authorization instanceof InvalidAuthorization;
        if (z) {
            bVar.c(null, new BraintreeException(((InvalidAuthorization) authorization).b, null), null);
            return;
        }
        String string = Uri.parse(authorization.getB()).buildUpon().appendQueryParameter("configVersion", "3").build().toString();
        Intrinsics.g(string, "parse(authorization.conf…)\n            .toString()");
        String strA = ConfigurationLoader.Companion.a(authorization, string);
        ConfigurationCache configurationCache = configurationLoader.b;
        configurationCache.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strConcat = strA.concat("_timestamp");
        SharedPreferences sharedPreferences = configurationCache.f13716a.f13707a;
        try {
            configuration = new Configuration((!sharedPreferences.contains(strConcat) || jCurrentTimeMillis - sharedPreferences.getLong(strConcat, 0L) >= ConfigurationCache.c) ? null : sharedPreferences.getString(strA, ""));
        } catch (JSONException unused) {
            configuration = null;
        }
        if (configuration != null) {
            bVar.c(configuration, null, null);
            unit = Unit.f24250a;
        } else {
            unit = null;
        }
        if (unit == null) {
            BraintreeHttpClient braintreeHttpClient = configurationLoader.f13717a;
            c cVar = new c(configurationLoader, authorization, string, bVar);
            braintreeHttpClient.getClass();
            if (z) {
                cVar.c(null, new BraintreeException(((InvalidAuthorization) authorization).b, null));
                return;
            }
            if (!StringsKt.W(string, "http", false)) {
                cVar.c(null, new BraintreeException("Braintree HTTP GET request without configuration cannot have a relative path.", null));
                return;
            }
            if (authorization instanceof ClientToken) {
                string = Uri.parse(string).buildUpon().appendQueryParameter("authorizationFingerprint", ((ClientToken) authorization).c).toString();
            }
            Intrinsics.g(string, "if (authorization is Cli…           path\n        }");
            HttpRequest httpRequest = new HttpRequest();
            httpRequest.d = "GET";
            httpRequest.f13726a = string;
            httpRequest.a("User-Agent", "braintree/android/4.49.1");
            if (authorization instanceof TokenizationKey) {
                httpRequest.a("Client-Key", ((TokenizationKey) authorization).c);
            }
            braintreeHttpClient.f13704a.a(httpRequest, 1, cVar);
        }
    }

    public void c(Configuration configuration, Exception exc, HttpResponseTiming httpResponseTiming) {
        ConfigurationCallback callback = (ConfigurationCallback) this.f13754a;
        Intrinsics.h(callback, "$callback");
        BraintreeClient this$0 = this.b;
        Intrinsics.h(this$0, "this$0");
        if (configuration != null) {
            callback.a(configuration, null);
        } else {
            callback.a(null, exc);
        }
        if (httpResponseTiming != null) {
            this$0.f("v1/configuration", httpResponseTiming);
        }
    }

    public /* synthetic */ b(ConfigurationCallback configurationCallback, BraintreeClient braintreeClient) {
        this.f13754a = configurationCallback;
        this.b = braintreeClient;
    }
}
