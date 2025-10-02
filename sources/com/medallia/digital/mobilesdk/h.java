package com.medallia.digital.mobilesdk;

import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
class h {

    /* renamed from: a, reason: collision with root package name */
    private String f16504a;
    private String b;
    private HashMap<String, String> c;

    public h(JSONObject jSONObject) {
        try {
            if (jSONObject.has("url") && !jSONObject.isNull("url")) {
                this.f16504a = jSONObject.getString("url");
            }
            if (jSONObject.has("requestType") && !jSONObject.isNull("requestType")) {
                this.b = jSONObject.getString("requestType");
            }
            if (!jSONObject.has("headers") || jSONObject.isNull("headers")) {
                return;
            }
            this.c = ModelFactory.getInstance().getStringMap(jSONObject.getJSONObject("headers"));
        } catch (JSONException e) {
            a4.c(e.getMessage());
        }
    }

    public HashMap<String, String> a() {
        return this.c;
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.f16504a;
    }

    public String d() {
        try {
            return "{\"url\":" + l3.c(this.f16504a) + ",\"requestType\":" + l3.c(this.b) + ",\"headers\":" + ModelFactory.getInstance().getStringMapAsJsonString(this.c) + "}";
        } catch (Exception e) {
            a4.c(e.getMessage());
            return "";
        }
    }
}
