package com.medallia.digital.mobilesdk;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class x1 {

    /* renamed from: a, reason: collision with root package name */
    private String f16763a;
    private boolean b;
    private ArrayList<String> c;
    private boolean d;

    public x1(JSONObject jSONObject) {
        try {
            if (jSONObject.has(com.salesforce.marketingcloud.config.a.h) && !jSONObject.isNull(com.salesforce.marketingcloud.config.a.h)) {
                this.f16763a = jSONObject.getString(com.salesforce.marketingcloud.config.a.h);
            }
            if (jSONObject.has("analyticsEnabled") && !jSONObject.isNull("analyticsEnabled")) {
                this.b = jSONObject.getBoolean("analyticsEnabled");
            }
            if (jSONObject.has("extraData") && !jSONObject.isNull("extraData") && (jSONObject.get("extraData") instanceof JSONArray)) {
                this.c = ModelFactory.getInstance().getStringArray(jSONObject.getJSONArray("extraData"));
            }
            if (!jSONObject.has("isSampling") || jSONObject.isNull("isSampling")) {
                return;
            }
            this.d = jSONObject.getBoolean("isSampling");
        } catch (JSONException e) {
            a4.c(e.getMessage());
        }
    }

    public String a() {
        return this.f16763a;
    }

    public ArrayList<String> b() {
        return this.c;
    }

    public boolean c() {
        return this.b;
    }

    public boolean d() {
        return this.d;
    }

    public String e() {
        try {
            return "{\"eventName\":" + l3.c(this.f16763a) + ",\"analyticsEnabled\":" + this.b + ",\"extraData\":" + ModelFactory.getInstance().getStringArrayAsJsonString(this.c) + ",\"isSampling\":" + this.d + "}";
        } catch (Exception e) {
            a4.c(e.getMessage());
            return "";
        }
    }
}
