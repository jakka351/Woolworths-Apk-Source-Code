package androidx.camera.core.internal;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Rational;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.internal.utils.ImageUtil;
import androidx.core.util.Preconditions;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class ViewPorts {
    public static HashMap a(Rect rect, boolean z, Rational rational, int i, int i2, int i3, HashMap map) {
        boolean z2 = false;
        Preconditions.a("Cannot compute viewport crop rects zero sized sensor rect.", rect.width() > 0 && rect.height() > 0);
        RectF rectF = new RectF(rect);
        HashMap map2 = new HashMap();
        RectF rectF2 = new RectF(rect);
        for (Map.Entry entry : map.entrySet()) {
            Matrix matrix = new Matrix();
            RectF rectF3 = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, ((StreamSpec) entry.getValue()).e().getWidth(), ((StreamSpec) entry.getValue()).e().getHeight());
            matrix.setRectToRect(rectF3, rectF, Matrix.ScaleToFit.CENTER);
            map2.put((UseCase) entry.getKey(), matrix);
            RectF rectF4 = new RectF();
            matrix.mapRect(rectF4, rectF3);
            rectF2.intersect(rectF4);
        }
        Rational rationalB = ImageUtil.b(i, rational);
        if (i2 != 3) {
            Matrix matrix2 = new Matrix();
            RectF rectF5 = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, rationalB.getNumerator(), rationalB.getDenominator());
            if (i2 == 0) {
                matrix2.setRectToRect(rectF5, rectF2, Matrix.ScaleToFit.START);
            } else if (i2 == 1) {
                matrix2.setRectToRect(rectF5, rectF2, Matrix.ScaleToFit.CENTER);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException(YU.a.d(i2, "Unexpected scale type: "));
                }
                matrix2.setRectToRect(rectF5, rectF2, Matrix.ScaleToFit.END);
            }
            RectF rectF6 = new RectF();
            matrix2.mapRect(rectF6, rectF5);
            boolean z3 = z ^ (i3 == 1);
            boolean z4 = i == 0 && !z3;
            boolean z5 = i == 90 && z3;
            if (z4 || z5) {
                rectF2 = rectF6;
            } else {
                boolean z6 = i == 0 && z3;
                boolean z7 = i == 270 && !z3;
                if (z6 || z7) {
                    float fCenterX = rectF2.centerX();
                    float f = fCenterX + fCenterX;
                    rectF2 = new RectF(f - rectF6.right, rectF6.top, f - rectF6.left, rectF6.bottom);
                } else {
                    boolean z8 = i == 90 && !z3;
                    boolean z9 = i == 180 && z3;
                    if (z8 || z9) {
                        float fCenterY = rectF2.centerY();
                        float f2 = fCenterY + fCenterY;
                        rectF2 = new RectF(rectF6.left, f2 - rectF6.bottom, rectF6.right, f2 - rectF6.top);
                    } else {
                        boolean z10 = i == 180 && !z3;
                        if (i == 270 && z3) {
                            z2 = true;
                        }
                        if (!z10 && !z2) {
                            throw new IllegalArgumentException("Invalid argument: mirrored " + z3 + " rotation " + i);
                        }
                        float fCenterY2 = rectF2.centerY();
                        float f3 = fCenterY2 + fCenterY2;
                        RectF rectF7 = new RectF(rectF6.left, f3 - rectF6.bottom, rectF6.right, f3 - rectF6.top);
                        float fCenterX2 = rectF2.centerX();
                        float f4 = fCenterX2 + fCenterX2;
                        rectF2 = new RectF(f4 - rectF7.right, rectF7.top, f4 - rectF7.left, rectF7.bottom);
                    }
                }
            }
        }
        HashMap map3 = new HashMap();
        RectF rectF8 = new RectF();
        Matrix matrix3 = new Matrix();
        for (Map.Entry entry2 : map2.entrySet()) {
            ((Matrix) entry2.getValue()).invert(matrix3);
            matrix3.mapRect(rectF8, rectF2);
            Rect rect2 = new Rect();
            rectF8.round(rect2);
            map3.put((UseCase) entry2.getKey(), rect2);
        }
        return map3;
    }
}
