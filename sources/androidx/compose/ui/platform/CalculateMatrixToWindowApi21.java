package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.ui.graphics.Matrix;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/CalculateMatrixToWindowApi21;", "Landroidx/compose/ui/platform/CalculateMatrixToWindow;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class CalculateMatrixToWindowApi21 implements CalculateMatrixToWindow {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f1960a;
    public final int[] b = new int[2];

    public CalculateMatrixToWindowApi21(float[] fArr) {
        this.f1960a = fArr;
    }

    @Override // androidx.compose.ui.platform.CalculateMatrixToWindow
    public final void a(View view, float[] fArr) {
        Matrix.d(fArr);
        b(view, fArr);
    }

    public final void b(View view, float[] fArr) {
        Object parent = view.getParent();
        boolean z = parent instanceof View;
        float[] fArr2 = this.f1960a;
        if (z) {
            b((View) parent, fArr);
            Function1 function1 = AndroidComposeView_androidKt.f1949a;
            Matrix.d(fArr2);
            Matrix.h(fArr2, -view.getScrollX(), -view.getScrollY(), 4);
            AndroidComposeView_androidKt.b(fArr, fArr2);
            float left = view.getLeft();
            float top = view.getTop();
            Matrix.d(fArr2);
            Matrix.h(fArr2, left, top, 4);
            AndroidComposeView_androidKt.b(fArr, fArr2);
        } else {
            int[] iArr = this.b;
            view.getLocationInWindow(iArr);
            Function1 function12 = AndroidComposeView_androidKt.f1949a;
            Matrix.d(fArr2);
            Matrix.h(fArr2, -view.getScrollX(), -view.getScrollY(), 4);
            AndroidComposeView_androidKt.b(fArr, fArr2);
            float f = iArr[0];
            float f2 = iArr[1];
            Matrix.d(fArr2);
            Matrix.h(fArr2, f, f2, 4);
            AndroidComposeView_androidKt.b(fArr, fArr2);
        }
        android.graphics.Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        AndroidMatrixConversions_androidKt.b(matrix, fArr2);
        AndroidComposeView_androidKt.b(fArr, fArr2);
    }
}
