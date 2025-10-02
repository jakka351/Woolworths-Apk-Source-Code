package androidx.transition;

import android.graphics.Matrix;
import android.view.View;
import androidx.annotation.RequiresApi;

@RequiresApi
/* loaded from: classes2.dex */
class ViewUtilsApi29 extends ViewUtilsApi23 {
    @Override // androidx.transition.ViewUtilsApi19
    public final float a(View view) {
        return view.getTransitionAlpha();
    }

    @Override // androidx.transition.ViewUtilsApi19
    public final void b(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // androidx.transition.ViewUtilsApi23, androidx.transition.ViewUtilsApi19
    public final void c(int i, View view) {
        view.setTransitionVisibility(i);
    }

    @Override // androidx.transition.ViewUtilsApi21
    public final void d(View view, Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    @Override // androidx.transition.ViewUtilsApi21
    public final void e(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // androidx.transition.ViewUtilsApi21
    public final void f(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // androidx.transition.ViewUtilsApi22
    public final void g(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }
}
