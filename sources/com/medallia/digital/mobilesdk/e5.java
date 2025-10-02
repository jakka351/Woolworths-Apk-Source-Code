package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.b0;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
class e5 extends b0 implements Serializable {
    private static final int j = 31;

    /* renamed from: a, reason: collision with root package name */
    private String f16446a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private long g;
    private String h;
    private int i;

    public e5(String str, String str2, String str3, String str4, String str5, String str6, long j2, String str7, int i) {
        this.f16446a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = j2;
        this.h = str7;
        this.i = i;
    }

    public String a() {
        return this.h;
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.e;
    }

    public String d() {
        return this.f16446a;
    }

    public String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            e5 e5Var = (e5) obj;
            String str = this.f16446a;
            if (str == null ? e5Var.f16446a != null : !str.equals(e5Var.f16446a)) {
                return false;
            }
            String str2 = this.b;
            if (str2 == null ? e5Var.b != null : !str2.equals(e5Var.b)) {
                return false;
            }
            String str3 = this.c;
            if (str3 == null ? e5Var.c != null : !str3.equals(e5Var.c)) {
                return false;
            }
            String str4 = this.d;
            if (str4 == null ? e5Var.d != null : !str4.equals(e5Var.d)) {
                return false;
            }
            String str5 = this.e;
            if (str5 == null ? e5Var.e != null : !str5.equals(e5Var.e)) {
                return false;
            }
            String str6 = this.f;
            if (str6 == null ? e5Var.f != null : !str6.equals(e5Var.f)) {
                return false;
            }
            String str7 = this.h;
            if (str7 == null ? e5Var.h != null : !str7.equals(e5Var.h)) {
                return false;
            }
            if (this.g != e5Var.g) {
                return true;
            }
        }
        return false;
    }

    public String f() {
        return this.f;
    }

    public int g() {
        return this.i;
    }

    @Override // com.medallia.digital.mobilesdk.b0
    public b0.a getDataTableObjectType() {
        return b0.a.MediaFeedback;
    }

    public String getFormId() {
        return this.d;
    }

    public long h() {
        return this.g;
    }

    public int hashCode() {
        String str = this.f16446a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.e;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        return (int) (((iHashCode6 + (this.h != null ? r2.hashCode() : 0)) * 31) + this.g);
    }

    public void i() {
        this.i++;
    }

    public String toJsonString() {
        try {
            return "{\"mediaCaptureClientCorrelationId\":" + l3.c(this.f16446a) + ",\"feedbackClientCorrelationId\":" + l3.c(this.b) + ",\"mediaPath\":" + l3.c(this.c) + ",\"formId\":" + l3.c(this.d) + ",\"formName\":" + l3.c(this.e) + ",\"mediaType\":" + l3.c(this.f) + ",\"ecId\":" + l3.c(this.h) + ",\"timestamp\":" + this.g + "}";
        } catch (Exception e) {
            a4.c(e.getMessage());
            return "";
        }
    }

    public e5(JSONObject jSONObject) {
        try {
            if (jSONObject.has("mediaCaptureClientCorrelationId") && !jSONObject.isNull("mediaCaptureClientCorrelationId")) {
                this.f16446a = jSONObject.getString("mediaCaptureClientCorrelationId");
            }
            if (jSONObject.has("feedbackClientCorrelationId") && !jSONObject.isNull("feedbackClientCorrelationId")) {
                this.b = jSONObject.getString("feedbackClientCorrelationId");
            }
            if (jSONObject.has("mediaPath") && !jSONObject.isNull("mediaPath")) {
                this.c = jSONObject.getString("mediaPath");
            }
            if (jSONObject.has("mediaType") && !jSONObject.isNull("mediaType")) {
                this.f = jSONObject.getString("mediaType");
            }
            if (jSONObject.has("formId") && !jSONObject.isNull("formId")) {
                this.d = jSONObject.getString("formId");
            }
            if (jSONObject.has("formName") && !jSONObject.isNull("formName")) {
                this.e = jSONObject.getString("formName");
            }
            if (jSONObject.has("numberOfRetries") && !jSONObject.isNull("numberOfRetries")) {
                this.i = jSONObject.getInt("numberOfRetries");
            }
            if (jSONObject.has("ecId") && !jSONObject.isNull("ecId")) {
                this.h = jSONObject.getString("ecId");
            }
            if (!jSONObject.has("timestamp") || jSONObject.isNull("timestamp")) {
                return;
            }
            this.g = jSONObject.getLong("timestamp");
        } catch (JSONException e) {
            a4.c(e.getMessage());
        }
    }

    public void a(String str) {
        this.b = str;
    }

    public void b(String str) {
        this.c = str;
    }
}
