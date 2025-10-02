package com.swrve.sdk.messaging;

import android.graphics.Paint;
import android.graphics.Typeface;
import com.swrve.sdk.SwrveHelper;
import com.swrve.sdk.SwrveSDKBase;
import java.io.File;

/* loaded from: classes6.dex */
class SwrveTextUtils {
    public static float a(Typeface typeface, float f, SwrveCalibration swrveCalibration) {
        float fM;
        int i;
        if (swrveCalibration != null) {
            String str = swrveCalibration.d;
            int i2 = swrveCalibration.f19094a;
            int i3 = swrveCalibration.b;
            Paint paint = new Paint();
            paint.setTypeface(typeface);
            fM = SwrveHelper.m(paint, str, i2, i3);
            i = swrveCalibration.c;
        } else {
            fM = 1.0f;
            i = 1;
        }
        return (f / i) * fM;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.swrve.sdk.ISwrveBase, java.lang.Object] */
    public static Typeface b(String str, String str2) {
        if (!c(str)) {
            if (!SwrveHelper.o(str)) {
                return null;
            }
            File file = new File(SwrveSDKBase.f19075a.l(), str);
            if (file.exists()) {
                return Typeface.createFromFile(file);
            }
            return null;
        }
        if (str2.equalsIgnoreCase("Normal")) {
            return Typeface.defaultFromStyle(0);
        }
        if (str2.equalsIgnoreCase("Bold")) {
            return Typeface.defaultFromStyle(1);
        }
        if (str2.equalsIgnoreCase("Italic")) {
            return Typeface.defaultFromStyle(2);
        }
        if (str2.equalsIgnoreCase("BoldItalic")) {
            return Typeface.defaultFromStyle(3);
        }
        return null;
    }

    public static boolean c(String str) {
        return SwrveHelper.o(str) && str.equals("_system_font_");
    }
}
