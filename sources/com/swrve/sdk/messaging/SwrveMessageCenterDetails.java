package com.swrve.sdk.messaging;

import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class SwrveMessageCenterDetails {

    /* renamed from: a, reason: collision with root package name */
    public final String f19099a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public SwrveMessageCenterDetails(JSONObject jSONObject) {
        this.f19099a = jSONObject.isNull("subject") ? null : jSONObject.getString("subject");
        this.b = jSONObject.isNull(lqlqqlq.mmm006Dm006Dm) ? null : jSONObject.getString(lqlqqlq.mmm006Dm006Dm);
        this.d = jSONObject.isNull("accessibility_text") ? null : jSONObject.getString("accessibility_text");
        this.e = jSONObject.isNull("image_asset") ? null : jSONObject.getString("image_asset");
        this.c = jSONObject.isNull("dynamic_image_url") ? null : jSONObject.getString("dynamic_image_url");
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.e;
    }

    public final String d() {
        return this.c;
    }

    public final String e() {
        return this.f19099a;
    }

    public SwrveMessageCenterDetails(String str, String str2, String str3, String str4, String str5) {
        this.f19099a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }
}
