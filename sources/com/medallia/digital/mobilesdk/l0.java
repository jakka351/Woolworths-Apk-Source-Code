package com.medallia.digital.mobilesdk;

import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
class l0 {

    /* renamed from: a, reason: collision with root package name */
    private String f16575a;
    private HashMap<String, String> b;
    private HashMap<String, String> c;
    private JSONObject d;
    private String e;

    public l0() {
        this.e = null;
    }

    public JSONObject a() {
        return this.d;
    }

    public HashMap<String, String> b() {
        return this.b;
    }

    public HashMap<String, String> c() {
        return this.c;
    }

    public String d() {
        return this.e;
    }

    public String e() {
        return this.f16575a;
    }

    public l0(String str) {
        this.e = null;
        this.f16575a = str;
    }

    public l0(String str, HashMap<String, String> map) {
        this.e = null;
        this.f16575a = str;
        this.b = map;
    }

    public l0(String str, HashMap<String, String> map, String str2) {
        this.f16575a = str;
        this.b = map;
        this.e = str2;
    }

    public l0(String str, HashMap<String, String> map, HashMap<String, String> map2, JSONObject jSONObject) {
        this.e = null;
        this.f16575a = str;
        this.b = map;
        this.c = map2;
        this.d = jSONObject;
    }

    public l0(String str, HashMap<String, String> map, JSONObject jSONObject) {
        this.e = null;
        this.f16575a = str;
        this.b = map;
        this.d = jSONObject;
    }
}
