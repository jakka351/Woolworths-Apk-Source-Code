package com.google.android.material.resources;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.content.ContextCompat;

@RestrictTo
/* loaded from: classes6.dex */
public class MaterialResources {
    public static ColorStateList a(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList colorStateListC;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListC = ContextCompat.c(resourceId, context)) == null) ? typedArray.getColorStateList(i) : colorStateListC;
    }

    public static ColorStateList b(Context context, TintTypedArray tintTypedArray, int i) {
        int resourceId;
        ColorStateList colorStateListC;
        TypedArray typedArray = tintTypedArray.b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListC = ContextCompat.c(resourceId, context)) == null) ? tintTypedArray.a(i) : colorStateListC;
    }

    public static int c(Context context, TypedArray typedArray, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, i2);
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i2);
        typedArrayObtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static Drawable d(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable drawableB;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (drawableB = AppCompatResources.b(resourceId, context)) == null) ? typedArray.getDrawable(i) : drawableB;
    }

    public static boolean e(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }
}
