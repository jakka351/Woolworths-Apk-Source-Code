package com.braintreepayments.api;

import org.json.JSONObject;

/* loaded from: classes4.dex */
class Json {
    public static String a(JSONObject jSONObject, String str, String str2) {
        return (jSONObject == null || jSONObject.isNull(str)) ? str2 : jSONObject.optString(str, str2);
    }
}
