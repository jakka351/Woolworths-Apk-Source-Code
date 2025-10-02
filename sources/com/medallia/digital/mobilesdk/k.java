package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.b0;
import com.medallia.digital.mobilesdk.d7;
import org.json.JSONObject;

/* loaded from: classes.dex */
class k extends b0 {

    /* renamed from: a, reason: collision with root package name */
    private String f16559a;
    private String b;
    private long c;
    private JSONObject d;
    private Lifetime e;
    private GroupType f;

    public k(String str, GroupType groupType, Lifetime lifetime, String str2, long j, String str3) {
        try {
            this.f16559a = str2;
            this.e = lifetime;
            this.f = groupType;
            this.c = j;
            this.b = str3;
            this.d = new JSONObject(str);
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public String a() {
        return this.f16559a;
    }

    public GroupType b() {
        return this.f;
    }

    public Lifetime c() {
        return this.e;
    }

    public JSONObject d() {
        return this.d;
    }

    public String e() {
        return this.b;
    }

    public long f() {
        return this.c;
    }

    @Override // com.medallia.digital.mobilesdk.b0
    public b0.a getDataTableObjectType() {
        return b0.a.AnalyticsData;
    }

    public String toJsonString() {
        try {
            return "{\"eventName\":" + l3.c(this.f16559a) + ",\"lifetime\":" + l3.c(this.e.toString()) + ",\"groupType\":" + l3.c(this.f.toString()) + ",\"timestamp\":" + this.c + ",\"sessionId\":" + l3.c(this.b) + ",\"payload\":" + this.d.toString() + "}";
        } catch (Exception e) {
            a4.c(e.getMessage());
            return "";
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(l8.a(this.c));
        sb.append("]");
        JSONObject jSONObject = this.d;
        sb.append(jSONObject != null ? jSONObject.toString() : "null");
        return sb.toString();
    }

    public k(String str, JSONObject jSONObject, GroupType groupType, Lifetime lifetime) {
        this.b = d7.b().a(d7.a.SESSION_ID, "");
        this.f16559a = str;
        this.c = System.currentTimeMillis();
        this.e = lifetime;
        this.f = groupType;
        this.d = jSONObject;
    }

    public void a(String str) {
        this.b = str;
    }

    public k(JSONObject jSONObject, GroupType groupType, Lifetime lifetime, String str, String str2, long j) {
        try {
            this.f16559a = str;
            this.e = lifetime;
            this.f = groupType;
            this.c = j;
            this.b = str2;
            this.d = jSONObject;
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }
}
