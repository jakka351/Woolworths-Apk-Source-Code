package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.InlineClassHelperKt;
import androidx.compose.ui.graphics.Path;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/graphics/drawscope/CanvasDrawScopeKt$asDrawTransform$1", "Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class CanvasDrawScopeKt$asDrawTransform$1 implements DrawTransform {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CanvasDrawScope$drawContext$1 f1799a;

    public CanvasDrawScopeKt$asDrawTransform$1(CanvasDrawScope$drawContext$1 canvasDrawScope$drawContext$1) {
        this.f1799a = canvasDrawScope$drawContext$1;
    }

    public final void a(Path path, int i) {
        this.f1799a.a().l(path, i);
    }

    public final void b(float f, float f2, float f3, float f4, int i) {
        this.f1799a.a().b(f, f2, f3, f4, i);
    }

    public final void c(float f, float f2, float f3, float f4) {
        CanvasDrawScope$drawContext$1 canvasDrawScope$drawContext$1 = this.f1799a;
        Canvas canvasA = canvasDrawScope$drawContext$1.a();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (canvasDrawScope$drawContext$1.d() >> 32)) - (f3 + f);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (canvasDrawScope$drawContext$1.d() & 4294967295L)) - (f4 + f2);
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        if (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) < BitmapDescriptorFactory.HUE_RED || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) < BitmapDescriptorFactory.HUE_RED) {
            InlineClassHelperKt.a("Width and height must be greater than or equal to zero");
        }
        canvasDrawScope$drawContext$1.h(jFloatToRawIntBits);
        canvasA.c(f, f2);
    }

    public final void d(long j, float f) {
        Canvas canvasA = this.f1799a.a();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        canvasA.c(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        canvasA.q(f);
        canvasA.c(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    public final void e(long j, float f, float f2) {
        Canvas canvasA = this.f1799a.a();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        canvasA.c(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        canvasA.j(f, f2);
        canvasA.c(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    public final void f(float f, float f2) {
        this.f1799a.a().c(f, f2);
    }
}
