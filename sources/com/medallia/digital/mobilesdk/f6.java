package com.medallia.digital.mobilesdk;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class f6 implements x0 {

    /* renamed from: a, reason: collision with root package name */
    private ArrayList<g6> f16480a;
    private String b;
    private boolean c;
    private String d;

    public f6() {
    }

    public String a() {
        return this.d;
    }

    public String b() {
        return this.b;
    }

    public ArrayList<g6> c() {
        return this.f16480a;
    }

    public boolean d() {
        return this.c;
    }

    @Override // com.medallia.digital.mobilesdk.x0
    public String toJsonString() {
        try {
            return "{\"rulesStatus\":" + ModelFactory.getInstance().rulesAsJsoString(this.f16480a) + ",\"cuuidPath\":" + l3.c(this.b) + "}";
        } catch (Exception e) {
            a4.c(e.getMessage());
            return "";
        }
    }

    public f6(JSONObject jSONObject) {
        try {
            if (jSONObject.has("rulesStatus") && !jSONObject.isNull("rulesStatus") && (jSONObject.get("rulesStatus") instanceof JSONArray)) {
                this.f16480a = ModelFactory.getInstance().getRulesArray(jSONObject.getJSONArray("rulesStatus"));
            }
            if (!jSONObject.has("cuuidPath") || jSONObject.isNull("cuuidPath")) {
                return;
            }
            this.b = jSONObject.getString("cuuidPath");
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public void a(String str) {
        this.d = str;
    }

    public void a(boolean z) {
        this.c = z;
    }
}
