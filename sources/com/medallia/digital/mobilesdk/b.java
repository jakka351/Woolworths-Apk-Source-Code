package com.medallia.digital.mobilesdk;

import org.json.JSONObject;

/* loaded from: classes.dex */
class b extends j3 {
    private String b;
    private long c;
    private long d;
    private long e;

    public b(String str) {
        super(str);
        try {
            JSONObject jSONObject = new JSONObject(k3.c(str));
            if (jSONObject.has("getConfigUrl") && !jSONObject.isNull("getConfigUrl")) {
                this.b = jSONObject.getString("getConfigUrl");
            }
            if (jSONObject.has("createTime") && !jSONObject.isNull("createTime")) {
                this.d = jSONObject.getLong("createTime");
            }
            if (jSONObject.has("ttl") && !jSONObject.isNull("ttl")) {
                this.e = jSONObject.getLong("ttl");
            }
            if (!jSONObject.has("propertyId") || jSONObject.isNull("propertyId")) {
                return;
            }
            this.c = jSONObject.getLong("propertyId");
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public void a(long j) {
        this.c = j;
    }

    public long b() {
        return this.d;
    }

    public String c() {
        return this.b;
    }

    public long d() {
        return this.c;
    }

    public long e() {
        return this.e;
    }

    public b(String str, String str2, long j, long j2, long j3) {
        super(str);
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = j3;
    }
}
