package androidx.transition;

import android.graphics.Matrix;
import android.view.View;
import androidx.annotation.RequiresApi;

@RequiresApi
/* loaded from: classes2.dex */
class ViewUtilsApi21 extends ViewUtilsApi19 {
    public static boolean d = true;
    public static boolean e = true;
    public static boolean f = true;

    @RequiresApi
    public static class Api29Impl {
    }

    public void d(View view, Matrix matrix) {
        if (d) {
            try {
                view.setAnimationMatrix(matrix);
            } catch (NoSuchMethodError unused) {
                d = false;
            }
        }
    }

    public void e(View view, Matrix matrix) {
        if (e) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                e = false;
            }
        }
    }

    public void f(View view, Matrix matrix) {
        if (f) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f = false;
            }
        }
    }
}
