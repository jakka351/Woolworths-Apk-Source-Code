package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RenderEffect;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/DeviceRenderNode;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface DeviceRenderNode {
    void A(float f);

    void B(float f);

    void C(Outline outline);

    void D(boolean z);

    boolean E(int i, int i2, int i3, int i4);

    int F();

    void G(int i);

    void H(CanvasHolder canvasHolder, Path path, Function1 function1);

    void I(int i);

    float J();

    float a();

    void b(float f);

    void c(float f);

    void d(float f);

    void e(float f);

    void f(float f);

    void g(float f);

    int getHeight();

    int getWidth();

    boolean h();

    int i();

    void j(float f);

    void k(RenderEffect renderEffect);

    void l(float f);

    void m(float f);

    int n();

    void o();

    boolean p();

    void q(Canvas canvas);

    void r(boolean z);

    void s(float f);

    void t(int i);

    boolean u();

    boolean v();

    void w(Matrix matrix);

    void x();

    void y(int i);

    int z();
}
