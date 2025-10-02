package com.swrve.sdk.messaging;

import android.graphics.Point;
import com.swrve.sdk.messaging.SwrveTextViewStyle;
import org.bouncycastle.i18n.TextBundle;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
abstract class SwrveWidget {

    /* renamed from: a, reason: collision with root package name */
    public Point f19105a;
    public Point b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final float g;
    public final boolean h;
    public final SwrveTextViewStyle.TextAlignment i;
    public final String j;
    public final String k;
    public final SwrveTextViewStyle.FONT_NATIVE_STYLE l;
    public final double m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final String r;
    public final String s;
    public final int t;

    public SwrveWidget(JSONObject jSONObject) throws JSONException {
        if (jSONObject.has("dynamic_image_url")) {
            this.d = jSONObject.getString("dynamic_image_url");
        }
        if (jSONObject.has(TextBundle.TEXT_ENTRY)) {
            this.c = jSONObject.getJSONObject(TextBundle.TEXT_ENTRY).getString("value");
        }
        if (jSONObject.has("accessibility_text")) {
            this.e = jSONObject.getString("accessibility_text");
        }
        if (jSONObject.has("multiline_text")) {
            this.f = true;
            JSONObject jSONObject2 = jSONObject.getJSONObject("multiline_text");
            this.c = jSONObject2.getString("value");
            this.g = Double.valueOf(jSONObject2.getDouble("font_size")).floatValue();
            this.h = jSONObject2.getBoolean("scrollable");
            String string = jSONObject2.getString("h_align");
            this.i = string.equalsIgnoreCase("right") ? SwrveTextViewStyle.TextAlignment.e : string.equalsIgnoreCase("center") ? SwrveTextViewStyle.TextAlignment.f : SwrveTextViewStyle.TextAlignment.d;
            if (jSONObject2.has("font_file")) {
                String string2 = jSONObject2.getString("font_file");
                this.j = string2;
                if (SwrveTextUtils.c(string2)) {
                    String string3 = jSONObject2.getString("font_native_style");
                    SwrveTextViewStyle.FONT_NATIVE_STYLE font_native_style = SwrveTextViewStyle.FONT_NATIVE_STYLE.NORMAL;
                    this.l = string3.equalsIgnoreCase("NORMAL") ? SwrveTextViewStyle.FONT_NATIVE_STYLE.NORMAL : string3.equalsIgnoreCase("BOLD") ? SwrveTextViewStyle.FONT_NATIVE_STYLE.BOLD : string3.equalsIgnoreCase("ITALIC") ? SwrveTextViewStyle.FONT_NATIVE_STYLE.ITALIC : string3.equalsIgnoreCase("BOLDITALIC") ? SwrveTextViewStyle.FONT_NATIVE_STYLE.BOLDITALIC : SwrveTextViewStyle.FONT_NATIVE_STYLE.NORMAL;
                }
                if (jSONObject2.has("line_height")) {
                    this.m = jSONObject2.getDouble("line_height");
                }
                if (jSONObject2.has("font_digest")) {
                    this.k = jSONObject2.getString("font_digest");
                }
                if (jSONObject2.has("padding")) {
                    JSONObject jSONObject3 = jSONObject2.getJSONObject("padding");
                    this.n = jSONObject3.getInt("top");
                    this.p = jSONObject3.getInt("bottom");
                    this.o = jSONObject3.getInt("right");
                    this.q = jSONObject3.getInt("left");
                }
                if (jSONObject2.has("font_color")) {
                    this.r = jSONObject2.getString("font_color");
                }
                if (jSONObject2.has("bg_color")) {
                    this.s = jSONObject2.getString("bg_color");
                }
            }
        }
        if (jSONObject.has("iam_z_index")) {
            this.t = jSONObject.getInt("iam_z_index");
        }
    }

    public String a() {
        return this.e;
    }

    public String b() {
        return this.d;
    }

    public int c() {
        return this.t;
    }

    public Point d() {
        return this.f19105a;
    }

    public Point e() {
        return this.b;
    }

    public String f() {
        return this.c;
    }
}
