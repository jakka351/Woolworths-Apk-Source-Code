package com.braintreepayments.api;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import au.com.woolworths.android.onesite.modules.checkout.paypal.BraintreeResultActivity;
import com.braintreepayments.api.PayPalInternalClient.AnonymousClass1;
import com.salesforce.marketingcloud.messages.iam.j;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class PayPalClient {

    /* renamed from: a, reason: collision with root package name */
    public final BraintreeClient f13731a;
    public final PayPalInternalClient b;
    public String c;
    public Boolean d;

    /* renamed from: com.braintreepayments.api.PayPalClient$1, reason: invalid class name */
    class AnonymousClass1 implements PayPalFlowStartedCallback {
    }

    /* renamed from: com.braintreepayments.api.PayPalClient$2, reason: invalid class name */
    class AnonymousClass2 implements ConfigurationCallback {
        /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
        
            throw null;
         */
        @Override // com.braintreepayments.api.ConfigurationCallback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(com.braintreepayments.api.Configuration r2, java.lang.Exception r3) {
            /*
                r1 = this;
                if (r3 != 0) goto L19
                r3 = 0
                if (r2 == 0) goto L10
                boolean r2 = r2.c
                if (r2 != 0) goto La
                goto L10
            La:
                r2 = 0
                com.braintreepayments.api.PayPalClient.b(r3, r2)     // Catch: com.braintreepayments.api.BrowserSwitchException -> Lf
                throw r3     // Catch: com.braintreepayments.api.BrowserSwitchException -> Lf
            Lf:
                throw r3
            L10:
                com.braintreepayments.api.BraintreeException r2 = new com.braintreepayments.api.BraintreeException
                java.lang.String r0 = "PayPal is not enabled. See https://developer.paypal.com/braintree/docs/guides/paypal/overview/android/v4 for more information."
                r2.<init>(r0, r3)
                r2 = 0
                throw r2
            L19:
                r2 = 0
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.braintreepayments.api.PayPalClient.AnonymousClass2.a(com.braintreepayments.api.Configuration, java.lang.Exception):void");
        }
    }

    /* renamed from: com.braintreepayments.api.PayPalClient$4, reason: invalid class name */
    class AnonymousClass4 implements PayPalInternalClientCallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ PayPalRequest f13733a;
        public final /* synthetic */ BraintreeResultActivity b;
        public final /* synthetic */ au.com.woolworths.android.onesite.modules.checkout.paypal.a c;

        public AnonymousClass4(PayPalRequest payPalRequest, BraintreeResultActivity braintreeResultActivity, au.com.woolworths.android.onesite.modules.checkout.paypal.a aVar) {
            this.f13733a = payPalRequest;
            this.b = braintreeResultActivity;
            this.c = aVar;
        }

        public final void a(PayPalResponse payPalResponse, Exception exc) {
            au.com.woolworths.android.onesite.modules.checkout.paypal.a aVar = this.c;
            if (payPalResponse == null) {
                aVar.c(exc);
                return;
            }
            PayPalRequest payPalRequest = this.f13733a;
            String str = payPalRequest instanceof PayPalVaultRequest ? "paypal.billing-agreement" : "paypal.single-payment";
            String str2 = payPalResponse.c;
            PayPalClient payPalClient = PayPalClient.this;
            payPalClient.c = str2;
            payPalClient.f13731a.d(str.concat(".browser-switch.started"), payPalClient.c());
            try {
                PayPalClient.a(payPalClient, this.b, payPalResponse, payPalRequest.o);
                aVar.c(null);
            } catch (BrowserSwitchException | JSONException e) {
                aVar.c(e);
            }
        }
    }

    /* renamed from: com.braintreepayments.api.PayPalClient$5, reason: invalid class name */
    class AnonymousClass5 implements PayPalBrowserSwitchResultCallback {
        @Override // com.braintreepayments.api.PayPalBrowserSwitchResultCallback
        public final void a(PayPalAccountNonce payPalAccountNonce, Exception exc) {
            throw null;
        }
    }

    /* renamed from: com.braintreepayments.api.PayPalClient$6, reason: invalid class name */
    class AnonymousClass6 implements PayPalBrowserSwitchResultCallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ PayPalBrowserSwitchResultCallback f13734a;

        public AnonymousClass6(PayPalBrowserSwitchResultCallback payPalBrowserSwitchResultCallback) {
            this.f13734a = payPalBrowserSwitchResultCallback;
        }

        @Override // com.braintreepayments.api.PayPalBrowserSwitchResultCallback
        public final void a(PayPalAccountNonce payPalAccountNonce, Exception exc) {
            if (payPalAccountNonce != null && payPalAccountNonce.n != null) {
                PayPalClient payPalClient = PayPalClient.this;
                BraintreeClient braintreeClient = payPalClient.f13731a;
                AnalyticsEventParams analyticsEventParamsC = payPalClient.c();
                braintreeClient.getClass();
                braintreeClient.b(new a(braintreeClient, "paypal.credit.accepted", analyticsEventParamsC));
            }
            this.f13734a.a(payPalAccountNonce, exc);
        }
    }

    public PayPalClient(BraintreeClient braintreeClient) {
        PayPalInternalClient payPalInternalClient = new PayPalInternalClient(braintreeClient);
        this.c = null;
        this.d = Boolean.FALSE;
        this.f13731a = braintreeClient;
        this.b = payPalInternalClient;
    }

    public static void a(PayPalClient payPalClient, BraintreeResultActivity braintreeResultActivity, PayPalResponse payPalResponse, boolean z) throws BrowserSwitchException, JSONException {
        BraintreeClient braintreeClient = payPalClient.f13731a;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("approval-url", payPalResponse.f13744a);
        jSONObject.put("success-url", payPalResponse.e);
        PayPalRequest payPalRequest = payPalResponse.d;
        jSONObject.put("payment-type", payPalRequest instanceof PayPalVaultRequest ? "billing-agreement" : "single-payment");
        jSONObject.put("client-metadata-id", payPalResponse.b);
        jSONObject.put("merchant-account-id", payPalRequest.k);
        jSONObject.put("source", "paypal-browser");
        jSONObject.put("intent", payPalRequest instanceof PayPalCheckoutRequest ? ((PayPalCheckoutRequest) payPalRequest).p : null);
        BrowserSwitchOptions browserSwitchOptions = new BrowserSwitchOptions();
        browserSwitchOptions.b = 13591;
        browserSwitchOptions.c = Uri.parse(payPalResponse.f13744a);
        browserSwitchOptions.d = braintreeClient.i;
        browserSwitchOptions.f13709a = jSONObject;
        if (z) {
            browserSwitchOptions.e = braintreeClient.j;
        }
        BrowserSwitchClient browserSwitchClient = braintreeClient.g;
        browserSwitchClient.a(braintreeResultActivity, browserSwitchOptions);
        Context applicationContext = braintreeResultActivity.getApplicationContext();
        Uri uri = browserSwitchOptions.c;
        BrowserSwitchRequest browserSwitchRequest = new BrowserSwitchRequest(browserSwitchOptions.b, uri, browserSwitchOptions.f13709a, browserSwitchOptions.d, browserSwitchOptions.e, true);
        browserSwitchClient.b.getClass();
        BrowserSwitchPersistentStore.b(browserSwitchRequest, applicationContext);
        if (braintreeResultActivity.isFinishing()) {
            throw new BrowserSwitchException("Unable to start browser switch while host Activity is finishing.");
        }
        browserSwitchClient.f13708a.getClass();
        PackageManager packageManager = applicationContext.getPackageManager();
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(new Intent().setAction("android.intent.action.VIEW").addCategory("android.intent.category.BROWSABLE").setData(Uri.parse("https://")), 0);
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : listQueryIntentActivities) {
            Intent intent = new Intent();
            intent.setAction("android.support.customtabs.action.CustomTabsService");
            intent.setPackage(resolveInfo.activityInfo.packageName);
            if (packageManager.resolveService(intent, 0) != null) {
                arrayList.add(resolveInfo);
            }
        }
        if (!arrayList.isEmpty()) {
            browserSwitchClient.c.f13714a.a().b(braintreeResultActivity, uri);
        } else {
            try {
                braintreeResultActivity.startActivity(new Intent("android.intent.action.VIEW", uri));
            } catch (ActivityNotFoundException unused) {
                throw new BrowserSwitchException("Unable to start browser switch without a web browser.");
            }
        }
    }

    public static void b(PayPalClient payPalClient, BraintreeResultActivity braintreeResultActivity) {
        BraintreeClient braintreeClient = payPalClient.f13731a;
        braintreeClient.getClass();
        Uri uri = Uri.parse("https://braintreepayments.com");
        String str = braintreeClient.i;
        BrowserSwitchOptions browserSwitchOptions = new BrowserSwitchOptions();
        browserSwitchOptions.c = uri;
        browserSwitchOptions.e = braintreeClient.j;
        browserSwitchOptions.d = str;
        browserSwitchOptions.b = 13591;
        braintreeClient.g.a(braintreeResultActivity, browserSwitchOptions);
    }

    public static JSONObject e(Uri uri, String str, String str2, String str3) throws JSONException, PayPalBrowserSwitchException, UserCanceledException {
        if (!Uri.parse(str).getLastPathSegment().equals(uri.getLastPathSegment())) {
            throw new UserCanceledException();
        }
        String queryParameter = Uri.parse(str2).getQueryParameter(str3);
        String queryParameter2 = uri.getQueryParameter(str3);
        if (queryParameter2 == null || !TextUtils.equals(queryParameter, queryParameter2)) {
            throw new PayPalBrowserSwitchException("The response contained inconsistent data.");
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("environment", (Object) null);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("client", jSONObject);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("webURL", uri.toString());
        jSONObject2.put("response", jSONObject3);
        jSONObject2.put("response_type", "web");
        return jSONObject2;
    }

    public final AnalyticsEventParams c() {
        AnalyticsEventParams analyticsEventParams = new AnalyticsEventParams(null, null, null);
        analyticsEventParams.f13696a = this.c;
        analyticsEventParams.b = this.d.booleanValue();
        return analyticsEventParams;
    }

    public final void d(BrowserSwitchResult browserSwitchResult, PayPalBrowserSwitchResultCallback payPalBrowserSwitchResultCallback) {
        String queryParameter;
        JSONObject jSONObject = browserSwitchResult.c.c;
        String strA = Json.a(jSONObject, "client-metadata-id", null);
        String strA2 = Json.a(jSONObject, "merchant-account-id", null);
        String strA3 = Json.a(jSONObject, "intent", null);
        String strA4 = Json.a(jSONObject, "approval-url", null);
        String strA5 = Json.a(jSONObject, "success-url", null);
        String strA6 = Json.a(jSONObject, "payment-type", j.h);
        boolean zEqualsIgnoreCase = strA6.equalsIgnoreCase("billing-agreement");
        String str = zEqualsIgnoreCase ? "ba_token" : "token";
        String str2 = zEqualsIgnoreCase ? "paypal.billing-agreement" : "paypal.single-payment";
        if (strA4 != null && (queryParameter = Uri.parse(strA4).getQueryParameter(str)) != null && !queryParameter.isEmpty()) {
            this.c = queryParameter;
        }
        int i = browserSwitchResult.f13712a;
        BraintreeClient braintreeClient = this.f13731a;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            payPalBrowserSwitchResultCallback.a(null, new UserCanceledException());
            braintreeClient.d(str2.concat(".browser-switch.canceled"), c());
            return;
        }
        try {
            Uri uri = browserSwitchResult.b;
            if (uri == null) {
                payPalBrowserSwitchResultCallback.a(null, new BraintreeException("Unknown error", null));
                return;
            }
            JSONObject jSONObjectE = e(uri, strA5, strA4, str);
            PayPalAccount payPalAccount = new PayPalAccount();
            payPalAccount.c = strA;
            payPalAccount.e = strA3;
            payPalAccount.b = "paypal-browser";
            payPalAccount.d = jSONObjectE;
            payPalAccount.g = strA6;
            if (strA2 != null) {
                payPalAccount.f = strA2;
            }
            if (strA3 != null) {
                payPalAccount.e = strA3;
            }
            this.b.a(payPalAccount, new AnonymousClass6(payPalBrowserSwitchResultCallback));
            braintreeClient.d(str2.concat(".browser-switch.succeeded"), c());
        } catch (PayPalBrowserSwitchException e) {
            e = e;
            payPalBrowserSwitchResultCallback.a(null, e);
            braintreeClient.d(str2.concat(".browser-switch.failed"), c());
        } catch (UserCanceledException e2) {
            payPalBrowserSwitchResultCallback.a(null, e2);
            braintreeClient.d(str2.concat(".browser-switch.canceled"), c());
        } catch (JSONException e3) {
            e = e3;
            payPalBrowserSwitchResultCallback.a(null, e);
            braintreeClient.d(str2.concat(".browser-switch.failed"), c());
        }
    }

    public final void f(final BraintreeResultActivity braintreeResultActivity, final PayPalVaultRequest payPalVaultRequest, final au.com.woolworths.android.onesite.modules.checkout.paypal.a aVar) {
        BraintreeClient braintreeClient = this.f13731a;
        this.d = Boolean.TRUE;
        AnalyticsEventParams analyticsEventParamsC = c();
        braintreeClient.getClass();
        AuthorizationLoader authorizationLoader = braintreeClient.d;
        authorizationLoader.getClass();
        Authorization authorization = authorizationLoader.f13699a;
        if (authorization != null) {
            braintreeClient.c(new c(braintreeClient, "paypal.billing-agreement.selected", analyticsEventParamsC, authorization));
        } else {
            new BraintreeException("Authorization required. See https://developer.paypal.com/braintree/docs/guides/client-sdk/setup/android/v4#initialization for more info.", null);
        }
        if (payPalVaultRequest.p) {
            AnalyticsEventParams analyticsEventParamsC2 = c();
            authorizationLoader.getClass();
            Authorization authorization2 = authorizationLoader.f13699a;
            if (authorization2 != null) {
                braintreeClient.c(new c(braintreeClient, "paypal.billing-agreement.credit.offered", analyticsEventParamsC2, authorization2));
            } else {
                new BraintreeException("Authorization required. See https://developer.paypal.com/braintree/docs/guides/client-sdk/setup/android/v4#initialization for more info.", null);
            }
        }
        braintreeClient.b(new b(braintreeClient, new ConfigurationCallback() { // from class: com.braintreepayments.api.PayPalClient.3
            @Override // com.braintreepayments.api.ConfigurationCallback
            public final void a(Configuration configuration, Exception exc) {
                BraintreeResultActivity braintreeResultActivity2 = braintreeResultActivity;
                PayPalClient payPalClient = PayPalClient.this;
                au.com.woolworths.android.onesite.modules.checkout.paypal.a aVar2 = aVar;
                if (exc != null) {
                    aVar2.c(exc);
                    return;
                }
                if (configuration == null || !configuration.c) {
                    aVar2.c(new BraintreeException("PayPal is not enabled. See https://developer.paypal.com/braintree/docs/guides/paypal/overview/android/v4 for more information.", null));
                    return;
                }
                try {
                    PayPalClient.b(payPalClient, braintreeResultActivity2);
                    PayPalInternalClient payPalInternalClient = payPalClient.b;
                    PayPalVaultRequest payPalVaultRequest2 = payPalVaultRequest;
                    payPalInternalClient.f13738a.b(payPalInternalClient.new AnonymousClass1(payPalClient.new AnonymousClass4(payPalVaultRequest2, braintreeResultActivity2, aVar2), payPalVaultRequest2, braintreeResultActivity2));
                } catch (BrowserSwitchException e) {
                    BraintreeClient braintreeClient2 = payPalClient.f13731a;
                    AnalyticsEventParams analyticsEventParamsC3 = payPalClient.c();
                    braintreeClient2.getClass();
                    braintreeClient2.b(new a(braintreeClient2, "paypal.invalid-manifest", analyticsEventParamsC3));
                    aVar2.c(new BraintreeException("AndroidManifest.xml is incorrectly configured or another app defines the same browser switch url as this app. See https://developer.paypal.com/braintree/docs/guides/client-sdk/setup/android/v4#browser-switch-setup for the correct configuration: " + e.getMessage(), null));
                }
            }
        }));
    }
}
