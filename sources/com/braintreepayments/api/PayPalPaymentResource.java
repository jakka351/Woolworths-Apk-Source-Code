package com.braintreepayments.api;

import org.json.JSONObject;

/* loaded from: classes4.dex */
class PayPalPaymentResource {

    /* renamed from: a, reason: collision with root package name */
    public String f13743a;

    public static PayPalPaymentResource a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        PayPalPaymentResource payPalPaymentResource = new PayPalPaymentResource();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("paymentResource");
        if (jSONObjectOptJSONObject != null) {
            payPalPaymentResource.f13743a = Json.a(jSONObjectOptJSONObject, "redirectUrl", "");
            return payPalPaymentResource;
        }
        payPalPaymentResource.f13743a = Json.a(jSONObject.optJSONObject("agreementSetup"), "approvalUrl", "");
        return payPalPaymentResource;
    }
}
