package com.medallia.digital.mobilesdk;

import com.salesforce.marketingcloud.UrlHandler;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class v5 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private y0 f16746a;
    private e b;
    private i8 c;

    public v5(y0 y0Var, e eVar, i8 i8Var) {
        this.f16746a = y0Var;
        this.b = eVar;
        this.c = i8Var;
    }

    public e a() {
        return this.b;
    }

    public y0 b() {
        return this.f16746a;
    }

    public i8 c() {
        return this.c;
    }

    public String d() {
        try {
            String strD = "null";
            StringBuilder sb = new StringBuilder("{\"core\":");
            y0 y0Var = this.f16746a;
            sb.append(y0Var == null ? "null" : y0Var.c());
            sb.append(",\"action\":");
            e eVar = this.b;
            sb.append(eVar == null ? "null" : eVar.c());
            sb.append(",\"typography\":");
            i8 i8Var = this.c;
            if (i8Var != null) {
                strD = i8Var.d();
            }
            sb.append(strD);
            sb.append("}");
            return sb.toString();
        } catch (Exception e) {
            a4.c(e.getMessage());
            return "";
        }
    }

    public v5(JSONObject jSONObject) {
        try {
            if (jSONObject.has("core") && !jSONObject.isNull("core")) {
                this.f16746a = new y0(jSONObject.getJSONObject("core"));
            }
            if (jSONObject.has(UrlHandler.ACTION) && !jSONObject.isNull(UrlHandler.ACTION)) {
                this.b = new e(jSONObject.getJSONObject(UrlHandler.ACTION));
            }
            if (!jSONObject.has("typography") || jSONObject.isNull("typography")) {
                return;
            }
            this.c = new i8(jSONObject.getJSONObject("typography"));
        } catch (JSONException e) {
            a4.c(e.getMessage());
        }
    }
}
