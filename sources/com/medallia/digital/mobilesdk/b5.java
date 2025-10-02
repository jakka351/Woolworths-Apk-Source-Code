package com.medallia.digital.mobilesdk;

import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b5 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private String f16386a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private ArrayList<String> g;
    private ArrayList<String> h;

    public b5(String str, String str2, String str3, String str4, String str5, String str6, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        this.f16386a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = arrayList;
        this.h = arrayList2;
    }

    public String a() {
        return this.c;
    }

    public String b() {
        return this.f16386a;
    }

    public String c() {
        return this.d;
    }

    public String d() {
        return this.b;
    }

    public ArrayList<String> e() {
        return this.g;
    }

    public String f() {
        return this.f;
    }

    public ArrayList<String> g() {
        return this.h;
    }

    public String h() {
        return this.e;
    }

    public String i() {
        try {
            return "{\"channelId\":" + l3.c(this.f16386a) + ",\"domain\":" + l3.c(this.b) + ",\"apiKey\":" + l3.c(this.c) + ",\"channelUrlsPrefix\":" + l3.c(this.d) + ",\"uploadUrlSuffix\":" + l3.c(this.e) + ",\"presignedUrlSuffix\":" + l3.c(this.f) + ",\"namedFilters\":" + ModelFactory.getInstance().getStringArrayAsJsonString(this.g) + ",\"unSupportedVideoFormats\":" + ModelFactory.getInstance().getStringArrayAsJsonString(this.h) + "}";
        } catch (Exception e) {
            a4.c(e.getMessage());
            return "";
        }
    }

    public b5(JSONObject jSONObject) {
        try {
            if (jSONObject.has("channelId") && !jSONObject.isNull("channelId")) {
                this.f16386a = jSONObject.getString("channelId");
            }
            if (jSONObject.has("domain") && !jSONObject.isNull("domain")) {
                this.b = jSONObject.getString("domain");
            }
            if (jSONObject.has("apiKey") && !jSONObject.isNull("apiKey")) {
                this.c = jSONObject.getString("apiKey");
            }
            if (jSONObject.has("channelUrlsPrefix") && !jSONObject.isNull("channelUrlsPrefix")) {
                this.d = jSONObject.getString("channelUrlsPrefix");
            }
            if (jSONObject.has("uploadUrlSuffix") && !jSONObject.isNull("uploadUrlSuffix")) {
                this.e = jSONObject.getString("uploadUrlSuffix");
            }
            if (jSONObject.has("presignedUrlSuffix") && !jSONObject.isNull("presignedUrlSuffix")) {
                this.f = jSONObject.getString("presignedUrlSuffix");
            }
            if (jSONObject.has("namedFilters") && !jSONObject.isNull("namedFilters")) {
                this.g = ModelFactory.getInstance().getStringArray(jSONObject.getJSONArray("namedFilters"));
            }
            if (!jSONObject.has("unSupportedVideoFormats") || jSONObject.isNull("unSupportedVideoFormats")) {
                return;
            }
            this.h = ModelFactory.getInstance().getStringArray(jSONObject.getJSONArray("unSupportedVideoFormats"));
        } catch (JSONException e) {
            a4.c(e.getMessage());
        }
    }
}
