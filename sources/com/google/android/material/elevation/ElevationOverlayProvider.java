package com.google.android.material.elevation;

import android.content.Context;
import android.graphics.Color;
import androidx.annotation.NonNull;
import androidx.core.graphics.ColorUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.resources.MaterialAttributes;
import com.woolworths.R;

/* loaded from: classes6.dex */
public class ElevationOverlayProvider {
    public static final int f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f14574a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    public ElevationOverlayProvider(@NonNull Context context) {
        boolean zB = MaterialAttributes.b(context, R.attr.elevationOverlayEnabled, false);
        int iC = MaterialColors.c(context, R.attr.elevationOverlayColor, 0);
        int iC2 = MaterialColors.c(context, R.attr.elevationOverlayAccentColor, 0);
        int iC3 = MaterialColors.c(context, R.attr.colorSurface, 0);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f14574a = zB;
        this.b = iC;
        this.c = iC2;
        this.d = iC3;
        this.e = f2;
    }

    public final int a(float f2, int i) {
        int i2;
        if (!this.f14574a || ColorUtils.e(i, 255) != this.d) {
            return i;
        }
        float fMin = (this.e <= BitmapDescriptorFactory.HUE_RED || f2 <= BitmapDescriptorFactory.HUE_RED) ? 0.0f : Math.min(((((float) Math.log1p(f2 / r1)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i);
        int iG = MaterialColors.g(fMin, ColorUtils.e(i, 255), this.b);
        if (fMin > BitmapDescriptorFactory.HUE_RED && (i2 = this.c) != 0) {
            iG = ColorUtils.c(ColorUtils.e(i2, f), iG);
        }
        return ColorUtils.e(iG, iAlpha);
    }
}
