package au.com.woolworths.android.onesite.utils;

import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.util.LruCache;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"base-ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@JvmName
/* loaded from: classes3.dex */
public final class ScrimUtil {

    /* renamed from: a, reason: collision with root package name */
    public static final LruCache f4599a = new LruCache(10);

    public static final void a(View view, int i, ColorDrawable colorDrawable) {
        final float f;
        Intrinsics.h(view, "view");
        int alpha = colorDrawable.getAlpha();
        int iRed = Color.red(colorDrawable.getColor());
        int iGreen = Color.green(colorDrawable.getColor());
        int iBlue = Color.blue(colorDrawable.getColor());
        int iArgb = (((Color.argb(alpha, iRed, iGreen, iBlue) * 31) + 8) * 31) + i;
        Integer numValueOf = Integer.valueOf(iArgb);
        LruCache lruCache = f4599a;
        Drawable drawable = (Drawable) lruCache.get(numValueOf);
        Drawable drawable2 = drawable;
        if (drawable == null) {
            int iMax = Math.max(8, 2);
            PaintDrawable paintDrawable = new PaintDrawable();
            paintDrawable.setShape(new RectShape());
            final int[] iArr = new int[iMax];
            for (int i2 = 0; i2 < iMax; i2++) {
                iArr[i2] = Color.argb((int) (alpha * Math.max(BitmapDescriptorFactory.HUE_RED, Math.min(1.0f, (float) Math.pow((i2 * 1.0f) / (iMax - 1), 3.0d)))), iRed, iGreen, iBlue);
            }
            final float f2 = BitmapDescriptorFactory.HUE_RED;
            int i3 = i & 112;
            if (i3 == 48) {
                f = 1.0f;
            } else if (i3 != 80) {
                f = 0.0f;
            } else {
                f = 0.0f;
                f2 = 1.0f;
            }
            final float f3 = BitmapDescriptorFactory.HUE_RED;
            final float f4 = BitmapDescriptorFactory.HUE_RED;
            paintDrawable.setShaderFactory(new ShapeDrawable.ShaderFactory() { // from class: au.com.woolworths.android.onesite.utils.ScrimUtil$makeCubicGradientScrimDrawable$1
                @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
                public final Shader resize(int i4, int i5) {
                    float f5 = i4;
                    float f6 = i5;
                    return new LinearGradient(f3 * f5, f * f6, f4 * f5, f6 * f2, iArr, (float[]) null, Shader.TileMode.CLAMP);
                }
            });
            lruCache.put(Integer.valueOf(iArgb), paintDrawable);
            drawable2 = paintDrawable;
        }
        view.setBackground(drawable2);
    }
}
