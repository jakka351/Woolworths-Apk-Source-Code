package com.medallia.digital.mobilesdk;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
abstract class a0 {

    /* renamed from: a, reason: collision with root package name */
    private Integer f16369a;
    private Integer b;
    private boolean c;
    private Integer d;

    public a0() {
    }

    public Integer a() {
        return this.f16369a;
    }

    public Integer b() {
        return this.b;
    }

    public Integer c() {
        return this.d;
    }

    public boolean d() {
        return this.c;
    }

    public String e() {
        try {
            return "{\"maxRecordsToSubmit\":" + a() + ",\"maxRecursiveSubmits\":" + b() + ",\"isSamplingEnabled\":" + d() + ",\"samplePercent\":" + c() + "}";
        } catch (Exception e) {
            a4.c(e.getMessage());
            return "";
        }
    }

    public a0(JSONObject jSONObject) {
        try {
            if (jSONObject.has("maxRecordsToSubmit") && !jSONObject.isNull("maxRecordsToSubmit")) {
                this.f16369a = Integer.valueOf(jSONObject.getInt("maxRecordsToSubmit"));
            }
            if (jSONObject.has("maxRecursiveSubmits") && !jSONObject.isNull("maxRecursiveSubmits")) {
                this.b = Integer.valueOf(jSONObject.getInt("maxRecursiveSubmits"));
            }
            if (jSONObject.has("isSamplingEnabled") && !jSONObject.isNull("isSamplingEnabled")) {
                this.c = jSONObject.getBoolean("isSamplingEnabled");
            }
            if (!jSONObject.has("samplePercent") || jSONObject.isNull("samplePercent")) {
                return;
            }
            this.d = Integer.valueOf(jSONObject.getInt("samplePercent"));
        } catch (JSONException e) {
            a4.c(e.getMessage());
        }
    }
}
