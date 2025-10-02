package com.google.android.material.ripple;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.StateSet;
import android.util.TypedValue;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.resources.MaterialAttributes;

@RestrictTo
/* loaded from: classes6.dex */
public class RippleUtils {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f14627a = {R.attr.state_pressed};
    public static final int[] b = {R.attr.state_focused};
    public static final int[] c = {R.attr.state_selected, R.attr.state_pressed};
    public static final int[] d = {R.attr.state_selected};

    @RequiresApi
    public static class RippleUtilsLollipop {
        @DoNotInline
        private static Drawable a(@NonNull Context context, @Px int i) {
            ColorStateList colorStateListC;
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(-1);
            gradientDrawable.setShape(1);
            InsetDrawable insetDrawable = new InsetDrawable((Drawable) gradientDrawable, i, i, i, i);
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(0);
            TypedValue typedValueA = MaterialAttributes.a(com.woolworths.R.attr.colorControlHighlight, context);
            if (typedValueA != null) {
                int i2 = typedValueA.resourceId;
                colorStateListC = i2 != 0 ? ContextCompat.c(i2, context) : ColorStateList.valueOf(typedValueA.data);
            } else {
                colorStateListC = null;
            }
            if (colorStateListC != null) {
                colorStateListValueOf = colorStateListC;
            }
            return new RippleDrawable(colorStateListValueOf, null, insetDrawable);
        }
    }

    public static ColorStateList a(ColorStateList colorStateList) {
        int[] iArr = b;
        return new ColorStateList(new int[][]{d, iArr, StateSet.NOTHING}, new int[]{b(colorStateList, c), b(colorStateList, iArr), b(colorStateList, f14627a)});
    }

    public static int b(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return ColorUtils.e(colorForState, Math.min(Color.alpha(colorForState) * 2, 255));
    }

    public static ColorStateList c(ColorStateList colorStateList) {
        return colorStateList != null ? colorStateList : ColorStateList.valueOf(0);
    }

    public static boolean d(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }
}
