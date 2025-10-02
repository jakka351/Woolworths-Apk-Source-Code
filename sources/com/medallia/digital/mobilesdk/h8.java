package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.u1;
import java.util.ArrayList;
import org.json.JSONObject;

/* loaded from: classes.dex */
class h8 implements x0 {

    /* renamed from: a, reason: collision with root package name */
    private String f16522a;
    private u1.k b;
    private ArrayList<p6> c;

    public h8(JSONObject jSONObject) {
        try {
            if (jSONObject.has("value") && !jSONObject.isNull("value")) {
                this.f16522a = jSONObject.getString("value");
            }
            if (jSONObject.has("type") && !jSONObject.isNull("type")) {
                this.b = u1.k.a(jSONObject.getString("type"));
            }
            if (!jSONObject.has("conversions") || jSONObject.isNull("conversions")) {
                return;
            }
            this.c = ModelFactory.getInstance().getRuleConversionContract(jSONObject.getJSONArray("conversions"));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public ArrayList<p6> a() {
        return this.c;
    }

    public u1.k b() {
        return this.b;
    }

    public String c() {
        return this.f16522a;
    }

    @Override // com.medallia.digital.mobilesdk.x0
    public String toJsonString() {
        try {
            StringBuilder sb = new StringBuilder("{\"value\":");
            sb.append(l3.c(this.f16522a));
            sb.append(",\"type\":");
            u1.k kVar = this.b;
            sb.append(l3.c(kVar != null ? kVar.toString() : null));
            sb.append(",\"conversions\":");
            sb.append(ModelFactory.getInstance().getRuleConversionsAsJsonString(this.c));
            sb.append("}");
            return sb.toString();
        } catch (Exception e) {
            a4.c(e.getMessage());
            return "";
        }
    }
}
