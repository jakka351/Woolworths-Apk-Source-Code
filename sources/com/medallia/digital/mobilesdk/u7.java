package com.medallia.digital.mobilesdk;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class u7 {

    /* renamed from: a, reason: collision with root package name */
    private w5 f16740a;
    private w5 b;

    public u7(w5 w5Var, w5 w5Var2) {
        this.f16740a = w5Var;
        this.b = w5Var2;
    }

    public w5 a() {
        return this.b;
    }

    public w5 b() {
        return this.f16740a;
    }

    public String c() {
        try {
            String strB = "null";
            StringBuilder sb = new StringBuilder("{\"light\":");
            w5 w5Var = this.f16740a;
            sb.append(w5Var == null ? "null" : w5Var.b());
            sb.append(",\"dark\":");
            w5 w5Var2 = this.b;
            if (w5Var2 != null) {
                strB = w5Var2.b();
            }
            sb.append(strB);
            sb.append("}");
            return sb.toString();
        } catch (Exception e) {
            a4.c(e.getMessage());
            return "";
        }
    }

    public u7(JSONObject jSONObject) {
        try {
            if (jSONObject.has("light") && !jSONObject.isNull("light")) {
                this.f16740a = new w5(jSONObject.getJSONObject("light"));
            }
            if (!jSONObject.has("dark") || jSONObject.isNull("dark")) {
                return;
            }
            this.b = new w5(jSONObject.getJSONObject("dark"));
        } catch (JSONException e) {
            a4.c(e.getMessage());
        }
    }
}
