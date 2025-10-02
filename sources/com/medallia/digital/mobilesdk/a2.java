package com.medallia.digital.mobilesdk;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
class a2 {

    /* renamed from: a, reason: collision with root package name */
    private String f16371a;

    public a2(String str) {
        this.f16371a = str;
    }

    public String a() {
        return this.f16371a;
    }

    public a2(JSONObject jSONObject) {
        try {
            if (!jSONObject.has("feedback") || jSONObject.isNull("feedback")) {
                return;
            }
            this.f16371a = jSONObject.getString("feedback");
        } catch (JSONException e) {
            a4.c(e.getMessage());
        }
    }

    public void a(String str) {
        this.f16371a = str;
    }
}
