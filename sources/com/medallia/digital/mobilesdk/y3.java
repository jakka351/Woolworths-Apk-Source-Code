package com.medallia.digital.mobilesdk;

import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class y3 extends e0 {

    /* renamed from: a, reason: collision with root package name */
    private ArrayList<String> f16781a;
    private ResourceContract b;
    private ResourceContract c;
    private String d;
    private String e;
    private String f;

    public y3(ArrayList<String> arrayList, ResourceContract resourceContract, String str, String str2, String str3) {
        this.f16781a = arrayList;
        this.b = resourceContract;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    public ArrayList<String> a() {
        return this.f16781a;
    }

    public String b() {
        return this.f;
    }

    public String c() {
        return this.d;
    }

    public String d() {
        return this.e;
    }

    public ResourceContract e() {
        return this.b;
    }

    public ResourceContract f() {
        return this.c;
    }

    public String toJsonString() {
        StringBuilder sb = new StringBuilder("{\"availableLanguages\":");
        sb.append(ModelFactory.getInstance().getStringArrayAsJsonString(this.f16781a));
        sb.append(",\"resource\":");
        ResourceContract resourceContract = this.b;
        sb.append(resourceContract == null ? null : resourceContract.toJsonString());
        sb.append(",\"staticResource\":");
        ResourceContract resourceContract2 = this.c;
        sb.append(resourceContract2 != null ? resourceContract2.toJsonString() : null);
        sb.append(",\"fileNamePattern\":");
        sb.append(l3.c(this.d));
        sb.append(",\"localePlaceHolderInPattern\":");
        sb.append(l3.c(this.e));
        sb.append(",\"defaultLocaleName\":");
        return YU.a.o(sb, l3.c(this.f), "}");
    }

    public y3(JSONObject jSONObject) {
        try {
            if (jSONObject.has("availableLanguages") && !jSONObject.isNull("availableLanguages")) {
                this.f16781a = ModelFactory.getInstance().getStringArray(jSONObject.getJSONArray("availableLanguages"));
            }
            if (jSONObject.has("resource") && !jSONObject.isNull("resource")) {
                this.b = new ResourceContract(jSONObject.getJSONObject("resource"));
            }
            if (jSONObject.has("staticResource") && !jSONObject.isNull("staticResource")) {
                this.c = new ResourceContract(jSONObject.getJSONObject("staticResource"));
            }
            if (jSONObject.has("fileNamePattern") && !jSONObject.isNull("fileNamePattern")) {
                this.d = jSONObject.getString("fileNamePattern");
            }
            if (jSONObject.has("localePlaceHolderInPattern") && !jSONObject.isNull("localePlaceHolderInPattern")) {
                this.e = jSONObject.getString("localePlaceHolderInPattern");
            }
            if (!jSONObject.has("defaultLocaleName") || jSONObject.isNull("defaultLocaleName")) {
                return;
            }
            this.f = jSONObject.getString("defaultLocaleName");
        } catch (JSONException e) {
            a4.c(e.getMessage());
        }
    }
}
