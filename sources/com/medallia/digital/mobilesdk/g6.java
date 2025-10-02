package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.b0;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class g6 extends b0 {

    /* renamed from: a, reason: collision with root package name */
    String f16501a;
    Long b;
    Boolean c;

    public g6(String str, Long l, Boolean bool) {
        this.f16501a = str;
        this.b = l;
        this.c = bool;
    }

    public Long a() {
        return this.b;
    }

    public String b() {
        return this.f16501a;
    }

    public Boolean c() {
        return this.c;
    }

    @Override // com.medallia.digital.mobilesdk.b0
    public b0.a getDataTableObjectType() {
        return b0.a.QuarantineRule;
    }

    public String toJsonString() {
        try {
            return "{,\"id\":" + l3.c(this.f16501a) + ",\"expirationTime\":" + this.b + ",\"status\":" + this.c + "}";
        } catch (Exception e) {
            a4.c(e.getMessage());
            return "";
        }
    }

    public g6(JSONObject jSONObject) {
        try {
            if (jSONObject.has("id") && !jSONObject.isNull("id")) {
                this.f16501a = jSONObject.getString("id");
            }
            if (jSONObject.has("status") && !jSONObject.isNull("status")) {
                this.c = Boolean.valueOf(jSONObject.getBoolean("status"));
            }
            if (!jSONObject.has("expirationTime") || jSONObject.isNull("expirationTime")) {
                return;
            }
            this.b = Long.valueOf(jSONObject.getLong("expirationTime"));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }
}
