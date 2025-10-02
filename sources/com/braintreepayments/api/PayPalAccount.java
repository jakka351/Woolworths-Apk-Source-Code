package com.braintreepayments.api;

import org.json.JSONObject;

/* loaded from: classes4.dex */
class PayPalAccount extends PaymentMethod {
    public String c;
    public JSONObject d;
    public String e;
    public String f;
    public String g;

    public PayPalAccount() {
        this.b = "form";
        this.d = new JSONObject();
    }
}
