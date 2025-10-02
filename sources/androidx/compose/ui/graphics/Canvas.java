package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Rect;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/Canvas;", "", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public interface Canvas {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
    }

    void a(ImageBitmap imageBitmap, long j, long j2, long j3, long j4, Paint paint);

    void b(float f, float f2, float f3, float f4, int i);

    void c(float f, float f2);

    void d(ImageBitmap imageBitmap, Paint paint);

    void e(float f, float f2, float f3, float f4, float f5, float f6, boolean z, Paint paint);

    void f(Rect rect, Paint paint);

    void g();

    default void h(Rect rect) {
        b(rect.f1752a, rect.b, rect.c, rect.d, 1);
    }

    void i(float f, long j, Paint paint);

    void j(float f, float f2);

    void k(float f, float f2, float f3, float f4, Paint paint);

    void l(Path path, int i);

    void m();

    void n();

    void o(ArrayList arrayList, Paint paint);

    void p(long j, long j2, Paint paint);

    void q(float f);

    void r(float[] fArr);

    void s(Path path, Paint paint);

    void save();

    void t(float f, float f2, float f3, float f4, float f5, float f6, Paint paint);
}
