package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.u1;
import org.json.JSONObject;

/* loaded from: classes6.dex */
class p6 implements x0 {

    /* renamed from: a, reason: collision with root package name */
    private u1.g f16636a;
    private String b;

    public p6(JSONObject jSONObject) {
        try {
            if (jSONObject.has("value") && !jSONObject.isNull("value")) {
                this.b = jSONObject.getString("value");
            }
            if (!jSONObject.has("ruleConversion") || jSONObject.isNull("ruleConversion")) {
                return;
            }
            this.f16636a = u1.g.a(jSONObject.getString("ruleConversion"));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public u1.g a() {
        return this.f16636a;
    }

    public String b() {
        return this.b;
    }

    @Override // com.medallia.digital.mobilesdk.x0
    public String toJsonString() {
        try {
            StringBuilder sb = new StringBuilder("{\"value\":");
            sb.append(l3.c(this.b));
            sb.append(",\"ruleConversion\":");
            u1.g gVar = this.f16636a;
            sb.append(l3.c(gVar != null ? gVar.toString() : null));
            sb.append("}");
            return sb.toString();
        } catch (Exception e) {
            a4.c(e.getMessage());
            return "";
        }
    }
}
