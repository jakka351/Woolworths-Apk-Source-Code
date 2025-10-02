package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@DrawScopeMarker
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/unit/Density;", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public interface DrawScope extends Density {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawScope$Companion;", "", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ void K0(ContentDrawScope contentDrawScope, Brush brush, long j, long j2, long j3, DrawStyle drawStyle, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j4 = j;
        contentDrawScope.u1(brush, j4, (i & 4) != 0 ? P1(contentDrawScope.h(), j4) : j2, j3, 1.0f, (i & 32) != 0 ? Fill.f1802a : drawStyle);
    }

    static long P1(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L);
    }

    static /* synthetic */ void S(DrawScope drawScope, long j, long j2, long j3, float f, Stroke stroke, ColorFilter colorFilter, int i) {
        long j4 = (i & 2) != 0 ? 0L : j2;
        drawScope.D1(j, j4, (i & 4) != 0 ? P1(drawScope.h(), j4) : j3, (i & 8) != 0 ? 1.0f : f, (i & 16) != 0 ? Fill.f1802a : stroke, (i & 32) != 0 ? null : colorFilter, (i & 64) != 0 ? 3 : 0);
    }

    static /* synthetic */ void U0(DrawScope drawScope, ImageBitmap imageBitmap, BlendModeColorFilter blendModeColorFilter, int i) {
        if ((i & 16) != 0) {
            blendModeColorFilter = null;
        }
        drawScope.o0(imageBitmap, blendModeColorFilter);
    }

    static void X(DrawScope drawScope, ImageBitmap imageBitmap, long j, long j2, long j3, long j4, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, int i3) {
        drawScope.a2(imageBitmap, (i3 & 2) != 0 ? 0L : j, j2, (i3 & 8) != 0 ? 0L : j3, (i3 & 16) != 0 ? j2 : j4, (i3 & 32) != 0 ? 1.0f : f, (i3 & 64) != 0 ? Fill.f1802a : drawStyle, colorFilter, (i3 & 256) != 0 ? 3 : i, (i3 & 512) != 0 ? 1 : i2);
    }

    static /* synthetic */ void Y(DrawScope drawScope, Path path, Brush brush, float f, Stroke stroke, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        DrawStyle drawStyle = stroke;
        if ((i & 8) != 0) {
            drawStyle = Fill.f1802a;
        }
        drawScope.q1(path, brush, f2, drawStyle, (i & 32) != 0 ? 3 : 0);
    }

    static /* synthetic */ void Z(DrawScope drawScope, Path path, long j, float f, DrawStyle drawStyle, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i & 8) != 0) {
            drawStyle = Fill.f1802a;
        }
        drawScope.l0(path, j, f2, drawStyle);
    }

    static /* synthetic */ void g0(DrawScope drawScope, long j, long j2, long j3, long j4, DrawStyle drawStyle, float f, int i) {
        long j5 = (i & 2) != 0 ? 0L : j2;
        drawScope.V1(j, j5, (i & 4) != 0 ? P1(drawScope.h(), j5) : j3, j4, (i & 16) != 0 ? Fill.f1802a : drawStyle, (i & 32) != 0 ? 1.0f : f);
    }

    static /* synthetic */ void j0(DrawScope drawScope, long j, float f, long j2, DrawStyle drawStyle, int i, int i2) {
        if ((i2 & 2) != 0) {
            f = Size.c(drawScope.h()) / 2.0f;
        }
        float f2 = f;
        if ((i2 & 4) != 0) {
            j2 = drawScope.M0();
        }
        long j3 = j2;
        if ((i2 & 16) != 0) {
            drawStyle = Fill.f1802a;
        }
        drawScope.W(j, f2, j3, drawStyle, (i2 & 64) != 0 ? 3 : i);
    }

    static /* synthetic */ void z0(DrawScope drawScope, Brush brush, long j, long j2, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j3 = j;
        drawScope.q0(brush, j3, (i & 4) != 0 ? P1(drawScope.h(), j3) : j2, (i & 8) != 0 ? 1.0f : f, (i & 16) != 0 ? Fill.f1802a : drawStyle, (i & 32) != 0 ? null : colorFilter);
    }

    void D1(long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i);

    /* renamed from: I0 */
    CanvasDrawScope$drawContext$1 getE();

    default long M0() {
        return SizeKt.b(getE().d());
    }

    void N1(ShaderBrush shaderBrush, float f, float f2, boolean z, long j, long j2, DrawStyle drawStyle);

    void R1(long j, float f, float f2, long j2, long j3, float f3, DrawStyle drawStyle);

    void V1(long j, long j2, long j3, long j4, DrawStyle drawStyle, float f);

    void W(long j, float f, long j2, DrawStyle drawStyle, int i);

    void X1(ArrayList arrayList, long j, float f);

    default void a2(ImageBitmap imageBitmap, long j, long j2, long j3, long j4, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2) {
        X(this, imageBitmap, j, j2, j3, j4, f, drawStyle, colorFilter, i, 0, 512);
    }

    void b1(long j, long j2, long j3, float f, int i, PathEffect pathEffect, int i2);

    LayoutDirection getLayoutDirection();

    default long h() {
        return getE().d();
    }

    void l0(Path path, long j, float f, DrawStyle drawStyle);

    void m1(Brush brush, long j, long j2, float f, int i, float f2);

    void o0(ImageBitmap imageBitmap, ColorFilter colorFilter);

    void q0(Brush brush, long j, long j2, float f, DrawStyle drawStyle, ColorFilter colorFilter);

    void q1(Path path, Brush brush, float f, DrawStyle drawStyle, int i);

    void u1(Brush brush, long j, long j2, long j3, float f, DrawStyle drawStyle);
}
