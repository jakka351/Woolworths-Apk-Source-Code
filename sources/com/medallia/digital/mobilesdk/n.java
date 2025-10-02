package com.medallia.digital.mobilesdk;

import org.json.JSONObject;

/* loaded from: classes.dex */
class n extends j3 {
    private long b;
    private String c;

    public n(String str) {
        super(str);
        try {
            JSONObject jSONObject = new JSONObject(k3.c(str));
            if (jSONObject.has("propertyId") && !jSONObject.isNull("propertyId")) {
                this.b = jSONObject.getLong("propertyId");
            }
            if (!jSONObject.has("authUrl") || jSONObject.isNull("authUrl")) {
                return;
            }
            this.c = jSONObject.getString("authUrl");
        } catch (Exception unused) {
        }
    }

    public String b() {
        return this.c;
    }

    public long c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !(obj instanceof n)) {
            return false;
        }
        String strA = a();
        String strA2 = ((n) obj).a();
        return strA != null ? strA.equals(strA2) : strA2 == null;
    }

    public int hashCode() {
        if (a() != null) {
            return a().hashCode();
        }
        return 0;
    }

    public n(String str, long j, String str2) {
        super(str);
        this.b = j;
        this.c = str2;
    }
}
