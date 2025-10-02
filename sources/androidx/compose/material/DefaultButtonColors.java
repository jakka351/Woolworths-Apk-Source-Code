package androidx.compose.material;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/DefaultButtonColors;", "Landroidx/compose/material/ButtonColors;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class DefaultButtonColors implements ButtonColors {

    /* renamed from: a, reason: collision with root package name */
    public final long f1262a;
    public final long b;
    public final long c;
    public final long d;

    public DefaultButtonColors(long j, long j2, long j3, long j4) {
        this.f1262a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    @Override // androidx.compose.material.ButtonColors
    public final MutableState a(boolean z, Composer composer) {
        composer.o(-2133647540);
        return a.h(z ? this.b : this.d, composer);
    }

    @Override // androidx.compose.material.ButtonColors
    public final MutableState b(boolean z, Composer composer) {
        composer.o(-655254499);
        return a.h(z ? this.f1262a : this.c, composer);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DefaultButtonColors.class != obj.getClass()) {
            return false;
        }
        DefaultButtonColors defaultButtonColors = (DefaultButtonColors) obj;
        return Color.c(this.f1262a, defaultButtonColors.f1262a) && Color.c(this.b, defaultButtonColors.b) && Color.c(this.c, defaultButtonColors.c) && Color.c(this.d, defaultButtonColors.d);
    }

    public final int hashCode() {
        int i = Color.l;
        return Long.hashCode(this.d) + b.b(b.b(Long.hashCode(this.f1262a) * 31, 31, this.b), 31, this.c);
    }
}
