package com.google.android.material.transition.platform;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.annotation.RequiresApi;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.canvas.CanvasCompat;

@RequiresApi
/* loaded from: classes6.dex */
class TransitionUtils {

    /* renamed from: a, reason: collision with root package name */
    public static final RectF f14702a = new RectF();

    public interface CornerSizeBinaryOperator {
    }

    public static View a(View view) throws Resources.NotFoundException {
        String resourceName = view.getResources().getResourceName(0);
        while (view != null) {
            if (view.getId() != 0) {
                Object parent = view.getParent();
                if (!(parent instanceof View)) {
                    break;
                }
                view = (View) parent;
            } else {
                return view;
            }
        }
        throw new IllegalArgumentException(YU.a.g(resourceName, " is not a valid ancestor"));
    }

    public static RectF b(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new RectF(iArr[0], iArr[1], view.getWidth() + r1, view.getHeight() + r0);
    }

    public static float c(float f, float f2, float f3) {
        return YU.a.a(f2, f, f3, f);
    }

    public static float d(float f, float f2, float f3, float f4, float f5, boolean z) {
        return (!z || (f5 >= BitmapDescriptorFactory.HUE_RED && f5 <= 1.0f)) ? f5 < f3 ? f : f5 > f4 ? f2 : c(f, f2, (f5 - f3) / (f4 - f3)) : c(f, f2, f5);
    }

    public static int e(float f, float f2, float f3, int i, int i2) {
        return f3 < f ? i : f3 > f2 ? i2 : (int) c(i, i2, (f3 - f) / (f2 - f));
    }

    public static void f(Canvas canvas, Rect rect, float f, float f2, float f3, int i, CanvasCompat.CanvasOperation canvasOperation) {
        if (i <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(f, f2);
        canvas.scale(f3, f3);
        if (i < 255) {
            RectF rectF = f14702a;
            rectF.set(rect);
            canvas.saveLayerAlpha(rectF, i);
        }
        canvasOperation.a(canvas);
        canvas.restoreToCount(iSave);
    }
}
