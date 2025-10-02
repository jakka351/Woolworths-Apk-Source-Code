package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.ColorUtils;

@RestrictTo
/* loaded from: classes2.dex */
public class ThemeUtils {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f188a = new ThreadLocal();
    public static final int[] b = {-16842910};
    public static final int[] c = {R.attr.state_focused};
    public static final int[] d = {R.attr.state_pressed};
    public static final int[] e = {R.attr.state_checked};
    public static final int[] f = new int[0];
    public static final int[] g = new int[1];

    public static void a(View view, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(androidx.appcompat.R.styleable.k);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static int b(int i, Context context) {
        ColorStateList colorStateListD = d(i, context);
        if (colorStateListD != null && colorStateListD.isStateful()) {
            return colorStateListD.getColorForState(b, colorStateListD.getDefaultColor());
        }
        ThreadLocal threadLocal = f188a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f2 = typedValue.getFloat();
        return ColorUtils.e(c(i, context), Math.round(Color.alpha(r4) * f2));
    }

    public static int c(int i, Context context) {
        int[] iArr = g;
        iArr[0] = i;
        TintTypedArray tintTypedArrayE = TintTypedArray.e(context, null, iArr);
        try {
            return tintTypedArrayE.b.getColor(0, 0);
        } finally {
            tintTypedArrayE.g();
        }
    }

    public static ColorStateList d(int i, Context context) {
        int[] iArr = g;
        iArr[0] = i;
        TintTypedArray tintTypedArrayE = TintTypedArray.e(context, null, iArr);
        try {
            return tintTypedArrayE.a(0);
        } finally {
            tintTypedArrayE.g();
        }
    }
}
