package com.swrve.sdk.messaging;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class SwrveButtonTheme {

    /* renamed from: a, reason: collision with root package name */
    public final int f19092a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final String j;
    public final String k;
    public final int l;
    public final String m;
    public final String n;
    public final boolean o;
    public final SwrveButtonThemeState p;
    public final SwrveButtonThemeState q;
    public final String r;

    public SwrveButtonTheme(JSONObject jSONObject) throws JSONException {
        this.f19092a = jSONObject.getInt("font_size");
        this.b = jSONObject.getString("font_file");
        if (jSONObject.has("font_native_style") && !jSONObject.isNull("font_native_style")) {
            this.d = jSONObject.getString("font_native_style");
        }
        if (jSONObject.has("font_digest")) {
            this.c = jSONObject.getString("font_digest");
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("padding");
        this.e = jSONObject2.getInt("top");
        this.g = jSONObject2.getInt("bottom");
        this.f = jSONObject2.getInt("right");
        this.h = jSONObject2.getInt("left");
        this.i = jSONObject.getInt("corner_radius");
        this.j = jSONObject.getString("font_color");
        if (jSONObject.has("bg_color") && !jSONObject.isNull("bg_color")) {
            this.k = jSONObject.getString("bg_color");
        }
        if (jSONObject.has("border_width") && !jSONObject.isNull("border_width")) {
            this.l = jSONObject.getInt("border_width");
        }
        if (jSONObject.has("border_color") && !jSONObject.isNull("border_color")) {
            this.m = jSONObject.getString("border_color");
        }
        if (jSONObject.has("bg_image") && !jSONObject.isNull("bg_image")) {
            this.n = jSONObject.getJSONObject("bg_image").getString("value");
        }
        this.o = jSONObject.getBoolean("truncate");
        this.p = new SwrveButtonThemeState(jSONObject.getJSONObject("pressed_state"));
        if (jSONObject.has("focused_state") && !jSONObject.isNull("focused_state")) {
            this.q = new SwrveButtonThemeState(jSONObject.getJSONObject("focused_state"));
        }
        this.r = jSONObject.getString("h_align");
    }
}
