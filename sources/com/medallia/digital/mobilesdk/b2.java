package com.medallia.digital.mobilesdk;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
class b2 {

    /* renamed from: a, reason: collision with root package name */
    private String f16382a;
    private DynamicData b;

    public b2(JSONObject jSONObject) {
        try {
            if (jSONObject.has("uuid") && !jSONObject.isNull("uuid")) {
                this.f16382a = jSONObject.getString("uuid");
            }
            if (!jSONObject.has("dynamicData") || jSONObject.isNull("dynamicData")) {
                return;
            }
            this.b = new DynamicData(jSONObject.getJSONObject("dynamicData"));
        } catch (JSONException e) {
            a4.c(e.getMessage());
        }
    }

    public DynamicData a() {
        return this.b;
    }

    public String b() {
        return this.f16382a;
    }

    public void a(String str) {
        this.f16382a = str;
    }
}
