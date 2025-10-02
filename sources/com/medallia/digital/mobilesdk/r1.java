package com.medallia.digital.mobilesdk;

import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class r1 extends a0 {
    private String e;
    private HashMap<String, String> f;

    public r1(JSONObject jSONObject) {
        super(jSONObject);
        try {
            if (jSONObject.has("submitEventsEndpoint") && !jSONObject.isNull("submitEventsEndpoint")) {
                this.e = jSONObject.getString("submitEventsEndpoint");
            }
            if (!jSONObject.has("headers") || jSONObject.isNull("headers")) {
                return;
            }
            this.f = ModelFactory.getInstance().getStringMap(jSONObject.getJSONObject("headers"));
        } catch (JSONException e) {
            a4.c(e.getMessage());
        }
    }

    @Override // com.medallia.digital.mobilesdk.a0
    public /* bridge */ /* synthetic */ Integer a() {
        return super.a();
    }

    @Override // com.medallia.digital.mobilesdk.a0
    public /* bridge */ /* synthetic */ Integer b() {
        return super.b();
    }

    @Override // com.medallia.digital.mobilesdk.a0
    public /* bridge */ /* synthetic */ Integer c() {
        return super.c();
    }

    @Override // com.medallia.digital.mobilesdk.a0
    public /* bridge */ /* synthetic */ boolean d() {
        return super.d();
    }

    @Override // com.medallia.digital.mobilesdk.a0
    public String e() {
        try {
            return "{\"maxRecordsToSubmit\":" + a() + ",\"maxRecursiveSubmits\":" + b() + ",\"isSamplingEnabled\":" + d() + ",\"samplePercent\":" + c() + ",\"submitEventsEndpoint\":" + l3.c(g()) + ",\"headers\":" + ModelFactory.getInstance().getStringMapAsJsonString(this.f) + "}";
        } catch (Exception e) {
            a4.c(e.getMessage());
            return "";
        }
    }

    public HashMap<String, String> f() {
        return this.f;
    }

    public String g() {
        return this.e;
    }
}
