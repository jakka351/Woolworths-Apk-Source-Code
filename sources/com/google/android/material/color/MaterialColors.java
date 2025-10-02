package com.google.android.material.color;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.resources.MaterialAttributes;

/* loaded from: classes6.dex */
public class MaterialColors {
    public static int a(int i, int i2) {
        return ColorUtils.e(i, (Color.alpha(i) * i2) / 255);
    }

    public static int b(int i, View view) {
        Context context = view.getContext();
        TypedValue typedValueC = MaterialAttributes.c(view.getContext(), i, view.getClass().getCanonicalName());
        int i2 = typedValueC.resourceId;
        return i2 != 0 ? context.getColor(i2) : typedValueC.data;
    }

    public static int c(Context context, int i, int i2) {
        Integer numValueOf;
        TypedValue typedValueA = MaterialAttributes.a(i, context);
        if (typedValueA != null) {
            int i3 = typedValueA.resourceId;
            numValueOf = Integer.valueOf(i3 != 0 ? context.getColor(i3) : typedValueA.data);
        } else {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : i2;
    }

    public static int d(Context context, int i, String str) {
        TypedValue typedValueC = MaterialAttributes.c(context, i, str);
        int i2 = typedValueC.resourceId;
        return i2 != 0 ? context.getColor(i2) : typedValueC.data;
    }

    public static ColorStateList e(int i, Context context) {
        TypedValue typedValueA = MaterialAttributes.a(i, context);
        if (typedValueA == null) {
            return null;
        }
        int i2 = typedValueA.resourceId;
        if (i2 != 0) {
            return ResourcesCompat.b(i2, context.getTheme(), context.getResources());
        }
        int i3 = typedValueA.data;
        if (i3 != 0) {
            return ColorStateList.valueOf(i3);
        }
        return null;
    }

    public static boolean f(int i) {
        if (i == 0) {
            return false;
        }
        ThreadLocal threadLocal = ColorUtils.f2429a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int iRed = Color.red(i);
        int iGreen = Color.green(i);
        int iBlue = Color.blue(i);
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d = iRed / 255.0d;
        double dPow = d < 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
        double d2 = iGreen / 255.0d;
        double dPow2 = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
        double d3 = iBlue / 255.0d;
        double dPow3 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * dPow3) + (0.3576d * dPow2) + (0.4124d * dPow)) * 100.0d;
        double d4 = ((0.0722d * dPow3) + (0.7152d * dPow2) + (0.2126d * dPow)) * 100.0d;
        dArr[1] = d4;
        dArr[2] = ((dPow3 * 0.9505d) + (dPow2 * 0.1192d) + (dPow * 0.0193d)) * 100.0d;
        return d4 / 100.0d > 0.5d;
    }

    public static int g(float f, int i, int i2) {
        return ColorUtils.c(ColorUtils.e(i2, Math.round(Color.alpha(i2) * f)), i);
    }
}
