package com.google.android.material.resources;

import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
import androidx.annotation.RestrictTo;
import androidx.core.math.MathUtils;

@RestrictTo
/* loaded from: classes6.dex */
public class TypefaceUtils {
    public static Typeface a(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, MathUtils.b(configuration.fontWeightAdjustment + typeface.getWeight(), 1, 1000), typeface.isItalic());
    }
}
