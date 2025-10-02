package com.medallia.digital.mobilesdk;

import com.salesforce.marketingcloud.UrlHandler;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
class g5 {

    /* renamed from: a, reason: collision with root package name */
    private String f16500a;
    private String b;
    private String c;
    private String d;
    private int e;

    public g5(JSONObject jSONObject) {
        try {
            if (jSONObject.has("componentId") && !jSONObject.isNull("componentId")) {
                this.f16500a = jSONObject.getString("componentId");
            }
            if (jSONObject.has("mediaType") && !jSONObject.isNull("mediaType")) {
                this.b = jSONObject.getString("mediaType");
            }
            if (jSONObject.has(UrlHandler.ACTION) && !jSONObject.isNull(UrlHandler.ACTION)) {
                this.c = jSONObject.getString(UrlHandler.ACTION);
            }
            if (jSONObject.has("ecId") && !jSONObject.isNull("ecId")) {
                this.d = jSONObject.getString("ecId");
            }
            if (!jSONObject.has("maxMediaLength") || jSONObject.isNull("maxMediaLength")) {
                return;
            }
            this.e = jSONObject.getInt("maxMediaLength");
        } catch (JSONException e) {
            a4.c(e.getMessage());
        }
    }

    public String a() {
        return this.c;
    }

    public String b() {
        return this.f16500a;
    }

    public String c() {
        return this.d;
    }

    public String d() {
        String str = this.b;
        if (str != null) {
            return str.toLowerCase();
        }
        return null;
    }

    public int e() {
        return this.e;
    }
}
