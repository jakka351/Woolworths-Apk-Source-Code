package com.medallia.digital.mobilesdk;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class t7 {

    /* renamed from: a, reason: collision with root package name */
    private u7 f16714a;

    public t7(JSONObject jSONObject) {
        try {
            if (!jSONObject.has("themeData") || jSONObject.isNull("themeData")) {
                return;
            }
            this.f16714a = new u7(jSONObject.getJSONObject("themeData"));
        } catch (JSONException e) {
            a4.c(e.getMessage());
        }
    }

    public u7 a() {
        return this.f16714a;
    }

    public String b() {
        try {
            String strC = "null";
            StringBuilder sb = new StringBuilder("{\"themeData\":");
            u7 u7Var = this.f16714a;
            if (u7Var != null) {
                strC = u7Var.c();
            }
            sb.append(strC);
            sb.append("}");
            return sb.toString();
        } catch (Exception e) {
            a4.c(e.getMessage());
            return "";
        }
    }
}
