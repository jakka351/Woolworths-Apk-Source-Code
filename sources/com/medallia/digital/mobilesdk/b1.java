package com.medallia.digital.mobilesdk;

import java.io.Serializable;
import org.json.JSONObject;

/* loaded from: classes6.dex */
class b1 implements Serializable {
    private static final int f = 31;

    /* renamed from: a, reason: collision with root package name */
    private String f16381a;
    private String b;
    private String c;
    private String d;
    private String e;

    public b1(JSONObject jSONObject) {
        try {
            if (jSONObject.has("invitationTitle") && !jSONObject.isNull("invitationTitle")) {
                this.f16381a = jSONObject.getString("invitationTitle");
            }
            if (jSONObject.has("invitationDescription") && !jSONObject.isNull("invitationDescription")) {
                this.b = jSONObject.getString("invitationDescription");
            }
            if (jSONObject.has("provideButtonText") && !jSONObject.isNull("provideButtonText")) {
                this.c = jSONObject.getString("provideButtonText");
            }
            if (jSONObject.has("declineButtonText") && !jSONObject.isNull("declineButtonText")) {
                this.d = jSONObject.getString("declineButtonText");
            }
            if (!jSONObject.has("laterButtonText") || jSONObject.isNull("laterButtonText")) {
                return;
            }
            this.e = jSONObject.getString("laterButtonText");
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public String a() {
        return this.d;
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.f16381a;
    }

    public String d() {
        return this.e;
    }

    public String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b1 b1Var = (b1) obj;
        String str = this.f16381a;
        if (str == null ? b1Var.f16381a != null : !str.equals(b1Var.f16381a)) {
            return false;
        }
        String str2 = this.b;
        if (str2 == null ? b1Var.b != null : !str2.equals(b1Var.b)) {
            return false;
        }
        String str3 = this.c;
        if (str3 == null ? b1Var.c != null : !str3.equals(b1Var.c)) {
            return false;
        }
        String str4 = this.d;
        if (str4 == null ? b1Var.d != null : !str4.equals(b1Var.d)) {
            return false;
        }
        String str5 = this.e;
        String str6 = b1Var.e;
        return str5 == null ? str6 == null : str5.equals(str6);
    }

    public String f() {
        try {
            return "{\"invitationTitle\":" + l3.d(this.f16381a) + ",\"invitationDescription\":" + l3.d(this.b) + ",\"provideButtonText\":" + l3.c(this.c) + ",\"declineButtonText\":" + l3.c(this.d) + ",\"laterButtonText\":" + l3.c(this.e) + "}";
        } catch (Exception e) {
            a4.c(e.getMessage());
            return "";
        }
    }

    public int hashCode() {
        String str = this.f16381a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
