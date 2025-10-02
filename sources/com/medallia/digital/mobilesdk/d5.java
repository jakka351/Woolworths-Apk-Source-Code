package com.medallia.digital.mobilesdk;

import org.json.JSONObject;

/* loaded from: classes6.dex */
class d5 {
    private static final int c = 31;

    /* renamed from: a, reason: collision with root package name */
    private String f16427a;
    private String b;

    public d5(JSONObject jSONObject) {
        try {
            if (jSONObject.has("key") && !jSONObject.isNull("key")) {
                this.f16427a = jSONObject.getString("key");
            }
            if (!jSONObject.has("presignedUrl") || jSONObject.isNull("presignedUrl")) {
                return;
            }
            this.b = jSONObject.getString("presignedUrl");
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public String a() {
        return this.f16427a;
    }

    public String b() {
        return this.b;
    }

    public String c() {
        try {
            return "{\"key\":" + l3.c(this.f16427a) + ",\"presignedUrl\":" + l3.c(this.b) + "}";
        } catch (Exception e) {
            a4.c(e.getMessage());
            return "";
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            d5 d5Var = (d5) obj;
            String str = this.f16427a;
            if (str == null ? d5Var.f16427a != null : !str.equals(d5Var.f16427a)) {
                return false;
            }
            String str2 = this.b;
            String str3 = d5Var.b;
            if (str2 == null ? str3 != null : !str2.equals(str3)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f16427a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
