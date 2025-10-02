package com.medallia.digital.mobilesdk;

import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
class e implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private String f16436a;
    private String b;

    public e(String str, String str2) {
        this.f16436a = str;
        this.b = str2;
    }

    public String a() {
        return this.f16436a;
    }

    public String b() {
        return this.b;
    }

    public String c() {
        try {
            return "{\"primary\":" + l3.c(this.f16436a) + ",\"auxiliary\":" + l3.c(this.b) + "}";
        } catch (Exception e) {
            a4.c(e.getMessage());
            return "";
        }
    }

    public e(JSONObject jSONObject) {
        try {
            if (jSONObject.has("primary") && !jSONObject.isNull("primary")) {
                this.f16436a = jSONObject.getString("primary");
            }
            if (!jSONObject.has("auxiliary") || jSONObject.isNull("auxiliary")) {
                return;
            }
            this.b = jSONObject.getString("auxiliary");
        } catch (JSONException e) {
            a4.c(e.getMessage());
        }
    }
}
