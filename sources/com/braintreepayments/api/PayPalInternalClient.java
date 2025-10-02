package com.braintreepayments.api;

import android.net.Uri;
import au.com.woolworths.android.onesite.modules.checkout.paypal.BraintreeResultActivity;
import com.braintreepayments.api.PayPalClient;
import com.salesforce.marketingcloud.storage.db.i;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
class PayPalInternalClient {

    /* renamed from: a, reason: collision with root package name */
    public final BraintreeClient f13738a;
    public final PayPalDataCollector b;
    public final ApiClient c;

    /* renamed from: com.braintreepayments.api.PayPalInternalClient$1, reason: invalid class name */
    class AnonymousClass1 implements AuthorizationCallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ PayPalClient.AnonymousClass4 f13739a;
        public final /* synthetic */ PayPalRequest b;
        public final /* synthetic */ BraintreeResultActivity c;

        public AnonymousClass1(PayPalClient.AnonymousClass4 anonymousClass4, PayPalRequest payPalRequest, BraintreeResultActivity braintreeResultActivity) {
            this.f13739a = anonymousClass4;
            this.b = payPalRequest;
            this.c = braintreeResultActivity;
        }

        @Override // com.braintreepayments.api.AuthorizationCallback
        public final void b(final Authorization authorization, BraintreeException braintreeException) {
            if (authorization != null) {
                PayPalInternalClient.this.f13738a.c(new ConfigurationCallback() { // from class: com.braintreepayments.api.PayPalInternalClient.1.1
                    @Override // com.braintreepayments.api.ConfigurationCallback
                    public final void a(final Configuration configuration, Exception exc) {
                        String str;
                        final String str2;
                        Uri uri;
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        PayPalClient.AnonymousClass4 anonymousClass4 = anonymousClass1.f13739a;
                        PayPalRequest payPalRequest = anonymousClass1.b;
                        PayPalInternalClient payPalInternalClient = PayPalInternalClient.this;
                        if (configuration == null) {
                            anonymousClass4.a(null, exc);
                            return;
                        }
                        try {
                            String strConcat = "/v1/".concat(payPalRequest instanceof PayPalVaultRequest ? "paypal_hermes/setup_billing_agreement" : "paypal_hermes/create_payment_resource");
                            if (!payPalRequest.o || (uri = payPalInternalClient.f13738a.j) == null) {
                                str = payPalInternalClient.f13738a.i + "://onetouch/v1/cancel";
                                str2 = payPalInternalClient.f13738a.i + "://onetouch/v1/success";
                            } else {
                                String string = uri.toString();
                                str = string + "/cancel";
                                str2 = string + "/success";
                            }
                            String data = payPalRequest.a(configuration, authorization, str2, str);
                            BraintreeClient braintreeClient = payPalInternalClient.f13738a;
                            HttpResponseCallback httpResponseCallback = new HttpResponseCallback() { // from class: com.braintreepayments.api.PayPalInternalClient.1.1.1
                                @Override // com.braintreepayments.api.HttpResponseCallback
                                public final void a(Exception exc2, String str3) {
                                    AnonymousClass1 anonymousClass12 = AnonymousClass1.this;
                                    if (str3 == null) {
                                        anonymousClass12.f13739a.a(null, exc2);
                                        return;
                                    }
                                    try {
                                        PayPalResponse payPalResponse = new PayPalResponse(anonymousClass12.b);
                                        payPalResponse.e = str2;
                                        String str4 = PayPalPaymentResource.a(str3).f13743a;
                                        if (str4 != null) {
                                            Uri uri2 = Uri.parse(str4);
                                            PayPalInternalClient.this.getClass();
                                            String queryParameter = uri2.getQueryParameter("ba_token");
                                            if (queryParameter == null) {
                                                queryParameter = uri2.getQueryParameter("token");
                                            }
                                            PayPalRequest payPalRequest2 = anonymousClass12.b;
                                            String strA = payPalRequest2.l;
                                            if (strA == null) {
                                                PayPalDataCollectorInternalRequest payPalDataCollectorInternalRequest = new PayPalDataCollectorInternalRequest(payPalRequest2.n);
                                                payPalDataCollectorInternalRequest.f13737a = PayPalInternalClient.this.b.a(anonymousClass12.c);
                                                if (queryParameter != null) {
                                                    payPalDataCollectorInternalRequest.b = queryParameter.substring(0, Math.min(queryParameter.length(), 32));
                                                }
                                                PayPalDataCollector payPalDataCollector = PayPalInternalClient.this.b;
                                                strA = payPalDataCollector.f13736a.a(anonymousClass12.c, configuration, payPalDataCollectorInternalRequest);
                                            }
                                            if (queryParameter != null) {
                                                payPalResponse.c = queryParameter;
                                            }
                                            payPalResponse.b = strA;
                                            payPalResponse.f13744a = uri2.toString();
                                        }
                                        anonymousClass12.f13739a.a(payPalResponse, null);
                                    } catch (JSONException e) {
                                        anonymousClass12.f13739a.a(null, e);
                                    }
                                }
                            };
                            braintreeClient.getClass();
                            Intrinsics.h(data, "data");
                            BraintreeClient.g(braintreeClient, strConcat, data, httpResponseCallback);
                        } catch (JSONException e) {
                            anonymousClass4.a(null, e);
                        }
                    }
                });
            } else {
                this.f13739a.a(null, braintreeException);
            }
        }
    }

    /* renamed from: com.braintreepayments.api.PayPalInternalClient$2, reason: invalid class name */
    class AnonymousClass2 implements TokenizeCallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ PayPalBrowserSwitchResultCallback f13742a;

        public AnonymousClass2(PayPalBrowserSwitchResultCallback payPalBrowserSwitchResultCallback) {
            this.f13742a = payPalBrowserSwitchResultCallback;
        }

        public final void a(JSONObject jSONObject, Exception exc) {
            PayPalBrowserSwitchResultCallback payPalBrowserSwitchResultCallback = this.f13742a;
            if (jSONObject == null) {
                ((PayPalClient.AnonymousClass6) payPalBrowserSwitchResultCallback).a(null, exc);
                return;
            }
            try {
                ((PayPalClient.AnonymousClass6) payPalBrowserSwitchResultCallback).a(PayPalAccountNonce.a(jSONObject), null);
            } catch (JSONException e) {
                ((PayPalClient.AnonymousClass6) payPalBrowserSwitchResultCallback).a(null, e);
            }
        }
    }

    public PayPalInternalClient(BraintreeClient braintreeClient) {
        PayPalDataCollector payPalDataCollector = new PayPalDataCollector();
        ApiClient apiClient = new ApiClient(braintreeClient);
        this.f13738a = braintreeClient;
        this.b = payPalDataCollector;
        this.c = apiClient;
    }

    public final void a(PayPalAccount payPalAccount, PayPalBrowserSwitchResultCallback payPalBrowserSwitchResultCallback) {
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(payPalBrowserSwitchResultCallback);
        ApiClient apiClient = this.c;
        apiClient.getClass();
        BraintreeClient braintreeClient = apiClient.f13697a;
        String strConcat = "/v1/".concat("payment_methods/paypal_accounts");
        payPalAccount.f13745a = braintreeClient.c;
        BraintreeClient.e(braintreeClient, "card.rest.tokenization.started");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new MetadataBuilder().f13730a;
        try {
            jSONObject2.put("sessionId", payPalAccount.f13745a);
        } catch (JSONException unused) {
        }
        try {
            jSONObject2.put("source", payPalAccount.b);
        } catch (JSONException unused2) {
        }
        try {
            jSONObject2.put("integration", i.a.m);
        } catch (JSONException unused3) {
        }
        jSONObject.put("_meta", jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("correlationId", payPalAccount.c);
        jSONObject3.put("intent", payPalAccount.e);
        if ("single-payment".equalsIgnoreCase(payPalAccount.g)) {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("validate", false);
            jSONObject3.put("options", jSONObject4);
        }
        Iterator<String> itKeys = payPalAccount.d.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            jSONObject3.put(next, payPalAccount.d.get(next));
        }
        Object obj = payPalAccount.f;
        if (obj != null) {
            jSONObject.put("merchant_account_id", obj);
        }
        jSONObject.put("paypalAccount", jSONObject3);
        BraintreeClient.g(braintreeClient, strConcat, String.valueOf(jSONObject), new a(apiClient, braintreeClient, anonymousClass2));
    }
}
