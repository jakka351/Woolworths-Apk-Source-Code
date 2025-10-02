package com.medallia.digital.mobilesdk;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class i {

    /* renamed from: a, reason: collision with root package name */
    private y1 f16523a;
    private JSONObject b;
    private JSONObject c;
    private JSONObject d;

    public i(JSONObject jSONObject) {
        try {
            if (jSONObject.has("extraData") && !jSONObject.isNull("extraData")) {
                this.b = jSONObject.getJSONObject("extraData");
            }
            if (jSONObject.has("eventDynamicStructure") && !jSONObject.isNull("eventDynamicStructure")) {
                this.c = jSONObject.getJSONObject("eventDynamicStructure");
            }
            if (jSONObject.has("events") && !jSONObject.isNull("events")) {
                this.f16523a = new y1(jSONObject.getJSONObject("events"));
            }
            if (!jSONObject.has("externalData") || jSONObject.isNull("externalData")) {
                return;
            }
            this.d = jSONObject.getJSONObject("externalData");
        } catch (JSONException e) {
            a4.c(e.getMessage());
        }
    }

    public JSONObject a() {
        return this.c;
    }

    public y1 b() {
        return this.f16523a;
    }

    public JSONObject c() {
        return this.d;
    }

    public JSONObject d() {
        return this.b;
    }

    public String e() {
        try {
            StringBuilder sb = new StringBuilder("{\"events\":");
            y1 y1Var = this.f16523a;
            String string = "null";
            sb.append(y1Var == null ? "null" : y1Var.w0());
            sb.append(",\"extraData\":");
            JSONObject jSONObject = this.b;
            sb.append(jSONObject == null ? "null" : jSONObject.toString());
            sb.append(",\"externalData\":");
            JSONObject jSONObject2 = this.d;
            sb.append(jSONObject2 == null ? "null" : jSONObject2.toString());
            sb.append(",\"eventDynamicStructure\":");
            JSONObject jSONObject3 = this.c;
            if (jSONObject3 != null) {
                string = jSONObject3.toString();
            }
            sb.append(string);
            sb.append("}");
            return sb.toString();
        } catch (Exception e) {
            a4.c(e.getMessage());
            return "";
        }
    }
}
