package com.medallia.digital.mobilesdk;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.medallia.digital.mobilesdk.b0;
import com.medallia.digital.mobilesdk.d7;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class c0 extends b0 {
    private static final int i = 6;

    /* renamed from: a, reason: collision with root package name */
    private String f16388a;
    private Object b;
    private ValueType c;
    private Lifetime d;
    private GroupType e;
    private String f;
    private long g;
    private JSONObject h;

    public c0() {
    }

    private void k() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        this.h = jSONObject;
        jSONObject.put("sessionId", l3.a((Object) this.f));
        this.h.put("value", l3.a(this.b));
        this.h.put(AppMeasurementSdk.ConditionalUserProperty.NAME, l3.a((Object) this.f16388a));
        this.h.put("valueType", l3.a(this.c));
        this.h.put("lifetime", l3.a(this.d));
        this.h.put("groupType", l3.a(this.e));
        this.h.put("timestamp", l3.a(Long.valueOf(this.g)));
    }

    public String a() {
        StringBuilder sb = new StringBuilder();
        sb.append(a(Long.valueOf(h())));
        sb.append(a(g()));
        sb.append(a(getName()));
        sb.append("=");
        return YU.a.o(sb, a(i()), "\n");
    }

    public String b() {
        StringBuilder sb = new StringBuilder();
        sb.append(a(l8.b(h())));
        sb.append(a(Long.valueOf(h())));
        sb.append(a(g().substring(0, 6) + ".."));
        sb.append(a(getName()));
        sb.append("=");
        return YU.a.o(sb, a(i()), "\n");
    }

    public String c() {
        return null;
    }

    public JSONObject d() {
        return this.h;
    }

    public GroupType e() {
        return this.e;
    }

    public Lifetime f() {
        return this.d;
    }

    public String g() {
        return this.f;
    }

    @Override // com.medallia.digital.mobilesdk.b0
    public b0.a getDataTableObjectType() {
        return b0.a.UserJourneyData;
    }

    public String getName() {
        return this.f16388a;
    }

    public long h() {
        return this.g;
    }

    public Object i() {
        return this.b;
    }

    public ValueType j() {
        return this.c;
    }

    public void l() throws JSONException {
        Object obj;
        String strA = d7.b().a(d7.a.SESSION_ID, "");
        this.f = strA;
        JSONObject jSONObject = this.h;
        if (jSONObject != null) {
            if (strA != null) {
                obj = strA;
            } else {
                try {
                    obj = JSONObject.NULL;
                } catch (JSONException e) {
                    a4.c(e.getMessage());
                    return;
                }
            }
            jSONObject.put("sessionId", obj);
        }
    }

    public String toString() {
        return "[" + l8.a(this.g) + "]" + this.h.toString();
    }

    public c0(Object obj, GroupType groupType, Lifetime lifetime, ValueType valueType, String str) {
        try {
            this.f = d7.b().a(d7.a.SESSION_ID, "");
            this.g = System.currentTimeMillis();
            this.f16388a = str;
            this.b = obj != null ? obj.toString() : null;
            this.c = valueType;
            this.d = lifetime;
            this.e = groupType;
            k();
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public c0(Object obj, GroupType groupType, Lifetime lifetime, ValueType valueType, String str, long j, String str2) {
        try {
            this.f = str2;
            this.g = j;
            this.f16388a = str;
            this.b = obj != null ? obj.toString() : null;
            this.c = valueType;
            this.d = lifetime;
            this.e = groupType;
            k();
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public c0(JSONObject jSONObject, GroupType groupType, Lifetime lifetime, String str) {
        try {
            this.f = d7.b().a(d7.a.SESSION_ID, "");
            this.g = System.currentTimeMillis();
            this.f16388a = str;
            ValueType valueType = null;
            String string = jSONObject != null ? jSONObject.toString() : null;
            this.b = string;
            if (string != null) {
                valueType = ValueType.TypeString;
            }
            this.c = valueType;
            this.d = lifetime;
            this.e = groupType;
            k();
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    private String a(Object obj) {
        return androidx.camera.core.impl.b.n(obj, "[", "]");
    }
}
