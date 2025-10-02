package com.swrve.sdk.messaging;

import org.json.JSONObject;

/* loaded from: classes6.dex */
public class SwrveButtonThemeState {

    /* renamed from: a, reason: collision with root package name */
    public final String f19093a;
    public final String b;
    public final String c;
    public final String d;

    public SwrveButtonThemeState(JSONObject jSONObject) {
        if (jSONObject.has("font_color") && !jSONObject.isNull("font_color")) {
            this.f19093a = jSONObject.getString("font_color");
        }
        if (jSONObject.has("bg_color") && !jSONObject.isNull("bg_color")) {
            this.b = jSONObject.getString("bg_color");
        }
        if (jSONObject.has("border_color") && !jSONObject.isNull("border_color")) {
            this.c = jSONObject.getString("border_color");
        }
        if (!jSONObject.has("bg_image") || jSONObject.isNull("bg_image")) {
            return;
        }
        this.d = jSONObject.getJSONObject("bg_image").getString("value");
    }
}
