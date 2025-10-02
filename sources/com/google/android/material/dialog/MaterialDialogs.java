package com.google.android.material.dialog;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import androidx.annotation.RestrictTo;
import com.google.android.material.R;
import com.google.android.material.internal.ThemeEnforcement;

@RestrictTo
/* loaded from: classes6.dex */
public class MaterialDialogs {
    public static Rect a(Context context, int i, int i2) {
        TypedArray typedArrayD = ThemeEnforcement.d(context, null, R.styleable.y, i, i2, new int[0]);
        int dimensionPixelSize = typedArrayD.getDimensionPixelSize(2, context.getResources().getDimensionPixelSize(com.woolworths.R.dimen.mtrl_alert_dialog_background_inset_start));
        int dimensionPixelSize2 = typedArrayD.getDimensionPixelSize(3, context.getResources().getDimensionPixelSize(com.woolworths.R.dimen.mtrl_alert_dialog_background_inset_top));
        int dimensionPixelSize3 = typedArrayD.getDimensionPixelSize(1, context.getResources().getDimensionPixelSize(com.woolworths.R.dimen.mtrl_alert_dialog_background_inset_end));
        int dimensionPixelSize4 = typedArrayD.getDimensionPixelSize(0, context.getResources().getDimensionPixelSize(com.woolworths.R.dimen.mtrl_alert_dialog_background_inset_bottom));
        typedArrayD.recycle();
        if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
            dimensionPixelSize3 = dimensionPixelSize;
            dimensionPixelSize = dimensionPixelSize3;
        }
        return new Rect(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4);
    }
}
