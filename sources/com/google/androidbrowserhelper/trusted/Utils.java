package com.google.androidbrowserhelper.trusted;

import android.graphics.Color;

/* loaded from: classes6.dex */
public class Utils {
    public static float a(float f) {
        float f2 = f / 255.0f;
        return f2 < 0.03928f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static boolean b(int i) {
        return Math.abs(1.05f / (((a((float) Color.blue(i)) * 0.0722f) + ((a((float) Color.green(i)) * 0.7152f) + (a((float) Color.red(i)) * 0.2126f))) + 0.05f)) < 3.0f;
    }
}
