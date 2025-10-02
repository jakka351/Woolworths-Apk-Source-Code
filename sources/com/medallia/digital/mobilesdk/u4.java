package com.medallia.digital.mobilesdk;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class u4 {

    /* renamed from: a, reason: collision with root package name */
    private Integer f16736a;

    public u4(int i) {
        this.f16736a = Integer.valueOf(i);
    }

    public Integer a() {
        return this.f16736a;
    }

    public String b() {
        try {
            return "{\"retryAttempts\":" + this.f16736a + "}";
        } catch (Exception e) {
            a4.c(e.getMessage());
            return "";
        }
    }

    public u4(JSONObject jSONObject) {
        try {
            if (!jSONObject.has("retriesAttempts") || jSONObject.isNull("retriesAttempts")) {
                return;
            }
            this.f16736a = Integer.valueOf(jSONObject.getInt("retriesAttempts"));
        } catch (JSONException e) {
            a4.c(e.getMessage());
        }
    }
}
