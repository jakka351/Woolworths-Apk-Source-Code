package androidx.compose.material;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/DefaultChipColors;", "Landroidx/compose/material/ChipColors;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ExperimentalMaterialApi
/* loaded from: classes2.dex */
final class DefaultChipColors implements ChipColors {

    /* renamed from: a, reason: collision with root package name */
    public final long f1265a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public DefaultChipColors(long j, long j2, long j3, long j4, long j5, long j6) {
        this.f1265a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
    }

    @Override // androidx.compose.material.ChipColors
    public final MutableState a(boolean z, Composer composer) {
        composer.o(483145880);
        return a.h(z ? this.b : this.e, composer);
    }

    @Override // androidx.compose.material.ChipColors
    public final MutableState b(boolean z, Composer composer) {
        composer.o(-1593588247);
        return a.h(z ? this.f1265a : this.d, composer);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DefaultChipColors.class != obj.getClass()) {
            return false;
        }
        DefaultChipColors defaultChipColors = (DefaultChipColors) obj;
        return Color.c(this.f1265a, defaultChipColors.f1265a) && Color.c(this.b, defaultChipColors.b) && Color.c(this.c, defaultChipColors.c) && Color.c(this.d, defaultChipColors.d) && Color.c(this.e, defaultChipColors.e) && Color.c(this.f, defaultChipColors.f);
    }

    public final int hashCode() {
        int i = Color.l;
        return Long.hashCode(this.f) + b.b(b.b(b.b(b.b(Long.hashCode(this.f1265a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }
}
