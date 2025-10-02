package com.medallia.digital.mobilesdk;

import com.salesforce.marketingcloud.UrlHandler;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
class i8 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private String f16530a;
    private String b;
    private e c;

    public i8(String str, String str2, e eVar) {
        this.f16530a = str;
        this.b = str2;
        this.c = eVar;
    }

    public String a() {
        e eVar = this.c;
        if (eVar == null || eVar.a() == null) {
            return null;
        }
        return this.c.a();
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.f16530a;
    }

    public String d() {
        try {
            String strC = "null";
            StringBuilder sb = new StringBuilder("{\"headline\":");
            sb.append(l3.c(this.f16530a));
            sb.append(",\"header\":");
            sb.append(l3.c(this.b));
            sb.append(",\"action\":");
            e eVar = this.c;
            if (eVar != null) {
                strC = eVar.c();
            }
            sb.append(strC);
            sb.append("}");
            return sb.toString();
        } catch (Exception e) {
            a4.c(e.getMessage());
            return "";
        }
    }

    public i8(JSONObject jSONObject) {
        try {
            if (jSONObject.has("headline") && !jSONObject.isNull("headline")) {
                this.f16530a = jSONObject.getString("headline");
            }
            if (jSONObject.has("header") && !jSONObject.isNull("header")) {
                this.b = jSONObject.getString("header");
            }
            if (!jSONObject.has(UrlHandler.ACTION) || jSONObject.isNull(UrlHandler.ACTION)) {
                return;
            }
            this.c = new e(jSONObject.getJSONObject(UrlHandler.ACTION));
        } catch (JSONException e) {
            a4.c(e.getMessage());
        }
    }
}
