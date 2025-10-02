package com.google.android.material.resources;

import android.content.Context;
import android.util.TypedValue;
import androidx.annotation.RestrictTo;

@RestrictTo
/* loaded from: classes6.dex */
public class MaterialAttributes {
    public static TypedValue a(int i, Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean b(Context context, int i, boolean z) {
        TypedValue typedValueA = a(i, context);
        return (typedValueA == null || typedValueA.type != 18) ? z : typedValueA.data != 0;
    }

    public static TypedValue c(Context context, int i, String str) {
        TypedValue typedValueA = a(i, context);
        if (typedValueA != null) {
            return typedValueA;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }
}
