package androidx.compose.ui.graphics.layer;

import android.graphics.Matrix;
import android.graphics.Outline;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl;", "", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface GraphicsLayerImpl {

    /* renamed from: a, reason: collision with root package name */
    public static final Companion f1806a = Companion.f1807a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl$Companion;", "", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f1807a = new Companion();
        public static final Function1 b = null;
    }

    void A(float f);

    int B();

    void C(int i, int i2, long j);

    float D();

    float E();

    long F();

    int G();

    float H();

    void I(long j);

    float J();

    void K(long j);

    void L(long j);

    void M(int i);

    float N();

    float a();

    void b(float f);

    void c(float f);

    void d(float f);

    void e(float f);

    void f(float f);

    void g(float f);

    default boolean h() {
        return true;
    }

    void j(float f);

    void k(RenderEffect renderEffect);

    void l(float f);

    void m(float f);

    void o();

    RenderEffect p();

    long q();

    float r();

    Matrix s();

    void t(Outline outline, long j);

    float u();

    float v();

    float w();

    void x(Canvas canvas);

    void y(Density density, LayoutDirection layoutDirection, GraphicsLayer graphicsLayer, Function1 function1);

    void z(boolean z);
}
