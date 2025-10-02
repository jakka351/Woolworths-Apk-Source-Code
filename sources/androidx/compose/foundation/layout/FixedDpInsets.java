package androidx.compose.foundation.layout;

import android.support.v4.media.session.a;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/FixedDpInsets;", "Landroidx/compose/foundation/layout/WindowInsets;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class FixedDpInsets implements WindowInsets {

    /* renamed from: a, reason: collision with root package name */
    public final float f955a;
    public final float b;
    public final float c;
    public final float d;

    public FixedDpInsets(float f, float f2, float f3, float f4) {
        this.f955a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int a(Density density) {
        return density.r1(this.b);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int b(Density density, LayoutDirection layoutDirection) {
        return density.r1(this.c);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int c(Density density) {
        return density.r1(this.d);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int d(Density density, LayoutDirection layoutDirection) {
        return density.r1(this.f955a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FixedDpInsets)) {
            return false;
        }
        FixedDpInsets fixedDpInsets = (FixedDpInsets) obj;
        return Dp.a(this.f955a, fixedDpInsets.f955a) && Dp.a(this.b, fixedDpInsets.b) && Dp.a(this.c, fixedDpInsets.c) && Dp.a(this.d, fixedDpInsets.d);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + a.b(this.c, a.b(this.b, Float.hashCode(this.f955a) * 31, 31), 31);
    }

    public final String toString() {
        return "Insets(left=" + ((Object) Dp.b(this.f955a)) + ", top=" + ((Object) Dp.b(this.b)) + ", right=" + ((Object) Dp.b(this.c)) + ", bottom=" + ((Object) Dp.b(this.d)) + ')';
    }
}
