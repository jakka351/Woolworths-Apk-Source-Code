package com.medallia.digital.mobilesdk;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class w4 {

    /* renamed from: a, reason: collision with root package name */
    private u4 f16759a;
    private u4 b;
    private u4 c;
    private u4 d;
    private u4 e;
    private u4 f;
    private u4 g;
    private u4 h;

    public w4(u4 u4Var) {
        this.f16759a = u4Var;
        this.b = u4Var;
        this.c = u4Var;
        this.d = u4Var;
        this.e = u4Var;
        this.f = u4Var;
        this.g = u4Var;
        this.h = u4Var;
    }

    public u4 a() {
        return this.f16759a;
    }

    public u4 b() {
        return this.d;
    }

    public u4 c() {
        return this.b;
    }

    public u4 d() {
        return this.e;
    }

    public u4 e() {
        return this.c;
    }

    public u4 f() {
        return this.h;
    }

    public u4 g() {
        return this.g;
    }

    public u4 h() {
        return this.f;
    }

    public String i() {
        try {
            StringBuilder sb = new StringBuilder("{\"accessTokenRequestConfig\":");
            u4 u4Var = this.f16759a;
            String strB = "null";
            sb.append(u4Var == null ? "null" : u4Var.b());
            sb.append(",\"configurationRequestConfig\":");
            u4 u4Var2 = this.b;
            sb.append(u4Var2 == null ? "null" : u4Var2.b());
            sb.append(",\"feedbackRequestConfig\":");
            u4 u4Var3 = this.c;
            sb.append(u4Var3 == null ? "null" : u4Var3.b());
            sb.append(",\"analyticsRequestConfig\":");
            u4 u4Var4 = this.d;
            sb.append(u4Var4 == null ? "null" : u4Var4.b());
            sb.append(",\"resourcesRequestConfig\":");
            u4 u4Var5 = this.f;
            sb.append(u4Var5 == null ? "null" : u4Var5.b());
            sb.append(",\"ocqRequestConfig\":");
            u4 u4Var6 = this.g;
            sb.append(u4Var6 == null ? "null" : u4Var6.b());
            sb.append(",\"mediaCaptureRequestConfig\":");
            u4 u4Var7 = this.h;
            if (u4Var7 != null) {
                strB = u4Var7.b();
            }
            sb.append(strB);
            sb.append("}");
            return sb.toString();
        } catch (Exception e) {
            a4.c(e.getMessage());
            return "";
        }
    }

    public w4(JSONObject jSONObject) {
        try {
            if (jSONObject.has("accessTokenRequestConfig") && !jSONObject.isNull("accessTokenRequestConfig")) {
                this.f16759a = new u4(jSONObject.getJSONObject("accessTokenRequestConfig"));
            }
            if (jSONObject.has("configurationRequestConfig") && !jSONObject.isNull("configurationRequestConfig")) {
                this.b = new u4(jSONObject.getJSONObject("configurationRequestConfig"));
            }
            if (jSONObject.has("feedbackRequestConfig") && !jSONObject.isNull("feedbackRequestConfig")) {
                this.c = new u4(jSONObject.getJSONObject("feedbackRequestConfig"));
            }
            if (jSONObject.has("analyticsRequestConfig") && !jSONObject.isNull("analyticsRequestConfig")) {
                this.d = new u4(jSONObject.getJSONObject("analyticsRequestConfig"));
            }
            if (jSONObject.has("digitalAnalyticsRequestConfig") && !jSONObject.isNull("digitalAnalyticsRequestConfig")) {
                this.e = new u4(jSONObject.getJSONObject("digitalAnalyticsRequestConfig"));
            }
            if (jSONObject.has("ocqRequestConfig") && !jSONObject.isNull("ocqRequestConfig")) {
                this.g = new u4(jSONObject.getJSONObject("ocqRequestConfig"));
            }
            if (jSONObject.has("mediaCaptureRequestConfig") && !jSONObject.isNull("mediaCaptureRequestConfig")) {
                this.h = new u4(jSONObject.getJSONObject("mediaCaptureRequestConfig"));
            }
            if (!jSONObject.has("resourcesRequestConfig") || jSONObject.isNull("resourcesRequestConfig")) {
                return;
            }
            this.f = new u4(jSONObject.getJSONObject("resourcesRequestConfig"));
        } catch (JSONException e) {
            a4.c(e.getMessage());
        }
    }
}
