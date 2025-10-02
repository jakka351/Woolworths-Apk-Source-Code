package com.medallia.digital.mobilesdk;

import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
class y0 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private String f16779a;
    private String b;

    public y0(String str, String str2) {
        this.f16779a = str;
        this.b = str2;
    }

    public String a() {
        return this.f16779a;
    }

    public String b() {
        return this.b;
    }

    public String c() {
        try {
            return "{\"canvas\":" + l3.c(this.f16779a) + ",\"header\":" + l3.c(this.b) + "}";
        } catch (Exception e) {
            a4.c(e.getMessage());
            return "";
        }
    }

    public y0(JSONObject jSONObject) {
        try {
            if (jSONObject.has("canvas") && !jSONObject.isNull("canvas")) {
                this.f16779a = jSONObject.getString("canvas");
            }
            if (!jSONObject.has("header") || jSONObject.isNull("header")) {
                return;
            }
            this.b = jSONObject.getString("header");
        } catch (JSONException e) {
            a4.c(e.getMessage());
        }
    }
}
