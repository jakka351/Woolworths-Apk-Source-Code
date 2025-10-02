package com.medallia.digital.mobilesdk;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class w5 {

    /* renamed from: a, reason: collision with root package name */
    private v5 f16760a;

    public w5(v5 v5Var) {
        this.f16760a = v5Var;
    }

    public v5 a() {
        return this.f16760a;
    }

    public String b() {
        try {
            String strD = "null";
            StringBuilder sb = new StringBuilder("{\"palette\":");
            v5 v5Var = this.f16760a;
            if (v5Var != null) {
                strD = v5Var.d();
            }
            sb.append(strD);
            sb.append("}");
            return sb.toString();
        } catch (Exception e) {
            a4.c(e.getMessage());
            return "";
        }
    }

    public w5(JSONObject jSONObject) {
        try {
            if (!jSONObject.has("palette") || jSONObject.isNull("palette")) {
                return;
            }
            this.f16760a = new v5(jSONObject.getJSONObject("palette"));
        } catch (JSONException e) {
            a4.c(e.getMessage());
        }
    }
}
