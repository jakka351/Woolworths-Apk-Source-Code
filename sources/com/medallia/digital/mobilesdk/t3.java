package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.b0;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
class t3 extends b0 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private String f16710a;
    private String b;
    private String c;
    private long d;
    private String e;
    private long f;

    public t3(String str, String str2, String str3, String str4, long j, long j2) {
        this.f16710a = str2;
        this.b = str3;
        this.c = str4;
        this.d = j;
        this.e = str;
        this.f = j2;
    }

    public String a() {
        return this.c;
    }

    public String b() {
        return this.b;
    }

    public long c() {
        return this.f;
    }

    public long d() {
        return this.d;
    }

    @Override // com.medallia.digital.mobilesdk.b0
    public b0.a getDataTableObjectType() {
        return b0.a.LocalNotification;
    }

    public String getFormId() {
        return this.e;
    }

    public String getTitle() {
        return this.f16710a;
    }

    public void setFormId(String str) {
        this.e = str;
    }

    public String toJsonString() {
        try {
            return "{\"formId\":" + l3.c(this.e) + ",\"title\":" + l3.c(this.f16710a) + ",\"body\":" + l3.c(this.b) + ",\"appIconPath\":" + l3.c(this.c) + ",\"expiration\":" + this.d + ",\"delay\":" + this.f + "}";
        } catch (Exception e) {
            a4.c(e.getMessage());
            return "";
        }
    }

    public t3(JSONObject jSONObject) throws JSONException {
        try {
            if (jSONObject.has("formId") && !jSONObject.isNull("formId")) {
                this.e = jSONObject.getString("formId");
            }
            if (jSONObject.has("title") && !jSONObject.isNull("title")) {
                this.f16710a = jSONObject.getString("title");
            }
            if (jSONObject.has("body") && !jSONObject.isNull("body")) {
                this.b = jSONObject.getString("body");
            }
            if (jSONObject.has("appIconPath") && !jSONObject.isNull("appIconPath")) {
                this.c = jSONObject.getString("appIconPath");
            }
            if (jSONObject.has("expiration") && !jSONObject.isNull("expiration") && !"null".equals(jSONObject.get("expiration"))) {
                String string = jSONObject.getString("expiration");
                if (!string.isEmpty()) {
                    this.d = Long.parseLong(string);
                }
            }
            if (!jSONObject.has("delay") || jSONObject.isNull("delay") || "null".equals(jSONObject.get("delay"))) {
                return;
            }
            String string2 = jSONObject.getString("delay");
            if (string2.isEmpty()) {
                return;
            }
            this.f = Long.parseLong(string2);
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public void a(long j) {
        this.f = j;
    }

    public void b(long j) {
        this.d = j;
    }

    public void c(String str) {
        this.f16710a = str;
    }

    public void a(String str) {
        this.c = str;
    }

    public void b(String str) {
        this.b = str;
    }
}
