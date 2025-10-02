package com.braintreepayments.api;

import com.braintreepayments.api.PayPalInternalClient;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements HttpResponseCallback, AuthorizationCallback, NetworkResponseCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BraintreeClient f13753a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(ApiClient apiClient, BraintreeClient braintreeClient, TokenizeCallback tokenizeCallback) {
        this.b = apiClient;
        this.f13753a = braintreeClient;
        this.c = tokenizeCallback;
    }

    @Override // com.braintreepayments.api.HttpResponseCallback
    public void a(Exception exc, String str) {
        JSONObject jSONObject;
        ApiClient this$0 = (ApiClient) this.b;
        TokenizeCallback tokenizeCallback = (TokenizeCallback) this.c;
        Intrinsics.h(this$0, "this$0");
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        } else {
            jSONObject = null;
        }
        BraintreeClient braintreeClient = this.f13753a;
        if (jSONObject != null) {
            BraintreeClient.e(braintreeClient, "card.rest.tokenization.success");
            ((PayPalInternalClient.AnonymousClass2) tokenizeCallback).a(jSONObject, null);
        } else if (exc != null) {
            BraintreeClient.e(braintreeClient, "card.rest.tokenization.failure");
            ((PayPalInternalClient.AnonymousClass2) tokenizeCallback).a(null, exc);
        }
    }

    @Override // com.braintreepayments.api.AuthorizationCallback
    public void b(Authorization authorization, BraintreeException braintreeException) {
        String str = (String) this.b;
        AnalyticsEventParams analyticsEventParams = (AnalyticsEventParams) this.c;
        if (authorization != null) {
            BraintreeClient braintreeClient = this.f13753a;
            braintreeClient.c(new c(braintreeClient, str, analyticsEventParams, authorization));
        }
    }

    @Override // com.braintreepayments.api.NetworkResponseCallback
    public void c(HttpResponse httpResponse, Exception exc) {
        String url = (String) this.b;
        HttpResponseCallback responseCallback = (HttpResponseCallback) this.c;
        BraintreeClient this$0 = this.f13753a;
        Intrinsics.h(this$0, "this$0");
        Intrinsics.h(url, "$url");
        Intrinsics.h(responseCallback, "$responseCallback");
        if (httpResponse == null) {
            if (exc != null) {
                responseCallback.a(exc, null);
            }
        } else {
            try {
                this$0.f(url, httpResponse.b);
                responseCallback.a(null, httpResponse.f13727a);
            } catch (JSONException e) {
                responseCallback.a(e, null);
            }
        }
    }

    public /* synthetic */ a(BraintreeClient braintreeClient, String str, Object obj) {
        this.f13753a = braintreeClient;
        this.b = str;
        this.c = obj;
    }
}
