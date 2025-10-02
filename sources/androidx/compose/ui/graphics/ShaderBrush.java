package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Size;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/ShaderBrush;", "Landroidx/compose/ui/graphics/Brush;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class ShaderBrush extends Brush {

    /* renamed from: a, reason: collision with root package name */
    public Shader f1781a;
    public long b = 9205357640488583168L;

    @Override // androidx.compose.ui.graphics.Brush
    public final void a(float f, long j, Paint paint) {
        Shader shaderB = this.f1781a;
        if (shaderB == null || !Size.a(this.b, j)) {
            if (Size.e(j)) {
                shaderB = null;
                this.f1781a = null;
                this.b = 9205357640488583168L;
            } else {
                shaderB = b(j);
                this.f1781a = shaderB;
                this.b = j;
            }
        }
        long jC = paint.c();
        long j2 = Color.b;
        if (!Color.c(jC, j2)) {
            paint.d(j2);
        }
        if (!Intrinsics.c(paint.f(), shaderB)) {
            paint.g(shaderB);
        }
        if (paint.a() == f) {
            return;
        }
        paint.b(f);
    }

    public abstract Shader b(long j);
}
