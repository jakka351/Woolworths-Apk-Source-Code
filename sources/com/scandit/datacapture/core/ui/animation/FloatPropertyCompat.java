package com.scandit.datacapture.core.ui.animation;

import android.annotation.TargetApi;
import android.util.FloatProperty;

/* loaded from: classes6.dex */
public abstract class FloatPropertyCompat<T> {
    public FloatPropertyCompat(String str) {
    }

    @TargetApi
    public static <T> FloatPropertyCompat<T> createFloatPropertyCompat(FloatProperty<T> floatProperty) {
        return new u(floatProperty.getName(), floatProperty);
    }

    public abstract float getValue(T t);

    public abstract void setValue(T t, float f);
}
