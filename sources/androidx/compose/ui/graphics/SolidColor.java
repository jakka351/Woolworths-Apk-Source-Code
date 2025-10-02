package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/SolidColor;", "Landroidx/compose/ui/graphics/Brush;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SolidColor extends Brush {

    /* renamed from: a, reason: collision with root package name */
    public final long f1783a;

    public SolidColor(long j) {
        this.f1783a = j;
    }

    @Override // androidx.compose.ui.graphics.Brush
    public final void a(float f, long j, Paint paint) {
        paint.b(1.0f);
        long jB = this.f1783a;
        if (f != 1.0f) {
            jB = Color.b(jB, Color.d(jB) * f);
        }
        paint.d(jB);
        if (paint.f() != null) {
            paint.g(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SolidColor) {
            return Color.c(this.f1783a, ((SolidColor) obj).f1783a);
        }
        return false;
    }

    public final int hashCode() {
        int i = Color.l;
        return Long.hashCode(this.f1783a);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) Color.i(this.f1783a)) + ')';
    }
}
